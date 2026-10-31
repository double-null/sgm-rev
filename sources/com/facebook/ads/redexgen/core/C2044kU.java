package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2044kU implements InterfaceC0979Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C0912Gg A02;
    public C0913Gh A03;

    public C2044kU(C0913Gh c0913Gh, C0912Gg c0912Gg) {
        this.A03 = c0913Gh;
        this.A02 = c0912Gg;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0979Iw
    public final InterfaceC0928Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C2084lK(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0979Iw
    public final long AGd(InterfaceC2087lN interfaceC2087lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0979Iw
    public final void AJR(long j10) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC06104a.A0L(jArr, j10, true, true)];
    }
}
