package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1605d4 {
    public KE A00;
    public final C1072Ml A01;
    public final C1082Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C1621dL A05;
    public final C1264Ua A06;
    public static final int A09 = (int) (AbstractC1324Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC1324Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC1324Wl.A02 * 8.0f);

    public C1605d4(C1621dL c1621dL, US us, AbstractC1896hy abstractC1896hy) {
        this.A05 = c1621dL;
        this.A06 = new C1264Ua(abstractC1896hy.A25(), us);
        this.A01 = abstractC1896hy.A1z();
        this.A02 = abstractC1896hy.A20().A0I();
        this.A04 = abstractC1896hy.A23();
        this.A03 = abstractC1896hy.A20().A0K();
    }

    private View A00(KE ke2) {
        C1441aQ c1441aQ = new C1441aQ(this.A05, this.A01.A01(), true, false, false);
        c1441aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c1441aQ.setAlignment(17);
        C1435aK c1435aK = new C1435aK(this.A05);
        XP.A0K(c1435aK, 0);
        c1435aK.setRadius(50);
        new KZ(c1435aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1435aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1441aQ, layoutParams);
        if (ke2 != null) {
            XP.A0H(ke2);
            linearLayout.addView(ke2, layoutParams);
            if (TextUtils.isEmpty(ke2.getText())) {
                XP.A0F(ke2);
            }
        }
        return linearLayout;
    }

    private C06686g A01() {
        C06686g c06686g = new C06686g(this.A05);
        c06686g.setLayoutManager(new C1801gI(this.A05, 0, false));
        c06686g.setAdapter(new C0855Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c06686g;
    }

    private final EnumC1604d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1604d3.A03;
        }
        return EnumC1604d3.A02;
    }

    public final Pair<EnumC1604d3, View> A03(KE ke2) {
        View viewA01;
        this.A00 = ke2;
        EnumC1604d3 enumC1604d3A02 = A02();
        switch (C1603d2.A00[enumC1604d3A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC1266Uc.A04(viewA01, this.A06, UZ.A0S);
        return new Pair<>(enumC1604d3A02, viewA01);
    }
}
