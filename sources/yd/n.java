package yd;

import rd.v;
import ud.d2;
import wc.g0;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n<T> extends kotlin.coroutines.jvm.internal.d implements xd.d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xd.d<T> f28898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zc.j f28899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private zc.j f28901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private zc.f<? super g0> f28902l;

    /* JADX WARN: Multi-variable type inference failed */
    public n(xd.d<? super T> dVar, zc.j jVar) {
        super(k.f28893a, zc.k.f29181a);
        this.f28898h = dVar;
        this.f28899i = jVar;
        this.f28900j = ((Number) jVar.U(0, new id.p() { // from class: yd.m
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(n.o(((Integer) obj).intValue(), (zc.j.b) obj2));
            }
        })).intValue();
    }

    private final void h(zc.j jVar, zc.j jVar2, T t10) {
        if (jVar2 instanceof h) {
            s((h) jVar2, t10);
        }
        q.b(this, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10, zc.j.b bVar) {
        return i10 + 1;
    }

    private final Object p(zc.f<? super g0> fVar, T t10) {
        zc.j context = fVar.getContext();
        d2.i(context);
        zc.j jVar = this.f28901k;
        if (jVar != context) {
            h(context, jVar, t10);
            this.f28901k = context;
        }
        this.f28902l = fVar;
        id.q qVar = o.f28903a;
        xd.d<T> dVar = this.f28898h;
        kotlin.jvm.internal.t.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.t.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(dVar, t10, this);
        if (!kotlin.jvm.internal.t.a(objInvoke, ad.d.f())) {
            this.f28902l = null;
        }
        return objInvoke;
    }

    private final void s(h hVar, Object obj) {
        throw new IllegalStateException(v.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + hVar.f28892b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // xd.d
    public Object b(T t10, zc.f<? super g0> fVar) {
        try {
            Object objP = p(fVar, t10);
            if (objP == ad.d.f()) {
                kotlin.coroutines.jvm.internal.h.c(fVar);
            }
            return objP == ad.d.f() ? objP : g0.f27756a;
        } catch (Throwable th) {
            this.f28901k = new h(th, fVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zc.f<? super g0> fVar = this.f28902l;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, zc.f
    public zc.j getContext() {
        zc.j jVar = this.f28901k;
        return jVar == null ? zc.k.f29181a : jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thG = wc.r.g(obj);
        if (thG != null) {
            this.f28901k = new h(thG, getContext());
        }
        zc.f<? super g0> fVar = this.f28902l;
        if (fVar != null) {
            fVar.resumeWith(obj);
        }
        return ad.d.f();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
