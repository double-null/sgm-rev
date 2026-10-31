package o9;

import v8.f0;

/* JADX INFO: compiled from: ConstantBitrateSeeker.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends v8.h implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f23228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f23231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f23232l;

    public a(long j10, long j11, f0.a aVar, boolean z10) {
        this(j10, j11, aVar.f27322f, aVar.f27319c, z10);
    }

    @Override // o9.g
    public long b(long j10) {
        return c(j10);
    }

    public a f(long j10) {
        return new a(j10, this.f23228h, this.f23229i, this.f23230j, this.f23231k);
    }

    @Override // o9.g
    public long g() {
        return this.f23232l;
    }

    @Override // o9.g
    public int j() {
        return this.f23229i;
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        this.f23228h = j11;
        this.f23229i = i10;
        this.f23230j = i11;
        this.f23231k = z10;
        this.f23232l = j10 == -1 ? -1L : j10;
    }
}
