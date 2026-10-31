package e3;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ProfilingManagerInfo_ProfilingTrigger.java */
/* JADX INFO: loaded from: classes4.dex */
final class i extends h0.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14204a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ProfilingManagerInfo_ProfilingTrigger.java */
    static final class b extends h0.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f14206b;

        b() {
        }

        @Override // e3.h0.e.b.a
        public h0.e.b a() {
            if (this.f14206b == 1) {
                return new i(this.f14205a);
            }
            throw new IllegalStateException("Missing required properties: trigger");
        }

        @Override // e3.h0.e.b.a
        public h0.e.b.a b(int i10) {
            this.f14205a = i10;
            this.f14206b = (byte) (this.f14206b | 1);
            return this;
        }
    }

    @Override // e3.h0.e.b
    public int b() {
        return this.f14204a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof h0.e.b) && this.f14204a == ((h0.e.b) obj).b();
    }

    public int hashCode() {
        return 1000003 ^ this.f14204a;
    }

    public String toString() {
        return "ProfilingTrigger{trigger=" + this.f14204a + "}";
    }

    private i(int i10) {
        this.f14204a = i10;
    }
}
