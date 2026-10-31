package x3;

/* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f27978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f27979e;

    /* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f27983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f27984e;

        b() {
        }

        @Override // x3.d.a
        public d a() {
            return new a(this.f27980a, this.f27981b, this.f27982c, this.f27983d, this.f27984e);
        }

        @Override // x3.d.a
        public d.a b(f fVar) {
            this.f27983d = fVar;
            return this;
        }

        @Override // x3.d.a
        public d.a c(String str) {
            this.f27981b = str;
            return this;
        }

        @Override // x3.d.a
        public d.a d(String str) {
            this.f27982c = str;
            return this;
        }

        @Override // x3.d.a
        public d.a e(d.b bVar) {
            this.f27984e = bVar;
            return this;
        }

        @Override // x3.d.a
        public d.a f(String str) {
            this.f27980a = str;
            return this;
        }
    }

    @Override // x3.d
    public f b() {
        return this.f27978d;
    }

    @Override // x3.d
    public String c() {
        return this.f27976b;
    }

    @Override // x3.d
    public String d() {
        return this.f27977c;
    }

    @Override // x3.d
    public d.b e() {
        return this.f27979e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f27975a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f27976b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f27977c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f27978d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f27979e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // x3.d
    public String f() {
        return this.f27975a;
    }

    public int hashCode() {
        String str = this.f27975a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f27976b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27977c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f27978d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f27979e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f27975a + ", fid=" + this.f27976b + ", refreshToken=" + this.f27977c + ", authToken=" + this.f27978d + ", responseCode=" + this.f27979e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f27975a = str;
        this.f27976b = str2;
        this.f27977c = str3;
        this.f27978d = fVar;
        this.f27979e = bVar;
    }
}
