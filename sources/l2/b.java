package l2;

/* JADX INFO: compiled from: AutoValue_PersistedEvent.java */
/* JADX INFO: loaded from: classes3.dex */
final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2.p f21664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2.i f21665c;

    b(long j10, d2.p pVar, d2.i iVar) {
        this.f21663a = j10;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f21664b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f21665c = iVar;
    }

    @Override // l2.k
    public d2.i b() {
        return this.f21665c;
    }

    @Override // l2.k
    public long c() {
        return this.f21663a;
    }

    @Override // l2.k
    public d2.p d() {
        return this.f21664b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f21663a == kVar.c() && this.f21664b.equals(kVar.d()) && this.f21665c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f21663a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21664b.hashCode()) * 1000003) ^ this.f21665c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f21663a + ", transportContext=" + this.f21664b + ", event=" + this.f21665c + "}";
    }
}
