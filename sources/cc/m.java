package cc;

import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ResponseMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f5524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<String>> f5525b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Integer num, Map<String, ? extends List<String>> map) {
        this.f5524a = num;
        this.f5525b = map;
    }

    public final Integer a() {
        return this.f5524a;
    }

    public final String b(String key) {
        List<String> list;
        t.f(key, "key");
        Map<String, List<String>> map = this.f5525b;
        if (map == null || (list = map.get(key)) == null) {
            return null;
        }
        return (String) b0.P(list);
    }
}
