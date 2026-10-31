package kotlin.jvm.internal;

import java.util.List;

/* JADX INFO: compiled from: ReflectionFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 {
    public pd.c b(Class cls) {
        return new i(cls);
    }

    public pd.f c(Class cls, String str) {
        return new w(cls, str);
    }

    public pd.l d(pd.l lVar) {
        o0 o0Var = (o0) lVar;
        return new o0(lVar.c(), lVar.h(), o0Var.m(), o0Var.l() | 2);
    }

    public String h(o oVar) {
        String string = oVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(u uVar) {
        return h(uVar);
    }

    public pd.l j(pd.e eVar, List<pd.m> list, boolean z10) {
        return new o0(eVar, list, z10);
    }

    public pd.g a(p pVar) {
        return pVar;
    }

    public pd.i e(x xVar) {
        return xVar;
    }

    public pd.j f(z zVar) {
        return zVar;
    }

    public pd.k g(b0 b0Var) {
        return b0Var;
    }
}
