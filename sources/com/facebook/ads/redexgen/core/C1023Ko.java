package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1023Ko extends AbstractRunnableC1308Vt {
    public final WeakReference<C1694eX> A00;

    public C1023Ko(C1694eX c1694eX) {
        this.A00 = new WeakReference<>(c1694eX);
    }

    public C1023Ko(WeakReference<C1694eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        C1694eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
