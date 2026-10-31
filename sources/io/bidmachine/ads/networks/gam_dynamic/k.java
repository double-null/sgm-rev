package io.bidmachine.ads.networks.gam_dynamic;

import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;

/* JADX INFO: compiled from: GAMEventTrackerImpl.java */
/* JADX INFO: loaded from: classes4.dex */
class k extends ub.e implements j {
    k(AdExtension.EventConfiguration eventConfiguration) {
        super(eventConfiguration);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.j
    public void a(TrackEventType trackEventType, AdsFormat adsFormat, ub.a aVar, oc.a aVar2) {
        d(new ub.i(), trackEventType, null, adsFormat.getAdsType(), aVar2, aVar);
    }
}
