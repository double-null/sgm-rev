package g2;

/* JADX INFO: compiled from: StorageMetrics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f15304c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15306b;

    /* JADX INFO: compiled from: StorageMetrics.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15307a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f15308b = 0;

        a() {
        }

        public e a() {
            return new e(this.f15307a, this.f15308b);
        }

        public a b(long j10) {
            this.f15307a = j10;
            return this;
        }

        public a c(long j10) {
            this.f15308b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f15305a = j10;
        this.f15306b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f15305a;
    }

    public long b() {
        return this.f15306b;
    }
}
