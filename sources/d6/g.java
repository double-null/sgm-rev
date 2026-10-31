package d6;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13351c;

    public g(String str, long j10, String str2) {
        this.f13349a = str;
        this.f13350b = j10;
        this.f13351c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f13350b != gVar.f13350b || !this.f13349a.equals(gVar.f13349a)) {
                return false;
            }
            String str = this.f13351c;
            String str2 = gVar.f13351c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f13349a.hashCode() * 31;
        long j10 = this.f13350b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f13351c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.f13350b + ", refreshToken='#####'}";
    }
}
