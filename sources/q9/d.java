package q9;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import v8.i0;
import v8.o0;
import v8.p;
import v8.q;
import v8.r;
import v8.u;
import x7.a0;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f24635d = new u() { // from class: q9.c
        @Override // v8.u
        public final p[] g() {
            return d.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f24637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24638c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p[] d() {
        return new p[]{new d()};
    }

    private static a0 g(a0 a0Var) {
        a0Var.W(0);
        return a0Var;
    }

    private boolean h(q qVar) throws IOException {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.f24645b & 2) == 2) {
            int iMin = Math.min(fVar.f24652i, 8);
            a0 a0Var = new a0(iMin);
            qVar.n(a0Var.e(), 0, iMin);
            if (b.p(g(a0Var))) {
                this.f24637b = new b();
            } else if (j.r(g(a0Var))) {
                this.f24637b = new j();
            } else if (h.o(g(a0Var))) {
                this.f24637b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        i iVar = this.f24637b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f24636a = rVar;
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        try {
            return h(qVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        x7.a.i(this.f24636a);
        if (this.f24637b == null) {
            if (!h(qVar)) {
                throw ParserException.b("Failed to determine bitstream type", null);
            }
            qVar.d();
        }
        if (!this.f24638c) {
            o0 o0VarE = this.f24636a.e(0, 1);
            this.f24636a.r();
            this.f24637b.d(this.f24636a, o0VarE);
            this.f24638c = true;
        }
        return this.f24637b.g(qVar, i0Var);
    }

    @Override // v8.p
    public void release() {
    }
}
