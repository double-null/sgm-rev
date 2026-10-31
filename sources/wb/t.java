package wb;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: ReflectionUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t {
    public static final Object a(Class<?> cls, String methodName, Class<?>[] parameterTypes, Object[] parameterObjects, Object obj) {
        kotlin.jvm.internal.t.f(cls, "<this>");
        kotlin.jvm.internal.t.f(methodName, "methodName");
        kotlin.jvm.internal.t.f(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.t.f(parameterObjects, "parameterObjects");
        try {
            return c(cls, methodName, parameterTypes, parameterObjects, obj);
        } catch (Throwable unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass != null) {
                return a(superclass, methodName, parameterTypes, parameterObjects, obj);
            }
            return null;
        }
    }

    public static final Object b(Object obj, String methodName, Class<?>[] parameterTypes, Object[] parameterObjects) {
        kotlin.jvm.internal.t.f(obj, "<this>");
        kotlin.jvm.internal.t.f(methodName, "methodName");
        kotlin.jvm.internal.t.f(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.t.f(parameterObjects, "parameterObjects");
        return a(obj.getClass(), methodName, parameterTypes, parameterObjects, obj);
    }

    public static final Object c(Class<?> cls, String methodName, Class<?>[] parameterTypes, Object[] parameterObjects, Object obj) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        kotlin.jvm.internal.t.f(cls, "<this>");
        kotlin.jvm.internal.t.f(methodName, "methodName");
        kotlin.jvm.internal.t.f(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.t.f(parameterObjects, "parameterObjects");
        Method declaredMethod = cls.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, Arrays.copyOf(parameterObjects, parameterObjects.length));
    }
}
