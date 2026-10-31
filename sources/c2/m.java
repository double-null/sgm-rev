package c2;

/* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
/* JADX INFO: loaded from: classes3.dex */
final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f4641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f4642b;

    /* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
    static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w.c f4643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b f4644b;

        b() {
        }

        @Override // c2.w.a
        public w a() {
            return new m(this.f4643a, this.f4644b);
        }

        @Override // c2.w.a
        public w.a b(w.b bVar) {
            this.f4644b = bVar;
            return this;
        }

        @Override // c2.w.a
        public w.a c(w.c cVar) {
            this.f4643a = cVar;
            return this;
        }
    }

    @Override // c2.w
    public w.b b() {
        return this.f4642b;
    }

    @Override // c2.w
    public w.c c() {
        return this.f4641a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f4641a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f4642b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f4641a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f4642b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f4641a + ", mobileSubtype=" + this.f4642b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f4641a = cVar;
        this.f4642b = bVar;
    }
}
