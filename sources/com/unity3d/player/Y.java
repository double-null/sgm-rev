package com.unity3d.player;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes4.dex */
final class Y implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2364c0 f12840a;

    Y(C2364c0 c2364c0) {
        this.f12840a = c2364c0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f12840a.invokeOnClose();
    }
}
