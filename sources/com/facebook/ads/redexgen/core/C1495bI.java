package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1495bI extends AbstractRunnableC1308Vt {
    public final /* synthetic */ C1595cu A00;

    public C1495bI(C1595cu c1595cu) {
        this.A00 = c1595cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        for (C1229Sq c1229Sq : C1228Sp.A02()) {
            C1228Sp.A0A(this.A00, c1229Sq.A02(), c1229Sq.A00(), c1229Sq.A01(), false);
        }
        C1228Sp.A02().clear();
    }
}
