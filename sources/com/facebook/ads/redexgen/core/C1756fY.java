package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1756fY extends AbstractRunnableC1308Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C1164Qc A02;

    public C1756fY(RS rs, C1164Qc c1164Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c1164Qc;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
