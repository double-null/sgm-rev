package com.unity3d.player;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.unity3d.player.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class DialogInterfaceOnClickListenerC2404w0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f13016a;

    DialogInterfaceOnClickListenerC2404w0(UnityPlayer unityPlayer) {
        this.f13016a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f13016a.finish();
    }
}
