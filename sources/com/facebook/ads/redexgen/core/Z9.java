package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C1621dL c1621dL, final C1264Ua c1264Ua, final AbstractC1896hy abstractC1896hy, final InterfaceC1352Xn interfaceC1352Xn, final Z5 z10, Handler handler, Z6 z11) {
        c1621dL.A0F().AAv(z10.name().toLowerCase(Locale.US));
        return abstractC1896hy.A2F() ? new Z4(c1621dL, handler, z11, abstractC1896hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1621dL c1621dL2 = c1621dL;
                C1264Ua c1264Ua2 = c1264Ua;
                InterfaceC1352Xn interfaceC1352Xn2 = interfaceC1352Xn;
                Z5 z12 = z10;
                AbstractC1896hy abstractC1896hy2 = abstractC1896hy;
                Z9.A04(c1621dL2, c1264Ua2, interfaceC1352Xn2, z12, abstractC1896hy2.A25(), abstractC1896hy2.A23());
            }
        }) : new ZA(c1621dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1621dL c1621dL2 = c1621dL;
                C1264Ua c1264Ua2 = c1264Ua;
                InterfaceC1352Xn interfaceC1352Xn2 = interfaceC1352Xn;
                Z5 z12 = z10;
                AbstractC1896hy abstractC1896hy2 = abstractC1896hy;
                Z9.A04(c1621dL2, c1264Ua2, interfaceC1352Xn2, z12, abstractC1896hy2.A25(), abstractC1896hy2.A23());
            }
        });
    }

    public static ImageView A01(C1621dL c1621dL, C1264Ua c1264Ua, AbstractC1896hy abstractC1896hy, Z5 z10, InterfaceC1352Xn interfaceC1352Xn, Handler handler) {
        return A00(c1621dL, c1264Ua, abstractC1896hy, interfaceC1352Xn, z10, handler, Z6.A03);
    }

    public static void A04(C1621dL c1621dL, C1264Ua c1264Ua, InterfaceC1352Xn interfaceC1352Xn, Z5 z10, String str, N9 n10) {
        if (c1264Ua != null) {
            c1264Ua.A04(UZ.A0A, null);
        }
        c1621dL.A0F().AAu(z10.name().toLowerCase(Locale.US));
        if (O3.A00(c1621dL.A02()).A0O(c1621dL.A02(), true)) {
            interfaceC1352Xn.AAf(str, n10);
        } else {
            if (TextUtils.isEmpty(n10.A00())) {
                return;
            }
            WN.A0O(new WN(), c1621dL, WQ.A00(n10.A00()), str);
        }
    }
}
