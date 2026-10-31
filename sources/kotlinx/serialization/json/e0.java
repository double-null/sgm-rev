package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, i> f21581a = new LinkedHashMap();

    public final d0 a() {
        return new d0(this.f21581a);
    }

    public final i b(String key, i element) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(element, "element");
        return this.f21581a.put(key, element);
    }
}
