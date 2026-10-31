package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1908iE extends MR {
    public static byte[] A06;
    public static final String A07;
    public C1910iG A00;
    public V4 A01;
    public boolean A02;
    public final C1621dL A03;
    public final US A04;
    public final AbstractC1395Ze A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C1908iE.class.getSimpleName();
    }

    public C1908iE(C1621dL c1621dL, US us, AbstractC1395Ze abstractC1395Ze, C1694eX c1694eX, MS ms, V4 v10) {
        super(c1621dL, ms, c1694eX);
        this.A04 = us;
        this.A05 = abstractC1395Ze;
        this.A03 = c1621dL;
        this.A01 = v10;
    }

    @Override // com.facebook.ads.redexgen.core.MR
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7G())) {
            this.A03.A0F().A3D();
            AbstractC1108Nw.A02(this.A00.A05(), X0.A00(A04(0, 6, 50)));
            this.A04.AB5(this.A00.A7G(), map);
            if (U7.A19(this.A03)) {
                if (this.A01 == V4.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                W2 w2A00 = W2.A00(this.A03);
                String placementType = this.A00.A7G();
                w2A00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                XJ.A00(new C1909iF(this));
            }
        }
    }

    public final void A0A(C1910iG c1910iG) {
        this.A00 = c1910iG;
    }
}
