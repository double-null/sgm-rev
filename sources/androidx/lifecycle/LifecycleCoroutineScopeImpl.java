package androidx.lifecycle;

import ud.e2;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f2848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zc.j f2849b;

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(event, "event");
        if (h().b().compareTo(f.b.DESTROYED) <= 0) {
            h().c(this);
            e2.d(q(), null, 1, null);
        }
    }

    public f h() {
        return this.f2848a;
    }

    @Override // ud.o0
    public zc.j q() {
        return this.f2849b;
    }
}
