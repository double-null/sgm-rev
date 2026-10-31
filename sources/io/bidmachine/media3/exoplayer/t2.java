package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: compiled from: WakeLockManager.java */
/* JADX INFO: loaded from: classes4.dex */
final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.n f19715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19717d;

    /* JADX INFO: compiled from: WakeLockManager.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f19718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f19719b;

        public a(Context context) {
            this.f19718a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f19719b == null) {
                PowerManager powerManager = (PowerManager) this.f19718a.getSystemService("power");
                if (powerManager == null) {
                    x7.r.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f19719b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f19719b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public t2(Context context, Looper looper, x7.h hVar) {
        this.f19714a = new a(context.getApplicationContext());
        this.f19715b = hVar.b(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z10, boolean z11) {
        this.f19714a.a(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z10) {
        this.f19714a.a(true, z10);
    }

    public void e(final boolean z10) {
        if (this.f19716c == z10) {
            return;
        }
        this.f19716c = z10;
        final boolean z11 = this.f19717d;
        this.f19715b.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.r2
            @Override // java.lang.Runnable
            public final void run() {
                this.f19363a.c(z10, z11);
            }
        });
    }

    public void f(final boolean z10) {
        if (this.f19717d == z10) {
            return;
        }
        this.f19717d = z10;
        if (this.f19716c) {
            this.f19715b.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.s2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19371a.d(z10);
                }
            });
        }
    }
}
