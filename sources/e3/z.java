package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* JADX INFO: loaded from: classes4.dex */
final class z extends h0.f.d.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14385b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    static final class b extends h0.f.d.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14387b;

        b() {
        }

        @Override // e3.h0.f.d.e.b.a
        public h0.f.d.e.b a() {
            String str;
            String str2 = this.f14386a;
            if (str2 != null && (str = this.f14387b) != null) {
                return new z(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14386a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f14387b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.e.b.a
        public h0.f.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f14386a = str;
            return this;
        }

        @Override // e3.h0.f.d.e.b.a
        public h0.f.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f14387b = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.e.b
    public String b() {
        return this.f14384a;
    }

    @Override // e3.h0.f.d.e.b
    public String c() {
        return this.f14385b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.e.b)) {
            return false;
        }
        h0.f.d.e.b bVar = (h0.f.d.e.b) obj;
        return this.f14384a.equals(bVar.b()) && this.f14385b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f14384a.hashCode() ^ 1000003) * 1000003) ^ this.f14385b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f14384a + ", variantId=" + this.f14385b + "}";
    }

    private z(String str, String str2) {
        this.f14384a = str;
        this.f14385b = str2;
    }
}
