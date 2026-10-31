package xc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<K, V> f28464a;

    public e(d<K, V> backing) {
        t.f(backing, "backing");
        this.f28464a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        t.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.g
    public int c() {
        return this.f28464a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28464a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        return this.f28464a.x(elements);
    }

    @Override // xc.a
    public boolean f(Map.Entry<? extends K, ? extends V> element) {
        t.f(element, "element");
        return this.f28464a.z(element);
    }

    @Override // xc.a
    public boolean g(Map.Entry element) {
        t.f(element, "element");
        return this.f28464a.n0(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f28464a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f28464a.F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> element) {
        t.f(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28464a.v();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28464a.v();
        return super.retainAll(elements);
    }
}
