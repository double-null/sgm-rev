package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0842Do extends AbstractRunnableC1308Vt {
    public final /* synthetic */ C05923i A00;

    public C0842Do(C05923i c05923i) {
        this.A00 = c05923i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        this.A00.A0C.getEventBus().A04(this.A00.A0E, this.A00.A06, this.A00.A08, this.A00.A05, this.A00.A04, this.A00.A03, this.A00.A07, this.A00.A0A, this.A00.A0B, this.A00.A0D, this.A00.A09);
        if (this.A00.A01 != null) {
            this.A00.A01.A07();
        }
    }
}
