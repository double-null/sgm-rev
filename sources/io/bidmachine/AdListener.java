package io.bidmachine;

import io.bidmachine.IAd;

/* JADX INFO: loaded from: classes4.dex */
public interface AdListener<AdType extends IAd> {
    void onAdClicked(AdType adtype);

    void onAdExpired(AdType adtype);

    void onAdImpression(AdType adtype);

    void onAdLoadFailed(AdType adtype, oc.a aVar);

    void onAdLoaded(AdType adtype);

    void onAdShowFailed(AdType adtype, oc.a aVar);
}
