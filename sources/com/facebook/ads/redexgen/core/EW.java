package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EW extends C1436aL {
    public final ImageView A00;
    public final C1621dL A01;

    public EW(C1621dL c1621dL) {
        super(c1621dL);
        this.A01 = c1621dL;
        setRadius(30);
        this.A00 = new ImageView(c1621dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1404Zn c1404Zn) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
        kz.A06(new InterfaceC1405Zo() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // com.facebook.ads.redexgen.core.InterfaceC1405Zo
            public final void ADT(C1404Zn c1404Zn) {
                this.A00.A00(c1404Zn);
            }
        });
    }
}
