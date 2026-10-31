package t8;

import java.util.Arrays;

/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25609d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25611f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0426a f25606a = new C0426a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0426a f25607b = new C0426a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25610e = -9223372036854775807L;

    /* JADX INFO: renamed from: t8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    private static final class C0426a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f25612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f25613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f25614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f25615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f25616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f25617f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f25618g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25619h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f25616e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f25617f / j10;
        }

        public long b() {
            return this.f25617f;
        }

        public boolean d() {
            long j10 = this.f25615d;
            if (j10 == 0) {
                return false;
            }
            return this.f25618g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f25615d > 15 && this.f25619h == 0;
        }

        public void f(long j10) {
            long j11 = this.f25615d;
            if (j11 == 0) {
                this.f25612a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f25612a;
                this.f25613b = j12;
                this.f25617f = j12;
                this.f25616e = 1L;
            } else {
                long j13 = j10 - this.f25614c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f25613b) <= 1000000) {
                    this.f25616e++;
                    this.f25617f += j13;
                    boolean[] zArr = this.f25618g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f25619h--;
                    }
                } else {
                    boolean[] zArr2 = this.f25618g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f25619h++;
                    }
                }
            }
            this.f25615d++;
            this.f25614c = j10;
        }

        public void g() {
            this.f25615d = 0L;
            this.f25616e = 0L;
            this.f25617f = 0L;
            this.f25619h = 0;
            Arrays.fill(this.f25618g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f25606a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f25606a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f25611f;
    }

    public long d() {
        if (e()) {
            return this.f25606a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f25606a.e();
    }

    public void f(long j10) {
        this.f25606a.f(j10);
        if (this.f25606a.e() && !this.f25609d) {
            this.f25608c = false;
        } else if (this.f25610e != -9223372036854775807L) {
            if (!this.f25608c || this.f25607b.d()) {
                this.f25607b.g();
                this.f25607b.f(this.f25610e);
            }
            this.f25608c = true;
            this.f25607b.f(j10);
        }
        if (this.f25608c && this.f25607b.e()) {
            C0426a c0426a = this.f25606a;
            this.f25606a = this.f25607b;
            this.f25607b = c0426a;
            this.f25608c = false;
            this.f25609d = false;
        }
        this.f25610e = j10;
        this.f25611f = this.f25606a.e() ? 0 : this.f25611f + 1;
    }

    public void g() {
        this.f25606a.g();
        this.f25607b.g();
        this.f25608c = false;
        this.f25610e = -9223372036854775807L;
        this.f25611f = 0;
    }
}
