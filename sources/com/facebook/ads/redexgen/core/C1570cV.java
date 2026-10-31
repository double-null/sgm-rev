package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1570cV {
    public String A02;
    public String A03;
    public String A04;
    public final C1082Mw A06;
    public final N9 A07;
    public final C1621dL A08;
    public C1084My A01 = C1084My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C1570cV(C1621dL c1621dL, C1082Mw c1082Mw, N9 n10) {
        this.A08 = c1621dL;
        this.A06 = c1082Mw;
        this.A07 = n10;
    }

    public final C1570cV A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1570cV A0A(C1084My c1084My) {
        this.A01 = c1084My;
        return this;
    }

    public final C1570cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C1570cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C1570cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C1570cV A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C1572cX A0F() {
        return new C1572cX(this, null);
    }
}
