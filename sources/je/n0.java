package je;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n0<K, V> extends j1<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.f f20967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(fe.d<K> kSerializer, fe.d<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.t.f(kSerializer, "kSerializer");
        kotlin.jvm.internal.t.f(vSerializer, "vSerializer");
        this.f20967c = new m0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // je.j1, fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20967c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> a() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap<K, V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap<K, V> map, int i10) {
        kotlin.jvm.internal.t.f(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> d(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        return map.entrySet().iterator();
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
    public HashMap<K, V> k(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(HashMap<K, V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        return map;
    }
}
