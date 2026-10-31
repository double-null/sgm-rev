package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1381Yq implements View.OnClickListener {
    public final /* synthetic */ LU A00;

    public ViewOnClickListenerC1381Yq(LU lu) {
        this.A00 = lu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9U();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
