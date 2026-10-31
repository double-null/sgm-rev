package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.RewardedAdInternal;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RewardedAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RewardedAd extends BaseFullscreenAd {
    public /* synthetic */ RewardedAd(Context context, String str, AdConfig adConfig, int i10, k kVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    private final RewardedAdInternal getRewardedAdInternal() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        t.d(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (RewardedAdInternal) adInternal$vungle_ads_release;
    }

    public final void setAlertBodyText(String bodyText) {
        t.f(bodyText, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(bodyText);
    }

    public final void setAlertCloseButtonText(String closeButtonText) {
        t.f(closeButtonText, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(closeButtonText);
    }

    public final void setAlertContinueButtonText(String continueButtonText) {
        t.f(continueButtonText, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(continueButtonText);
    }

    public final void setAlertTitleText(String titleText) {
        t.f(titleText, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(titleText);
    }

    public final void setUserId(String userId) {
        t.f(userId, "userId");
        getRewardedAdInternal().setUserId$vungle_ads_release(userId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        t.f(context, "context");
        t.f(placementId, "placementId");
        t.f(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public RewardedAdInternal constructAdInternal$vungle_ads_release(Context context) {
        t.f(context, "context");
        return new RewardedAdInternal(context);
    }
}
