package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J3 implements InterfaceC1405Zo {
    public final /* synthetic */ C0975Is A00;

    public J3(C0975Is c0975Is) {
        this.A00 = c0975Is;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1405Zo
    public final void ADT(C1404Zn c1404Zn) {
        if (this.A00.A02 != null && c1404Zn.A00() != null) {
            this.A00.A02.setImageBitmap(c1404Zn.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
