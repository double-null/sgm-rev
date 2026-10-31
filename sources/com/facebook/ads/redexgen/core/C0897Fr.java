package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0897Fr extends AbstractRunnableC1308Vt {
    public final /* synthetic */ InterfaceC1571cW A00;
    public final /* synthetic */ C1572cX A01;

    public C0897Fr(C1572cX c1572cX, InterfaceC1571cW interfaceC1571cW) {
        this.A01 = c1572cX;
        this.A00 = interfaceC1571cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0898Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
