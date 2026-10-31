package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2386n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12957a;

    RunnableC2386n0(UnityPlayer unityPlayer) {
        this.f12957a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2376i0 c2376i0 = this.f12957a.mGlView;
        if (c2376i0 != null) {
            c2376i0.b();
        }
    }
}
