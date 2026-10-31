package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.exoplayer.k1;
import java.io.IOException;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.b f19662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r8.b f19664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f19665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f19666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q.a f19667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f19668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19670i = -9223372036854775807L;

    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface a {
        void a(r.b bVar);

        void b(r.b bVar, IOException iOException);
    }

    public o(r.b bVar, r8.b bVar2, long j10) {
        this.f19662a = bVar;
        this.f19664c = bVar2;
        this.f19663b = j10;
    }

    private long p(long j10) {
        long j11 = this.f19670i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public void a(r.b bVar) {
        long jP = p(this.f19663b);
        q qVarA = ((r) x7.a.e(this.f19665d)).a(bVar, this.f19664c, jP);
        this.f19666e = qVarA;
        if (this.f19667f != null) {
            qVarA.l(this, jP);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long b() {
        return ((q) x7.l0.i(this.f19666e)).b();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean c(k1 k1Var) {
        q qVar = this.f19666e;
        return qVar != null && qVar.c(k1Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long d(long j10, b8.a0 a0Var) {
        return ((q) x7.l0.i(this.f19666e)).d(j10, a0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q.a
    public void e(q qVar) {
        ((q.a) x7.l0.i(this.f19667f)).e(this);
        a aVar = this.f19668g;
        if (aVar != null) {
            aVar.a(this.f19662a);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public long f() {
        return ((q) x7.l0.i(this.f19666e)).f();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public void g(long j10) {
        ((q) x7.l0.i(this.f19666e)).g(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long i(q8.q[] qVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j10) {
        long j11 = this.f19670i;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f19663b) ? j10 : j11;
        this.f19670i = -9223372036854775807L;
        return ((q) x7.l0.i(this.f19666e)).i(qVarArr, zArr, sVarArr, zArr2, j12);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q, io.bidmachine.media3.exoplayer.source.g0
    public boolean isLoading() {
        q qVar = this.f19666e;
        return qVar != null && qVar.isLoading();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long j(long j10) {
        return ((q) x7.l0.i(this.f19666e)).j(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public long k() {
        return ((q) x7.l0.i(this.f19666e)).k();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void l(q.a aVar, long j10) {
        this.f19667f = aVar;
        q qVar = this.f19666e;
        if (qVar != null) {
            qVar.l(this, p(this.f19663b));
        }
    }

    public long n() {
        return this.f19670i;
    }

    public long o() {
        return this.f19663b;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void q() throws IOException {
        try {
            q qVar = this.f19666e;
            if (qVar != null) {
                qVar.q();
            } else {
                r rVar = this.f19665d;
                if (rVar != null) {
                    rVar.j();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f19668g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f19669h) {
                return;
            }
            this.f19669h = true;
            aVar.b(this.f19662a, e10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(q qVar) {
        ((q.a) x7.l0.i(this.f19667f)).h(this);
    }

    public void s(long j10) {
        this.f19670i = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public n8.x t() {
        return ((q) x7.l0.i(this.f19666e)).t();
    }

    @Override // io.bidmachine.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        ((q) x7.l0.i(this.f19666e)).u(j10, z10);
    }

    public void v() {
        if (this.f19666e != null) {
            ((r) x7.a.e(this.f19665d)).n(this.f19666e);
        }
    }

    public void w(r rVar) {
        x7.a.g(this.f19665d == null);
        this.f19665d = rVar;
    }
}
