package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ClassesInfoCache.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static b f2878c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f2879a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f2880b = new HashMap();

    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<f.a, List<C0047b>> f2881a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<C0047b, f.a> f2882b;

        a(Map<C0047b, f.a> map) {
            this.f2882b = map;
            for (Map.Entry<C0047b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<C0047b> arrayList = this.f2881a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2881a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<C0047b> list, j jVar, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(jVar, aVar, obj);
                }
            }
        }

        void a(j jVar, f.a aVar, Object obj) {
            b(this.f2881a.get(aVar), jVar, aVar, obj);
            b(this.f2881a.get(f.a.ON_ANY), jVar, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    static final class C0047b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f2884b;

        C0047b(int i10, Method method) {
            this.f2883a = i10;
            this.f2884b = method;
            method.setAccessible(true);
        }

        void a(j jVar, f.a aVar, Object obj) {
            try {
                int i10 = this.f2883a;
                if (i10 == 0) {
                    this.f2884b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f2884b.invoke(obj, jVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f2884b.invoke(obj, jVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0047b)) {
                return false;
            }
            C0047b c0047b = (C0047b) obj;
            return this.f2883a == c0047b.f2883a && this.f2884b.getName().equals(c0047b.f2884b.getName());
        }

        public int hashCode() {
            return (this.f2883a * 31) + this.f2884b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f2882b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0047b, f.a> entry : c(cls2).f2882b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            r rVar = (r) method.getAnnotation(r.class);
            if (rVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!j.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                f.a aVarValue = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!f.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0047b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f2879a.put(cls, aVar);
        this.f2880b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<C0047b, f.a> map, C0047b c0047b, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(c0047b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0047b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0047b.f2884b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class<?> cls) {
        a aVar = this.f2879a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f2880b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((r) method.getAnnotation(r.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f2880b.put(cls, Boolean.FALSE);
        return false;
    }
}
