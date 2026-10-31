package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1500bN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0975Is A00;

    public C1500bN(C0975Is c0975Is) {
        this.A00 = c0975Is;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0U.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.A0U.requestLayout();
    }
}
