package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f2891a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Closeable> f2892b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f2893c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    final void a() {
        this.f2893c = true;
        Map<String, Object> map = this.f2891a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f2891a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        Set<Closeable> set = this.f2892b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f2892b.iterator();
                while (it2.hasNext()) {
                    b(it2.next());
                }
            }
        }
        d();
    }

    <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f2891a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f2891a.get(str);
        }
        return t10;
    }

    <T> T e(String str, T t10) {
        Object obj;
        synchronized (this.f2891a) {
            obj = this.f2891a.get(str);
            if (obj == null) {
                this.f2891a.put(str, t10);
            }
        }
        if (obj != null) {
            t10 = (T) obj;
        }
        if (this.f2893c) {
            b(t10);
        }
        return t10;
    }

    protected void d() {
    }
}
