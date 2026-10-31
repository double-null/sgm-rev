package com.unity3d.player;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
final class F0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f12724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12725b;

    F0(UnityPlayer unityPlayer, float f10) {
        this.f12725b = unityPlayer;
        this.f12724a = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowManager.LayoutParams attributes = this.f12725b.m_Window.getAttributes();
        attributes.screenBrightness = this.f12724a;
        this.f12725b.m_Window.setAttributes(attributes);
    }
}
