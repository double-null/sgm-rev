package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class d<K, V> extends com.google.common.collect.f<K, V> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f11515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f11516f;

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class b extends d<K, V>.AbstractC0142d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.AbstractC0142d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return f0.d(k10, v10);
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class c extends f0.f<K, Collection<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f11519c;

        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class a extends f0.c<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.f0.c
            Map<K, Collection<V>> a() {
                return c.this;
            }

            @Override // com.google.common.collect.f0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.i.c(c.this.f11519c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.N(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f11522a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Collection<V> f11523b;

            b() {
                this.f11522a = c.this.f11519c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f11522a.next();
                this.f11523b = next.getValue();
                return c.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11522a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.p.s(this.f11523b != null, "no calls to next() since the last call to remove()");
                this.f11522a.remove();
                d.B(d.this, this.f11523b.size());
                this.f11523b.clear();
                this.f11523b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f11519c = map;
        }

        @Override // com.google.common.collect.f0.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) f0.i(this.f11519c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a0(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f11519c == d.this.f11515e) {
                d.this.clear();
            } else {
                z.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return f0.h(this.f11519c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f11519c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionF = d.this.F();
            collectionF.addAll(collectionRemove);
            d.B(d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionF;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return f0.d(key, d.this.a0(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f11519c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f11519c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> g() {
            return d.this.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11519c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f11519c.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private abstract class AbstractC0142d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f11525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        K f11526b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection<V> f11527c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator<V> f11528d = z.f();

        AbstractC0142d() {
            this.f11525a = d.this.f11515e.entrySet().iterator();
        }

        abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11525a.hasNext() || this.f11528d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f11528d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f11525a.next();
                this.f11526b = next.getKey();
                Collection<V> value = next.getValue();
                this.f11527c = value;
                this.f11528d = value.iterator();
            }
            return a(l0.a(this.f11526b), this.f11528d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11528d.remove();
            Collection<V> collection = this.f11527c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f11525a.remove();
            }
            d.x(d.this);
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class e extends f0.d<K, Collection<V>> {

        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class a implements Iterator<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f11531a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f11532b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f11533c;

            a(e eVar, Iterator it) {
                this.f11532b = it;
                this.f11533c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11532b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f11532b.next();
                this.f11531a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.p.s(this.f11531a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f11531a.getValue();
                this.f11532b.remove();
                d.B(d.this, value.size());
                value.clear();
                this.f11531a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = a().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.B(d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private final class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = i().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return e(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return e(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = i().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return e(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = i().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return e(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return i().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> f() {
            return new g(i());
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionF = d.this.F();
            collectionF.addAll(next.getValue());
            it.remove();
            return f0.d(next.getKey(), d.this.Y(collectionF));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return e(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = i().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return e(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return i().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return g();
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(i().headMap(k10, z10));
        }

        @Override // com.google.common.collect.d.i, com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(i().tailMap(k10, z10));
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private final class g extends d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return c().ceilingKey(k10);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(c().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) super.c();
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return c().floorKey(k10);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return c().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return c().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) z.n(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) z.n(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(c().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(c().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(c().tailMap(k10, z10));
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class h extends d<K, V>.l implements RandomAccess {
        h(K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        SortedSet<K> f11537e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        SortedSet<K> f() {
            return new j(i());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i().firstKey();
        }

        @Override // com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> g() {
            SortedSet<K> sortedSet = this.f11537e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetF = f();
            this.f11537e = sortedSetF;
            return sortedSetF;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f11519c;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(i().tailMap(k10));
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    private class j extends d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> c() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return c().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(c().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return c().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(c().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(c().tailMap(k10));
        }
    }

    protected d(Map<K, Collection<V>> map) {
        com.google.common.base.p.d(map.isEmpty());
        this.f11515e = map;
    }

    static /* synthetic */ int B(d dVar, int i10) {
        int i11 = dVar.f11516f - i10;
        dVar.f11516f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> K(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Object obj) {
        Collection collection = (Collection) f0.j(this.f11515e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f11516f -= size;
        }
    }

    static /* synthetic */ int w(d dVar) {
        int i10 = dVar.f11516f;
        dVar.f11516f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int x(d dVar) {
        int i10 = dVar.f11516f;
        dVar.f11516f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int z(d dVar, int i10) {
        int i11 = dVar.f11516f + i10;
        dVar.f11516f = i11;
        return i11;
    }

    Map<K, Collection<V>> D() {
        return this.f11515e;
    }

    abstract Collection<V> F();

    Collection<V> G(K k10) {
        return F();
    }

    final Map<K, Collection<V>> H() {
        Map<K, Collection<V>> map = this.f11515e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f11515e);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f11515e) : new c(this.f11515e);
    }

    final Set<K> I() {
        Map<K, Collection<V>> map = this.f11515e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f11515e);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f11515e) : new e(this.f11515e);
    }

    final void U(Map<K, Collection<V>> map) {
        this.f11515e = map;
        this.f11516f = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.p.d(!collection.isEmpty());
            this.f11516f += collection.size();
        }
    }

    abstract <E> Collection<E> Y(Collection<E> collection);

    abstract Collection<V> a0(K k10, Collection<V> collection);

    @Override // com.google.common.collect.f, com.google.common.collect.g0
    public Collection<Map.Entry<K, V>> b() {
        return super.b();
    }

    @Override // com.google.common.collect.g0
    public void clear() {
        Iterator<Collection<V>> it = this.f11515e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f11515e.clear();
        this.f11516f = 0;
    }

    final List<V> d0(K k10, List<V> list, d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // com.google.common.collect.g0
    public Collection<V> get(K k10) {
        Collection<V> collectionG = this.f11515e.get(k10);
        if (collectionG == null) {
            collectionG = G(k10);
        }
        return a0(k10, collectionG);
    }

    @Override // com.google.common.collect.f
    Collection<Map.Entry<K, V>> h() {
        return new com.google.common.collect.f.a();
    }

    @Override // com.google.common.collect.f
    Collection<V> n() {
        return new com.google.common.collect.f.b();
    }

    @Override // com.google.common.collect.f
    Iterator<Map.Entry<K, V>> o() {
        return new b();
    }

    @Override // com.google.common.collect.g0
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f11515e.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f11516f++;
            return true;
        }
        Collection<V> collectionG = G(k10);
        if (!collectionG.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f11516f++;
        this.f11515e.put(k10, collectionG);
        return true;
    }

    @Override // com.google.common.collect.f
    Iterator<V> s() {
        return new a();
    }

    @Override // com.google.common.collect.g0
    public int size() {
        return this.f11516f;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.g0
    public Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f11540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection<V> f11541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final d<K, V>.k f11542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection<V> f11543d;

        k(K k10, Collection<V> collection, d<K, V>.k kVar) {
            this.f11540a = k10;
            this.f11541b = collection;
            this.f11542c = kVar;
            this.f11543d = kVar == null ? null : kVar.d();
        }

        void a() {
            d<K, V>.k kVar = this.f11542c;
            if (kVar != null) {
                kVar.a();
            } else {
                d.this.f11515e.put(this.f11540a, this.f11541b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            f();
            boolean zIsEmpty = this.f11541b.isEmpty();
            boolean zAdd = this.f11541b.add(v10);
            if (zAdd) {
                d.w(d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f11541b.addAll(collection);
            if (zAddAll) {
                d.z(d.this, this.f11541b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        d<K, V>.k c() {
            return this.f11542c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f11541b.clear();
            d.B(d.this, size);
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f11541b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            f();
            return this.f11541b.containsAll(collection);
        }

        Collection<V> d() {
            return this.f11541b;
        }

        K e() {
            return this.f11540a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f11541b.equals(obj);
        }

        void f() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f11542c;
            if (kVar != null) {
                kVar.f();
                if (this.f11542c.d() != this.f11543d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f11541b.isEmpty() || (collection = (Collection) d.this.f11515e.get(this.f11540a)) == null) {
                    return;
                }
                this.f11541b = collection;
            }
        }

        void g() {
            d<K, V>.k kVar = this.f11542c;
            if (kVar != null) {
                kVar.g();
            } else if (this.f11541b.isEmpty()) {
                d.this.f11515e.remove(this.f11540a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f11541b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean zRemove = this.f11541b.remove(obj);
            if (zRemove) {
                d.x(d.this);
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f11541b.removeAll(collection);
            if (zRemoveAll) {
                d.z(d.this, this.f11541b.size() - size);
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.p.l(collection);
            int size = size();
            boolean zRetainAll = this.f11541b.retainAll(collection);
            if (zRetainAll) {
                d.z(d.this, this.f11541b.size() - size);
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f11541b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f11541b.toString();
        }

        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<V> f11545a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Collection<V> f11546b;

            a() {
                Collection<V> collection = k.this.f11541b;
                this.f11546b = collection;
                this.f11545a = d.K(collection);
            }

            Iterator<V> a() {
                b();
                return this.f11545a;
            }

            void b() {
                k.this.f();
                if (k.this.f11541b != this.f11546b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f11545a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f11545a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f11545a.remove();
                d.x(d.this);
                k.this.g();
            }

            a(Iterator<V> it) {
                this.f11546b = k.this.f11541b;
                this.f11545a = it;
            }
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class l extends d<K, V>.k implements List<V> {

        /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
        private class a extends d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v10);
                d.w(d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                c().set(v10);
            }

            public a(int i10) {
                super(l.this.h().listIterator(i10));
            }
        }

        l(K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            f();
            boolean zIsEmpty = d().isEmpty();
            h().add(i10, v10);
            d.w(d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = h().addAll(i10, collection);
            if (zAddAll) {
                d.z(d.this, d().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            f();
            return h().get(i10);
        }

        List<V> h() {
            return (List) d();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return h().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return h().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i10) {
            f();
            V vRemove = h().remove(i10);
            d.x(d.this);
            g();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            f();
            return h().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            f();
            return d.this.d0(e(), h().subList(i10, i11), c() == null ? this : c());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            f();
            return new a(i10);
        }
    }

    /* JADX INFO: compiled from: AbstractMapBasedMultimap.java */
    class a extends d<K, V>.AbstractC0142d<V> {
        a() {
            super();
        }

        @Override // com.google.common.collect.d.AbstractC0142d
        V a(K k10, V v10) {
            return v10;
        }
    }
}
