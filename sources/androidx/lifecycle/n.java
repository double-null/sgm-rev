package androidx.lifecycle;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Lifecycling.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f2928a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<?>, Integer> f2929b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends d>>> f2930c = new HashMap();

    private n() {
    }

    private final d a(Constructor<? extends d> constructor, Object obj) {
        try {
            d dVarNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.t.e(dVarNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return dVarNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends d> b(Class<?> cls) {
        try {
            Package r10 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r10 != null ? r10.getName() : "";
            kotlin.jvm.internal.t.e(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.t.e(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.t.e(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.t.e(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (!(fullPackage.length() == 0)) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.t.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        kotlin.jvm.internal.t.f(className, "className");
        return rd.c0.K(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f2929b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && i.class.isAssignableFrom(cls);
    }

    public static final h f(Object object) {
        kotlin.jvm.internal.t.f(object, "object");
        boolean z10 = object instanceof h;
        boolean z11 = object instanceof c;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((c) object, (h) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((c) object, null);
        }
        if (z10) {
            return (h) object;
        }
        Class<?> cls = object.getClass();
        n nVar = f2928a;
        if (nVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends d>> list = f2930c.get(cls);
        kotlin.jvm.internal.t.c(list);
        List<Constructor<? extends d>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(nVar.a(list2.get(0), object));
        }
        int size = list2.size();
        d[] dVarArr = new d[size];
        for (int i10 = 0; i10 < size; i10++) {
            dVarArr[i10] = f2928a.a(list2.get(i10), object);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> constructorB = b(cls);
        if (constructorB != null) {
            f2930c.put(cls, kotlin.collections.s.e(constructorB));
            return 2;
        }
        if (b.f2878c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.t.e(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends d>> list = f2930c.get(superclass);
            kotlin.jvm.internal.t.c(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.t.e(interfaces, WKirgUEJJ.KoEMYPMyBznqEN);
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.t.e(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends d>> list2 = f2930c.get(intrface);
                kotlin.jvm.internal.t.c(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f2930c.put(cls, arrayList);
        return 2;
    }
}
