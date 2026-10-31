package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1090Ne implements RewardedVideoAdListener {
    public final /* synthetic */ C1841gy A00;

    public C1090Ne(C1841gy c1841gy) {
        this.A00 = c1841gy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.A00.A00.A03 = null;
        ((AbstractC1896hy) this.A00.A00.A04).A2A(false);
        this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.A00.A08.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.A00.A08.onRewardedVideoCompleted();
    }
}
