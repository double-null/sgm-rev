package ca;

import java.util.List;
import v8.o0;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u7.q> f5103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0[] f5105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y7.i f5106d = new y7.i(new y7.i.b() { // from class: ca.f0
        @Override // y7.i.b
        public final void a(long j10, x7.a0 a0Var) {
            this.f5102a.f(j10, a0Var);
        }
    });

    public g0(List<u7.q> list, String str) {
        this.f5103a = list;
        this.f5104b = str;
        this.f5105c = new o0[list.size()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(long j10, x7.a0 a0Var) {
        v8.f.a(j10, a0Var, this.f5105c);
    }

    public void b() {
        this.f5106d.d();
    }

    public void c(long j10, x7.a0 a0Var) {
        this.f5106d.a(j10, a0Var);
    }

    public void d(v8.r rVar, l0.d dVar) {
        for (int i10 = 0; i10 < this.f5105c.length; i10++) {
            dVar.a();
            o0 o0VarE = rVar.e(dVar.c(), 3);
            u7.q qVar = this.f5103a.get(i10);
            String str = qVar.f26252o;
            x7.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = qVar.f26238a;
            if (strB == null) {
                strB = dVar.b();
            }
            o0VarE.a(new u7.q.b().f0(strB).U(this.f5104b).u0(str).w0(qVar.f26242e).j0(qVar.f26241d).O(qVar.J).g0(qVar.f26255r).N());
            this.f5105c[i10] = o0VarE;
        }
    }

    public void e() {
        this.f5106d.d();
    }

    public void g(int i10) {
        this.f5106d.g(i10);
    }
}
