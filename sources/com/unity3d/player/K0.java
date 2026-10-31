package com.unity3d.player;

/* JADX INFO: loaded from: classes4.dex */
final class K0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12746a;

    K0(UnityPlayer unityPlayer) {
        this.f12746a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12746a.nativeSendSurfaceChangedEvent();
    }
}
