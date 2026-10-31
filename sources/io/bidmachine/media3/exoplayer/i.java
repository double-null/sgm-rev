package io.bidmachine.media3.exoplayer;

import android.os.SystemClock;

/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements b8.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f19001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f19002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f19007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f19014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f19015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f19016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f19019s;

    /* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f19020a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f19021b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19022c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f19023d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f19024e = x7.l0.S0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f19025f = x7.l0.S0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f19026g = 0.999f;

        public i a() {
            return new i(this.f19020a, this.f19021b, this.f19022c, this.f19023d, this.f19024e, this.f19025f, this.f19026g);
        }
    }

    private void f(long j10) {
        long j11 = this.f19018r + (this.f19019s * 3);
        if (this.f19013m > j11) {
            float fS0 = x7.l0.S0(this.f19003c);
            this.f19013m = com.google.common.primitives.h.b(j11, this.f19010j, this.f19013m - (((long) ((this.f19016p - 1.0f) * fS0)) + ((long) ((this.f19014n - 1.0f) * fS0))));
            return;
        }
        long jQ = x7.l0.q(j10 - ((long) (Math.max(0.0f, this.f19016p - 1.0f) / this.f19004d)), this.f19013m, j11);
        this.f19013m = jQ;
        long j12 = this.f19012l;
        if (j12 == -9223372036854775807L || jQ <= j12) {
            return;
        }
        this.f19013m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f19008h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f19009i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f19011k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f19012l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f19010j == j10) {
            return;
        }
        this.f19010j = j10;
        this.f19013m = j10;
        this.f19018r = -9223372036854775807L;
        this.f19019s = -9223372036854775807L;
        this.f19017q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f19018r;
        if (j13 == -9223372036854775807L) {
            this.f19018r = j12;
            this.f19019s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f19007g));
            this.f19018r = jMax;
            this.f19019s = h(this.f19019s, Math.abs(j12 - jMax), this.f19007g);
        }
    }

    @Override // b8.v
    public float a(long j10, long j11) {
        if (this.f19008h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f19017q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f19017q < this.f19003c) {
            return this.f19016p;
        }
        this.f19017q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f19013m;
        if (Math.abs(j12) < this.f19005e) {
            this.f19016p = 1.0f;
        } else {
            this.f19016p = x7.l0.o((this.f19004d * j12) + 1.0f, this.f19015o, this.f19014n);
        }
        return this.f19016p;
    }

    @Override // b8.v
    public long b() {
        return this.f19013m;
    }

    @Override // b8.v
    public void c() {
        long j10 = this.f19013m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f19006f;
        this.f19013m = j11;
        long j12 = this.f19012l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f19013m = j12;
        }
        this.f19017q = -9223372036854775807L;
    }

    @Override // b8.v
    public void d(u7.s.g gVar) {
        this.f19008h = x7.l0.S0(gVar.f26376a);
        this.f19011k = x7.l0.S0(gVar.f26377b);
        this.f19012l = x7.l0.S0(gVar.f26378c);
        float f10 = gVar.f26379d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f19001a;
        }
        this.f19015o = f10;
        float f11 = gVar.f26380e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f19002b;
        }
        this.f19014n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f19008h = -9223372036854775807L;
        }
        g();
    }

    @Override // b8.v
    public void e(long j10) {
        this.f19009i = j10;
        g();
    }

    private i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f19001a = f10;
        this.f19002b = f11;
        this.f19003c = j10;
        this.f19004d = f12;
        this.f19005e = j11;
        this.f19006f = j12;
        this.f19007g = f13;
        this.f19008h = -9223372036854775807L;
        this.f19009i = -9223372036854775807L;
        this.f19011k = -9223372036854775807L;
        this.f19012l = -9223372036854775807L;
        this.f19015o = f10;
        this.f19014n = f11;
        this.f19016p = 1.0f;
        this.f19017q = -9223372036854775807L;
        this.f19010j = -9223372036854775807L;
        this.f19013m = -9223372036854775807L;
        this.f19018r = -9223372036854775807L;
        this.f19019s = -9223372036854775807L;
    }
}
