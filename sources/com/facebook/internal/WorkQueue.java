package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import wc.g0;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WorkQueue {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_CONCURRENT = 8;
    private final Executor executor;
    private final int maxConcurrent;
    private WorkNode pendingJobs;
    private int runningCount;
    private WorkNode runningJobs;
    private final ReentrantLock workLock;

    /* JADX INFO: compiled from: WorkQueue.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: assert, reason: not valid java name */
        public final void m200assert(boolean z10) {
            if (!z10) {
                throw new FacebookException("Validation failed");
            }
        }
    }

    /* JADX INFO: compiled from: WorkQueue.kt */
    public interface WorkItem {
        boolean cancel();

        boolean isRunning();

        void moveToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WorkQueue.kt */
    final class WorkNode implements WorkItem {
        private final Runnable callback;
        private boolean isRunning;
        private WorkNode next;
        private WorkNode prev;
        final /* synthetic */ WorkQueue this$0;

        public WorkNode(WorkQueue workQueue, Runnable callback) {
            kotlin.jvm.internal.t.f(callback, "callback");
            this.this$0 = workQueue;
            this.callback = callback;
        }

        public final WorkNode addToList(WorkNode workNode, boolean z10) {
            Companion companion = WorkQueue.Companion;
            companion.m200assert(this.next == null);
            companion.m200assert(this.prev == null);
            if (workNode == null) {
                this.prev = this;
                this.next = this;
                workNode = this;
            } else {
                this.next = workNode;
                WorkNode workNode2 = workNode.prev;
                this.prev = workNode2;
                if (workNode2 != null) {
                    workNode2.next = this;
                }
                WorkNode workNode3 = this.next;
                if (workNode3 != null) {
                    workNode3.prev = workNode2 != null ? workNode2.next : null;
                }
            }
            return z10 ? this : workNode;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public boolean cancel() {
            ReentrantLock reentrantLock = this.this$0.workLock;
            WorkQueue workQueue = this.this$0;
            reentrantLock.lock();
            try {
                if (isRunning()) {
                    g0 g0Var = g0.f27756a;
                    return false;
                }
                workQueue.pendingJobs = removeFromList(workQueue.pendingJobs);
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final Runnable getCallback() {
            return this.callback;
        }

        public final WorkNode getNext() {
            return this.next;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public boolean isRunning() {
            return this.isRunning;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public void moveToFront() {
            ReentrantLock reentrantLock = this.this$0.workLock;
            WorkQueue workQueue = this.this$0;
            reentrantLock.lock();
            try {
                if (!isRunning()) {
                    workQueue.pendingJobs = removeFromList(workQueue.pendingJobs);
                    workQueue.pendingJobs = addToList(workQueue.pendingJobs, true);
                }
                g0 g0Var = g0.f27756a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final WorkNode removeFromList(WorkNode workNode) {
            Companion companion = WorkQueue.Companion;
            companion.m200assert(this.next != null);
            companion.m200assert(this.prev != null);
            if (workNode == this && (workNode = this.next) == this) {
                workNode = null;
            }
            WorkNode workNode2 = this.next;
            if (workNode2 != null) {
                workNode2.prev = this.prev;
            }
            WorkNode workNode3 = this.prev;
            if (workNode3 != null) {
                workNode3.next = workNode2;
            }
            this.prev = null;
            this.next = null;
            return workNode;
        }

        public void setRunning(boolean z10) {
            this.isRunning = z10;
        }

        public final void verify(boolean z10) {
            WorkNode workNode;
            WorkNode workNode2;
            Companion companion = WorkQueue.Companion;
            WorkNode workNode3 = this.prev;
            if (workNode3 == null || (workNode = workNode3.next) == null) {
                workNode = this;
            }
            companion.m200assert(workNode == this);
            WorkNode workNode4 = this.next;
            if (workNode4 == null || (workNode2 = workNode4.prev) == null) {
                workNode2 = this;
            }
            companion.m200assert(workNode2 == this);
            companion.m200assert(isRunning() == z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQueue() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WorkItem addActiveWorkItem$default(WorkQueue workQueue, Runnable runnable, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return workQueue.addActiveWorkItem(runnable, z10);
    }

    private final void execute(final WorkNode workNode) {
        this.executor.execute(new Runnable() { // from class: com.facebook.internal.y
            @Override // java.lang.Runnable
            public final void run() {
                WorkQueue.execute$lambda$2(workNode, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$2(WorkNode node, WorkQueue this$0) {
        kotlin.jvm.internal.t.f(node, "$node");
        kotlin.jvm.internal.t.f(this$0, "this$0");
        try {
            node.getCallback().run();
        } finally {
            this$0.finishItemAndStartNew(node);
        }
    }

    private final void finishItemAndStartNew(WorkNode workNode) {
        WorkNode workNode2;
        this.workLock.lock();
        if (workNode != null) {
            this.runningJobs = workNode.removeFromList(this.runningJobs);
            this.runningCount--;
        }
        if (this.runningCount < this.maxConcurrent) {
            workNode2 = this.pendingJobs;
            if (workNode2 != null) {
                this.pendingJobs = workNode2.removeFromList(workNode2);
                this.runningJobs = workNode2.addToList(this.runningJobs, false);
                this.runningCount++;
                workNode2.setRunning(true);
            }
        } else {
            workNode2 = null;
        }
        this.workLock.unlock();
        if (workNode2 != null) {
            execute(workNode2);
        }
    }

    private final void startItem() {
        finishItemAndStartNew(null);
    }

    public final WorkItem addActiveWorkItem(Runnable callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        return addActiveWorkItem$default(this, callback, false, 2, null);
    }

    public final void validate() {
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            WorkNode next = this.runningJobs;
            int i10 = 0;
            if (next != null) {
                do {
                    if (next == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    next.verify(true);
                    i10++;
                    next = next.getNext();
                } while (next != this.runningJobs);
            }
            Companion.m200assert(this.runningCount == i10);
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkQueue(int i10) {
        this(i10, null, 2, 0 == true ? 1 : 0);
    }

    public final WorkItem addActiveWorkItem(Runnable callback, boolean z10) {
        kotlin.jvm.internal.t.f(callback, "callback");
        WorkNode workNode = new WorkNode(this, callback);
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            this.pendingJobs = workNode.addToList(this.pendingJobs, z10);
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
            startItem();
            return workNode;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public WorkQueue(int i10, Executor executor) {
        kotlin.jvm.internal.t.f(executor, "executor");
        this.maxConcurrent = i10;
        this.executor = executor;
        this.workLock = new ReentrantLock();
    }

    public /* synthetic */ WorkQueue(int i10, Executor executor, int i11, kotlin.jvm.internal.k kVar) {
        this((i11 & 1) != 0 ? 8 : i10, (i11 & 2) != 0 ? FacebookSdk.getExecutor() : executor);
    }
}
