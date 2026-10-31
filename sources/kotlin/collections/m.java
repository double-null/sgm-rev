package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class m extends l {
    public static <T> List<T> c(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        List<T> listA = p.a(tArr);
        kotlin.jvm.internal.t.e(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static char[] e(char[] cArr, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.t.f(cArr, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static <T> T[] f(T[] tArr, T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] g(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] h(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return f(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] i(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        k.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.t.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static <T> T[] j(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        k.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        kotlin.jvm.internal.t.e(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void k(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.t.f(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static <T> void l(T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void m(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        k(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void n(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        l(objArr, obj, i10, i11);
    }

    public static <T> void o(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void p(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        kotlin.jvm.internal.t.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
