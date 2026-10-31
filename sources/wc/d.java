package wc;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes5.dex */
final class d<T, R> extends c<T, R> implements zc.f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private id.q<? super c<?, ?>, Object, ? super zc.f<Object>, ? extends Object> f27746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f27747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zc.f<Object> f27748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f27749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(id.q<? super c<T, R>, ? super T, ? super zc.f<? super R>, ? extends Object> block, T t10) {
        super(null);
        kotlin.jvm.internal.t.f(block, "block");
        this.f27746a = block;
        this.f27747b = t10;
        kotlin.jvm.internal.t.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f27748c = this;
        this.f27749d = b.f27740a;
    }

    @Override // wc.c
    public Object a(T t10, zc.f<? super R> fVar) {
        kotlin.jvm.internal.t.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f27748c = fVar;
        this.f27747b = t10;
        Object objF = ad.d.f();
        if (objF == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF;
    }

    public final R b() throws Throwable {
        while (true) {
            R r10 = (R) this.f27749d;
            zc.f<Object> fVar = this.f27748c;
            if (fVar == null) {
                s.b(r10);
                return r10;
            }
            if (r.f(b.f27740a, r10)) {
                try {
                    id.q<? super c<?, ?>, Object, ? super zc.f<Object>, ? extends Object> qVar = this.f27746a;
                    Object obj = this.f27747b;
                    Object objE = !(qVar instanceof kotlin.coroutines.jvm.internal.a) ? ad.c.e(qVar, this, obj, fVar) : ((id.q) m0.d(qVar, 3)).invoke(this, obj, fVar);
                    if (objE != ad.d.f()) {
                        fVar.resumeWith(r.c(objE));
                    }
                } catch (Throwable th) {
                    r.a aVar = r.f27774b;
                    fVar.resumeWith(r.c(s.a(th)));
                }
            } else {
                this.f27749d = b.f27740a;
                fVar.resumeWith(r10);
            }
        }
    }

    @Override // zc.f
    public zc.j getContext() {
        return zc.k.f29181a;
    }

    @Override // zc.f
    public void resumeWith(Object obj) {
        this.f27748c = null;
        this.f27749d = obj;
    }
}
