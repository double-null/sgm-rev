package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1365Ya implements View.OnClickListener {
    public final /* synthetic */ C1367Yc A00;

    public ViewOnClickListenerC1365Ya(C1367Yc c1367Yc) {
        this.A00 = c1367Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAg();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
