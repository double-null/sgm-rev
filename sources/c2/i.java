package c2;

/* JADX INFO: compiled from: AutoValue_ExternalPrivacyContext.java */
/* JADX INFO: loaded from: classes3.dex */
final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f4606a;

    /* JADX INFO: compiled from: AutoValue_ExternalPrivacyContext.java */
    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f4607a;

        b() {
        }

        @Override // c2.s.a
        public s a() {
            return new i(this.f4607a);
        }

        @Override // c2.s.a
        public s.a b(r rVar) {
            this.f4607a = rVar;
            return this;
        }
    }

    @Override // c2.s
    public r b() {
        return this.f4606a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f4606a;
        r rVarB = ((s) obj).b();
        if (rVar == null) {
            return rVarB == null;
        }
        return rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f4606a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f4606a + "}";
    }

    private i(r rVar) {
        this.f4606a = rVar;
    }
}
