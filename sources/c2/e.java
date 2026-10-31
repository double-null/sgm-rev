package c2;

/* JADX INFO: compiled from: AutoValue_ClientInfo.java */
/* JADX INFO: loaded from: classes3.dex */
final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.b f4592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2.a f4593b;

    /* JADX INFO: compiled from: AutoValue_ClientInfo.java */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b f4594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c2.a f4595b;

        b() {
        }

        @Override // c2.o.a
        public o a() {
            return new e(this.f4594a, this.f4595b);
        }

        @Override // c2.o.a
        public o.a b(c2.a aVar) {
            this.f4595b = aVar;
            return this;
        }

        @Override // c2.o.a
        public o.a c(o.b bVar) {
            this.f4594a = bVar;
            return this;
        }
    }

    @Override // c2.o
    public c2.a b() {
        return this.f4593b;
    }

    @Override // c2.o
    public o.b c() {
        return this.f4592a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f4592a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            c2.a aVar = this.f4593b;
            if (aVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f4592a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        c2.a aVar = this.f4593b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f4592a + ", androidClientInfo=" + this.f4593b + "}";
    }

    private e(o.b bVar, c2.a aVar) {
        this.f4592a = bVar;
        this.f4593b = aVar;
    }
}
