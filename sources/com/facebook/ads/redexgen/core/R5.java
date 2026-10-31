package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class R5 {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final R0 A01;
    public final C1621dL A02;
    public final US A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1037Lc A06() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 == null) {
            return null;
        }
        LY ly = new LY();
        return new C1037Lc(this.A02, this.A03, new C1780fw(this.A01), anonymousClass77A02, null, ly, A0K(ly, anonymousClass77A02));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1037Lc A07() {
        AnonymousClass73 anonymousClass73A03 = A03();
        if (anonymousClass73A03 == null) {
            return null;
        }
        LX lx = new LX();
        return new C1037Lc(this.A02, this.A03, new C6P(this.A01), anonymousClass73A03, anonymousClass73A03.A1A(), lx, A0K(lx, anonymousClass73A03));
    }

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 124, 115, 102, 123, 100, 119, 83, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 106, 118, 123, 121, 127, 119, 127, 116, 110, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, Utf8.REPLACEMENT_BYTE, 20, 9, 13, 5, Utf8.REPLACEMENT_BYTE, 16, 15, 12, 12, 9, 14, 7, Utf8.REPLACEMENT_BYTE, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0M();
    }

    public R5(R0 r10, Intent intent, US us, C1621dL c1621dL) {
        this.A01 = r10;
        this.A00 = intent;
        this.A03 = us;
        this.A02 = c1621dL;
    }

    private AbstractC1896hy A00() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(68, 18, 41);
        if (i10 >= 33) {
            return (AbstractC1896hy) this.A00.getSerializableExtra(strA0L, AbstractC1896hy.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC1896hy) intent.getSerializableExtra(strA0L);
    }

    private C1894hw A01() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(26, 19, 47);
        if (i10 >= 33) {
            return (C1894hw) this.A00.getSerializableExtra(strA0L, C1894hw.class);
        }
        return (C1894hw) this.A00.getSerializableExtra(strA0L);
    }

    private AnonymousClass77 A02() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(2, 14, 94);
        if (i10 >= 33) {
            return (AnonymousClass77) this.A00.getSerializableExtra(strA0L, AnonymousClass77.class);
        }
        return (AnonymousClass77) this.A00.getSerializableExtra(strA0L);
    }

    private AnonymousClass73 A03() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(95, 25, 105);
        if (i10 >= 33) {
            return (AnonymousClass73) this.A00.getSerializableExtra(strA0L, AnonymousClass73.class);
        }
        return (AnonymousClass73) this.A00.getSerializableExtra(strA0L);
    }

    private InterfaceC1353Xo A05() {
        if (U7.A2o(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0L(45, 23, 126));
            R0 r10 = this.A01;
            C1621dL c1621dL = this.A02;
            US us = this.A03;
            C1780fw c1780fw = new C1780fw(this.A01);
            Intent intent = this.A00;
            String clickDelayMs = A0L(16, 10, 115);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0L(0, 2, 117);
            }
            int i10 = Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new C6H(r10, c1621dL, us, c1780fw, stringExtra2, i10);
        }
        return new OD(this.A01, this.A02, this.A03, new C1780fw(this.A01));
    }

    private final C1036Lb A08() {
        return new C1036Lb(this.A02, this.A01);
    }

    private LZ A09(RelativeLayout relativeLayout) {
        LZ lz = new LZ(this.A02, new C1779fv(this), this.A03, new C1780fw(this.A01));
        lz.A05(relativeLayout);
        lz.A04(this.A00.getIntExtra(A0L(120, 27, 91), 200));
        XP.A0K(relativeLayout, -16777216);
        return lz;
    }

    private C5K A0A() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 == null) {
            return null;
        }
        return new C5K(this.A02, this.A03, new C1780fw(this.A01), anonymousClass77A02, new LY(), 1);
    }

    private C5K A0B() {
        AnonymousClass73 anonymousClass73A03 = A03();
        if (anonymousClass73A03 == null) {
            return null;
        }
        return new C5K(this.A02, this.A03, new C1780fw(this.A01), anonymousClass73A03, new LX(), 0);
    }

    private IG A0C() {
        C1532bt c1532btA02;
        AbstractC1896hy abstractC1896hyA00 = A00();
        if (abstractC1896hyA00 == null || (c1532btA02 = AbstractC1533bu.A02(abstractC1896hyA00.A17())) == null) {
            return null;
        }
        return new IG(this.A02, new C1780fw(this.A01), c1532btA02, abstractC1896hyA00.A25());
    }

    private C0904Fy A0D(EnumC1291Vb enumC1291Vb) {
        YY lx;
        InterfaceC1352Xn c6p;
        C1894hw c1894hwA01 = A01();
        if (c1894hwA01 == null) {
            return null;
        }
        if (enumC1291Vb == EnumC1291Vb.A04) {
            lx = new LY();
            c6p = new C1780fw(this.A01);
        } else {
            lx = new LX();
            c6p = new C6P(this.A01);
        }
        return new C0904Fy(this.A02, lx, this.A03, c1894hwA01, new SF(this.A02), c6p);
    }

    private C4H A0E() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 != null) {
            return new C4H(this.A02, new LY(), this.A03, anonymousClass77A02, new SF(this.A02), new C1780fw(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C06013r A0F() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 == null) {
            return null;
        }
        return new C06013r(this.A02, new LY(), this.A03, anonymousClass77A02, new SF(this.A02), new C1780fw(this.A01));
    }

    private C06013r A0G() {
        AnonymousClass73 anonymousClass73A03 = A03();
        if (anonymousClass73A03 == null) {
            return null;
        }
        return new C06013r(this.A02, new LX(), this.A03, anonymousClass73A03, new SF(this.A02), new C6P(this.A01));
    }

    private FL A0H() {
        AnonymousClass73 anonymousClass73A03;
        AnonymousClass73 anonymousClass73A04 = A03();
        if (anonymousClass73A04 == null || (anonymousClass73A03 = A03()) == null) {
            return null;
        }
        return new FL(this.A02, this.A03, anonymousClass73A04, anonymousClass73A03, new C6P(this.A01), this.A01);
    }

    private C06003q A0I() {
        AnonymousClass77 dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A1G(this.A01.A08());
        return new C06003q(this.A02, this.A03, new SF(this.A02), new C1780fw(this.A01), dataBundle);
    }

    private C06003q A0J() {
        AnonymousClass73 dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A1G(this.A01.A08());
        return new C06003q(this.A02, this.A03, new SF(this.A02), new C1780fw(this.A01), dataBundle);
    }

    private C1600cz A0K(YY yy, AbstractC1896hy abstractC1896hy) {
        NB nbA07 = abstractC1896hy.A20().A0H().A07();
        if (nbA07 == null || !nbA07.A0M()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(A0L(86, 9, 33), yy.A8d());
        return new C1600cz(this.A02, abstractC1896hy, nbA07, this.A03, null, map);
    }

    public final InterfaceC1353Xo A0N(EnumC1291Vb enumC1291Vb, RelativeLayout relativeLayout) {
        if (enumC1291Vb == null) {
            return null;
        }
        switch (R4.A00[enumC1291Vb.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                C06013r c06013rA0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return c06013rA0F;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return c06013rA0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                C5K c5kA0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return c5kA0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(enumC1291Vb);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
