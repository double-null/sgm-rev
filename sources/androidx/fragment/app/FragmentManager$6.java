package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.f f2521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f2522c;

    @Override // androidx.lifecycle.h
    public void b(androidx.lifecycle.j jVar, androidx.lifecycle.f.a aVar) {
        if (aVar == androidx.lifecycle.f.a.ON_START && ((Bundle) this.f2522c.f2662j.get(this.f2520a)) != null) {
            throw null;
        }
        if (aVar == androidx.lifecycle.f.a.ON_DESTROY) {
            this.f2521b.c(this);
            this.f2522c.f2663k.remove(this.f2520a);
        }
    }
}
