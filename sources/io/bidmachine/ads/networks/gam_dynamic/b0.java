package io.bidmachine.ads.networks.gam_dynamic;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TaskExecutorImpl.java */
/* JADX INFO: loaded from: classes4.dex */
class b0 implements q6.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f16608b = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f16609a;

    public b0() {
        this(Executors.newScheduledThreadPool(f16608b));
    }

    @Override // q6.u
    public boolean a(Runnable runnable, long j10) {
        try {
            this.f16609a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            return false;
        }
    }

    @Override // q6.u
    public boolean execute(Runnable runnable) {
        return a(runnable, 0L);
    }

    public b0(ScheduledExecutorService scheduledExecutorService) {
        this.f16609a = scheduledExecutorService;
    }
}
