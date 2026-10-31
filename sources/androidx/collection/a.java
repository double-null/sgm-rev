package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g<K, V> f1599h;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArrayMap.java */
    class C0024a extends g<K, V> {
        C0024a() {
        }

        @Override // androidx.collection.g
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.g
        protected Object b(int i10, int i11) {
            return a.this.f1644b[(i10 << 1) + i11];
        }

        @Override // androidx.collection.g
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.g
        protected int d() {
            return a.this.f1645c;
        }

        @Override // androidx.collection.g
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // androidx.collection.g
        protected int f(Object obj) {
            return a.this.i(obj);
        }

        @Override // androidx.collection.g
        protected void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // androidx.collection.g
        protected void h(int i10) {
            a.this.l(i10);
        }

        @Override // androidx.collection.g
        protected V i(int i10, V v10) {
            return a.this.m(i10, v10);
        }
    }

    public a() {
    }

    private g<K, V> o() {
        if (this.f1599h == null) {
            this.f1599h = new C0024a();
        }
        return this.f1599h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public boolean p(Collection<?> collection) {
        return g.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f1645c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }

    public a(int i10) {
        super(i10);
    }
}
