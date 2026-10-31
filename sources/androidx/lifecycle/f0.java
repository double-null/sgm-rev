package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, c0> f2915a = new LinkedHashMap();

    public final void a() {
        Iterator<c0> it = this.f2915a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f2915a.clear();
    }

    public final c0 b(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        return this.f2915a.get(key);
    }

    public final Set<String> c() {
        return new HashSet(this.f2915a.keySet());
    }

    public final void d(String key, c0 viewModel) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(viewModel, "viewModel");
        c0 c0VarPut = this.f2915a.put(key, viewModel);
        if (c0VarPut != null) {
            c0VarPut.d();
        }
    }
}
