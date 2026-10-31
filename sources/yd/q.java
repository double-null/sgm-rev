package yd;

import ud.b2;
import zd.a0;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {
    public static final void b(final n<?> nVar, zc.j jVar) {
        if (((Number) jVar.U(0, new id.p() { // from class: yd.p
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(q.c(nVar, ((Integer) obj).intValue(), (zc.j.b) obj2));
            }
        })).intValue() == nVar.f28900j) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + nVar.f28899i + ",\n\t\tbut emission happened in " + jVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(n nVar, int i10, zc.j.b bVar) {
        zc.j.c<?> key = bVar.getKey();
        zc.j.b bVarE = nVar.f28899i.e(key);
        if (key != b2.X8) {
            if (bVar != bVarE) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        b2 b2Var = (b2) bVarE;
        kotlin.jvm.internal.t.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        b2 b2VarD = d((b2) bVar, b2Var);
        if (b2VarD == b2Var) {
            return b2Var == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b2VarD + ", expected child of " + b2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final b2 d(b2 b2Var, b2 b2Var2) {
        while (b2Var != null) {
            if (b2Var == b2Var2) {
                return b2Var;
            }
            if (!(b2Var instanceof a0)) {
                return b2Var;
            }
            b2Var = ((a0) b2Var).m0();
        }
        return null;
    }
}
