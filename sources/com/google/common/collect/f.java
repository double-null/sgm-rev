package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class f<K, V> implements g0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f11612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set<K> f11613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection<V> f11614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f11615d;

    /* JADX INFO: compiled from: AbstractMultimap.java */
    class a extends i0.b<K, V> {
        a() {
        }

        @Override // com.google.common.collect.i0.b
        g0<K, V> a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.o();
        }
    }

    /* JADX INFO: compiled from: AbstractMultimap.java */
    class b extends AbstractCollection<V> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.f(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.s();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    f() {
    }

    @Override // com.google.common.collect.g0
    public Collection<Map.Entry<K, V>> b() {
        Collection<Map.Entry<K, V>> collection = this.f11612a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionH = h();
        this.f11612a = collectionH;
        return collectionH;
    }

    @Override // com.google.common.collect.g0
    public Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.f11615d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapG = g();
        this.f11615d = mapG;
        return mapG;
    }

    @Override // com.google.common.collect.g0
    public boolean e(Object obj, Object obj2) {
        Collection<V> collection = c().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean equals(Object obj) {
        return i0.a(this, obj);
    }

    public boolean f(Object obj) {
        Iterator<Collection<V>> it = c().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> g();

    abstract Collection<Map.Entry<K, V>> h();

    public int hashCode() {
        return c().hashCode();
    }

    abstract Set<K> k();

    abstract Collection<V> n();

    abstract Iterator<Map.Entry<K, V>> o();

    public Set<K> p() {
        Set<K> set = this.f11613b;
        if (set != null) {
            return set;
        }
        Set<K> setK = k();
        this.f11613b = setK;
        return setK;
    }

    @Override // com.google.common.collect.g0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = c().get(obj);
        return collection != null && collection.remove(obj2);
    }

    abstract Iterator<V> s();

    public String toString() {
        return c().toString();
    }

    @Override // com.google.common.collect.g0
    public Collection<V> values() {
        Collection<V> collection = this.f11614c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionN = n();
        this.f11614c = collectionN;
        return collectionN;
    }
}
