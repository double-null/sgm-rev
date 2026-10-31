package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.f;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import java.lang.ref.WeakReference;
import s.sBoZ.TwDPD;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes2.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f9468b = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f9469a;

    public MaxInterstitialAd(String str) {
        this(str, l.p());
    }

    public void destroy() {
        this.f9469a.logApiCall("destroy()");
        this.f9469a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f9469a.logApiCall("getActivity()");
        return (Activity) f9468b.get();
    }

    public String getAdUnitId() {
        return this.f9469a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f9469a.isLoading();
        this.f9469a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f9469a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f9469a.isReady();
        this.f9469a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f9469a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f9469a.isShowing();
        this.f9469a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f9469a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f9469a.logApiCall("loadAd()");
        this.f9469a.loadAd();
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f9469a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f9469a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f9469a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9469a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f9469a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f9469a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f9469a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9469a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f9469a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f9469a.setRequestListener(maxAdRequestListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f9469a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f9469a.logApiCall(zKUlck.zeDU + maxAdReviewListener + ")");
        this.f9469a.setAdReviewListener(maxAdReviewListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f9469a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + TwDPD.Pononfo);
        this.f9469a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f9468b = new WeakReference((Activity) context);
                }
                this.f9469a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        this.f9469a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        q7.b(str2, "MaxInterstitialAd");
        this.f9469a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, f fVar, Activity activity) {
        showAd((String) null, viewGroup, fVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, f fVar, Activity activity) {
        showAd(str, null, viewGroup, fVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, f fVar, Activity activity) {
        this.f9469a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + fVar + ", activity=" + activity + UomBEukHFwrS.wmrDfOMBjn);
        this.f9469a.showAd(str, str2, viewGroup, fVar, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f9469a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        q7.b(str2, "MaxInterstitialAd");
        this.f9469a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, f fVar) {
        showAd((String) null, viewGroup, fVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, f fVar) {
        showAd(str, (String) null, viewGroup, fVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, f fVar) {
        this.f9469a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + fVar + ")");
        this.f9469a.showAd(str, str2, viewGroup, fVar, getActivity());
    }
}
