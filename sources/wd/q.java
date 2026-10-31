package wd;

import com.vungle.ads.internal.protos.Sdk;
import ud.b2;
import ud.i0;
import ud.o0;
import ud.q0;
import wc.g0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: compiled from: Produce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE}, m = "awaitClose")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f27858h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f27859i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f27860j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f27861k;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27860j = obj;
            this.f27861k |= Integer.MIN_VALUE;
            return q.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Produce.kt */
    static final class b implements id.l<Throwable, g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ud.n<g0> f27862a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ud.n<? super g0> nVar) {
            this.f27862a = nVar;
        }

        public final void a(Throwable th) {
            ud.n<g0> nVar = this.f27862a;
            wc.r.a aVar = wc.r.f27774b;
            nVar.resumeWith(wc.r.c(g0.f27756a));
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th) {
            a(th);
            return g0.f27756a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(s<?> sVar, id.a<g0> aVar, zc.f<? super g0> fVar) throws Throwable {
        a aVar2;
        if (fVar instanceof a) {
            aVar2 = (a) fVar;
            int i10 = aVar2.f27861k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f27861k = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(fVar);
            }
        } else {
            aVar2 = new a(fVar);
        }
        Object obj = aVar2.f27860j;
        Object objF = ad.d.f();
        int i11 = aVar2.f27861k;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                if (!(aVar2.getContext().e(b2.X8) == sVar)) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                aVar2.f27858h = sVar;
                aVar2.f27859i = aVar;
                aVar2.f27861k = 1;
                ud.p pVar = new ud.p(ad.c.c(aVar2), 1);
                pVar.G();
                sVar.d(new b(pVar));
                Object objZ = pVar.z();
                if (objZ == ad.d.f()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar2);
                }
                if (objZ == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (id.a) aVar2.f27859i;
                wc.s.b(obj);
            }
            aVar.invoke();
            return g0.f27756a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }

    public static final <E> u<E> b(o0 o0Var, zc.j jVar, int i10, wd.a aVar, q0 q0Var, id.l<? super Throwable, g0> lVar, id.p<? super s<? super E>, ? super zc.f<? super g0>, ? extends Object> pVar) {
        r rVar = new r(i0.j(o0Var, jVar), j.b(i10, aVar, null, 4, null));
        if (lVar != null) {
            rVar.s(lVar);
        }
        rVar.X0(q0Var, rVar, pVar);
        return rVar;
    }

    public static /* synthetic */ u c(o0 o0Var, zc.j jVar, int i10, wd.a aVar, q0 q0Var, id.l lVar, id.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = zc.k.f29181a;
        }
        zc.j jVar2 = jVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            aVar = wd.a.SUSPEND;
        }
        wd.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            q0Var = q0.DEFAULT;
        }
        q0 q0Var2 = q0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(o0Var, jVar2, i12, aVar2, q0Var2, lVar, pVar);
    }
}
