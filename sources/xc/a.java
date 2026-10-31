package xc;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends kotlin.collections.g<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }

    public final boolean e(E element) {
        t.f(element, "element");
        return f(element);
    }

    public abstract boolean f(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean g(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
