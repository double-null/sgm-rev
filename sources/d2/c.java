package d2;

/* JADX INFO: compiled from: AutoValue_SendRequest.java */
/* JADX INFO: loaded from: classes3.dex */
final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f13192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2.c<?> f13194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b2.g<?, byte[]> f13195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b2.b f13196e;

    /* JADX INFO: compiled from: AutoValue_SendRequest.java */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f13197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b2.c<?> f13199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b2.g<?, byte[]> f13200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b2.b f13201e;

        b() {
        }

        @Override // d2.o.a
        public o a() {
            String str = "";
            if (this.f13197a == null) {
                str = " transportContext";
            }
            if (this.f13198b == null) {
                str = str + " transportName";
            }
            if (this.f13199c == null) {
                str = str + " event";
            }
            if (this.f13200d == null) {
                str = str + " transformer";
            }
            if (this.f13201e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f13197a, this.f13198b, this.f13199c, this.f13200d, this.f13201e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // d2.o.a
        o.a b(b2.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f13201e = bVar;
            return this;
        }

        @Override // d2.o.a
        o.a c(b2.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f13199c = cVar;
            return this;
        }

        @Override // d2.o.a
        o.a d(b2.g<?, byte[]> gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f13200d = gVar;
            return this;
        }

        @Override // d2.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f13197a = pVar;
            return this;
        }

        @Override // d2.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f13198b = str;
            return this;
        }
    }

    @Override // d2.o
    public b2.b b() {
        return this.f13196e;
    }

    @Override // d2.o
    b2.c<?> c() {
        return this.f13194c;
    }

    @Override // d2.o
    b2.g<?, byte[]> e() {
        return this.f13195d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f13192a.equals(oVar.f()) && this.f13193b.equals(oVar.g()) && this.f13194c.equals(oVar.c()) && this.f13195d.equals(oVar.e()) && this.f13196e.equals(oVar.b());
    }

    @Override // d2.o
    public p f() {
        return this.f13192a;
    }

    @Override // d2.o
    public String g() {
        return this.f13193b;
    }

    public int hashCode() {
        return ((((((((this.f13192a.hashCode() ^ 1000003) * 1000003) ^ this.f13193b.hashCode()) * 1000003) ^ this.f13194c.hashCode()) * 1000003) ^ this.f13195d.hashCode()) * 1000003) ^ this.f13196e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f13192a + ", transportName=" + this.f13193b + ", event=" + this.f13194c + ", transformer=" + this.f13195d + ", encoding=" + this.f13196e + "}";
    }

    private c(p pVar, String str, b2.c<?> cVar, b2.g<?, byte[]> gVar, b2.b bVar) {
        this.f13192a = pVar;
        this.f13193b = str;
        this.f13194c = cVar;
        this.f13195d = gVar;
        this.f13196e = bVar;
    }
}
