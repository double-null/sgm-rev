package c2;

/* JADX INFO: compiled from: AutoValue_LogResponse.java */
/* JADX INFO: loaded from: classes3.dex */
final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4640a;

    l(long j10) {
        this.f4640a = j10;
    }

    @Override // c2.v
    public long c() {
        return this.f4640a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f4640a == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f4640a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f4640a + "}";
    }
}
