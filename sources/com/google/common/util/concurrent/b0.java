package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: InterruptibleTask.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class b0<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f11804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f11805b;

    /* JADX INFO: compiled from: InterruptibleTask.java */
    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0<?> f11806a;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f11806a.toString();
        }

        private b(b0<?> b0Var) {
            this.f11806a = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f11804a = new c();
        f11805b = new c();
    }

    b0() {
    }

    private void n(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f11805b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f11805b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract void c(Throwable th);

    abstract void e(T t10);

    final void f() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.e(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f11804a) == f11805b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean g();

    abstract T h() throws Exception;

    abstract String k();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objH = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z10 = !g();
            if (z10) {
                try {
                    objH = h();
                } catch (Throwable th) {
                    try {
                        j0.b(th);
                        if (!compareAndSet(threadCurrentThread, f11804a)) {
                            n(threadCurrentThread);
                        }
                        if (z10) {
                            c(th);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f11804a)) {
                            n(threadCurrentThread);
                        }
                        if (z10) {
                            e(h0.a(null));
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f11804a)) {
                n(threadCurrentThread);
            }
            if (z10) {
                e(h0.a(objH));
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f11804a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + k();
    }

    /* JADX INFO: compiled from: InterruptibleTask.java */
    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
