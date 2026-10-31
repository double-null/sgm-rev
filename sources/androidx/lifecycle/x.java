package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x implements androidx.savedstate.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.savedstate.a f2945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f2947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.k f2948d;

    private final y c() {
        return (y) this.f2948d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2947c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, v> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleA = entry.getValue().c().a();
            if (!kotlin.jvm.internal.t.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleA);
            }
        }
        this.f2946b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        d();
        Bundle bundle = this.f2947c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f2947c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f2947c;
        boolean z10 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            this.f2947c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f2946b) {
            return;
        }
        Bundle bundleB = this.f2945a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2947c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f2947c = bundle;
        this.f2946b = true;
        c();
    }
}
