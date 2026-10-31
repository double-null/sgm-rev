package ea;

import java.io.IOException;
import v8.i0;
import v8.l0;
import v8.p;
import v8.q;
import v8.r;
import x7.a0;

/* JADX INFO: compiled from: WebpExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f14514a = new a0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f14515b = new l0(-1, -1, "image/webp");

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f14515b.a(j10, j11);
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f14515b.c(rVar);
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        this.f14514a.S(4);
        qVar.n(this.f14514a.e(), 0, 4);
        if (this.f14514a.J() != 1380533830) {
            return false;
        }
        qVar.g(4);
        this.f14514a.S(4);
        qVar.n(this.f14514a.e(), 0, 4);
        return this.f14514a.J() == 1464156752;
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        return this.f14515b.l(qVar, i0Var);
    }

    @Override // v8.p
    public void release() {
    }
}
