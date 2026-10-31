package com.unity3d.player;

import android.view.Surface;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
final class L0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f12751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Surface f12752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Semaphore f12753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12754d;

    L0(UnityPlayer unityPlayer, int i10, Surface surface, Semaphore semaphore) {
        this.f12754d = unityPlayer;
        this.f12751a = i10;
        this.f12752b = surface;
        this.f12753c = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12754d.nativeRecreateGfxState(this.f12751a, this.f12752b);
        this.f12753c.release();
    }
}
