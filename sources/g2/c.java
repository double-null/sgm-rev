package g2;

/* JADX INFO: compiled from: LogEventDropped.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f15285c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f15287b;

    /* JADX INFO: compiled from: LogEventDropped.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f15288a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f15289b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f15288a, this.f15289b);
        }

        public a b(long j10) {
            this.f15288a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f15289b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: LogEventDropped.java */
    public enum b implements r3.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15298a;

        b(int i10) {
            this.f15298a = i10;
        }

        @Override // r3.c
        public int getNumber() {
            return this.f15298a;
        }
    }

    c(long j10, b bVar) {
        this.f15286a = j10;
        this.f15287b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f15286a;
    }

    public b b() {
        return this.f15287b;
    }
}
