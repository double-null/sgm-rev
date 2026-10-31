package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UnityPlayer f12915a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h1 f12917c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12916b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Semaphore f12918d = new Semaphore(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReentrantLock f12919e = new ReentrantLock();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a1 f12920f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12921g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12922h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12923i = false;

    i1(UnityPlayer unityPlayer) {
        this.f12915a = null;
        this.f12915a = unityPlayer;
    }

    protected void runOnUiThread(Runnable runnable) {
        Context context = this.f12916b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            AbstractC2409z.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }

    public final void a() {
        this.f12919e.lock();
        a1 a1Var = this.f12920f;
        if (a1Var != null) {
            a1Var.updateVideoLayout();
        }
        this.f12919e.unlock();
    }

    public final void b() {
        this.f12919e.lock();
        a1 a1Var = this.f12920f;
        if (a1Var != null) {
            if (this.f12921g == 0) {
                a1Var.cancelOnPrepare();
            } else if (this.f12923i) {
                boolean zA = a1Var.a();
                this.f12922h = zA;
                if (!zA) {
                    this.f12920f.pause();
                }
            }
        }
        this.f12919e.unlock();
    }

    public final void c() {
        this.f12919e.lock();
        a1 a1Var = this.f12920f;
        if (a1Var != null && this.f12923i && !this.f12922h) {
            a1Var.start();
        }
        this.f12919e.unlock();
    }

    public final boolean a(Context context, String str, int i10, int i11, int i12, boolean z10, long j10, long j11, h1 h1Var) {
        this.f12919e.lock();
        this.f12917c = h1Var;
        this.f12916b = context;
        this.f12918d.drainPermits();
        this.f12921g = 2;
        runOnUiThread(new d1(this, str, i10, i11, i12, z10, j10, j11));
        boolean z11 = false;
        try {
            this.f12919e.unlock();
            this.f12918d.acquire();
            this.f12919e.lock();
            if (this.f12921g != 2) {
                z11 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new e1(this));
        runOnUiThread((!z11 || this.f12921g == 3) ? new g1(this) : new f1(this));
        this.f12919e.unlock();
        return z11;
    }
}
