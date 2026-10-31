package n;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FastSafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f22638e = new HashMap<>();

    @Override // n.b
    protected b.c<K, V> c(K k10) {
        return this.f22638e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f22638e.containsKey(k10);
    }

    @Override // n.b
    public V g(K k10, V v10) {
        b.c<K, V> cVarC = c(k10);
        if (cVarC != null) {
            return cVarC.f22644b;
        }
        this.f22638e.put(k10, f(k10, v10));
        return null;
    }

    @Override // n.b
    public V h(K k10) {
        V v10 = (V) super.h(k10);
        this.f22638e.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> i(K k10) {
        if (contains(k10)) {
            return this.f22638e.get(k10).f22646d;
        }
        return null;
    }
}
