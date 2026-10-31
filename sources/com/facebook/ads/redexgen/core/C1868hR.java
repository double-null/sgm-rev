package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1868hR extends AbstractRunnableC1308Vt {
    public final /* synthetic */ AbstractC1867hQ A00;
    public final /* synthetic */ V1 A01;

    public C1868hR(AbstractC1867hQ abstractC1867hQ, V1 v10) {
        this.A00 = abstractC1867hQ;
        this.A01 = v10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        this.A00.A0B.A0F().A5Y(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
