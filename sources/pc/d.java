package pc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: MapDataRetriever.java */
/* JADX INFO: loaded from: classes5.dex */
public class d<K> implements c<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, Object> f24252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f24253b;

    public d() {
        this(new ConcurrentHashMap(), new e());
    }

    @Override // pc.c
    public Float a(K k10, Float f10) {
        return this.f24253b.j(h(k10, f10), f10);
    }

    @Override // pc.c
    public float c(K k10, float f10) {
        return this.f24253b.h(h(k10, Float.valueOf(f10)), f10);
    }

    @Override // pc.c
    public String f(K k10, String str) {
        return this.f24253b.a(h(k10, str), str);
    }

    @Override // pc.c
    public Object h(K k10, Object obj) {
        return p(k10) ? q().get(k10) : obj;
    }

    @Override // pc.c
    public int k(K k10, int i10) {
        return this.f24253b.f(h(k10, Integer.valueOf(i10)), i10);
    }

    @Override // pc.c
    public boolean l(K k10, boolean z10) {
        return this.f24253b.b(h(k10, Boolean.valueOf(z10)), z10);
    }

    public void o() {
        q().clear();
    }

    public boolean p(K k10) {
        return q().containsKey(k10);
    }

    public Map<K, Object> q() {
        return this.f24252a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(Map<K, Object> map) {
        o();
        if (map != 0) {
            q().putAll(map);
        }
    }

    public d(Map<K, Object> map, b bVar) {
        this.f24252a = map;
        this.f24253b = bVar;
    }
}
