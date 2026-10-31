package com.facebook.ads.redexgen.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LV extends AbstractC1368Yd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (AbstractC1324Wl.A02 * 8.0f);
    public final RelativeLayout A00;
    public final O2 A01;
    public final C1621dL A02;

    public LV(C1621dL c1621dL, US us, String str, N9 n10, InterfaceC1353Xo interfaceC1353Xo, InterfaceC1352Xn interfaceC1352Xn) {
        super(c1621dL, us, str, n10, interfaceC1353Xo, interfaceC1352Xn);
        this.A02 = c1621dL;
        this.A01 = O3.A00(c1621dL.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        XP.A0K(this.A00, -1728053248);
        this.A00.setOnClickListener(new ViewOnClickListenerC1373Yi(this));
    }

    public static RelativeLayout.LayoutParams A00(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
        XP.A0T(this, transitionSet);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1368Yd
    public final void A0N() {
        O6 o6A0A = this.A01.A0A();
        C1383Ys c1383Ys = new C1383Ys(this.A02);
        c1383Ys.setInfo(XX.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1383Ys.setOnClickListener(new ViewOnClickListenerC1374Yj(this));
        O6 o6A0B = this.A01.A0B();
        C1383Ys c1383Ys2 = new C1383Ys(this.A02);
        c1383Ys2.setInfo(XX.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1383Ys2.setOnClickListener(new ViewOnClickListenerC1375Yk(this));
        C1383Ys c1383Ys3 = new C1383Ys(this.A02);
        c1383Ys3.setInfo(XX.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1383Ys3.setOnClickListener(new ViewOnClickListenerC1376Yl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        XP.A0K(linearLayout, -1);
        if (!o6A0A.A05().isEmpty()) {
            linearLayout.addView(c1383Ys, itemParams);
        }
        if (!o6A0B.A05().isEmpty()) {
            linearLayout.addView(c1383Ys2, itemParams);
        }
        linearLayout.addView(c1383Ys3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1368Yd
    public final void A0O() {
        XP.A0G(this);
        this.A00.removeAllViews();
        XP.A0H(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1368Yd
    public final void A0P(O6 o10, O4 o11) {
        String strA0E;
        int i10;
        String strA01;
        if (o11 == O4.A05) {
            return;
        }
        boolean z10 = o11 == O4.A06;
        C1366Yb c1366Yb = new C1366Yb(this.A02, this.A0B);
        if (z10) {
            O2 o12 = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = o12.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C1366Yb c1366YbA0E = c1366Yb.A0I(strA0E).A0H(this.A01.A0D()).A0F(o10.A04()).A0E(z10 ? XX.REPORT_AD : XX.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        C1366Yb c1366YbA0D = c1366YbA0E.A0D(i10);
        if (this.A0A != null) {
            N9 n10 = this.A0A;
            if (A03[1].charAt(11) != 'X') {
                strA01 = n10.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = n10.A01();
            }
        } else {
            strA01 = "";
        }
        C1367Yc adHiddenView = c1366YbA0D.A0G(strA01).A0M();
        XP.A0K(adHiddenView, -1);
        XP.A0R(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1368Yd
    public final void A0Q(O6 o10, O4 o11) {
        String strA0H;
        boolean z10 = o11 == O4.A06;
        C1621dL c1621dL = this.A02;
        InterfaceC1370Yf interfaceC1370Yf = this.A0B;
        if (z10) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C1386Yv c1386Yv = new C1386Yv(c1621dL, o10, interfaceC1370Yf, strA0H, z10 ? XX.REPORT_AD : XX.HIDE_AD);
        c1386Yv.setClickable(true);
        XP.A0K(c1386Yv, -1);
        c1386Yv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1386Yv, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1368Yd
    public final boolean A0R() {
        return false;
    }
}
