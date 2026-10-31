package xd;

import com.vungle.ads.internal.protos.Sdk;
import wc.g0;

/* JADX INFO: compiled from: Flow.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> implements c<T> {

    /* JADX INFO: renamed from: xd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Flow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "collect")
    static final class C0479a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28475h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f28476i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a<T> f28477j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f28478k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0479a(a<T> aVar, zc.f<? super C0479a> fVar) {
            super(fVar);
            this.f28477j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28476i = obj;
            this.f28478k |= Integer.MIN_VALUE;
            return this.f28477j.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // xd.c
    public final Object a(d<? super T> dVar, zc.f<? super g0> fVar) throws Throwable {
        C0479a c0479a;
        Throwable th;
        yd.n nVar;
        if (fVar instanceof C0479a) {
            c0479a = (C0479a) fVar;
            int i10 = c0479a.f28478k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0479a.f28478k = i10 - Integer.MIN_VALUE;
            } else {
                c0479a = new C0479a(this, fVar);
            }
        } else {
            c0479a = new C0479a(this, fVar);
        }
        Object obj = c0479a.f28476i;
        Object objF = ad.d.f();
        int i11 = c0479a.f28478k;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (yd.n) c0479a.f28475h;
            try {
                wc.s.b(obj);
                nVar.releaseIntercepted();
                return g0.f27756a;
            } catch (Throwable th2) {
                th = th2;
                nVar.releaseIntercepted();
                throw th;
            }
        }
        wc.s.b(obj);
        yd.n nVar2 = new yd.n(dVar, c0479a.getContext());
        try {
            c0479a.f28475h = nVar2;
            c0479a.f28478k = 1;
            if (b(nVar2, c0479a) == objF) {
                return objF;
            }
            nVar = nVar2;
            nVar.releaseIntercepted();
            return g0.f27756a;
        } catch (Throwable th3) {
            th = th3;
            nVar = nVar2;
            nVar.releaseIntercepted();
            throw th;
        }
    }

    public abstract Object b(d<? super T> dVar, zc.f<? super g0> fVar);
}
