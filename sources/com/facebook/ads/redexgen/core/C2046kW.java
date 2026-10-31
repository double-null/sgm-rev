package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2046kW implements InterfaceC0928Gw {
    public final /* synthetic */ C2045kV A00;

    public C2046kW(C2045kV c2045kV) {
        this.A00 = c2045kV;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0928Gw
    public final long A7l() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0928Gw
    public final C0927Gv A8t(long j10) {
        long jA06 = this.A00.A0B.A06(j10);
        long j11 = this.A00.A09;
        long j12 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j13 = (j12 - targetGranule) * jA06;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = AbstractC06104a.A0T((j11 + (j13 / targetGranule2)) - 30000, this.A00.A09, this.A00.A08 - 1);
        return new C0927Gv(new C0929Gx(j10, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0928Gw
    public final boolean AAa() {
        return true;
    }
}
