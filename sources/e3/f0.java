package e3;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* JADX INFO: loaded from: classes4.dex */
final class f0 extends i0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f14193i;

    f0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f14185a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f14186b = str;
        this.f14187c = i11;
        this.f14188d = j10;
        this.f14189e = j11;
        this.f14190f = z10;
        this.f14191g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f14192h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f14193i = str3;
    }

    @Override // e3.i0.b
    public int a() {
        return this.f14185a;
    }

    @Override // e3.i0.b
    public int b() {
        return this.f14187c;
    }

    @Override // e3.i0.b
    public long d() {
        return this.f14189e;
    }

    @Override // e3.i0.b
    public boolean e() {
        return this.f14190f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0.b)) {
            return false;
        }
        i0.b bVar = (i0.b) obj;
        return this.f14185a == bVar.a() && this.f14186b.equals(bVar.g()) && this.f14187c == bVar.b() && this.f14188d == bVar.j() && this.f14189e == bVar.d() && this.f14190f == bVar.e() && this.f14191g == bVar.i() && this.f14192h.equals(bVar.f()) && this.f14193i.equals(bVar.h());
    }

    @Override // e3.i0.b
    public String f() {
        return this.f14192h;
    }

    @Override // e3.i0.b
    public String g() {
        return this.f14186b;
    }

    @Override // e3.i0.b
    public String h() {
        return this.f14193i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f14185a ^ 1000003) * 1000003) ^ this.f14186b.hashCode()) * 1000003) ^ this.f14187c) * 1000003;
        long j10 = this.f14188d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14189e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14190f ? 1231 : 1237)) * 1000003) ^ this.f14191g) * 1000003) ^ this.f14192h.hashCode()) * 1000003) ^ this.f14193i.hashCode();
    }

    @Override // e3.i0.b
    public int i() {
        return this.f14191g;
    }

    @Override // e3.i0.b
    public long j() {
        return this.f14188d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f14185a + ", model=" + this.f14186b + ", availableProcessors=" + this.f14187c + ", totalRam=" + this.f14188d + ", diskSpace=" + this.f14189e + ", isEmulator=" + this.f14190f + ", state=" + this.f14191g + ", manufacturer=" + this.f14192h + ", modelClass=" + this.f14193i + "}";
    }
}
