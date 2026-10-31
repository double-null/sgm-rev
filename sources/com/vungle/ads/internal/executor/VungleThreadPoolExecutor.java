package com.vungle.ads.internal.executor;

import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleThreadPool";
    private final NamedThreadFactory threadFactory;

    /* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(final Callable<T> callable, final id.a<g0> aVar) {
            return new Callable() { // from class: com.vungle.ads.internal.executor.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return VungleThreadPoolExecutor.Companion.m257getWrappedCallableWithFallback$lambda0(callable, aVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m257getWrappedCallableWithFallback$lambda0(Callable command, id.a failFallback) {
            t.f(command, "$command");
            t.f(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ComparableRunnable getWrappedRunnableWithFail(final Runnable runnable, final Runnable runnable2) {
            return runnable instanceof PriorityRunnable ? new PriorityRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$1
                @Override // com.vungle.ads.internal.task.PriorityRunnable, java.lang.Comparable
                public int compareTo(Object other) {
                    t.f(other, "other");
                    if (!(other instanceof PriorityRunnable)) {
                        return 0;
                    }
                    return t.g(((PriorityRunnable) other).getPriority(), getPriority());
                }

                @Override // com.vungle.ads.internal.task.PriorityRunnable
                public int getPriority() {
                    return ((PriorityRunnable) runnable).getPriority();
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(runnable, runnable2);
                }
            } : new ComparableRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$2
                @Override // java.lang.Comparable
                public int compareTo(Object other) {
                    t.f(other, "other");
                    Runnable runnable3 = runnable;
                    if (runnable3 instanceof PriorityRunnable) {
                        return ((PriorityRunnable) runnable3).compareTo(other);
                    }
                    return 0;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(runnable, runnable2);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
            try {
                runnable.run();
            } catch (OutOfMemoryError unused) {
                runnable2.run();
            }
        }
    }

    /* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
    public interface ComparableRunnable extends Comparable<Object>, Runnable {
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$submit$3, reason: invalid class name */
    /* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
    static final class AnonymousClass3 extends u implements id.a<g0> {
        AnonymousClass3() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            new OutOfMemory("submit callable error in " + VungleThreadPoolExecutor.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public VungleThreadPoolExecutor(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, NamedThreadFactory namedThreadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, namedThreadFactory);
        this.threadFactory = namedThreadFactory;
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m254execute$lambda0(VungleThreadPoolExecutor this$0) {
        t.f(this$0, "this$0");
        new OutOfMemory("execute error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        NamedThreadFactory namedThreadFactory = this.threadFactory;
        return (namedThreadFactory == null || (name = namedThreadFactory.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m255submit$lambda1(VungleThreadPoolExecutor this$0) {
        t.f(this$0, "this$0");
        new OutOfMemory("submit error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m256submit$lambda2(VungleThreadPoolExecutor this$0) {
        t.f(this$0, "this$0");
        new OutOfMemory("submit error with result in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        t.f(command, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, new Runnable() { // from class: com.vungle.ads.internal.executor.a
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m254execute$lambda0(this.f13050a);
                }
            }));
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "execute exception", e10);
        } catch (OutOfMemoryError e11) {
            String str = "execute error in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final NamedThreadFactory getThreadFactory() {
        return this.threadFactory;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        t.f(task, "task");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.c
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m255submit$lambda1(this.f13052a);
                }
            }));
            t.e(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception", e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    public final Future<?> submit$vungle_ads_release(Runnable task, Runnable fail) {
        t.f(task, "task");
        t.f(fail, "fail");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, fail));
            t.e(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception with fail", e10);
            fail.run();
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new FutureResult(null);
        }
    }

    public final void execute(Runnable command, Runnable fail) {
        t.f(command, "command");
        t.f(fail, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "execute exception with fail", e10);
            fail.run();
        } catch (OutOfMemoryError e11) {
            String str = "execute error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T t10) {
        t.f(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.b
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m256submit$lambda2(this.f13051a);
                }
            }), t10);
            t.e(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception with result", e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with result in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        t.f(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedCallableWithFallback(task, new AnonymousClass3()));
            t.e(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "submit exception callable: " + e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error callable in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }
}
