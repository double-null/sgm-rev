package b4;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f4009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4011g;

    public r0(String sessionId, String firstSessionId, int i10, long j10, e dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.t.f(sessionId, "sessionId");
        kotlin.jvm.internal.t.f(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.t.f(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.t.f(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.t.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f4005a = sessionId;
        this.f4006b = firstSessionId;
        this.f4007c = i10;
        this.f4008d = j10;
        this.f4009e = dataCollectionStatus;
        this.f4010f = firebaseInstallationId;
        this.f4011g = firebaseAuthenticationToken;
    }

    public final e a() {
        return this.f4009e;
    }

    public final long b() {
        return this.f4008d;
    }

    public final String c() {
        return this.f4011g;
    }

    public final String d() {
        return this.f4010f;
    }

    public final String e() {
        return this.f4006b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.t.a(this.f4005a, r0Var.f4005a) && kotlin.jvm.internal.t.a(this.f4006b, r0Var.f4006b) && this.f4007c == r0Var.f4007c && this.f4008d == r0Var.f4008d && kotlin.jvm.internal.t.a(this.f4009e, r0Var.f4009e) && kotlin.jvm.internal.t.a(this.f4010f, r0Var.f4010f) && kotlin.jvm.internal.t.a(this.f4011g, r0Var.f4011g);
    }

    public final String f() {
        return this.f4005a;
    }

    public final int g() {
        return this.f4007c;
    }

    public int hashCode() {
        return (((((((((((this.f4005a.hashCode() * 31) + this.f4006b.hashCode()) * 31) + Integer.hashCode(this.f4007c)) * 31) + Long.hashCode(this.f4008d)) * 31) + this.f4009e.hashCode()) * 31) + this.f4010f.hashCode()) * 31) + this.f4011g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f4005a + ", firstSessionId=" + this.f4006b + ", sessionIndex=" + this.f4007c + ", eventTimestampUs=" + this.f4008d + ", dataCollectionStatus=" + this.f4009e + ", firebaseInstallationId=" + this.f4010f + ", firebaseAuthenticationToken=" + this.f4011g + ')';
    }
}
