package io.bidmachine;

import android.content.Context;
import ga.a;
import ga.b;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.IAd;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.dW.xjwcmjDeOXR;
import vb.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BidMachineAd<SelfType extends IAd, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ga.a<AdObjectParamsType, UnifiedAdRequestParamsType, ?>, AdObjectParamsType extends ga.b, UnifiedAdRequestParamsType extends vb.d, AdListenerType extends AdListener<SelfType>> implements IAd<SelfType, AdRequestType> {
    AdRequestType adRequest;
    private final AdsType adsType;
    private final ContextProvider contextProvider;
    private AdListenerType listener;
    protected RendererConfiguration rendererConfiguration;
    private final oc.p tag = new oc.p("BidMachineAd");
    private d currentState = d.Idle;
    private final AdRequest.AdRequestListener<AdRequestType> adRequestListener = new a();
    private final AdRequest.e<AdRequestType> internalAdRequestListener = new b();
    final AdProcessCallback adProcessCallback = new c();
    final BidMachineTrackingObject trackingObject = new BidMachineTrackingObject();
    protected final AtomicBoolean isFinishTracked = new AtomicBoolean(false);
    protected final AtomicBoolean isCloseTracked = new AtomicBoolean(false);

    class a implements AdRequest.AdRequestListener<AdRequestType> {
        a() {
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestExpired(AdRequestType adrequesttype) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.adProcessCallback.processExpired();
            }
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestFailed(AdRequestType adrequesttype, oc.a aVar) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.processRequestFail(aVar);
            }
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        public void onRequestSuccess(AdRequestType adrequesttype, ga.c cVar) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.processRequestSuccess(adrequesttype);
            }
        }
    }

    class b implements AdRequest.e<AdRequestType> {
        b() {
        }

        @Override // io.bidmachine.AdRequest.e
        public void a(AdRequestType adrequesttype) {
            BidMachineAd bidMachineAd = BidMachineAd.this;
            if (adrequesttype == bidMachineAd.adRequest) {
                bidMachineAd.destroy();
            }
        }
    }

    class c extends SimpleAdProcessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AdCridThreadHandler f16434a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdLoaded");
                    BidMachineAd.this.listener.onAdLoaded(BidMachineAd.this);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdImpression");
                    BidMachineAd.this.listener.onAdImpression(BidMachineAd.this);
                }
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.BidMachineAd$c$c, reason: collision with other inner class name */
        class RunnableC0266c implements Runnable {
            RunnableC0266c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdClicked");
                    BidMachineAd.this.listener.onAdClicked(BidMachineAd.this);
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener instanceof AdRewardedListener) {
                    BidMachineAd.this.log("notify AdRewarded");
                    ((AdRewardedListener) BidMachineAd.this.listener).onAdRewarded(BidMachineAd.this);
                }
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BidMachineAd.this.listener != null) {
                    BidMachineAd.this.log("notify AdExpired");
                    BidMachineAd.this.listener.onAdExpired(BidMachineAd.this);
                }
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            if (BidMachineAd.this.listener instanceof AdFullScreenListener) {
                BidMachineAd.this.log("notify AdClosed");
                AdFullScreenListener adFullScreenListener = (AdFullScreenListener) BidMachineAd.this.listener;
                BidMachineAd bidMachineAd = BidMachineAd.this;
                adFullScreenListener.onAdClosed(bidMachineAd, bidMachineAd.isFinishTracked.get());
            }
            if (BidMachineAd.this.isDuplicateShowDisabled()) {
                BidMachineAd.this.log("duplicate showing is disabled, starting destroy internally");
                BidMachineAd.this.destroy();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(oc.a aVar) {
            if (BidMachineAd.this.listener != null) {
                BidMachineAd.this.log("notify AdLoadFailed");
                BidMachineAd.this.listener.onAdLoadFailed(BidMachineAd.this, aVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(AdResponse adResponse) {
            io.bidmachine.core.h.B(this.f16434a, new m1());
            if (adResponse.isCridMonitoringEnabled) {
                this.f16434a = new AdCridThreadHandler(adResponse.getAuctionResult().getCreativeId());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(oc.a aVar) {
            if (BidMachineAd.this.listener != null) {
                BidMachineAd.this.log("notify AdShowFailed");
                BidMachineAd.this.listener.onAdShowFailed(BidMachineAd.this, aVar);
            }
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processClickVerified() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processClickVerified");
            io.bidmachine.core.h.S(new RunnableC0266c());
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processClosed() {
            if (BidMachineAd.this.currentState.ordinal() <= d.Success.ordinal() && BidMachineAd.this.isCloseTracked.compareAndSet(false, true)) {
                BidMachineAd.this.log("processClosed (" + BidMachineAd.this.isFinishTracked.get() + ")");
                io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17877a.e();
                    }
                });
            }
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processDestroy() {
            BidMachineAd.this.log("destroy requested");
            BidMachineAd.this.currentState = d.Destroyed;
            AdResponse adResponse = BidMachineAd.this.getAdResponse();
            if (adResponse != null) {
                adResponse.removeCallback(this);
            }
            BidMachineAd.this.destroyAdRequest();
            io.bidmachine.core.h.B(this.f16434a, new m1());
            this.f16434a = null;
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processExpired() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processExpired");
            BidMachineAd.this.currentState = d.Expired;
            io.bidmachine.core.h.S(new e());
            io.bidmachine.core.h.B(this.f16434a, new m1());
            this.f16434a = null;
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processFillAd() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processFillAd");
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processFinished() {
            if (BidMachineAd.this.currentState.ordinal() <= d.Success.ordinal() && BidMachineAd.this.isFinishTracked.compareAndSet(false, true)) {
                BidMachineAd.this.log("processFinished");
                io.bidmachine.core.h.S(new d());
            }
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processLoadFail(final oc.a aVar) {
            BidMachineAd.this.log("processLoadFail - " + aVar);
            BidMachineAd.this.currentState = d.Failed;
            io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.n1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20327a.f(aVar);
                }
            });
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processLoadSuccess() {
            if (BidMachineAd.this.currentState.ordinal() > d.Loading.ordinal()) {
                return;
            }
            BidMachineAd.this.log("processLoadSuccess");
            BidMachineAd.this.currentState = d.Success;
            io.bidmachine.core.h.S(new a());
            io.bidmachine.core.h.B(BidMachineAd.this.getAdResponse(), new Executable() { // from class: io.bidmachine.k1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    this.f17895a.g((AdResponse) obj);
                }
            });
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processShowFail(final oc.a aVar) {
            BidMachineAd.this.log("processShowFail - " + aVar);
            io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.l1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17901a.h(aVar);
                }
            });
        }

        @Override // io.bidmachine.SimpleAdProcessCallback, io.bidmachine.AdProcessCallback
        public void processShown() {
            if (BidMachineAd.this.currentState.ordinal() > d.Success.ordinal()) {
                return;
            }
            BidMachineAd.this.log(xjwcmjDeOXR.gxAplrZUWQN);
            io.bidmachine.core.h.S(new b());
        }
    }

    enum d {
        Idle,
        Requesting,
        Loading,
        Success,
        Failed,
        Destroyed,
        Expired
    }

    public BidMachineAd(Context context, AdsType adsType) {
        this.contextProvider = new SimpleContextProvider(context);
        this.adsType = adsType;
    }

    private void attachRequest(AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.addListener(this.adRequestListener);
            adrequesttype.addInternalListener(this.internalAdRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAdRequest() {
        AdRequestType adrequesttype = this.adRequest;
        this.adRequest = null;
        if (adrequesttype != null) {
            detachRequest(adrequesttype);
            adrequesttype.destroy();
        }
    }

    private void detachRequest(AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.removeListener(this.adRequestListener);
            adrequesttype.removeInternalListener(this.internalAdRequestListener);
        }
    }

    private boolean isNetworkAvailableDuringShow() {
        return d2.a() || io.bidmachine.core.h.F(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$0(String str) {
        StringBuilder sb2 = new StringBuilder(this.adsType.name());
        ga.c auctionResult = getAuctionResult();
        if (auctionResult != null) {
            sb2.append(" (");
            sb2.append(auctionResult.a());
            sb2.append(")");
        }
        return String.format("%s - %s", sb2, str);
    }

    private void processRequest(AdRequestType adrequesttype) {
        log("process request start");
        if (getAuctionResult() != null) {
            processRequestSuccess(adrequesttype);
        } else {
            this.currentState = d.Requesting;
            adrequesttype.request(getContext());
        }
    }

    private void trackEvent(TrackEventType trackEventType, oc.a aVar) {
        this.trackingObject.eventFinish(trackEventType, false, getAdsType(), getAdResponse(), aVar);
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        return isLoaded() && isCanShowAd() && isNetworkAvailableDuringShow();
    }

    protected abstract AdObjectType createAdObject(ContextProvider contextProvider, AdRequestType adrequesttype, NetworkAdapter networkAdapter, ga.b bVar, AdProcessCallback adProcessCallback);

    @Override // io.bidmachine.IAd
    public void destroy() {
        this.adProcessCallback.processDestroy();
        this.trackingObject.clear();
    }

    protected final AdResponse getAdResponse() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAdResponse();
        }
        return null;
    }

    AdsType getAdsType() {
        return this.adsType;
    }

    @Override // io.bidmachine.IAd
    public ga.c getAuctionResult() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAuctionResult();
        }
        return null;
    }

    Context getContext() {
        return this.contextProvider.getApplicationContext();
    }

    ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    protected final AdObjectType getLoadedAdObject() {
        AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            return null;
        }
        try {
            return (AdObjectType) adResponse.getAdObject();
        } catch (Throwable unused) {
            return null;
        }
    }

    boolean isCanShowAd() {
        AdResponse adResponse = getAdResponse();
        return (adResponse == null || adResponse.wasShown()) ? false : true;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        return this.currentState == d.Destroyed;
    }

    public abstract boolean isDuplicateShowDisabled();

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        return this.currentState == d.Expired;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        return getLoadedAdObject() != null && this.currentState == d.Success;
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        d dVar = this.currentState;
        return dVar == d.Requesting || dVar == d.Loading;
    }

    @Override // io.bidmachine.IAd
    public SelfType load(AdRequestType adrequesttype) {
        log("load requested");
        this.trackingObject.eventStart(TrackEventType.Load);
        if (!b2.e().C()) {
            processRequestFail(oc.a.i("BidMachine not initialized"));
            return this;
        }
        if (this.currentState != d.Idle) {
            log("request process abort because it's already processing");
            return this;
        }
        if (adrequesttype == null) {
            processRequestFail(oc.a.k("AdRequest"));
            return this;
        }
        detachRequest(this.adRequest);
        this.adRequest = adrequesttype;
        attachRequest(adrequesttype);
        processRequest(adrequesttype);
        return this;
    }

    protected final void log(final String str) {
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.i1
            @Override // qc.b
            public final Object get() {
                return this.f17598a.lambda$log$0(str);
            }
        });
    }

    protected AdObjectType prepareShow() {
        return (AdObjectType) prepareShow(isDuplicateShowDisabled());
    }

    void processPrepareShow() {
        trackEvent(TrackEventType.ImpressionOpportunity, null);
    }

    void processRequestFail(oc.a aVar) {
        if (this.currentState.ordinal() > d.Loading.ordinal()) {
            return;
        }
        trackEvent(TrackEventType.Load, aVar);
        this.adProcessCallback.processLoadFail(aVar);
    }

    void processRequestSuccess(AdRequestType adrequesttype) {
        int iOrdinal = this.currentState.ordinal();
        d dVar = d.Loading;
        if (iOrdinal > dVar.ordinal()) {
            return;
        }
        this.currentState = dVar;
        AdResponse adResponse = adrequesttype.getAdResponse();
        this.trackingObject.setAdResponse(adResponse);
        if (adResponse == null) {
            processRequestFail(oc.a.h("AdResponse is null"));
        } else {
            log("start loading");
            adResponse.loadAdObject(this.contextProvider, adrequesttype, this, this.adProcessCallback);
        }
    }

    void processShowFail(oc.a aVar) {
        trackEvent(TrackEventType.Show, aVar);
        this.adProcessCallback.processShowFail(aVar);
    }

    public SelfType setListener(AdListenerType adlistenertype) {
        this.listener = adlistenertype;
        return this;
    }

    @Override // io.bidmachine.IAd
    public SelfType setRendererConfiguration(RendererConfiguration rendererConfiguration) {
        this.rendererConfiguration = rendererConfiguration;
        return this;
    }

    public String toString() {
        return this.tag + ", state - " + this.currentState + ", auctionResult - " + getAuctionResult();
    }

    private AdObjectType prepareShow(boolean z10) {
        processPrepareShow();
        if (!isNetworkAvailableDuringShow()) {
            processShowFail(oc.a.f23333e);
            return null;
        }
        if (isDestroyed()) {
            processShowFail(oc.a.f23343o);
            return null;
        }
        if (isExpired()) {
            processShowFail(oc.a.f23342n);
            return null;
        }
        if (!isLoaded()) {
            processShowFail(oc.a.i("Ad not loaded"));
            return null;
        }
        if (!z10 || isCanShowAd()) {
            return (AdObjectType) getLoadedAdObject();
        }
        processShowFail(oc.a.f23340l);
        return null;
    }
}
