package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YZ implements View.OnClickListener {
    public final /* synthetic */ C1367Yc A00;

    public YZ(C1367Yc c1367Yc) {
        this.A00 = c1367Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A4v();
            } else {
                this.A00.A04.A4w();
            }
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
