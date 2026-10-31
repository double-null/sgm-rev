package je;

import c2.YDwL.tFQWuE;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z0<K, V> extends j1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.f f21045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(fe.d<K> kSerializer, fe.d<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.t.f(kSerializer, "kSerializer");
        kotlin.jvm.internal.t.f(vSerializer, "vSerializer");
        this.f21045c = new y0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // je.j1, fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f21045c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> a() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.t.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap<K, V> linkedHashMap, int i10) {
        kotlin.jvm.internal.t.f(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> k(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.t.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> d(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, tFQWuE.oCsFAMvACvfJ);
        return map.entrySet().iterator();
    }
}
