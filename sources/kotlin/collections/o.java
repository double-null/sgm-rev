package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes5.dex */
public class o extends m {
    public static int A(int[] iArr) {
        kotlin.jvm.internal.t.f(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int B(long[] jArr) {
        kotlin.jvm.internal.t.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int C(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static Float D(float[] fArr, int i10) {
        kotlin.jvm.internal.t.f(fArr, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < fArr.length) {
            z10 = true;
        }
        if (z10) {
            return Float.valueOf(fArr[i10]);
        }
        return null;
    }

    public static <T> T E(T[] tArr, int i10) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        boolean z10 = false;
        if (i10 >= 0 && i10 < tArr.length) {
            z10 = true;
        }
        if (z10) {
            return tArr[i10];
        }
        return null;
    }

    public static final int F(byte[] bArr, byte b10) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int G(char[] cArr, char c10) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int H(int[] iArr, int i10) {
        kotlin.jvm.internal.t.f(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int I(long[] jArr, long j10) {
        kotlin.jvm.internal.t.f(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> int J(T[] tArr, T t10) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.t.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int K(short[] sArr, short s10) {
        kotlin.jvm.internal.t.f(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <A extends Appendable> A L(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(buffer, "buffer");
        kotlin.jvm.internal.t.f(separator, "separator");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(postfix, "postfix");
        kotlin.jvm.internal.t.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T, A extends Appendable> A M(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super T, ? extends CharSequence> lVar) throws IOException {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        kotlin.jvm.internal.t.f(buffer, "buffer");
        kotlin.jvm.internal.t.f(separator, "separator");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(postfix, "postfix");
        kotlin.jvm.internal.t.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            rd.s.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String N(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(separator, "separator");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(postfix, "postfix");
        kotlin.jvm.internal.t.f(truncated, "truncated");
        return ((StringBuilder) L(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static final <T> String O(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, id.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        kotlin.jvm.internal.t.f(separator, "separator");
        kotlin.jvm.internal.t.f(prefix, "prefix");
        kotlin.jvm.internal.t.f(postfix, "postfix");
        kotlin.jvm.internal.t.f(truncated, "truncated");
        return ((StringBuilder) M(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String P(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, id.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return N(bArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, id.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return O(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static char R(char[] cArr) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T S(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static float T(float[] fArr) {
        kotlin.jvm.internal.t.f(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    public static final <T, C extends Collection<? super T>> C U(T[] tArr, C destination) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> HashSet<T> V(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return (HashSet) U(tArr, new HashSet(n0.e(tArr.length)));
    }

    public static <T> List<T> W(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? X(tArr) : s.e(tArr[0]);
        }
        return t.k();
    }

    public static <T> List<T> X(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return new ArrayList(t.h(tArr));
    }

    public static <T> Set<T> Y(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) U(tArr, new LinkedHashSet(n0.e(tArr.length))) : t0.d(tArr[0]);
        }
        return u0.e();
    }

    public static <T> Iterable<g0<T>> Z(final T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return new h0(new id.a() { // from class: kotlin.collections.n
            @Override // id.a
            public final Object invoke() {
                return o.a0(tArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator a0(Object[] objArr) {
        return kotlin.jvm.internal.c.a(objArr);
    }

    public static boolean r(byte[] bArr, byte b10) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        return F(bArr, b10) >= 0;
    }

    public static boolean s(char[] cArr, char c10) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        return G(cArr, c10) >= 0;
    }

    public static boolean t(int[] iArr, int i10) {
        kotlin.jvm.internal.t.f(iArr, "<this>");
        return H(iArr, i10) >= 0;
    }

    public static boolean u(long[] jArr, long j10) {
        kotlin.jvm.internal.t.f(jArr, "<this>");
        return I(jArr, j10) >= 0;
    }

    public static <T> boolean v(T[] tArr, T t10) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return J(tArr, t10) >= 0;
    }

    public static boolean w(short[] sArr, short s10) {
        kotlin.jvm.internal.t.f(sArr, "<this>");
        return K(sArr, s10) >= 0;
    }

    public static <T> List<T> x(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return (List) y(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C y(T[] tArr, C destination) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T> T z(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }
}
