package zd;

import ud.u2;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f29213a = new e0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final id.p<Object, zc.j.b, Object> f29214b = new id.p() { // from class: zd.i0
        @Override // id.p
        public final Object invoke(Object obj, Object obj2) {
            return l0.d(obj, (zc.j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final id.p<u2<?>, zc.j.b, u2<?>> f29215c = new id.p() { // from class: zd.j0
        @Override // id.p
        public final Object invoke(Object obj, Object obj2) {
            return l0.e((u2) obj, (zc.j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final id.p<p0, zc.j.b, p0> f29216d = new id.p() { // from class: zd.k0
        @Override // id.p
        public final Object invoke(Object obj, Object obj2) {
            return l0.h((p0) obj, (zc.j.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, zc.j.b bVar) {
        if (!(bVar instanceof u2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u2<?> e(u2<?> u2Var, zc.j.b bVar) {
        if (u2Var != null) {
            return u2Var;
        }
        if (bVar instanceof u2) {
            return (u2) bVar;
        }
        return null;
    }

    public static final void f(zc.j jVar, Object obj) {
        if (obj == f29213a) {
            return;
        }
        if (obj instanceof p0) {
            ((p0) obj).b(jVar);
            return;
        }
        Object objU = jVar.U(null, f29215c);
        kotlin.jvm.internal.t.d(objU, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((u2) objU).I(jVar, obj);
    }

    public static final Object g(zc.j jVar) {
        Object objU = jVar.U(0, f29214b);
        kotlin.jvm.internal.t.c(objU);
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 h(p0 p0Var, zc.j.b bVar) {
        if (bVar instanceof u2) {
            u2<?> u2Var = (u2) bVar;
            p0Var.a(u2Var, u2Var.e0(p0Var.f29223a));
        }
        return p0Var;
    }

    public static final Object i(zc.j jVar, Object obj) {
        if (obj == null) {
            obj = g(jVar);
        }
        if (obj == 0) {
            return f29213a;
        }
        if (obj instanceof Integer) {
            return jVar.U(new p0(jVar, ((Number) obj).intValue()), f29216d);
        }
        kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((u2) obj).e0(jVar);
    }
}
