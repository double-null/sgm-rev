package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ga.b;
import io.bidmachine.AdRequest;
import java.util.Map;
import vb.b;
import vb.c;
import vb.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdObjectImpl<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectParamsType extends ga.b, UnifiedAdType extends vb.b<UnifiedAdCallbackType, UnifiedAdRequestParamsType>, UnifiedAdCallbackType extends vb.c, UnifiedAdRequestParamsType extends vb.d> implements ga.a<AdObjectParamsType, UnifiedAdRequestParamsType, UnifiedAdCallbackType> {
    private final AdObjectParamsType adObjectParams;
    private final AdProcessCallback adProcessCallback;
    private final AdRequestType adRequest;
    private final ContextProvider contextProvider;
    private final UnifiedAdType unifiedAd;
    private final UnifiedAdCallbackType unifiedAdCallback;
    private final ic.a viewabilityHandler;

    public AdObjectImpl(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, AdObjectParamsType adobjectparamstype, UnifiedAdType unifiedadtype) {
        this.contextProvider = contextProvider;
        this.adProcessCallback = adProcessCallback;
        this.adRequest = adrequesttype;
        this.adObjectParams = adobjectparamstype;
        this.unifiedAd = unifiedadtype;
        this.unifiedAdCallback = (UnifiedAdCallbackType) createUnifiedCallback(adProcessCallback);
        this.viewabilityHandler = new ic.a(adobjectparamstype.f15544a, nc.a.f22962d.c(), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$startViewabilityTracker$0(AdResponse adResponse) {
        return String.format("Can't start viewability tracker! Check ad settings! (%s)", adResponse);
    }

    public abstract /* synthetic */ UnifiedAdCallbackType createUnifiedCallback(AdProcessCallback adProcessCallback);

    public Activity getActivity() {
        return this.contextProvider.getActivity();
    }

    public AdProcessCallback getAdProcessCallback() {
        return this.adProcessCallback;
    }

    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    public Context getApplicationContext() {
        return this.contextProvider.getApplicationContext();
    }

    @Override // ga.a
    public Map<String, Object> getCustomParams() {
        return getUnifiedAd().a();
    }

    @Override // ga.a
    public AdObjectParamsType getParams() {
        return this.adObjectParams;
    }

    public UnifiedAdType getUnifiedAd() {
        return this.unifiedAd;
    }

    public UnifiedAdCallbackType getUnifiedAdCallback() {
        return this.unifiedAdCallback;
    }

    @Override // ga.a
    public void load(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit) throws Throwable {
        this.unifiedAd.b(contextProvider, this.unifiedAdCallback, unifiedadrequestparamstype, this.adObjectParams.d(), networkAdUnit);
    }

    @Override // ga.a
    public Boolean onClicked() {
        getUnifiedAd().c();
        return null;
    }

    @Override // ga.a
    public void onClosed(boolean z10) {
        vb.b unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof vb.h) {
            ((vb.h) unifiedAd).i(z10);
        }
    }

    @Override // ga.a
    public void onDestroy() {
        getUnifiedAd().d();
        this.viewabilityHandler.a();
    }

    @Override // ga.a
    public void onExpired() {
        getUnifiedAd().e();
    }

    @Override // ga.a
    public void onFinished() {
        vb.b unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof vb.h) {
            ((vb.h) unifiedAd).j();
        }
    }

    @Override // ga.a
    public void onShowFailed() {
        getUnifiedAd().f();
    }

    @Override // ga.a
    public void onShown() {
        getUnifiedAd().g();
    }

    public void startViewabilityTracker(View view) {
        final AdResponse adResponse = getAdRequest().getAdResponse();
        io.bidmachine.core.j visibilitySource = adResponse != null ? adResponse.getVisibilitySource() : null;
        if (visibilitySource == io.bidmachine.core.j.BidMachine || visibilitySource == io.bidmachine.core.j.All) {
            this.viewabilityHandler.j(view);
            if (this.adObjectParams.f15544a == null) {
                io.bidmachine.core.a.e(this.adRequest.getAdsType(), new qc.b() { // from class: io.bidmachine.b
                    @Override // qc.b
                    public final Object get() {
                        return AdObjectImpl.lambda$startViewabilityTracker$0(adResponse);
                    }
                });
            }
        }
    }

    public void stopViewabilityTracker() {
        this.viewabilityHandler.k();
    }

    final class a implements ic.b {
        a() {
        }

        @Override // ic.b
        public void a(boolean z10) {
            AdObjectImpl.this.getUnifiedAd().h(z10);
        }

        @Override // ic.b
        public void b(mc.a aVar) {
            AdObjectImpl.this.getAdProcessCallback().onVisibilityTrackerViewabilityEvent(aVar, null);
        }

        @Override // ic.b
        public void c(mc.a aVar, wb.h hVar) {
            AdObjectImpl.this.getAdProcessCallback().onVisibilityTrackerViewabilityEvent(aVar, new oc.a(108, hVar.a()));
        }

        @Override // ic.b
        public void d() {
        }
    }

    @Override // ga.a
    public void hide() {
    }
}
