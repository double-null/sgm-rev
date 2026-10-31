package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1384Yt implements View.OnClickListener {
    public final /* synthetic */ C1386Yv A00;

    public ViewOnClickListenerC1384Yt(C1386Yv c1386Yv) {
        this.A00 = c1386Yv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9U();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
