package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class J0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12743a;

    J0(UnityPlayer unityPlayer) {
        this.f12743a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.f12743a;
        unityPlayer.removeView(unityPlayer.m_SplashScreen);
        this.f12743a.m_SplashScreen = null;
    }
}
