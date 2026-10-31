package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes5.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j0 f21522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pd.c[] f21523b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (j0Var == null) {
            j0Var = new j0();
        }
        f21522a = j0Var;
        f21523b = new pd.c[0];
    }

    public static pd.g a(p pVar) {
        return f21522a.a(pVar);
    }

    public static pd.c b(Class cls) {
        return f21522a.b(cls);
    }

    public static pd.f c(Class cls) {
        return f21522a.c(cls, "");
    }

    public static pd.l d(pd.l lVar) {
        return f21522a.d(lVar);
    }

    public static pd.i e(x xVar) {
        return f21522a.e(xVar);
    }

    public static pd.j f(z zVar) {
        return f21522a.f(zVar);
    }

    public static pd.k g(b0 b0Var) {
        return f21522a.g(b0Var);
    }

    public static String h(o oVar) {
        return f21522a.h(oVar);
    }

    public static String i(u uVar) {
        return f21522a.i(uVar);
    }

    public static pd.l j(Class cls) {
        return f21522a.j(b(cls), Collections.emptyList(), false);
    }

    public static pd.l k(Class cls, pd.m mVar) {
        return f21522a.j(b(cls), Collections.singletonList(mVar), false);
    }

    public static pd.l l(Class cls, pd.m mVar, pd.m mVar2) {
        return f21522a.j(b(cls), Arrays.asList(mVar, mVar2), false);
    }
}
