package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6P extends C1780fw {
    public C6P(R0 r10) {
        super(r10);
    }

    @Override // com.facebook.ads.redexgen.core.C1780fw, com.facebook.ads.redexgen.core.InterfaceC1352Xn
    public final /* bridge */ /* synthetic */ void A3w(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        super.A3w(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1780fw, com.facebook.ads.redexgen.core.InterfaceC1352Xn
    public final /* bridge */ /* synthetic */ void A3x(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A3x(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1780fw, com.facebook.ads.redexgen.core.InterfaceC1352Xn
    public final void A4b(String str) {
        super.A4b(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC1643dh.A08.A03();
        String rewardedVideoError = EnumC1643dh.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1780fw, com.facebook.ads.redexgen.core.InterfaceC1352Xn
    public final /* bridge */ /* synthetic */ void A4c(String str, C1242Td c1242Td) {
        super.A4c(str, c1242Td);
    }

    @Override // com.facebook.ads.redexgen.core.C1780fw, com.facebook.ads.redexgen.core.InterfaceC1352Xn
    public final /* bridge */ /* synthetic */ void AAf(String str, N9 n10) {
        super.AAf(str, n10);
    }

    @Override // com.facebook.ads.redexgen.core.C1780fw, com.facebook.ads.redexgen.core.InterfaceC1352Xn
    public final /* bridge */ /* synthetic */ void ACf(int i10) {
        super.ACf(i10);
    }
}
