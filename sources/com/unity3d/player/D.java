package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes4.dex */
final class D extends C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f12718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f12719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12720f;

    private D(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10, Runnable runnable) {
        super(runnable);
        this.f12718d = null;
        this.f12720f = i10;
        this.f12719e = onBackInvokedDispatcher;
    }

    public static C a(Object obj, int i10, Runnable runnable) {
        C d10 = PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog)) ? new D(AbstractC2367e.a(obj), i10, runnable) : new C(runnable);
        d10.registerOnBackPressedCallback();
        return d10;
    }

    @Override // com.unity3d.player.C
    protected void registerOnBackPressedCallback() {
        if (this.f12712a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (PlatformSupport.TIRAMISU_SUPPORT) {
            C2365d c2365d = new C2365d(this.f12712a);
            this.f12718d = c2365d;
            AbstractC2367e.a(this.f12719e, this.f12720f, c2365d);
        }
    }

    @Override // com.unity3d.player.C
    protected void unregisterOnBackPressedCallback() {
        if (this.f12712a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC2367e.a(this.f12719e, this.f12718d);
                this.f12718d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
