package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1446aV {
    public static float A00(C1075Mp c1075Mp) {
        int height = c1075Mp.A0H().A01();
        int width = c1075Mp.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) (((double) (AbstractC1323Wk.A00().widthPixels - (AbstractC1455ae.A07 * 2))) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = XP.A01(16);
        int ctaTextHeight = AbstractC1426aB.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1455ae.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = AbstractC1323Wk.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC1445aU A03(KE ke2, String str) {
        return new ViewOnClickListenerC1445aU(ke2, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
