package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1501bO extends AnimatorListenerAdapter {
    public final /* synthetic */ C0975Is A00;
    public final /* synthetic */ boolean A01;

    public C1501bO(C0975Is c0975Is, boolean z10) {
        this.A00 = c0975Is;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0q(this.A00.A0D, true);
        if (!this.A01 && this.A00.A08 != null) {
            this.A00.A08.destroy();
        }
    }
}
