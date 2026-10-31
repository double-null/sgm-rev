package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* JADX INFO: loaded from: classes4.dex */
final class u extends h0.f.d.a.b.e.AbstractC0208b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14344e;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    static final class b extends h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f14345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f14348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f14350f;

        b() {
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a
        public h0.f.d.a.b.e.AbstractC0208b a() {
            String str;
            if (this.f14350f == 7 && (str = this.f14346b) != null) {
                return new u(this.f14345a, str, this.f14347c, this.f14348d, this.f14349e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f14350f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f14346b == null) {
                sb2.append(" symbol");
            }
            if ((this.f14350f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f14350f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a
        public h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a b(String str) {
            this.f14347c = str;
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a
        public h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a c(int i10) {
            this.f14349e = i10;
            this.f14350f = (byte) (this.f14350f | 4);
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a
        public h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a d(long j10) {
            this.f14348d = j10;
            this.f14350f = (byte) (this.f14350f | 2);
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a
        public h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a e(long j10) {
            this.f14345a = j10;
            this.f14350f = (byte) (this.f14350f | 1);
            return this;
        }

        @Override // e3.h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a
        public h0.f.d.a.b.e.AbstractC0208b.AbstractC0209a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f14346b = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.a.b.e.AbstractC0208b
    public String b() {
        return this.f14342c;
    }

    @Override // e3.h0.f.d.a.b.e.AbstractC0208b
    public int c() {
        return this.f14344e;
    }

    @Override // e3.h0.f.d.a.b.e.AbstractC0208b
    public long d() {
        return this.f14343d;
    }

    @Override // e3.h0.f.d.a.b.e.AbstractC0208b
    public long e() {
        return this.f14340a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.b.e.AbstractC0208b)) {
            return false;
        }
        h0.f.d.a.b.e.AbstractC0208b abstractC0208b = (h0.f.d.a.b.e.AbstractC0208b) obj;
        return this.f14340a == abstractC0208b.e() && this.f14341b.equals(abstractC0208b.f()) && ((str = this.f14342c) != null ? str.equals(abstractC0208b.b()) : abstractC0208b.b() == null) && this.f14343d == abstractC0208b.d() && this.f14344e == abstractC0208b.c();
    }

    @Override // e3.h0.f.d.a.b.e.AbstractC0208b
    public String f() {
        return this.f14341b;
    }

    public int hashCode() {
        long j10 = this.f14340a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14341b.hashCode()) * 1000003;
        String str = this.f14342c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f14343d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14344e;
    }

    public String toString() {
        return "Frame{pc=" + this.f14340a + ", symbol=" + this.f14341b + ", file=" + this.f14342c + ", offset=" + this.f14343d + ", importance=" + this.f14344e + "}";
    }

    private u(long j10, String str, String str2, long j11, int i10) {
        this.f14340a = j10;
        this.f14341b = str;
        this.f14342c = str2;
        this.f14343d = j11;
        this.f14344e = i10;
    }
}
