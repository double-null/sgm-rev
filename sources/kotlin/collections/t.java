package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class t extends s {
    public static <T> ArrayList<T> g(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new h(elements, true));
    }

    public static final <T> Collection<T> h(T[] tArr) {
        kotlin.jvm.internal.t.f(tArr, "<this>");
        return new h(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int i(List<? extends T> list, T t10, int i10, int i11) {
        kotlin.jvm.internal.t.f(list, "<this>");
        r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = yc.b.a(list.get(i13), t10);
            if (iA < 0) {
                i10 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int j(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return i(list, comparable, i10, i11);
    }

    public static <T> List<T> k() {
        return d0.f21455a;
    }

    public static od.h l(Collection<?> collection) {
        kotlin.jvm.internal.t.f(collection, "<this>");
        return new od.h(0, collection.size() - 1);
    }

    public static <T> int m(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> n(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return elements.length > 0 ? m.c(elements) : k();
    }

    public static <T> List<T> o(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return o.x(elements);
    }

    public static <T> List<T> p(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new h(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> q(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : s.e(list.get(0));
        }
        return k();
    }

    private static final void r(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
