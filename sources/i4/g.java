package i4;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: LinkedTreeMap.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<Comparable> f15955h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Comparator<? super K> f15956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e<K, V> f15957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f15958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f15959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final e<K, V> f15960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g<K, V>.b f15961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g<K, V>.c f15962g;

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: compiled from: LinkedTreeMap.java */
        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarE;
            if (!(obj instanceof Map.Entry) || (eVarE = g.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.k(eVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f15958c;
        }
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    final class c extends AbstractSet<K> {

        /* JADX INFO: compiled from: LinkedTreeMap.java */
        class a extends g<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f15976f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.n(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f15958c;
        }
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    private abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f15967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f15968b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15969c;

        d() {
            this.f15967a = g.this.f15960e.f15974d;
            this.f15969c = g.this.f15959d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f15967a;
            g gVar = g.this;
            if (eVar == gVar.f15960e) {
                throw new NoSuchElementException();
            }
            if (gVar.f15959d != this.f15969c) {
                throw new ConcurrentModificationException();
            }
            this.f15967a = eVar.f15974d;
            this.f15968b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f15967a != g.this.f15960e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f15968b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.k(eVar, true);
            this.f15968b = null;
            this.f15969c = g.this.f15959d;
        }
    }

    public g() {
        this(f15955h);
    }

    private boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void g(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f15972b;
            e<K, V> eVar3 = eVar.f15973c;
            int i10 = eVar2 != null ? eVar2.f15978h : 0;
            int i11 = eVar3 != null ? eVar3.f15978h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f15972b;
                e<K, V> eVar5 = eVar3.f15973c;
                int i13 = (eVar4 != null ? eVar4.f15978h : 0) - (eVar5 != null ? eVar5.f15978h : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    p(eVar);
                } else {
                    s(eVar3);
                    p(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f15972b;
                e<K, V> eVar7 = eVar2.f15973c;
                int i14 = (eVar6 != null ? eVar6.f15978h : 0) - (eVar7 != null ? eVar7.f15978h : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    s(eVar);
                } else {
                    p(eVar2);
                    s(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f15978h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f15978h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f15971a;
        }
    }

    private void o(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f15971a;
        eVar.f15971a = null;
        if (eVar2 != null) {
            eVar2.f15971a = eVar3;
        }
        if (eVar3 == null) {
            this.f15957b = eVar2;
        } else if (eVar3.f15972b == eVar) {
            eVar3.f15972b = eVar2;
        } else {
            eVar3.f15973c = eVar2;
        }
    }

    private void p(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f15972b;
        e<K, V> eVar3 = eVar.f15973c;
        e<K, V> eVar4 = eVar3.f15972b;
        e<K, V> eVar5 = eVar3.f15973c;
        eVar.f15973c = eVar4;
        if (eVar4 != null) {
            eVar4.f15971a = eVar;
        }
        o(eVar, eVar3);
        eVar3.f15972b = eVar;
        eVar.f15971a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f15978h : 0, eVar4 != null ? eVar4.f15978h : 0) + 1;
        eVar.f15978h = iMax;
        eVar3.f15978h = Math.max(iMax, eVar5 != null ? eVar5.f15978h : 0) + 1;
    }

    private void s(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f15972b;
        e<K, V> eVar3 = eVar.f15973c;
        e<K, V> eVar4 = eVar2.f15972b;
        e<K, V> eVar5 = eVar2.f15973c;
        eVar.f15972b = eVar5;
        if (eVar5 != null) {
            eVar5.f15971a = eVar;
        }
        o(eVar, eVar2);
        eVar2.f15973c = eVar;
        eVar.f15971a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f15978h : 0, eVar5 != null ? eVar5.f15978h : 0) + 1;
        eVar.f15978h = iMax;
        eVar2.f15978h = Math.max(iMax, eVar4 != null ? eVar4.f15978h : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e<K, V> c(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f15956a;
        e<K, V> eVar2 = this.f15957b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f15955h ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f15976f) : comparator.compare(k10, eVar2.f15976f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f15972b : eVar2.f15973c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f15960e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f15975e);
            if (iCompareTo < 0) {
                eVar2.f15972b = eVar;
            } else {
                eVar2.f15973c = eVar;
            }
            g(eVar2, true);
        } else {
            if (comparator == f15955h && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f15975e);
            this.f15957b = eVar;
        }
        this.f15958c++;
        this.f15959d++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f15957b = null;
        this.f15958c = 0;
        this.f15959d++;
        e<K, V> eVar = this.f15960e;
        eVar.f15975e = eVar;
        eVar.f15974d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    e<K, V> e(Map.Entry<?, ?> entry) {
        e<K, V> eVarF = f(entry.getKey());
        if (eVarF != null && b(eVarF.f15977g, entry.getValue())) {
            return eVarF;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f15961f;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f15961f = bVar2;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> f(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return c(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarF = f(obj);
        if (eVarF != null) {
            return eVarF.f15977g;
        }
        return null;
    }

    void k(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f15975e;
            eVar2.f15974d = eVar.f15974d;
            eVar.f15974d.f15975e = eVar2;
        }
        e<K, V> eVar3 = eVar.f15972b;
        e<K, V> eVar4 = eVar.f15973c;
        e<K, V> eVar5 = eVar.f15971a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                o(eVar, eVar3);
                eVar.f15972b = null;
            } else if (eVar4 != null) {
                o(eVar, eVar4);
                eVar.f15973c = null;
            } else {
                o(eVar, null);
            }
            g(eVar5, false);
            this.f15958c--;
            this.f15959d++;
            return;
        }
        e<K, V> eVarB = eVar3.f15978h > eVar4.f15978h ? eVar3.b() : eVar4.a();
        k(eVarB, false);
        e<K, V> eVar6 = eVar.f15972b;
        if (eVar6 != null) {
            i10 = eVar6.f15978h;
            eVarB.f15972b = eVar6;
            eVar6.f15971a = eVarB;
            eVar.f15972b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f15973c;
        if (eVar7 != null) {
            i11 = eVar7.f15978h;
            eVarB.f15973c = eVar7;
            eVar7.f15971a = eVarB;
            eVar.f15973c = null;
        }
        eVarB.f15978h = Math.max(i10, i11) + 1;
        o(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.f15962g;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.f15962g = cVar2;
        return cVar2;
    }

    e<K, V> n(Object obj) {
        e<K, V> eVarF = f(obj);
        if (eVarF != null) {
            k(eVarF, true);
        }
        return eVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarC = c(k10, true);
        V v11 = eVarC.f15977g;
        eVarC.f15977g = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarN = n(obj);
        if (eVarN != null) {
            return eVarN.f15977g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f15958c;
    }

    public g(Comparator<? super K> comparator) {
        this.f15958c = 0;
        this.f15959d = 0;
        this.f15960e = new e<>();
        this.f15956a = comparator == null ? f15955h : comparator;
    }

    /* JADX INFO: compiled from: LinkedTreeMap.java */
    static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f15971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f15972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e<K, V> f15973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e<K, V> f15974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e<K, V> f15975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f15976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        V f15977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15978h;

        e() {
            this.f15976f = null;
            this.f15975e = this;
            this.f15974d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f15972b; eVar2 != null; eVar2 = eVar2.f15972b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f15973c; eVar2 != null; eVar2 = eVar2.f15973c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f15976f;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f15977g;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f15976f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f15977g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f15976f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f15977g;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f15977g;
            this.f15977g = v10;
            return v11;
        }

        public String toString() {
            return this.f15976f + "=" + this.f15977g;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f15971a = eVar;
            this.f15976f = k10;
            this.f15978h = 1;
            this.f15974d = eVar2;
            this.f15975e = eVar3;
            eVar3.f15974d = this;
            eVar2.f15975e = this;
        }
    }
}
