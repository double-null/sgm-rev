package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1783fz extends QT {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1782fy A01;

    public C1783fz(AbstractC1782fy abstractC1782fy) {
        this.A01 = abstractC1782fy;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C06686g c06686g, int i10) {
        super.A0L(c06686g, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0M(C06686g c06686g, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.A00 = true;
        }
    }
}
