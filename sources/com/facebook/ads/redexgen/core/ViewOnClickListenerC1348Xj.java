package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1348Xj implements View.OnClickListener {
    public final /* synthetic */ N9 A00;
    public final /* synthetic */ C1264Ua A01;
    public final /* synthetic */ C1349Xk A02;
    public final /* synthetic */ InterfaceC1352Xn A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC1348Xj(C1349Xk c1349Xk, C1264Ua c1264Ua, InterfaceC1352Xn interfaceC1352Xn, String str, N9 n10) {
        this.A02 = c1349Xk;
        this.A01 = c1264Ua;
        this.A03 = interfaceC1352Xn;
        this.A04 = str;
        this.A00 = n10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A04(UZ.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A02(), true)) {
                this.A03.AAf(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                WN.A0O(new WN(), this.A02.A03, WQ.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
