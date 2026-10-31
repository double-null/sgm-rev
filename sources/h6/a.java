package h6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g6.a f15614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Method, Boolean> f15615b;

    public /* synthetic */ a(g6.a aVar, byte b10) {
        this(aVar);
    }

    private boolean a(Method method) {
        Boolean bool = this.f15615b.get(method);
        if (bool != null) {
            return bool.booleanValue();
        }
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> superclass = this.f15614a.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                if (((c) superclass.getDeclaredMethod(name, parameterTypes).getAnnotation(c.class)) != null) {
                    this.f15615b.put(method, Boolean.TRUE);
                    return true;
                }
                continue;
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f15615b.put(method, Boolean.FALSE);
        return false;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Object objInvoke = method.invoke(this.f15614a, objArr);
            if (a(method)) {
                if ((objInvoke instanceof c6.c) && ((c6.c) objInvoke).c().a() == 403) {
                    c6.c<c6.a> cVarC = this.f15614a.c();
                    if (!cVarC.g()) {
                        return cVarC.f() ? cVarC : objInvoke;
                    }
                    try {
                        return method.invoke(this.f15614a, objArr);
                    } catch (InvocationTargetException e10) {
                        throw e10.getTargetException();
                    }
                }
            }
            return objInvoke;
        } catch (InvocationTargetException e11) {
            throw e11.getTargetException();
        }
    }

    private a(g6.a aVar) {
        this.f15614a = aVar;
        this.f15615b = new ConcurrentHashMap(0);
    }
}
