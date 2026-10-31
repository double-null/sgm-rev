package b4;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f3877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f3878f;

    public b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, v logEnvironment, a androidAppInfo) {
        kotlin.jvm.internal.t.f(appId, "appId");
        kotlin.jvm.internal.t.f(deviceModel, "deviceModel");
        kotlin.jvm.internal.t.f(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.t.f(osVersion, "osVersion");
        kotlin.jvm.internal.t.f(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.t.f(androidAppInfo, "androidAppInfo");
        this.f3873a = appId;
        this.f3874b = deviceModel;
        this.f3875c = sessionSdkVersion;
        this.f3876d = osVersion;
        this.f3877e = logEnvironment;
        this.f3878f = androidAppInfo;
    }

    public final a a() {
        return this.f3878f;
    }

    public final String b() {
        return this.f3873a;
    }

    public final String c() {
        return this.f3874b;
    }

    public final v d() {
        return this.f3877e;
    }

    public final String e() {
        return this.f3876d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.t.a(this.f3873a, bVar.f3873a) && kotlin.jvm.internal.t.a(this.f3874b, bVar.f3874b) && kotlin.jvm.internal.t.a(this.f3875c, bVar.f3875c) && kotlin.jvm.internal.t.a(this.f3876d, bVar.f3876d) && this.f3877e == bVar.f3877e && kotlin.jvm.internal.t.a(this.f3878f, bVar.f3878f);
    }

    public final String f() {
        return this.f3875c;
    }

    public int hashCode() {
        return (((((((((this.f3873a.hashCode() * 31) + this.f3874b.hashCode()) * 31) + this.f3875c.hashCode()) * 31) + this.f3876d.hashCode()) * 31) + this.f3877e.hashCode()) * 31) + this.f3878f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f3873a + ", deviceModel=" + this.f3874b + ", sessionSdkVersion=" + this.f3875c + ", osVersion=" + this.f3876d + ", logEnvironment=" + this.f3877e + ", androidAppInfo=" + this.f3878f + ')';
    }
}
