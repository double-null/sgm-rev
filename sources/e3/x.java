package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* JADX INFO: loaded from: classes4.dex */
final class x extends h0.f.d.AbstractC0211d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14373a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    static final class b extends h0.f.d.AbstractC0211d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14374a;

        b() {
        }

        @Override // e3.h0.f.d.AbstractC0211d.a
        public h0.f.d.AbstractC0211d a() {
            String str = this.f14374a;
            if (str != null) {
                return new x(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // e3.h0.f.d.AbstractC0211d.a
        public h0.f.d.AbstractC0211d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f14374a = str;
            return this;
        }
    }

    @Override // e3.h0.f.d.AbstractC0211d
    public String b() {
        return this.f14373a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.AbstractC0211d) {
            return this.f14373a.equals(((h0.f.d.AbstractC0211d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14373a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f14373a + "}";
    }

    private x(String str) {
        this.f14373a = str;
    }
}
