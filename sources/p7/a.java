package p7;

/* JADX INFO: compiled from: StartupMetrics.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23492c;

    public a(long j10, long j11, boolean z10) {
        this.f23490a = j10;
        this.f23491b = j11;
        this.f23492c = z10;
    }

    public final long a() {
        return this.f23491b;
    }

    public final long b() {
        return this.f23490a;
    }

    public final boolean c() {
        return this.f23492c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23490a == aVar.f23490a && this.f23491b == aVar.f23491b && this.f23492c == aVar.f23492c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f23490a) * 31) + Long.hashCode(this.f23491b)) * 31;
        boolean z10 = this.f23492c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        return "StartupMetrics(startTime=" + this.f23490a + ", duration=" + this.f23491b + ", isFinished=" + this.f23492c + ')';
    }
}
