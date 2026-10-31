package v8;

import io.bidmachine.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f27267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f27269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y7.f.k f27270o;

    private c0(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f10, int i20, String str, y7.f.k kVar) {
        this.f27256a = list;
        this.f27257b = i10;
        this.f27258c = i11;
        this.f27259d = i12;
        this.f27260e = i13;
        this.f27261f = i14;
        this.f27262g = i15;
        this.f27263h = i16;
        this.f27264i = i17;
        this.f27265j = i18;
        this.f27266k = i19;
        this.f27267l = f10;
        this.f27268m = i20;
        this.f27269n = str;
        this.f27270o = kVar;
    }

    public static c0 a(x7.a0 a0Var) throws ParserException {
        return b(a0Var, false, null);
    }

    private static c0 b(x7.a0 a0Var, boolean z10, y7.f.k kVar) throws ParserException {
        int i10;
        y7.f.g gVarT;
        try {
            if (z10) {
                a0Var.X(4);
            } else {
                a0Var.X(21);
            }
            int iH = a0Var.H() & 3;
            int iH2 = a0Var.H();
            int iF = a0Var.f();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iH2; i13++) {
                a0Var.X(1);
                int iP = a0Var.P();
                for (int i14 = 0; i14 < iP; i14++) {
                    int iP2 = a0Var.P();
                    i12 += iP2 + 4;
                    a0Var.X(iP2);
                }
            }
            a0Var.W(iF);
            byte[] bArr = new byte[i12];
            y7.f.k kVar2 = kVar;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            float f10 = 1.0f;
            String strF = null;
            int i25 = 0;
            int i26 = 0;
            while (i25 < iH2) {
                int iH3 = a0Var.H() & 63;
                int iP3 = a0Var.P();
                int i27 = i11;
                y7.f.k kVarY = kVar2;
                while (i27 < iP3) {
                    int iP4 = a0Var.P();
                    byte[] bArr2 = y7.f.f28694a;
                    int i28 = iH2;
                    System.arraycopy(bArr2, i11, bArr, i26, bArr2.length);
                    int length = i26 + bArr2.length;
                    System.arraycopy(a0Var.e(), a0Var.f(), bArr, length, iP4);
                    if (iH3 == 32 && i27 == 0) {
                        kVarY = y7.f.y(bArr, length, length + iP4);
                        i10 = i11;
                        iP3 = iP3;
                    } else if (iH3 == 33 && i27 == 0) {
                        y7.f.h hVarU = y7.f.u(bArr, length, length + iP4, kVarY);
                        int i29 = hVarU.f28728b + 1;
                        int i30 = hVarU.f28734h;
                        int i31 = hVarU.f28735i;
                        i18 = hVarU.f28731e + 8;
                        i19 = hVarU.f28732f + 8;
                        int i32 = hVarU.f28738l;
                        int i33 = hVarU.f28739m;
                        int i34 = hVarU.f28740n;
                        float f11 = hVarU.f28736j;
                        int i35 = hVarU.f28737k;
                        y7.f.c cVar = hVarU.f28729c;
                        if (cVar != null) {
                            strF = x7.i.f(cVar.f28703a, cVar.f28704b, cVar.f28705c, cVar.f28706d, cVar.f28707e, cVar.f28708f);
                        }
                        i15 = i29;
                        i16 = i30;
                        i10 = 0;
                        i20 = i32;
                        i17 = i31;
                        i24 = i35;
                        f10 = f11;
                        i22 = i34;
                        i21 = i33;
                    } else {
                        iP3 = iP3;
                        if (iH3 != 39 || i27 != 0 || (gVarT = y7.f.t(bArr, length, length + iP4)) == null || kVarY == null) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            i23 = gVarT.f28721d == kVarY.f28747b.get(0).f28699b ? 4 : 5;
                        }
                    }
                    i26 = length + iP4;
                    a0Var.X(iP4);
                    i27++;
                    i11 = i10;
                    iH2 = i28;
                    iP3 = iP3;
                }
                i25++;
                kVar2 = kVarY;
            }
            return new c0(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iH + 1, i15, i16, i17, i18, i19, i20, i21, i22, i23, f10, i24, strF, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw ParserException.b(sb2.toString(), e10);
        }
    }

    public static c0 c(x7.a0 a0Var, y7.f.k kVar) throws ParserException {
        return b(a0Var, true, kVar);
    }
}
