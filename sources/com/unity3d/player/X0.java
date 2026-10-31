package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a1 f12839a;

    X0(a1 a1Var) {
        this.f12839a = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12839a.destroyPlayer();
        this.f12839a.a(3);
    }
}
