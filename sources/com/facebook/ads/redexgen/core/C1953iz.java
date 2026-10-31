package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1953iz implements InterfaceC06294t {
    public InterfaceC1048Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C1953iz A00(InterfaceC1048Ln interfaceC1048Ln) {
        this.A02 = interfaceC1048Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06294t
    public final C1952iy A59() {
        return new C1952iy((InterfaceC1048Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
