package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1373Yi implements View.OnClickListener {
    public final /* synthetic */ LV A00;

    public ViewOnClickListenerC1373Yi(LV lv) {
        this.A00 = lv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A4w();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
