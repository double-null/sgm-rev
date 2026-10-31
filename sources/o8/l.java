package o8;

import java.io.IOException;
import u7.q;

/* JADX INFO: compiled from: InitializationChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f23217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f.b f23218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v8.g f23219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f23221n;

    public l(z7.d dVar, z7.g gVar, q qVar, int i10, Object obj, f fVar) {
        super(dVar, gVar, 2, qVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f23217j = fVar;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public void b() {
        this.f23221n = true;
    }

    public void f(f.b bVar) {
        this.f23218k = bVar;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public void load() throws IOException {
        if (this.f23220m == 0) {
            this.f23217j.d(this.f23218k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            z7.g gVarE = this.f23169b.e(this.f23220m);
            z7.n nVar = this.f23176i;
            v8.i iVar = new v8.i(nVar, gVarE.f29015g, nVar.i(gVarE));
            while (!this.f23221n && this.f23217j.a(iVar)) {
                try {
                } catch (Throwable th) {
                    this.f23220m = iVar.getPosition() - this.f23169b.f29015g;
                    this.f23219l = this.f23217j.b();
                    throw th;
                }
            }
            this.f23220m = iVar.getPosition() - this.f23169b.f29015g;
            this.f23219l = this.f23217j.b();
            z7.f.a(this.f23176i);
        } catch (Throwable th2) {
            z7.f.a(this.f23176i);
            throw th2;
        }
    }
}
