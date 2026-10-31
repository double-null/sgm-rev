package com.unity3d.player;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes4.dex */
final class D0 extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D0(UnityPlayer unityPlayer, Context context, int i10) {
        super(context, i10);
        this.f12721a = unityPlayer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        UnityPlayer unityPlayer = this.f12721a;
        U0 u10 = unityPlayer.m_MainThread;
        u10.f12824f = unityPlayer.mNaturalOrientation;
        u10.f12825g = i10;
        u10.a(S0.f12811j);
    }
}
