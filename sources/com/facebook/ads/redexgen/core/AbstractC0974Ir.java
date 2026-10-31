package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0974Ir extends AbstractC1455ae {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, 127, 106, 98, 103, 120};
    }

    public abstract void A1P();

    public abstract void A1Q();

    public abstract void A1R();

    public abstract boolean A1S();

    public abstract boolean A1T();

    public AbstractC0974Ir(C1459ai c1459ai, boolean z10) {
        super(c1459ai, z10);
        if (U7.A17(c1459ai.A06())) {
            if (c1459ai.A0C() != null) {
                c1459ai.A0C().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1O() {
        if (U7.A17(this.A06.A06()) && this.A06.A0C() != null) {
            this.A06.A0C().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1455ae
    public KE getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(AbstractC1412Zv abstractC1412Zv) {
        if (U7.A17(this.A06.A06()) && abstractC1412Zv != null) {
            abstractC1412Zv.setOnClickListener(AbstractC1446aV.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C1588cn c1588cn) {
    }
}
