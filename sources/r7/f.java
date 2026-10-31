package r7;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: VersionMilestone.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hc.a f24920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f24924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24925f;

    public f(hc.a version, int i10, long j10, long j11, long j12, long j13) {
        t.f(version, "version");
        this.f24920a = version;
        this.f24921b = i10;
        this.f24922c = j10;
        this.f24923d = j11;
        this.f24924e = j12;
        this.f24925f = j13;
    }

    public final f a(hc.a version, int i10, long j10, long j11, long j12, long j13) {
        t.f(version, "version");
        return new f(version, i10, j10, j11, j12, j13);
    }

    public final long c() {
        return this.f24924e;
    }

    public final long d() {
        return this.f24922c;
    }

    public final long e() {
        return this.f24925f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t.a(this.f24920a, fVar.f24920a) && this.f24921b == fVar.f24921b && this.f24922c == fVar.f24922c && this.f24923d == fVar.f24923d && this.f24924e == fVar.f24924e && this.f24925f == fVar.f24925f;
    }

    public final long f() {
        return this.f24923d;
    }

    public final int g() {
        return this.f24921b;
    }

    public final hc.a h() {
        return this.f24920a;
    }

    public int hashCode() {
        return (((((((((this.f24920a.hashCode() * 31) + Integer.hashCode(this.f24921b)) * 31) + Long.hashCode(this.f24922c)) * 31) + Long.hashCode(this.f24923d)) * 31) + Long.hashCode(this.f24924e)) * 31) + Long.hashCode(this.f24925f);
    }

    public String toString() {
        return "VersionMilestone(version=" + this.f24920a + ", sessionCount=" + this.f24921b + ", firstSessionTime=" + this.f24922c + ", lastSessionTime=" + this.f24923d + ", currentSessionDuration=" + this.f24924e + ", lastSessionDuration=" + this.f24925f + ')';
    }
}
