package je;

import java.util.Map;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<pd.c<?>, fe.d<?>> f20968a = z1.i();

    public static final he.f a(String serialName, he.e kind) {
        kotlin.jvm.internal.t.f(serialName, "serialName");
        kotlin.jvm.internal.t.f(kind, "kind");
        c(serialName);
        return new m2(serialName, kind);
    }

    public static final <T> fe.d<T> b(pd.c<T> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        return (fe.d) f20968a.get(cVar);
    }

    private static final void c(String str) {
        for (fe.d<?> dVar : f20968a.values()) {
            if (kotlin.jvm.internal.t.a(str, dVar.getDescriptor().i())) {
                throw new IllegalArgumentException(rd.v.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + kotlin.jvm.internal.i0.b(dVar.getClass()).g() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
