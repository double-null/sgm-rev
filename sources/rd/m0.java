package rd;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {
    public static final byte a(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        wc.x xVarB = b(str);
        if (xVarB != null) {
            return xVarB.g();
        }
        b0.o(str);
        throw new KotlinNothingValueException();
    }

    public static final wc.x b(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return c(str, 10);
    }

    public static final wc.x c(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        wc.z zVarF = f(str, i10);
        if (zVarF == null) {
            return null;
        }
        int iG = zVarF.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, wc.z.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return wc.x.a(wc.x.b((byte) iG));
    }

    public static final int d(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        wc.z zVarE = e(str);
        if (zVarE != null) {
            return zVarE.g();
        }
        b0.o(str);
        throw new KotlinNothingValueException();
    }

    public static final wc.z e(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return f(str, 10);
    }

    public static final wc.z f(String str, int i10) {
        int i11;
        kotlin.jvm.internal.t.f(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.t.g(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iB = wc.z.b(i10);
        int iA = 119304647;
        while (i11 < length) {
            int iB2 = b.b(str.charAt(i11), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = l0.a(-1, iB);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = wc.z.b(i12 * iB);
            int iB4 = wc.z.b(wc.z.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iB4;
        }
        return wc.z.a(i12);
    }

    public static final long g(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        wc.b0 b0VarH = h(str);
        if (b0VarH != null) {
            return b0VarH.g();
        }
        b0.o(str);
        throw new KotlinNothingValueException();
    }

    public static final wc.b0 h(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return i(str, 10);
    }

    public static final wc.b0 i(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.t.g(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = wc.b0.b(i10);
        long j10 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = k0.a(-1L, jB);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = wc.b0.b(j10 * jB);
            long jB3 = wc.b0.b(wc.b0.b(((long) wc.z.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j10 = jB3;
        }
        return wc.b0.a(j10);
    }

    public static final short j(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        wc.e0 e0VarK = k(str);
        if (e0VarK != null) {
            return e0VarK.g();
        }
        b0.o(str);
        throw new KotlinNothingValueException();
    }

    public static final wc.e0 k(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return l(str, 10);
    }

    public static final wc.e0 l(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        wc.z zVarF = f(str, i10);
        if (zVarF == null) {
            return null;
        }
        int iG = zVarF.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, wc.z.b(Settings.DEFAULT_INITIAL_WINDOW_SIZE) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return wc.e0.a(wc.e0.b((short) iG));
    }
}
