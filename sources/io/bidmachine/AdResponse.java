package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import io.bidmachine.protobuf.AdCacheControl;
import io.bidmachine.protobuf.AdExtension;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class AdResponse implements ExpirationHandler.Listener {
    private static final long DEF_EXPIRATION_TIME_SEC = TimeUnit.MINUTES.toSeconds(29);

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private final Ad f16383ad;
    private final AdCacheControl adCacheControl;
    private volatile ga.a adObject;
    final AdResponseAdProcessCallback adProcessCallback;
    private final AdRequestParameters adRequestParameters;
    private final ga.c auctionResult;
    private final String bidId;
    private final long createTimeMs;
    private final AdExtension.EventConfiguration eventConfiguration;
    private final ExpirationHandler expirationHandler;
    private final long expirationTimeMs;
    final AtomicBoolean isCached;
    final boolean isCridMonitoringEnabled;
    ExpirationHandler loadExpirationHandler;
    private final NetworkAdUnitManager networkAdUnitManager;
    final String responseId;
    private final Struct seatBidExt;
    final oc.p tag;
    final BidMachineTrackingObject trackingObject;
    private final NetworkAdUnit winnerNetworkAdUnit;
    final Map<TrackEventType, List<String>> trackUrlsMap = new EnumMap(TrackEventType.class);
    private final AtomicBoolean isExpired = new AtomicBoolean(false);
    final List<WeakReference<AdRequest<?, ?, ?>>> weakAdRequestList = new CopyOnWriteArrayList();
    private volatile p0 status = p0.Idle;

    public AdResponse(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, Response response, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter) {
        boolean z10 = false;
        AdResponseAdProcessCallback adResponseAdProcessCallback = new AdResponseAdProcessCallback(this);
        this.adProcessCallback = adResponseAdProcessCallback;
        this.isCached = new AtomicBoolean(false);
        this.tag = new oc.p("AdResponse");
        this.createTimeMs = System.currentTimeMillis();
        this.adRequestParameters = adRequestParameters;
        this.networkAdUnitManager = networkAdUnitManager;
        this.responseId = response.getId();
        this.seatBidExt = seatbid.getExt();
        this.bidId = bid.getId();
        this.f16383ad = ad2;
        AdExtension adExtensionG = oc.h.g(ad2);
        u0 u0Var = new u0(adRequestParameters.getAdsType(), seatbid, bid, ad2, networkAdapter, adExtensionG);
        this.auctionResult = u0Var;
        this.eventConfiguration = findEventConfiguration(adExtensionG);
        this.adCacheControl = findAdCacheControl(adExtensionG);
        long jW = io.bidmachine.core.h.w(bid.getExp(), Response.Seatbid.Bid.getDefaultInstance().getExp(), DEF_EXPIRATION_TIME_SEC) * 1000;
        this.expirationTimeMs = jW;
        BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject(u0Var.getId());
        this.trackingObject = bidMachineTrackingObject;
        bidMachineTrackingObject.setAdResponse(this);
        this.winnerNetworkAdUnit = networkAdUnitManager.findOrAddWinnerNetworkAdUnit(networkAdapter, adRequestParameters.getAdsFormat(), u0Var.c());
        this.expirationHandler = new ExpirationHandler(jW, this);
        int creativeLoadingTimeout = adExtensionG != null ? adExtensionG.getCreativeLoadingTimeout() : 0;
        this.loadExpirationHandler = creativeLoadingTimeout > 0 ? new ExpirationHandler(creativeLoadingTimeout, new o7.f(adResponseAdProcessCallback)) : null;
        if (adExtensionG != null && adExtensionG.getCridMonitoringEnabled()) {
            z10 = true;
        }
        this.isCridMonitoringEnabled = z10;
        extractTrackUrls(bid);
        subscribeExpireTracker();
    }

    private boolean canBeUsedInFuture() {
        return (wasShown() || isExpired()) ? false : true;
    }

    private void extractTrackUrls(Response.Seatbid.Bid bid) {
        oc.h.a(this.trackUrlsMap, TrackEventType.MediationWin, bid.getPurl());
        oc.h.a(this.trackUrlsMap, TrackEventType.MediationLoss, bid.getLurl());
    }

    private AdCacheControl findAdCacheControl(AdExtension adExtension) {
        AdCacheControl adCacheControl;
        if (adExtension == null || (adCacheControl = adExtension.getAdCacheControl()) == AdCacheControl.UNRECOGNIZED) {
            return null;
        }
        return adCacheControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$attachAdRequest$0() {
        return String.format("attachRequest - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$destroy$3() {
        return String.format("destroy - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$4() {
        try {
            ga.a adObject = getAdObject();
            if (adObject != null) {
                adObject.onDestroy();
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
        this.adObject = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$detachAdRequest$1() {
        return String.format("detachRequest - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$notifyExpired$5() {
        return String.format("notifyExpired - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onAdLoadStart$2() {
        return String.format("onLoadStart - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$release$6() {
        return String.format("release - %s", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$7() {
        try {
            ga.a adObject = getAdObject();
            if (adObject != null) {
                adObject.hide();
            }
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    private void subscribeExpireTracker() {
        this.expirationHandler.start();
    }

    public void attachAdRequest(AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.p
            @Override // qc.b
            public final Object get() {
                return this.f20378a.lambda$attachAdRequest$0();
            }
        });
        this.weakAdRequestList.add(new WeakReference<>(adRequest));
    }

    public long calculateExpirationLeftMs() {
        return this.expirationTimeMs - (System.currentTimeMillis() - this.createTimeMs);
    }

    public boolean canCache() {
        return this.adCacheControl == AdCacheControl.AD_CACHE_CONTROL_ENABLED;
    }

    void clearAdRequestList() {
        Iterator<WeakReference<AdRequest<?, ?, ?>>> it = this.weakAdRequestList.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.weakAdRequestList.clear();
    }

    void clearCreativeLoadingTimeout() {
        ExpirationHandler expirationHandler = this.loadExpirationHandler;
        if (expirationHandler != null) {
            expirationHandler.stop();
        }
        this.loadExpirationHandler = null;
    }

    Value createBidCacheExtensionValue() {
        Struct.Builder builderPutFields = Struct.newBuilder().putFields("price", Value.newBuilder().setNumberValue(this.auctionResult.getPrice()).build()).putFields(AuthenticationTokenClaims.JSON_KEY_EXP, Value.newBuilder().setNumberValue(calculateExpirationLeftMs()).build()).putFields(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, Value.newBuilder().setStringValue(this.responseId).build()).putFields("bid_id", Value.newBuilder().setStringValue(this.bidId).build());
        if (this.seatBidExt.getFieldsCount() > 0) {
            builderPutFields.putFields("seat", Value.newBuilder().setStructValue(this.seatBidExt).build());
        }
        return Value.newBuilder().setStructValue(builderPutFields).build();
    }

    void destroy() {
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.n
            @Override // qc.b
            public final Object get() {
                return this.f20325a.lambda$destroy$3();
            }
        });
        o0.f().o(this);
        clearCreativeLoadingTimeout();
        clearAdRequestList();
        unsubscribeExpireTracker();
        this.adProcessCallback.destroy();
        this.trackUrlsMap.clear();
        this.networkAdUnitManager.notifyNetworkClearAuction();
        if (this.adProcessCallback.isLoading()) {
            eventFinish(TrackEventType.Load, false, oc.a.f23343o);
        }
        if (this.adObject != null) {
            eventFinish(TrackEventType.Destroy, false);
        }
        this.trackingObject.clear();
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f20368a.lambda$destroy$4();
            }
        });
    }

    public void detachAdRequest(AdRequest<?, ?, ?> adRequest) {
        if (adRequest == null) {
            return;
        }
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.u
            @Override // qc.b
            public final Object get() {
                return this.f20426a.lambda$detachAdRequest$1();
            }
        });
        ArrayList arrayList = new ArrayList();
        for (WeakReference<AdRequest<?, ?, ?>> weakReference : this.weakAdRequestList) {
            AdRequest<?, ?, ?> adRequest2 = weakReference.get();
            if (adRequest2 == null || adRequest2 == adRequest) {
                arrayList.add(weakReference);
            }
        }
        this.weakAdRequestList.removeAll(arrayList);
        if (this.weakAdRequestList.isEmpty()) {
            release();
        }
    }

    void eventFinish(TrackEventType trackEventType, boolean z10) {
        eventFinish(trackEventType, z10, null, null);
    }

    void expireAdRequests(AdRequest<?, ?, ?> adRequest) {
        Iterator<WeakReference<AdRequest<?, ?, ?>>> it = this.weakAdRequestList.iterator();
        while (it.hasNext()) {
            AdRequest<?, ?, ?> adRequest2 = it.next().get();
            if (adRequest2 != null && adRequest2 != adRequest) {
                adRequest2.processExpired();
            }
        }
    }

    AdExtension.EventConfiguration findEventConfiguration(AdExtension adExtension) {
        AdExtension.EventConfiguration eventConfiguration;
        if (adExtension == null || (eventConfiguration = adExtension.getEventConfiguration()) == AdExtension.EventConfiguration.getDefaultInstance()) {
            return null;
        }
        return eventConfiguration;
    }

    public Ad getAd() {
        return this.f16383ad;
    }

    public ga.a getAdObject() {
        return this.adObject;
    }

    public AdRequestParameters getAdRequestParameters() {
        return this.adRequestParameters;
    }

    public AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    public ga.c getAuctionResult() {
        return this.auctionResult;
    }

    public CreativeFormat getCreativeFormat() {
        return this.auctionResult.b();
    }

    public AdExtension.EventConfiguration getEventConfiguration() {
        return this.eventConfiguration;
    }

    public double getPrice() {
        return this.auctionResult.getPrice();
    }

    public synchronized p0 getStatus() {
        return this.status;
    }

    public List<String> getTrackUrlListByEvent(TrackEventType trackEventType) {
        return this.trackUrlsMap.get(trackEventType);
    }

    public io.bidmachine.core.j getVisibilitySource() {
        return this.adProcessCallback.visibilitySource;
    }

    public NetworkAdUnit getWinnerNetworkAdUnit() {
        return this.winnerNetworkAdUnit;
    }

    public boolean isAdLoaded() {
        return getAdObject() != null && this.adProcessCallback.isLoaded();
    }

    public boolean isCached() {
        return this.isCached.get();
    }

    public boolean isExpired() {
        return this.isExpired.get();
    }

    public synchronized void loadAdObject(ContextProvider contextProvider, AdRequest adRequest, BidMachineAd bidMachineAd, AdProcessCallback adProcessCallback) {
        onAdLoadStart(adRequest);
        this.adProcessCallback.appendCallback(adProcessCallback);
        if (isAdLoaded()) {
            adProcessCallback.processLoadSuccess();
            return;
        }
        if (!this.adProcessCallback.onLoading()) {
            return;
        }
        this.trackingObject.eventStart(TrackEventType.Load);
        if (isExpired()) {
            this.adProcessCallback.processLoadFail(oc.a.f23339k);
            return;
        }
        if (wasShown()) {
            this.adProcessCallback.processLoadFail(oc.a.f23340l);
            return;
        }
        try {
            NetworkAdapter networkAdapterFindNetworkAdapter = adRequest.getAdsType().findNetworkAdapter(this.f16383ad);
            if (networkAdapterFindNetworkAdapter == null) {
                this.adProcessCallback.processLoadFail(oc.a.h("Failed to get adapter by response"));
                return;
            }
            ga.b bVarCreateAdObjectParams = adRequest.getAdsType().createAdObjectParams(this.bidId, this.f16383ad);
            if (bVarCreateAdObjectParams != null && bVarCreateAdObjectParams.g()) {
                ga.a aVarCreateAdObject = bidMachineAd.createAdObject(contextProvider, adRequest, networkAdapterFindNetworkAdapter, bVarCreateAdObjectParams, this.adProcessCallback);
                if (aVarCreateAdObject == null) {
                    this.adProcessCallback.processLoadFail(oc.a.h("Failed to create ad object by response"));
                    return;
                }
                this.adObject = aVarCreateAdObject;
                this.trackUrlsMap.putAll(bVarCreateAdObjectParams.e());
                startCreativeLoadingTimeout();
                aVarCreateAdObject.load(contextProvider, adRequest.obtainUnifiedRequestParams(), this.winnerNetworkAdUnit);
                return;
            }
            this.adProcessCallback.processLoadFail(oc.a.h("Failed to get parameters by response"));
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            this.adProcessCallback.processLoadFail(oc.a.l(WKirgUEJJ.HWZVkVNkVRsfXex, th));
        }
    }

    void notifyExpired(boolean z10) {
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.v
            @Override // qc.b
            public final Object get() {
                return this.f20454a.lambda$notifyExpired$5();
            }
        });
        this.isExpired.set(true);
        unsubscribeExpireTracker();
        expireAdRequests(null);
        if (z10) {
            destroy();
        }
    }

    public void onAdLoadStart(AdRequest<?, ?, ?> adRequest) {
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.q
            @Override // qc.b
            public final Object get() {
                return this.f20388a.lambda$onAdLoadStart$2();
            }
        });
        expireAdRequests(adRequest);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.adProcessCallback.processExpired();
    }

    void processClickVerified() {
        eventFinish(TrackEventType.Click, false);
    }

    boolean processClicked() {
        ga.a adObject = getAdObject();
        return adObject == null || adObject.onClicked() == null;
    }

    void processClosed(boolean z10) {
        ga.a adObject = getAdObject();
        if (adObject != null) {
            adObject.onClosed(z10);
        }
        eventFinish(TrackEventType.Close, false);
    }

    void processExpired() {
        ga.a adObject = getAdObject();
        if (adObject != null) {
            adObject.onExpired();
        }
        eventFinish(TrackEventType.Expired, false);
    }

    void processFillAd() {
        o0.f().o(this);
        eventFinish(TrackEventType.FillAd, false);
    }

    void processFinished() {
        ga.a adObject = getAdObject();
        if (adObject != null) {
            adObject.onFinished();
        }
    }

    void processLoadFail(oc.a aVar) {
        clearCreativeLoadingTimeout();
        eventFinish(TrackEventType.Load, false, aVar);
    }

    void processLoadSuccess() {
        clearCreativeLoadingTimeout();
        eventFinish(TrackEventType.Load, false);
    }

    void processShowFail(oc.a aVar) {
        ga.a adObject = getAdObject();
        if (adObject != null) {
            adObject.onShowFailed();
        }
        eventFinish(TrackEventType.Show, false, aVar);
    }

    void processShown() {
        unsubscribeExpireTracker();
        o0.f().o(this);
        ga.a adObject = getAdObject();
        if (adObject != null) {
            adObject.onShown();
        }
    }

    void release() {
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.s
            @Override // qc.b
            public final Object get() {
                return this.f20407a.lambda$release$6();
            }
        });
        o0 o0VarF = o0.f();
        if (!canBeUsedInFuture() || !o0VarF.e(this)) {
            destroy();
            return;
        }
        clearAdRequestList();
        setStatus(p0.Idle);
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f20420a.lambda$release$7();
            }
        });
    }

    public void removeCallback(AdProcessCallback adProcessCallback) {
        this.adProcessCallback.removeCallback(adProcessCallback);
    }

    public synchronized void setCached(boolean z10) {
        this.isCached.set(z10);
    }

    public synchronized void setStatus(p0 p0Var) {
        this.status = p0Var;
    }

    void startCreativeLoadingTimeout() {
        ExpirationHandler expirationHandler = this.loadExpirationHandler;
        if (expirationHandler != null) {
            expirationHandler.start();
        }
    }

    public String toString() {
        return this.auctionResult.toString();
    }

    void unsubscribeExpireTracker() {
        this.expirationHandler.stop();
    }

    public boolean wasShown() {
        return this.adProcessCallback.isShownTracked();
    }

    void eventFinish(TrackEventType trackEventType, boolean z10, Map<String, Object> map) {
        eventFinish(trackEventType, z10, null, map);
    }

    void eventFinish(TrackEventType trackEventType, boolean z10, oc.a aVar) {
        eventFinish(trackEventType, z10, aVar, null);
    }

    void eventFinish(TrackEventType trackEventType, boolean z10, oc.a aVar, Map<String, Object> map) {
        this.trackingObject.eventFinish(trackEventType, z10, getAdsType(), this, aVar, map);
    }
}
