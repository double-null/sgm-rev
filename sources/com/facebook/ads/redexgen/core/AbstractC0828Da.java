package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0828Da extends RelativeLayout implements InterfaceC1638dc {
    public E1 A00;

    public AbstractC0828Da(C1621dL c1621dL) {
        super(c1621dL);
    }

    public AbstractC0828Da(C1621dL c1621dL, AttributeSet attributeSet, int i10) {
        super(c1621dL, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1638dc
    public final void AAm(E1 e10) {
        this.A00 = e10;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1638dc
    public final void AJk(E1 e10) {
        A08();
        this.A00 = null;
    }

    public E1 getVideoView() {
        return this.A00;
    }
}
