package b8;

import android.util.Pair;
import u7.d0;

/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n8.t f4119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4120g;

    public a(boolean z10, n8.t tVar) {
        this.f4120g = z10;
        this.f4119f = tVar;
        this.f4118e = tVar.getLength();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f4119f.c(i10);
        }
        if (i10 < this.f4118e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f4119f.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i10);

    protected abstract d0 D(int i10);

    @Override // u7.d0
    public int a(boolean z10) {
        if (this.f4118e == 0) {
            return -1;
        }
        if (this.f4120g) {
            z10 = false;
        }
        int iF = z10 ? this.f4119f.f() : 0;
        while (D(iF).q()) {
            iF = B(iF, z10);
            if (iF == -1) {
                return -1;
            }
        }
        return A(iF) + D(iF).a(z10);
    }

    @Override // u7.d0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // u7.d0
    public int c(boolean z10) {
        int i10 = this.f4118e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f4120g) {
            z10 = false;
        }
        int iD = z10 ? this.f4119f.d() : i10 - 1;
        while (D(iD).q()) {
            iD = C(iD, z10);
            if (iD == -1) {
                return -1;
            }
        }
        return A(iD) + D(iD).c(z10);
    }

    @Override // u7.d0
    public int e(int i10, int i11, boolean z10) {
        if (this.f4120g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // u7.d0
    public final d0.b g(int i10, d0.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f26020c += iA;
        if (z10) {
            bVar.f26019b = y(x(iT), x7.a.e(bVar.f26019b));
        }
        return bVar;
    }

    @Override // u7.d0
    public final d0.b h(Object obj, d0.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f26020c += iA;
        bVar.f26019b = obj;
        return bVar;
    }

    @Override // u7.d0
    public int l(int i10, int i11, boolean z10) {
        if (this.f4120g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // u7.d0
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // u7.d0
    public final d0.c o(int i10, d0.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!d0.c.f26025q.equals(cVar.f26035a)) {
            objX = y(objX, cVar.f26035a);
        }
        cVar.f26035a = objX;
        cVar.f26048n += iZ;
        cVar.f26049o += iZ;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i10);

    protected abstract int u(int i10);

    protected abstract Object x(int i10);

    protected abstract int z(int i10);
}
