package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.f;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxRewardedAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9470b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9471c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f9472d = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxRewardedAdImpl f9473a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f9473a = new MaxRewardedAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str) {
        return getInstance(str, l.p());
    }

    public void destroy() {
        this.f9473a.logApiCall("destroy()");
        synchronized (f9471c) {
            f9470b.remove(this.f9473a.getAdUnitId());
        }
        this.f9473a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f9473a.logApiCall("getActivity()");
        return (Activity) f9472d.get();
    }

    public String getAdUnitId() {
        return this.f9473a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean zIsLoading = this.f9473a.isLoading();
        this.f9473a.logApiCall("isLoading() " + zIsLoading + " for ad unit id " + this.f9473a.getAdUnitId());
        return zIsLoading;
    }

    public boolean isReady() {
        boolean zIsReady = this.f9473a.isReady();
        this.f9473a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f9473a.getAdUnitId());
        return zIsReady;
    }

    public boolean isShowing() {
        boolean zIsShowing = this.f9473a.isShowing();
        this.f9473a.logApiCall("isShowing() " + zIsShowing + " for ad unit id " + this.f9473a.getAdUnitId());
        return zIsShowing;
    }

    public void loadAd() {
        this.f9473a.logApiCall("loadAd()");
        this.f9473a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f9473a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f9473a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f9473a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f9473a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f9473a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9473a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f9473a.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f9473a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f9473a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9473a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f9473a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f9473a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f9473a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f9473a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f9473a;
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, Context context) {
        return getInstance(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    f9472d = new WeakReference((Activity) context);
                }
                synchronized (f9471c) {
                    Map map = f9470b;
                    MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                    if (maxRewardedAd != null) {
                        return maxRewardedAd;
                    }
                    MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                    map.put(str, maxRewardedAd2);
                    return maxRewardedAd2;
                }
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        this.f9473a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        q7.b(str2, "MaxRewardedAd");
        this.f9473a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, f fVar, Activity activity) {
        showAd((String) null, viewGroup, fVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, f fVar, Activity activity) {
        showAd(str, null, viewGroup, fVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, f fVar, Activity activity) {
        this.f9473a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + fVar + ", activity=" + activity + ")");
        this.f9473a.showAd(str, str2, viewGroup, fVar, activity);
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
        this.f9473a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        q7.b(str2, "MaxRewardedAd");
        this.f9473a.showAd(str, str2, getActivity());
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
        this.f9473a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + fVar + ")");
        this.f9473a.showAd(str, str2, viewGroup, fVar, getActivity());
    }
}
