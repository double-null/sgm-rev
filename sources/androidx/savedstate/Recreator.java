package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import w0.d;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3567b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3568a;

    /* JADX INFO: compiled from: Recreator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Recreator.kt */
    public static final class b implements androidx.savedstate.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f3569a;

        public b(androidx.savedstate.a registry) {
            t.f(registry, "registry");
            this.f3569a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3569a));
            return bundle;
        }

        public final void b(String className) {
            t.f(className, "className");
            this.f3569a.add(className);
        }
    }

    public Recreator(d owner) {
        t.f(owner, "owner");
        this.f3568a = owner;
    }

    private final void h(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.a.InterfaceC0071a.class);
            t.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    t.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((androidx.savedstate.a.InterfaceC0071a) objNewInstance).a(this.f3568a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.h
    public void b(j source, f.a event) {
        t.f(source, "source");
        t.f(event, "event");
        if (event != f.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        Bundle bundleB = this.f3568a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }
}
