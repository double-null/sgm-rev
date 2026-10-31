package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1382Yr implements View.OnClickListener {
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C1372Yh A01;
    public final /* synthetic */ LU A02;

    public ViewOnClickListenerC1382Yr(LU lu, C1372Yh c1372Yh, O6 o10) {
        this.A02 = lu;
        this.A01 = c1372Yh;
        this.A00 = o10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEP(this.A00);
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
