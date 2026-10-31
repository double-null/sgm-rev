package com.unity3d.player;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
final class Z implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2364c0 f12841a;

    Z(C2364c0 c2364c0) {
        this.f12841a = c2364c0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f12841a.reportSoftInputArea();
        this.f12841a.f12878h.b();
    }
}
