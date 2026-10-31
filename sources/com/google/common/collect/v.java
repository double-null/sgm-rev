package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: compiled from: ImmutableMap.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f11706d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient w<Map.Entry<K, V>> f11707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient w<K> f11708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient s<V> f11709c;

    /* JADX INFO: compiled from: ImmutableMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator<? super V> f11710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f11711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f11713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0145a f11714e;

        /* JADX INFO: renamed from: com.google.common.collect.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImmutableMap.java */
        static final class C0145a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f11715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f11716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f11717c;

            C0145a(Object obj, Object obj2, Object obj3) {
                this.f11715a = obj;
                this.f11716b = obj2;
                this.f11717c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f11715a + "=" + this.f11716b + " and " + this.f11715a + "=" + this.f11717c);
            }
        }

        public a() {
            this(4);
        }

        private v<K, V> b(boolean z10) {
            Object[] objArrF;
            C0145a c0145a;
            C0145a c0145a2;
            if (z10 && (c0145a2 = this.f11714e) != null) {
                throw c0145a2.a();
            }
            int length = this.f11712c;
            if (this.f11710a == null) {
                objArrF = this.f11711b;
            } else {
                if (this.f11713d) {
                    this.f11711b = Arrays.copyOf(this.f11711b, length * 2);
                }
                objArrF = this.f11711b;
                if (!z10) {
                    objArrF = f(objArrF, this.f11712c);
                    if (objArrF.length < this.f11711b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f11710a);
            }
            this.f11713d = true;
            q0 q0VarC = q0.C(length, objArrF, this);
            if (!z10 || (c0145a = this.f11714e) == null) {
                return q0VarC;
            }
            throw c0145a.a();
        }

        private void e(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f11711b;
            if (i11 > objArr.length) {
                this.f11711b = Arrays.copyOf(objArr, s.b.d(objArr.length, i11));
                this.f11713d = false;
            }
        }

        private Object[] f(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void k(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, n0.c(comparator).f(f0.l()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public v<K, V> a() {
            return d();
        }

        public v<K, V> c() {
            return b(false);
        }

        public v<K, V> d() {
            return b(true);
        }

        public a<K, V> g(K k10, V v10) {
            e(this.f11712c + 1);
            h.a(k10, v10);
            Object[] objArr = this.f11711b;
            int i10 = this.f11712c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f11712c = i10 + 1;
            return this;
        }

        public a<K, V> h(Map.Entry<? extends K, ? extends V> entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public a<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                e(this.f11712c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            return this;
        }

        public a<K, V> j(Map<? extends K, ? extends V> map) {
            return i(map.entrySet());
        }

        a(int i10) {
            this.f11711b = new Object[i10 * 2];
            this.f11712c = 0;
            this.f11713d = false;
        }
    }

    /* JADX INFO: compiled from: ImmutableMap.java */
    static class b<K, V> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f11719b;

        b(v<K, V> vVar) {
            Object[] objArr = new Object[vVar.size()];
            Object[] objArr2 = new Object[vVar.size()];
            c1<Map.Entry<K, V>> it = vVar.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f11718a = objArr;
            this.f11719b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object b() {
            Object[] objArr = (Object[]) this.f11718a;
            Object[] objArr2 = (Object[]) this.f11719b;
            a<K, V> aVarC = c(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                aVarC.g(objArr[i10], objArr2[i10]);
            }
            return aVarC.d();
        }

        a<K, V> c(int i10) {
            return new a<>(i10);
        }

        final Object readResolve() {
            Object obj = this.f11718a;
            if (!(obj instanceof w)) {
                return b();
            }
            w wVar = (w) obj;
            s sVar = (s) this.f11719b;
            a aVar = (a<K, V>) c(wVar.size());
            c1 it = wVar.iterator();
            c1 it2 = sVar.iterator();
            while (it.hasNext()) {
                aVar.g(it.next(), it2.next());
            }
            return aVar.d();
        }
    }

    v() {
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    public static <K, V> a<K, V> c(int i10) {
        h.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> v<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.a();
    }

    public static <K, V> v<K, V> f(Map<? extends K, ? extends V> map) {
        if ((map instanceof v) && !(map instanceof SortedMap)) {
            v<K, V> vVar = (v) map;
            if (!vVar.p()) {
                return vVar;
            }
        }
        return e(map.entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K, V> v<K, V> t() {
        return (v<K, V>) q0.f11668h;
    }

    public static <K, V> v<K, V> v(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        h.a(k10, v10);
        h.a(k11, v11);
        h.a(k12, v12);
        h.a(k13, v13);
        return q0.B(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> v<K, V> w(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        h.a(k10, v10);
        h.a(k11, v11);
        h.a(k12, v12);
        h.a(k13, v13);
        h.a(k14, v14);
        return q0.B(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> v<K, V> x(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        h.a(k10, v10);
        h.a(k11, v11);
        h.a(k12, v12);
        h.a(k13, v13);
        h.a(k14, v14);
        h.a(k15, v15);
        h.a(k16, v16);
        return q0.B(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return f0.c(this, obj);
    }

    abstract w<Map.Entry<K, V>> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return w0.d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract w<K> k();

    abstract s<V> n();

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.f11707a;
        if (wVar != null) {
            return wVar;
        }
        w<Map.Entry<K, V>> wVarG = g();
        this.f11707a = wVarG;
        return wVarG;
    }

    abstract boolean p();

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public w<K> keySet() {
        w<K> wVar = this.f11708b;
        if (wVar != null) {
            return wVar;
        }
        w<K> wVarK = k();
        this.f11708b = wVarK;
        return wVarK;
    }

    public String toString() {
        return f0.k(this);
    }

    Object writeReplace() {
        return new b(this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public s<V> values() {
        s<V> sVar = this.f11709c;
        if (sVar != null) {
            return sVar;
        }
        s<V> sVarN = n();
        this.f11709c = sVarN;
        return sVarN;
    }
}
