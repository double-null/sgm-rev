package kotlin.collections;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class n0 extends m0 {
    public static <K, V> Map<K, V> b(Map<K, V> builder) {
        kotlin.jvm.internal.t.f(builder, "builder");
        return ((xc.d) builder).t();
    }

    public static <K, V> Map<K, V> c() {
        return new xc.d();
    }

    public static <K, V> Map<K, V> d(int i10) {
        return new xc.d(i10);
    }

    public static int e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> f(wc.q<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.t.f(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.e(), pair.f());
        kotlin.jvm.internal.t.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.t.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
