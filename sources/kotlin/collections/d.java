package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d<E> extends kotlin.collections.b<E> implements List<E> {
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - d.maxArraySize <= 0) {
                return i12;
            }
            if (i11 > d.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return d.maxArraySize;
        }

        public final boolean f(Collection<?> c10, Collection<?> other) {
            kotlin.jvm.internal.t.f(c10, "c");
            kotlin.jvm.internal.t.f(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.t.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection<?> c10) {
            kotlin.jvm.internal.t.f(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    private class b implements Iterator<E>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21449a;

        public b() {
        }

        protected final int a() {
            return this.f21449a;
        }

        protected final void b(int i10) {
            this.f21449a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21449a < d.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            int i10 = this.f21449a;
            this.f21449a = i10 + 1;
            return dVar.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: AbstractList.kt */
    private class c extends d<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            d.Companion.c(i10, d.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            d<E> dVar = d.this;
            b(a() - 1);
            return dVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractList.kt */
    private static final class C0348d<E> extends d<E> implements RandomAccess {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<E> f21452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21454c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0348d(d<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.t.f(list, "list");
            this.f21452a = list;
            this.f21453b = i10;
            d.Companion.d(i10, i11, list.size());
            this.f21454c = i11 - i10;
        }

        @Override // kotlin.collections.d, java.util.List
        public E get(int i10) {
            d.Companion.b(i10, this.f21454c);
            return this.f21452a.get(this.f21453b + i10);
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
            return this.f21454c;
        }
    }

    protected d() {
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // kotlin.collections.b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.t.a(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.t.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new C0348d(this, i10, i11);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
