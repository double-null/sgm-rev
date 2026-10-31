package io.bidmachine;

import io.bidmachine.protobuf.AdExtension;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BidMachineTrackingObject.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidMachineTrackingObject extends ub.h {
    private AdResponse adResponse;
    private final AdResponseCacheParamsCollector cacheParamsCollector;

    public BidMachineTrackingObject() {
        super(b2.e().t());
        this.cacheParamsCollector = new AdResponseCacheParamsCollector(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void eventFinish$default(BidMachineTrackingObject bidMachineTrackingObject, TrackEventType trackEventType, boolean z10, AdsType adsType, AdResponse adResponse, oc.a aVar, Map map, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            map = null;
        }
        bidMachineTrackingObject.eventFinish(trackEventType, z10, adsType, adResponse, aVar, map);
    }

    public final void eventFinish(TrackEventType trackEventType, boolean z10, AdsType adsType, AdResponse adResponse, oc.a aVar) {
        kotlin.jvm.internal.t.f(trackEventType, "trackEventType");
        eventFinish$default(this, trackEventType, z10, adsType, adResponse, aVar, null, 32, null);
    }

    @Override // ub.k
    public /* bridge */ /* synthetic */ void eventStart(TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // ub.l, ub.k
    public AdExtension.EventConfiguration getEventConfiguration() {
        AdResponse adResponse = this.adResponse;
        return adResponse == null ? super.getEventConfiguration() : adResponse.getEventConfiguration();
    }

    @Override // ub.l, ub.k
    public List<String> getTrackingUrls(TrackEventType eventType) {
        kotlin.jvm.internal.t.f(eventType, "eventType");
        AdResponse adResponse = this.adResponse;
        return adResponse == null ? super.getTrackingUrls(eventType) : adResponse.getTrackUrlListByEvent(eventType);
    }

    public final void setAdResponse(AdResponse adResponse) {
        this.adResponse = adResponse;
    }

    public final void eventFinish(final TrackEventType trackEventType, final boolean z10, final AdsType adsType, final AdResponse adResponse, final oc.a aVar, final Map<String, Object> map) {
        kotlin.jvm.internal.t.f(trackEventType, "trackEventType");
        this.cacheParamsCollector.collect(trackEventType, adResponse, new AdResponseCacheParamsCollector.Callback() { // from class: io.bidmachine.BidMachineTrackingObject.eventFinish.1
            @Override // io.bidmachine.AdResponseCacheParamsCollector.Callback
            public void onCollected(Map<String, ? extends Object> cacheParams) {
                kotlin.jvm.internal.t.f(cacheParams, "cacheParams");
                BidMachineTrackingObject.this.eventFinish(trackEventType, z10, adsType, adResponse, aVar, map, cacheParams);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidMachineTrackingObject(Object trackingKey) {
        super(trackingKey, b2.e().t());
        kotlin.jvm.internal.t.f(trackingKey, "trackingKey");
        this.cacheParamsCollector = new AdResponseCacheParamsCollector(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eventFinish(TrackEventType trackEventType, boolean z10, AdsType adsType, AdResponse adResponse, oc.a aVar, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        ub.a aVarJ = new ub.a().j(z10);
        if (adResponse != null) {
            aVarJ.k(adResponse.getAuctionResult().a());
            aVarJ.l(Double.valueOf(adResponse.getPrice()));
            ga.a adObject = adResponse.getAdObject();
            if (adObject != null) {
                Map<String, ? extends Object> customParams = adObject.getCustomParams();
                if (!(customParams == null || customParams.isEmpty())) {
                    aVarJ.b(customParams);
                }
            }
            String deal = adResponse.getAuctionResult().getDeal();
            if (!(deal == null || rd.f0.k0(deal))) {
                aVarJ.a("deal_id", deal);
            }
        }
        if (!(map == null || map.isEmpty())) {
            aVarJ.b(map);
        }
        if (!(map2 == null || map2.isEmpty())) {
            aVarJ.b(map2);
        }
        eventFinish(trackEventType, adsType, aVarJ, aVar);
    }
}
