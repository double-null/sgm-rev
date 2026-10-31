package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* JADX INFO: loaded from: classes4.dex */
final class w extends h0.f.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f14360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f14365f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    static final class b extends h0.f.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f14366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f14368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f14370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f14371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f14372g;

        b() {
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c a() {
            if (this.f14372g == 31) {
                return new w(this.f14366a, this.f14367b, this.f14368c, this.f14369d, this.f14370e, this.f14371f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f14372g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f14372g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f14372g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f14372g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f14372g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c.a b(Double d10) {
            this.f14366a = d10;
            return this;
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c.a c(int i10) {
            this.f14367b = i10;
            this.f14372g = (byte) (this.f14372g | 1);
            return this;
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c.a d(long j10) {
            this.f14371f = j10;
            this.f14372g = (byte) (this.f14372g | 16);
            return this;
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c.a e(int i10) {
            this.f14369d = i10;
            this.f14372g = (byte) (this.f14372g | 4);
            return this;
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c.a f(boolean z10) {
            this.f14368c = z10;
            this.f14372g = (byte) (this.f14372g | 2);
            return this;
        }

        @Override // e3.h0.f.d.c.a
        public h0.f.d.c.a g(long j10) {
            this.f14370e = j10;
            this.f14372g = (byte) (this.f14372g | 8);
            return this;
        }
    }

    @Override // e3.h0.f.d.c
    public Double b() {
        return this.f14360a;
    }

    @Override // e3.h0.f.d.c
    public int c() {
        return this.f14361b;
    }

    @Override // e3.h0.f.d.c
    public long d() {
        return this.f14365f;
    }

    @Override // e3.h0.f.d.c
    public int e() {
        return this.f14363d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.f.d.c)) {
            return false;
        }
        h0.f.d.c cVar = (h0.f.d.c) obj;
        Double d10 = this.f14360a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            if (this.f14361b == cVar.c() && this.f14362c == cVar.g() && this.f14363d == cVar.e() && this.f14364e == cVar.f() && this.f14365f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.h0.f.d.c
    public long f() {
        return this.f14364e;
    }

    @Override // e3.h0.f.d.c
    public boolean g() {
        return this.f14362c;
    }

    public int hashCode() {
        Double d10 = this.f14360a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f14361b) * 1000003) ^ (this.f14362c ? 1231 : 1237)) * 1000003) ^ this.f14363d) * 1000003;
        long j10 = this.f14364e;
        long j11 = this.f14365f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f14360a + ", batteryVelocity=" + this.f14361b + ", proximityOn=" + this.f14362c + ", orientation=" + this.f14363d + ", ramUsed=" + this.f14364e + ", diskUsed=" + this.f14365f + "}";
    }

    private w(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f14360a = d10;
        this.f14361b = i10;
        this.f14362c = z10;
        this.f14363d = i11;
        this.f14364e = j10;
        this.f14365f = j11;
    }
}
