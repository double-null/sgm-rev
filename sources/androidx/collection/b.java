package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ArraySet.java */
/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f1601e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f1602f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Object[] f1603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f1604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object[] f1605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f1606j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f1608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g<E, E> f1610d;

    /* JADX INFO: compiled from: ArraySet.java */
    class a extends g<E, E> {
        a() {
        }

        @Override // androidx.collection.g
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.g
        protected Object b(int i10, int i11) {
            return b.this.f1608b[i10];
        }

        @Override // androidx.collection.g
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.g
        protected int d() {
            return b.this.f1609c;
        }

        @Override // androidx.collection.g
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.g
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.g
        protected void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // androidx.collection.g
        protected void h(int i10) {
            b.this.h(i10);
        }

        @Override // androidx.collection.g
        protected E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1605i;
                if (objArr != null) {
                    this.f1608b = objArr;
                    f1605i = (Object[]) objArr[0];
                    this.f1607a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1606j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1603g;
                if (objArr2 != null) {
                    this.f1608b = objArr2;
                    f1603g = (Object[]) objArr2[0];
                    this.f1607a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1604h--;
                    return;
                }
            }
        }
        this.f1607a = new int[i10];
        this.f1608b = new Object[i10];
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1606j < 10) {
                    objArr[0] = f1605i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1605i = objArr;
                    f1606j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1604h < 10) {
                    objArr[0] = f1603g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1603g = objArr;
                    f1604h++;
                }
            }
        }
    }

    private g<E, E> e() {
        if (this.f1610d == null) {
            this.f1610d = new a();
        }
        return this.f1610d;
    }

    private int f(Object obj, int i10) {
        int i11 = this.f1609c;
        if (i11 == 0) {
            return -1;
        }
        int iA = d.a(this.f1607a, i11, i10);
        if (iA < 0 || obj.equals(this.f1608b[iA])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f1607a[i12] == i10) {
            if (obj.equals(this.f1608b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f1607a[i13] == i10; i13--) {
            if (obj.equals(this.f1608b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private int g() {
        int i10 = this.f1609c;
        if (i10 == 0) {
            return -1;
        }
        int iA = d.a(this.f1607a, i10, 0);
        if (iA < 0 || this.f1608b[iA] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f1607a[i11] == 0) {
            if (this.f1608b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f1607a[i12] == 0; i12--) {
            if (this.f1608b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iF;
        if (e10 == null) {
            iF = g();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iF = f(e10, iHashCode);
        }
        if (iF >= 0) {
            return false;
        }
        int i11 = ~iF;
        int i12 = this.f1609c;
        int[] iArr = this.f1607a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f1608b;
            a(i13);
            int[] iArr2 = this.f1607a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1608b, 0, objArr.length);
            }
            d(iArr, objArr, this.f1609c);
        }
        int i14 = this.f1609c;
        if (i11 < i14) {
            int[] iArr3 = this.f1607a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f1608b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f1609c - i11);
        }
        this.f1607a[i11] = i10;
        this.f1608b[i11] = e10;
        this.f1609c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        c(this.f1609c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void c(int i10) {
        int[] iArr = this.f1607a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1608b;
            a(i10);
            int i11 = this.f1609c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f1607a, 0, i11);
                System.arraycopy(objArr, 0, this.f1608b, 0, this.f1609c);
            }
            d(iArr, objArr, this.f1609c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f1609c;
        if (i10 != 0) {
            d(this.f1607a, this.f1608b, i10);
            this.f1607a = f1601e;
            this.f1608b = f1602f;
            this.f1609c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1609c; i10++) {
                try {
                    if (!set.contains(i(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E h(int i10) {
        Object[] objArr = this.f1608b;
        E e10 = (E) objArr[i10];
        int i11 = this.f1609c;
        if (i11 <= 1) {
            d(this.f1607a, objArr, i11);
            this.f1607a = f1601e;
            this.f1608b = f1602f;
            this.f1609c = 0;
        } else {
            int[] iArr = this.f1607a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f1609c = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f1608b;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f1609c - i10);
                }
                this.f1608b[this.f1609c] = null;
            } else {
                a(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f1609c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1607a, 0, i10);
                    System.arraycopy(objArr, 0, this.f1608b, 0, i10);
                }
                int i14 = this.f1609c;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f1607a, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f1608b, i10, this.f1609c - i10);
                }
            }
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1607a;
        int i10 = this.f1609c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public E i(int i10) {
        return (E) this.f1608b[i10];
    }

    public int indexOf(Object obj) {
        return obj == null ? g() : f(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1609c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return e().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f1609c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f1608b[i10])) {
                h(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1609c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f1609c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f1608b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f1609c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1609c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eI = i(i10);
            if (eI != this) {
                sb2.append(eI);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f1607a = f1601e;
            this.f1608b = f1602f;
        } else {
            a(i10);
        }
        this.f1609c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1609c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1609c));
        }
        System.arraycopy(this.f1608b, 0, tArr, 0, this.f1609c);
        int length = tArr.length;
        int i10 = this.f1609c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
