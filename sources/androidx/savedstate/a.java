package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import w0.d;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f3570g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f3573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Recreator.b f3575e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.b<String, c> f3571a = new n.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3576f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    public interface InterfaceC0071a {
        void a(d dVar);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, j jVar, f.a event) {
        t.f(this$0, "this$0");
        t.f(jVar, "<anonymous parameter 0>");
        t.f(event, "event");
        if (event == f.a.ON_START) {
            this$0.f3576f = true;
        } else if (event == f.a.ON_STOP) {
            this$0.f3576f = false;
        }
    }

    public final Bundle b(String key) {
        t.f(key, "key");
        if (!this.f3574d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f3573c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f3573c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f3573c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f3573c = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        t.f(key, "key");
        for (Map.Entry<String, c> components : this.f3571a) {
            t.e(components, "components");
            String key2 = components.getKey();
            c value = components.getValue();
            if (t.a(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final void e(f lifecycle) {
        t.f(lifecycle, "lifecycle");
        if (!(!this.f3572b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new h() { // from class: w0.b
            @Override // androidx.lifecycle.h
            public final void b(j jVar, f.a aVar) {
                androidx.savedstate.a.d(this.f27494a, jVar, aVar);
            }
        });
        this.f3572b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f3572b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f3574d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f3573c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f3574d = true;
    }

    public final void g(Bundle outBundle) {
        t.f(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3573c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        n.b<String, c>.d dVarD = this.f3571a.d();
        t.e(dVarD, "this.components.iteratorWithAdditions()");
        while (dVarD.hasNext()) {
            Map.Entry next = dVarD.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        t.f(key, "key");
        t.f(provider, "provider");
        if (!(this.f3571a.g(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends InterfaceC0071a> clazz) {
        t.f(clazz, "clazz");
        if (!this.f3576f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f3575e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f3575e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f3575e;
            if (bVar2 != null) {
                String name = clazz.getName();
                t.e(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
