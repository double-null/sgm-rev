package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
final class O0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Semaphore f12769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12770b;

    O0(UnityPlayer unityPlayer, Semaphore semaphore) {
        this.f12770b = unityPlayer;
        this.f12769a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12770b.shutdown();
        this.f12769a.release();
    }
}
