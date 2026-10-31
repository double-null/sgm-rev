package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.t;
import ud.p;
import wc.s;

/* JADX INFO: compiled from: TopicsManagerImplCommon.kt */
/* JADX INFO: loaded from: classes.dex */
public class m extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.d f3036b;

    /* JADX INFO: compiled from: TopicsManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3037h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f3038i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3040k;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3038i = obj;
            this.f3040k |= Integer.MIN_VALUE;
            return m.e(m.this, null, this);
        }
    }

    public m(b.d mTopicsManager) {
        t.f(mTopicsManager, "mTopicsManager");
        this.f3036b = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object e(m mVar, b bVar, zc.f<? super d> fVar) throws Throwable {
        a aVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f3040k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3040k = i10 - Integer.MIN_VALUE;
            } else {
                aVar = mVar.new a(fVar);
            }
        } else {
            aVar = mVar.new a(fVar);
        }
        Object objF = aVar.f3038i;
        Object objF2 = ad.d.f();
        int i11 = aVar.f3040k;
        if (i11 == 0) {
            s.b(objF);
            mVar.c(bVar);
            aVar.f3037h = mVar;
            aVar.f3040k = 1;
            objF = mVar.f(null, aVar);
            if (objF == objF2) {
                return objF2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) aVar.f3037h;
            s.b(objF);
        }
        return mVar.d((b.b) objF);
    }

    private final Object f(b.a aVar, zc.f<? super b.b> fVar) {
        p pVar = new p(ad.c.c(fVar), 1);
        pVar.G();
        this.f3036b.b(aVar, new androidx.privacysandbox.ads.adservices.measurement.e(), androidx.core.os.k.a(pVar));
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.g
    public Object a(b bVar, zc.f<? super d> fVar) {
        return e(this, bVar, fVar);
    }

    public b.a c(b request) {
        t.f(request, "request");
        c.f3026a.b(request);
        return null;
    }

    public d d(b.b response) {
        t.f(response, "response");
        return e.f3029a.a(response);
    }
}
