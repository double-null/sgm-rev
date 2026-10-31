package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f9488a;

    public MaxNativeAdLoader(String str) {
        this(str, l.p());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f9488a.logApiCall("a()");
        this.f9488a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f9488a.logApiCall("b()");
        this.f9488a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f9488a.logApiCall("destroy()");
        this.f9488a.destroy();
    }

    public String getAdUnitId() {
        return this.f9488a.getAdUnitId();
    }

    public String getPlacement() {
        this.f9488a.logApiCall("getPlacement()");
        return this.f9488a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f9488a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f9488a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f9488a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f9488a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f9488a.logApiCall("setCustomData(value=" + str + ")");
        this.f9488a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f9488a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9488a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f9488a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9488a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f9488a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f9488a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f9488a.logApiCall("setPlacement(placement=" + str + ")");
        this.f9488a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f9488a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f9488a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f9488a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f9488a.loadAd(maxNativeAdView);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f9488a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f9488a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f9488a.destroy(maxAd);
    }
}
