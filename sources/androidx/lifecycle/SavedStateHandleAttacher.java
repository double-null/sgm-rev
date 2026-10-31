package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f2871a;

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(event, "event");
        if (event == f.a.ON_CREATE) {
            source.getLifecycle().c(this);
            this.f2871a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
