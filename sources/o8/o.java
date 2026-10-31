package o8;

import java.io.IOException;
import u7.q;
import v8.o0;

/* JADX INFO: compiled from: SingleSampleMediaChunk.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f23224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q f23225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f23226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23227r;

    public o(z7.d dVar, z7.g gVar, q qVar, int i10, Object obj, long j10, long j11, long j12, int i11, q qVar2) {
        super(dVar, gVar, qVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f23224o = i11;
        this.f23225p = qVar2;
    }

    @Override // o8.m
    public boolean g() {
        return this.f23227r;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public void load() throws IOException {
        c cVarI = i();
        cVarI.b(0L);
        o0 o0VarE = cVarI.e(0, this.f23224o);
        o0VarE.a(this.f23225p);
        try {
            long jI = this.f23176i.i(this.f23169b.e(this.f23226q));
            if (jI != -1) {
                jI += this.f23226q;
            }
            v8.i iVar = new v8.i(this.f23176i, this.f23226q, jI);
            for (int iC = 0; iC != -1; iC = o0VarE.c(iVar, Integer.MAX_VALUE, true)) {
                this.f23226q += (long) iC;
            }
            o0VarE.f(this.f23174g, 1, (int) this.f23226q, 0, null);
            z7.f.a(this.f23176i);
            this.f23227r = true;
        } catch (Throwable th) {
            z7.f.a(this.f23176i);
            throw th;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public void b() {
    }
}
