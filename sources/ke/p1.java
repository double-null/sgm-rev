package ke;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p1 {
    public static final he.f a(he.f fVar, le.c module) {
        he.f fVarA;
        kotlin.jvm.internal.t.f(fVar, "<this>");
        kotlin.jvm.internal.t.f(module, "module");
        if (!kotlin.jvm.internal.t.a(fVar.d(), he.m.a.f15862a)) {
            return fVar.isInline() ? a(fVar.h(0), module) : fVar;
        }
        he.f fVarB = he.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final o1 b(kotlinx.serialization.json.b bVar, he.f desc) {
        kotlin.jvm.internal.t.f(bVar, "<this>");
        kotlin.jvm.internal.t.f(desc, "desc");
        he.m mVarD = desc.d();
        if (mVarD instanceof he.d) {
            return o1.POLY_OBJ;
        }
        if (kotlin.jvm.internal.t.a(mVarD, he.n.b.f15865a)) {
            return o1.LIST;
        }
        if (!kotlin.jvm.internal.t.a(mVarD, he.n.c.f15866a)) {
            return o1.OBJ;
        }
        he.f fVarA = a(desc.h(0), bVar.a());
        he.m mVarD2 = fVarA.d();
        if ((mVarD2 instanceof he.e) || kotlin.jvm.internal.t.a(mVarD2, he.m.b.f15863a)) {
            return o1.MAP;
        }
        if (bVar.e().c()) {
            return o1.LIST;
        }
        throw k0.d(fVarA);
    }
}
