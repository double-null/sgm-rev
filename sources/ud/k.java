package ud;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k {
    public static final <T> v0<T> a(o0 o0Var, zc.j jVar, q0 q0Var, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar) {
        zc.j jVarJ = i0.j(o0Var, jVar);
        w0 i2Var = q0Var.e() ? new i2(jVarJ, pVar) : new w0(jVarJ, true);
        ((a) i2Var).X0(q0Var, i2Var, pVar);
        return (v0<T>) i2Var;
    }

    public static /* synthetic */ v0 b(o0 o0Var, zc.j jVar, q0 q0Var, id.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = zc.k.f29181a;
        }
        if ((i10 & 2) != 0) {
            q0Var = q0.DEFAULT;
        }
        return i.a(o0Var, jVar, q0Var, pVar);
    }

    public static final b2 c(o0 o0Var, zc.j jVar, q0 q0Var, id.p<? super o0, ? super zc.f<? super wc.g0>, ? extends Object> pVar) {
        zc.j jVarJ = i0.j(o0Var, jVar);
        a j2Var = q0Var.e() ? new j2(jVarJ, pVar) : new r2(jVarJ, true);
        j2Var.X0(q0Var, j2Var, pVar);
        return j2Var;
    }

    public static /* synthetic */ b2 d(o0 o0Var, zc.j jVar, q0 q0Var, id.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = zc.k.f29181a;
        }
        if ((i10 & 2) != 0) {
            q0Var = q0.DEFAULT;
        }
        return i.c(o0Var, jVar, q0Var, pVar);
    }

    public static final <T> Object e(zc.j jVar, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) {
        Object objY0;
        zc.j context = fVar.getContext();
        zc.j jVarK = i0.k(context, jVar);
        d2.i(jVarK);
        if (jVarK == context) {
            zd.a0 a0Var = new zd.a0(jVarK, fVar);
            objY0 = ae.b.b(a0Var, a0Var, pVar);
        } else {
            zc.g.b bVar = zc.g.f29179a9;
            if (kotlin.jvm.internal.t.a(jVarK.e(bVar), context.e(bVar))) {
                a3 a3Var = new a3(jVarK, fVar);
                zc.j context2 = a3Var.getContext();
                Object objI = zd.l0.i(context2, null);
                try {
                    Object objB = ae.b.b(a3Var, a3Var, pVar);
                    zd.l0.f(context2, objI);
                    objY0 = objB;
                } catch (Throwable th) {
                    zd.l0.f(context2, objI);
                    throw th;
                }
            } else {
                a1 a1Var = new a1(jVarK, fVar);
                ae.a.b(pVar, a1Var, a1Var);
                objY0 = a1Var.Y0();
            }
        }
        if (objY0 == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objY0;
    }
}
