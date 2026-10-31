package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class E0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f12722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12723b;

    E0(UnityPlayer unityPlayer, float f10) {
        this.f12723b = unityPlayer;
        this.f12722a = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12723b.mGlView.a(this.f12722a);
    }
}
