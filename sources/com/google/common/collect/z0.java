package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: SortedIterables.java */
/* JADX INFO: loaded from: classes4.dex */
final class z0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? n0.e() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        com.google.common.base.p.l(comparator);
        com.google.common.base.p.l(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof y0)) {
                return false;
            }
            comparator2 = ((y0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
