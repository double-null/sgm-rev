package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i<E> extends f<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21463d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f21464e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f21466b = f21464e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21467c;

    /* JADX INFO: compiled from: ArrayDeque.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    private final void C(int i10, int i11) {
        int iW = w(this.f21465a + (i10 - 1));
        int iW2 = w(this.f21465a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iW + 1;
            int iMin = Math.min(i10, Math.min(i12, iW2 + 1));
            Object[] objArr = this.f21466b;
            int i13 = iW2 - iMin;
            int i14 = iW - iMin;
            m.f(objArr, objArr, i13 + 1, i14 + 1, i12);
            iW = t(i14);
            iW2 = t(i13);
            i10 -= iMin;
        }
    }

    private final void D(int i10, int i11) {
        int iW = w(this.f21465a + i11);
        int iW2 = w(this.f21465a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f21466b;
            i11 = Math.min(size, Math.min(objArr.length - iW, objArr.length - iW2));
            Object[] objArr2 = this.f21466b;
            int i12 = iW + i11;
            m.f(objArr2, objArr2, iW2, iW, i12);
            iW = w(i12);
            iW2 = w(iW2 + i11);
        }
    }

    private final void f(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f21466b.length;
        while (i10 < length && it.hasNext()) {
            this.f21466b[i10] = it.next();
            i10++;
        }
        int i11 = this.f21465a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f21466b[i12] = it.next();
        }
        this.f21467c = size() + collection.size();
    }

    private final void g(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f21466b;
        m.f(objArr2, objArr, 0, this.f21465a, objArr2.length);
        Object[] objArr3 = this.f21466b;
        int length = objArr3.length;
        int i11 = this.f21465a;
        m.f(objArr3, objArr, length - i11, 0, i11);
        this.f21465a = 0;
        this.f21466b = objArr;
    }

    private final int o(int i10) {
        return i10 == 0 ? o.C(this.f21466b) : i10 - 1;
    }

    private final void p(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f21466b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f21464e) {
            this.f21466b = new Object[od.k.d(i10, 10)];
        } else {
            g(d.Companion.e(objArr.length, i10));
        }
    }

    private final int s(int i10) {
        if (i10 == o.C(this.f21466b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int t(int i10) {
        return i10 < 0 ? i10 + this.f21466b.length : i10;
    }

    private final void v(int i10, int i11) {
        if (i10 < i11) {
            m.l(this.f21466b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f21466b;
        m.l(objArr, null, i10, objArr.length);
        m.l(this.f21466b, null, 0, i11);
    }

    private final int w(int i10) {
        Object[] objArr = this.f21466b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void x() {
        ((AbstractList) this).modCount++;
    }

    public final E B() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        x();
        p(size() + elements.size());
        f(w(this.f21465a + size()), elements);
        return true;
    }

    public final void addFirst(E e10) {
        x();
        p(size() + 1);
        int iO = o(this.f21465a);
        this.f21465a = iO;
        this.f21466b[iO] = e10;
        this.f21467c = size() + 1;
    }

    public final void addLast(E e10) {
        x();
        p(size() + 1);
        this.f21466b[w(this.f21465a + size())] = e10;
        this.f21467c = size() + 1;
    }

    @Override // kotlin.collections.f
    public int c() {
        return this.f21467c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            x();
            v(this.f21465a, w(this.f21465a + size()));
        }
        this.f21465a = 0;
        this.f21467c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.f
    public E e(int i10) {
        d.Companion.b(i10, size());
        if (i10 == t.m(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        x();
        int iW = w(this.f21465a + i10);
        E e10 = (E) this.f21466b[iW];
        if (i10 < (size() >> 1)) {
            int i11 = this.f21465a;
            if (iW >= i11) {
                Object[] objArr = this.f21466b;
                m.f(objArr, objArr, i11 + 1, i11, iW);
            } else {
                Object[] objArr2 = this.f21466b;
                m.f(objArr2, objArr2, 1, 0, iW);
                Object[] objArr3 = this.f21466b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f21465a;
                m.f(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f21466b;
            int i13 = this.f21465a;
            objArr4[i13] = null;
            this.f21465a = s(i13);
        } else {
            int iW2 = w(this.f21465a + t.m(this));
            if (iW <= iW2) {
                Object[] objArr5 = this.f21466b;
                m.f(objArr5, objArr5, iW, iW + 1, iW2 + 1);
            } else {
                Object[] objArr6 = this.f21466b;
                m.f(objArr6, objArr6, iW, iW + 1, objArr6.length);
                Object[] objArr7 = this.f21466b;
                objArr7[objArr7.length - 1] = objArr7[0];
                m.f(objArr7, objArr7, 0, 1, iW2 + 1);
            }
            this.f21466b[iW2] = null;
        }
        this.f21467c = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, size());
        return (E) this.f21466b[w(this.f21465a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iW = w(this.f21465a + size());
        int length = this.f21465a;
        if (length < iW) {
            while (length < iW) {
                if (kotlin.jvm.internal.t.a(obj, this.f21466b[length])) {
                    i10 = this.f21465a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iW) {
            return -1;
        }
        int length2 = this.f21466b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.t.a(obj, this.f21466b[length])) {
                i10 = this.f21465a;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iW; i11++) {
            if (kotlin.jvm.internal.t.a(obj, this.f21466b[i11])) {
                length = i11 + this.f21466b.length;
                i10 = this.f21465a;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iC;
        int i10;
        int iW = w(this.f21465a + size());
        int i11 = this.f21465a;
        if (i11 < iW) {
            iC = iW - 1;
            if (i11 <= iC) {
                while (!kotlin.jvm.internal.t.a(obj, this.f21466b[iC])) {
                    if (iC != i11) {
                        iC--;
                    }
                }
                i10 = this.f21465a;
                return iC - i10;
            }
            return -1;
        }
        if (i11 > iW) {
            for (int i12 = iW - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.t.a(obj, this.f21466b[i12])) {
                    iC = i12 + this.f21466b.length;
                    i10 = this.f21465a;
                    return iC - i10;
                }
            }
            iC = o.C(this.f21466b);
            int i13 = this.f21465a;
            if (i13 <= iC) {
                while (!kotlin.jvm.internal.t.a(obj, this.f21466b[iC])) {
                    if (iC != i13) {
                        iC--;
                    }
                }
                i10 = this.f21465a;
                return iC - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int iW;
        kotlin.jvm.internal.t.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f21466b.length == 0) == false) {
                int iW2 = w(this.f21465a + size());
                int i10 = this.f21465a;
                if (i10 < iW2) {
                    iW = i10;
                    while (i10 < iW2) {
                        Object obj = this.f21466b[i10];
                        if (!elements.contains(obj)) {
                            this.f21466b[iW] = obj;
                            iW++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    m.l(this.f21466b, null, iW, iW2);
                } else {
                    int length = this.f21466b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f21466b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f21466b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iW = w(i11);
                    for (int i12 = 0; i12 < iW2; i12++) {
                        Object[] objArr2 = this.f21466b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f21466b[iW] = obj3;
                            iW = s(iW);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    x();
                    this.f21467c = t(iW - this.f21465a);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        x();
        Object[] objArr = this.f21466b;
        int i10 = this.f21465a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f21465a = s(i10);
        this.f21467c = size() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        x();
        int iW = w(this.f21465a + t.m(this));
        Object[] objArr = this.f21466b;
        E e10 = (E) objArr[iW];
        objArr[iW] = null;
        this.f21467c = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d.Companion.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        x();
        if (i10 < size() - i11) {
            C(i10, i11);
            int iW = w(this.f21465a + i12);
            v(this.f21465a, iW);
            this.f21465a = iW;
        } else {
            D(i10, i11);
            int iW2 = w(this.f21465a + size());
            v(t(iW2 - i12), iW2);
        }
        this.f21467c = size() - i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int iW;
        kotlin.jvm.internal.t.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f21466b.length == 0) == false) {
                int iW2 = w(this.f21465a + size());
                int i10 = this.f21465a;
                if (i10 < iW2) {
                    iW = i10;
                    while (i10 < iW2) {
                        Object obj = this.f21466b[i10];
                        if (elements.contains(obj)) {
                            this.f21466b[iW] = obj;
                            iW++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    m.l(this.f21466b, null, iW, iW2);
                } else {
                    int length = this.f21466b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f21466b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f21466b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    iW = w(i11);
                    for (int i12 = 0; i12 < iW2; i12++) {
                        Object[] objArr2 = this.f21466b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f21466b[iW] = obj3;
                            iW = s(iW);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    x();
                    this.f21467c = t(iW - this.f21465a);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        d.Companion.b(i10, size());
        int iW = w(this.f21465a + i10);
        Object[] objArr = this.f21466b;
        E e11 = (E) objArr[iW];
        objArr[iW] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        if (array.length < size()) {
            array = (T[]) k.a(array, size());
        }
        int iW = w(this.f21465a + size());
        int i10 = this.f21465a;
        if (i10 < iW) {
            m.h(this.f21466b, array, 0, i10, iW, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f21466b;
            m.f(objArr, array, 0, this.f21465a, objArr.length);
            Object[] objArr2 = this.f21466b;
            m.f(objArr2, array, objArr2.length - this.f21465a, 0, iW);
        }
        return (T[]) s.f(size(), array);
    }

    public final E z() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        d.Companion.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        x();
        p(size() + 1);
        int iW = w(this.f21465a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iO = o(iW);
            int iO2 = o(this.f21465a);
            int i11 = this.f21465a;
            if (iO >= i11) {
                Object[] objArr = this.f21466b;
                objArr[iO2] = objArr[i11];
                m.f(objArr, objArr, i11, i11 + 1, iO + 1);
            } else {
                Object[] objArr2 = this.f21466b;
                m.f(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f21466b;
                objArr3[objArr3.length - 1] = objArr3[0];
                m.f(objArr3, objArr3, 0, 1, iO + 1);
            }
            this.f21466b[iO] = e10;
            this.f21465a = iO2;
        } else {
            int iW2 = w(this.f21465a + size());
            if (iW < iW2) {
                Object[] objArr4 = this.f21466b;
                m.f(objArr4, objArr4, iW + 1, iW, iW2);
            } else {
                Object[] objArr5 = this.f21466b;
                m.f(objArr5, objArr5, 1, 0, iW2);
                Object[] objArr6 = this.f21466b;
                objArr6[0] = objArr6[objArr6.length - 1];
                m.f(objArr6, objArr6, iW + 1, iW, objArr6.length - 1);
            }
            this.f21466b[iW] = e10;
        }
        this.f21467c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        d.Companion.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        x();
        p(size() + elements.size());
        int iW = w(this.f21465a + size());
        int iW2 = w(this.f21465a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f21465a;
            int length = i11 - size;
            if (iW2 < i11) {
                Object[] objArr = this.f21466b;
                m.f(objArr, objArr, length, i11, objArr.length);
                if (size >= iW2) {
                    Object[] objArr2 = this.f21466b;
                    m.f(objArr2, objArr2, objArr2.length - size, 0, iW2);
                } else {
                    Object[] objArr3 = this.f21466b;
                    m.f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f21466b;
                    m.f(objArr4, objArr4, 0, size, iW2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f21466b;
                m.f(objArr5, objArr5, length, i11, iW2);
            } else {
                Object[] objArr6 = this.f21466b;
                length += objArr6.length;
                int i12 = iW2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    m.f(objArr6, objArr6, length, i11, iW2);
                } else {
                    m.f(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f21466b;
                    m.f(objArr7, objArr7, 0, this.f21465a + length2, iW2);
                }
            }
            this.f21465a = length;
            f(t(iW2 - size), elements);
        } else {
            int i13 = iW2 + size;
            if (iW2 < iW) {
                int i14 = size + iW;
                Object[] objArr8 = this.f21466b;
                if (i14 <= objArr8.length) {
                    m.f(objArr8, objArr8, i13, iW2, iW);
                } else if (i13 >= objArr8.length) {
                    m.f(objArr8, objArr8, i13 - objArr8.length, iW2, iW);
                } else {
                    int length3 = iW - (i14 - objArr8.length);
                    m.f(objArr8, objArr8, 0, length3, iW);
                    Object[] objArr9 = this.f21466b;
                    m.f(objArr9, objArr9, i13, iW2, length3);
                }
            } else {
                Object[] objArr10 = this.f21466b;
                m.f(objArr10, objArr10, size, 0, iW);
                Object[] objArr11 = this.f21466b;
                if (i13 >= objArr11.length) {
                    m.f(objArr11, objArr11, i13 - objArr11.length, iW2, objArr11.length);
                } else {
                    m.f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f21466b;
                    m.f(objArr12, objArr12, i13, iW2, objArr12.length - size);
                }
            }
            f(iW2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
