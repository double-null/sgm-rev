package ca;

import v8.o0;

/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u7.q f5435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x7.g0 f5436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o0 f5437c;

    public x(String str, String str2) {
        this.f5435a = new u7.q.b().U(str2).u0(str).N();
    }

    private void b() {
        x7.a.i(this.f5436b);
        x7.l0.i(this.f5437c);
    }

    @Override // ca.d0
    public void a(x7.g0 g0Var, v8.r rVar, l0.d dVar) {
        this.f5436b = g0Var;
        dVar.a();
        o0 o0VarE = rVar.e(dVar.c(), 5);
        this.f5437c = o0VarE;
        o0VarE.a(this.f5435a);
    }

    @Override // ca.d0
    public void c(x7.a0 a0Var) {
        b();
        long jE = this.f5436b.e();
        long jF = this.f5436b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        u7.q qVar = this.f5435a;
        if (jF != qVar.f26257t) {
            u7.q qVarN = qVar.b().y0(jF).N();
            this.f5435a = qVarN;
            this.f5437c.a(qVarN);
        }
        int iA = a0Var.a();
        this.f5437c.b(a0Var, iA);
        this.f5437c.f(jE, 1, iA, 0, null);
    }
}
