package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0832De extends AbstractC1110Nz {
    public final /* synthetic */ C0830Dc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832De(C0830Dc c0830Dc, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = c0830Dc;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1110Nz
    public final void A00(boolean z10, boolean z11, O1 o10) {
        if ((!U7.A0z(this.A00.A0D) || !this.A00.A09) && z11) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC1628dS.A03));
        }
    }
}
