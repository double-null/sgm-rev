package e3;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_AppData.java */
/* JADX INFO: loaded from: classes4.dex */
final class e0 extends i0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z2.e f14180f;

    @Override // e3.i0.a
    public String a() {
        return this.f14175a;
    }

    @Override // e3.i0.a
    public int c() {
        return this.f14179e;
    }

    @Override // e3.i0.a
    public z2.e d() {
        return this.f14180f;
    }

    @Override // e3.i0.a
    public String e() {
        return this.f14178d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0.a)) {
            return false;
        }
        i0.a aVar = (i0.a) obj;
        return this.f14175a.equals(aVar.a()) && this.f14176b.equals(aVar.f()) && this.f14177c.equals(aVar.g()) && this.f14178d.equals(aVar.e()) && this.f14179e == aVar.c() && this.f14180f.equals(aVar.d());
    }

    @Override // e3.i0.a
    public String f() {
        return this.f14176b;
    }

    @Override // e3.i0.a
    public String g() {
        return this.f14177c;
    }

    public int hashCode() {
        return ((((((((((this.f14175a.hashCode() ^ 1000003) * 1000003) ^ this.f14176b.hashCode()) * 1000003) ^ this.f14177c.hashCode()) * 1000003) ^ this.f14178d.hashCode()) * 1000003) ^ this.f14179e) * 1000003) ^ this.f14180f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f14175a + ", versionCode=" + this.f14176b + ", versionName=" + this.f14177c + ", installUuid=" + this.f14178d + ", deliveryMechanism=" + this.f14179e + ", developmentPlatformProvider=" + this.f14180f + "}";
    }

    e0(String str, String str2, String str3, String str4, int i10, z2.e eVar) {
        if (str != null) {
            this.f14175a = str;
            if (str2 != null) {
                this.f14176b = str2;
                if (str3 != null) {
                    this.f14177c = str3;
                    if (str4 != null) {
                        this.f14178d = str4;
                        this.f14179e = i10;
                        if (eVar != null) {
                            this.f14180f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException(sRGQSqxgxlS.lOmJ);
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }
}
