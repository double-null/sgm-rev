package c5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f4736a;

    public a(Map<String, String> map) {
        this.f4736a = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.f4736a;
    }
}
