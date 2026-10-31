package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* JADX INFO: loaded from: classes4.dex */
final class q extends h0.f.d.a.b.AbstractC0201a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14309d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    static final class b extends h0.f.d.a.b.AbstractC0201a.AbstractC0202a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f14310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f14311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f14313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f14314e;

        b() {
        }

        @Override // e3.h0.f.d.a.b.AbstractC0201a.AbstractC0202a
        public h0.f.d.a.b.AbstractC0201a a() {
            String str;
            if (this.f14314e == 3 && (str = this.f14312c) != null) {
                return new q(this.f14310a, this.f14311b, str, this.f14313d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f14314e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f14314e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f14312c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.b.AbstractC0201a.AbstractC0202a
        public h0.f.d.a.b.AbstractC0201a.AbstractC0202a b(long j10) {
            this.f14310a = j10;
            this.f14314e = (byte) (this.f14314e | 1);
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0201a.AbstractC0202a
        public h0.f.d.a.b.AbstractC0201a.AbstractC0202a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f14312c = str;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0201a.AbstractC0202a
        public h0.f.d.a.b.AbstractC0201a.AbstractC0202a d(long j10) {
            this.f14311b = j10;
            this.f14314e = (byte) (this.f14314e | 2);
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0201a.AbstractC0202a
        public h0.f.d.a.b.AbstractC0201a.AbstractC0202a e(String str) {
            this.f14313d = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.a.b.AbstractC0201a
    public long b() {
        return this.f14306a;
    }

    @Override // e3.h0.f.d.a.b.AbstractC0201a
    public String c() {
        return this.f14308c;
    }

    @Override // e3.h0.f.d.a.b.AbstractC0201a
    public long d() {
        return this.f14307b;
    }

    @Override // e3.h0.f.d.a.b.AbstractC0201a
    public String e() {
        return this.f14309d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.b.AbstractC0201a)) {
            return false;
        }
        h0.f.d.a.b.AbstractC0201a abstractC0201a = (h0.f.d.a.b.AbstractC0201a) obj;
        if (this.f14306a == abstractC0201a.b() && this.f14307b == abstractC0201a.d() && this.f14308c.equals(abstractC0201a.c())) {
            String str = this.f14309d;
            if (str == null) {
                if (abstractC0201a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0201a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14306a;
        long j11 = this.f14307b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14308c.hashCode()) * 1000003;
        String str = this.f14309d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f14306a + ", size=" + this.f14307b + ", name=" + this.f14308c + ", uuid=" + this.f14309d + "}";
    }

    private q(long j10, long j11, String str, String str2) {
        this.f14306a = j10;
        this.f14307b = j11;
        this.f14308c = str;
        this.f14309d = str2;
    }
}
