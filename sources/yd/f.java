package yd;

import ud.i0;
import wc.g0;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f<S, T> extends d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final xd.c<S> f28887d;

    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<xd.d<? super T>, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28888h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f28889i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f<S, T> f28890j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<S, T> fVar, zc.f<? super a> fVar2) {
            super(2, fVar2);
            this.f28890j = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f28890j, fVar);
            aVar.f28889i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xd.d<? super T> dVar, zc.f<? super g0> fVar) {
            return ((a) create(dVar, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28888h;
            if (i10 == 0) {
                wc.s.b(obj);
                xd.d<? super T> dVar = (xd.d) this.f28889i;
                f<S, T> fVar = this.f28890j;
                this.f28888h = 1;
                if (fVar.n(dVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(xd.c<? extends S> cVar, zc.j jVar, int i10, wd.a aVar) {
        super(jVar, i10, aVar);
        this.f28887d = cVar;
    }

    static /* synthetic */ <S, T> Object k(f<S, T> fVar, xd.d<? super T> dVar, zc.f<? super g0> fVar2) {
        if (fVar.f28878b == -3) {
            zc.j context = fVar2.getContext();
            zc.j jVarK = i0.k(context, fVar.f28877a);
            if (kotlin.jvm.internal.t.a(jVarK, context)) {
                Object objN = fVar.n(dVar, fVar2);
                return objN == ad.d.f() ? objN : g0.f27756a;
            }
            zc.g.b bVar = zc.g.f29179a9;
            if (kotlin.jvm.internal.t.a(jVarK.e(bVar), context.e(bVar))) {
                Object objM = fVar.m(dVar, jVarK, fVar2);
                return objM == ad.d.f() ? objM : g0.f27756a;
            }
        }
        Object objA = super.a(dVar, fVar2);
        return objA == ad.d.f() ? objA : g0.f27756a;
    }

    static /* synthetic */ <S, T> Object l(f<S, T> fVar, wd.s<? super T> sVar, zc.f<? super g0> fVar2) {
        Object objN = fVar.n(new r(sVar), fVar2);
        return objN == ad.d.f() ? objN : g0.f27756a;
    }

    private final Object m(xd.d<? super T> dVar, zc.j jVar, zc.f<? super g0> fVar) {
        return e.c(jVar, e.d(dVar, fVar.getContext()), null, new a(this, null), fVar, 4, null);
    }

    @Override // yd.d, xd.c
    public Object a(xd.d<? super T> dVar, zc.f<? super g0> fVar) {
        return k(this, dVar, fVar);
    }

    @Override // yd.d
    protected Object f(wd.s<? super T> sVar, zc.f<? super g0> fVar) {
        return l(this, sVar, fVar);
    }

    protected abstract Object n(xd.d<? super T> dVar, zc.f<? super g0> fVar);

    @Override // yd.d
    public String toString() {
        return this.f28887d + " -> " + super.toString();
    }
}
