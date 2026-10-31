package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1052Lr implements InterfaceC1432aH {
    public final /* synthetic */ C1037Lc A00;

    public C1052Lr(C1037Lc c1037Lc) {
        this.A00 = c1037Lc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1432aH
    public final void ACI() {
        if (this.A00.A0V()) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1432aH
    public final void AE7() {
        this.A00.A0F = false;
        this.A00.A0O.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1432aH
    public final void AE8() {
        this.A00.A0F = true;
        this.A00.A0O.A06();
    }
}
