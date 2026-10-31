package oc;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: ReflectionUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class n {
    public static Object a(Class<?> cls, String str, Object obj) {
        try {
            return d(cls, str, obj);
        } catch (Throwable unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str, obj);
        }
    }

    public static Object b(Object obj, String str) {
        return a(obj.getClass(), str, obj);
    }

    public static Object c(Object obj, String[] strArr) {
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            obj = b(obj, str);
            if (obj == null) {
                return null;
            }
        }
        return obj;
    }

    public static Object d(Class<?> cls, String str, Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
