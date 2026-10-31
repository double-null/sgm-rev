package ca;

import java.util.Collections;
import java.util.List;
import v8.o0;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l0.a> f5205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0[] f5207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5211g = -9223372036854775807L;

    public l(List<l0.a> list, String str) {
        this.f5205a = list;
        this.f5206b = str;
        this.f5207c = new o0[list.size()];
    }

    private boolean a(x7.a0 a0Var, int i10) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.H() != i10) {
            this.f5208d = false;
        }
        this.f5209e--;
        return this.f5208d;
    }

    @Override // ca.m
    public void b() {
        this.f5208d = false;
        this.f5211g = -9223372036854775807L;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        if (this.f5208d) {
            if (this.f5209e != 2 || a(a0Var, 32)) {
                if (this.f5209e != 1 || a(a0Var, 0)) {
                    int iF = a0Var.f();
                    int iA = a0Var.a();
                    for (o0 o0Var : this.f5207c) {
                        a0Var.W(iF);
                        o0Var.b(a0Var, iA);
                    }
                    this.f5210f += iA;
                }
            }
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        for (int i10 = 0; i10 < this.f5207c.length; i10++) {
            l0.a aVar = this.f5205a.get(i10);
            dVar.a();
            o0 o0VarE = rVar.e(dVar.c(), 3);
            o0VarE.a(new u7.q.b().f0(dVar.b()).U(this.f5206b).u0("application/dvbsubs").g0(Collections.singletonList(aVar.f5214c)).j0(aVar.f5212a).N());
            this.f5207c[i10] = o0VarE;
        }
    }

    @Override // ca.m
    public void e(boolean z10) {
        if (this.f5208d) {
            x7.a.g(this.f5211g != -9223372036854775807L);
            for (o0 o0Var : this.f5207c) {
                o0Var.f(this.f5211g, 1, this.f5210f, 0, null);
            }
            this.f5208d = false;
        }
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f5208d = true;
        this.f5211g = j10;
        this.f5210f = 0;
        this.f5209e = 2;
    }
}
