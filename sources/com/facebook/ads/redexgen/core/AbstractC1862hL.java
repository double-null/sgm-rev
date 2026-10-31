package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1862hL implements InterfaceC1065Me {
    public C1164Qc A00;

    public final void A00(C1164Qc c1164Qc) {
        this.A00 = c1164Qc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Me
    public final void AEG(C1917iN c1917iN) {
        if (this.A00 != null && this.A00.A16() != null) {
            this.A00.A16().ACD();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Me
    public final void AEI(C1917iN c1917iN) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Me
    public final void AEK(C1917iN c1917iN, V1 v10) {
    }
}
