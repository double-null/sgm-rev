package v6;

import android.content.Context;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.mraid.m0;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import vb.k;
import wb.a0;

/* JADX INFO: compiled from: MraidBannerAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends vb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f27168a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m0 f27169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t7.a f27170c;

    private final void m() {
        try {
            m0 m0Var = this.f27169b;
            if (m0Var != null) {
                m0Var.X();
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
        this.f27169b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(j mraidParams, vb.f callback, d this$0, Context applicationContext, String creativeAdm) {
        t.f(mraidParams, "$mraidParams");
        t.f(callback, "$callback");
        t.f(this$0, "this$0");
        t.f(applicationContext, "$applicationContext");
        t.f(creativeAdm, "$creativeAdm");
        try {
            m0 m0VarC = new m0.a().x(mraidParams.a()).F(mraidParams.f()).D(new e(callback)).u(this$0.f27170c).c(applicationContext);
            this$0.f27169b = m0VarC;
            m0VarC.p0(creativeAdm);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            callback.c(oc.a.l("Exception loading MRAID banner object", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d this$0) {
        t.f(this$0, "this$0");
        this$0.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(d this$0, boolean z10) {
        t.f(this$0, "this$0");
        try {
            m0 m0Var = this$0.f27169b;
            if (m0Var != null) {
                m0Var.t0(z10);
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    @Override // vb.b
    public void d() {
        t7.a aVar = this.f27170c;
        if (aVar == null) {
            m();
        } else {
            aVar.i(new Runnable() { // from class: v6.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.p(this.f27162a);
                }
            });
            this.f27170c = null;
        }
    }

    @Override // vb.b
    public void g() {
        super.g();
        t7.a aVar = this.f27170c;
        if (aVar != null) {
            aVar.B();
        }
    }

    @Override // vb.b
    public void h(final boolean z10) {
        a0.c(new Runnable() { // from class: v6.a
            @Override // java.lang.Runnable
            public final void run() {
                d.q(this.f27160a, z10);
            }
        });
    }

    @Override // vb.p
    public void i(RendererConfiguration rendererConfiguration) throws Throwable {
        m0 m0Var;
        super.i(rendererConfiguration);
        if (this.f27168a.compareAndSet(false, true) && (m0Var = this.f27169b) != null) {
            m0Var.w0(null);
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, final vb.f callback, vb.g requestParams, k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        String strD;
        t.f(contextProvider, "contextProvider");
        t.f(callback, "callback");
        t.f(requestParams, "requestParams");
        t.f(unifiedMediationParams, "unifiedMediationParams");
        t.f(networkAdUnit, "networkAdUnit");
        final j jVar = new j(unifiedMediationParams);
        if (jVar.n(callback)) {
            if (jVar.d() == null) {
                throw new IllegalStateException(KBBdKxoAiHo.JmJpX.toString());
            }
            callback.setVisibilitySource(jVar.a() == c7.a.FullLoad ? io.bidmachine.core.j.BidMachine : io.bidmachine.core.j.All);
            final Context applicationContext = contextProvider.getApplicationContext();
            t.e(applicationContext, "contextProvider.getApplicationContext()");
            if (jVar.e()) {
                t7.a aVar = new t7.a(true);
                this.f27170c = aVar;
                strD = aVar.d(jVar.d());
                t.e(strD, "{\n            val mraidO…ms.creativeAdm)\n        }");
            } else {
                strD = jVar.d();
            }
            final String str = strD;
            a0.c(new Runnable() { // from class: v6.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.o(jVar, callback, this, applicationContext, str);
                }
            });
        }
    }
}
