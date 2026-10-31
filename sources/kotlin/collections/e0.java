package kotlin.collections;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes5.dex */
final class e0 implements Map, Serializable, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f21456a = new e0();

    private e0() {
    }

    private final Object readResolve() {
        return f21456a;
    }

    public boolean b(Void value) {
        kotlin.jvm.internal.t.f(value, "value");
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return b((Void) obj);
        }
        return false;
    }

    public Set<Map.Entry> e() {
        return f0.f21457a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Set<Object> f() {
        return f0.f21457a;
    }

    public int g() {
        return 0;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    public Collection k() {
        return d0.f21455a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return f();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    public String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return k();
    }
}
