package com.explorestack.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapFieldLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class z0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z0 f10903b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10904a;

    static {
        z0 z0Var = new z0();
        f10903b = z0Var;
        z0Var.x();
    }

    private z0() {
        this.f10904a = true;
    }

    static <K, V> int b(Map<K, V> map) {
        int iG = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    private static int g(Object obj) {
        if (obj instanceof byte[]) {
            return l0.e((byte[]) obj);
        }
        if (obj instanceof l0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void k(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            l0.a(obj);
            l0.a(map.get(obj));
        }
    }

    private static Object n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> o(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), n(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> z0<K, V> p() {
        return f10903b;
    }

    private void s() {
        if (!w()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean t(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean v(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !t(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public z0<K, V> B() {
        return isEmpty() ? new z0<>() : new z0<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        s();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && v(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        s();
        l0.a(k10);
        l0.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        s();
        k(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        s();
        return (V) super.remove(obj);
    }

    public boolean w() {
        return this.f10904a;
    }

    public void x() {
        this.f10904a = false;
    }

    public void z(z0<K, V> z0Var) {
        s();
        if (z0Var.isEmpty()) {
            return;
        }
        putAll(z0Var);
    }

    private z0(Map<K, V> map) {
        super(map);
        this.f10904a = true;
    }
}
