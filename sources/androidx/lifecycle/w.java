package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0.a.b<w0.d> f2941a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0.a.b<g0> f2942b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.a.b<Bundle> f2943c = new a();

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class a implements m0.a.b<Bundle> {
        a() {
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class b implements m0.a.b<w0.d> {
        b() {
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    public static final class c implements m0.a.b<g0> {
        c() {
        }
    }

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    static final class d extends kotlin.jvm.internal.u implements id.l<m0.a, y> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f2944d = new d();

        d() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y invoke(m0.a initializer) {
            kotlin.jvm.internal.t.f(initializer, "$this$initializer");
            return new y();
        }
    }

    public static final v a(m0.a aVar) {
        kotlin.jvm.internal.t.f(aVar, "<this>");
        w0.d dVar = (w0.d) aVar.a(f2941a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        g0 g0Var = (g0) aVar.a(f2942b);
        if (g0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f2943c);
        String str = (String) aVar.a(d0.c.f2906d);
        if (str != null) {
            return b(dVar, g0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final v b(w0.d dVar, g0 g0Var, String str, Bundle bundle) {
        x xVarC = c(dVar);
        y yVarD = d(g0Var);
        v vVar = yVarD.f().get(str);
        if (vVar != null) {
            return vVar;
        }
        v vVarA = v.f2934f.a(xVarC.b(str), bundle);
        yVarD.f().put(str, vVarA);
        return vVarA;
    }

    public static final x c(w0.d dVar) {
        kotlin.jvm.internal.t.f(dVar, "<this>");
        androidx.savedstate.a.c cVarC = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        x xVar = cVarC instanceof x ? (x) cVarC : null;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final y d(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<this>");
        m0.c cVar = new m0.c();
        cVar.a(kotlin.jvm.internal.i0.b(y.class), d.f2944d);
        return (y) new d0(g0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", y.class);
    }
}
