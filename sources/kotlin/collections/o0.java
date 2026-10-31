package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes5.dex */
public class o0 extends n0 {
    public static <K, V> Map<K, V> h() {
        e0 e0Var = e0.f21456a;
        kotlin.jvm.internal.t.d(e0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return e0Var;
    }

    public static <K, V> V i(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.t.f(map, "<this>");
        return (V) m0.a(map, k10);
    }

    public static <K, V> HashMap<K, V> j(wc.q<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.t.f(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(n0.e(pairs.length));
        p(map, pairs);
        return map;
    }

    public static <K, V> Map<K, V> k(wc.q<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.t.f(pairs, "pairs");
        return pairs.length > 0 ? t(pairs, new LinkedHashMap(n0.e(pairs.length))) : h();
    }

    public static <K, V> Map<K, V> l(wc.q<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.t.f(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(n0.e(pairs.length));
        p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> m(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : n0.g(map);
        }
        return h();
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.t.f(map, "<this>");
        kotlin.jvm.internal.t.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, Iterable<? extends wc.q<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.t.f(map, "<this>");
        kotlin.jvm.internal.t.f(pairs, "pairs");
        for (wc.q<? extends K, ? extends V> qVar : pairs) {
            map.put(qVar.b(), qVar.c());
        }
    }

    public static final <K, V> void p(Map<? super K, ? super V> map, wc.q<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.t.f(map, "<this>");
        kotlin.jvm.internal.t.f(pairs, "pairs");
        for (wc.q<? extends K, ? extends V> qVar : pairs) {
            map.put(qVar.b(), qVar.c());
        }
    }

    public static <K, V> Map<K, V> q(Iterable<? extends wc.q<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(r(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return h();
        }
        if (size != 1) {
            return r(iterable, new LinkedHashMap(n0.e(collection.size())));
        }
        return n0.f((wc.q) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M r(Iterable<? extends wc.q<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.t.f(iterable, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        o(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> s(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? u(map) : n0.g(map);
        }
        return h();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M t(wc.q<? extends K, ? extends V>[] qVarArr, M destination) {
        kotlin.jvm.internal.t.f(qVarArr, "<this>");
        kotlin.jvm.internal.t.f(destination, "destination");
        p(destination, qVarArr);
        return destination;
    }

    public static <K, V> Map<K, V> u(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
