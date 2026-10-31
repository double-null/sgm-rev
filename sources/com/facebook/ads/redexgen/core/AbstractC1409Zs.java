package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1409Zs {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC1408Zr viewOnClickListenerC1408Zr = new ViewOnClickListenerC1408Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1408Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC1407Zq(viewOnClickListenerC1408Zr));
        }
    }
}
