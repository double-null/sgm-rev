package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1012Kd extends AbstractRunnableC1308Vt {
    public final /* synthetic */ C1403Zm A00;

    public C1012Kd(C1403Zm c1403Zm) {
        this.A00 = c1403Zm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
