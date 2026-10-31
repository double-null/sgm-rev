package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.e3;
import com.applovin.impl.f2;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    private class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.a((e3) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.a((e3) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            com.applovin.impl.sdk.p pVar = MaxRewardedAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                maxRewardedAdImpl.logger.a(maxRewardedAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxRewardedAdImpl.this.adListener);
            }
            v2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, com.applovin.impl.sdk.l lVar, Context context) {
        super(str, maxAdFormat, aVar, str2, lVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    protected MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e3 e3Var, MaxError maxError) {
        if (e3Var.w0().get() || !e3Var.y0().compareAndSet(false, true)) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "User not rewarded for ad: " + e3Var + " with error: " + maxError);
        }
        this.sdk.R().a(f2.f6528x0, e3Var, maxError);
    }
}
