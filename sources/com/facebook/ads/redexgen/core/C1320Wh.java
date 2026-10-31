package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1320Wh {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1896hy A02;
    public final C1621dL A03;
    public final Wf A04;

    public C1320Wh(C1621dL c1621dL, AbstractC1896hy abstractC1896hy, Wf wf) {
        this.A03 = c1621dL;
        this.A04 = wf;
        this.A02 = abstractC1896hy;
    }

    public static C1320Wh A00(C1621dL c1621dL, AbstractC1896hy abstractC1896hy, Wf wf) {
        Object creativeAsCtaLoggingHelper = c1621dL.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C1320Wh(c1621dL, abstractC1896hy, wf);
            c1621dL.A0P(creativeAsCtaLoggingHelper);
        }
        return (C1320Wh) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C1621dL c1621dL) {
        return U7.A1b(c1621dL) && WN.A0I(c1621dL);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final C1319Wg A02(AbstractC1896hy abstractC1896hy) {
        boolean z10;
        if (U7.A1h(this.A03)) {
            z10 = abstractC1896hy.A1W() && A01(this.A03);
            return new C1319Wg(z10, z10);
        }
        boolean zA1W = abstractC1896hy.A1W();
        if (zA1W) {
            boolean zA01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
            z10 = zA01;
        }
        return new C1319Wg(zA1W, z10);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
