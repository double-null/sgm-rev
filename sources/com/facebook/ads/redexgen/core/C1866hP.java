package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1866hP extends AbstractRunnableC1308Vt {
    public final /* synthetic */ C1922iS A00;
    public final /* synthetic */ NU A01;
    public final /* synthetic */ C06866y A02;

    public C1866hP(C06866y c06866y, NU nu, C1922iS c1922iS) {
        this.A02 = c06866y;
        this.A01 = nu;
        this.A00 = c1922iS;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        V1 v1A00 = V1.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5Y(v1A00.A03().getErrorCode(), v1A00.A04());
        this.A02.A07.A0G(v1A00);
    }
}
