package c9;

import java.io.IOException;
import v8.i0;
import v8.l0;
import v8.p;
import v8.q;
import v8.r;
import x7.a0;

/* JADX INFO: compiled from: HeifExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f5029a = new a0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f5030b = new l0(-1, -1, "image/heif");

    private boolean b(q qVar, int i10) throws IOException {
        this.f5029a.S(4);
        qVar.n(this.f5029a.e(), 0, 4);
        return this.f5029a.J() == ((long) i10);
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f5030b.a(j10, j11);
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f5030b.c(rVar);
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        qVar.g(4);
        return b(qVar, 1718909296) && b(qVar, 1751476579);
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        return this.f5030b.l(qVar, i0Var);
    }

    @Override // v8.p
    public void release() {
    }
}
