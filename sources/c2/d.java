package c2;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_BatchedLogRequest.java */
/* JADX INFO: loaded from: classes3.dex */
final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u> f4591a;

    d(List<u> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f4591a = list;
    }

    @Override // c2.n
    public List<u> c() {
        return this.f4591a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f4591a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f4591a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f4591a + "}";
    }
}
