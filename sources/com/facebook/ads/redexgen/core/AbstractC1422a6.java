package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1422a6 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0g] */
    public static C05140g A00(final C1459ai c1459ai, final C1164Qc c1164Qc, final String str, final C06545s c06545s) {
        final boolean z10 = true;
        return new C06435h(c1459ai, c1164Qc, z10, str, c06545s) { // from class: com.facebook.ads.redexgen.X.0g
            public KE A00;
            public C1588cn A01;
            public final US A02 = this.A0I.A06().A02().A0A();
            public final C1164Qc A03;
            public final C06545s A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC1324Wl.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC1324Wl.A02 * 6.0f);

            {
                this.A03 = c1164Qc;
                this.A05 = str;
                this.A04 = c06545s;
                this.A03.A1L(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0974Ir
            public void setupNativeCtaExtension(C1588cn c1588cn) {
                N3 n3A21;
                this.A01 = c1588cn;
                int iA0Q = U7.A0Q(this.A0I.A06());
                C1084My c1084MyA01 = this.A03.A10().A1z().A01();
                C1621dL c1621dLA06 = this.A0I.A06();
                String strA0r = this.A03.A10().A0r();
                US us = this.A02;
                InterfaceC1352Xn dummyListener = C1393Zc.getDummyListener();
                C1694eX c1694eXA0b = this.A04.A0b();
                XH xhA1A = this.A03.A1A();
                if (this.A03.A10() == null) {
                    n3A21 = null;
                } else {
                    n3A21 = this.A03.A10().A21();
                }
                this.A00 = new KE(c1621dLA06, strA0r, c1084MyA01, us, dummyListener, c1694eXA0b, xhA1A, n3A21);
                this.A00.setCta(c1588cn.A03().A0J(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0Q == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    XP.A0N(this.A00, A07, 5, c1084MyA01.A0A(false));
                    ((C06435h) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0Q == 2) {
                    layoutParams.addRule(3, ((C06435h) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C06435h) this).A06.bringToFront();
                }
            }
        };
    }
}
