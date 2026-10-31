package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ProfilingManagerInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class h extends h0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.e.b f14201a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ProfilingManagerInfo.java */
    static final class b extends h0.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0.e.b f14202a;

        b() {
        }

        @Override // e3.h0.e.a
        public h0.e a() {
            h0.e.b bVar = this.f14202a;
            if (bVar != null) {
                return new h(bVar);
            }
            throw new IllegalStateException("Missing required properties: profilingTrigger");
        }

        @Override // e3.h0.e.a
        public h0.e.a b(h0.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null profilingTrigger");
            }
            this.f14202a = bVar;
            return this;
        }
    }

    @Override // e3.h0.e
    public h0.e.b b() {
        return this.f14201a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.e) {
            return this.f14201a.equals(((h0.e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14201a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f14201a + "}";
    }

    private h(h0.e.b bVar) {
        this.f14201a = bVar;
    }
}
