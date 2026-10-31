package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC1265Ub implements View.OnAttachStateChangeListener {
    public final /* synthetic */ UZ A00;
    public final /* synthetic */ C1264Ua A01;

    public ViewOnAttachStateChangeListenerC1265Ub(C1264Ua c1264Ua, UZ uz) {
        this.A01 = c1264Ua;
        this.A00 = uz;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
