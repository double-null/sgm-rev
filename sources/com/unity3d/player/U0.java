package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class U0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Handler f12819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f12820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f12821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f12823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f12824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f12825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f12826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12827i;

    private U0(UnityPlayer unityPlayer) {
        this.f12827i = unityPlayer;
        this.f12820b = false;
        this.f12821c = false;
        this.f12822d = 2;
        this.f12823e = 0;
        this.f12826h = 5;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("UnityMain");
        Looper.prepare();
        this.f12819a = new Handler(Looper.myLooper(), new T0(this));
        Looper.loop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(S0 s10) {
        Handler handler = this.f12819a;
        if (handler != null) {
            Message.obtain(handler, 2269, s10).sendToTarget();
        }
    }
}
