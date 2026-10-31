package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes.dex */
class h1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<h1<K, V>.d> f2171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<K, V> f2172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile h1<K, V>.f f2174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<K, V> f2175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile h1<K, V>.c f2176f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    class a<FieldDescriptorType> extends h1<FieldDescriptorType, Object> {
        a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.h1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.h1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i10);
                    if (((s.b) entryK.getKey()).isRepeated()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((s.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class c extends h1<K, V>.f {
        private c() {
            super(h1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(h1.this, null);
        }

        /* synthetic */ c(h1 h1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class d implements Map.Entry<K, V>, Comparable<h1<K, V>.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f2181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V f2182b;

        d(h1 h1Var, Map.Entry<K, V> entry) {
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
        public int compareTo(h1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f2181a;
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
            return b(this.f2181a, entry.getKey()) && b(this.f2182b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2182b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f2181a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f2182b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            h1.this.g();
            V v11 = this.f2182b;
            this.f2182b = v10;
            return v11;
        }

        public String toString() {
            return this.f2181a + "=" + this.f2182b;
        }

        d(K k10, V v10) {
            this.f2181a = k10;
            this.f2182b = v10;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            h1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(h1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h1.this.size();
        }

        /* synthetic */ f(h1 h1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ h1(a aVar) {
        this();
    }

    private int f(K k10) {
        int size = this.f2171a.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f2171a.get(size).getKey());
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
            int iCompareTo2 = k10.compareTo(this.f2171a.get(i11).getKey());
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
        if (this.f2173c) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.f2171a.isEmpty() || (this.f2171a instanceof ArrayList)) {
            return;
        }
        this.f2171a = new ArrayList(16);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f2172b.isEmpty() && !(this.f2172b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2172b = treeMap;
            this.f2175e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2172b;
    }

    static <FieldDescriptorType extends s.b<FieldDescriptorType>> h1<FieldDescriptorType, Object> r() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i10) {
        g();
        V value = this.f2171a.remove(i10).getValue();
        if (!this.f2172b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f2171a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f2171a.isEmpty()) {
            this.f2171a.clear();
        }
        if (this.f2172b.isEmpty()) {
            return;
        }
        this.f2172b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f2172b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2174d == null) {
            this.f2174d = new f(this, null);
        }
        return this.f2174d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        int size = size();
        if (size != h1Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != h1Var.l()) {
            return entrySet().equals(h1Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(h1Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f2172b.equals(h1Var.f2172b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f2171a.get(iF).getValue() : this.f2172b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += this.f2171a.get(i10).hashCode();
        }
        return m() > 0 ? iHashCode + this.f2172b.hashCode() : iHashCode;
    }

    Set<Map.Entry<K, V>> i() {
        if (this.f2176f == null) {
            this.f2176f = new c(this, null);
        }
        return this.f2176f;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f2171a.get(i10);
    }

    public int l() {
        return this.f2171a.size();
    }

    public int m() {
        return this.f2172b.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f2172b.isEmpty() ? Collections.emptySet() : this.f2172b.entrySet();
    }

    public boolean p() {
        return this.f2173c;
    }

    public void q() {
        if (this.f2173c) {
            return;
        }
        this.f2172b = this.f2172b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2172b);
        this.f2175e = this.f2175e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2175e);
        this.f2173c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return t(iF);
        }
        if (this.f2172b.isEmpty()) {
            return null;
        }
        return this.f2172b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f2171a.get(iF).setValue(v10);
        }
        j();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return o().put(k10, v10);
        }
        if (this.f2171a.size() == 16) {
            h1<K, V>.d dVarRemove = this.f2171a.remove(15);
            o().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f2171a.add(i10, new d(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2171a.size() + this.f2172b.size();
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f2178b;

        private b() {
            this.f2177a = h1.this.f2171a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f2178b == null) {
                this.f2178b = h1.this.f2175e.entrySet().iterator();
            }
            return this.f2178b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = h1.this.f2171a;
            int i10 = this.f2177a - 1;
            this.f2177a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f2177a;
            return (i10 > 0 && i10 <= h1.this.f2171a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(h1 h1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    private class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f2186c;

        private e() {
            this.f2184a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f2186c == null) {
                this.f2186c = h1.this.f2172b.entrySet().iterator();
            }
            return this.f2186c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f2185b = true;
            int i10 = this.f2184a + 1;
            this.f2184a = i10;
            return i10 < h1.this.f2171a.size() ? (Map.Entry) h1.this.f2171a.get(this.f2184a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2184a + 1 >= h1.this.f2171a.size()) {
                return !h1.this.f2172b.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2185b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f2185b = false;
            h1.this.g();
            if (this.f2184a >= h1.this.f2171a.size()) {
                a().remove();
                return;
            }
            h1 h1Var = h1.this;
            int i10 = this.f2184a;
            this.f2184a = i10 - 1;
            h1Var.t(i10);
        }

        /* synthetic */ e(h1 h1Var, a aVar) {
            this();
        }
    }

    private h1() {
        this.f2171a = Collections.emptyList();
        this.f2172b = Collections.emptyMap();
        this.f2175e = Collections.emptyMap();
    }
}
