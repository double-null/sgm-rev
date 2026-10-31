package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ExecutionSequencer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<ListenableFuture<Void>> f11871a = new AtomicReference<>(x.h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f11872b = new d(null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ExecutionSequencer.java */
    class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f11873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f11874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f11875c;

        a(q qVar, c cVar, i iVar) {
            this.f11873a = cVar;
            this.f11874b = iVar;
            this.f11875c = qVar;
        }

        @Override // com.google.common.util.concurrent.i
        public ListenableFuture<T> call() throws Exception {
            return !this.f11873a.g() ? x.e() : this.f11874b.call();
        }

        public String toString() {
            return this.f11874b.toString();
        }
    }

    /* JADX INFO: compiled from: ExecutionSequencer.java */
    enum b {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ExecutionSequencer.java */
    static final class c extends AtomicReference<b> implements Executor, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        q f11880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Executor f11881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Runnable f11882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Thread f11883d;

        /* synthetic */ c(Executor executor, q qVar, p pVar) {
            this(executor, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f() {
            return compareAndSet(b.NOT_RUN, b.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            return compareAndSet(b.NOT_RUN, b.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == b.CANCELLED) {
                this.f11881b = null;
                this.f11880a = null;
                return;
            }
            this.f11883d = Thread.currentThread();
            try {
                q qVar = this.f11880a;
                Objects.requireNonNull(qVar);
                d dVar = qVar.f11872b;
                if (dVar.f11884a == this.f11883d) {
                    this.f11880a = null;
                    com.google.common.base.p.r(dVar.f11885b == null);
                    dVar.f11885b = runnable;
                    Executor executor = this.f11881b;
                    Objects.requireNonNull(executor);
                    dVar.f11886c = executor;
                    this.f11881b = null;
                } else {
                    Executor executor2 = this.f11881b;
                    Objects.requireNonNull(executor2);
                    this.f11881b = null;
                    this.f11882c = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.f11883d = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            p pVar = null;
            if (threadCurrentThread != this.f11883d) {
                Runnable runnable = this.f11882c;
                Objects.requireNonNull(runnable);
                this.f11882c = null;
                runnable.run();
                return;
            }
            d dVar = new d(pVar);
            dVar.f11884a = threadCurrentThread;
            q qVar = this.f11880a;
            Objects.requireNonNull(qVar);
            qVar.f11872b = dVar;
            this.f11880a = null;
            try {
                Runnable runnable2 = this.f11882c;
                Objects.requireNonNull(runnable2);
                this.f11882c = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = dVar.f11885b;
                    if (runnable3 == null || (executor = dVar.f11886c) == null) {
                        break;
                    }
                    dVar.f11885b = null;
                    dVar.f11886c = null;
                    executor.execute(runnable3);
                }
                dVar.f11884a = null;
            } catch (Throwable th) {
                dVar.f11884a = null;
                throw th;
            }
        }

        private c(Executor executor, q qVar) {
            super(b.NOT_RUN);
            this.f11881b = executor;
            this.f11880a = qVar;
        }
    }

    /* JADX INFO: compiled from: ExecutionSequencer.java */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Thread f11884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f11885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Executor f11886c;

        private d() {
        }

        /* synthetic */ d(p pVar) {
            this();
        }
    }

    private q() {
    }

    public static q d() {
        return new q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(m0 m0Var, l0 l0Var, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, c cVar) {
        if (m0Var.isDone()) {
            l0Var.setFuture(listenableFuture);
        } else if (listenableFuture2.isCancelled() && cVar.f()) {
            m0Var.cancel(false);
        }
    }

    public <T> ListenableFuture<T> f(i<T> iVar, Executor executor) {
        com.google.common.base.p.l(iVar);
        com.google.common.base.p.l(executor);
        final c cVar = new c(executor, this, null);
        a aVar = new a(this, cVar, iVar);
        final l0 l0VarA = l0.a();
        final ListenableFuture<Void> andSet = this.f11871a.getAndSet(l0VarA);
        final m0 m0VarF = m0.f(aVar);
        andSet.addListener(m0VarF, cVar);
        final ListenableFuture<T> listenableFutureI = x.i(m0VarF);
        Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.o
            @Override // java.lang.Runnable
            public final void run() {
                q.e(m0VarF, l0VarA, andSet, listenableFutureI, cVar);
            }
        };
        listenableFutureI.addListener(runnable, g0.a());
        m0VarF.addListener(runnable, g0.a());
        return listenableFutureI;
    }
}
