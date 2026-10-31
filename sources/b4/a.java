package b4;

import java.util.List;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f3870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<d0> f3871f;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, d0 currentProcessDetails, List<d0> appProcessDetails) {
        kotlin.jvm.internal.t.f(packageName, "packageName");
        kotlin.jvm.internal.t.f(versionName, "versionName");
        kotlin.jvm.internal.t.f(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.t.f(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.t.f(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.t.f(appProcessDetails, "appProcessDetails");
        this.f3866a = packageName;
        this.f3867b = versionName;
        this.f3868c = appBuildVersion;
        this.f3869d = deviceManufacturer;
        this.f3870e = currentProcessDetails;
        this.f3871f = appProcessDetails;
    }

    public final String a() {
        return this.f3868c;
    }

    public final List<d0> b() {
        return this.f3871f;
    }

    public final d0 c() {
        return this.f3870e;
    }

    public final String d() {
        return this.f3869d;
    }

    public final String e() {
        return this.f3866a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.t.a(this.f3866a, aVar.f3866a) && kotlin.jvm.internal.t.a(this.f3867b, aVar.f3867b) && kotlin.jvm.internal.t.a(this.f3868c, aVar.f3868c) && kotlin.jvm.internal.t.a(this.f3869d, aVar.f3869d) && kotlin.jvm.internal.t.a(this.f3870e, aVar.f3870e) && kotlin.jvm.internal.t.a(this.f3871f, aVar.f3871f);
    }

    public final String f() {
        return this.f3867b;
    }

    public int hashCode() {
        return (((((((((this.f3866a.hashCode() * 31) + this.f3867b.hashCode()) * 31) + this.f3868c.hashCode()) * 31) + this.f3869d.hashCode()) * 31) + this.f3870e.hashCode()) * 31) + this.f3871f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f3866a + ", versionName=" + this.f3867b + ", appBuildVersion=" + this.f3868c + ", deviceManufacturer=" + this.f3869d + ", currentProcessDetails=" + this.f3870e + ", appProcessDetails=" + this.f3871f + ')';
    }
}
