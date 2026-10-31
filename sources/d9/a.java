package d9;

import java.io.IOException;
import v8.i0;
import v8.l0;
import v8.p;
import v8.q;
import v8.r;

/* JADX INFO: compiled from: JpegExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f13416a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f13416a = new l0(65496, 2, "image/jpeg");
        } else {
            this.f13416a = new b();
        }
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f13416a.a(j10, j11);
    }

    @Override // v8.p
    public void c(r rVar) {
        this.f13416a.c(rVar);
    }

    @Override // v8.p
    public boolean e(q qVar) throws IOException {
        return this.f13416a.e(qVar);
    }

    @Override // v8.p
    public int l(q qVar, i0 i0Var) throws IOException {
        return this.f13416a.l(qVar, i0Var);
    }

    @Override // v8.p
    public void release() {
        this.f13416a.release();
    }
}
