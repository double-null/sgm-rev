package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import androidx.core.util.Preconditions;
import com.applovin.shadow.okio.Utf8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1H implements A6 {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC2342pr A01;
    public final InterfaceC2341pq A02;
    public final C2334pi A03;
    public final C2334pi A04;
    public final List<Rect> A05;
    public final Map<String, C2333ph> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, 16, 27, 9, 45, 29, 31, 16, 61, 38, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, 11, 25, Utf8.REPLACEMENT_BYTE, 8, 29, 2, 31, 25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.A6
    public final void A6H(List<C2345pu<?, ?>> list) {
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            new C2331pf(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
            throw new NullPointerException(A02(143, 7, 55));
        }
    }

    static {
        A03();
        A0B = C1H.class.getSimpleName();
    }

    public C1H(InterfaceC2341pq interfaceC2341pq) {
        this(interfaceC2341pq, false, false);
    }

    public C1H(InterfaceC2341pq interfaceC2341pq, boolean z10, boolean z11) {
        this.A06 = new HashMap();
        this.A04 = new C2334pi();
        this.A03 = new C2334pi();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC2341pq;
        this.A08 = z10;
        this.A07 = z11;
    }

    public static Rect A00(C2333ph c2333ph) {
        if (c2333ph == null || c2333ph.A02.top == Integer.MIN_VALUE || c2333ph.A02.left == Integer.MIN_VALUE || c2333ph.A02.right == Integer.MIN_VALUE || c2333ph.A02.bottom == Integer.MIN_VALUE) {
            throw new IllegalStateException(A02(0, 143, 9));
        }
        return c2333ph.A02;
    }

    private C2333ph A01(C2345pu c2345pu, Rect rect, Rect rect2) {
        C2333ph c2333phA03 = this.A06.get(c2345pu.A02);
        if (this.A04.A06(c2345pu)) {
            if (c2333phA03 != null) {
                c2333phA03.A01 = EnumC2337pl.A04;
            } else {
                c2333phA03 = C2333ph.A03(this.A00);
                this.A06.put(c2345pu.A02, c2333phA03);
            }
        }
        C2333ph viewProperties = (C2333ph) Preconditions.checkNotNull(c2333phA03);
        viewProperties.A02.set(rect2);
        c2333phA03.A03.add(new Rect(rect));
        return c2333phA03;
    }

    private void A04(C2334pi c2334pi) {
        for (C2345pu c2345pu : c2334pi.A01()) {
            C2333ph c2333ph = this.A06.get(c2345pu.A02);
            if (c2333ph == null) {
                if (0 != 0) {
                    String str = A02(150, 36, 26) + c2345pu.A02;
                    throw new NullPointerException(A02(186, 10, 36));
                }
            } else {
                c2333ph.A01 = EnumC2337pl.A03;
                c2333ph.A03.clear();
                if (A07(c2345pu)) {
                    c2345pu.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c2333ph);
                }
            }
        }
    }

    private void A05(C2334pi c2334pi) {
        for (C2345pu visible : c2334pi.A00()) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A06(List<C2345pu<?, ?>> list) {
        for (C2345pu<?, ?> c2345pu : list) {
            if (this.A06.get(c2345pu.A02) != null) {
                boolean z10 = c2345pu.A04;
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[7] = "nPwsVC";
                if (z10) {
                    EnumC2337pl enumC2337pl = c2345pu.A01;
                    String[] strArr = A0A;
                    if (strArr[5].length() != strArr[6].length()) {
                        A0A[0] = "zj";
                        if (enumC2337pl != null) {
                            if (c2345pu.A01 != EnumC2337pl.A03) {
                                c2345pu.A03(this);
                            }
                        }
                    } else {
                        String[] strArr2 = A0A;
                        strArr2[4] = "4Gl";
                        strArr2[2] = "t26";
                        if (enumC2337pl != null) {
                            if (c2345pu.A01 != EnumC2337pl.A03) {
                                c2345pu.A03(this);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(C2345pu<?, ?> c2345pu) {
        if (c2345pu.A04) {
            EnumC2346pv enumC2346pv = c2345pu.A00;
            EnumC2346pv enumC2346pv2 = EnumC2346pv.A04;
            String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC2346pv == enumC2346pv2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    @Override // com.facebook.ads.redexgen.core.A6
    public final void A3y(C2345pu c2345pu, Rect rect, Rect rect2, boolean z10) {
        EnumC2337pl enumC2337pl;
        A01(c2345pu, rect, rect2);
        C2345pu c2345pu2 = c2345pu.A05;
        C2345pu parentViewpointData = C2345pu.A0B;
        if (c2345pu2 == parentViewpointData || c2345pu2 == null) {
            return;
        }
        boolean zA06 = this.A03.A06(c2345pu2);
        C2333ph c2333phA03 = this.A06.get(c2345pu2.A02);
        if (zA06) {
            if (c2333phA03 == null) {
                c2333phA03 = C2333ph.A03(this.A00);
                c2333phA03.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(c2345pu2.A02, c2333phA03);
            } else {
                c2333phA03.A03.clear();
                if (this.A07) {
                    boolean zA04 = c2345pu2.A04();
                    if (A0A[0].length() != 2) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[5] = "H54AceamXdthsYm78mtSydojeY2Fx6Sn";
                    strArr[6] = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq";
                    if (zA04) {
                        enumC2337pl = EnumC2337pl.A04;
                        if (A0A[7].length() != 26) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                        strArr2[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                        c2333phA03.A01 = enumC2337pl;
                    }
                } else {
                    enumC2337pl = EnumC2337pl.A04;
                    if (A0A[7].length() != 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0A;
                    strArr3[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                    strArr3[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                    c2333phA03.A01 = enumC2337pl;
                }
            }
            if (z10) {
                c2333phA03.A02.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        } else if (z10 && c2333phA03 != null) {
            c2333phA03.A02.set(Math.min(rect2.left, c2333phA03.A02.left), Math.min(rect2.top, c2333phA03.A02.top), Math.max(rect2.right, c2333phA03.A02.right), Math.max(rect2.bottom, c2333phA03.A02.bottom));
        }
        Preconditions.checkNotNull(c2333phA03);
        ((List) Preconditions.checkNotNull(c2333phA03.A03)).add(new Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final void A4Z(long j10, List<Rect> list) {
        this.A00 = j10;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (zHasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                Iterator it2 = this.A04.A01().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C2345pu) it2.next()).A02);
                    } else {
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C2345pu) it2.next()).A02);
                    }
                }
                Collection<C2345pu> collectionA01 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C2345pu viewpointData : collectionA01) {
                    this.A06.remove(viewpointData.A02);
                }
                Iterator<C2333ph> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    it3.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2336pk
    public final void A85(C2345pu c2345pu, Rect rect) {
        rect.setEmpty();
        Iterator it = ((C2333ph) Preconditions.checkNotNull(this.A06.get(c2345pu.A02))).A03.iterator();
        while (it.hasNext()) {
            rect.union((Rect) it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2336pk
    public final EnumC2337pl A9M(C2345pu c2345pu) {
        EnumC2337pl enumC2337pl = ((C2333ph) Preconditions.checkNotNull(this.A06.get(c2345pu.A02))).A01;
        if (c2345pu.A04) {
            if (c2345pu.A00 == EnumC2346pv.A04) {
                EnumC2337pl viewState = EnumC2337pl.A03;
                return viewState;
            }
            EnumC2337pl viewState2 = EnumC2337pl.A04;
            if (enumC2337pl == viewState2 && !c2345pu.A04()) {
                EnumC2337pl viewState3 = EnumC2337pl.A02;
                return viewState3;
            }
        }
        return enumC2337pl;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2336pk
    public final void A9O(Rect rect) {
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2336pk
    public final float A9P(C2345pu c2345pu) {
        C2333ph c2333ph = this.A06.get(c2345pu.A02);
        if (c2333ph != null) {
            Rect rectA00 = A00(c2333ph);
            int iHeight = rectA00.height() * rectA00.width();
            int totalVisibleArea = 0;
            for (Rect rect : c2333ph.A03) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / iHeight;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final void AJA(InterfaceC2342pr interfaceC2342pr) {
        this.A01 = interfaceC2342pr;
    }
}
