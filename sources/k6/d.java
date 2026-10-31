package k6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* JADX INFO: compiled from: AdaptiveRenderingFullscreenAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends vb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private na.n f21237a;

    @Override // vb.b
    public void d() {
        na.n nVar = this.f21237a;
        if (nVar != null) {
            nVar.N();
        }
        this.f21237a = null;
    }

    @Override // vb.h
    public void k(ContextProvider contextProvider, vb.i callback, RendererConfiguration rendererConfiguration) throws Throwable {
        kotlin.jvm.internal.t.f(contextProvider, "contextProvider");
        kotlin.jvm.internal.t.f(callback, "callback");
        na.n nVar = this.f21237a;
        if (nVar == null) {
            callback.b(oc.a.i("AdaptiveRendering fullscreen object is null"));
            return;
        }
        if (!nVar.X()) {
            callback.b(oc.a.i("AdaptiveRendering fullscreen object not loaded"));
            return;
        }
        if (nVar.W()) {
            callback.b(oc.a.i("AdaptiveRendering fullscreen object already is finished"));
            return;
        }
        if (rendererConfiguration != null) {
            Context applicationContext = contextProvider.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "contextProvider.applicationContext");
            Drawable watermarkDrawable = rendererConfiguration.getWatermarkDrawable(applicationContext);
            if (watermarkDrawable != null) {
                nVar.c0(watermarkDrawable);
            }
        }
        Context applicationContext2 = contextProvider.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext2, "contextProvider.getApplicationContext()");
        nVar.d0(applicationContext2);
    }

    @Override // vb.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.i callback, vb.j requestParams, vb.k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        kotlin.jvm.internal.t.f(contextProvider, "contextProvider");
        kotlin.jvm.internal.t.f(callback, "callback");
        kotlin.jvm.internal.t.f(requestParams, "requestParams");
        kotlin.jvm.internal.t.f(unifiedMediationParams, "unifiedMediationParams");
        kotlin.jvm.internal.t.f(networkAdUnit, "networkAdUnit");
        Context applicationContext = contextProvider.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "contextProvider.getApplicationContext()");
        b0 b0Var = new b0(unifiedMediationParams);
        if (b0Var.i0(callback)) {
            if (b0Var.h0() == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            na.n nVar = new na.n(applicationContext, b0Var.h0());
            nVar.b0(new e(applicationContext, callback));
            this.f21237a = nVar;
            nVar.Y();
        }
    }
}
