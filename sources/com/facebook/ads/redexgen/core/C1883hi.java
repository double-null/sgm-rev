package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1883hi implements InterfaceC1192Re {
    public final /* synthetic */ AbstractC1896hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1621dL A03;
    public final /* synthetic */ boolean A04;

    public C1883hi(NH nh, C1621dL c1621dL, boolean z10, AbstractC1896hy abstractC1896hy, NG ng) {
        this.A02 = nh;
        this.A03 = c1621dL;
        this.A04 = z10;
        this.A00 = abstractC1896hy;
        this.A01 = ng;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1192Re
    public final void ACM() {
        if (U7.A1l(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1533bu.A01(this.A03, this.A00, 1, new C1884hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1192Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
