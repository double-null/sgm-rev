package u8;

import java.util.ArrayList;
import java.util.zip.Inflater;
import x7.a0;
import x7.l0;
import x7.z;

/* JADX INFO: compiled from: ProjectionDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
final class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayListF;
        a0 a0Var = new a0(bArr);
        try {
            arrayListF = c(a0Var) ? f(a0Var) : e(a0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e(arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListF.get(0), arrayListF.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(a0 a0Var) {
        a0Var.X(4);
        int iQ = a0Var.q();
        a0Var.W(0);
        return iQ == 1886547818;
    }

    private static e.a d(a0 a0Var) {
        int iQ = a0Var.q();
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            fArr[i10] = a0Var.p();
        }
        int iQ2 = a0Var.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iQ) * 2.0d) / dLog);
        z zVar = new z(a0Var.e());
        int i11 = 8;
        zVar.p(a0Var.f() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iQ2) {
            int i15 = 0;
            while (i15 < i12) {
                int iB = iArr[i15] + b(zVar.h(iCeil));
                if (iB >= iQ || iB < 0) {
                    return null;
                }
                fArr2[i14] = fArr[iB];
                iArr[i15] = iB;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        zVar.p((zVar.e() + 7) & (-8));
        int i16 = 32;
        int iH = zVar.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i17 = 0;
        while (i17 < iH) {
            int iH2 = zVar.h(i11);
            int iH3 = zVar.h(i11);
            int iH4 = zVar.h(i16);
            if (iH4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iQ2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i18 = 0; i18 < iH4; i18++) {
                iB2 += b(zVar.h(iCeil2));
                if (iB2 < 0 || iB2 >= iQ2) {
                    return null;
                }
                int i19 = i18 * 3;
                int i20 = iB2 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i18 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
            }
            bVarArr[i17] = new e.b(iH2, fArr3, fArr4, iH3);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(a0 a0Var) {
        if (a0Var.H() != 0) {
            return null;
        }
        a0Var.X(7);
        int iQ = a0Var.q();
        if (iQ == 1684433976) {
            a0 a0Var2 = new a0();
            Inflater inflater = new Inflater(true);
            try {
                if (!l0.B0(a0Var, a0Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                a0Var = a0Var2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return g(a0Var);
    }

    private static ArrayList<e.a> f(a0 a0Var) {
        int iQ;
        a0Var.X(8);
        int iF = a0Var.f();
        int iG = a0Var.g();
        while (iF < iG && (iQ = a0Var.q() + iF) > iF && iQ <= iG) {
            int iQ2 = a0Var.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                a0Var.V(iQ);
                return e(a0Var);
            }
            a0Var.W(iQ);
            iF = iQ;
        }
        return null;
    }

    private static ArrayList<e.a> g(a0 a0Var) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int iF = a0Var.f();
        int iG = a0Var.g();
        while (iF < iG) {
            int iQ = a0Var.q() + iF;
            if (iQ <= iF || iQ > iG) {
                return null;
            }
            if (a0Var.q() == 1835365224) {
                e.a aVarD = d(a0Var);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            a0Var.W(iQ);
            iF = iQ;
        }
        return arrayList;
    }
}
