package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06866y extends AbstractC1867hQ {
    public C06866y(C1621dL c1621dL, NT nt) {
        super(c1621dL, nt);
    }

    private C1865hO A00(Runnable runnable) {
        return new C1865hO(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1867hQ
    public final AbstractC1074Mo A0I() {
        C1922iS successfullyLoadedAdapter = (C1922iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1867hQ
    public final void A0P() {
        C1922iS interstitialAdapter = (C1922iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1867hQ
    public final void A0R(MP mp, TE te2, TC tc2, NU nu) {
        C1922iS c1922iS = (C1922iS) mp;
        C1866hP c1866hP = new C1866hP(this, nu, c1922iS);
        A0H().postDelayed(c1866hP, te2.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1922iS.A0A(this.A0B, A00(c1866hP), nu, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
