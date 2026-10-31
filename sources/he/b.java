package he;

import je.p2;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final pd.c<?> a(f fVar) {
        t.f(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f15829b;
        }
        if (fVar instanceof p2) {
            return a(((p2) fVar).k());
        }
        return null;
    }

    public static final f b(le.c cVar, f descriptor) {
        fe.d dVarC;
        t.f(cVar, "<this>");
        t.f(descriptor, "descriptor");
        pd.c<?> cVarA = a(descriptor);
        if (cVarA == null || (dVarC = le.c.c(cVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return dVarC.getDescriptor();
    }

    public static final f c(f fVar, pd.c<?> context) {
        t.f(fVar, "<this>");
        t.f(context, "context");
        return new c(fVar, context);
    }
}
