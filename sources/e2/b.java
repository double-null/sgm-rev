package e2;

/* JADX INFO: compiled from: AutoValue_BackendResponse.java */
/* JADX INFO: loaded from: classes3.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f13929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13930b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f13929a = aVar;
        this.f13930b = j10;
    }

    @Override // e2.g
    public long b() {
        return this.f13930b;
    }

    @Override // e2.g
    public g.a c() {
        return this.f13929a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f13929a.equals(gVar.c()) && this.f13930b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f13929a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f13930b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f13929a + ", nextRequestWaitMillis=" + this.f13930b + "}";
    }
}
