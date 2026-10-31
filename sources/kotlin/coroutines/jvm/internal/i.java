package kotlin.coroutines.jvm.internal;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.lang.reflect.Method;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f21489a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f21490b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f21491c;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f21492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f21493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f21494c;

        public a(Method method, Method method2, Method method3) {
            this.f21492a = method;
            this.f21493b = method2;
            this.f21494c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f21491c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f21490b;
            f21491c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a aVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        t.f(aVar, WKirgUEJJ.wAZdU);
        a aVarA = f21491c;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA == f21490b || (method = aVarA.f21492a) == null || (objInvoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVarA.f21493b) == null || (objInvoke2 = method2.invoke(objInvoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVarA.f21494c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
