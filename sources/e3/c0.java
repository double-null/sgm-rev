package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* JADX INFO: loaded from: classes4.dex */
final class c0 extends h0.f.AbstractC0213f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14160a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    static final class b extends h0.f.AbstractC0213f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14161a;

        b() {
        }

        @Override // e3.h0.f.AbstractC0213f.a
        public h0.f.AbstractC0213f a() {
            String str = this.f14161a;
            if (str != null) {
                return new c0(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // e3.h0.f.AbstractC0213f.a
        public h0.f.AbstractC0213f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f14161a = str;
            return this;
        }
    }

    @Override // e3.h0.f.AbstractC0213f
    public String b() {
        return this.f14160a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.AbstractC0213f) {
            return this.f14160a.equals(((h0.f.AbstractC0213f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14160a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f14160a + "}";
    }

    private c0(String str) {
        this.f14160a = str;
    }
}
