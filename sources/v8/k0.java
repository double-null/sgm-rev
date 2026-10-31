package v8;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f27349c = new k0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27351b;

    public k0(long j10, long j11) {
        this.f27350a = j10;
        this.f27351b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f27350a == k0Var.f27350a && this.f27351b == k0Var.f27351b;
    }

    public int hashCode() {
        return (((int) this.f27350a) * 31) + ((int) this.f27351b);
    }

    public String toString() {
        return "[timeUs=" + this.f27350a + ", position=" + this.f27351b + "]";
    }
}
