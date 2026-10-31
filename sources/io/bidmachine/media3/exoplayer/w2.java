package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: compiled from: WifiLockManager.java */
/* JADX INFO: loaded from: classes4.dex */
final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.n f19993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19995d;

    /* JADX INFO: compiled from: WifiLockManager.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f19996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f19997b;

        public a(Context context) {
            this.f19996a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f19997b == null) {
                WifiManager wifiManager = (WifiManager) this.f19996a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    x7.r.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f19997b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f19997b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public w2(Context context, Looper looper, x7.h hVar) {
        this.f19992a = new a(context.getApplicationContext());
        this.f19993b = hVar.b(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z10, boolean z11) {
        this.f19992a.a(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z10) {
        this.f19992a.a(true, z10);
    }

    public void e(final boolean z10) {
        if (this.f19994c == z10) {
            return;
        }
        this.f19994c = z10;
        final boolean z11 = this.f19995d;
        this.f19993b.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.u2
            @Override // java.lang.Runnable
            public final void run() {
                this.f19783a.c(z10, z11);
            }
        });
    }

    public void f(final boolean z10) {
        if (this.f19995d == z10) {
            return;
        }
        this.f19995d = z10;
        if (this.f19994c) {
            this.f19993b.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.v2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19830a.d(z10);
                }
            });
        }
    }
}
