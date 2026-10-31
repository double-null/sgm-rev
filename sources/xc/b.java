package xc;

import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.m;
import kotlin.collections.s;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b<E> extends kotlin.collections.f<E> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0477b f28424d = new C0477b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f28425e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E[] f28426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28428c;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a<E> extends kotlin.collections.f<E> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E[] f28429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a<E> f28432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b<E> f28433e;

        /* JADX INFO: renamed from: xc.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ListBuilder.kt */
        private static final class C0476a<E> implements ListIterator<E>, jd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a<E> f28434a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f28435b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f28436c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f28437d;

            public C0476a(a<E> list, int i10) {
                t.f(list, "list");
                this.f28434a = list;
                this.f28435b = i10;
                this.f28436c = -1;
                this.f28437d = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) ((a) this.f28434a).f28433e).modCount != this.f28437d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e10) {
                a();
                a<E> aVar = this.f28434a;
                int i10 = this.f28435b;
                this.f28435b = i10 + 1;
                aVar.add(i10, e10);
                this.f28436c = -1;
                this.f28437d = ((AbstractList) this.f28434a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f28435b < ((a) this.f28434a).f28431c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f28435b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                a();
                if (this.f28435b >= ((a) this.f28434a).f28431c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f28435b;
                this.f28435b = i10 + 1;
                this.f28436c = i10;
                return (E) ((a) this.f28434a).f28429a[((a) this.f28434a).f28430b + this.f28436c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f28435b;
            }

            @Override // java.util.ListIterator
            public E previous() {
                a();
                int i10 = this.f28435b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f28435b = i11;
                this.f28436c = i11;
                return (E) ((a) this.f28434a).f28429a[((a) this.f28434a).f28430b + this.f28436c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f28435b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f28436c;
                if (!(i10 != -1)) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f28434a.remove(i10);
                this.f28435b = this.f28436c;
                this.f28436c = -1;
                this.f28437d = ((AbstractList) this.f28434a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e10) {
                a();
                int i10 = this.f28436c;
                if (!(i10 != -1)) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f28434a.set(i10, e10);
            }
        }

        public a(E[] backing, int i10, int i11, a<E> aVar, b<E> root) {
            t.f(backing, "backing");
            t.f(root, "root");
            this.f28429a = backing;
            this.f28430b = i10;
            this.f28431c = i11;
            this.f28432d = aVar;
            this.f28433e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final boolean B() {
            return ((b) this.f28433e).f28428c;
        }

        private final void C() {
            ((AbstractList) this).modCount++;
        }

        private final E D(int i10) {
            C();
            a<E> aVar = this.f28432d;
            E eD = aVar != null ? aVar.D(i10) : (E) this.f28433e.N(i10);
            this.f28431c--;
            return eD;
        }

        private final void F(int i10, int i11) {
            if (i11 > 0) {
                C();
            }
            a<E> aVar = this.f28432d;
            if (aVar != null) {
                aVar.F(i10, i11);
            } else {
                this.f28433e.U(i10, i11);
            }
            this.f28431c -= i11;
        }

        private final int G(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            a<E> aVar = this.f28432d;
            int iG = aVar != null ? aVar.G(i10, i11, collection, z10) : this.f28433e.Y(i10, i11, collection, z10);
            if (iG > 0) {
                C();
            }
            this.f28431c -= iG;
            return iG;
        }

        private final void t(int i10, Collection<? extends E> collection, int i11) {
            C();
            a<E> aVar = this.f28432d;
            if (aVar != null) {
                aVar.t(i10, collection, i11);
            } else {
                this.f28433e.z(i10, collection, i11);
            }
            this.f28429a = (E[]) ((b) this.f28433e).f28426a;
            this.f28431c += i11;
        }

        private final void v(int i10, E e10) {
            C();
            a<E> aVar = this.f28432d;
            if (aVar != null) {
                aVar.v(i10, e10);
            } else {
                this.f28433e.B(i10, e10);
            }
            this.f28429a = (E[]) ((b) this.f28433e).f28426a;
            this.f28431c++;
        }

        private final void w() {
            if (((AbstractList) this.f28433e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final Object writeReplace() throws NotSerializableException {
            if (B()) {
                return new h(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void x() {
            if (B()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean z(List<?> list) {
            return xc.c.h(this.f28429a, this.f28430b, this.f28431c, list);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e10) {
            x();
            w();
            v(this.f28430b + this.f28431c, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            t.f(elements, "elements");
            x();
            w();
            int size = elements.size();
            t(this.f28430b + this.f28431c, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.f
        public int c() {
            w();
            return this.f28431c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            x();
            w();
            F(this.f28430b, this.f28431c);
        }

        @Override // kotlin.collections.f
        public E e(int i10) {
            x();
            w();
            kotlin.collections.d.Companion.b(i10, this.f28431c);
            return D(this.f28430b + i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            w();
            return obj == this || ((obj instanceof List) && z((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            w();
            kotlin.collections.d.Companion.b(i10, this.f28431c);
            return this.f28429a[this.f28430b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            w();
            return xc.c.i(this.f28429a, this.f28430b, this.f28431c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            w();
            for (int i10 = 0; i10 < this.f28431c; i10++) {
                if (t.a(this.f28429a[this.f28430b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            w();
            return this.f28431c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            w();
            for (int i10 = this.f28431c - 1; i10 >= 0; i10--) {
                if (t.a(this.f28429a[this.f28430b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            x();
            w();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<? extends Object> elements) {
            t.f(elements, "elements");
            x();
            w();
            return G(this.f28430b, this.f28431c, elements, false) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            x();
            w();
            kotlin.collections.d.Companion.b(i10, this.f28431c);
            E[] eArr = this.f28429a;
            int i11 = this.f28430b;
            E e11 = eArr[i11 + i10];
            eArr[i11 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i10, int i11) {
            kotlin.collections.d.Companion.d(i10, i11, this.f28431c);
            return new a(this.f28429a, this.f28430b + i10, i11 - i10, this, this.f28433e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            t.f(array, "array");
            w();
            int length = array.length;
            int i10 = this.f28431c;
            if (length >= i10) {
                E[] eArr = this.f28429a;
                int i11 = this.f28430b;
                m.f(eArr, array, 0, i11, i10 + i11);
                return (T[]) s.f(this.f28431c, array);
            }
            E[] eArr2 = this.f28429a;
            int i12 = this.f28430b;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, array.getClass());
            t.e(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            w();
            return xc.c.j(this.f28429a, this.f28430b, this.f28431c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i10) {
            w();
            kotlin.collections.d.Companion.c(i10, this.f28431c);
            return new C0476a(this, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<? extends Object> collection) {
            t.f(collection, UICvx.pkXdeZNzY);
            x();
            w();
            return G(this.f28430b, this.f28431c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, E e10) {
            x();
            w();
            kotlin.collections.d.Companion.c(i10, this.f28431c);
            v(this.f28430b + i10, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection<? extends E> elements) {
            t.f(elements, "elements");
            x();
            w();
            kotlin.collections.d.Companion.c(i10, this.f28431c);
            int size = elements.size();
            t(this.f28430b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            w();
            E[] eArr = this.f28429a;
            int i10 = this.f28430b;
            return m.j(eArr, i10, this.f28431c + i10);
        }
    }

    /* JADX INFO: renamed from: xc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ListBuilder.kt */
    private static final class C0477b {
        private C0477b() {
        }

        public /* synthetic */ C0477b(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    private static final class c<E> implements ListIterator<E>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<E> f28438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f28439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f28441d;

        public c(b<E> list, int i10) {
            t.f(list, "list");
            this.f28438a = list;
            this.f28439b = i10;
            this.f28440c = -1;
            this.f28441d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f28438a).modCount != this.f28441d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            a();
            b<E> bVar = this.f28438a;
            int i10 = this.f28439b;
            this.f28439b = i10 + 1;
            bVar.add(i10, e10);
            this.f28440c = -1;
            this.f28441d = ((AbstractList) this.f28438a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28439b < ((b) this.f28438a).f28427b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28439b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            a();
            if (this.f28439b >= ((b) this.f28438a).f28427b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f28439b;
            this.f28439b = i10 + 1;
            this.f28440c = i10;
            return (E) ((b) this.f28438a).f28426a[this.f28440c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f28439b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i10 = this.f28439b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f28439b = i11;
            this.f28440c = i11;
            return (E) ((b) this.f28438a).f28426a[this.f28440c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f28439b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f28440c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f28438a.remove(i10);
            this.f28439b = this.f28440c;
            this.f28440c = -1;
            this.f28441d = ((AbstractList) this.f28438a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            a();
            int i10 = this.f28440c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f28438a.set(i10, e10);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f28428c = true;
        f28425e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int i10, E e10) {
        K();
        I(i10, 1);
        this.f28426a[i10] = e10;
    }

    private final void D() {
        if (this.f28428c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean F(List<?> list) {
        return xc.c.h(this.f28426a, 0, this.f28427b, list);
    }

    private final void G(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f28426a;
        if (i10 > eArr.length) {
            this.f28426a = (E[]) xc.c.e(this.f28426a, kotlin.collections.d.Companion.e(eArr.length, i10));
        }
    }

    private final void H(int i10) {
        G(this.f28427b + i10);
    }

    private final void I(int i10, int i11) {
        H(i11);
        E[] eArr = this.f28426a;
        m.f(eArr, eArr, i10 + i11, i10, this.f28427b);
        this.f28427b += i11;
    }

    private final void K() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E N(int i10) {
        K();
        E[] eArr = this.f28426a;
        E e10 = eArr[i10];
        m.f(eArr, eArr, i10, i10 + 1, this.f28427b);
        xc.c.f(this.f28426a, this.f28427b - 1);
        this.f28427b--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int i10, int i11) {
        if (i11 > 0) {
            K();
        }
        E[] eArr = this.f28426a;
        m.f(eArr, eArr, i10, i10 + i11, this.f28427b);
        E[] eArr2 = this.f28426a;
        int i12 = this.f28427b;
        xc.c.g(eArr2, i12 - i11, i12);
        this.f28427b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Y(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f28426a[i14]) == z10) {
                E[] eArr = this.f28426a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f28426a;
        m.f(eArr2, eArr2, i10 + i13, i11 + i10, this.f28427b);
        E[] eArr3 = this.f28426a;
        int i16 = this.f28427b;
        xc.c.g(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            K();
        }
        this.f28427b -= i15;
        return i15;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f28428c) {
            return new h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i10, Collection<? extends E> collection, int i11) {
        K();
        I(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f28426a[i10 + i12] = it.next();
        }
    }

    public final List<E> C() {
        D();
        this.f28428c = true;
        return this.f28427b > 0 ? this : f28425e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        D();
        B(this.f28427b, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        t.f(elements, "elements");
        D();
        int size = elements.size();
        z(this.f28427b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.f
    public int c() {
        return this.f28427b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        D();
        U(0, this.f28427b);
    }

    @Override // kotlin.collections.f
    public E e(int i10) {
        D();
        kotlin.collections.d.Companion.b(i10, this.f28427b);
        return N(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && F((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        kotlin.collections.d.Companion.b(i10, this.f28427b);
        return this.f28426a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return xc.c.i(this.f28426a, 0, this.f28427b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f28427b; i10++) {
            if (t.a(this.f28426a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f28427b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f28427b - 1; i10 >= 0; i10--) {
            if (t.a(this.f28426a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        D();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        D();
        return Y(0, this.f28427b, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        D();
        return Y(0, this.f28427b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        D();
        kotlin.collections.d.Companion.b(i10, this.f28427b);
        E[] eArr = this.f28426a;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        kotlin.collections.d.Companion.d(i10, i11, this.f28427b);
        return new a(this.f28426a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        t.f(array, "array");
        int length = array.length;
        int i10 = this.f28427b;
        if (length >= i10) {
            m.f(this.f28426a, array, 0, 0, i10);
            return (T[]) s.f(this.f28427b, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.f28426a, 0, i10, array.getClass());
        t.e(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return xc.c.j(this.f28426a, 0, this.f28427b, this);
    }

    public b(int i10) {
        this.f28426a = (E[]) xc.c.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        kotlin.collections.d.Companion.c(i10, this.f28427b);
        return new c(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        D();
        kotlin.collections.d.Companion.c(i10, this.f28427b);
        B(i10, e10);
    }

    public /* synthetic */ b(int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        t.f(elements, "elements");
        D();
        kotlin.collections.d.Companion.c(i10, this.f28427b);
        int size = elements.size();
        z(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return m.j(this.f28426a, 0, this.f28427b);
    }
}
