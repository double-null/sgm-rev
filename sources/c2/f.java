package c2;

/* JADX INFO: compiled from: AutoValue_ComplianceData.java */
/* JADX INFO: loaded from: classes3.dex */
final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f4596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.b f4597b;

    /* JADX INFO: compiled from: AutoValue_ComplianceData.java */
    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f4598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b f4599b;

        b() {
        }

        @Override // c2.p.a
        public p a() {
            return new f(this.f4598a, this.f4599b);
        }

        @Override // c2.p.a
        public p.a b(s sVar) {
            this.f4598a = sVar;
            return this;
        }

        @Override // c2.p.a
        public p.a c(p.b bVar) {
            this.f4599b = bVar;
            return this;
        }
    }

    @Override // c2.p
    public s b() {
        return this.f4596a;
    }

    @Override // c2.p
    public p.b c() {
        return this.f4597b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f4596a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f4597b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f4596a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f4597b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f4596a + ", productIdOrigin=" + this.f4597b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f4596a = sVar;
        this.f4597b = bVar;
    }
}
