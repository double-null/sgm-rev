package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes4.dex */
public interface g0<K, V> {
    Collection<Map.Entry<K, V>> b();

    Map<K, Collection<V>> c();

    void clear();

    boolean e(Object obj, Object obj2);

    Collection<V> get(K k10);

    boolean put(K k10, V v10);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
