package bitter.jnibridge;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f4510a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Constructor f4512c;

    public a(long j10) {
        this.f4511b = j10;
        try {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            this.f4512c = declaredConstructor;
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            this.f4512c = null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        synchronized (this.f4510a) {
            long j10 = this.f4511b;
            if (j10 == 0) {
                return null;
            }
            try {
                return JNIBridge.invoke(j10, method.getDeclaringClass(), method, objArr);
            } catch (NoSuchMethodError e10) {
                if (this.f4512c == null) {
                    System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                    throw e10;
                }
                if ((method.getModifiers() & 1024) != 0) {
                    throw e10;
                }
                if (objArr == null) {
                    objArr = new Object[0];
                }
                Class<?> declaringClass = method.getDeclaringClass();
                return ((MethodHandles.Lookup) this.f4512c.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
            }
        }
    }
}
