package com.unity3d.player;

import android.telephony.PhoneStateListener;

/* JADX INFO: loaded from: classes4.dex */
final class R0 extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12790a;

    private R0(UnityPlayer unityPlayer) {
        this.f12790a = unityPlayer;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i10, String str) {
        this.f12790a.nativeMuteMasterAudio(i10 == 1);
    }
}
