package e3;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_OsData.java */
/* JADX INFO: loaded from: classes4.dex */
final class g0 extends i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14200c;

    g0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f14198a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f14199b = str2;
        this.f14200c = z10;
    }

    @Override // e3.i0.c
    public boolean b() {
        return this.f14200c;
    }

    @Override // e3.i0.c
    public String c() {
        return this.f14199b;
    }

    @Override // e3.i0.c
    public String d() {
        return this.f14198a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0.c)) {
            return false;
        }
        i0.c cVar = (i0.c) obj;
        return this.f14198a.equals(cVar.d()) && this.f14199b.equals(cVar.c()) && this.f14200c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f14198a.hashCode() ^ 1000003) * 1000003) ^ this.f14199b.hashCode()) * 1000003) ^ (this.f14200c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f14198a + ", osCodeName=" + this.f14199b + ", isRooted=" + this.f14200c + "}";
    }
}
