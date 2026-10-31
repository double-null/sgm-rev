package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0K extends C05150h {
    public C06545s A00;
    public List<C1588cn> A01;

    public C0K(C1621dL c1621dL) {
        super(c1621dL);
        this.A00 = new C06545s(this, 1, null, null, null);
    }

    public final void A20(C1694eX c1694eX) {
        if (this.A00 != null) {
            this.A00.A0c(c1694eX);
        }
    }

    public C06545s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
