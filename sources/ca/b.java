package ca;

import java.io.IOException;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements v8.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v8.u f5039d = new v8.u() { // from class: ca.a
        @Override // v8.u
        public final v8.p[] g() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f5040a = new c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5041b = new x7.a0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5042c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] d() {
        return new v8.p[]{new b()};
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f5042c = false;
        this.f5040a.b();
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        this.f5040a.d(rVar, new l0.d(0, 1));
        rVar.r();
        rVar.h(new v8.j0.b(-9223372036854775807L));
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        x7.a0 a0Var = new x7.a0(10);
        int i10 = 0;
        while (true) {
            qVar.n(a0Var.e(), 0, 10);
            a0Var.W(0);
            if (a0Var.K() != 4801587) {
                break;
            }
            a0Var.X(3);
            int iG = a0Var.G();
            i10 += iG + 10;
            qVar.g(iG);
        }
        qVar.d();
        qVar.g(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.n(a0Var.e(), 0, 6);
            a0Var.W(0);
            if (a0Var.P() != 2935) {
                qVar.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.g(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = v8.b.g(a0Var.e());
                if (iG2 == -1) {
                    return false;
                }
                qVar.g(iG2 - 6);
            }
        }
    }

    @Override // v8.p
    public int l(v8.q qVar, v8.i0 i0Var) throws IOException {
        int i10 = qVar.read(this.f5041b.e(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f5041b.W(0);
        this.f5041b.V(i10);
        if (!this.f5042c) {
            this.f5040a.f(0L, 4);
            this.f5042c = true;
        }
        this.f5040a.c(this.f5041b);
        return 0;
    }

    @Override // v8.p
    public void release() {
    }
}
