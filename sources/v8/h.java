package v8;

/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public class h implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f27336g;

    public h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f27330a = j10;
        this.f27331b = j11;
        this.f27332c = i11 == -1 ? 1 : i11;
        this.f27334e = i10;
        this.f27336g = z10;
        if (j10 == -1) {
            this.f27333d = -1L;
            this.f27335f = -9223372036854775807L;
        } else {
            this.f27333d = j10 - j11;
            this.f27335f = e(j10, j11, i10);
        }
    }

    private long a(long j10) {
        long j11 = (j10 * ((long) this.f27334e)) / 8000000;
        int i10 = this.f27332c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f27333d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f27331b + Math.max(jMin, 0L);
    }

    private static long e(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public long c(long j10) {
        return e(j10, this.f27331b, this.f27334e);
    }

    @Override // v8.j0
    public j0.a d(long j10) {
        if (this.f27333d == -1 && !this.f27336g) {
            return new j0.a(new k0(0L, this.f27331b));
        }
        long jA = a(j10);
        long jC = c(jA);
        k0 k0Var = new k0(jC, jA);
        if (this.f27333d != -1 && jC < j10) {
            int i10 = this.f27332c;
            if (((long) i10) + jA < this.f27330a) {
                long j11 = jA + ((long) i10);
                return new j0.a(k0Var, new k0(c(j11), j11));
            }
        }
        return new j0.a(k0Var);
    }

    @Override // v8.j0
    public boolean h() {
        return this.f27333d != -1 || this.f27336g;
    }

    @Override // v8.j0
    public long k() {
        return this.f27335f;
    }
}
