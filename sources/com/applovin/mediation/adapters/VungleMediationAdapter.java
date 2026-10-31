package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.applovin.mediation.adapters.vungle.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleMediationLogger;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class VungleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final String ADAPTER_AD_FORMAT_AD_VIEW = "MaxAdViewAdapter";
    private static final String ADAPTER_AD_FORMAT_AD_VIEW_ADAPTIVE = "MaxAdViewAdapter-adaptive";
    private static final String ADAPTER_AD_FORMAT_APP_OPEN = "MaxAppOpenAdapter";
    private static final String ADAPTER_AD_FORMAT_INTERSTITIAL = "MaxInterstitialAdapter";
    private static final String ADAPTER_AD_FORMAT_NATIVE = "MaxNativeAdAdapter";
    private static final String ADAPTER_AD_FORMAT_NATIVE_BANNER = "MaxNativeAdAdapter-banner";
    private static final String ADAPTER_AD_FORMAT_REWARDED = "MaxRewardedAdapter";
    private static MaxAdapter.InitializationStatus initializationStatus;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private VungleBannerView adViewAd;
    private InterstitialAd appOpenAd;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private RewardedAd rewardedAd;

    private class AdViewAdListener implements BannerAdListener {
        private final String adFormatLabel;
        private final MaxAdViewAdapterListener listener;

        AdViewAdListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad hidden");
            this.listener.onAdViewAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad display failed with error: " + maxAdapterError);
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad displayed");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad started");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Showing " + this.adFormatLabel + " ad for placement: " + baseAd.getPlacementId() + "...");
            if (VungleMediationAdapter.this.adViewAd != null) {
                VungleMediationAdapter.this.adViewAd.setGravity(17);
                VungleMediationAdapter.this.log(this.adFormatLabel + EFLCCdIRcb.EssFS);
                this.listener.onAdViewAdLoaded(VungleMediationAdapter.this.adViewAd, VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
                return;
            }
            MaxAdapterError maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad failed to load: " + maxAdapterError);
            this.listener.onAdViewAdLoadFailed(maxAdapterError);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class AppOpenAdListener implements InterstitialAdListener {
        private final MaxAppOpenAdapterListener listener;

        AppOpenAdListener(MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad clicked");
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad hidden");
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("App Open ad failed to load with error: " + maxError);
            this.listener.onAppOpenAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log("App Open ad failed to display with error: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad displayed");
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad loaded");
            this.listener.onAppOpenAdLoaded(VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("App Open ad started");
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class InterstitialListener implements InterstitialAdListener {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Interstitial ad failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log("Interstitial ad failed to display with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad displayed");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad loaded");
            this.listener.onInterstitialAdLoaded(VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Interstitial ad started");
        }
    }

    private class MaxVungleNativeAd extends MaxNativeAd {
        public MaxVungleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            ImageView imageView;
            NativeAd nativeAd = VungleMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                VungleMediationAdapter.this.e(VRfCTjjLv.MxmEZESMUJujdU);
                return false;
            }
            if (!nativeAd.canPlayAd().booleanValue()) {
                VungleMediationAdapter.this.e("Failed to play native ad or native ad is registered.");
                return false;
            }
            View mediaView = getMediaView();
            if (mediaView == null) {
                VungleMediationAdapter.this.e("Failed to register native ad views: mediaView is null.");
                return false;
            }
            list.add(mediaView);
            if (viewGroup instanceof MaxNativeAdView) {
                if (mediaView.getParent() != null) {
                    ((ViewGroup) mediaView.getParent()).removeView(mediaView);
                }
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                ViewGroup mediaContentViewGroup = maxNativeAdView.getMediaContentViewGroup();
                if (mediaContentViewGroup != null) {
                    mediaContentViewGroup.removeAllViews();
                    mediaContentViewGroup.addView(mediaView);
                }
                nativeAd.registerViewForInteraction(maxNativeAdView, (MediaView) mediaView, maxNativeAdView.getIconImageView(), list);
                return true;
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            viewGroup.addView(frameLayout, 0, new FrameLayout.LayoutParams(-1, -1));
            for (View view : list) {
                if (view instanceof ImageView) {
                    imageView = (ImageView) view;
                    nativeAd.registerViewForInteraction(frameLayout, (MediaView) mediaView, imageView, list);
                    return true;
                }
            }
            imageView = null;
            nativeAd.registerViewForInteraction(frameLayout, (MediaView) mediaView, imageView, list);
            return true;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class NativeAdViewListener implements NativeAdListener {
        private final MaxAdFormat adFormat;
        private final Context applicationContext;
        private final MaxAdViewAdapterListener listener;
        private final Bundle serverParameters;

        NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Context context, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.adFormat = maxAdFormat;
            this.applicationContext = context;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked with placement id: " + baseAd.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad end with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load with error " + maxError + " with placement id: " + baseAd.getPlacementId());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to play with error " + VungleMediationAdapter.toMaxError(vungleError, true) + " with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad shown with placement id: " + baseAd.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad left application with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            MaxNativeAdView maxNativeAdView;
            if (VungleMediationAdapter.this.nativeAd == null || VungleMediationAdapter.this.nativeAd != baseAd) {
                VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded: " + VungleMediationAdapter.this.nativeAd.getPlacementId());
            MaxVungleNativeAd maxVungleNativeAd = VungleMediationAdapter.this.new MaxVungleNativeAd(new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(VungleMediationAdapter.this.nativeAd.getAdTitle()).setAdvertiser(VungleMediationAdapter.this.nativeAd.getAdSponsoredText()).setBody(VungleMediationAdapter.this.nativeAd.getAdBodyText()).setCallToAction(VungleMediationAdapter.this.nativeAd.getAdCallToActionText()).setIcon(new MaxNativeAd.MaxNativeAdImage(Uri.parse(VungleMediationAdapter.this.nativeAd.getAppIcon()))).setMediaContentAspectRatio(VungleMediationAdapter.this.nativeAd.getMediaAspectRatio()).setMediaView(new MediaView(this.applicationContext)));
            String string = BundleUtils.getString(SDKConstants.PARAM_UPDATE_TEMPLATE, "", this.serverParameters);
            if (!string.contains("vertical")) {
                if (!AppLovinSdkUtils.isValidString(string)) {
                    string = "media_banner_template";
                }
                maxNativeAdView = new MaxNativeAdView(maxVungleNativeAd, string, this.applicationContext);
            } else if ("vertical".equals(string)) {
                maxNativeAdView = new MaxNativeAdView(maxVungleNativeAd, this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", this.applicationContext);
            } else {
                maxNativeAdView = new MaxNativeAdView(maxVungleNativeAd, string, this.applicationContext);
            }
            maxVungleNativeAd.prepareForInteraction(VungleMediationAdapter.this.getClickableViews(maxNativeAdView), maxNativeAdView);
            this.listener.onAdViewAdLoaded(maxNativeAdView, VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad start with placement id: " + baseAd.getPlacementId());
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class NativeListener implements NativeAdListener {
        private final Context applicationContext;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        NativeListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.applicationContext = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad clicked with placement id: " + baseAd.getPlacementId());
            this.listener.onNativeAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad end with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Native ad failed to load with error " + maxError + " with placement id: " + baseAd.getPlacementId());
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            VungleMediationAdapter.this.log("Native ad failed to play with error " + VungleMediationAdapter.toMaxError(vungleError, true) + " with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad shown with placement id: " + baseAd.getPlacementId());
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad left application with placement id: " + baseAd.getPlacementId());
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleMediationAdapter.this.nativeAd == null || VungleMediationAdapter.this.nativeAd != baseAd) {
                VungleMediationAdapter.this.log("Native ad failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString(SDKConstants.PARAM_UPDATE_TEMPLATE, "", this.serverParameters)) && TextUtils.isEmpty(VungleMediationAdapter.this.nativeAd.getAdTitle())) {
                VungleMediationAdapter.this.e("Native ad (" + VungleMediationAdapter.this.nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            VungleMediationAdapter.this.log("Native ad loaded: " + VungleMediationAdapter.this.nativeAd.getPlacementId());
            this.listener.onNativeAdLoaded(VungleMediationAdapter.this.new MaxVungleNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(VungleMediationAdapter.this.nativeAd.getAdTitle()).setAdvertiser(VungleMediationAdapter.this.nativeAd.getAdSponsoredText()).setBody(VungleMediationAdapter.this.nativeAd.getAdBodyText()).setCallToAction(VungleMediationAdapter.this.nativeAd.getAdCallToActionText()).setIcon(new MaxNativeAd.MaxNativeAdImage(Uri.parse(VungleMediationAdapter.this.nativeAd.getAppIcon()))).setMediaContentAspectRatio(VungleMediationAdapter.this.nativeAd.getMediaAspectRatio()).setMediaView(new MediaView(this.applicationContext))), VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Native ad start with placement id: " + baseAd.getPlacementId());
        }
    }

    private class RewardedListener implements RewardedAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad video completed");
            if (this.hasGrantedReward || VungleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = VungleMediationAdapter.this.getReward();
                VungleMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            VungleMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleError, false);
            VungleMediationAdapter.this.log("Rewarded ad failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, vungleError.getCode(), vungleError.getErrorMessage());
            VungleMediationAdapter.this.log("Rewarded ad failed to display with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad left application");
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded(VungleMediationAdapter.this.maybeCreateExtraInfoBundle(baseAd));
        }

        @Override // com.vungle.ads.RewardedAdListener
        public void onAdRewarded(BaseAd baseAd) {
            VungleMediationAdapter.this.log("User was rewarded");
            this.hasGrantedReward = true;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            VungleMediationAdapter.this.log(ykDFMuXDQMaR.UesLw);
        }
    }

    public VungleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private VungleAdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveAdViewWidth = getAdaptiveAdViewWidth(maxAdapterParameters, context);
        if (!isInlineAdaptiveAdView(maxAdapterParameters)) {
            return VungleAdSize.getAdSizeWithWidthAndHeight(adaptiveAdViewWidth, MaxAdFormat.BANNER.getAdaptiveSize(adaptiveAdViewWidth, context).getHeight());
        }
        int inlineAdaptiveAdViewMaximumHeight = getInlineAdaptiveAdViewMaximumHeight(maxAdapterParameters);
        return inlineAdaptiveAdViewMaximumHeight > 0 ? VungleAdSize.getAdSizeWithWidthAndHeight(adaptiveAdViewWidth, inlineAdaptiveAdViewMaximumHeight) : VungleAdSize.getAdSizeWithWidth(context, adaptiveAdViewWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> getClickableViews(MaxNativeAdView maxNativeAdView) {
        ArrayList arrayList = new ArrayList(7);
        if (maxNativeAdView.getTitleTextView() != null) {
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (maxNativeAdView.getAdvertiserTextView() != null) {
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (maxNativeAdView.getBodyTextView() != null) {
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (maxNativeAdView.getCallToActionButton() != null) {
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (maxNativeAdView.getIconImageView() != null) {
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        if (maxNativeAdView.getMediaContentViewGroup() != null) {
            arrayList.add(maxNativeAdView.getMediaContentViewGroup());
        }
        return arrayList;
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private void logAdaptiveSizeMismatch(MaxAdapterParameters maxAdapterParameters, VungleBannerView vungleBannerView, Context context) {
        VungleMediationLogger.logError(vungleBannerView, "AdaptiveBannerSizeMismatch:w-" + getAdaptiveAdViewWidth(maxAdapterParameters, context) + "|maxh-" + getInlineAdaptiveAdViewMaximumHeight(maxAdapterParameters));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle maybeCreateExtraInfoBundle(BaseAd baseAd) {
        Bundle bundle = new Bundle(3);
        String creativeId = baseAd.getCreativeId();
        if (AppLovinSdkUtils.isValidString(creativeId)) {
            bundle.putString("creative_id", creativeId);
        }
        VungleBannerView vungleBannerView = this.adViewAd;
        if (vungleBannerView != null) {
            VungleAdSize adViewSize = vungleBannerView.getAdViewSize();
            bundle.putInt("ad_width", adViewSize.getWidth());
            bundle.putInt("ad_height", adViewSize.getHeight());
        }
        return bundle;
    }

    private boolean shouldFailAdLoadWhenSdkNotInitialized(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        return maxAdapterResponseParameters.getServerParameters().getBoolean("fail_ad_load_when_sdk_not_initialized", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0054  */
    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x005a  */
    /* JADX WARN: Code duplicated, block: B:40:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0060  */
    /* JADX WARN: Code duplicated, block: B:42:0x0063  */
    /* JADX WARN: Code duplicated, block: B:43:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:0x0069  */
    public static MaxAdapterError toMaxError(VungleError vungleError, boolean z10) {
        int code = vungleError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 2) {
            if (code != 6) {
                if (code != 118 && code != 119) {
                    if (code != 304) {
                        if (code != 305) {
                            if (code != 2000 && code != 2001) {
                                if (code != 10001 && code != 10002) {
                                    switch (code) {
                                        case 6:
                                            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                                            break;
                                        case 109:
                                        case AD_INTERNAL_INTEGRATION_ERROR_VALUE:
                                        case CONFIG_NOT_FOUND_ERROR_VALUE:
                                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                            break;
                                        case 200:
                                        case 202:
                                        case 203:
                                        case 204:
                                        case 205:
                                        case 206:
                                        case 208:
                                        case 209:
                                            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                            break;
                                        case 201:
                                        case 207:
                                        case 500:
                                        case AD_PUBLISHER_MISMATCH_VALUE:
                                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                            break;
                                        case 210:
                                            maxAdapterError = z10 ? MaxAdapterError.AD_NOT_READY : MaxAdapterError.INVALID_LOAD_STATE;
                                            break;
                                        case 212:
                                            maxAdapterError = MaxAdapterError.NO_FILL;
                                            break;
                                        case INVALID_IFA_STATUS_VALUE:
                                        case 400:
                                            maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
                                            break;
                                        case 307:
                                            maxAdapterError = MaxAdapterError.AD_EXPIRED;
                                            break;
                                        case WEBVIEW_ERROR_VALUE:
                                            maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
                                            break;
                                        case 600:
                                            maxAdapterError = MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS;
                                            break;
                                        case 2009:
                                            maxAdapterError = MaxAdapterError.MISSING_ACTIVITY;
                                            break;
                                        case AD_SERVER_ERROR_VALUE:
                                            maxAdapterError = MaxAdapterError.SERVER_ERROR;
                                            break;
                                        default:
                                            switch (code) {
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                    break;
                                                case 106:
                                                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                                    break;
                                                default:
                                                    switch (code) {
                                                        case 111:
                                                        case 112:
                                                        case 113:
                                                            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                            break;
                                                        case 114:
                                                        case 116:
                                                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                                            break;
                                                        case 115:
                                                            maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
                                                            break;
                                                        default:
                                                            switch (code) {
                                                                case INVALID_GZIP_BID_PAYLOAD_VALUE:
                                                                case AD_RESPONSE_EMPTY_VALUE:
                                                                case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                                                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                                    break;
                                                                case AD_RESPONSE_TIMED_OUT_VALUE:
                                                                    maxAdapterError = MaxAdapterError.TIMEOUT;
                                                                    break;
                                                                default:
                                                                    switch (code) {
                                                                        case AD_RESPONSE_RETRY_AFTER_VALUE:
                                                                        case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                                                                            maxAdapterError = MaxAdapterError.SERVER_ERROR;
                                                                            break;
                                                                        case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                                                                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                                                            break;
                                                                        case STALE_CACHED_RESPONSE_VALUE:
                                                                            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                                            break;
                                                                        default:
                                                                            switch (code) {
                                                                                case JSON_PARAMS_ENCODE_ERROR_VALUE:
                                                                                case GENERATE_JSON_DATA_ERROR_VALUE:
                                                                                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                                                                    break;
                                                                                case AD_CLOSED_TEMPLATE_ERROR_VALUE:
                                                                                case AD_CLOSED_MISSING_HEARTBEAT_VALUE:
                                                                                    maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    maxAdapterError = MaxAdapterError.NO_FILL;
                                }
                            } else {
                                maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
                            }
                        } else {
                            maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
                        }
                    } else {
                        maxAdapterError = MaxAdapterError.AD_EXPIRED;
                    }
                } else {
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                }
            } else {
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
            }
        } else {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        }
        return new MaxAdapterError(maxAdapterError, code, vungleError.getLocalizedMessage());
    }

    private VungleAdSize toVungleAdSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (z10 && isAdaptiveAdViewFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return VungleAdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return VungleAdSize.BANNER_LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return VungleAdSize.MREC;
        }
        throw new IllegalArgumentException("Unsupported ad view ad format: " + maxAdFormat.getLabel());
    }

    private void updateUserPrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            VunglePrivacySettings.setGDPRStatus(boolHasUserConsent.booleanValue(), "");
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            VunglePrivacySettings.setCCPAStatus(!boolIsDoNotSell.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserPrivacySettings(maxAdapterSignalCollectionParameters);
        VungleAds.getBiddingToken(getContext(activity), new BidTokenCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.2
            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenCollected(String str) {
                maxSignalCollectionListener.onSignalCollected(str);
            }

            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenError(String str) {
                VungleMediationAdapter.this.log("Signal collection failed: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(com.vungle.ads.BuildConfig.class, "VERSION_NAME");
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        boolean z10;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String label = maxAdFormat.getLabel();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        Context context = getContext(activity);
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        boolean z11 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append(z11 ? "native " : "");
        sb2.append(label);
        sb2.append(" ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing " + label + " ad load...");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        if (z11) {
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, context, maxAdViewAdapterListener);
            NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.nativeAd = nativeAd;
            nativeAd.setAdListener(nativeAdViewListener);
            this.nativeAd.setAdapterAdFormat(ADAPTER_AD_FORMAT_NATIVE_BANNER);
            this.nativeAd.load(bidResponse);
            return;
        }
        boolean z12 = false;
        boolean z13 = maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false);
        if (z13 && !VungleAds.isInline(thirdPartyAdPlacementId)) {
            userError("Please use a Vungle inline placement ID in order to use Vungle adaptive ads");
            z10 = true;
        } else if (!z13 || AppLovinSdk.VERSION_CODE >= 13020099) {
            z12 = z13;
            z10 = false;
        } else {
            userError("Please update AppLovin MAX SDK to version 13.2.0 or higher in order to use Vungle adaptive ads");
            z10 = false;
        }
        VungleBannerView vungleBannerView = new VungleBannerView(context, thirdPartyAdPlacementId, toVungleAdSize(maxAdFormat, z12, maxAdapterResponseParameters, context));
        this.adViewAd = vungleBannerView;
        vungleBannerView.setAdListener(new AdViewAdListener(label, maxAdViewAdapterListener));
        this.adViewAd.setAdapterAdFormat(z12 ? ADAPTER_AD_FORMAT_AD_VIEW_ADAPTIVE : ADAPTER_AD_FORMAT_AD_VIEW);
        if (z10) {
            logAdaptiveSizeMismatch(maxAdapterResponseParameters, this.adViewAd, context);
        }
        this.adViewAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("app open ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing app open ad load...");
            maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(getContext(activity), thirdPartyAdPlacementId, new AdConfig());
        this.appOpenAd = interstitialAd;
        interstitialAd.setAdListener(new AppOpenAdListener(maxAppOpenAdapterListener));
        this.appOpenAd.setAdapterAdFormat(ADAPTER_AD_FORMAT_APP_OPEN);
        this.appOpenAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("interstitial ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing interstitial ad load...");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(getContext(activity), thirdPartyAdPlacementId, new AdConfig());
        this.interstitialAd = interstitialAd;
        interstitialAd.setAdListener(new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialAd.setAdapterAdFormat(ADAPTER_AD_FORMAT_INTERSTITIAL);
        this.interstitialAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("native ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing interstitial ad load...");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
        this.nativeAd = nativeAd;
        nativeAd.setAdListener(new NativeListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener));
        this.nativeAd.setAdapterAdFormat(ADAPTER_AD_FORMAT_NATIVE);
        this.nativeAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("rewarded ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (shouldFailAdLoadWhenSdkNotInitialized(maxAdapterResponseParameters) && !VungleAds.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing rewarded ad load...");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        RewardedAd rewardedAd = new RewardedAd(getContext(activity), thirdPartyAdPlacementId, new AdConfig());
        this.rewardedAd = rewardedAd;
        rewardedAd.setAdListener(new RewardedListener(maxRewardedAdapterListener));
        this.rewardedAd.setAdapterAdFormat(ADAPTER_AD_FORMAT_REWARDED);
        this.rewardedAd.load(bidResponse);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        VungleBannerView vungleBannerView = this.adViewAd;
        if (vungleBannerView != null) {
            vungleBannerView.setAdListener(null);
            this.adViewAd.finishAd();
            this.adViewAd = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.setAdListener(null);
            this.nativeAd.unregisterView();
            this.nativeAd = null;
        }
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdListener(null);
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setAdListener(null);
            this.rewardedAd = null;
        }
        InterstitialAd interstitialAd2 = this.appOpenAd;
        if (interstitialAd2 != null) {
            interstitialAd2.setAdListener(null);
            this.appOpenAd = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        InterstitialAd interstitialAd = this.appOpenAd;
        if (interstitialAd != null && interstitialAd.canPlayAd().booleanValue()) {
            log("Showing app open ad for placement: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
            this.appOpenAd.play(getContext(activity));
            return;
        }
        log("App open ad is not ready: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null && interstitialAd.canPlayAd().booleanValue()) {
            log("Showing interstitial ad for placement: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
            this.interstitialAd.play(getContext(activity));
            return;
        }
        log("Interstitial ad is not ready: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null && rewardedAd.canPlayAd().booleanValue()) {
            log("Showing rewarded ad for placement: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.play(getContext(activity));
            return;
        }
        log("Rewarded ad is not ready: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        updateUserPrivacySettings(maxAdapterInitializationParameters);
        if (initialized.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id", null);
            log(vgmm.ILIiDXzIGwgI + string + "...");
            initializationStatus = MaxAdapter.InitializationStatus.INITIALIZING;
            VungleAds.setIntegrationName(AppLovinMediationProvider.MAX, getAdapterVersion());
            VungleAds.init(getContext(activity), string, new InitializationListener() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.1
                @Override // com.vungle.ads.InitializationListener
                public void onError(VungleError vungleError) {
                    VungleMediationAdapter.initialized.set(false);
                    VungleMediationAdapter.this.log("Vungle SDK failed to initialize with error: ", vungleError);
                    MaxAdapter.InitializationStatus unused = VungleMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(VungleMediationAdapter.initializationStatus, vungleError.getErrorMessage());
                }

                @Override // com.vungle.ads.InitializationListener
                public void onSuccess() {
                    VungleMediationAdapter.this.log("Vungle SDK initialized");
                    MaxAdapter.InitializationStatus unused = VungleMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(VungleMediationAdapter.initializationStatus, null);
                }
            });
            return;
        }
        onCompletionListener.onCompletion(initializationStatus, null);
    }
}
