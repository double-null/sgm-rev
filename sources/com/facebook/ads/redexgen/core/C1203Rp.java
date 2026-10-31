package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1203Rp {
    public final long A00;
    public final EnumC1202Ro A01;
    public final String A02;
    public final boolean A03;

    public C1203Rp(String str, boolean z10, EnumC1202Ro enumC1202Ro) {
        this(str, z10, enumC1202Ro, System.currentTimeMillis());
    }

    public C1203Rp(String str, boolean z10, EnumC1202Ro enumC1202Ro, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC1202Ro;
        this.A00 = j10;
    }

    public static C1203Rp A00() {
        return new C1203Rp("", true, EnumC1202Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC1202Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
