package com.unity3d.player;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
final class B0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12711a;

    B0(UnityPlayer unityPlayer) {
        this.f12711a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer;
        Activity activity;
        if (!this.f12711a.nativeIsAutorotationOn() || (activity = (unityPlayer = this.f12711a).mActivity) == null) {
            return;
        }
        activity.setRequestedOrientation(unityPlayer.mInitialScreenOrientation);
    }
}
