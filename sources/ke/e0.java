package ke;

import java.util.Map;

/* JADX INFO: compiled from: SchemaCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<he.f, Map<a<Object>, Object>> f21344a = d0.a(16);

    /* JADX INFO: compiled from: SchemaCache.kt */
    public static final class a<T> {
    }

    public final <T> T a(he.f descriptor, a<T> key) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(key, "key");
        Map<a<Object>, Object> map = this.f21344a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T b(he.f descriptor, a<T> key, id.a<? extends T> defaultValue) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(defaultValue, "defaultValue");
        T t10 = (T) a(descriptor, key);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = defaultValue.invoke();
        c(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> void c(he.f descriptor, a<T> key, T value) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        Map<he.f, Map<a<Object>, Object>> map = this.f21344a;
        Map<a<Object>, Object> mapA = map.get(descriptor);
        if (mapA == null) {
            mapA = d0.a(2);
            map.put(descriptor, mapA);
        }
        mapA.put(key, value);
    }
}
