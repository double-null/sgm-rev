package com.facebook.ads.redexgen.core;

import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1857hF extends AbstractRunnableC1295Vg {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC1855hD A01;

    public C1857hF(AbstractC1855hD abstractC1855hD, Message message) {
        this.A01 = abstractC1855hD;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1295Vg
    public final void A01() {
        this.A01.A05.A9b(this.A00);
    }
}
