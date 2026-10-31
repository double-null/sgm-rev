package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0881Fb extends AbstractRunnableC1308Vt {
    public static byte[] A01;
    public final /* synthetic */ C06013r A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -48, -53, -52, -42, -121, -34, -56, -38, -121, -43, -52, -35, -52, -39, -121, -41, -39, -52, -41, -56, -39, -52, -53};
    }

    public C0881Fb(C06013r c06013r) {
        this.A00 = c06013r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1308Vt
    public final void A07() {
        if (!this.A00.A0E) {
            this.A00.A0R(A00(0, 24, 8));
        }
    }
}
