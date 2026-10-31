package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* JADX INFO: loaded from: classes4.dex */
final class s extends h0.f.d.a.b.AbstractC0205d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14328c;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    static final class b extends h0.f.d.a.b.AbstractC0205d.AbstractC0206a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f14331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f14332d;

        b() {
        }

        @Override // e3.h0.f.d.a.b.AbstractC0205d.AbstractC0206a
        public h0.f.d.a.b.AbstractC0205d a() {
            String str;
            String str2;
            if (this.f14332d == 1 && (str = this.f14329a) != null && (str2 = this.f14330b) != null) {
                return new s(str, str2, this.f14331c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14329a == null) {
                sb2.append(" name");
            }
            if (this.f14330b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f14332d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.a.b.AbstractC0205d.AbstractC0206a
        public h0.f.d.a.b.AbstractC0205d.AbstractC0206a b(long j10) {
            this.f14331c = j10;
            this.f14332d = (byte) (this.f14332d | 1);
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0205d.AbstractC0206a
        public h0.f.d.a.b.AbstractC0205d.AbstractC0206a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f14330b = str;
            return this;
        }

        @Override // e3.h0.f.d.a.b.AbstractC0205d.AbstractC0206a
        public h0.f.d.a.b.AbstractC0205d.AbstractC0206a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f14329a = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.a.b.AbstractC0205d
    public long b() {
        return this.f14328c;
    }

    @Override // e3.h0.f.d.a.b.AbstractC0205d
    public String c() {
        return this.f14327b;
    }

    @Override // e3.h0.f.d.a.b.AbstractC0205d
    public String d() {
        return this.f14326a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.a.b.AbstractC0205d)) {
            return false;
        }
        h0.f.d.a.b.AbstractC0205d abstractC0205d = (h0.f.d.a.b.AbstractC0205d) obj;
        return this.f14326a.equals(abstractC0205d.d()) && this.f14327b.equals(abstractC0205d.c()) && this.f14328c == abstractC0205d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.f14326a.hashCode() ^ 1000003) * 1000003) ^ this.f14327b.hashCode()) * 1000003;
        long j10 = this.f14328c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f14326a + ", code=" + this.f14327b + ", address=" + this.f14328c + "}";
    }

    private s(String str, String str2, long j10) {
        this.f14326a = str;
        this.f14327b = str2;
        this.f14328c = j10;
    }
}
