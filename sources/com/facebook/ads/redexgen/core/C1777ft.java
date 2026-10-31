package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1777ft extends AbstractRunnableC1295Vg {
    public final /* synthetic */ C1774fq A00;

    public C1777ft(C1774fq c1774fq) {
        this.A00 = c1774fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1295Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
