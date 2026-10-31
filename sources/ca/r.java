package ca;

import v8.o0;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5357a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o0 f5359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5360d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5363g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5358b = new x7.a0(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5361e = -9223372036854775807L;

    public r(String str) {
        this.f5357a = str;
    }

    @Override // ca.m
    public void b() {
        this.f5360d = false;
        this.f5361e = -9223372036854775807L;
    }

    @Override // ca.m
    public void c(x7.a0 a0Var) {
        x7.a.i(this.f5359c);
        if (this.f5360d) {
            int iA = a0Var.a();
            int i10 = this.f5363g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(a0Var.e(), a0Var.f(), this.f5358b.e(), this.f5363g, iMin);
                if (this.f5363g + iMin == 10) {
                    this.f5358b.W(0);
                    if (73 != this.f5358b.H() || 68 != this.f5358b.H() || 51 != this.f5358b.H()) {
                        x7.r.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5360d = false;
                        return;
                    } else {
                        this.f5358b.X(3);
                        this.f5362f = this.f5358b.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f5362f - this.f5363g);
            this.f5359c.b(a0Var, iMin2);
            this.f5363g += iMin2;
        }
    }

    @Override // ca.m
    public void d(v8.r rVar, l0.d dVar) {
        dVar.a();
        o0 o0VarE = rVar.e(dVar.c(), 5);
        this.f5359c = o0VarE;
        o0VarE.a(new u7.q.b().f0(dVar.b()).U(this.f5357a).u0("application/id3").N());
    }

    @Override // ca.m
    public void e(boolean z10) {
        int i10;
        x7.a.i(this.f5359c);
        if (this.f5360d && (i10 = this.f5362f) != 0 && this.f5363g == i10) {
            x7.a.g(this.f5361e != -9223372036854775807L);
            this.f5359c.f(this.f5361e, 1, this.f5362f, 0, null);
            this.f5360d = false;
        }
    }

    @Override // ca.m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f5360d = true;
        this.f5361e = j10;
        this.f5362f = 0;
        this.f5363g = 0;
    }
}
