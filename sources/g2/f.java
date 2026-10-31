package g2;

/* JADX INFO: compiled from: TimeWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f15309c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15311b;

    /* JADX INFO: compiled from: TimeWindow.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15312a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f15313b = 0;

        a() {
        }

        public f a() {
            return new f(this.f15312a, this.f15313b);
        }

        public a b(long j10) {
            this.f15313b = j10;
            return this;
        }

        public a c(long j10) {
            this.f15312a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f15310a = j10;
        this.f15311b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f15311b;
    }

    public long b() {
        return this.f15310a;
    }
}
