package q8;

import android.util.Pair;
import b8.y;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.i2;
import java.util.Arrays;
import java.util.Objects;
import n8.x;
import u7.d0;
import u7.e0;
import x7.l0;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f24601c;

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f24603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f24604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x[] f24605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f24606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f24607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final x f24608g;

        a(String[] strArr, int[] iArr, x[] xVarArr, int[] iArr2, int[][][] iArr3, x xVar) {
            this.f24603b = strArr;
            this.f24604c = iArr;
            this.f24605d = xVarArr;
            this.f24607f = iArr3;
            this.f24606e = iArr2;
            this.f24608g = xVar;
            this.f24602a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f24605d[i10].b(i11).f26054a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f24605d[i10].b(i11).a(iArr[i12]).f26252o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, i2.u(this.f24607f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f24606e[i10]) : iMin;
        }

        public int c(int i10, int i11, int i12) {
            return this.f24607f[i10][i11][i12];
        }

        public int d() {
            return this.f24602a;
        }

        public int e(int i10) {
            return this.f24604c[i10];
        }

        public x f(int i10) {
            return this.f24605d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return i2.S(c(i10, i11, i12));
        }

        public x h() {
            return this.f24608g;
        }
    }

    private static int n(i2[] i2VarArr, e0 e0Var, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = i2VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < i2VarArr.length; i11++) {
            i2 i2Var = i2VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < e0Var.f26054a; i12++) {
                iMax = Math.max(iMax, i2.S(i2Var.a(e0Var.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] o(i2 i2Var, e0 e0Var) throws ExoPlaybackException {
        int[] iArr = new int[e0Var.f26054a];
        for (int i10 = 0; i10 < e0Var.f26054a; i10++) {
            iArr[i10] = i2Var.a(e0Var.a(i10));
        }
        return iArr;
    }

    private static int[] p(i2[] i2VarArr) throws ExoPlaybackException {
        int length = i2VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = i2VarArr[i10].N();
        }
        return iArr;
    }

    @Override // q8.v
    public final void i(Object obj) {
        this.f24601c = (a) obj;
    }

    @Override // q8.v
    public final w k(i2[] i2VarArr, x xVar, io.bidmachine.media3.exoplayer.source.r.b bVar, d0 d0Var) throws ExoPlaybackException {
        int[] iArr = new int[i2VarArr.length + 1];
        int length = i2VarArr.length + 1;
        e0[][] e0VarArr = new e0[length][];
        int[][][] iArr2 = new int[i2VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = xVar.f22837a;
            e0VarArr[i10] = new e0[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrP = p(i2VarArr);
        for (int i12 = 0; i12 < xVar.f22837a; i12++) {
            e0 e0VarB = xVar.b(i12);
            int iN = n(i2VarArr, e0VarB, iArr, e0VarB.f26056c == 5);
            int[] iArrO = iN == i2VarArr.length ? new int[e0VarB.f26054a] : o(i2VarArr[iN], e0VarB);
            int i13 = iArr[iN];
            e0VarArr[iN][i13] = e0VarB;
            iArr2[iN][i13] = iArrO;
            iArr[iN] = i13 + 1;
        }
        x[] xVarArr = new x[i2VarArr.length];
        String[] strArr = new String[i2VarArr.length];
        int[] iArr3 = new int[i2VarArr.length];
        for (int i14 = 0; i14 < i2VarArr.length; i14++) {
            int i15 = iArr[i14];
            xVarArr[i14] = new x((e0[]) l0.Y0(e0VarArr[i14], i15));
            iArr2[i14] = (int[][]) l0.Y0(iArr2[i14], i15);
            strArr[i14] = i2VarArr[i14].getName();
            iArr3[i14] = i2VarArr[i14].g();
        }
        a aVar = new a(strArr, iArr3, xVarArr, iArrP, iArr2, new x((e0[]) l0.Y0(e0VarArr[i2VarArr.length], iArr[i2VarArr.length])));
        Pair<y[], q[]> pairQ = q(aVar, iArr2, iArrP, bVar, d0Var);
        return new w((y[]) pairQ.first, (q[]) pairQ.second, u.b(aVar, (t[]) pairQ.second), aVar);
    }

    protected abstract Pair<y[], q[]> q(a aVar, int[][][] iArr, int[] iArr2, io.bidmachine.media3.exoplayer.source.r.b bVar, d0 d0Var) throws ExoPlaybackException;
}
