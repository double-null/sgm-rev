package androidx.appcompat.app;

/* JADX INFO: compiled from: TwilightCalculator.java */
/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static j f725d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f728c;

    j() {
    }

    static j b() {
        if (f725d == null) {
            f725d = new j();
        }
        return f725d;
    }

    public void a(long j10, double d10, double d11) {
        float f10 = (j10 - 946728000000L) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = f11;
        double dSin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f10 - 9.0E-4f)) - d13) + 9.0E-4f)) + d13 + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d14 = 0.01745329238474369d * d10;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d14) * Math.sin(dAsin))) / (Math.cos(d14) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f728c = 1;
            this.f726a = -1L;
            this.f727b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f728c = 0;
                this.f726a = -1L;
                this.f727b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f726a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f727b = jRound;
            if (jRound >= j10 || this.f726a <= j10) {
                this.f728c = 1;
            } else {
                this.f728c = 0;
            }
        }
    }
}
