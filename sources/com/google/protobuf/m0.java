package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapFieldLite.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m0<K, V> extends LinkedHashMap<K, V> {
    private static final m0<?, ?> EMPTY_MAP_FIELD;
    private boolean isMutable;

    static {
        m0<?, ?> m0Var = new m0<>();
        EMPTY_MAP_FIELD = m0Var;
        m0Var.makeImmutable();
    }

    private m0() {
        this.isMutable = true;
    }

    static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int iCalculateHashCodeForObject = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return iCalculateHashCodeForObject;
    }

    private static int calculateHashCodeForObject(Object obj) {
        if (obj instanceof byte[]) {
            return a0.hashCode((byte[]) obj);
        }
        if (obj instanceof a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            a0.checkNotNull(obj);
            a0.checkNotNull(map.get(obj));
        }
    }

    private static Object copy(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> m0<K, V> emptyMapField() {
        return (m0<K, V>) EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean equals(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(m0<K, V> m0Var) {
        ensureMutable();
        if (m0Var.isEmpty()) {
            return;
        }
        putAll(m0Var);
    }

    public m0<K, V> mutableCopy() {
        return isEmpty() ? new m0<>() : new m0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        ensureMutable();
        a0.checkNotNull(k10);
        a0.checkNotNull(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureMutable();
        checkForNullKeysAndValues(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private m0(Map<K, V> map) {
        super(map);
        this.isMutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && equals((Map) this, (Map) obj);
    }
}
