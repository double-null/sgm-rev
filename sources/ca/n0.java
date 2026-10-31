package ca;

import java.util.List;
import v8.o0;

/* JADX INFO: compiled from: UserDataReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u7.q> f5248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0[] f5250c;

    public n0(List<u7.q> list, String str) {
        this.f5248a = list;
        this.f5249b = str;
        this.f5250c = new o0[list.size()];
    }

    public void a(long j10, x7.a0 a0Var) {
        if (a0Var.a() < 9) {
            return;
        }
        int iQ = a0Var.q();
        int iQ2 = a0Var.q();
        int iH = a0Var.H();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            v8.f.b(j10, a0Var, this.f5250c);
        }
    }

    public void b(v8.r rVar, l0.d dVar) {
        for (int i10 = 0; i10 < this.f5250c.length; i10++) {
            dVar.a();
            o0 o0VarE = rVar.e(dVar.c(), 3);
            u7.q qVar = this.f5248a.get(i10);
            String str = qVar.f26252o;
            x7.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            o0VarE.a(new u7.q.b().f0(dVar.b()).U(this.f5249b).u0(str).w0(qVar.f26242e).j0(qVar.f26241d).O(qVar.J).g0(qVar.f26255r).N());
            this.f5250c[i10] = o0VarE;
        }
    }
}
