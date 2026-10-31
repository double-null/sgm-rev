package com.facebook.ads.redexgen.core;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1704eh {
    public C1708el A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1704eh A00(C1708el c1708el) {
        this.A00 = c1708el;
        return this;
    }

    public final C1704eh A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1704eh A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1704eh A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C1704eh A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C1705ei A05() {
        return new C1705ei(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
