package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Lists.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: compiled from: Lists.java */
    private static class a<T> extends b<T> implements RandomAccess {
        a(List<T> list) {
            super(list);
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class b<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<T> f11499a;

        /* JADX INFO: compiled from: Lists.java */
        class a implements ListIterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f11500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ListIterator f11501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f11502c;

            a(b bVar, ListIterator listIterator) {
                this.f11501b = listIterator;
                this.f11502c = bVar;
            }

            @Override // java.util.ListIterator
            public void add(T t10) {
                this.f11501b.add(t10);
                this.f11501b.previous();
                this.f11500a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f11501b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f11501b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f11500a = true;
                return (T) this.f11501b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f11502c.e(this.f11501b.nextIndex());
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f11500a = true;
                return (T) this.f11501b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                h.c(this.f11500a);
                this.f11501b.remove();
                this.f11500a = false;
            }

            @Override // java.util.ListIterator
            public void set(T t10) {
                com.google.common.base.p.r(this.f11500a);
                this.f11501b.set(t10);
            }
        }

        b(List<T> list) {
            this.f11499a = (List) com.google.common.base.p.l(list);
        }

        private int d(int i10) {
            int size = size();
            com.google.common.base.p.j(i10, size);
            return (size - 1) - i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int e(int i10) {
            int size = size();
            com.google.common.base.p.o(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, T t10) {
            this.f11499a.add(e(i10), t10);
        }

        List<T> c() {
            return this.f11499a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f11499a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f11499a.get(d(i10));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this, this.f11499a.listIterator(e(i10)));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f11499a.remove(d(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i10, T t10) {
            return this.f11499a.set(d(i10), t10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11499a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i10, int i11) {
            com.google.common.base.p.q(i10, i11, size());
            return b0.l(this.f11499a.subList(e(i11), e(i10)));
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f11503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.base.g<? super F, ? extends T> f11504b;

        /* JADX INFO: compiled from: Lists.java */
        class a extends b1<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.a1
            T a(F f10) {
                return c.this.f11504b.apply(f10);
            }
        }

        c(List<F> list, com.google.common.base.g<? super F, ? extends T> gVar) {
            this.f11503a = (List) com.google.common.base.p.l(list);
            this.f11504b = (com.google.common.base.g) com.google.common.base.p.l(gVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f11504b.apply(this.f11503a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f11503a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f11503a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f11504b.apply(this.f11503a.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f11503a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11503a.size();
        }
    }

    /* JADX INFO: compiled from: Lists.java */
    private static class d<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f11506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.base.g<? super F, ? extends T> f11507b;

        /* JADX INFO: compiled from: Lists.java */
        class a extends b1<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.a1
            T a(F f10) {
                return d.this.f11507b.apply(f10);
            }
        }

        d(List<F> list, com.google.common.base.g<? super F, ? extends T> gVar) {
            this.f11506a = (List) com.google.common.base.p.l(list);
            this.f11507b = (com.google.common.base.g) com.google.common.base.p.l(gVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f11506a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f11506a.listIterator(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f11506a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11506a.size();
        }
    }

    static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        h.b(i10, "arraySize");
        return com.google.common.primitives.f.l(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean c(List<?> list, Object obj) {
        if (obj == com.google.common.base.p.l(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return z.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!com.google.common.base.l.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.google.common.base.l.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.google.common.base.l.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> h() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> arrayListH = h();
        z.a(arrayListH, it);
        return arrayListH;
    }

    @SafeVarargs
    public static <E> ArrayList<E> j(E... eArr) {
        com.google.common.base.p.l(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> k(int i10) {
        h.b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    public static <T> List<T> l(List<T> list) {
        if (list instanceof u) {
            return ((u) list).d0();
        }
        if (list instanceof b) {
            return ((b) list).c();
        }
        return list instanceof RandomAccess ? new a(list) : new b(list);
    }

    public static <F, T> List<T> m(List<F> list, com.google.common.base.g<? super F, ? extends T> gVar) {
        return list instanceof RandomAccess ? new c(list, gVar) : new d(list, gVar);
    }
}
