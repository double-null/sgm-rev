package k4;

import i4.d;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: ReflectionAccessor.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f21219a;

    static {
        f21219a = d.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f21219a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
