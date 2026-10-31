package he;

import je.n2;
import kotlin.collections.o;
import kotlin.jvm.internal.t;
import rd.f0;
import wc.g0;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    public static final f b(String serialName, e kind) {
        t.f(serialName, "serialName");
        t.f(kind, "kind");
        if (!f0.k0(serialName)) {
            return n2.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f c(String serialName, f[] typeParameters, id.l<? super a, g0> builderAction) {
        t.f(serialName, "serialName");
        t.f(typeParameters, "typeParameters");
        t.f(builderAction, "builderAction");
        if (!(!f0.k0(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new i(serialName, n.a.f15864a, aVar.f().size(), o.W(typeParameters), aVar);
    }

    public static final f d(String serialName, m kind, f[] typeParameters, id.l<? super a, g0> builder) {
        t.f(serialName, "serialName");
        t.f(kind, "kind");
        t.f(typeParameters, "typeParameters");
        t.f(builder, "builder");
        if (!(!f0.k0(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!t.a(kind, n.a.f15864a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new i(serialName, kind, aVar.f().size(), o.W(typeParameters), aVar);
    }

    public static /* synthetic */ f e(String str, m mVar, f[] fVarArr, id.l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new id.l() { // from class: he.k
                @Override // id.l
                public final Object invoke(Object obj2) {
                    return l.f((a) obj2);
                }
            };
        }
        return d(str, mVar, fVarArr, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 f(a aVar) {
        t.f(aVar, "<this>");
        return g0.f27756a;
    }
}
