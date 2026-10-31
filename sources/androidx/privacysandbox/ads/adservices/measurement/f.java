package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.k;
import com.vungle.ads.internal.protos.Sdk;
import id.p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import ud.o0;
import ud.p0;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MeasurementManager f3005b;

    /* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3006h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f3007i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ g f3008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ f f3009k;

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MeasurementManagerImplCommon.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1", f = "MeasurementManagerImplCommon.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
        static final class C0059a extends l implements p<o0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f3010h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f3011i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f3012j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f3013k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ f f3014l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Uri f3015m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ g f3016n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0059a(f fVar, Uri uri, g gVar, zc.f<? super C0059a> fVar2) {
                super(2, fVar2);
                this.f3014l = fVar;
                this.f3015m = uri;
                this.f3016n = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return new C0059a(this.f3014l, this.f3015m, this.f3016n, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
                return ((C0059a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f3013k;
                if (i10 == 0) {
                    s.b(obj);
                    f fVar = this.f3014l;
                    Uri uri = this.f3015m;
                    g gVar = this.f3016n;
                    this.f3010h = fVar;
                    this.f3011i = uri;
                    this.f3012j = gVar;
                    this.f3013k = 1;
                    ud.p pVar = new ud.p(ad.c.c(this), 1);
                    pVar.G();
                    fVar.i().registerSource(uri, gVar.a(), new e(), k.a(pVar));
                    Object objZ = pVar.z();
                    if (objZ == ad.d.f()) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (objZ == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, f fVar, zc.f<? super a> fVar2) {
            super(2, fVar2);
            this.f3008j = gVar;
            this.f3009k = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f3008j, this.f3009k, fVar);
            aVar.f3007i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f3006h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            o0 o0Var = (o0) this.f3007i;
            List<Uri> listB = this.f3008j.b();
            f fVar = this.f3009k;
            g gVar = this.f3008j;
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                ud.k.d(o0Var, null, null, new C0059a(fVar, (Uri) it.next(), gVar, null), 3, null);
            }
            return g0.f27756a;
        }
    }

    public f(MeasurementManager mMeasurementManager) {
        t.f(mMeasurementManager, "mMeasurementManager");
        this.f3005b = mMeasurementManager;
    }

    static /* synthetic */ Object h(f fVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, zc.f<? super g0> fVar2) {
        new ud.p(ad.c.c(fVar2), 1).G();
        fVar.i();
        throw null;
    }

    static /* synthetic */ Object j(f fVar, zc.f<? super Integer> fVar2) {
        ud.p pVar = new ud.p(ad.c.c(fVar2), 1);
        pVar.G();
        fVar.i().getMeasurementApiStatus(new e(), k.a(pVar));
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar2);
        }
        return objZ;
    }

    static /* synthetic */ Object k(f fVar, Uri uri, InputEvent inputEvent, zc.f<? super g0> fVar2) {
        ud.p pVar = new ud.p(ad.c.c(fVar2), 1);
        pVar.G();
        fVar.i().registerSource(uri, inputEvent, new e(), k.a(pVar));
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar2);
        }
        return objZ == ad.d.f() ? objZ : g0.f27756a;
    }

    static /* synthetic */ Object l(f fVar, g gVar, zc.f<? super g0> fVar2) {
        Object objD = p0.d(new a(gVar, fVar, null), fVar2);
        return objD == ad.d.f() ? objD : g0.f27756a;
    }

    static /* synthetic */ Object m(f fVar, Uri uri, zc.f<? super g0> fVar2) {
        ud.p pVar = new ud.p(ad.c.c(fVar2), 1);
        pVar.G();
        fVar.i().registerTrigger(uri, new e(), k.a(pVar));
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar2);
        }
        return objZ == ad.d.f() ? objZ : g0.f27756a;
    }

    static /* synthetic */ Object n(f fVar, h hVar, zc.f<? super g0> fVar2) {
        new ud.p(ad.c.c(fVar2), 1).G();
        fVar.i();
        throw null;
    }

    static /* synthetic */ Object o(f fVar, i iVar, zc.f<? super g0> fVar2) {
        new ud.p(ad.c.c(fVar2), 1).G();
        fVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, zc.f<? super g0> fVar) {
        return h(this, aVar, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(zc.f<? super Integer> fVar) {
        return j(this, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, zc.f<? super g0> fVar) {
        return k(this, uri, inputEvent, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(g gVar, zc.f<? super g0> fVar) {
        return l(this, gVar, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, zc.f<? super g0> fVar) {
        return m(this, uri, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(h hVar, zc.f<? super g0> fVar) {
        return n(this, hVar, fVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(i iVar, zc.f<? super g0> fVar) {
        return o(this, iVar, fVar);
    }

    protected final MeasurementManager i() {
        return this.f3005b;
    }
}
