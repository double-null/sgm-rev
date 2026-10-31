package ke;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: createMapForCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {
    public static final <K, V> Map<K, V> a(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
