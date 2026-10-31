package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: MapFieldLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class j0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j0<?, ?> f2208b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2209a;

    static {
        j0<?, ?> j0Var = new j0<>();
        f2208b = j0Var;
        j0Var.v();
    }

    private j0() {
        this.f2209a = true;
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
            return y.d((byte[]) obj);
        }
        if (obj instanceof y.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void k(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            y.a(obj);
            y.a(map.get(obj));
        }
    }

    public static <K, V> j0<K, V> n() {
        return (j0<K, V>) f2208b;
    }

    private void o() {
        if (!t()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean p(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean s(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !p(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        o();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && s(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        o();
        y.a(k10);
        y.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o();
        k(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        o();
        return (V) super.remove(obj);
    }

    public boolean t() {
        return this.f2209a;
    }

    public void v() {
        this.f2209a = false;
    }

    public void w(j0<K, V> j0Var) {
        o();
        if (j0Var.isEmpty()) {
            return;
        }
        putAll(j0Var);
    }

    public j0<K, V> x() {
        return isEmpty() ? new j0<>() : new j0<>(this);
    }

    private j0(Map<K, V> map) {
        super(map);
        this.f2209a = true;
    }
}
