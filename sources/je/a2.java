package je;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final he.f[] f20865a = new he.f[0];

    public static final Set<String> a(he.f fVar) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(fVar.f(i10));
        }
        return hashSet;
    }

    public static final he.f[] b(List<? extends he.f> list) {
        he.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (he.f[]) list.toArray(new he.f[0])) == null) ? f20865a : fVarArr;
    }

    public static final pd.c<Object> c(pd.l lVar) {
        kotlin.jvm.internal.t.f(lVar, "<this>");
        pd.e eVarC = lVar.c();
        if (eVarC instanceof pd.c) {
            return (pd.c) eVarC;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + eVarC);
    }

    public static final String d(String className) {
        kotlin.jvm.internal.t.f(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final String e(pd.c<?> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        String strG = cVar.g();
        if (strG == null) {
            strG = "<local class name not available>";
        }
        return d(strG);
    }

    public static final Void f(pd.c<?> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        throw new SerializationException(e(cVar));
    }

    public static final pd.l g(pd.m mVar) {
        kotlin.jvm.internal.t.f(mVar, "<this>");
        pd.l lVarA = mVar.a();
        if (lVarA != null) {
            return lVarA;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + mVar.a()).toString());
    }
}
