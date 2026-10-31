package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1362Xx implements View.OnClickListener {
    public final /* synthetic */ C1103Nr A00;

    public ViewOnClickListenerC1362Xx(C1103Nr c1103Nr) {
        this.A00 = c1103Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 != null && this.A00.A02.A02()) {
                this.A00.A01.ACC(this.A00);
            }
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
