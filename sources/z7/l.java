package z7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f29070a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f29071b;

    public synchronized Map<String, String> a() {
        if (this.f29071b == null) {
            this.f29071b = Collections.unmodifiableMap(new HashMap(this.f29070a));
        }
        return this.f29071b;
    }
}
