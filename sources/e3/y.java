package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* JADX INFO: loaded from: classes4.dex */
final class y extends h0.f.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.f.d.e.b f14375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14378d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    static final class b extends h0.f.d.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0.f.d.e.b f14379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f14382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f14383e;

        b() {
        }

        @Override // e3.h0.f.d.e.a
        public h0.f.d.e a() {
            h0.f.d.e.b bVar;
            String str;
            String str2;
            if (this.f14383e == 1 && (bVar = this.f14379a) != null && (str = this.f14380b) != null && (str2 = this.f14381c) != null) {
                return new y(bVar, str, str2, this.f14382d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14379a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f14380b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f14381c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f14383e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.e.a
        public h0.f.d.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f14380b = str;
            return this;
        }

        @Override // e3.h0.f.d.e.a
        public h0.f.d.e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f14381c = str;
            return this;
        }

        @Override // e3.h0.f.d.e.a
        public h0.f.d.e.a d(h0.f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f14379a = bVar;
            return this;
        }

        @Override // e3.h0.f.d.e.a
        public h0.f.d.e.a e(long j10) {
            this.f14382d = j10;
            this.f14383e = (byte) (this.f14383e | 1);
            return this;
        }
    }

    @Override // e3.h0.f.d.e
    public String b() {
        return this.f14376b;
    }

    @Override // e3.h0.f.d.e
    public String c() {
        return this.f14377c;
    }

    @Override // e3.h0.f.d.e
    public h0.f.d.e.b d() {
        return this.f14375a;
    }

    @Override // e3.h0.f.d.e
    public long e() {
        return this.f14378d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.e)) {
            return false;
        }
        h0.f.d.e eVar = (h0.f.d.e) obj;
        return this.f14375a.equals(eVar.d()) && this.f14376b.equals(eVar.b()) && this.f14377c.equals(eVar.c()) && this.f14378d == eVar.e();
    }

    public int hashCode() {
        int iHashCode = (((((this.f14375a.hashCode() ^ 1000003) * 1000003) ^ this.f14376b.hashCode()) * 1000003) ^ this.f14377c.hashCode()) * 1000003;
        long j10 = this.f14378d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f14375a + ", parameterKey=" + this.f14376b + ", parameterValue=" + this.f14377c + ", templateVersion=" + this.f14378d + "}";
    }

    private y(h0.f.d.e.b bVar, String str, String str2, long j10) {
        this.f14375a = bVar;
        this.f14376b = str;
        this.f14377c = str2;
        this.f14378d = j10;
    }
}
