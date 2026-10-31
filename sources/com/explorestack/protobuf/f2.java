package com.explorestack.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes.dex */
class f2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<f2<K, V>.e> f10429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f10430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile f2<K, V>.g f10432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f10433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile f2<K, V>.c f10434g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    static class a<FieldDescriptorType> extends f2<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.explorestack.protobuf.f2, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((e0.c) obj, obj2);
        }

        @Override // com.explorestack.protobuf.f2
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i10);
                    if (((e0.c) entryK.getKey()).isRepeated()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((e0.c) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class c extends f2<K, V>.g {
        private c() {
            super(f2.this, null);
        }

        @Override // com.explorestack.protobuf.f2.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(f2.this, null);
        }

        /* synthetic */ c(f2 f2Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f10439a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f10440b = new b();

        /* JADX INFO: compiled from: SmallSortedMap.java */
        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: SmallSortedMap.java */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f10439a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f10440b;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class e implements Map.Entry<K, V>, Comparable<f2<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f10441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f10442b;

        e(f2 f2Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f2<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f10441a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f10441a, entry.getKey()) && b(this.f10442b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10442b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f10441a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f10442b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            f2.this.g();
            V v11 = this.f10442b;
            this.f10442b = v10;
            return v11;
        }

        public String toString() {
            return this.f10441a + "=" + this.f10442b;
        }

        e(K k10, V v10) {
            this.f10441a = k10;
            this.f10442b = v10;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            f2.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = f2.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(f2.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            f2.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f2.this.size();
        }

        /* synthetic */ g(f2 f2Var, a aVar) {
            this();
        }
    }

    /* synthetic */ f2(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f10429b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f10429b.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int iCompareTo2 = k10.compareTo(this.f10429b.get(i11).getKey());
            if (iCompareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f10431d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.f10429b.isEmpty() || (this.f10429b instanceof ArrayList)) {
            return;
        }
        this.f10429b = new ArrayList(this.f10428a);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f10430c.isEmpty() && !(this.f10430c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10430c = treeMap;
            this.f10433f = treeMap.descendingMap();
        }
        return (SortedMap) this.f10430c;
    }

    static <FieldDescriptorType extends e0.c<FieldDescriptorType>> f2<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i10) {
        g();
        V value = this.f10429b.remove(i10).getValue();
        if (!this.f10430c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f10429b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f10429b.isEmpty()) {
            this.f10429b.clear();
        }
        if (this.f10430c.isEmpty()) {
            return;
        }
        this.f10430c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f10430c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f10432e == null) {
            this.f10432e = new g(this, null);
        }
        return this.f10432e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return super.equals(obj);
        }
        f2 f2Var = (f2) obj;
        int size = size();
        if (size != f2Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != f2Var.l()) {
            return entrySet().equals(f2Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(f2Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f10430c.equals(f2Var.f10430c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f10429b.get(iF).getValue() : this.f10430c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += this.f10429b.get(i10).hashCode();
        }
        return m() > 0 ? iHashCode + this.f10430c.hashCode() : iHashCode;
    }

    Set<Map.Entry<K, V>> i() {
        if (this.f10434g == null) {
            this.f10434g = new c(this, null);
        }
        return this.f10434g;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f10429b.get(i10);
    }

    public int l() {
        return this.f10429b.size();
    }

    public int m() {
        return this.f10430c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f10430c.isEmpty() ? d.b() : this.f10430c.entrySet();
    }

    public boolean p() {
        return this.f10431d;
    }

    public void q() {
        if (this.f10431d) {
            return;
        }
        this.f10430c = this.f10430c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10430c);
        this.f10433f = this.f10433f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10433f);
        this.f10431d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return t(iF);
        }
        if (this.f10430c.isEmpty()) {
            return null;
        }
        return this.f10430c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f10429b.get(iF).setValue(v10);
        }
        j();
        int i10 = -(iF + 1);
        if (i10 >= this.f10428a) {
            return o().put(k10, v10);
        }
        int size = this.f10429b.size();
        int i11 = this.f10428a;
        if (size == i11) {
            f2<K, V>.e eVarRemove = this.f10429b.remove(i11 - 1);
            o().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f10429b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f10429b.size() + this.f10430c.size();
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f10436b;

        private b() {
            this.f10435a = f2.this.f10429b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f10436b == null) {
                this.f10436b = f2.this.f10433f.entrySet().iterator();
            }
            return this.f10436b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = f2.this.f10429b;
            int i10 = this.f10435a - 1;
            this.f10435a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f10435a;
            return (i10 > 0 && i10 <= f2.this.f10429b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(f2 f2Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f10446c;

        private f() {
            this.f10444a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f10446c == null) {
                this.f10446c = f2.this.f10430c.entrySet().iterator();
            }
            return this.f10446c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f10445b = true;
            int i10 = this.f10444a + 1;
            this.f10444a = i10;
            return i10 < f2.this.f10429b.size() ? (Map.Entry) f2.this.f10429b.get(this.f10444a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10444a + 1 >= f2.this.f10429b.size()) {
                return !f2.this.f10430c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10445b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f10445b = false;
            f2.this.g();
            if (this.f10444a >= f2.this.f10429b.size()) {
                a().remove();
                return;
            }
            f2 f2Var = f2.this;
            int i10 = this.f10444a;
            this.f10444a = i10 - 1;
            f2Var.t(i10);
        }

        /* synthetic */ f(f2 f2Var, a aVar) {
            this();
        }
    }

    private f2(int i10) {
        this.f10428a = i10;
        this.f10429b = Collections.emptyList();
        this.f10430c = Collections.emptyMap();
        this.f10433f = Collections.emptyMap();
    }
}
