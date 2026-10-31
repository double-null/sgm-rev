package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ForwardingMap.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p<K, V> extends q implements Map<K, V> {
    protected p() {
    }

    protected abstract Map<K, V> c();

    @Override // java.util.Map
    public void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    protected boolean e(Object obj) {
        return f0.b(this, obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    protected boolean g(Object obj) {
        return f0.c(this, obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return c().isEmpty();
    }

    protected int k() {
        return w0.d(entrySet());
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return c().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return c().values();
    }
}
