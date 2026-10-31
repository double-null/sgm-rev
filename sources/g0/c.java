package g0;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f15256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<String> f15257b;

    public c(SharedPreferences prefs, Set<String> set) {
        t.f(prefs, "prefs");
        this.f15256a = prefs;
        this.f15257b = set;
    }

    public final Map<String, Object> a() {
        Map<String, ?> all = this.f15256a.getAll();
        t.e(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.f15257b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n0.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = b0.t0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
