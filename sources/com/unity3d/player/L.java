package com.unity3d.player;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class L implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f12747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UnityPlayer f12748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f12750d;

    L(UnityPlayer unityPlayer, long j10) {
        this.f12750d = j10;
        long j11 = ReflectionHelper.f12792b;
        this.f12747a = new O(j11, j10);
        this.f12748b = unityPlayer;
        this.f12749c = j11;
    }

    private static Object a(Object obj, Method method, Object[] objArr, N n10) {
        if (objArr == null) {
            try {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC2409z.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                    ReflectionHelper.nativeProxyLogJNIInvokeException(n10.f12761a);
                    n10.f12761a = 0L;
                    return null;
                }
            } catch (Throwable th) {
                long j10 = n10.f12761a;
                if (j10 != 0) {
                    ReflectionHelper.nativeProxyJNIFreeGCHandle(j10);
                }
                throw th;
            }
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        Object objInvokeWithArguments = ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        long j11 = n10.f12761a;
        if (j11 != 0) {
            ReflectionHelper.nativeProxyJNIFreeGCHandle(j11);
        }
        return objInvokeWithArguments;
    }

    protected void finalize() throws Throwable {
        this.f12748b.queueGLThreadEvent(this.f12747a);
        super.finalize();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!ReflectionHelper.beginProxyCall(this.f12749c)) {
            AbstractC2409z.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            Object objNativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.f12750d, method.getName(), objArr);
            if (!(objNativeProxyInvoke instanceof N)) {
                return objNativeProxyInvoke;
            }
            N n10 = (N) objNativeProxyInvoke;
            if (n10.f12762b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, n10);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(n10.f12761a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }
}
