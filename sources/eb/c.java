package eb;

import android.graphics.Bitmap;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import od.h;
import od.k;
import pb.p;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p algorithmParams) {
        super(algorithmParams);
        t.f(algorithmParams, "algorithmParams");
    }

    private final float h(Bitmap bitmap) {
        float f10;
        float f11;
        h hVarN = k.n(0, bitmap.getWidth());
        h hVarN2 = k.n(0, bitmap.getHeight());
        int iH = b0.H(hVarN) * b0.H(hVarN2);
        int[] iArr = new int[bitmap.getWidth()];
        int iA = hVarN2.a();
        int iC = hVarN2.c();
        if (iA <= iC) {
            int i10 = iA;
            f10 = 0.0f;
            f11 = 0.0f;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iA2 = hVarN.a();
                int iC2 = hVarN.c();
                if (iA2 <= iC2) {
                    while (true) {
                        float fA = a(iArr[iA2]);
                        f10 += fA;
                        f11 += fA * fA;
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
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float f12 = iH;
        float f13 = f10 / f12;
        float f14 = (f11 / f12) - (f13 * f13);
        if (f14 < 0.0f) {
            return 0.0f;
        }
        return (float) Math.sqrt(f14);
    }

    @Override // eb.a
    public Boolean c(Bitmap image) {
        t.f(image, "image");
        float fH = h(image);
        boolean z10 = fH <= d().a();
        e(Float.valueOf(fH), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
