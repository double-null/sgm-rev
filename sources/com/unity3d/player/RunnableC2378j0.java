package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2378j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12926a;

    RunnableC2378j0(UnityPlayer unityPlayer) {
        this.f12926a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12926a.nativeLowMemory();
    }
}
