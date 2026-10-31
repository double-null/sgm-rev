package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* JADX INFO: loaded from: classes4.dex */
final class b0 extends h0.f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14135d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    static final class b extends h0.f.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f14140e;

        b() {
        }

        @Override // e3.h0.f.e.a
        public h0.f.e a() {
            String str;
            String str2;
            if (this.f14140e == 3 && (str = this.f14137b) != null && (str2 = this.f14138c) != null) {
                return new b0(this.f14136a, str, str2, this.f14139d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f14140e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f14137b == null) {
                sb2.append(" version");
            }
            if (this.f14138c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f14140e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.e.a
        public h0.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f14138c = str;
            return this;
        }

        @Override // e3.h0.f.e.a
        public h0.f.e.a c(boolean z10) {
            this.f14139d = z10;
            this.f14140e = (byte) (this.f14140e | 2);
            return this;
        }

        @Override // e3.h0.f.e.a
        public h0.f.e.a d(int i10) {
            this.f14136a = i10;
            this.f14140e = (byte) (this.f14140e | 1);
            return this;
        }

        @Override // e3.h0.f.e.a
        public h0.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f14137b = str;
            return this;
        }
    }

    @Override // e3.h0.f.e
    public String b() {
        return this.f14134c;
    }

    @Override // e3.h0.f.e
    public int c() {
        return this.f14132a;
    }

    @Override // e3.h0.f.e
    public String d() {
        return this.f14133b;
    }

    @Override // e3.h0.f.e
    public boolean e() {
        return this.f14135d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.e)) {
            return false;
        }
        h0.f.e eVar = (h0.f.e) obj;
        return this.f14132a == eVar.c() && this.f14133b.equals(eVar.d()) && this.f14134c.equals(eVar.b()) && this.f14135d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.f14132a ^ 1000003) * 1000003) ^ this.f14133b.hashCode()) * 1000003) ^ this.f14134c.hashCode()) * 1000003) ^ (this.f14135d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f14132a + ", version=" + this.f14133b + ", buildVersion=" + this.f14134c + ", jailbroken=" + this.f14135d + "}";
    }

    private b0(int i10, String str, String str2, boolean z10) {
        this.f14132a = i10;
        this.f14133b = str;
        this.f14134c = str2;
        this.f14135d = z10;
    }
}
