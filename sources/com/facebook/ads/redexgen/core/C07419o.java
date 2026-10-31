package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07419o extends AbstractC2276oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC06104a.A0h(1);
    public static final String A03 = AbstractC06104a.A0h(2);
    public static final C1R<C07419o> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oS
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C07419o.A00(bundle);
        }
    };

    public C07419o() {
        this.A01 = false;
        this.A00 = false;
    }

    public C07419o(boolean z10) {
        this.A01 = true;
        this.A00 = z10;
    }

    public static C07419o A00(Bundle bundle) {
        boolean rated = bundle.getInt(AbstractC2276oU.A02, -1) == 3;
        C3M.A07(rated);
        boolean rated2 = bundle.getBoolean(A04, false);
        if (rated2) {
            return new C07419o(bundle.getBoolean(A03, false));
        }
        return new C07419o();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C07419o)) {
            return false;
        }
        C07419o c07419o = (C07419o) obj;
        return this.A00 == c07419o.A00 && this.A01 == c07419o.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
