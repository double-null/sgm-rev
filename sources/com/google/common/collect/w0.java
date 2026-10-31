package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: Sets.java */
    class a<E> extends e<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f11724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f11725b;

        /* JADX INFO: renamed from: com.google.common.collect.w0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Sets.java */
        class C0146a extends com.google.common.collect.b<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<E> f11726c;

            C0146a() {
                this.f11726c = a.this.f11724a.iterator();
            }

            @Override // com.google.common.collect.b
            protected E a() {
                while (this.f11726c.hasNext()) {
                    E next = this.f11726c.next();
                    if (a.this.f11725b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f11724a = set;
            this.f11725b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c1<E> iterator() {
            return new C0146a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11724a.contains(obj) && this.f11725b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f11724a.containsAll(collection) && this.f11725b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f11725b, this.f11724a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f11724a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f11725b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    private static class b<E> extends i.a<E> implements Set<E> {
        b(Set<E> set, com.google.common.base.q<? super E> qVar) {
            super(set, qVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return w0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return w0.d(this);
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    private static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, com.google.common.base.q<? super E> qVar) {
            super(sortedSet, qVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f11632a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) z.h(this.f11632a.iterator(), this.f11633b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f11632a).headSet(e10), this.f11633b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f11632a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f11633b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f11632a).subSet(e10, e11), this.f11633b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f11632a).tailSet(e10), this.f11633b);
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    static abstract class d<E> extends AbstractSet<E> {
        d() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return w0.j(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) com.google.common.base.p.l(collection));
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    public static abstract class e<E> extends AbstractSet<E> {
        /* synthetic */ e(v0 v0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, com.google.common.base.q<? super E> qVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, qVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) com.google.common.base.p.l(set), (com.google.common.base.q) com.google.common.base.p.l(qVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f11632a, com.google.common.base.r.b(bVar.f11633b, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, com.google.common.base.q<? super E> qVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) com.google.common.base.p.l(sortedSet), (com.google.common.base.q) com.google.common.base.p.l(qVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f11632a, com.google.common.base.r.b(bVar.f11633b, qVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        com.google.common.base.p.m(set, "set1");
        com.google.common.base.p.m(set2, "set2");
        return new a(set, set2);
    }

    public static <E> Set<E> f() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> HashSet<E> g() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> h(int i10) {
        return new HashSet<>(f0.a(i10));
    }

    public static <E> Set<E> i() {
        return Collections.newSetFromMap(f0.g());
    }

    static boolean j(Set<?> set, Collection<?> collection) {
        com.google.common.base.p.l(collection);
        if (collection instanceof j0) {
            collection = ((j0) collection).k();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? k(set, collection.iterator()) : z.o(set.iterator(), collection);
    }

    static boolean k(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
