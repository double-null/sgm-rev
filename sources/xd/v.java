package xd;

import wc.g0;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<T> f28568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.p<d<? super T>, zc.f<? super g0>, Object> f28569b;

    /* JADX INFO: compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {418, 422}, m = "onSubscription")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28570h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28571i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f28572j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ v<T> f28573k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f28574l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v<T> vVar, zc.f<? super a> fVar) {
            super(fVar);
            this.f28573k = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28572j = obj;
            this.f28574l |= Integer.MIN_VALUE;
            return this.f28573k.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [yd.n] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final Object a(zc.f<? super g0> fVar) throws Throwable {
        a aVar;
        yd.n nVar;
        v<T> vVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f28574l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28574l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, fVar);
            }
        } else {
            aVar = new a(this, fVar);
        }
        Object obj = aVar.f28572j;
        Object objF = ad.d.f();
        ?? r10 = aVar.f28574l;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    nVar = (yd.n) aVar.f28571i;
                    vVar = (v) aVar.f28570h;
                    wc.s.b(obj);
                } else {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return g0.f27756a;
            }
            wc.s.b(obj);
            nVar = new yd.n(this.f28568a, aVar.getContext());
            id.p<d<? super T>, zc.f<? super g0>, Object> pVar = this.f28569b;
            aVar.f28570h = this;
            aVar.f28571i = nVar;
            aVar.f28574l = 1;
            if (pVar.invoke(nVar, aVar) == objF) {
                return objF;
            }
            vVar = this;
            nVar.releaseIntercepted();
            d<T> dVar = vVar.f28568a;
            r10 = dVar instanceof v;
            if (r10 == 0) {
                return g0.f27756a;
            }
            aVar.f28570h = null;
            aVar.f28571i = null;
            aVar.f28574l = 2;
            if (((v) dVar).a(aVar) == objF) {
                return objF;
            }
            return g0.f27756a;
        } catch (Throwable th) {
            r10.releaseIntercepted();
            throw th;
        }
    }

    @Override // xd.d
    public Object b(T t10, zc.f<? super g0> fVar) {
        return this.f28568a.b(t10, fVar);
    }
}
