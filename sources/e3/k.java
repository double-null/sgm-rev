package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* JADX INFO: loaded from: classes4.dex */
final class k extends h0.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.f.a.b f14235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f14238g;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    static final class b extends h0.f.a.AbstractC0199a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.f.a.b f14242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f14243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f14244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f14245g;

        b() {
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a a() {
            String str;
            String str2 = this.f14239a;
            if (str2 != null && (str = this.f14240b) != null) {
                return new k(str2, str, this.f14241c, this.f14242d, this.f14243e, this.f14244f, this.f14245g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14239a == null) {
                sb2.append(" identifier");
            }
            if (this.f14240b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a.AbstractC0199a b(String str) {
            this.f14244f = str;
            return this;
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a.AbstractC0199a c(String str) {
            this.f14245g = str;
            return this;
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a.AbstractC0199a d(String str) {
            this.f14241c = str;
            return this;
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a.AbstractC0199a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f14239a = str;
            return this;
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a.AbstractC0199a f(String str) {
            this.f14243e = str;
            return this;
        }

        @Override // e3.h0.f.a.AbstractC0199a
        public h0.f.a.AbstractC0199a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f14240b = str;
            return this;
        }
    }

    @Override // e3.h0.f.a
    public String b() {
        return this.f14237f;
    }

    @Override // e3.h0.f.a
    public String c() {
        return this.f14238g;
    }

    @Override // e3.h0.f.a
    public String d() {
        return this.f14234c;
    }

    @Override // e3.h0.f.a
    public String e() {
        return this.f14232a;
    }

    public boolean equals(Object obj) {
        String str;
        h0.f.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.a)) {
            return false;
        }
        h0.f.a aVar = (h0.f.a) obj;
        if (this.f14232a.equals(aVar.e()) && this.f14233b.equals(aVar.h()) && ((str = this.f14234c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f14235d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f14236e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f14237f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f14238g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.h0.f.a
    public String f() {
        return this.f14236e;
    }

    @Override // e3.h0.f.a
    public h0.f.a.b g() {
        return this.f14235d;
    }

    @Override // e3.h0.f.a
    public String h() {
        return this.f14233b;
    }

    public int hashCode() {
        int iHashCode = (((this.f14232a.hashCode() ^ 1000003) * 1000003) ^ this.f14233b.hashCode()) * 1000003;
        String str = this.f14234c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        h0.f.a.b bVar = this.f14235d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f14236e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14237f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f14238g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f14232a + ", version=" + this.f14233b + ", displayVersion=" + this.f14234c + ", organization=" + this.f14235d + ", installationUuid=" + this.f14236e + ", developmentPlatform=" + this.f14237f + ", developmentPlatformVersion=" + this.f14238g + "}";
    }

    private k(String str, String str2, String str3, h0.f.a.b bVar, String str4, String str5, String str6) {
        this.f14232a = str;
        this.f14233b = str2;
        this.f14234c = str3;
        this.f14235d = bVar;
        this.f14236e = str4;
        this.f14237f = str5;
        this.f14238g = str6;
    }
}
