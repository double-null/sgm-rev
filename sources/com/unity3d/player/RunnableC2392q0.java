package com.unity3d.player;

import android.graphics.Rect;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.unity3d.player.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2392q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f12967a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f12968b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Semaphore f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12971e;

    RunnableC2392q0(UnityPlayer unityPlayer, Semaphore semaphore, UnityPlayer unityPlayer2) {
        this.f12971e = unityPlayer;
        this.f12969c = semaphore;
        this.f12970d = unityPlayer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12971e.reportSoftInputArea(new Rect());
        this.f12971e.reportSoftInputIsVisible(false);
        if (this.f12971e.mSoftInput != null) {
            this.f12970d.setOnHandleFocusListener(new C2388o0(this));
            UnityPlayer unityPlayer = this.f12971e;
            unityPlayer.mSoftInput.f12801g = new C2390p0(this);
            unityPlayer.dismissSoftInput();
        }
    }
}
