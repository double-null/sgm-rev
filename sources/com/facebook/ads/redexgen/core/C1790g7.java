package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1790g7 implements QI {
    public final /* synthetic */ C06686g A00;

    public C1790g7(C06686g c06686g) {
        this.A00 = c06686g;
    }

    @Override // com.facebook.ads.redexgen.core.QI
    public final void ACK(AbstractC1168Qg abstractC1168Qg) {
        abstractC1168Qg.A0d(true);
        if (abstractC1168Qg.A06 != null && abstractC1168Qg.A07 == null) {
            abstractC1168Qg.A06 = null;
        }
        abstractC1168Qg.A07 = null;
        if (!abstractC1168Qg.A0G() && !this.A00.A1x(abstractC1168Qg.A0H) && abstractC1168Qg.A0i()) {
            this.A00.removeDetachedView(abstractC1168Qg.A0H, false);
        }
    }
}
