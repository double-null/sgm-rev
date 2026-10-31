package je;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z1 {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> fe.d<T> b(pd.c<T> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        return d(cVar, new fe.d[0]);
    }

    public static final <T> fe.d<T> c(Class<T> cls, fe.d<Object>... args) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.t.f(cls, "<this>");
        kotlin.jvm.internal.t.f(args, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        fe.d<T> dVarK = k(cls, (fe.d[]) Arrays.copyOf(args, args.length));
        if (dVarK != null) {
            return dVarK;
        }
        fe.d<T> dVarH = h(cls);
        if (dVarH != null) {
            return dVarH;
        }
        fe.d<T> dVarF = f(cls, (fe.d[]) Arrays.copyOf(args, args.length));
        if (dVarF != null) {
            return dVarF;
        }
        if (n(cls)) {
            return new fe.h(hd.a.c(cls));
        }
        return null;
    }

    public static final <T> fe.d<T> d(pd.c<T> cVar, fe.d<Object>... args) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        kotlin.jvm.internal.t.f(args, "args");
        return c(hd.a.a(cVar), (fe.d[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> fe.d<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.t.e(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.t.d(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new h0(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> fe.d<T> f(Class<T> cls, fe.d<Object>... dVarArr) {
        Field field;
        fe.d<T> dVarJ;
        Object objG = g(cls);
        if (objG != null && (dVarJ = j(objG, (fe.d[]) Arrays.copyOf(dVarArr, dVarArr.length))) != null) {
            return dVarJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.t.e(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                    break;
                }
                Class<?> cls3 = declaredClasses[i10];
                if (kotlin.jvm.internal.t.a(cls3.getSimpleName(), "$serializer")) {
                    if (!z10) {
                        z10 = true;
                        cls2 = cls3;
                    }
                }
                i10++;
                cls2 = null;
                break;
            }
            Class<?> cls4 = cls2;
            Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof fe.d) {
                return (fe.d) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.t.e(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(l1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        kotlin.jvm.internal.t.e(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    private static final <T> fe.d<T> h(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        boolean z10;
        boolean z11;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            z10 = false;
        } else {
            if (rd.c0.O(canonicalName, "java.", false, 2, null) || rd.c0.O(canonicalName, "kotlin.", false, 2, null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        kotlin.jvm.internal.t.e(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        Field field = null;
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            if (i10 >= length) {
                if (!z12) {
                    break;
                }
                break;
            }
            Field field2 = declaredFields[i10];
            if (kotlin.jvm.internal.t.a(field2.getName(), "INSTANCE") && kotlin.jvm.internal.t.a(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                if (!z12) {
                    z12 = true;
                    field = field2;
                }
            }
            i10++;
            field = null;
            break;
        }
        Field field3 = field;
        if (field3 == null) {
            return null;
        }
        Object obj = field3.get(null);
        Method[] methods = cls.getMethods();
        kotlin.jvm.internal.t.e(methods, "getMethods(...)");
        int length2 = methods.length;
        Method method = null;
        int i11 = 0;
        boolean z13 = false;
        while (true) {
            if (i11 >= length2) {
                if (!z13) {
                    break;
                }
                break;
            }
            Method method2 = methods[i11];
            if (kotlin.jvm.internal.t.a(method2.getName(), "serializer")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                kotlin.jvm.internal.t.e(parameterTypes, "getParameterTypes(...)");
                if ((parameterTypes.length == 0) && kotlin.jvm.internal.t.a(method2.getReturnType(), fe.d.class)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (z11) {
                if (!z13) {
                    z13 = true;
                    method = method2;
                }
            }
            i11++;
            method = null;
            break;
        }
        Method method3 = method;
        if (method3 == null) {
            return null;
        }
        Object objInvoke = method3.invoke(obj, new Object[0]);
        if (objInvoke instanceof fe.d) {
            return (fe.d) objInvoke;
        }
        return null;
    }

    public static final Map<pd.c<?>, fe.d<?>> i() {
        Map mapC = kotlin.collections.n0.c();
        mapC.put(kotlin.jvm.internal.i0.b(String.class), ge.a.C(kotlin.jvm.internal.l0.f21527a));
        mapC.put(kotlin.jvm.internal.i0.b(Character.TYPE), ge.a.w(kotlin.jvm.internal.g.f21512a));
        mapC.put(kotlin.jvm.internal.i0.b(char[].class), ge.a.d());
        mapC.put(kotlin.jvm.internal.i0.b(Double.TYPE), ge.a.x(kotlin.jvm.internal.l.f21526a));
        mapC.put(kotlin.jvm.internal.i0.b(double[].class), ge.a.e());
        mapC.put(kotlin.jvm.internal.i0.b(Float.TYPE), ge.a.y(kotlin.jvm.internal.m.f21528a));
        mapC.put(kotlin.jvm.internal.i0.b(float[].class), ge.a.f());
        mapC.put(kotlin.jvm.internal.i0.b(Long.TYPE), ge.a.A(kotlin.jvm.internal.v.f21536a));
        mapC.put(kotlin.jvm.internal.i0.b(long[].class), ge.a.i());
        mapC.put(kotlin.jvm.internal.i0.b(wc.b0.class), ge.a.H(wc.b0.f27741b));
        mapC.put(kotlin.jvm.internal.i0.b(Integer.TYPE), ge.a.z(kotlin.jvm.internal.s.f21535a));
        mapC.put(kotlin.jvm.internal.i0.b(int[].class), ge.a.g());
        mapC.put(kotlin.jvm.internal.i0.b(wc.z.class), ge.a.G(wc.z.f27793b));
        mapC.put(kotlin.jvm.internal.i0.b(Short.TYPE), ge.a.B(kotlin.jvm.internal.k0.f21525a));
        mapC.put(kotlin.jvm.internal.i0.b(short[].class), ge.a.n());
        mapC.put(kotlin.jvm.internal.i0.b(wc.e0.class), ge.a.I(wc.e0.f27751b));
        mapC.put(kotlin.jvm.internal.i0.b(Byte.TYPE), ge.a.v(kotlin.jvm.internal.e.f21508a));
        mapC.put(kotlin.jvm.internal.i0.b(byte[].class), ge.a.c());
        mapC.put(kotlin.jvm.internal.i0.b(wc.x.class), ge.a.F(wc.x.f27788b));
        mapC.put(kotlin.jvm.internal.i0.b(Boolean.TYPE), ge.a.u(kotlin.jvm.internal.d.f21507a));
        mapC.put(kotlin.jvm.internal.i0.b(boolean[].class), ge.a.b());
        mapC.put(kotlin.jvm.internal.i0.b(wc.g0.class), ge.a.J(wc.g0.f27756a));
        mapC.put(kotlin.jvm.internal.i0.b(Void.class), ge.a.l());
        try {
            mapC.put(kotlin.jvm.internal.i0.b(sd.a.class), ge.a.D(sd.a.f25407b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapC.put(kotlin.jvm.internal.i0.b(wc.c0.class), ge.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(kotlin.jvm.internal.i0.b(wc.a0.class), ge.a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(kotlin.jvm.internal.i0.b(wc.f0.class), ge.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(kotlin.jvm.internal.i0.b(wc.y.class), ge.a.p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapC.put(kotlin.jvm.internal.i0.b(td.b.class), ge.a.E(td.b.f25788c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return kotlin.collections.n0.b(mapC);
    }

    private static final <T> fe.d<T> j(Object obj, fe.d<Object>... dVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (dVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = dVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = fe.d.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(dVarArr, dVarArr.length));
            if (objInvoke instanceof fe.d) {
                return (fe.d) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> fe.d<T> k(Class<?> cls, fe.d<Object>... dVarArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (fe.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }

    public static final <T> boolean l(pd.c<T> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        return hd.a.a(cVar).isInterface();
    }

    private static final <T> boolean m(Class<T> cls) {
        return cls.getAnnotation(fe.l.class) == null && cls.getAnnotation(fe.e.class) == null;
    }

    private static final <T> boolean n(Class<T> cls) {
        if (cls.getAnnotation(fe.e.class) != null) {
            return true;
        }
        fe.l lVar = (fe.l) cls.getAnnotation(fe.l.class);
        return lVar != null && kotlin.jvm.internal.t.a(kotlin.jvm.internal.i0.b(lVar.with()), kotlin.jvm.internal.i0.b(fe.h.class));
    }

    public static final boolean o(pd.c<Object> rootClass) {
        kotlin.jvm.internal.t.f(rootClass, "rootClass");
        return hd.a.a(rootClass).isArray();
    }

    public static final Void p(pd.c<?> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        a2.f(cVar);
        throw new KotlinNothingValueException();
    }

    public static final <T, E extends T> E[] q(ArrayList<E> arrayList, pd.c<T> eClass) {
        kotlin.jvm.internal.t.f(arrayList, "<this>");
        kotlin.jvm.internal.t.f(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) hd.a.a(eClass), arrayList.size());
        kotlin.jvm.internal.t.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.t.e(eArr, "toArray(...)");
        return eArr;
    }
}
