package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: Topic.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3032c;

    public f(long j10, long j11, int i10) {
        this.f3030a = j10;
        this.f3031b = j11;
        this.f3032c = i10;
    }

    public final long a() {
        return this.f3031b;
    }

    public final long b() {
        return this.f3030a;
    }

    public final int c() {
        return this.f3032c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3030a == fVar.f3030a && this.f3031b == fVar.f3031b && this.f3032c == fVar.f3032c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f3030a) * 31) + Long.hashCode(this.f3031b)) * 31) + Integer.hashCode(this.f3032c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f3030a + ", ModelVersion=" + this.f3031b + ", TopicCode=" + this.f3032c + " }");
    }
}
