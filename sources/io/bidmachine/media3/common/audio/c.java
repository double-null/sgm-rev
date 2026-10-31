package io.bidmachine.media3.common.audio;

import com.vungle.ads.internal.protos.Sdk;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f17957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f17960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f17961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f17962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f17964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f17966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f17975w;

    public c(int i10, int i11, float f10, float f11, int i12) {
        this.f17953a = i10;
        this.f17954b = i11;
        this.f17955c = f10;
        this.f17956d = f11;
        this.f17957e = i10 / i12;
        this.f17958f = i10 / 400;
        int i13 = i10 / 65;
        this.f17959g = i13;
        int i14 = i13 * 2;
        this.f17960h = i14;
        this.f17961i = new short[i14];
        this.f17962j = new short[i14 * i11];
        this.f17964l = new short[i14 * i11];
        this.f17966n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f17965m == i10) {
            return;
        }
        int i13 = this.f17953a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f17967o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f17968p;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f17969q;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f17964l = f(this.f17964l, this.f17965m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f17954b;
                    if (i16 < i17) {
                        this.f17964l[(this.f17965m * i17) + i16] = n(this.f17966n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f17969q++;
                this.f17965m++;
            }
            int i18 = i11 + 1;
            this.f17968p = i18;
            if (i18 == j11) {
                this.f17968p = 0;
                x7.a.g(((long) i12) == j10);
                this.f17969q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        int iM;
        int i10 = this.f17963k;
        if (i10 < this.f17960h) {
            return;
        }
        int iW = 0;
        do {
            if (this.f17970r > 0) {
                iM = c(iW);
            } else {
                int iG = g(this.f17962j, iW);
                if (d10 > 1.0d) {
                    iW += iG + w(this.f17962j, iW, d10, iG);
                } else {
                    iM = m(this.f17962j, iW, d10, iG);
                }
            }
            iW += iM;
        } while (this.f17960h + iW <= i10);
        v(iW);
    }

    private int c(int i10) {
        int iMin = Math.min(this.f17960h, this.f17970r);
        d(this.f17962j, i10, iMin);
        this.f17970r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f17964l, this.f17965m, i11);
        this.f17964l = sArrF;
        int i12 = this.f17954b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f17965m * i12, i12 * i11);
        this.f17965m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f17960h / i11;
        int i13 = this.f17954b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f17961i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f17954b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f17953a;
        int i12 = i11 > 4000 ? i11 / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE : 1;
        if (this.f17954b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f17958f, this.f17959g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f17961i, 0, this.f17958f / i12, this.f17959g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f17958f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f17959g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f17954b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f17961i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f17973u, this.f17974v) ? this.f17971s : iH;
        this.f17972t = this.f17973u;
        this.f17971s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f17954b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f17973u = i15 / i16;
        this.f17974v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f17975w;
            int iRound = (int) Math.round(d11);
            this.f17975w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f17975w;
            int iRound2 = (int) Math.round(d12);
            this.f17970r = iRound2;
            this.f17975w = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f17964l, this.f17965m, i13);
        this.f17964l = sArrF;
        int i14 = this.f17954b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f17965m * i14, i14 * i11);
        p(i12, this.f17954b, this.f17964l, this.f17965m + i11, sArr, i10 + i11, sArr, i10);
        this.f17965m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f17954b];
        long j12 = ((long) this.f17969q) * j10;
        int i11 = this.f17968p;
        long j13 = ((long) i11) * j11;
        long j14 = ((long) (i11 + 1)) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((((long) s10) * j15) + ((j16 - j15) * ((long) s11))) / j16);
    }

    private void o(int i10) {
        int i11 = this.f17965m - i10;
        short[] sArrF = f(this.f17966n, this.f17967o, i11);
        this.f17966n = sArrF;
        short[] sArr = this.f17964l;
        int i12 = this.f17954b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f17967o * i12, i12 * i11);
        this.f17965m = i10;
        this.f17967o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f17971s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f17972t * 3;
    }

    private void r() {
        int i10 = this.f17965m;
        float f10 = this.f17955c;
        float f11 = this.f17956d;
        double d10 = f10 / f11;
        float f12 = this.f17957e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f17962j, 0, this.f17963k);
            this.f17963k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f17966n;
        int i11 = this.f17954b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f17967o - i10) * i11);
        this.f17967o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f17963k - i10;
        short[] sArr = this.f17962j;
        int i12 = this.f17954b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f17963k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int iRound;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f17975w;
            iRound = (int) Math.round(d11);
            this.f17975w = d11 - ((double) iRound);
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f17975w;
            int iRound2 = (int) Math.round(d12);
            this.f17970r = iRound2;
            this.f17975w = d12 - ((double) iRound2);
            iRound = i11;
        }
        short[] sArrF = f(this.f17964l, this.f17965m, iRound);
        this.f17964l = sArrF;
        p(iRound, this.f17954b, sArrF, this.f17965m, sArr, i10, sArr, i10 + i11);
        this.f17965m += iRound;
        return iRound;
    }

    public void i() {
        this.f17963k = 0;
        this.f17965m = 0;
        this.f17967o = 0;
        this.f17968p = 0;
        this.f17969q = 0;
        this.f17970r = 0;
        this.f17971s = 0;
        this.f17972t = 0;
        this.f17973u = 0;
        this.f17974v = 0;
        this.f17975w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        x7.a.g(this.f17965m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f17954b, this.f17965m);
        shortBuffer.put(this.f17964l, 0, this.f17954b * iMin);
        int i10 = this.f17965m - iMin;
        this.f17965m = i10;
        short[] sArr = this.f17964l;
        int i11 = this.f17954b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        x7.a.g(this.f17965m >= 0);
        return this.f17965m * this.f17954b * 2;
    }

    public int l() {
        return this.f17963k * this.f17954b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f17963k;
        float f10 = this.f17955c;
        float f11 = this.f17956d;
        double d10 = f10 / f11;
        double d11 = this.f17957e * f11;
        int i12 = this.f17970r;
        int i13 = this.f17965m + ((int) ((((((((double) (i11 - i12)) / d10) + ((double) i12)) + this.f17975w) + ((double) this.f17967o)) / d11) + 0.5d));
        this.f17975w = 0.0d;
        this.f17962j = f(this.f17962j, i11, (this.f17960h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f17960h;
            int i15 = this.f17954b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f17962j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f17963k += i10 * 2;
        r();
        if (this.f17965m > i13) {
            this.f17965m = Math.max(i13, 0);
        }
        this.f17963k = 0;
        this.f17970r = 0;
        this.f17967o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f17954b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f17962j, this.f17963k, i11);
        this.f17962j = sArrF;
        shortBuffer.get(sArrF, this.f17963k * this.f17954b, ((i10 * i11) * 2) / 2);
        this.f17963k += i11;
        r();
    }
}
