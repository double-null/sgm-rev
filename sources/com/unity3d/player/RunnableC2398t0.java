package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2398t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f12979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12980b;

    RunnableC2398t0(UnityPlayer unityPlayer, boolean z10) {
        this.f12980b = unityPlayer;
        this.f12979a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S s10 = this.f12980b.mSoftInput;
        if (s10 != null) {
            s10.a(this.f12979a);
        }
    }
}
