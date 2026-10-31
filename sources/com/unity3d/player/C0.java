package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class C0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12715a;

    C0(UnityPlayer unityPlayer) {
        this.f12715a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12715a.setupUnityToBePaused();
        this.f12715a.windowFocusChanged(false);
        this.f12715a.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
    }
}
