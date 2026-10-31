package androidx.startup;

import a1.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AppInitializer.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f3577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3578e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f3581c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<Class<? extends z0.a<?>>> f3580b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f3579a = new HashMap();

    a(Context context) {
        this.f3581c = context.getApplicationContext();
    }

    private <T> T c(Class<? extends z0.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (b.d()) {
            try {
                b.a(cls.getSimpleName());
            } catch (Throwable th) {
                b.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f3579a.containsKey(cls)) {
            t10 = (T) this.f3579a.get(cls);
        } else {
            set.add(cls);
            try {
                z0.a<?> aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends z0.a<?>>> listA = aVarNewInstance.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends z0.a<?>> cls2 : listA) {
                        if (!this.f3579a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                t10 = (T) aVarNewInstance.create(this.f3581c);
                set.remove(cls);
                this.f3579a.put(cls, t10);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        b.b();
        return t10;
    }

    public static a d(Context context) {
        if (f3577d == null) {
            synchronized (f3578e) {
                if (f3577d == null) {
                    f3577d = new a(context);
                }
            }
        }
        return f3577d;
    }

    void a() {
        try {
            try {
                b.a("Startup");
                b(this.f3581c.getPackageManager().getProviderInfo(new ComponentName(this.f3581c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                b.b();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } catch (Throwable th) {
            b.b();
            throw th;
        }
    }

    void b(Bundle bundle) {
        String string = this.f3581c.getString(z0.b.f28916a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (z0.a.class.isAssignableFrom(cls)) {
                            this.f3580b.add((Class<? extends z0.a<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends z0.a<?>>> it = this.f3580b.iterator();
                while (it.hasNext()) {
                    c(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }
}
