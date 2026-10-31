package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f2873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2874c;

    public SavedStateHandleController(String key, v handle) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(handle, "handle");
        this.f2872a = key;
        this.f2873b = handle;
    }

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(event, "event");
        if (event == f.a.ON_DESTROY) {
            this.f2874c = false;
            source.getLifecycle().c(this);
        }
    }

    public final void h(androidx.savedstate.a registry, f lifecycle) {
        kotlin.jvm.internal.t.f(registry, "registry");
        kotlin.jvm.internal.t.f(lifecycle, "lifecycle");
        if (!(!this.f2874c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f2874c = true;
        lifecycle.a(this);
        registry.h(this.f2872a, this.f2873b.c());
    }

    public final v i() {
        return this.f2873b;
    }

    public final boolean j() {
        return this.f2874c;
    }
}
