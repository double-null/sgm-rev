package com.unity3d.player;

import com.adjust.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class ReflectionHelper {
    protected static boolean LOG = false;
    protected static final boolean LOGV = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static M[] f12791a = new M[4096];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f12792b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f12793c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f12794d = false;

    protected static synchronized boolean beginProxyCall(long j10) {
        if (j10 != f12792b) {
            return false;
        }
        f12793c++;
        return true;
    }

    protected static Object createInvocationError(long j10, boolean z10) {
        return new N(j10, z10);
    }

    protected static synchronized void endProxyCall() {
        long j10 = f12793c - 1;
        f12793c = j10;
        if (0 == j10 && f12794d) {
            ReflectionHelper.class.notifyAll();
        }
    }

    protected static synchronized void endUnityLaunch() {
        try {
            f12792b++;
            f12794d = true;
            while (f12793c > 0) {
                ReflectionHelper.class.wait();
            }
        } catch (InterruptedException unused) {
            AbstractC2409z.Log(6, "Interrupted while waiting for all proxies to exit.");
        }
        f12794d = false;
    }

    protected static Constructor getConstructorID(Class cls, String str) {
        Constructor<?> constructor;
        M m10 = new M(cls, "", str);
        if (a(m10)) {
            constructor = (Constructor) m10.f12759e;
        } else {
            Class[] clsArrA = a(str);
            Constructor<?> constructor2 = null;
            float f10 = 0.0f;
            for (Constructor<?> constructor3 : cls.getConstructors()) {
                float fA = a(Void.TYPE, constructor3.getParameterTypes(), clsArrA);
                if (fA > f10) {
                    if (fA == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f10 = fA;
                }
            }
            synchronized (ReflectionHelper.class) {
                m10.f12759e = constructor2;
                f12791a[m10.f12758d & 4095] = m10;
            }
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z10) {
        Field field;
        Class superclass = cls;
        M m10 = new M(superclass, str, str2);
        if (a(m10)) {
            field = (Field) m10.f12759e;
        } else {
            Class[] clsArrA = a(str2);
            float f10 = 0.0f;
            Field field2 = null;
            while (superclass != null) {
                for (Field field3 : superclass.getDeclaredFields()) {
                    if (z10 == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float fA = a(field3.getType(), null, clsArrA);
                        if (fA > f10) {
                            field2 = field3;
                            if (fA == 1.0f) {
                                f10 = fA;
                                break;
                            }
                            f10 = fA;
                        } else {
                            continue;
                        }
                    }
                }
                if (f10 == 1.0f || superclass.isPrimitive() || superclass.isInterface() || superclass.equals(Object.class) || superclass.equals(Void.TYPE)) {
                    break;
                }
                superclass = superclass.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                m10.f12759e = field2;
                f12791a[m10.f12758d & 4095] = m10;
            }
            field = field2;
        }
        if (field != null) {
            return field;
        }
        Object[] objArr = new Object[4];
        objArr[0] = z10 ? "static" : "non-static";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = superclass.getName();
        throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", objArr));
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (!type.isPrimitive()) {
            if (type.isArray()) {
                return type.getName().replace('.', '/');
            }
            return "L" + type.getName().replace('.', '/') + ";";
        }
        String name = type.getName();
        if ("boolean".equals(name)) {
            return "Z";
        }
        if ("byte".equals(name)) {
            return "B";
        }
        if ("char".equals(name)) {
            return "C";
        }
        if ("double".equals(name)) {
            return "D";
        }
        if ("float".equals(name)) {
            return "F";
        }
        if ("int".equals(name)) {
            return "I";
        }
        if (Constants.LONG.equals(name)) {
            return "J";
        }
        return "short".equals(name) ? "S" : name;
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z10) {
        Method method;
        M m10 = new M(cls, str, str2);
        if (a(m10)) {
            method = (Method) m10.f12759e;
        } else {
            Class[] clsArrA = a(str2);
            Method method2 = null;
            float f10 = 0.0f;
            while (cls != null) {
                for (Method method3 : cls.getDeclaredMethods()) {
                    if (z10 == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float fA = a(method3.getReturnType(), method3.getParameterTypes(), clsArrA);
                        if (fA <= f10) {
                            continue;
                        } else {
                            if (fA == 1.0f) {
                                method2 = method3;
                                f10 = fA;
                                break;
                            }
                            method2 = method3;
                            f10 = fA;
                        }
                    }
                }
                if (f10 == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                m10.f12759e = method2;
                f12791a[m10.f12758d & 4095] = m10;
            }
            method = method2;
        }
        if (method != null) {
            return method;
        }
        Object[] objArr = new Object[4];
        objArr[0] = z10 ? "static" : "non-static";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = cls.getName();
        throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j10, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyJNIFreeGCHandle(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j10);

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j10, Class cls) {
        return newProxyInstance(unityPlayer, j10, new Class[]{cls});
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        float f10;
        float f11;
        float f12 = 0.1f;
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i10 = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        if (clsArr != null) {
            int length = clsArr.length;
            int i11 = 0;
            f10 = 1.0f;
            while (i10 < length) {
                Class cls2 = clsArr[i10];
                int i12 = i11 + 1;
                Class cls3 = clsArr2[i11];
                if (cls2.equals(cls3)) {
                    f11 = 1.0f;
                } else if (cls2.isPrimitive() || cls3.isPrimitive()) {
                    f11 = 0.0f;
                } else {
                    try {
                        if (cls2.asSubclass(cls3) != null) {
                            f11 = 0.5f;
                        } else {
                            try {
                                if (cls3.asSubclass(cls2) != null) {
                                    f11 = 0.1f;
                                } else {
                                    f11 = 0.0f;
                                }
                            } catch (ClassCastException unused) {
                            }
                        }
                    } catch (ClassCastException unused2) {
                    }
                }
                f10 *= f11;
                i10++;
                i11 = i12;
            }
        } else {
            f10 = 1.0f;
        }
        Class cls4 = clsArr2[clsArr2.length - 1];
        if (cls.equals(cls4)) {
            f12 = 1.0f;
        } else if (cls.isPrimitive() || cls4.isPrimitive()) {
            f12 = 0.0f;
        } else {
            try {
                if (cls.asSubclass(cls4) != null) {
                    f12 = 0.5f;
                } else {
                    try {
                        if (cls4.asSubclass(cls) == null) {
                            f12 = 0.0f;
                        }
                    } catch (ClassCastException unused3) {
                    }
                }
            } catch (ClassCastException unused4) {
            }
        }
        return f10 * f12;
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j10, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new L(unityPlayer, j10));
    }

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i10 = iArr[0];
            iArr[0] = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != '(' && cCharAt != ')') {
                if (cCharAt == 'L') {
                    int iIndexOf = str.indexOf(59, iArr[0]);
                    if (iIndexOf == -1) {
                        return null;
                    }
                    String strSubstring = str.substring(iArr[0], iIndexOf);
                    iArr[0] = iIndexOf + 1;
                    try {
                        return Class.forName(strSubstring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (cCharAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (cCharAt == 'I') {
                    return Integer.TYPE;
                }
                if (cCharAt == 'F') {
                    return Float.TYPE;
                }
                if (cCharAt == 'V') {
                    return Void.TYPE;
                }
                if (cCharAt == 'B') {
                    return Byte.TYPE;
                }
                if (cCharAt == 'C') {
                    return Character.TYPE;
                }
                if (cCharAt == 'S') {
                    return Short.TYPE;
                }
                if (cCharAt == 'J') {
                    return Long.TYPE;
                }
                if (cCharAt == 'D') {
                    return Double.TYPE;
                }
                if (cCharAt == '[') {
                    return Array.newInstance((Class<?>) a(str, iArr), 0).getClass();
                }
                AbstractC2409z.Log(5, "! parseType; " + cCharAt + " is not known!");
                return null;
            }
        }
        return null;
    }

    private static synchronized boolean a(M m10) {
        M m11 = f12791a[m10.f12758d & 4095];
        if (!m10.equals(m11)) {
            return false;
        }
        m10.f12759e = m11.f12759e;
        return true;
    }

    private static Class[] a(String str) {
        Class clsA;
        int i10 = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (clsA = a(str, iArr)) != null) {
            arrayList.add(clsA);
        }
        Class[] clsArr = new Class[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i10] = (Class) it.next();
            i10++;
        }
        return clsArr;
    }
}
