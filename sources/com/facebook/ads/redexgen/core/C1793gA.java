package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1793gA implements InterfaceC1175Qn {
    public final /* synthetic */ C06686g A00;

    public C1793gA(C06686g c06686g) {
        this.A00 = c06686g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1175Qn
    public final void AGP(AbstractC1168Qg abstractC1168Qg, QJ qj, QJ qj2) {
        this.A00.A1l(abstractC1168Qg, qj, qj2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1175Qn
    public final void AGR(AbstractC1168Qg abstractC1168Qg, QJ qj, QJ qj2) {
        this.A00.A0r.A0Y(abstractC1168Qg);
        this.A00.A1m(abstractC1168Qg, qj, qj2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1175Qn
    public final void AGT(AbstractC1168Qg abstractC1168Qg, QJ qj, QJ qj2) {
        abstractC1168Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC1168Qg, abstractC1168Qg, qj, qj2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC1168Qg, qj, qj2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1175Qn
    public final void AJo(AbstractC1168Qg abstractC1168Qg) {
        this.A00.A06.A1F(abstractC1168Qg.A0H, this.A00.A0r);
    }
}
