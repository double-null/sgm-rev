package u2;

import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.facebook.internal.NativeProtocol;
import com.google.common.base.p;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;

/* JADX INFO: compiled from: IntMath.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f25880a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f25881b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f25882c = {3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f25883d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int[] f25884e = {Integer.MAX_VALUE, Integer.MAX_VALUE, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: compiled from: IntMath.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25885a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f25885a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25885a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25885a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25885a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25885a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25885a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25885a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25885a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        f.b(j10 == ((long) i12), "checkedAdd", i10, i11);
        return i12;
    }

    public static boolean c(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    static int d(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    public static int e(int i10, RoundingMode roundingMode) {
        f.f("x", i10);
        switch (a.f25885a[roundingMode.ordinal()]) {
            case 1:
                f.g(c(i10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + d((-1257966797) >>> iNumberOfLeadingZeros, i10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int f(int i10, int i11) {
        return com.google.common.primitives.f.l(((long) i10) * ((long) i11));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005a  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static int b(int i10, int i11, RoundingMode roundingMode) {
        boolean z10;
        boolean z11;
        p.l(roundingMode);
        if (i11 != 0) {
            int i12 = i10 / i11;
            int i13 = i10 - (i11 * i12);
            if (i13 == 0) {
                return i12;
            }
            boolean z12 = true;
            int i14 = ((i10 ^ i11) >> 31) | 1;
            switch (a.f25885a[roundingMode.ordinal()]) {
                case 1:
                    if (i13 != 0) {
                        z12 = false;
                    }
                    f.g(z12);
                    z12 = false;
                    if (z12) {
                        return i12 + i14;
                    }
                    return i12;
                case 2:
                    z12 = false;
                    if (z12) {
                        return i12 + i14;
                    }
                    return i12;
                case 3:
                    if (i14 >= 0) {
                        z12 = false;
                    }
                    if (z12) {
                        return i12 + i14;
                    }
                    return i12;
                case 4:
                    if (z12) {
                        return i12 + i14;
                    }
                    return i12;
                case 5:
                    if (i14 <= 0) {
                        z12 = false;
                    }
                    if (z12) {
                        return i12 + i14;
                    }
                    return i12;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i13);
                    int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                    if (iAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((i12 & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!(z10 & z11)) {
                                z12 = false;
                            }
                        }
                    } else if (iAbs2 <= 0) {
                        z12 = false;
                    }
                    if (z12) {
                        return i12 + i14;
                    }
                    return i12;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException(OgqfiHA.ZDXbVIiNJtKHul);
    }
}
