package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1342Xd {
    public static C1342Xd A02;
    public final C1122Om A00;
    public final C1344Xf A01;

    public C1342Xd(C1621dL c1621dL, Executor executor, TE te2) {
        this.A01 = new C1344Xf(c1621dL);
        this.A00 = new C1122Om(executor, te2, c1621dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1621dL c1621dL, Executor executor, TE te2) {
        if (!U7.A1X(c1621dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C1342Xd(c1621dL, executor, te2);
            A02.A00();
        } else {
            A02.A02(te2);
        }
    }

    private void A02(TE te2) {
        this.A00.A07(te2);
    }
}
