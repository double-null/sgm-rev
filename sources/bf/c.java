package bf;

import af.z;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        t.f(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(z zVar, int i10) {
        t.f(zVar, "<this>");
        int iA = a(zVar.N(), i10 + 1, 0, zVar.U().length);
        return iA >= 0 ? iA : ~iA;
    }
}
