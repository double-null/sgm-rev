package v8;

/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x7.s f27307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.s f27308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27309c;

    public e0(long[] jArr, long[] jArr2, long j10) {
        x7.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f27307a = new x7.s(length);
            this.f27308b = new x7.s(length);
        } else {
            int i10 = length + 1;
            x7.s sVar = new x7.s(i10);
            this.f27307a = sVar;
            x7.s sVar2 = new x7.s(i10);
            this.f27308b = sVar2;
            sVar.a(0L);
            sVar2.a(0L);
        }
        this.f27307a.b(jArr);
        this.f27308b.b(jArr2);
        this.f27309c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f27308b.d() == 0 && j10 > 0) {
            this.f27307a.a(0L);
            this.f27308b.a(0L);
        }
        this.f27307a.a(j11);
        this.f27308b.a(j10);
    }

    public long b(long j10) {
        if (this.f27308b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f27308b.c(x7.l0.f(this.f27307a, j10, true, true));
    }

    public boolean c(long j10, long j11) {
        if (this.f27308b.d() == 0) {
            return false;
        }
        x7.s sVar = this.f27308b;
        return j10 - sVar.c(sVar.d() - 1) < j11;
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        if (this.f27308b.d() == 0) {
            return new j0.a(k0.f27349c);
        }
        int iF = x7.l0.f(this.f27308b, j10, true, true);
        k0 k0Var = new k0(this.f27308b.c(iF), this.f27307a.c(iF));
        if (k0Var.f27350a == j10 || iF == this.f27308b.d() - 1) {
            return new j0.a(k0Var);
        }
        int i10 = iF + 1;
        return new j0.a(k0Var, new k0(this.f27308b.c(i10), this.f27307a.c(i10)));
    }

    public void e(long j10) {
        this.f27309c = j10;
    }

    @Override // v8.j0
    public boolean h() {
        return this.f27308b.d() > 0;
    }

    @Override // v8.j0
    public long k() {
        return this.f27309c;
    }
}
