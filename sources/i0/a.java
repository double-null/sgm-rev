package i0;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Actual.jvmAndroid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final <T> Set<T> a(Set<? extends T> set) {
        t.f(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(b0.t0(set));
        t.e(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        t.f(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        t.e(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
