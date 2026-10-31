package v6;

import android.content.Context;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.mraid.j0;
import io.bidmachine.iab.mraid.y;
import kotlin.jvm.internal.t;
import vb.k;
import wb.a0;

/* JADX INFO: compiled from: MraidFullScreenAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends vb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f27180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f27181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t7.a f27182c;

    public h(j0 mraidType) {
        t.f(mraidType, "mraidType");
        this.f27180a = mraidType;
    }

    private final void n() {
        try {
            y yVar = this.f27181b;
            if (yVar != null) {
                yVar.o();
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
        this.f27181b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h this$0, j mraidParams, Context applicationContext, vb.i callback, String creativeAdm) {
        t.f(this$0, "this$0");
        t.f(mraidParams, "$mraidParams");
        t.f(applicationContext, "$applicationContext");
        t.f(callback, "$callback");
        t.f(creativeAdm, "$creativeAdm");
        try {
            y yVarA = y.w().f(mraidParams.a()).n(mraidParams.f()).h(mraidParams.k()).b(mraidParams.m()).l(new i(applicationContext, callback, this$0.f27182c)).q(mraidParams.i()).r(mraidParams.j()).j(mraidParams.g()).o(mraidParams.l()).g(mraidParams.b()).i(mraidParams.c()).p(mraidParams.h()).c(this$0.f27182c).d(true).a(applicationContext);
            this$0.f27181b = yVarA;
            t.c(yVarA);
            yVarA.v(creativeAdm);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            callback.c(oc.a.l("Exception loading MRAID fullscreen object", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(h this$0) {
        t.f(this$0, "this$0");
        this$0.n();
    }

    @Override // vb.b
    public void d() {
        t7.a aVar = this.f27182c;
        if (aVar == null) {
            n();
        } else {
            aVar.i(new Runnable() { // from class: v6.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(this.f27174a);
                }
            });
            this.f27182c = null;
        }
    }

    @Override // vb.h
    public void k(ContextProvider contextProvider, vb.i callback, RendererConfiguration rendererConfiguration) throws Throwable {
        t.f(contextProvider, "contextProvider");
        t.f(callback, "callback");
        y yVar = this.f27181b;
        if (yVar == null) {
            callback.b(oc.a.i("MRAID fullscreen object is null"));
            return;
        }
        if (!yVar.s()) {
            callback.b(oc.a.i("MRAID fullscreen object is not ready"));
        } else if (yVar.u()) {
            callback.b(oc.a.i("MRAID fullscreen object is already was shown"));
        } else {
            yVar.y(contextProvider.getContext(), this.f27180a);
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, final vb.i callback, vb.j requestParams, k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        String strD;
        t.f(contextProvider, "contextProvider");
        t.f(callback, "callback");
        t.f(requestParams, "requestParams");
        t.f(unifiedMediationParams, "unifiedMediationParams");
        t.f(networkAdUnit, "networkAdUnit");
        final j jVar = new j(unifiedMediationParams);
        if (jVar.n(callback)) {
            if (jVar.d() == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            final Context applicationContext = contextProvider.getApplicationContext();
            t.e(applicationContext, "contextProvider.getApplicationContext()");
            if (jVar.e()) {
                t7.a aVar = new t7.a();
                this.f27182c = aVar;
                strD = aVar.d(jVar.d());
                t.e(strD, "{\n            val mraidO…ms.creativeAdm)\n        }");
            } else {
                strD = jVar.d();
            }
            final String str = strD;
            a0.c(new Runnable() { // from class: v6.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.p(this.f27175a, jVar, applicationContext, callback, str);
                }
            });
        }
    }
}
