package ud;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final zc.j d(zc.j jVar, zc.j jVar2, final boolean z10) {
        boolean zH = h(jVar);
        boolean zH2 = h(jVar2);
        if (!zH && !zH2) {
            return jVar.z(jVar2);
        }
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f21514a = jVar2;
        zc.k kVar = zc.k.f29181a;
        zc.j jVar3 = (zc.j) jVar.U(kVar, new id.p() { // from class: ud.f0
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return i0.e(h0Var, z10, (zc.j) obj, (zc.j.b) obj2);
            }
        });
        if (zH2) {
            h0Var.f21514a = ((zc.j) h0Var.f21514a).U(kVar, new id.p() { // from class: ud.g0
                @Override // id.p
                public final Object invoke(Object obj, Object obj2) {
                    return i0.f((zc.j) obj, (zc.j.b) obj2);
                }
            });
        }
        return jVar3.z((zc.j) h0Var.f21514a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, zc.j] */
    public static final zc.j e(kotlin.jvm.internal.h0 h0Var, boolean z10, zc.j jVar, zc.j.b bVar) {
        if (!(bVar instanceof e0)) {
            return jVar.z(bVar);
        }
        zc.j.b bVarE = ((zc.j) h0Var.f21514a).e(bVar.getKey());
        if (bVarE == null) {
            return jVar.z(z10 ? ((e0) bVar).C() : (e0) bVar);
        }
        h0Var.f21514a = ((zc.j) h0Var.f21514a).a0(bVar.getKey());
        return jVar.z(((e0) bVar).B(bVarE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zc.j f(zc.j jVar, zc.j.b bVar) {
        return bVar instanceof e0 ? jVar.z(((e0) bVar).C()) : jVar.z(bVar);
    }

    public static final String g(zc.j jVar) {
        return null;
    }

    private static final boolean h(zc.j jVar) {
        return ((Boolean) jVar.U(Boolean.FALSE, new id.p() { // from class: ud.h0
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(i0.i(((Boolean) obj).booleanValue(), (zc.j.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, zc.j.b bVar) {
        return z10 || (bVar instanceof e0);
    }

    public static final zc.j j(o0 o0Var, zc.j jVar) {
        zc.j jVarD = d(o0Var.q(), jVar, true);
        return (jVarD == e1.a() || jVarD.e(zc.g.f29179a9) != null) ? jVarD : jVarD.z(e1.a());
    }

    public static final zc.j k(zc.j jVar, zc.j jVar2) {
        return !h(jVar2) ? jVar.z(jVar2) : d(jVar, jVar2, false);
    }

    public static final a3<?> l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof a1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof a3) {
                return (a3) eVar;
            }
        }
        return null;
    }

    public static final a3<?> m(zc.f<?> fVar, zc.j jVar, Object obj) {
        if (!(fVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(jVar.e(b3.f26722a) != null)) {
            return null;
        }
        a3<?> a3VarL = l((kotlin.coroutines.jvm.internal.e) fVar);
        if (a3VarL != null) {
            a3VarL.Z0(jVar, obj);
        }
        return a3VarL;
    }
}
