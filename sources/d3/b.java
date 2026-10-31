package d3;

import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f13258f;

    @Override // d3.j
    public String c() {
        return this.f13255c;
    }

    @Override // d3.j
    public String d() {
        return this.f13256d;
    }

    @Override // d3.j
    public String e() {
        return this.f13254b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13254b.equals(jVar.e()) && this.f13255c.equals(jVar.c()) && this.f13256d.equals(jVar.d()) && this.f13257e.equals(jVar.g()) && this.f13258f == jVar.f();
    }

    @Override // d3.j
    public long f() {
        return this.f13258f;
    }

    @Override // d3.j
    public String g() {
        return this.f13257e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f13254b.hashCode() ^ 1000003) * 1000003) ^ this.f13255c.hashCode()) * 1000003) ^ this.f13256d.hashCode()) * 1000003) ^ this.f13257e.hashCode()) * 1000003;
        long j10 = this.f13258f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f13254b + ", parameterKey=" + this.f13255c + ", parameterValue=" + this.f13256d + ", variantId=" + this.f13257e + ", templateVersion=" + this.f13258f + "}";
    }

    b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f13254b = str;
            if (str2 != null) {
                this.f13255c = str2;
                if (str3 != null) {
                    this.f13256d = str3;
                    if (str4 != null) {
                        this.f13257e = str4;
                        this.f13258f = j10;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException(yhXxbqGRMeI.wZF);
        }
        throw new NullPointerException("Null rolloutId");
    }
}
