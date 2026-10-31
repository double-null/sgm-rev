package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2020k6 implements J7 {
    public final C0993Jk A00;
    public final Map<String, C1000Jr> A01;
    public final Map<String, String> A02;
    public final Map<String, C0994Jl> A03;
    public final long[] A04;

    public C2020k6(C0993Jk c0993Jk, Map<String, C1000Jr> map, Map<String, C0994Jl> map2, Map<String, String> imageMap) {
        this.A00 = c0993Jk;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c0993Jk.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C2249o2> A7P(long j10) {
        return this.A00.A0E(j10, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0K = AbstractC06104a.A0K(this.A04, j10, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
