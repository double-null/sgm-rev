package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1760fc extends AbstractRunnableC1295Vg {
    public final /* synthetic */ C1759fb A00;

    public C1760fc(C1759fb c1759fb) {
        this.A00 = c1759fb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1295Vg
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
