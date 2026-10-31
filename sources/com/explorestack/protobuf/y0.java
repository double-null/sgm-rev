package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapField.java */
/* JADX INFO: loaded from: classes.dex */
public class y0<K, V> implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f10879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile d f10880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c<K, V> f10881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<Message> f10882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<K, V> f10883e;

    /* JADX INFO: compiled from: MapField.java */
    private interface a<K, V> {
        void a(Message message, Map<K, V> map);

        Message b(K k10, V v10);

        Message c();
    }

    /* JADX INFO: compiled from: MapField.java */
    private static class b<K, V> implements a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w0<K, V> f10884a;

        public b(w0<K, V> w0Var) {
            this.f10884a = w0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.y0.a
        public void a(Message message, Map<K, V> map) {
            w0 w0Var = (w0) message;
            map.put(w0Var.h(), w0Var.n());
        }

        @Override // com.explorestack.protobuf.y0.a
        public Message b(K k10, V v10) {
            return this.f10884a.newBuilderForType().p(k10).s(v10).buildPartial();
        }

        @Override // com.explorestack.protobuf.y0.a
        public Message c() {
            return this.f10884a;
        }
    }

    /* JADX INFO: compiled from: MapField.java */
    private static class c<K, V> implements Map<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1 f10885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<K, V> f10886b;

        /* JADX INFO: compiled from: MapField.java */
        private static class a<E> implements Collection<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final k1 f10887a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Collection<E> f10888b;

            a(k1 k1Var, Collection<E> collection) {
                this.f10887a = k1Var;
                this.f10888b = collection;
            }

            @Override // java.util.Collection
            public boolean add(E e10) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                this.f10887a.a();
                this.f10888b.clear();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f10888b.contains(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f10888b.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.f10888b.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.f10888b.hashCode();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f10888b.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<E> iterator() {
                return new b(this.f10887a, this.f10888b.iterator());
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.f10887a.a();
                return this.f10888b.remove(obj);
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f10887a.a();
                return this.f10888b.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f10887a.a();
                return this.f10888b.retainAll(collection);
            }

            @Override // java.util.Collection
            public int size() {
                return this.f10888b.size();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.f10888b.toArray();
            }

            public String toString() {
                return this.f10888b.toString();
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f10888b.toArray(tArr);
            }
        }

        /* JADX INFO: compiled from: MapField.java */
        private static class b<E> implements Iterator<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final k1 f10889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator<E> f10890b;

            b(k1 k1Var, Iterator<E> it) {
                this.f10889a = k1Var;
                this.f10890b = it;
            }

            public boolean equals(Object obj) {
                return this.f10890b.equals(obj);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10890b.hasNext();
            }

            public int hashCode() {
                return this.f10890b.hashCode();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.f10890b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f10889a.a();
                this.f10890b.remove();
            }

            public String toString() {
                return this.f10890b.toString();
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.y0$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MapField.java */
        private static class C0132c<E> implements Set<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final k1 f10891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Set<E> f10892b;

            C0132c(k1 k1Var, Set<E> set) {
                this.f10891a = k1Var;
                this.f10892b = set;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(E e10) {
                this.f10891a.a();
                return this.f10892b.add(e10);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                this.f10891a.a();
                return this.f10892b.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f10891a.a();
                this.f10892b.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f10892b.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f10892b.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.f10892b.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.f10892b.hashCode();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f10892b.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<E> iterator() {
                return new b(this.f10891a, this.f10892b.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.f10891a.a();
                return this.f10892b.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f10891a.a();
                return this.f10892b.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f10891a.a();
                return this.f10892b.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.f10892b.size();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.f10892b.toArray();
            }

            public String toString() {
                return this.f10892b.toString();
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f10892b.toArray(tArr);
            }
        }

        c(k1 k1Var, Map<K, V> map) {
            this.f10885a = k1Var;
            this.f10886b = map;
        }

        @Override // java.util.Map
        public void clear() {
            this.f10885a.a();
            this.f10886b.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f10886b.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f10886b.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new C0132c(this.f10885a, this.f10886b.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.f10886b.equals(obj);
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.f10886b.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f10886b.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f10886b.isEmpty();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return new C0132c(this.f10885a, this.f10886b.keySet());
        }

        @Override // java.util.Map
        public V put(K k10, V v10) {
            this.f10885a.a();
            l0.a(k10);
            l0.a(v10);
            return this.f10886b.put(k10, v10);
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f10885a.a();
            for (K k10 : map.keySet()) {
                l0.a(k10);
                l0.a(map.get(k10));
            }
            this.f10886b.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            this.f10885a.a();
            return this.f10886b.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f10886b.size();
        }

        public String toString() {
            return this.f10886b.toString();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return new a(this.f10885a, this.f10886b.values());
        }
    }

    /* JADX INFO: compiled from: MapField.java */
    private enum d {
        MAP,
        LIST,
        BOTH
    }

    private y0(a<K, V> aVar, d dVar, Map<K, V> map) {
        this.f10883e = aVar;
        this.f10879a = true;
        this.f10880b = dVar;
        this.f10881c = new c<>(this, map);
        this.f10882d = null;
    }

    private Message c(K k10, V v10) {
        return this.f10883e.b(k10, v10);
    }

    private c<K, V> d(List<Message> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Message> it = list.iterator();
        while (it.hasNext()) {
            f(it.next(), linkedHashMap);
        }
        return new c<>(this, linkedHashMap);
    }

    private List<Message> e(c<K, V> cVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, V> entry : cVar.entrySet()) {
            arrayList.add(c(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private void f(Message message, Map<K, V> map) {
        this.f10883e.a(message, map);
    }

    public static <K, V> y0<K, V> h(w0<K, V> w0Var) {
        return new y0<>(w0Var, d.MAP, Collections.emptyMap());
    }

    public static <K, V> y0<K, V> q(w0<K, V> w0Var) {
        return new y0<>(w0Var, d.MAP, new LinkedHashMap());
    }

    @Override // com.explorestack.protobuf.k1
    public void a() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    public void b() {
        this.f10881c = new c<>(this, new LinkedHashMap());
        this.f10880b = d.MAP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y0) {
            return z0.v(j(), ((y0) obj).j());
        }
        return false;
    }

    public y0<K, V> g() {
        return new y0<>(this.f10883e, d.MAP, z0.o(j()));
    }

    public int hashCode() {
        return z0.b(j());
    }

    List<Message> i() {
        d dVar = this.f10880b;
        d dVar2 = d.MAP;
        if (dVar == dVar2) {
            synchronized (this) {
                if (this.f10880b == dVar2) {
                    this.f10882d = e(this.f10881c);
                    this.f10880b = d.BOTH;
                }
            }
        }
        return Collections.unmodifiableList(this.f10882d);
    }

    public Map<K, V> j() {
        d dVar = this.f10880b;
        d dVar2 = d.LIST;
        if (dVar == dVar2) {
            synchronized (this) {
                if (this.f10880b == dVar2) {
                    this.f10881c = d(this.f10882d);
                    this.f10880b = d.BOTH;
                }
            }
        }
        return Collections.unmodifiableMap(this.f10881c);
    }

    Message k() {
        return this.f10883e.c();
    }

    List<Message> l() {
        d dVar = this.f10880b;
        d dVar2 = d.LIST;
        if (dVar != dVar2) {
            if (this.f10880b == d.MAP) {
                this.f10882d = e(this.f10881c);
            }
            this.f10881c = null;
            this.f10880b = dVar2;
        }
        return this.f10882d;
    }

    public Map<K, V> m() {
        d dVar = this.f10880b;
        d dVar2 = d.MAP;
        if (dVar != dVar2) {
            if (this.f10880b == d.LIST) {
                this.f10881c = d(this.f10882d);
            }
            this.f10882d = null;
            this.f10880b = dVar2;
        }
        return this.f10881c;
    }

    public boolean n() {
        return this.f10879a;
    }

    public void o() {
        this.f10879a = false;
    }

    public void p(y0<K, V> y0Var) {
        m().putAll(z0.o(y0Var.j()));
    }

    private y0(w0<K, V> w0Var, d dVar, Map<K, V> map) {
        this(new b(w0Var), dVar, map);
    }
}
