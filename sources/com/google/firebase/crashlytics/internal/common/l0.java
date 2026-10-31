package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: compiled from: ExecutorUtils.java */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f12170b;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.l0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ExecutorUtils.java */
        class C0150a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f12171a;

            C0150a(Runnable runnable) {
                this.f12171a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.c
            public void p() {
                this.f12171a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f12169a = str;
            this.f12170b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0150a(runnable));
            threadNewThread.setName(this.f12169a + this.f12170b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: ExecutorUtils.java */
    class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f12174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f12176d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f12173a = str;
            this.f12174b = executorService;
            this.f12175c = j10;
            this.f12176d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.c
        public void p() {
            try {
                z2.f.f().b("Executing shutdown hook for " + this.f12173a);
                this.f12174b.shutdown();
                if (this.f12174b.awaitTermination(this.f12175c, this.f12176d)) {
                    return;
                }
                z2.f.f().b(this.f12173a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f12174b.shutdownNow();
            } catch (InterruptedException unused) {
                z2.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f12173a));
                this.f12174b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
