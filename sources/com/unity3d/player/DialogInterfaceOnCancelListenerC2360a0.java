package com.unity3d.player;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class DialogInterfaceOnCancelListenerC2360a0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2364c0 f12844a;

    DialogInterfaceOnCancelListenerC2360a0(C2364c0 c2364c0) {
        this.f12844a = c2364c0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F f10 = this.f12844a.f12800f;
        if (f10 != null) {
            ((C2382l0) f10).a();
        }
    }
}
