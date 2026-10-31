package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HP implements InterfaceC1317Wc {
    public final /* synthetic */ C06234n A00;

    public HP(C06234n c06234n) {
        this.A00 = c06234n;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1317Wc
    public final void ACp() {
        this.A00.A0M.ACy(this.A00.A0C);
        this.A00.A0M.ACZ();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1317Wc
    public final void AEn(float f10) {
        int i10;
        float totalForce = (this.A00.A0C - f10) + (this.A00.A0a ? 0 : this.A00.A0P.getDuration());
        if (this.A00.A0a) {
            i10 = this.A00.A0C;
        } else {
            i10 = this.A00.A0B;
        }
        float seenTime = i10;
        this.A00.A0M.AJs(totalForce / seenTime);
    }
}
