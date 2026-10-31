package u2;

import com.google.common.base.p;
import java.math.RoundingMode;

/* JADX INFO: compiled from: DoubleMath.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f25877a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[] f25878b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: compiled from: DoubleMath.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25879a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f25879a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25879a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25879a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25879a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25879a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25879a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25879a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25879a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d10, double d11, double d12) {
        f.d("tolerance", d12);
        return Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11 || (Double.isNaN(d10) && Double.isNaN(d11));
    }

    public static boolean b(double d10) {
        return c.b(d10) && (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(c.a(d10)) <= Math.getExponent(d10));
    }

    public static boolean c(double d10) {
        if (d10 <= 0.0d || !c.b(d10)) {
            return false;
        }
        long jA = c.a(d10);
        return (jA & (jA - 1)) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int d(double d10, RoundingMode roundingMode) {
        boolean zC;
        boolean z10 = false;
        p.e(d10 > 0.0d && c.b(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (!c.c(d10)) {
            return d(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (a.f25879a[roundingMode.ordinal()]) {
            case 1:
                f.g(c(d10));
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z10 = !c(d10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zC = c(d10);
                z10 &= !zC;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zC = c(d10);
                z10 &= !zC;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double d11 = c.d(d10);
                if (d11 * d11 > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    static double e(double d10, RoundingMode roundingMode) {
        if (!c.b(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f25879a[roundingMode.ordinal()]) {
            case 1:
                f.g(b(d10));
                return d10;
            case 2:
                return (d10 >= 0.0d || b(d10)) ? d10 : ((long) d10) - 1;
            case 3:
                return (d10 <= 0.0d || b(d10)) ? d10 : ((long) d10) + 1;
            case 4:
                return d10;
            case 5:
                if (b(d10)) {
                    return d10;
                }
                return ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d10);
            case 7:
                double dRint = Math.rint(d10);
                return Math.abs(d10 - dRint) == 0.5d ? d10 + Math.copySign(0.5d, d10) : dRint;
            case 8:
                double dRint2 = Math.rint(d10);
                return Math.abs(d10 - dRint2) == 0.5d ? d10 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long f(double d10, RoundingMode roundingMode) {
        double dE = e(d10, roundingMode);
        f.a(((-9.223372036854776E18d) - dE < 1.0d) & (dE < 9.223372036854776E18d), d10, roundingMode);
        return (long) dE;
    }
}
