package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Iterables.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y {
    public static <T> boolean a(Iterable<T> iterable, com.google.common.base.q<? super T> qVar) {
        return z.b(iterable.iterator(), qVar);
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : b0.i(iterable.iterator());
    }

    public static <T> T c(Iterable<? extends T> iterable, T t10) {
        return (T) z.k(iterable.iterator(), t10);
    }

    public static <T> T d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) z.i(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) f(list);
    }

    public static <T> T e(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) f(b0.a(iterable));
            }
        }
        return (T) z.j(iterable.iterator(), t10);
    }

    private static <T> T f(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T g(Iterable<T> iterable) {
        return (T) z.l(iterable.iterator());
    }

    public static <T> boolean h(Iterable<T> iterable, com.google.common.base.q<? super T> qVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (com.google.common.base.q) com.google.common.base.p.l(qVar)) : z.p(iterable.iterator(), qVar);
    }

    private static <T> boolean i(List<T> list, com.google.common.base.q<? super T> qVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!qVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        j(list, qVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, qVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static <T> void j(List<T> list, com.google.common.base.q<? super T> qVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (qVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] k(Iterable<?> iterable) {
        return b(iterable).toArray();
    }
}
