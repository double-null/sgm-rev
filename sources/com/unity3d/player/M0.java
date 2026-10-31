package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class M0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12760a;

    M0(UnityPlayer unityPlayer) {
        this.f12760a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.f12760a;
        if (unityPlayer.mMainDisplayOverride) {
            unityPlayer.removeView(unityPlayer.mGlView);
        } else if (unityPlayer.mGlView.getParent() != null) {
            AbstractC2409z.Log(5, "Couldn't add view, because it's already assigned to another parent");
        } else {
            UnityPlayer unityPlayer2 = this.f12760a;
            unityPlayer2.addView(unityPlayer2.mGlView);
        }
    }
}
