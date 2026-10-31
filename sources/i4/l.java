package i4;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f15979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f15980b;

        a(Method method, Object obj) {
            this.f15979a = method;
            this.f15980b = obj;
        }

        @Override // i4.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f15979a.invoke(this.f15980b, cls);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f15981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15982b;

        b(Method method, int i10) {
            this.f15981a = method;
            this.f15982b = i10;
        }

        @Override // i4.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f15981a.invoke(null, cls, Integer.valueOf(this.f15982b));
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class c extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f15983a;

        c(Method method) {
            this.f15983a = method;
        }

        @Override // i4.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f15983a.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    class d extends l {
        d() {
        }

        @Override // i4.l
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static l b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
