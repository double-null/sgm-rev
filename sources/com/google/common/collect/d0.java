package com.google.common.collect;

import com.facebook.internal.NativeProtocol;
import com.google.common.collect.d0.i;
import com.google.common.collect.d0.m;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: MapMakerInternalMap.java */
/* JADX INFO: loaded from: classes4.dex */
class d0<K, V, E extends i<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final a0<Object, Object, e> f11550j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient int f11551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f11552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient m<K, V, E, S>[] f11553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f11554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.google.common.base.e<Object> f11555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient j<K, V, E, S> f11556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    transient Set<K> f11557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient Collection<V> f11558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f11559i;

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface a0<K, V, E extends i<K, V, E>> {
        E a();

        a0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class b<K, V> extends com.google.common.collect.o<K, V> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final o f11560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final o f11561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.e<Object> f11562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.common.base.e<Object> f11563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f11564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        transient ConcurrentMap<K, V> f11565f;

        b(o oVar, o oVar2, com.google.common.base.e<Object> eVar, com.google.common.base.e<Object> eVar2, int i10, ConcurrentMap<K, V> concurrentMap) {
            this.f11560a = oVar;
            this.f11561b = oVar2;
            this.f11562c = eVar;
            this.f11563d = eVar2;
            this.f11564e = i10;
            this.f11565f = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.p
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ConcurrentMap<K, V> c() {
            return this.f11565f;
        }

        void o(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f11565f.put((K) object, (V) objectInputStream.readObject());
            }
        }

        com.google.common.collect.c0 p(ObjectInputStream objectInputStream) throws IOException {
            return new com.google.common.collect.c0().g(objectInputStream.readInt()).j(this.f11560a).k(this.f11561b).h(this.f11562c).a(this.f11564e);
        }

        void s(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f11565f.size());
            for (Map.Entry<K, V> entry : this.f11565f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class b0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements a0<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final E f11566a;

        b0(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f11566a = e10;
        }

        @Override // com.google.common.collect.d0.a0
        public E a() {
            return this.f11566a;
        }

        @Override // com.google.common.collect.d0.a0
        public a0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new b0(referenceQueue, get(), e10);
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f11567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f11568b;

        c(K k10, int i10) {
            this.f11567a = k10;
            this.f11568b = i10;
        }

        @Override // com.google.common.collect.d0.i
        public final int b() {
            return this.f11568b;
        }

        @Override // com.google.common.collect.d0.i
        public E c() {
            return null;
        }

        @Override // com.google.common.collect.d0.i
        public final K getKey() {
            return this.f11567a;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class c0 extends com.google.common.collect.e<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f11569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        V f11570b;

        c0(K k10, V v10) {
            this.f11569a = k10;
            this.f11570b = v10;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f11569a.equals(entry.getKey()) && this.f11570b.equals(entry.getValue());
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public K getKey() {
            return this.f11569a;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public V getValue() {
            return this.f11570b;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public int hashCode() {
            return this.f11569a.hashCode() ^ this.f11570b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) d0.this.put(this.f11569a, v10);
            this.f11570b = v10;
            return v11;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f11572a;

        d(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(k10, referenceQueue);
            this.f11572a = i10;
        }

        @Override // com.google.common.collect.d0.i
        public final int b() {
            return this.f11572a;
        }

        @Override // com.google.common.collect.d0.i
        public E c() {
            return null;
        }

        @Override // com.google.common.collect.d0.i
        public final K getKey() {
            return get();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class e implements i<Object, Object, e> {
        private e() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0.i
        public int b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0.i
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.d0.i
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class f extends d0<K, V, E, S>.h<Map.Entry<K, V>> {
        f() {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class g extends AbstractSet<Map.Entry<K, V>> {
        g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = d0.this.get(key)) != null && d0.this.t().f(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && d0.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    abstract class h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11576b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        m<K, V, E, S> f11577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        AtomicReferenceArray<E> f11578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        E f11579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d0<K, V, E, S>.c0 f11580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d0<K, V, E, S>.c0 f11581g;

        h() {
            this.f11575a = d0.this.f11553c.length - 1;
            a();
        }

        final void a() {
            this.f11580f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f11575a;
                if (i10 < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = d0.this.f11553c;
                this.f11575a = i10 - 1;
                m<K, V, E, S> mVar = mVarArr[i10];
                this.f11577c = mVar;
                if (mVar.f11586b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11577c.f11589e;
                    this.f11578d = atomicReferenceArray;
                    this.f11576b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(E e10) {
            m<K, V, E, S> mVar;
            try {
                Object key = e10.getKey();
                Object objE = d0.this.e(e10);
                if (objE == null) {
                    return false;
                }
                this.f11580f = new c0(key, objE);
                return true;
            } finally {
                this.f11577c.C();
            }
        }

        d0<K, V, E, S>.c0 c() {
            d0<K, V, E, S>.c0 c0Var = this.f11580f;
            if (c0Var == null) {
                throw new NoSuchElementException();
            }
            this.f11581g = c0Var;
            a();
            return this.f11581g;
        }

        boolean d() {
            E e10 = this.f11579e;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f11579e = (E) e10.c();
                E e11 = this.f11579e;
                if (e11 == null) {
                    return false;
                }
                if (b(e11)) {
                    return true;
                }
                e10 = this.f11579e;
            }
        }

        boolean e() {
            while (true) {
                int i10 = this.f11576b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11578d;
                this.f11576b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f11579e = e10;
                if (e10 != null && (b(e10) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11580f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.h.c(this.f11581g != null);
            d0.this.remove(this.f11581g.getKey());
            this.f11581g = null;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface i<K, V, E extends i<K, V, E>> {
        int b();

        E c();

        K getKey();

        V getValue();
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface j<K, V, E extends i<K, V, E>, S extends m<K, V, E, S>> {
        S a(d0<K, V, E, S> d0Var, int i10);

        E b(S s10, E e10, E e11);

        o c();

        void d(S s10, E e10, V v10);

        E e(S s10, K k10, int i10, E e10);

        o f();
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class k extends d0<K, V, E, S>.h<K> {
        k() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class l extends AbstractSet<K> {
        l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return d0.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    private static final class n<K, V> extends b<K, V> {
        n(o oVar, o oVar2, com.google.common.base.e<Object> eVar, com.google.common.base.e<Object> eVar2, int i10, ConcurrentMap<K, V> concurrentMap) {
            super(oVar, oVar2, eVar, eVar2, i10, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f11565f = p(objectInputStream).i();
            o(objectInputStream);
        }

        private Object readResolve() {
            return this.f11565f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            s(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f11591a = new a("STRONG", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f11592b = new b("WEAK", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ o[] f11593c = b();

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        final enum a extends o {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.d0.o
            com.google.common.base.e<Object> c() {
                return com.google.common.base.e.e();
            }
        }

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        final enum b extends o {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.d0.o
            com.google.common.base.e<Object> c() {
                return com.google.common.base.e.h();
            }
        }

        private o(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ o[] b() {
            return new o[]{f11591a, f11592b};
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) f11593c.clone();
        }

        abstract com.google.common.base.e<Object> c();

        /* synthetic */ o(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static class p<K, V> extends c<K, V, p<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile V f11594c;

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements j<K, V, p<K, V>, q<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f11595a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f11595a;
            }

            @Override // com.google.common.collect.d0.j
            public o c() {
                return o.f11591a;
            }

            @Override // com.google.common.collect.d0.j
            public o f() {
                return o.f11591a;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public p<K, V> b(q<K, V> qVar, p<K, V> pVar, p<K, V> pVar2) {
                p<K, V> pVarE = e(qVar, pVar.f11567a, pVar.f11568b, pVar2);
                ((p) pVarE).f11594c = ((p) pVar).f11594c;
                return pVarE;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public p<K, V> e(q<K, V> qVar, K k10, int i10, p<K, V> pVar) {
                return pVar == null ? new p<>(k10, i10, null) : new b(k10, i10, pVar);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public q<K, V> a(d0<K, V, p<K, V>, q<K, V>> d0Var, int i10) {
                return new q<>(d0Var, i10);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void d(q<K, V> qVar, p<K, V> pVar, V v10) {
                ((p) pVar).f11594c = v10;
            }
        }

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends p<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final p<K, V> f11596d;

            b(K k10, int i10, p<K, V> pVar) {
                super(k10, i10, null);
                this.f11596d = pVar;
            }

            @Override // com.google.common.collect.d0.c, com.google.common.collect.d0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public p<K, V> c() {
                return this.f11596d;
            }
        }

        /* synthetic */ p(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.d0.i
        public final V getValue() {
            return this.f11594c;
        }

        private p(K k10, int i10) {
            super(k10, i10);
            this.f11594c = null;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static class r<K, V> extends c<K, V, r<K, V>> implements z<K, V, r<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile a0<K, V, r<K, V>> f11597c;

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements j<K, V, r<K, V>, s<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f11598a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f11598a;
            }

            @Override // com.google.common.collect.d0.j
            public o c() {
                return o.f11592b;
            }

            @Override // com.google.common.collect.d0.j
            public o f() {
                return o.f11591a;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public r<K, V> b(s<K, V> sVar, r<K, V> rVar, r<K, V> rVar2) {
                if (m.w(rVar)) {
                    return null;
                }
                r<K, V> rVarE = e(sVar, rVar.f11567a, rVar.f11568b, rVar2);
                ((r) rVarE).f11597c = ((r) rVar).f11597c.b(((s) sVar).f11600g, rVarE);
                return rVarE;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public r<K, V> e(s<K, V> sVar, K k10, int i10, r<K, V> rVar) {
                return rVar == null ? new r<>(k10, i10, null) : new b(k10, i10, rVar);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public s<K, V> a(d0<K, V, r<K, V>, s<K, V>> d0Var, int i10) {
                return new s<>(d0Var, i10);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void d(s<K, V> sVar, r<K, V> rVar, V v10) {
                a0 a0Var = ((r) rVar).f11597c;
                ((r) rVar).f11597c = new b0(((s) sVar).f11600g, v10, rVar);
                a0Var.clear();
            }
        }

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends r<K, V> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final r<K, V> f11599d;

            b(K k10, int i10, r<K, V> rVar) {
                super(k10, i10, null);
                this.f11599d = rVar;
            }

            @Override // com.google.common.collect.d0.c, com.google.common.collect.d0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public r<K, V> c() {
                return this.f11599d;
            }
        }

        /* synthetic */ r(Object obj, int i10, a aVar) {
            this(obj, i10);
        }

        @Override // com.google.common.collect.d0.z
        public final a0<K, V, r<K, V>> a() {
            return this.f11597c;
        }

        @Override // com.google.common.collect.d0.i
        public final V getValue() {
            return this.f11597c.get();
        }

        private r(K k10, int i10) {
            super(k10, i10);
            this.f11597c = d0.s();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class t extends d0<K, V, E, S>.h<V> {
        t() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    final class u extends AbstractCollection<V> {
        u() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return d0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return d0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new t();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d0.this.size();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static class v<K, V> extends d<K, V, v<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile V f11603b;

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements j<K, V, v<K, V>, w<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f11604a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f11604a;
            }

            @Override // com.google.common.collect.d0.j
            public o c() {
                return o.f11591a;
            }

            @Override // com.google.common.collect.d0.j
            public o f() {
                return o.f11592b;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public v<K, V> b(w<K, V> wVar, v<K, V> vVar, v<K, V> vVar2) {
                K key = vVar.getKey();
                if (key == null) {
                    return null;
                }
                v<K, V> vVarE = e(wVar, key, vVar.f11572a, vVar2);
                ((v) vVarE).f11603b = ((v) vVar).f11603b;
                return vVarE;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public v<K, V> e(w<K, V> wVar, K k10, int i10, v<K, V> vVar) {
                return vVar == null ? new v<>(((w) wVar).f11606g, k10, i10, null) : new b(((w) wVar).f11606g, k10, i10, vVar, null);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public w<K, V> a(d0<K, V, v<K, V>, w<K, V>> d0Var, int i10) {
                return new w<>(d0Var, i10);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void d(w<K, V> wVar, v<K, V> vVar, V v10) {
                ((v) vVar).f11603b = v10;
            }
        }

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends v<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final v<K, V> f11605c;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, v vVar, a aVar) {
                this(referenceQueue, obj, i10, vVar);
            }

            @Override // com.google.common.collect.d0.d, com.google.common.collect.d0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public v<K, V> c() {
                return this.f11605c;
            }

            private b(ReferenceQueue<K> referenceQueue, K k10, int i10, v<K, V> vVar) {
                super(referenceQueue, k10, i10, null);
                this.f11605c = vVar;
            }
        }

        /* synthetic */ v(ReferenceQueue referenceQueue, Object obj, int i10, a aVar) {
            this(referenceQueue, obj, i10);
        }

        @Override // com.google.common.collect.d0.i
        public final V getValue() {
            return this.f11603b;
        }

        private v(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f11603b = null;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static class x<K, V> extends d<K, V, x<K, V>> implements z<K, V, x<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile a0<K, V, x<K, V>> f11607b;

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements j<K, V, x<K, V>, y<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f11608a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f11608a;
            }

            @Override // com.google.common.collect.d0.j
            public o c() {
                return o.f11592b;
            }

            @Override // com.google.common.collect.d0.j
            public o f() {
                return o.f11592b;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public x<K, V> b(y<K, V> yVar, x<K, V> xVar, x<K, V> xVar2) {
                K key = xVar.getKey();
                if (key == null || m.w(xVar)) {
                    return null;
                }
                x<K, V> xVarE = e(yVar, key, xVar.f11572a, xVar2);
                ((x) xVarE).f11607b = ((x) xVar).f11607b.b(((y) yVar).f11611h, xVarE);
                return xVarE;
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public x<K, V> e(y<K, V> yVar, K k10, int i10, x<K, V> xVar) {
                return xVar == null ? new x<>(((y) yVar).f11610g, k10, i10) : new b(((y) yVar).f11610g, k10, i10, xVar);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public y<K, V> a(d0<K, V, x<K, V>, y<K, V>> d0Var, int i10) {
                return new y<>(d0Var, i10);
            }

            @Override // com.google.common.collect.d0.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void d(y<K, V> yVar, x<K, V> xVar, V v10) {
                a0 a0Var = ((x) xVar).f11607b;
                ((x) xVar).f11607b = new b0(((y) yVar).f11611h, v10, xVar);
                a0Var.clear();
            }
        }

        /* JADX INFO: compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends x<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final x<K, V> f11609c;

            b(ReferenceQueue<K> referenceQueue, K k10, int i10, x<K, V> xVar) {
                super(referenceQueue, k10, i10);
                this.f11609c = xVar;
            }

            @Override // com.google.common.collect.d0.d, com.google.common.collect.d0.i
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public x<K, V> c() {
                return this.f11609c;
            }
        }

        x(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f11607b = d0.s();
        }

        @Override // com.google.common.collect.d0.z
        public final a0<K, V, x<K, V>> a() {
            return this.f11607b;
        }

        @Override // com.google.common.collect.d0.i
        public final V getValue() {
            return this.f11607b.get();
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    interface z<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        a0<K, V, E> a();
    }

    private d0(com.google.common.collect.c0 c0Var, j<K, V, E, S> jVar) {
        this.f11554d = Math.min(c0Var.b(), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        this.f11555e = c0Var.d();
        this.f11556f = jVar;
        int iMin = Math.min(c0Var.c(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f11554d) {
            i12++;
            i13 <<= 1;
        }
        this.f11552b = 32 - i12;
        this.f11551a = i13 - 1;
        this.f11553c = g(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f11553c;
            if (i10 >= mVarArr.length) {
                return;
            }
            mVarArr[i10] = c(i11);
            i10++;
        }
    }

    static <K, V> d0<K, V, ? extends i<K, V, ?>, ?> b(com.google.common.collect.c0 c0Var) {
        o oVarE = c0Var.e();
        o oVar = o.f11591a;
        if (oVarE == oVar && c0Var.f() == oVar) {
            return new d0<>(c0Var, p.a.h());
        }
        if (c0Var.e() == oVar && c0Var.f() == o.f11592b) {
            return new d0<>(c0Var, r.a.h());
        }
        o oVarE2 = c0Var.e();
        o oVar2 = o.f11592b;
        if (oVarE2 == oVar2 && c0Var.f() == oVar) {
            return new d0<>(c0Var, v.a.h());
        }
        if (c0Var.e() == oVar2 && c0Var.f() == oVar2) {
            return new d0<>(c0Var, x.a.h());
        }
        throw new AssertionError();
    }

    static int o(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    static <K, V, E extends i<K, V, E>> a0<K, V, E> s() {
        return (a0<K, V, E>) f11550j;
    }

    m<K, V, E, S> c(int i10) {
        return this.f11556f.a(this, i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m<K, V, E, S> mVar : this.f11553c) {
            mVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iF = f(obj);
        return p(iF).e(obj, iF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        m<K, V, E, S>[] mVarArr = this.f11553c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = mVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                m<K, V, E, S> mVar = mVarArr[r10];
                int i11 = mVar.f11586b;
                AtomicReferenceArray<E> atomicReferenceArray = mVar.f11589e;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    for (E eC = atomicReferenceArray.get(r13); eC != null; eC = eC.c()) {
                        V vT = mVar.t(eC);
                        if (vT != null && t().f(obj, vT)) {
                            return true;
                        }
                    }
                }
                j11 += (long) mVar.f11587c;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    V e(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11559i;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f11559i = gVar;
        return gVar;
    }

    int f(Object obj) {
        return o(this.f11555e.g(obj));
    }

    final m<K, V, E, S>[] g(int i10) {
        return new m[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = f(obj);
        return p(iF).n(obj, iF);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.f11553c;
        long j10 = 0;
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].f11586b != 0) {
                return false;
            }
            j10 += (long) mVarArr[i10].f11587c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            if (mVarArr[i11].f11586b != 0) {
                return false;
            }
            j10 -= (long) mVarArr[i11].f11587c;
        }
        return j10 == 0;
    }

    void k(E e10) {
        int iB = e10.b();
        p(iB).G(e10, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f11557g;
        if (set != null) {
            return set;
        }
        l lVar = new l();
        this.f11557g = lVar;
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void n(a0<K, V, E> a0Var) {
        i iVarA = a0Var.a();
        int iB = iVarA.b();
        p(iB).H(iVarA.getKey(), iB, a0Var);
    }

    m<K, V, E, S> p(int i10) {
        return this.f11553c[(i10 >>> this.f11552b) & this.f11551a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        com.google.common.base.p.l(k10);
        com.google.common.base.p.l(v10);
        int iF = f(k10);
        return p(iF).F(k10, iF, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        com.google.common.base.p.l(k10);
        com.google.common.base.p.l(v10);
        int iF = f(k10);
        return p(iF).F(k10, iF, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iF = f(obj);
        return p(iF).I(obj, iF);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        com.google.common.base.p.l(k10);
        com.google.common.base.p.l(v11);
        if (v10 == null) {
            return false;
        }
        int iF = f(k10);
        return p(iF).Y(k10, iF, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (m<K, V, E, S> mVar : this.f11553c) {
            j10 += (long) mVar.f11586b;
        }
        return com.google.common.primitives.f.l(j10);
    }

    com.google.common.base.e<Object> t() {
        return this.f11556f.c().c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f11558h;
        if (collection != null) {
            return collection;
        }
        u uVar = new u();
        this.f11558h = uVar;
        return uVar;
    }

    Object writeReplace() {
        return new n(this.f11556f.f(), this.f11556f.c(), this.f11555e, this.f11556f.c().c(), this.f11554d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iF = f(obj);
        return p(iF).K(obj, iF, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        com.google.common.base.p.l(k10);
        com.google.common.base.p.l(v10);
        int iF = f(k10);
        return p(iF).U(k10, iF, v10);
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    class a implements a0<Object, Object, e> {
        a() {
        }

        @Override // com.google.common.collect.d0.a0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e a() {
            return null;
        }

        @Override // com.google.common.collect.d0.a0
        public Object get() {
            return null;
        }

        @Override // com.google.common.collect.d0.a0
        public void clear() {
        }

        @Override // com.google.common.collect.d0.a0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a0<Object, Object, e> b(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static abstract class m<K, V, E extends i<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d0<K, V, E, S> f11585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile int f11586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile AtomicReferenceArray<E> f11589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicInteger f11590f = new AtomicInteger();

        m(d0<K, V, E, S> d0Var, int i10) {
            this.f11585a = d0Var;
            v(B(i10));
        }

        static <K, V, E extends i<K, V, E>> boolean w(E e10) {
            return e10.getValue() == null;
        }

        AtomicReferenceArray<E> B(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void C() {
            if ((this.f11590f.incrementAndGet() & 63) == 0) {
                a0();
            }
        }

        void D() {
            d0();
        }

        V F(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                D();
                int i11 = this.f11586b + 1;
                if (i11 > this.f11588d) {
                    k();
                    i11 = this.f11586b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i iVarC = e10; iVarC != null; iVarC = iVarC.c()) {
                    Object key = iVarC.getKey();
                    if (iVarC.b() == i10 && key != null && this.f11585a.f11555e.f(k10, key)) {
                        V v11 = (V) iVarC.getValue();
                        if (v11 == null) {
                            this.f11587c++;
                            h0(iVarC, v10);
                            this.f11586b = this.f11586b;
                            return null;
                        }
                        if (z10) {
                            return v11;
                        }
                        this.f11587c++;
                        h0(iVarC, v10);
                        return v11;
                    }
                }
                this.f11587c++;
                i iVarE = this.f11585a.f11556f.e(e0(), k10, i10, e10);
                h0(iVarE, v10);
                atomicReferenceArray.set(length, (E) iVarE);
                this.f11586b = i11;
                return null;
            } finally {
                unlock();
            }
        }

        boolean G(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = atomicReferenceArray.get(length);
                for (i iVarC = e11; iVarC != null; iVarC = iVarC.c()) {
                    if (iVarC == e10) {
                        this.f11587c++;
                        i iVarN = N(e11, iVarC);
                        int i11 = this.f11586b - 1;
                        atomicReferenceArray.set(length, (E) iVarN);
                        this.f11586b = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean H(K k10, int i10, a0<K, V, E> a0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i iVarC = e10; iVarC != null; iVarC = iVarC.c()) {
                    Object key = iVarC.getKey();
                    if (iVarC.b() == i10 && key != null && this.f11585a.f11555e.f(k10, key)) {
                        if (((z) iVarC).a() != a0Var) {
                            return false;
                        }
                        this.f11587c++;
                        i iVarN = N(e10, iVarC);
                        int i11 = this.f11586b - 1;
                        atomicReferenceArray.set(length, (E) iVarN);
                        this.f11586b = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        V I(Object obj, int i10) {
            lock();
            try {
                D();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i iVarC = e10; iVarC != null; iVarC = iVarC.c()) {
                    Object key = iVarC.getKey();
                    if (iVarC.b() == i10 && key != null && this.f11585a.f11555e.f(obj, key)) {
                        V v10 = (V) iVarC.getValue();
                        if (v10 == null && !w(iVarC)) {
                            return null;
                        }
                        this.f11587c++;
                        i iVarN = N(e10, iVarC);
                        int i11 = this.f11586b - 1;
                        atomicReferenceArray.set(length, (E) iVarN);
                        this.f11586b = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean K(Object obj, int i10, Object obj2) {
            lock();
            try {
                D();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                i iVarC = e10;
                while (true) {
                    boolean z10 = false;
                    if (iVarC == null) {
                        return false;
                    }
                    Object key = iVarC.getKey();
                    if (iVarC.b() == i10 && key != null && this.f11585a.f11555e.f(obj, key)) {
                        if (this.f11585a.t().f(obj2, iVarC.getValue())) {
                            z10 = true;
                        } else if (!w(iVarC)) {
                            return false;
                        }
                        this.f11587c++;
                        i iVarN = N(e10, iVarC);
                        int i11 = this.f11586b - 1;
                        atomicReferenceArray.set(length, (E) iVarN);
                        this.f11586b = i11;
                        return z10;
                    }
                    iVarC = iVarC.c();
                }
            } finally {
                unlock();
            }
        }

        E N(E e10, E e11) {
            int i10 = this.f11586b;
            E e12 = (E) e11.c();
            while (e10 != e11) {
                i iVarF = f(e10, e12);
                if (iVarF != null) {
                    e12 = (E) iVarF;
                } else {
                    i10--;
                }
                e10 = (E) e10.c();
            }
            this.f11586b = i10;
            return e12;
        }

        V U(K k10, int i10, V v10) {
            lock();
            try {
                D();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i iVarC = e10; iVarC != null; iVarC = iVarC.c()) {
                    Object key = iVarC.getKey();
                    if (iVarC.b() == i10 && key != null && this.f11585a.f11555e.f(k10, key)) {
                        V v11 = (V) iVarC.getValue();
                        if (v11 != null) {
                            this.f11587c++;
                            h0(iVarC, v10);
                            return v11;
                        }
                        if (w(iVarC)) {
                            this.f11587c++;
                            i iVarN = N(e10, iVarC);
                            int i11 = this.f11586b - 1;
                            atomicReferenceArray.set(length, (E) iVarN);
                            this.f11586b = i11;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean Y(K k10, int i10, V v10, V v11) {
            lock();
            try {
                D();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i iVarC = e10; iVarC != null; iVarC = iVarC.c()) {
                    Object key = iVarC.getKey();
                    if (iVarC.b() == i10 && key != null && this.f11585a.f11555e.f(k10, key)) {
                        Object value = iVarC.getValue();
                        if (value != null) {
                            if (!this.f11585a.t().f(v10, value)) {
                                return false;
                            }
                            this.f11587c++;
                            h0(iVarC, v11);
                            return true;
                        }
                        if (w(iVarC)) {
                            this.f11587c++;
                            i iVarN = N(e10, iVarC);
                            int i11 = this.f11586b - 1;
                            atomicReferenceArray.set(length, (E) iVarN);
                            this.f11586b = i11;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void a0() {
            d0();
        }

        void b() {
            if (this.f11586b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    x();
                    this.f11590f.set(0);
                    this.f11587c++;
                    this.f11586b = 0;
                } finally {
                    unlock();
                }
            }
        }

        <T> void c(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        void d0() {
            if (tryLock()) {
                try {
                    z();
                    this.f11590f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        boolean e(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f11586b == 0) {
                    return false;
                }
                i iVarS = s(obj, i10);
                if (iVarS != null && iVarS.getValue() != null) {
                    z10 = true;
                }
                return z10;
            } finally {
                C();
            }
        }

        abstract S e0();

        E f(E e10, E e11) {
            return (E) this.f11585a.f11556f.b(e0(), e10, e11);
        }

        void g(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f11585a.k((i) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void h(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f11585a.n((a0) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void h0(E e10, V v10) {
            this.f11585a.f11556f.d(e0(), e10, v10);
        }

        void i0() {
            if (tryLock()) {
                try {
                    z();
                } finally {
                    unlock();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void k() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f11586b;
            AtomicReferenceArray<E> atomicReferenceArrayB = B(length << 1);
            this.f11588d = (atomicReferenceArrayB.length() * 3) / 4;
            int length2 = atomicReferenceArrayB.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E eC = atomicReferenceArray.get(i11);
                if (eC != null) {
                    i iVarC = eC.c();
                    int iB = eC.b() & length2;
                    if (iVarC == null) {
                        atomicReferenceArrayB.set(iB, eC);
                    } else {
                        i iVar = eC;
                        while (iVarC != null) {
                            int iB2 = iVarC.b() & length2;
                            if (iB2 != iB) {
                                iVar = iVarC;
                                iB = iB2;
                            }
                            iVarC = iVarC.c();
                        }
                        atomicReferenceArrayB.set(iB, iVar);
                        while (eC != iVar) {
                            int iB3 = eC.b() & length2;
                            i iVarF = f(eC, (i) atomicReferenceArrayB.get(iB3));
                            if (iVarF != null) {
                                atomicReferenceArrayB.set(iB3, iVarF);
                            } else {
                                i10--;
                            }
                            eC = eC.c();
                        }
                    }
                }
            }
            this.f11589e = atomicReferenceArrayB;
            this.f11586b = i10;
        }

        V n(Object obj, int i10) {
            try {
                i iVarS = s(obj, i10);
                if (iVarS == null) {
                    return null;
                }
                V v10 = (V) iVarS.getValue();
                if (v10 == null) {
                    i0();
                }
                return v10;
            } finally {
                C();
            }
        }

        E o(Object obj, int i10) {
            if (this.f11586b == 0) {
                return null;
            }
            for (E e10 = (E) p(i10); e10 != null; e10 = (E) e10.c()) {
                if (e10.b() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        i0();
                    } else if (this.f11585a.f11555e.f(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        E p(int i10) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f11589e;
            return atomicReferenceArray.get(i10 & (atomicReferenceArray.length() - 1));
        }

        E s(Object obj, int i10) {
            return (E) o(obj, i10);
        }

        V t(E e10) {
            if (e10.getKey() == null) {
                i0();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 != null) {
                return v10;
            }
            i0();
            return null;
        }

        void v(AtomicReferenceArray<E> atomicReferenceArray) {
            this.f11588d = (atomicReferenceArray.length() * 3) / 4;
            this.f11589e = atomicReferenceArray;
        }

        void x() {
        }

        void z() {
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class q<K, V> extends m<K, V, p<K, V>, q<K, V>> {
        q(d0<K, V, p<K, V>, q<K, V>> d0Var, int i10) {
            super(d0Var, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d0.m
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public q<K, V> e0() {
            return this;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class s<K, V> extends m<K, V, r<K, V>, s<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<V> f11600g;

        s(d0<K, V, r<K, V>, s<K, V>> d0Var, int i10) {
            super(d0Var, i10);
            this.f11600g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.d0.m
        void x() {
            c(this.f11600g);
        }

        @Override // com.google.common.collect.d0.m
        void z() {
            h(this.f11600g);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d0.m
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public s<K, V> e0() {
            return this;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class w<K, V> extends m<K, V, v<K, V>, w<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f11606g;

        w(d0<K, V, v<K, V>, w<K, V>> d0Var, int i10) {
            super(d0Var, i10);
            this.f11606g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.d0.m
        void x() {
            c(this.f11606g);
        }

        @Override // com.google.common.collect.d0.m
        void z() {
            g(this.f11606g);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d0.m
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public w<K, V> e0() {
            return this;
        }
    }

    /* JADX INFO: compiled from: MapMakerInternalMap.java */
    static final class y<K, V> extends m<K, V, x<K, V>, y<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ReferenceQueue<K> f11610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReferenceQueue<V> f11611h;

        y(d0<K, V, x<K, V>, y<K, V>> d0Var, int i10) {
            super(d0Var, i10);
            this.f11610g = new ReferenceQueue<>();
            this.f11611h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.d0.m
        void x() {
            c(this.f11610g);
        }

        @Override // com.google.common.collect.d0.m
        void z() {
            g(this.f11610g);
            h(this.f11611h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d0.m
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public y<K, V> e0() {
            return this;
        }
    }
}
