package d6;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13344d;

    public d(String str, long j10, long j11, String str2) {
        this.f13341a = str;
        this.f13342b = j10;
        this.f13343c = j11;
        this.f13344d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f13342b == dVar.f13342b && this.f13343c == dVar.f13343c && this.f13341a.equals(dVar.f13341a)) {
            return this.f13344d.equals(dVar.f13344d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f13341a.hashCode() * 31;
        long j10 = this.f13342b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f13343c;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f13344d.hashCode();
    }

    public final String toString() {
        return "InternalAccessToken{accessToken='#####', expiresInMillis=" + this.f13342b + ", issuedClientTimeMillis=" + this.f13343c + ", refreshToken='" + this.f13344d + "'}";
    }
}
