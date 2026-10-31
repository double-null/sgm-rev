package w0;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SavedStateRegistryController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27495d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f27496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f27497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27498c;

    /* JADX INFO: compiled from: SavedStateRegistryController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(d owner) {
            t.f(owner, "owner");
            return new c(owner, null);
        }
    }

    public /* synthetic */ c(d dVar, k kVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f27495d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f27497b;
    }

    public final void c() {
        f lifecycle = this.f27496a.getLifecycle();
        if (!(lifecycle.b() == f.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f27496a));
        this.f27497b.e(lifecycle);
        this.f27498c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f27498c) {
            c();
        }
        f lifecycle = this.f27496a.getLifecycle();
        if (!lifecycle.b().c(f.b.STARTED)) {
            this.f27497b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        t.f(outBundle, "outBundle");
        this.f27497b.g(outBundle);
    }

    private c(d dVar) {
        this.f27496a = dVar;
        this.f27497b = new androidx.savedstate.a();
    }
}
