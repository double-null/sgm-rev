package w3;

/* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f27501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f27505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f27506h;

    /* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f27508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f27510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f27511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f27512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f27513g;

        @Override // w3.d.a
        public d a() {
            String str = "";
            if (this.f27508b == null) {
                str = " registrationStatus";
            }
            if (this.f27511e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f27512f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f27507a, this.f27508b, this.f27509c, this.f27510d, this.f27511e.longValue(), this.f27512f.longValue(), this.f27513g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w3.d.a
        public d.a b(String str) {
            this.f27509c = str;
            return this;
        }

        @Override // w3.d.a
        public d.a c(long j10) {
            this.f27511e = Long.valueOf(j10);
            return this;
        }

        @Override // w3.d.a
        public d.a d(String str) {
            this.f27507a = str;
            return this;
        }

        @Override // w3.d.a
        public d.a e(String str) {
            this.f27513g = str;
            return this;
        }

        @Override // w3.d.a
        public d.a f(String str) {
            this.f27510d = str;
            return this;
        }

        @Override // w3.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f27508b = aVar;
            return this;
        }

        @Override // w3.d.a
        public d.a h(long j10) {
            this.f27512f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f27507a = dVar.d();
            this.f27508b = dVar.g();
            this.f27509c = dVar.b();
            this.f27510d = dVar.f();
            this.f27511e = Long.valueOf(dVar.c());
            this.f27512f = Long.valueOf(dVar.h());
            this.f27513g = dVar.e();
        }
    }

    @Override // w3.d
    public String b() {
        return this.f27502d;
    }

    @Override // w3.d
    public long c() {
        return this.f27504f;
    }

    @Override // w3.d
    public String d() {
        return this.f27500b;
    }

    @Override // w3.d
    public String e() {
        return this.f27506h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f27500b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f27501c.equals(dVar.g()) && ((str = this.f27502d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f27503e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f27504f == dVar.c() && this.f27505g == dVar.h()) {
                String str4 = this.f27506h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w3.d
    public String f() {
        return this.f27503e;
    }

    @Override // w3.d
    public c.a g() {
        return this.f27501c;
    }

    @Override // w3.d
    public long h() {
        return this.f27505g;
    }

    public int hashCode() {
        String str = this.f27500b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27501c.hashCode()) * 1000003;
        String str2 = this.f27502d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27503e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f27504f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f27505g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f27506h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // w3.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f27500b + ", registrationStatus=" + this.f27501c + ", authToken=" + this.f27502d + ", refreshToken=" + this.f27503e + ", expiresInSecs=" + this.f27504f + ", tokenCreationEpochInSecs=" + this.f27505g + ", fisError=" + this.f27506h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f27500b = str;
        this.f27501c = aVar;
        this.f27502d = str2;
        this.f27503e = str3;
        this.f27504f = j10;
        this.f27505g = j11;
        this.f27506h = str4;
    }
}
