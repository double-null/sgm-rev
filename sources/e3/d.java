package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* JADX INFO: loaded from: classes4.dex */
final class d extends h0.a.AbstractC0197a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14164c;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    static final class b extends h0.a.AbstractC0197a.AbstractC0198a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f14167c;

        b() {
        }

        @Override // e3.h0.a.AbstractC0197a.AbstractC0198a
        public h0.a.AbstractC0197a a() {
            String str;
            String str2;
            String str3 = this.f14165a;
            if (str3 != null && (str = this.f14166b) != null && (str2 = this.f14167c) != null) {
                return new d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14165a == null) {
                sb2.append(" arch");
            }
            if (this.f14166b == null) {
                sb2.append(" libraryName");
            }
            if (this.f14167c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.a.AbstractC0197a.AbstractC0198a
        public h0.a.AbstractC0197a.AbstractC0198a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f14165a = str;
            return this;
        }

        @Override // e3.h0.a.AbstractC0197a.AbstractC0198a
        public h0.a.AbstractC0197a.AbstractC0198a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f14167c = str;
            return this;
        }

        @Override // e3.h0.a.AbstractC0197a.AbstractC0198a
        public h0.a.AbstractC0197a.AbstractC0198a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f14166b = str;
            return this;
        }
    }

    @Override // e3.h0.a.AbstractC0197a
    public String b() {
        return this.f14162a;
    }

    @Override // e3.h0.a.AbstractC0197a
    public String c() {
        return this.f14164c;
    }

    @Override // e3.h0.a.AbstractC0197a
    public String d() {
        return this.f14163b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.a.AbstractC0197a)) {
            return false;
        }
        h0.a.AbstractC0197a abstractC0197a = (h0.a.AbstractC0197a) obj;
        return this.f14162a.equals(abstractC0197a.b()) && this.f14163b.equals(abstractC0197a.d()) && this.f14164c.equals(abstractC0197a.c());
    }

    public int hashCode() {
        return ((((this.f14162a.hashCode() ^ 1000003) * 1000003) ^ this.f14163b.hashCode()) * 1000003) ^ this.f14164c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f14162a + ", libraryName=" + this.f14163b + ", buildId=" + this.f14164c + "}";
    }

    private d(String str, String str2, String str3) {
        this.f14162a = str;
        this.f14163b = str2;
        this.f14164c = str3;
    }
}
