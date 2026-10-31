package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: ForwardingConcurrentMap.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o<K, V> extends p<K, V> implements ConcurrentMap<K, V> {
    protected o() {
    }

    protected abstract ConcurrentMap<K, V> n();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        return n().putIfAbsent(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return n().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        return n().replace(k10, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        return n().replace(k10, v10, v11);
    }
}
