package x8;

import com.google.common.collect.c1;
import com.google.common.collect.u;
import x7.a0;

/* JADX INFO: compiled from: ListChunk.java */
/* JADX INFO: loaded from: classes4.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u<a> f28252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28253b;

    private f(int i10, u<a> uVar) {
        this.f28253b = i10;
        this.f28252a = uVar;
    }

    private static a a(int i10, int i11, a0 a0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, a0Var);
            case 1751742049:
                return c.b(a0Var);
            case 1752331379:
                return d.c(a0Var);
            case 1852994675:
                return h.a(a0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, a0 a0Var) {
        u.a aVar = new u.a();
        int iG = a0Var.g();
        int iB = -2;
        while (a0Var.a() > 8) {
            int iU = a0Var.u();
            int iF = a0Var.f() + a0Var.u();
            a0Var.V(iF);
            a aVarC = iU == 1414744396 ? c(a0Var.u(), a0Var) : a(iU, iB, a0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            a0Var.W(iF);
            a0Var.V(iG);
        }
        return new f(i10, aVar.m());
    }

    public <T extends a> T b(Class<T> cls) {
        c1<a> it = this.f28252a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // x8.a
    public int getType() {
        return this.f28253b;
    }
}
