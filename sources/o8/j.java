package o8;

import java.io.IOException;
import u7.q;
import u7.w;
import v8.o0;
import x7.a0;

/* JADX INFO: compiled from: ContainerMediaChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public class j extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f23209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f23210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f23211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f23212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f23213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23214t;

    public j(z7.d dVar, z7.g gVar, q qVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(dVar, gVar, qVar, i10, obj, j10, j11, j12, j13, j14);
        this.f23209o = i11;
        this.f23210p = j15;
        this.f23211q = fVar;
    }

    private void l(c cVar) {
        if (w.q(this.f23171d.f26251n)) {
            q qVar = this.f23171d;
            int i10 = qVar.L;
            if ((i10 <= 1 && qVar.M <= 1) || i10 == -1 || qVar.M == -1) {
                return;
            }
            o0 o0VarE = cVar.e(0, 4);
            q qVar2 = this.f23171d;
            int i11 = qVar2.M * qVar2.L;
            long j10 = (this.f23175h - this.f23174g) / ((long) i11);
            for (int i12 = 1; i12 < i11; i12++) {
                o0VarE.b(new a0(), 0);
                o0VarE.f(((long) i12) * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public final void b() {
        this.f23213s = true;
    }

    @Override // o8.m
    public long f() {
        return this.f23222j + ((long) this.f23209o);
    }

    @Override // o8.m
    public boolean g() {
        return this.f23214t;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public final void load() throws IOException {
        c cVarI = i();
        if (this.f23212r == 0) {
            cVarI.b(this.f23210p);
            f fVar = this.f23211q;
            f.b bVarK = k(cVarI);
            long j10 = this.f23138k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f23210p;
            long j12 = this.f23139l;
            fVar.d(bVarK, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f23210p);
        }
        try {
            z7.g gVarE = this.f23169b.e(this.f23212r);
            z7.n nVar = this.f23176i;
            v8.i iVar = new v8.i(nVar, gVarE.f29015g, nVar.i(gVarE));
            do {
                try {
                    if (this.f23213s) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f23212r = iVar.getPosition() - this.f23169b.f29015g;
                    throw th;
                }
            } while (this.f23211q.a(iVar));
            l(cVarI);
            this.f23212r = iVar.getPosition() - this.f23169b.f29015g;
            m();
            z7.f.a(this.f23176i);
            this.f23214t = !this.f23213s;
        } catch (Throwable th2) {
            m();
            z7.f.a(this.f23176i);
            throw th2;
        }
    }

    protected void m() {
    }

    protected f.b k(c cVar) {
        return cVar;
    }
}
