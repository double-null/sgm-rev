package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* JADX INFO: loaded from: classes4.dex */
final class n extends h0.f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0.f.d.a f14268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.f.d.c f14269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.f.d.AbstractC0211d f14270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h0.f.d.AbstractC0212f f14271f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    static final class b extends h0.f.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f14272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h0.f.d.a f14274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.f.d.c f14275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h0.f.d.AbstractC0211d f14276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h0.f.d.AbstractC0212f f14277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f14278g;

        @Override // e3.h0.f.d.b
        public h0.f.d a() {
            String str;
            h0.f.d.a aVar;
            h0.f.d.c cVar;
            if (this.f14278g == 1 && (str = this.f14273b) != null && (aVar = this.f14274c) != null && (cVar = this.f14275d) != null) {
                return new n(this.f14272a, str, aVar, cVar, this.f14276e, this.f14277f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f14278g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f14273b == null) {
                sb2.append(" type");
            }
            if (this.f14274c == null) {
                sb2.append(" app");
            }
            if (this.f14275d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.b
        public h0.f.d.b b(h0.f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f14274c = aVar;
            return this;
        }

        @Override // e3.h0.f.d.b
        public h0.f.d.b c(h0.f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f14275d = cVar;
            return this;
        }

        @Override // e3.h0.f.d.b
        public h0.f.d.b d(h0.f.d.AbstractC0211d abstractC0211d) {
            this.f14276e = abstractC0211d;
            return this;
        }

        @Override // e3.h0.f.d.b
        public h0.f.d.b e(h0.f.d.AbstractC0212f abstractC0212f) {
            this.f14277f = abstractC0212f;
            return this;
        }

        @Override // e3.h0.f.d.b
        public h0.f.d.b f(long j10) {
            this.f14272a = j10;
            this.f14278g = (byte) (this.f14278g | 1);
            return this;
        }

        @Override // e3.h0.f.d.b
        public h0.f.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f14273b = str;
            return this;
        }

        b() {
        }

        private b(h0.f.d dVar) {
            this.f14272a = dVar.f();
            this.f14273b = dVar.g();
            this.f14274c = dVar.b();
            this.f14275d = dVar.c();
            this.f14276e = dVar.d();
            this.f14277f = dVar.e();
            this.f14278g = (byte) 1;
        }
    }

    @Override // e3.h0.f.d
    public h0.f.d.a b() {
        return this.f14268c;
    }

    @Override // e3.h0.f.d
    public h0.f.d.c c() {
        return this.f14269d;
    }

    @Override // e3.h0.f.d
    public h0.f.d.AbstractC0211d d() {
        return this.f14270e;
    }

    @Override // e3.h0.f.d
    public h0.f.d.AbstractC0212f e() {
        return this.f14271f;
    }

    public boolean equals(Object obj) {
        h0.f.d.AbstractC0211d abstractC0211d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d)) {
            return false;
        }
        h0.f.d dVar = (h0.f.d) obj;
        if (this.f14266a == dVar.f() && this.f14267b.equals(dVar.g()) && this.f14268c.equals(dVar.b()) && this.f14269d.equals(dVar.c()) && ((abstractC0211d = this.f14270e) != null ? abstractC0211d.equals(dVar.d()) : dVar.d() == null)) {
            h0.f.d.AbstractC0212f abstractC0212f = this.f14271f;
            if (abstractC0212f == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (abstractC0212f.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.h0.f.d
    public long f() {
        return this.f14266a;
    }

    @Override // e3.h0.f.d
    public String g() {
        return this.f14267b;
    }

    @Override // e3.h0.f.d
    public h0.f.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f14266a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14267b.hashCode()) * 1000003) ^ this.f14268c.hashCode()) * 1000003) ^ this.f14269d.hashCode()) * 1000003;
        h0.f.d.AbstractC0211d abstractC0211d = this.f14270e;
        int iHashCode2 = (iHashCode ^ (abstractC0211d == null ? 0 : abstractC0211d.hashCode())) * 1000003;
        h0.f.d.AbstractC0212f abstractC0212f = this.f14271f;
        return iHashCode2 ^ (abstractC0212f != null ? abstractC0212f.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f14266a + ", type=" + this.f14267b + ", app=" + this.f14268c + ", device=" + this.f14269d + ", log=" + this.f14270e + ", rollouts=" + this.f14271f + "}";
    }

    private n(long j10, String str, h0.f.d.a aVar, h0.f.d.c cVar, h0.f.d.AbstractC0211d abstractC0211d, h0.f.d.AbstractC0212f abstractC0212f) {
        this.f14266a = j10;
        this.f14267b = str;
        this.f14268c = aVar;
        this.f14269d = cVar;
        this.f14270e = abstractC0211d;
        this.f14271f = abstractC0212f;
    }
}
