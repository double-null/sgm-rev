package e8;

import f8.i;

/* JADX INFO: compiled from: DashWrappingSegmentIndex.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v8.g f14511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14512b;

    public g(v8.g gVar, long j10) {
        this.f14511a = gVar;
        this.f14512b = j10;
    }

    @Override // e8.e
    public long b(long j10) {
        return this.f14511a.f27328e[(int) j10] - this.f14512b;
    }

    @Override // e8.e
    public long c(long j10, long j11) {
        return this.f14511a.f27327d[(int) j10];
    }

    @Override // e8.e
    public long d(long j10, long j11) {
        return 0L;
    }

    @Override // e8.e
    public long e(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // e8.e
    public i f(long j10) {
        v8.g gVar = this.f14511a;
        int i10 = (int) j10;
        return new i(null, gVar.f27326c[i10], gVar.f27325b[i10]);
    }

    @Override // e8.e
    public long g(long j10, long j11) {
        return this.f14511a.a(j10 + this.f14512b);
    }

    @Override // e8.e
    public long h(long j10) {
        return this.f14511a.f27324a;
    }

    @Override // e8.e
    public boolean i() {
        return true;
    }

    @Override // e8.e
    public long j() {
        return 0L;
    }

    @Override // e8.e
    public long k(long j10, long j11) {
        return this.f14511a.f27324a;
    }
}
