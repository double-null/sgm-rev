package o8;

import u7.q;

/* JADX INFO: compiled from: MediaChunk.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f23222j;

    public m(z7.d dVar, z7.g gVar, q qVar, int i10, Object obj, long j10, long j11, long j12) {
        super(dVar, gVar, 1, qVar, i10, obj, j10, j11);
        x7.a.e(qVar);
        this.f23222j = j12;
    }

    public long f() {
        long j10 = this.f23222j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean g();
}
