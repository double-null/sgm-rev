package x3;

/* JADX INFO: compiled from: AutoValue_TokenResult.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f27987c;

    /* JADX INFO: renamed from: x3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_TokenResult.java */
    static final class C0466b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f27989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f27990c;

        C0466b() {
        }

        @Override // x3.f.a
        public f a() {
            String str = "";
            if (this.f27989b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f27988a, this.f27989b.longValue(), this.f27990c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x3.f.a
        public f.a b(f.b bVar) {
            this.f27990c = bVar;
            return this;
        }

        @Override // x3.f.a
        public f.a c(String str) {
            this.f27988a = str;
            return this;
        }

        @Override // x3.f.a
        public f.a d(long j10) {
            this.f27989b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // x3.f
    public f.b b() {
        return this.f27987c;
    }

    @Override // x3.f
    public String c() {
        return this.f27985a;
    }

    @Override // x3.f
    public long d() {
        return this.f27986b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f27985a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f27986b == fVar.d()) {
                f.b bVar = this.f27987c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f27985a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f27986b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f27987c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f27985a + ", tokenExpirationTimestamp=" + this.f27986b + ", responseCode=" + this.f27987c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f27985a = str;
        this.f27986b = j10;
        this.f27987c = bVar;
    }
}
