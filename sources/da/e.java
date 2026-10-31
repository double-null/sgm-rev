package da;

import v8.j0;
import v8.k0;
import x7.l0;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
final class e implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f13480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f13482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f13483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f13484e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f13480a = cVar;
        this.f13481b = i10;
        this.f13482c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f13475e);
        this.f13483d = j12;
        this.f13484e = a(j12);
    }

    private long a(long j10) {
        return l0.f1(j10 * ((long) this.f13481b), 1000000L, this.f13480a.f13473c);
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        long jQ = l0.q((((long) this.f13480a.f13473c) * j10) / (((long) this.f13481b) * 1000000), 0L, this.f13483d - 1);
        long j11 = this.f13482c + (((long) this.f13480a.f13475e) * jQ);
        long jA = a(jQ);
        k0 k0Var = new k0(jA, j11);
        if (jA >= j10 || jQ == this.f13483d - 1) {
            return new j0.a(k0Var);
        }
        long j12 = jQ + 1;
        return new j0.a(k0Var, new k0(a(j12), this.f13482c + (((long) this.f13480a.f13475e) * j12)));
    }

    @Override // v8.j0
    public boolean h() {
        return true;
    }

    @Override // v8.j0
    public long k() {
        return this.f13484e;
    }
}
