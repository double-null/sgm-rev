package cd;

import java.lang.reflect.Method;
import kotlin.collections.o;
import kotlin.jvm.internal.t;
import md.d;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: cd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    private static final class C0099a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0099a f5526a = new C0099a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f5527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f5528c;

        /* JADX WARN: Code duplicated, block: B:10:0x0039  */
        static {
            Method method;
            Method method2;
            boolean z10;
            Method[] methods = Throwable.class.getMethods();
            t.c(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (t.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    t.e(parameterTypes, "getParameterTypes(...)");
                    if (t.a(o.S(parameterTypes), Throwable.class)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                } else {
                    i10++;
                }
            }
            f5527b = method2;
            for (Method method3 : methods) {
                if (t.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f5528c = method;
        }

        private C0099a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        t.f(cause, "cause");
        t.f(exception, "exception");
        Method method = C0099a.f5527b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public d b() {
        return new md.b();
    }
}
