package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1676eF {
    public static byte[] A02;
    public final C9V A00;
    public final C2104lf A01 = new C2104lf();

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1676eF(C1621dL c1621dL) {
        EA trackSelectionFactory = new C2130m5(this.A01);
        AnonymousClass92 anonymousClass92 = new AnonymousClass92(trackSelectionFactory);
        C6S loadControl = new C2217nV();
        this.A00 = AbstractC06615z.A00(new C2214nS(c1621dL), anonymousClass92, loadControl, this.A01);
    }

    public static String A01(C2284od c2284od) {
        boolean z10 = c2284od instanceof C9Y;
        String strA00 = A00(36, 2, 118);
        String strA01 = A00(0, 14, 108);
        if (z10) {
            C9Y c9y = (C9Y) c2284od;
            return A00(55, 11, 8) + c9y.A03 + A00(14, 22, 98) + c9y.A02 + strA01 + c9y.getCause() + strA00;
        }
        return A00(41, 14, 99) + c2284od.getMessage() + strA01 + c2284od.getCause() + strA00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7W();
    }

    public final long A07() {
        return this.A00.A7k();
    }

    public final C1674eD A08() {
        C2298or vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C1674eD(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f10) {
        this.A00.A0M(f10);
    }

    public final void A0D(long j10) {
        this.A00.A04(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1595cu c1595cu, Uri uri) {
        if (U7.A2r(c1595cu, A03())) {
            C1680eJ cacheManager = C1680eJ.A06(c1595cu);
            InterfaceC06324w cachedDataSourceFactory = cacheManager.A0H(c1595cu);
            this.A00.A0Q(new AnonymousClass99(cachedDataSourceFactory).A04(uri));
            return;
        }
        CL mediaSource = new AnonymousClass99(new C2232nk(c1595cu, AbstractC06104a.A0j(c1595cu, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1673eC interfaceC1673eC) {
        this.A00.A0O(new CR(this, interfaceC1673eC));
    }

    public final void A0H(final InterfaceC1675eE interfaceC1675eE) {
        this.A00.A0P(new InterfaceC2203nH() { // from class: com.facebook.ads.redexgen.X.27
            @Override // com.facebook.ads.redexgen.core.InterfaceC06194j
            public final void AFq(int i10, int i11, int i12, float f10) {
                interfaceC1675eE.AFq(i10, i11, i12, f10);
            }
        });
    }

    public final void A0I(boolean z10) {
        this.A00.A0S(z10);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
