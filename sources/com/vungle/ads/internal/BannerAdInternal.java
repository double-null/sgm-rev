package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.ViewUtility;
import kotlin.jvm.internal.t;
import wc.q;

/* JADX INFO: compiled from: BannerAdImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BannerAdInternal extends AdInternal {
    private final VungleAdSize adSize;
    private VungleAdSize updatedAdSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdInternal(Context context, VungleAdSize adSize) {
        super(context);
        t.f(context, "context");
        t.f(adSize, "adSize");
        this.adSize = adSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        t.f(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        LogEntry logEntry$vungle_ads_release = getLogEntry$vungle_ads_release();
        Long adLoadType$vungle_ads_release = logEntry$vungle_ads_release != null ? logEntry$vungle_ads_release.getAdLoadType$vungle_ads_release() : null;
        if ((adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 3) || (adLoadType$vungle_ads_release != null && adLoadType$vungle_ads_release.longValue() == 4)) {
            sendWinURL();
        }
        if (this.adSize.isAdaptiveWidth$vungle_ads_release() || this.adSize.isAdaptiveHeight$vungle_ads_release()) {
            q<Integer, Integer> deviceWidthAndHeightWithOrientation = ViewUtility.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = deviceWidthAndHeightWithOrientation.b().intValue();
            int iIntValue2 = deviceWidthAndHeightWithOrientation.c().intValue();
            int iAdWidth = this.adSize.isAdaptiveWidth$vungle_ads_release() ? advertisement.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.isAdaptiveHeight$vungle_ads_release() ? advertisement.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.isAdaptiveHeight$vungle_ads_release() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new VungleAdSize(iMin, iMin2);
        }
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return this.adSize;
    }

    public final VungleAdSize getUpdatedAdSize$vungle_ads_release() {
        return this.updatedAdSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize vungleAdSize) {
        if (vungleAdSize != null) {
            return vungleAdSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        t.f(placement, "placement");
        return placement.isBanner() || placement.isMREC() || placement.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(VungleAdSize vungleAdSize) {
        this.updatedAdSize = vungleAdSize;
    }

    public final AdPlayCallbackWrapper wrapCallback$vungle_ads_release(final AdPlayCallback adPlayCallback) {
        t.f(adPlayCallback, "adPlayCallback");
        return new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.BannerAdInternal$wrapCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str) {
                this.setAdState(AdInternal.AdState.IMPRESSION_LOGGED);
                super.onAdImpression(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) {
                this.setAdState(AdInternal.AdState.PLAYING);
                super.onAdStart(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                t.f(error, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(error);
            }
        };
    }
}
