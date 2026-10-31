package od;

import kotlin.jvm.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class k extends j {
    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int f(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long g(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double h(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float i(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int j(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long k(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static f l(int i10, int i11) {
        return f.f23385d.a(i10, i11, -1);
    }

    public static f m(f fVar, int i10) {
        t.f(fVar, "<this>");
        j.a(i10 > 0, Integer.valueOf(i10));
        f.a aVar = f.f23385d;
        int iA = fVar.a();
        int iC = fVar.c();
        if (fVar.d() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iA, iC, i10);
    }

    public static h n(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? h.f23393e.a() : new h(i10, i11 - 1);
    }
}
