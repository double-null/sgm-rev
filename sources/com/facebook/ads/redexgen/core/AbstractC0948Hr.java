package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0948Hr extends RelativeLayout implements Wf {
    public static byte[] A0E;
    public static String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public String A00;
    public boolean A01;
    public final int A02;
    public final AbstractC1693eW A03;
    public final boolean A04;
    public final boolean A05;
    public final AbstractC1896hy A06;
    public final C1621dL A07;
    public final US A08;
    public final C1320Wh A09;
    public final XH A0A;
    public final InterfaceC1352Xn A0B;
    public final YY A0C;
    public final C1694eX A0D;

    public static String A16(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A17() {
        A0E = new byte[]{95, 16, 25, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract ME A1A(String str);

    public abstract void A1D();

    public abstract void A1E();

    public abstract void A1G(boolean z10);

    public abstract void A1H(boolean z10);

    public abstract boolean A1I();

    public abstract boolean A1J();

    public abstract boolean A1K();

    public abstract C1566cR getFullScreenAdStyle();

    static {
        A17();
        A0G = (int) (AbstractC1324Wl.A02 * 80.0f);
    }

    public AbstractC0948Hr(C1621dL c1621dL, YY yy, US us, AbstractC1896hy abstractC1896hy, int i10, boolean z10, boolean z11, InterfaceC1352Xn interfaceC1352Xn, int i11) {
        super(c1621dL);
        this.A0A = new XH();
        this.A01 = false;
        this.A00 = A16(0, 0, 48);
        this.A03 = new C0949Hs(this);
        this.A02 = i10;
        this.A07 = c1621dL;
        this.A05 = z10;
        this.A04 = z11;
        this.A0B = interfaceC1352Xn;
        this.A0C = yy;
        this.A06 = abstractC1896hy;
        this.A08 = us;
        this.A0D = new C1694eX(this, 1, new WeakReference(this.A03), c1621dL);
        this.A0D.A0W(abstractC1896hy.A0i());
        this.A0D.A0X(abstractC1896hy.A0j());
        this.A09 = C1320Wh.A00(this.A07, this.A06, this);
        if (this.A06.A1U()) {
            this.A00 = A15(this.A02, i11);
        }
    }

    public static String A15(int i10, int i11) {
        return A16(4, 3, 9) + (i10 + 1) + A16(0, 4, 50) + i11;
    }

    public void A1B() {
        this.A09.A03();
    }

    public final void A1C() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1F(boolean z10) {
    }

    public AbstractC1896hy getAdDataBundle() {
        return this.A06;
    }

    public C1694eX getAdViewabilityChecker() {
        return this.A0D;
    }

    public XH getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
