package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2254o7 implements C1S {
    public final int A00;
    public final C2264oH A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = AbstractC06104a.A0h(0);
    public static final String A09 = AbstractC06104a.A0h(1);
    public static final String A08 = AbstractC06104a.A0h(3);
    public static final String A06 = AbstractC06104a.A0h(4);
    public static final C1R<C2254o7> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.o8
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2254o7.A00(bundle);
        }
    };

    public C2254o7(C2264oH c2264oH, boolean z10, int[] iArr, boolean[] zArr) {
        this.A00 = c2264oH.A01;
        boolean z11 = false;
        C3M.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c2264oH;
        if (z10 && this.A00 > 1) {
            z11 = true;
        }
        this.A02 = z11;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C2254o7 A00(Bundle bundle) {
        C2264oH c2264oH = (C2264oH) C2264oH.A06.A6X((Bundle) C3M.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC1955j1.A00(bundle.getIntArray(A09), new int[c2264oH.A01]);
        boolean[] selected = (boolean[]) AbstractC1955j1.A00(bundle.getBooleanArray(A08), new boolean[c2264oH.A01]);
        return new C2254o7(c2264oH, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2254o7 c2254o7 = (C2254o7) obj;
        if (this.A02 == c2254o7.A02 && this.A01.equals(c2254o7.A01) && Arrays.equals(this.A03, c2254o7.A03) && Arrays.equals(this.A04, c2254o7.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
