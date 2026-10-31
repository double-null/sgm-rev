package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1431aG implements View.OnClickListener {
    public final /* synthetic */ C1433aI A00;

    public ViewOnClickListenerC1431aG(C1433aI c1433aI) {
        this.A00 = c1433aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
