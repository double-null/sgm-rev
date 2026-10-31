package v8;

import io.bidmachine.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f27281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27282l;

    private d(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f27271a = list;
        this.f27272b = i10;
        this.f27273c = i11;
        this.f27274d = i12;
        this.f27275e = i13;
        this.f27276f = i14;
        this.f27277g = i15;
        this.f27278h = i16;
        this.f27279i = i17;
        this.f27280j = i18;
        this.f27281k = f10;
        this.f27282l = str;
    }

    private static byte[] a(x7.a0 a0Var) {
        int iP = a0Var.P();
        int iF = a0Var.f();
        a0Var.X(iP);
        return x7.i.g(a0Var.e(), iF, iP);
    }

    public static d b(x7.a0 a0Var) throws ParserException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        String strD;
        int i17;
        try {
            a0Var.X(4);
            int iH = (a0Var.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = a0Var.H() & 31;
            for (int i18 = 0; i18 < iH2; i18++) {
                arrayList.add(a(a0Var));
            }
            int iH3 = a0Var.H();
            for (int i19 = 0; i19 < iH3; i19++) {
                arrayList.add(a(a0Var));
            }
            if (iH2 > 0) {
                y7.f.m mVarC = y7.f.C((byte[]) arrayList.get(0), y7.f.f28694a.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarC.f28759f;
                int i21 = mVarC.f28760g;
                int i22 = mVarC.f28762i + 8;
                int i23 = mVarC.f28763j + 8;
                int i24 = mVarC.f28770q;
                int i25 = mVarC.f28771r;
                int i26 = mVarC.f28772s;
                int i27 = mVarC.f28773t;
                float f11 = mVarC.f28761h;
                strD = x7.i.d(mVarC.f28754a, mVarC.f28755b, mVarC.f28756c);
                i16 = i26;
                i17 = i27;
                f10 = f11;
                i13 = i23;
                i14 = i24;
                i15 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                f10 = 1.0f;
                strD = null;
                i17 = 16;
            }
            return new d(arrayList, iH, i10, i11, i12, i13, i14, i15, i16, i17, f10, strD);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.b("Error parsing AVC config", e10);
        }
    }
}
