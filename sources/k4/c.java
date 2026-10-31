package k4;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: UnsafeReflectionAccessor.java */
/* JADX INFO: loaded from: classes4.dex */
final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class f21220d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21221b = d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f21222c = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f21220d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // k4.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f21221b != null && this.f21222c != null) {
            try {
                f21220d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f21221b, accessibleObject, Long.valueOf(((Long) f21220d.getMethod("objectFieldOffset", Field.class).invoke(this.f21221b, this.f21222c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
