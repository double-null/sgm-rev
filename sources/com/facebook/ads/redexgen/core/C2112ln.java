package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2112ln extends E5<C2112ln> implements Comparable<C2112ln> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2112ln> list, List<C2112ln> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2112ln(int i10, C2264oH c2264oH, int i11, AnonymousClass93 anonymousClass93, int i12, String str) {
        List<String> listA03;
        super(i10, c2264oH, i11);
        int i13 = 0;
        this.A08 = AnonymousClass92.A0S(i12, false);
        int i14 = super.A02.A0H & (~((C2257oA) anonymousClass93).A00);
        this.A06 = (i14 & 1) != 0;
        this.A07 = (i14 & 2) != 0;
        int i15 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (anonymousClass93.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = anonymousClass93.A0K;
        }
        for (int bestLanguageIndex = 0; bestLanguageIndex < listA03.size(); bestLanguageIndex++) {
            int iA02 = AnonymousClass92.A02(super.A02, listA03.get(bestLanguageIndex), anonymousClass93.A0P);
            if (iA02 > 0) {
                i15 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
        }
        this.A00 = i15;
        this.A01 = bestLanguageScore;
        this.A02 = AnonymousClass92.A00(super.A02.A0E, ((C2257oA) anonymousClass93).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (anonymousClass93.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (AnonymousClass92.A0S(i12, anonymousClass93.A0B) && z10) {
            i13 = 1;
        }
        this.A04 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2112ln c2112ln) {
        AbstractC2129m4 abstractC2129m4A06 = AbstractC2129m4.A01().A09(this.A08, c2112ln.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2112ln.A00), AbstractC2277oV.A03().A06()).A06(this.A01, c2112ln.A01).A06(this.A02, c2112ln.A02).A09(this.A06, c2112ln.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2112ln.A07), this.A01 == 0 ? AbstractC2277oV.A03() : AbstractC2277oV.A03().A06()).A06(this.A03, c2112ln.A03);
        if (this.A02 == 0) {
            abstractC2129m4A06 = abstractC2129m4A06.A0A(this.A05, c2112ln.A05);
        }
        return abstractC2129m4A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC0765Am<C2112ln> A02(int i10, C2264oH c2264oH, AnonymousClass93 anonymousClass93, int[] iArr, String str) {
        C05411h c05411hA01 = AbstractC0765Am.A01();
        for (int i11 = 0; i11 < c2264oH.A01; i11++) {
            c05411hA01.A04(new C2112ln(i10, c2264oH, i11, anonymousClass93, iArr[i11], str));
        }
        return c05411hA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.E5
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2112ln c2112ln) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A04;
    }
}
