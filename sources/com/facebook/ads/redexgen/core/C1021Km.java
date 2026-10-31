package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1021Km {
    public final int A00;
    public final long A01;

    public C1021Km(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C1021Km A00(InterfaceC2087lN interfaceC2087lN, C4J c4j) throws IOException {
        interfaceC2087lN.AG9(c4j.A0l(), 0, 8);
        c4j.A0f(0);
        int iA0C = c4j.A0C();
        long size = c4j.A0O();
        return new C1021Km(iA0C, size);
    }
}
