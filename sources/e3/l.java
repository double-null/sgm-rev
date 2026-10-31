package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* JADX INFO: loaded from: classes4.dex */
final class l extends h0.f.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14246a;

    @Override // e3.h0.f.a.b
    public String a() {
        return this.f14246a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.a.b) {
            return this.f14246a.equals(((h0.f.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f14246a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f14246a + "}";
    }
}
