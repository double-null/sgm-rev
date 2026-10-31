package k2;

import java.util.Set;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* JADX INFO: loaded from: classes3.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f.c> f21142c;

    /* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f21143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f21144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<f.c> f21145c;

        b() {
        }

        @Override // k2.f.b.a
        public f.b a() {
            String str = "";
            if (this.f21143a == null) {
                str = " delta";
            }
            if (this.f21144b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f21145c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f21143a.longValue(), this.f21144b.longValue(), this.f21145c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k2.f.b.a
        public f.b.a b(long j10) {
            this.f21143a = Long.valueOf(j10);
            return this;
        }

        @Override // k2.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f21145c = set;
            return this;
        }

        @Override // k2.f.b.a
        public f.b.a d(long j10) {
            this.f21144b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // k2.f.b
    long b() {
        return this.f21140a;
    }

    @Override // k2.f.b
    Set<f.c> c() {
        return this.f21142c;
    }

    @Override // k2.f.b
    long d() {
        return this.f21141b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f21140a == bVar.b() && this.f21141b == bVar.d() && this.f21142c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f21140a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f21141b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f21142c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f21140a + ", maxAllowedDelay=" + this.f21141b + ", flags=" + this.f21142c + "}";
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f21140a = j10;
        this.f21141b = j11;
        this.f21142c = set;
    }
}
