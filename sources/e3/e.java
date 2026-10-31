package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* JADX INFO: loaded from: classes4.dex */
final class e extends h0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14172b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    static final class b extends h0.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14174b;

        b() {
        }

        @Override // e3.h0.c.a
        public h0.c a() {
            String str;
            String str2 = this.f14173a;
            if (str2 != null && (str = this.f14174b) != null) {
                return new e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14173a == null) {
                sb2.append(" key");
            }
            if (this.f14174b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.c.a
        public h0.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f14173a = str;
            return this;
        }

        @Override // e3.h0.c.a
        public h0.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f14174b = str;
            return this;
        }
    }

    @Override // e3.h0.c
    public String b() {
        return this.f14171a;
    }

    @Override // e3.h0.c
    public String c() {
        return this.f14172b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.c)) {
            return false;
        }
        h0.c cVar = (h0.c) obj;
        return this.f14171a.equals(cVar.b()) && this.f14172b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f14171a.hashCode() ^ 1000003) * 1000003) ^ this.f14172b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f14171a + ", value=" + this.f14172b + "}";
    }

    private e(String str, String str2) {
        this.f14171a = str;
        this.f14172b = str2;
    }
}
