package com.unity3d.player;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2365d implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j6.c f12880a;

    C2365d(j6.c cVar) {
        this.f12880a = cVar;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        Runnable runnable = ((B) this.f12880a).f12710a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
