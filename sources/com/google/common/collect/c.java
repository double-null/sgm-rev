package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AbstractListMultimap.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class c<K, V> extends d<K, V> implements a0<K, V> {
    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.d
    <E> Collection<E> Y(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.d
    Collection<V> a0(K k10, Collection<V> collection) {
        return d0(k10, (List) collection, null);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.g0
    public Map<K, Collection<V>> c() {
        return super.c();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k10) {
        return (List) super.get(k10);
    }

    @Override // com.google.common.collect.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g0
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }
}
