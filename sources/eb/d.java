package eb;

import android.graphics.Bitmap;
import java.util.HashMap;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import od.h;
import od.k;
import pb.p;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p algorithmParams) {
        super(algorithmParams);
        t.f(algorithmParams, "algorithmParams");
    }

    private final float h(Bitmap bitmap, float f10) {
        int i10;
        int i11;
        int i12 = 0;
        h hVarN = k.n(0, bitmap.getWidth());
        h hVarN2 = k.n(0, bitmap.getHeight());
        int iH = b0.H(hVarN) * b0.H(hVarN2);
        int[] iArr = new int[bitmap.getWidth()];
        int iA = hVarN2.a();
        int iC = hVarN2.c();
        if (iA <= iC) {
            int i13 = 0;
            int i14 = 0;
            int i15 = iA;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i15, bitmap.getWidth(), 1);
                int iA2 = hVarN.a();
                int iC2 = hVarN.c();
                if (iA2 <= iC2) {
                    int i16 = i14;
                    while (true) {
                        int i17 = iArr[iA2];
                        if (i13 == 0) {
                            i16 = i17;
                            i13 = 1;
                        } else {
                            i13 = i17 == i16 ? i13 + 1 : i13 - 1;
                        }
                        if (iA2 == iC2) {
                            break;
                        }
                        iA2++;
                    }
                    i14 = i16;
                }
                if (i15 == iC) {
                    break;
                }
                i15++;
            }
            i10 = i13;
            i11 = i14;
        } else {
            i10 = 0;
            i11 = 0;
        }
        float f11 = iH;
        if (i10 < ((2 * f10) - 1) * f11) {
            return 0.0f;
        }
        int iA3 = hVarN2.a();
        int iC3 = hVarN2.c();
        if (iA3 <= iC3) {
            int i18 = iA3;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i18, bitmap.getWidth(), 1);
                int iA4 = hVarN.a();
                int iC4 = hVarN.c();
                if (iA4 <= iC4) {
                    while (true) {
                        if (iArr[iA4] == i11) {
                            i12++;
                        }
                        if (iA4 == iC4) {
                            break;
                        }
                        iA4++;
                    }
                }
                if (i18 == iC3) {
                    break;
                }
                i18++;
            }
        }
        return i12 / f11;
    }

    private final float i(Bitmap bitmap) {
        h hVarN = k.n(0, bitmap.getWidth());
        h hVarN2 = k.n(0, bitmap.getHeight());
        int iH = b0.H(hVarN) * b0.H(hVarN2);
        int[] iArr = new int[bitmap.getWidth()];
        HashMap map = new HashMap();
        int iA = hVarN2.a();
        int iC = hVarN2.c();
        if (iA <= iC) {
            int i10 = iA;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iA2 = hVarN.a();
                int iC2 = hVarN.c();
                if (iA2 <= iC2) {
                    while (true) {
                        int i11 = iArr[iA2];
                        Integer numValueOf = Integer.valueOf(i11);
                        Integer num = (Integer) map.get(Integer.valueOf(i11));
                        map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        if (iA2 == iC2) {
                            break;
                        }
                        iA2++;
                    }
                }
                if (i10 == iC) {
                    break;
                }
                i10++;
            }
        }
        Integer num2 = (Integer) b0.Z(map.values());
        return (num2 != null ? num2.intValue() : 0) / iH;
    }

    @Override // eb.a
    public Boolean c(Bitmap image) {
        t.f(image, "image");
        float fA = d().a();
        float fH = fA > 0.5f ? h(image, fA) : i(image);
        boolean z10 = fH >= fA;
        e(Float.valueOf(fH), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
