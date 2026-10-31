package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC1308Vt {
    public final /* synthetic */ AbstractC1426aB A00;

    public K1(AbstractC1426aB abstractC1426aB) {
        this.A00 = abstractC1426aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
