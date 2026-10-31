package k6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* JADX INFO: compiled from: AdaptiveRenderingBannerAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends vb.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private oa.s f21233a;

    @Override // vb.b
    public void d() {
        oa.s sVar = this.f21233a;
        if (sVar != null) {
            sVar.z0();
        }
        this.f21233a = null;
    }

    @Override // vb.p
    public void i(RendererConfiguration rendererConfiguration) throws Throwable {
        super.i(rendererConfiguration);
        oa.s sVar = this.f21233a;
        if (sVar == null || rendererConfiguration == null) {
            return;
        }
        Context context = sVar.getContext();
        kotlin.jvm.internal.t.e(context, "adView.context");
        Drawable watermarkDrawable = rendererConfiguration.getWatermarkDrawable(context);
        if (watermarkDrawable != null) {
            sVar.setWatermark(watermarkDrawable);
        }
    }

    @Override // vb.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(ContextProvider contextProvider, vb.f callback, vb.g requestParams, vb.k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        kotlin.jvm.internal.t.f(contextProvider, edUJlCZxhVnO.IOxKeu);
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
            oa.s sVar = new oa.s(applicationContext, b0Var.h0());
            sVar.setAdViewListener(new c(callback));
            this.f21233a = sVar;
            sVar.Q0();
        }
    }
}
