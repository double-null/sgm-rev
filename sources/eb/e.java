package eb;

import android.graphics.Bitmap;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import od.h;
import od.k;
import pb.p;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p algorithmParams) {
        super(algorithmParams);
        t.f(algorithmParams, "algorithmParams");
    }

    private final float h(int i10, int i11) {
        float fZ = d0.z(i10) - d0.z(i11);
        float fQ = d0.q(i10) - d0.q(i11);
        float fA = d0.a(i10) - d0.a(i11);
        return (float) Math.sqrt((fZ * fZ) + (fQ * fQ) + (fA * fA));
    }

    private final Float i(Bitmap bitmap, float f10) {
        h hVarN = k.n(1, bitmap.getWidth() - 1);
        h hVarN2 = k.n(1, bitmap.getHeight() - 1);
        int iH = b0.H(hVarN) * b0.H(hVarN2);
        if (iH <= 0) {
            return null;
        }
        int[] iArr = new int[bitmap.getWidth()];
        float[] fArr = new float[bitmap.getWidth()];
        float f11 = iH;
        float f12 = f10 * f11;
        int iA = hVarN2.a();
        int iC = hVarN2.c();
        int i10 = 0;
        if (iA <= iC) {
            int i11 = 0;
            int i12 = iA;
            while (true) {
                int i13 = i12;
                int i14 = iC;
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i12, bitmap.getWidth(), 1);
                int iA2 = hVarN.a();
                int iC2 = hVarN.c();
                if (iA2 <= iC2) {
                    Float f13 = null;
                    while (true) {
                        int iF = f(iArr[iA2]);
                        int iB = b(bitmap, iA2, i13 - 1);
                        int iB2 = b(bitmap, iA2, i13 + 1);
                        float fH = i13 == 1 ? h(iF, iB) : fArr[iA2];
                        float fH2 = h(iF, iB2);
                        fArr[iA2] = fH2;
                        if (fH + fH2 > 0.2d) {
                            i11++;
                        } else {
                            int iB3 = b(bitmap, iA2 - 1, i13);
                            int iB4 = b(bitmap, iA2 + 1, i13);
                            float fFloatValue = f13 != null ? f13.floatValue() : h(iF, iB3);
                            float fH3 = h(iF, iB4);
                            Float fValueOf = Float.valueOf(fH3);
                            if (fFloatValue + fH3 > 0.2d) {
                                f13 = fValueOf;
                                i11++;
                            } else {
                                f13 = fValueOf;
                            }
                        }
                        int i15 = i11;
                        if (i15 <= f12) {
                            if (iA2 == iC2) {
                                i11 = i15;
                                break;
                            }
                            iA2++;
                            i11 = i15;
                        } else {
                            return Float.valueOf(1.0f);
                        }
                    }
                }
                if (i13 != i14) {
                    i12 = i13 + 1;
                    iC = i14;
                } else {
                    i10 = i11;
                }
            }
        }
        return Float.valueOf(i10 / f11);
    }

    @Override // eb.a
    public Boolean c(Bitmap image) {
        Boolean boolValueOf;
        t.f(image, "image");
        Float fI = i(image, d().a());
        if (fI != null) {
            boolValueOf = Boolean.valueOf(fI.floatValue() <= d().a());
        } else {
            boolValueOf = null;
        }
        e(fI, boolValueOf);
        return boolValueOf;
    }
}
