package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes5.dex */
class m0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.t.f(map, "<this>");
        if (map instanceof k0) {
            return (V) ((k0) map).h(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
