package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
class z implements w0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.k f2840a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w0.c f2841b = null;

    z() {
    }

    void a(androidx.lifecycle.f.a aVar) {
        this.f2840a.h(aVar);
    }

    void b() {
        if (this.f2840a == null) {
            this.f2840a = new androidx.lifecycle.k(this);
            this.f2841b = w0.c.a(this);
        }
    }

    boolean c() {
        return this.f2840a != null;
    }

    void d(Bundle bundle) {
        this.f2841b.d(bundle);
    }

    void e(Bundle bundle) {
        this.f2841b.e(bundle);
    }

    void f(androidx.lifecycle.f.b bVar) {
        this.f2840a.m(bVar);
    }

    @Override // androidx.lifecycle.j
    public androidx.lifecycle.f getLifecycle() {
        b();
        return this.f2840a;
    }

    @Override // w0.d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f2841b.b();
    }
}
