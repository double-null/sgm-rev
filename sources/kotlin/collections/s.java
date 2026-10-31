package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class s {
    public static <E> List<E> a(List<E> builder) {
        kotlin.jvm.internal.t.f(builder, "builder");
        return ((xc.b) builder).C();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.t.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.t.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static <E> List<E> c() {
        return new xc.b(0, 1, null);
    }

    public static <E> List<E> d(int i10) {
        return new xc.b(i10);
    }

    public static <T> List<T> e(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.t.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static <T> T[] f(int i10, T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
