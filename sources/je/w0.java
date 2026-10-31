package je;

import java.util.List;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
final class w0 implements pd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.l f21026a;

    public w0(pd.l origin) {
        kotlin.jvm.internal.t.f(origin, "origin");
        this.f21026a = origin;
    }

    @Override // pd.l
    public boolean b() {
        return this.f21026a.b();
    }

    @Override // pd.l
    public pd.e c() {
        return this.f21026a.c();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        pd.l lVar = this.f21026a;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (!kotlin.jvm.internal.t.a(lVar, w0Var != null ? w0Var.f21026a : null)) {
            return false;
        }
        pd.e eVarC = c();
        if (eVarC instanceof pd.c) {
            pd.l lVar2 = obj instanceof pd.l ? (pd.l) obj : null;
            pd.e eVarC2 = lVar2 != null ? lVar2.c() : null;
            if (eVarC2 != null && (eVarC2 instanceof pd.c)) {
                return kotlin.jvm.internal.t.a(hd.a.a((pd.c) eVarC), hd.a.a((pd.c) eVarC2));
            }
        }
        return false;
    }

    @Override // pd.l
    public List<pd.m> h() {
        return this.f21026a.h();
    }

    public int hashCode() {
        return this.f21026a.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f21026a;
    }
}
