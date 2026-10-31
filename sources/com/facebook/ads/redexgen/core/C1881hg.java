package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1881hg implements S7 {
    public final /* synthetic */ AbstractC1896hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1621dL A03;
    public final /* synthetic */ boolean A04;

    public C1881hg(NH nh, C1621dL c1621dL, boolean z10, AbstractC1896hy abstractC1896hy, NG ng) {
        this.A02 = nh;
        this.A03 = c1621dL;
        this.A04 = z10;
        this.A00 = abstractC1896hy;
        this.A01 = ng;
    }

    private void A00(boolean z10) {
        if (z10) {
            if (U7.A1l(this.A03) && this.A04) {
                this.A02.A02.add(AbstractC1533bu.A01(this.A03, this.A00, 1, new C1882hh(this)));
                return;
            } else {
                this.A01.ACG();
                return;
            }
        }
        this.A01.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00(true);
    }
}
