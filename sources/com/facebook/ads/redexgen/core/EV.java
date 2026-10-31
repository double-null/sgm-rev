package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EV implements InterfaceC1719ew {
    public final /* synthetic */ C1618dI A00;

    public EV(C1618dI c1618dI) {
        this.A00 = c1618dI;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1719ew
    public final void AGQ() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1719ew
    public final void AGS(C1721ey c1721ey) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c1721ey != null && c1721ey.A00()) {
            this.A00.A02.A4b(this.A00.A03.A8x());
        } else {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }
}
