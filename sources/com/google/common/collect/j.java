package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes4.dex */
class j<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f11635j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f11636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f11637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f11638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f11639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f11640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f11641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set<K> f11642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f11643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection<V> f11644i;

    /* JADX INFO: compiled from: CompactHashMap.java */
    class a extends j<K, V>.e<K> {
        a() {
            super(j.this, null);
        }

        @Override // com.google.common.collect.j.e
        K b(int i10) {
            return (K) j.this.k0(i10);
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class b extends j<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(j.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.j.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i10) {
            return new g(i10);
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class c extends j<K, V>.e<V> {
        c() {
            super(j.this, null);
        }

        @Override // com.google.common.collect.j.e
        V b(int i10) {
            return (V) j.this.A0(i10);
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapK = j.this.K();
            if (mapK != null) {
                return mapK.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iH0 = j.this.h0(entry.getKey());
            return iH0 != -1 && com.google.common.base.l.a(j.this.A0(iH0), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return j.this.U();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapK = j.this.K();
            if (mapK != null) {
                return mapK.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (j.this.n0()) {
                return false;
            }
            int iD0 = j.this.d0();
            int iF = k.f(entry.getKey(), entry.getValue(), iD0, j.this.r0(), j.this.p0(), j.this.q0(), j.this.s0());
            if (iF == -1) {
                return false;
            }
            j.this.m0(iF, iD0);
            j.g(j.this);
            j.this.e0();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return j.this.l0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapK = j.this.K();
            if (mapK != null) {
                return mapK.keySet().remove(obj);
            }
            return j.this.o0(obj) != j.f11635j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    final class g extends com.google.common.collect.e<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f11654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f11655b;

        g(int i10) {
            this.f11654a = (K) j.this.k0(i10);
            this.f11655b = i10;
        }

        private void b() {
            int i10 = this.f11655b;
            if (i10 == -1 || i10 >= j.this.size() || !com.google.common.base.l.a(this.f11654a, j.this.k0(this.f11655b))) {
                this.f11655b = j.this.h0(this.f11654a);
            }
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public K getKey() {
            return this.f11654a;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapK = j.this.K();
            if (mapK != null) {
                return (V) l0.a(mapK.get(this.f11654a));
            }
            b();
            int i10 = this.f11655b;
            return i10 == -1 ? (V) l0.b() : (V) j.this.A0(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> mapK = j.this.K();
            if (mapK != null) {
                return (V) l0.a(mapK.put(this.f11654a, v10));
            }
            b();
            int i10 = this.f11655b;
            if (i10 == -1) {
                j.this.put(this.f11654a, v10);
                return (V) l0.b();
            }
            V v11 = (V) j.this.A0(i10);
            j.this.z0(this.f11655b, v10);
            return v11;
        }
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return j.this.B0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return j.this.size();
        }
    }

    j(int i10) {
        i0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V A0(int i10) {
        return (V) s0()[i10];
    }

    public static <K, V> j<K, V> I(int i10) {
        return new j<>(i10);
    }

    private int N(int i10) {
        return p0()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d0() {
        return (1 << (this.f11640e & 31)) - 1;
    }

    static /* synthetic */ int g(j jVar) {
        int i10 = jVar.f11641f;
        jVar.f11641f = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h0(Object obj) {
        if (n0()) {
            return -1;
        }
        int iC = r.c(obj);
        int iD0 = d0();
        int iH = k.h(r0(), iC & iD0);
        if (iH == 0) {
            return -1;
        }
        int iB = k.b(iC, iD0);
        do {
            int i10 = iH - 1;
            int iN = N(i10);
            if (k.b(iN, iD0) == iB && com.google.common.base.l.a(obj, k0(i10))) {
                return i10;
            }
            iH = k.c(iN, iD0);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K k0(int i10) {
        return (K) q0()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object o0(Object obj) {
        if (n0()) {
            return f11635j;
        }
        int iD0 = d0();
        int iF = k.f(obj, null, iD0, r0(), p0(), q0(), null);
        if (iF == -1) {
            return f11635j;
        }
        V vA0 = A0(iF);
        m0(iF, iD0);
        this.f11641f--;
        e0();
        return vA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] p0() {
        int[] iArr = this.f11637b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] q0() {
        Object[] objArr = this.f11638c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object r0() {
        Object obj = this.f11636a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid size: " + i10);
        }
        i0(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] s0() {
        Object[] objArr = this.f11639d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void u0(int i10) {
        int iMin;
        int length = p0().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        t0(iMin);
    }

    private int v0(int i10, int i11, int i12, int i13) {
        Object objA = k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            k.i(objA, i12 & i14, i13 + 1);
        }
        Object objR0 = r0();
        int[] iArrP0 = p0();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = k.h(objR0, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrP0[i16];
                int iB = k.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = k.h(objA, i18);
                k.i(objA, i18, iH);
                iArrP0[i16] = k.d(iB, iH2, i14);
                iH = k.c(i17, i10);
            }
        }
        this.f11636a = objA;
        x0(i14);
        return i14;
    }

    private void w0(int i10, int i11) {
        p0()[i10] = i11;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itU = U();
        while (itU.hasNext()) {
            Map.Entry<K, V> next = itU.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    private void x0(int i10) {
        this.f11640e = k.d(this.f11640e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void y0(int i10, K k10) {
        q0()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(int i10, V v10) {
        s0()[i10] = v10;
    }

    int B() {
        com.google.common.base.p.s(n0(), "Arrays already allocated");
        int i10 = this.f11640e;
        int iJ = k.j(i10);
        this.f11636a = k.a(iJ);
        x0(iJ - 1);
        this.f11637b = new int[i10];
        this.f11638c = new Object[i10];
        this.f11639d = new Object[i10];
        return i10;
    }

    Iterator<V> B0() {
        Map<K, V> mapK = K();
        return mapK != null ? mapK.values().iterator() : new c();
    }

    Map<K, V> C() {
        Map<K, V> mapF = F(d0() + 1);
        int iY = Y();
        while (iY >= 0) {
            mapF.put(k0(iY), A0(iY));
            iY = a0(iY);
        }
        this.f11636a = mapF;
        this.f11637b = null;
        this.f11638c = null;
        this.f11639d = null;
        e0();
        return mapF;
    }

    Set<Map.Entry<K, V>> D() {
        return new d();
    }

    Map<K, V> F(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> G() {
        return new f();
    }

    Collection<V> H() {
        return new h();
    }

    Map<K, V> K() {
        Object obj = this.f11636a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> U() {
        Map<K, V> mapK = K();
        return mapK != null ? mapK.entrySet().iterator() : new b();
    }

    int Y() {
        return isEmpty() ? -1 : 0;
    }

    int a0(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f11641f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (n0()) {
            return;
        }
        e0();
        Map<K, V> mapK = K();
        if (mapK != null) {
            this.f11640e = com.google.common.primitives.f.e(size(), 3, 1073741823);
            mapK.clear();
            this.f11636a = null;
            this.f11641f = 0;
            return;
        }
        Arrays.fill(q0(), 0, this.f11641f, (Object) null);
        Arrays.fill(s0(), 0, this.f11641f, (Object) null);
        k.g(r0());
        Arrays.fill(p0(), 0, this.f11641f, 0);
        this.f11641f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapK = K();
        if (mapK != null) {
            return mapK.containsKey(obj);
        }
        return h0(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapK = K();
        if (mapK != null) {
            return mapK.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f11641f; i10++) {
            if (com.google.common.base.l.a(obj, A0(i10))) {
                return true;
            }
        }
        return false;
    }

    void e0() {
        this.f11640e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11643h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setD = D();
        this.f11643h = setD;
        return setD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapK = K();
        if (mapK != null) {
            return mapK.get(obj);
        }
        int iH0 = h0(obj);
        if (iH0 == -1) {
            return null;
        }
        x(iH0);
        return A0(iH0);
    }

    void i0(int i10) {
        com.google.common.base.p.e(i10 >= 0, "Expected size must be >= 0");
        this.f11640e = com.google.common.primitives.f.e(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    void j0(int i10, K k10, V v10, int i11, int i12) {
        w0(i10, k.d(i11, 0, i12));
        y0(i10, k10);
        z0(i10, v10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f11642g;
        if (set != null) {
            return set;
        }
        Set<K> setG = G();
        this.f11642g = setG;
        return setG;
    }

    Iterator<K> l0() {
        Map<K, V> mapK = K();
        return mapK != null ? mapK.keySet().iterator() : new a();
    }

    void m0(int i10, int i11) {
        Object objR0 = r0();
        int[] iArrP0 = p0();
        Object[] objArrQ0 = q0();
        Object[] objArrS0 = s0();
        int size = size() - 1;
        if (i10 >= size) {
            objArrQ0[i10] = null;
            objArrS0[i10] = null;
            iArrP0[i10] = 0;
            return;
        }
        Object obj = objArrQ0[size];
        objArrQ0[i10] = obj;
        objArrS0[i10] = objArrS0[size];
        objArrQ0[size] = null;
        objArrS0[size] = null;
        iArrP0[i10] = iArrP0[size];
        iArrP0[size] = 0;
        int iC = r.c(obj) & i11;
        int iH = k.h(objR0, iC);
        int i12 = size + 1;
        if (iH == i12) {
            k.i(objR0, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrP0[i13];
            int iC2 = k.c(i14, i11);
            if (iC2 == i12) {
                iArrP0[i13] = k.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    boolean n0() {
        return this.f11636a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int iV0;
        int i10;
        if (n0()) {
            B();
        }
        Map<K, V> mapK = K();
        if (mapK != null) {
            return mapK.put(k10, v10);
        }
        int[] iArrP0 = p0();
        Object[] objArrQ0 = q0();
        Object[] objArrS0 = s0();
        int i11 = this.f11641f;
        int i12 = i11 + 1;
        int iC = r.c(k10);
        int iD0 = d0();
        int i13 = iC & iD0;
        int iH = k.h(r0(), i13);
        if (iH != 0) {
            int iB = k.b(iC, iD0);
            int i14 = 0;
            while (true) {
                int i15 = iH - 1;
                int i16 = iArrP0[i15];
                if (k.b(i16, iD0) == iB && com.google.common.base.l.a(k10, objArrQ0[i15])) {
                    V v11 = (V) objArrS0[i15];
                    objArrS0[i15] = v10;
                    x(i15);
                    return v11;
                }
                int iC2 = k.c(i16, iD0);
                i14++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i14 >= 9) {
                        return C().put(k10, v10);
                    }
                    if (i12 > iD0) {
                        iV0 = v0(iD0, k.e(iD0), iC, i11);
                        i10 = iV0;
                    } else {
                        iArrP0[i15] = k.d(i16, i12, iD0);
                        i10 = iD0;
                    }
                }
            }
        } else if (i12 > iD0) {
            iV0 = v0(iD0, k.e(iD0), iC, i11);
            i10 = iV0;
        } else {
            k.i(r0(), i13, i12);
            i10 = iD0;
        }
        u0(i12);
        j0(i11, k10, v10, iC, i10);
        this.f11641f = i12;
        e0();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapK = K();
        if (mapK != null) {
            return mapK.remove(obj);
        }
        V v10 = (V) o0(obj);
        if (v10 == f11635j) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapK = K();
        return mapK != null ? mapK.size() : this.f11641f;
    }

    void t0(int i10) {
        this.f11637b = Arrays.copyOf(p0(), i10);
        this.f11638c = Arrays.copyOf(q0(), i10);
        this.f11639d = Arrays.copyOf(s0(), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f11644i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = H();
        this.f11644i = collectionH;
        return collectionH;
    }

    int z(int i10, int i11) {
        return i10 - 1;
    }

    /* JADX INFO: compiled from: CompactHashMap.java */
    private abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11651c;

        private e() {
            this.f11649a = j.this.f11640e;
            this.f11650b = j.this.Y();
            this.f11651c = -1;
        }

        private void a() {
            if (j.this.f11640e != this.f11649a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T b(int i10);

        void c() {
            this.f11649a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11650b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f11650b;
            this.f11651c = i10;
            T tB = b(i10);
            this.f11650b = j.this.a0(this.f11650b);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            com.google.common.collect.h.c(this.f11651c >= 0);
            c();
            j jVar = j.this;
            jVar.remove(jVar.k0(this.f11651c));
            this.f11650b = j.this.z(this.f11650b, this.f11651c);
            this.f11651c = -1;
        }

        /* synthetic */ e(j jVar, a aVar) {
            this();
        }
    }

    void x(int i10) {
    }
}
