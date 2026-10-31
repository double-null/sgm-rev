package com.facebook.ads.redexgen.core;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1149Pn implements Runnable {
    public final /* synthetic */ C06716j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1149Pn(C06716j c06716j, ArrayList arrayList) {
        this.A00 = c06716j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (C1158Pw c1158Pw : this.A01) {
            this.A00.A0e(c1158Pw.A04, c1158Pw.A00, c1158Pw.A01, c1158Pw.A02, c1158Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
