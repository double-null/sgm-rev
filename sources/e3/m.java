package e3;

import com.vungle.ads.internal.network.converters.vY.vgmm;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* JADX INFO: loaded from: classes4.dex */
final class m extends h0.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f14255i;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    static final class b extends h0.f.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f14259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f14260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f14261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f14263h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f14264i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f14265j;

        b() {
        }

        @Override // e3.h0.f.c.a
        public h0.f.c a() {
            String str;
            String str2;
            String str3;
            if (this.f14265j == 63 && (str = this.f14257b) != null && (str2 = this.f14263h) != null && (str3 = this.f14264i) != null) {
                return new m(this.f14256a, str, this.f14258c, this.f14259d, this.f14260e, this.f14261f, this.f14262g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f14265j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f14257b == null) {
                sb2.append(" model");
            }
            if ((this.f14265j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f14265j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f14265j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f14265j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f14265j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f14263h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f14264i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a b(int i10) {
            this.f14256a = i10;
            this.f14265j = (byte) (this.f14265j | 1);
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a c(int i10) {
            this.f14258c = i10;
            this.f14265j = (byte) (this.f14265j | 2);
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a d(long j10) {
            this.f14260e = j10;
            this.f14265j = (byte) (this.f14265j | 8);
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f14263h = str;
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f14257b = str;
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f14264i = str;
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a h(long j10) {
            this.f14259d = j10;
            this.f14265j = (byte) (this.f14265j | 4);
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a i(boolean z10) {
            this.f14261f = z10;
            this.f14265j = (byte) (this.f14265j | 16);
            return this;
        }

        @Override // e3.h0.f.c.a
        public h0.f.c.a j(int i10) {
            this.f14262g = i10;
            this.f14265j = (byte) (this.f14265j | 32);
            return this;
        }
    }

    @Override // e3.h0.f.c
    public int b() {
        return this.f14247a;
    }

    @Override // e3.h0.f.c
    public int c() {
        return this.f14249c;
    }

    @Override // e3.h0.f.c
    public long d() {
        return this.f14251e;
    }

    @Override // e3.h0.f.c
    public String e() {
        return this.f14254h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.c)) {
            return false;
        }
        h0.f.c cVar = (h0.f.c) obj;
        return this.f14247a == cVar.b() && this.f14248b.equals(cVar.f()) && this.f14249c == cVar.c() && this.f14250d == cVar.h() && this.f14251e == cVar.d() && this.f14252f == cVar.j() && this.f14253g == cVar.i() && this.f14254h.equals(cVar.e()) && this.f14255i.equals(cVar.g());
    }

    @Override // e3.h0.f.c
    public String f() {
        return this.f14248b;
    }

    @Override // e3.h0.f.c
    public String g() {
        return this.f14255i;
    }

    @Override // e3.h0.f.c
    public long h() {
        return this.f14250d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f14247a ^ 1000003) * 1000003) ^ this.f14248b.hashCode()) * 1000003) ^ this.f14249c) * 1000003;
        long j10 = this.f14250d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14251e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14252f ? 1231 : 1237)) * 1000003) ^ this.f14253g) * 1000003) ^ this.f14254h.hashCode()) * 1000003) ^ this.f14255i.hashCode();
    }

    @Override // e3.h0.f.c
    public int i() {
        return this.f14253g;
    }

    @Override // e3.h0.f.c
    public boolean j() {
        return this.f14252f;
    }

    private m(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f14247a = i10;
        this.f14248b = str;
        this.f14249c = i11;
        this.f14250d = j10;
        this.f14251e = j11;
        this.f14252f = z10;
        this.f14253g = i12;
        this.f14254h = str2;
        this.f14255i = str3;
    }

    public String toString() {
        return "Device{arch=" + this.f14247a + ", model=" + this.f14248b + ", cores=" + this.f14249c + ", ram=" + this.f14250d + vgmm.kudWOfe + this.f14251e + ", simulator=" + this.f14252f + ", state=" + this.f14253g + ", manufacturer=" + this.f14254h + ", modelClass=" + this.f14255i + "}";
    }
}
