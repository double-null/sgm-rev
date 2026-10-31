package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0854Ea extends C1436aL {
    public final ImageView A00;
    public final C1621dL A01;

    public C0854Ea(C1621dL c1621dL) {
        super(c1621dL);
        this.A01 = c1621dL;
        this.A00 = new ImageView(c1621dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        KZ downloadImageTask = new KZ(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
