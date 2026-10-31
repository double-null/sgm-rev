package l2;

import com.android.billingclient.gp.VRfCTjjLv;

/* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
/* JADX INFO: loaded from: classes3.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f21656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21657f;

    /* JADX INFO: compiled from: AutoValue_EventStoreConfig.java */
    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f21658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f21659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f21660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f21661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f21662e;

        b() {
        }

        @Override // l2.e.a
        e a() {
            String str = "";
            if (this.f21658a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f21659b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21660c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21661d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21662e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21658a.longValue(), this.f21659b.intValue(), this.f21660c.intValue(), this.f21661d.longValue(), this.f21662e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l2.e.a
        e.a b(int i10) {
            this.f21660c = Integer.valueOf(i10);
            return this;
        }

        @Override // l2.e.a
        e.a c(long j10) {
            this.f21661d = Long.valueOf(j10);
            return this;
        }

        @Override // l2.e.a
        e.a d(int i10) {
            this.f21659b = Integer.valueOf(i10);
            return this;
        }

        @Override // l2.e.a
        e.a e(int i10) {
            this.f21662e = Integer.valueOf(i10);
            return this;
        }

        @Override // l2.e.a
        e.a f(long j10) {
            this.f21658a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // l2.e
    int b() {
        return this.f21655d;
    }

    @Override // l2.e
    long c() {
        return this.f21656e;
    }

    @Override // l2.e
    int d() {
        return this.f21654c;
    }

    @Override // l2.e
    int e() {
        return this.f21657f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21653b == eVar.f() && this.f21654c == eVar.d() && this.f21655d == eVar.b() && this.f21656e == eVar.c() && this.f21657f == eVar.e();
    }

    @Override // l2.e
    long f() {
        return this.f21653b;
    }

    public int hashCode() {
        long j10 = this.f21653b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21654c) * 1000003) ^ this.f21655d) * 1000003;
        long j11 = this.f21656e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f21657f;
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f21653b = j10;
        this.f21654c = i10;
        this.f21655d = i11;
        this.f21656e = j11;
        this.f21657f = i12;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f21653b + ", loadBatchSize=" + this.f21654c + VRfCTjjLv.ZJKGMQmmpblQA + this.f21655d + ", eventCleanUpAge=" + this.f21656e + ", maxBlobByteSizePerRow=" + this.f21657f + "}";
    }
}
