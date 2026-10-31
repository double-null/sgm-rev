package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Semaphore f12778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12779b;

    P0(UnityPlayer unityPlayer, Semaphore semaphore) {
        this.f12779b = unityPlayer;
        this.f12778a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12779b.nativePause()) {
            UnityPlayer unityPlayer = this.f12779b;
            unityPlayer.mQuitting = true;
            unityPlayer.shutdown();
            this.f12779b.queueDestroy();
        }
        this.f12778a.release();
    }
}
