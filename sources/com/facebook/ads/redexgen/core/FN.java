package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FN implements InterfaceC1579ce {
    public final /* synthetic */ C06013r A00;

    public FN(C06013r c06013r) {
        this.A00 = c06013r;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1579ce
    public final void A9d() {
        if (this.A00.A03 instanceof C06395d) {
            ((C06395d) this.A00.A03).A1W();
            C1264Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1579ce
    public final void AJF() {
        if (this.A00.A03 instanceof C06395d) {
            ((C06395d) this.A00.A03).A1a(this.A00.A0M);
            C1264Ua.A02(UZ.A0e, null, ((G2) this.A00).A02.A25(), ((G2) this.A00).A04.A0A());
        }
        this.A00.A0k();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1579ce
    public final void AJT() {
        this.A00.A0c();
        if (this.A00.A03 instanceof C06395d) {
            ((C06395d) this.A00.A03).getAdDetailsView().setVisibility(8);
        }
    }
}
