package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.y3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9446b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    private MaxAdFormat(String str, String str2) {
        this.f9445a = str;
        this.f9446b = str2;
    }

    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_INTERSTITIAL) || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_APP_OPEN) || str.equalsIgnoreCase("app_open")) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_REWARDED) || str.equalsIgnoreCase("reward")) {
            return REWARDED;
        }
        p.h("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f9446b;
    }

    public String getLabel() {
        return this.f9445a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        return this == MREC ? new AppLovinSdkUtils.Size(300, 250) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f9445a + "'}";
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        return (this == BANNER || this == LEADER) ? y3.a(i10, this, context) : getSize();
    }
}
