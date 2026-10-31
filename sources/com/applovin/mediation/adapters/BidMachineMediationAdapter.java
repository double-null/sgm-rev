package com.applovin.mediation.adapters;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.bidmachine.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import ha.n;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRewardedListener;
import io.bidmachine.AdsFormat;
import io.bidmachine.BidMachine;
import io.bidmachine.BidTokenCallback;
import io.bidmachine.ImageData;
import io.bidmachine.InitializationCallback;
import io.bidmachine.MediaAssetType;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.dW.xjwcmjDeOXR;
import ka.o;
import pb.vBC.NyXuoef;

/* JADX INFO: loaded from: classes2.dex */
public class BidMachineMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 10;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private y6.e adView;
    private s7.a interstitialAd;
    private ha.b nativeAd;
    private tb.a rewardedAd;

    /* JADX INFO: loaded from: classes.dex */
    private class AdViewListener implements AdListener {
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(y6.e eVar) {
            BidMachineMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(y6.e eVar) {
            BidMachineMediationAdapter.this.log("AdView ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(y6.e eVar) {
            BidMachineMediationAdapter.this.log("AdView ad impression");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(y6.e eVar, oc.a aVar) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar);
            BidMachineMediationAdapter.this.log("AdView ad failed to load with error (" + maxError + ")");
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(y6.e eVar) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("AdView ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(eVar.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onAdViewAdLoaded(eVar, bundle);
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(y6.e eVar, oc.a aVar) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, aVar.e(), aVar.g());
            BidMachineMediationAdapter.this.log("AdView ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class InterstitialAdListener implements AdListener, AdFullScreenListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(s7.a aVar) {
            BidMachineMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // io.bidmachine.AdFullScreenListener
        public void onAdClosed(s7.a aVar, boolean z10) {
            BidMachineMediationAdapter.this.log("Interstitial ad closed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(s7.a aVar) {
            BidMachineMediationAdapter.this.log("Interstitial ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(s7.a aVar) {
            BidMachineMediationAdapter.this.log("Interstitial ad impression");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(s7.a aVar, oc.a aVar2) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar2);
            BidMachineMediationAdapter.this.log("Interstitial ad failed to load with error (" + maxError + ")");
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(s7.a aVar) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("Interstitial ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(aVar.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onInterstitialAdLoaded(bundle);
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(s7.a aVar, oc.a aVar2) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, aVar2.e(), aVar2.g());
            BidMachineMediationAdapter.this.log("Interstitial ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class MaxBidMachineNativeAd extends MaxNativeAd {
        public MaxBidMachineNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            ImageView imageView;
            ha.b bVar = BidMachineMediationAdapter.this.nativeAd;
            if (bVar == null) {
                BidMachineMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            BidMachineMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            HashSet hashSet = new HashSet(list);
            for (View view : list) {
                if (view instanceof ImageView) {
                    imageView = (ImageView) view;
                    bVar.j(viewGroup, imageView, (o) getMediaView(), hashSet);
                    return true;
                }
            }
            imageView = null;
            bVar.j(viewGroup, imageView, (o) getMediaView(), hashSet);
            return true;
        }
    }

    private class NativeAdListener implements AdListener {
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdListener(Bundle bundle, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleNativeAdLoaded(final ha.b bVar, final MaxNativeAd.MaxNativeAdImage maxNativeAdImage) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.NativeAdListener.2
                @Override // java.lang.Runnable
                public void run() {
                    Bundle bundle;
                    MaxNativeAd.Builder mediaView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(bVar.h()).setBody(bVar.f()).setCallToAction(bVar.e()).setIcon(maxNativeAdImage).setOptionsView(bVar.g(BidMachineMediationAdapter.this.getApplicationContext())).setMediaView(new o(BidMachineMediationAdapter.this.getApplicationContext()));
                    if (bVar.getMainImage() != null) {
                        mediaView.setMainImage(new MaxNativeAd.MaxNativeAdImage(bVar.getMainImage().getImage()));
                    }
                    MaxBidMachineNativeAd maxBidMachineNativeAd = BidMachineMediationAdapter.this.new MaxBidMachineNativeAd(mediaView);
                    String creativeId = BidMachineMediationAdapter.this.getCreativeId(bVar.getAuctionResult());
                    if (TextUtils.isEmpty(creativeId)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle(1);
                        bundle.putString("creative_id", creativeId);
                    }
                    NativeAdListener.this.listener.onNativeAdLoaded(maxBidMachineNativeAd, bundle);
                }
            });
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(ha.b bVar) {
            BidMachineMediationAdapter.this.log(xjwcmjDeOXR.ipEgvyUKgQwf);
            this.listener.onNativeAdClicked();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(ha.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(ha.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad impression");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(ha.b bVar, oc.a aVar) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar);
            BidMachineMediationAdapter.this.log("Native ad failed to load with error (" + maxError + ")");
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(final ha.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad loaded");
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString(SDKConstants.PARAM_UPDATE_TEMPLATE, "", this.serverParameters)) && TextUtils.isEmpty(bVar.h())) {
                BidMachineMediationAdapter.this.e("Native ad (" + bVar + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            ImageData icon = bVar.getIcon();
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
            if (icon == null) {
                handleNativeAdLoaded(bVar, null);
                return;
            }
            Drawable image = icon.getImage();
            Uri localUri = icon.getLocalUri();
            final String remoteUrl = icon.getRemoteUrl();
            if (image != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(image);
            } else if (localUri != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(localUri);
            } else if (remoteUrl != null) {
                BidMachineMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Drawable drawable;
                        BidMachineMediationAdapter.this.log("Adding native ad icon (" + remoteUrl + ") to queue to be fetched");
                        BidMachineMediationAdapter bidMachineMediationAdapter = BidMachineMediationAdapter.this;
                        try {
                            drawable = bidMachineMediationAdapter.createDrawableFuture(remoteUrl, bidMachineMediationAdapter.getApplicationContext().getResources()).get(BundleUtils.getInt("image_task_timeout_seconds", 10, NativeAdListener.this.serverParameters), TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            BidMachineMediationAdapter.this.e("Failed to fetch icon image", th);
                            drawable = null;
                        }
                        NativeAdListener.this.handleNativeAdLoaded(bVar, new MaxNativeAd.MaxNativeAdImage(drawable));
                    }
                });
                return;
            }
            handleNativeAdLoaded(bVar, maxNativeAdImage);
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(ha.b bVar, oc.a aVar) {
            BidMachineMediationAdapter.this.log(NyXuoef.JtwOsFw + aVar + ")");
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class RewardedAdListener implements AdListener, AdFullScreenListener, AdRewardedListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(tb.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // io.bidmachine.AdFullScreenListener
        public void onAdClosed(tb.a aVar, boolean z10) {
            BidMachineMediationAdapter.this.log("Rewarded ad closed");
            if (this.hasGrantedReward || BidMachineMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = BidMachineMediationAdapter.this.getReward();
                BidMachineMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(tb.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(tb.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad impression");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(tb.a aVar, oc.a aVar2) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar2);
            BidMachineMediationAdapter.this.log("Rewarded ad failed to load with error (" + maxError + ")");
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(tb.a aVar) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("Rewarded ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(aVar.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onRewardedAdLoaded(bundle);
        }

        @Override // io.bidmachine.AdRewardedListener
        public void onAdRewarded(tb.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad should grant reward");
            this.hasGrantedReward = true;
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(tb.a aVar, oc.a aVar2) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, aVar2.e(), aVar2.g());
            BidMachineMediationAdapter.this.log("Rewarded ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }
    }

    public BidMachineMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCreativeId(ga.c cVar) {
        if (cVar != null) {
            return cVar.getCreativeId();
        }
        return null;
    }

    private y6.d toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return y6.d.Size_320x50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return y6.d.Size_728x90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return y6.d.Size_300x250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    private AdsFormat toAdsFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (adFormat == MaxAdFormat.BANNER) {
            return AdsFormat.Banner_320x50;
        }
        if (adFormat == MaxAdFormat.MREC) {
            return AdsFormat.Banner_300x250;
        }
        if (adFormat == MaxAdFormat.LEADER) {
            return AdsFormat.Banner_728x90;
        }
        if (adFormat == MaxAdFormat.NATIVE) {
            return AdsFormat.Native;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdsFormat.Interstitial;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdsFormat.Rewarded;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public MaxAdapterError toMaxError(oc.a aVar) {
        int iE = aVar.e();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (iE != 200) {
            switch (iE) {
                case 100:
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    break;
                case 101:
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                    break;
                case 102:
                    maxAdapterError = MaxAdapterError.TIMEOUT;
                    break;
                case 103:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                default:
                    switch (iE) {
                        case 106:
                        case 108:
                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                            break;
                        case 107:
                            maxAdapterError = MaxAdapterError.AD_EXPIRED;
                            break;
                        case 109:
                            maxAdapterError = MaxAdapterError.SERVER_ERROR;
                            break;
                        case 110:
                            maxAdapterError = MaxAdapterError.BAD_REQUEST;
                            break;
                    }
                    break;
            }
        } else {
            maxAdapterError = MaxAdapterError.SERVER_ERROR;
        }
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getMessage(), iE, aVar.g());
    }

    private void updateSettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            BidMachine.setConsentConfig(boolHasUserConsent.booleanValue(), null);
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            BidMachine.setUSPrivacyString(boolIsDoNotSell.booleanValue() ? "1YY-" : "1YN-");
        } else {
            BidMachine.setUSPrivacyString("1---");
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal for " + maxAdapterSignalCollectionParameters.getAdFormat().getLabel() + " ad...");
        updateSettings(maxAdapterSignalCollectionParameters);
        AdsFormat adsFormat = toAdsFormat(maxAdapterSignalCollectionParameters);
        if (adsFormat == null) {
            log("Signal collection failed with error: invalid ad format - ad format is null");
            maxSignalCollectionListener.onSignalCollectionFailed("invalid ad format - ad format is null");
            return;
        }
        String adUnitId = maxAdapterSignalCollectionParameters.getAdUnitId();
        AdPlacementConfig.Builder builder = new AdPlacementConfig.Builder(adsFormat);
        Bundle bundle = BundleUtils.getBundle("placement_ids", Bundle.EMPTY, maxAdapterSignalCollectionParameters.getServerParameters());
        if (AppLovinSdkUtils.isValidString(adUnitId)) {
            String string = bundle.getString(adUnitId);
            if (AppLovinSdkUtils.isValidString(string)) {
                builder.withPlacementId(string);
            } else {
                log("No valid slot ID found during signal collection");
            }
        }
        BidMachine.getBidToken(getApplicationContext(), builder.build(), new BidTokenCallback() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.2
            @Override // io.bidmachine.BidTokenCallback
            public void onCollected(String str) {
                BidMachineMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(BidMachine.class, "VERSION");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        final String string = maxAdapterInitializationParameters.getServerParameters().getString("source_id");
        log("Initializing BidMachine SDK with source id: " + string);
        BidMachine.setLoggingEnabled(maxAdapterInitializationParameters.isTesting());
        BidMachine.setTestMode(maxAdapterInitializationParameters.isTesting());
        updateSettings(maxAdapterInitializationParameters);
        BidMachine.initialize(getApplicationContext(), string, new InitializationCallback() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.1
            @Override // io.bidmachine.InitializationCallback
            public void onInitialized() {
                BidMachineMediationAdapter.this.log("BidMachine SDK successfully finished initialization with source id: " + string);
                MaxAdapter.InitializationStatus unused = BidMachineMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(BidMachineMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        log("Loading " + maxAdFormat.getLabel() + " ad...");
        updateSettings(maxAdapterResponseParameters);
        y6.e eVar = new y6.e(getApplicationContext());
        this.adView = eVar;
        eVar.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.load((y6.c) ((y6.c.C0486c) new y6.c.C0486c().c(toAdSize(maxAdFormat)).setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial ad...");
        updateSettings(maxAdapterResponseParameters);
        s7.a aVar = new s7.a(getApplicationContext());
        this.interstitialAd = aVar;
        aVar.setListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        this.interstitialAd.load((s7.c) ((s7.c.b) new s7.c.b().setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        log("Loading native ad...");
        updateSettings(maxAdapterResponseParameters);
        ha.b bVar = new ha.b(getApplicationContext());
        this.nativeAd = bVar;
        bVar.setListener(new NativeAdListener(maxAdapterResponseParameters.getServerParameters(), maxNativeAdAdapterListener));
        this.nativeAd.load((n) ((n.b) new n.b().c(MediaAssetType.All).setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad...");
        updateSettings(maxAdapterResponseParameters);
        tb.a aVar = new tb.a(getApplicationContext());
        this.rewardedAd = aVar;
        aVar.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.load((tb.c) ((tb.c.b) new tb.c.b().setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        s7.a aVar = this.interstitialAd;
        if (aVar != null) {
            aVar.setListener(null);
            this.interstitialAd.destroy();
            this.interstitialAd = null;
        }
        tb.a aVar2 = this.rewardedAd;
        if (aVar2 != null) {
            aVar2.setListener(null);
            this.rewardedAd.destroy();
            this.rewardedAd = null;
        }
        y6.e eVar = this.adView;
        if (eVar != null) {
            eVar.setListener(null);
            this.adView.destroy();
            this.adView = null;
        }
        ha.b bVar = this.nativeAd;
        if (bVar != null) {
            bVar.l();
            this.nativeAd.setListener(null);
            this.nativeAd.destroy();
            this.nativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd.isExpired()) {
            log("Unable to show rewarded ad - ad expired");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (this.rewardedAd.canShow()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Unable to show rewarded ad - ad not ready");
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (this.interstitialAd.isExpired()) {
            log("Unable to show interstitial - ad expired");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (this.interstitialAd.canShow()) {
            this.interstitialAd.show();
            return;
        }
        log(UomBEukHFwrS.jSdXIQ);
        MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
    }
}
