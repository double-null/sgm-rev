package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1442aR {
    public static final int A00 = XP.A00();

    public static void A00(C1621dL c1621dL, ViewGroup viewGroup, String str) {
        new KZ(viewGroup, c1621dL).A07(str);
        View view = new View(c1621dL);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0P(view, c1621dL);
        viewGroup.addView(view, 0);
    }
}
