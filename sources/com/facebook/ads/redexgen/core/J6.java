package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC1308Vt {
    public final /* synthetic */ C0975Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C0975Is c0975Is, boolean z10) {
        this.A00 = c0975Is;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        AbstractC1351Xm abstractC1351XmA0C = this.A00.A0c.A0C();
        if (abstractC1351XmA0C == null) {
            return;
        }
        abstractC1351XmA0C.setPageDetailsVisible((this.A01 || abstractC1351XmA0C.A0B()) ? false : true);
        abstractC1351XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
