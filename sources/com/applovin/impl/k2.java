package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f6971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f6972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f6973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SoftReference f6975f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f6977h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile double f6979j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6970a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f6976g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f6978i = false;

    class a implements AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f6981a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f6981a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            k2.this.f6973d = appLovinAd;
            if (this.f6981a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ob
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7781a.a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f6981a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7856a.a(i10);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f6981a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                k2.this.f6971b.E().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f6981a.failedToReceiveAd(i10);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                k2.this.f6971b.E().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    private class c implements n2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAd f6983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f6984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f6985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f6986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f6987e;

        /* synthetic */ c(k2 k2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i10;
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = k2.this.b();
            if (!StringUtils.isValidString(strB) || !k2.this.f6978i) {
                k2.this.f6971b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f6971b.Q().b("IncentivizedAdController", "Invalid reward state - result: " + strB + " and wasFullyEngaged: " + k2.this.f6978i);
                }
                k2.this.f6971b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f6971b.Q().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (k2.this.f6978i) {
                    k2.this.f6971b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        k2.this.f6971b.Q().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    k2.this.f6971b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        k2.this.f6971b.Q().b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(q4.a(str));
                k2.this.f6971b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f6971b.Q().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                v2.a(this.f6987e, bVar, i10);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(k2.this.f6979j));
                CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, str, mapHashMap);
                k2.this.f6971b.g().a(f2.K, bVar, mapHashMap);
            }
            if (bVar.A0().getAndSet(true)) {
                return;
            }
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            k2.this.f6971b.s0().a((k5) new p6(bVar, k2.this.f6971b), f6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            v2.a(this.f6985c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            v2.a(this.f6984b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, false));
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                k2.this.f6971b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    k2.this.f6971b.Q().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            k2.this.a(appLovinAdF);
            k2.this.f6971b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                k2.this.f6971b.Q().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            v2.b(this.f6984b, appLovinAd);
        }

        @Override // com.applovin.impl.n2
        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAdF = this.f6983a;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAdF = ((com.applovin.impl.sdk.ad.c) appLovinAdF).f();
            }
            boolean z10 = this.f6984b instanceof n2;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, StringUtils.isValidString(str)));
            } else {
                if (appLovinAdF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAdF;
                }
                k2.this.f6971b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVarQ = k2.this.f6971b.Q();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received `");
                    sb2.append(z10 ? "adDisplayFailed" : "adHidden");
                    sb2.append("` callback for ");
                    sb2.append(str2);
                    pVarQ.b("IncentivizedAdController", sb2.toString());
                }
            }
            k2.this.a(appLovinAdF);
            if (z10) {
                v2.a(this.f6984b, str);
            } else {
                v2.b(this.f6984b, this.f6983a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            k2.this.a("quota_exceeded");
            v2.b(this.f6987e, appLovinAd, map);
            k2.this.f6971b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            k2.this.a("rejected");
            v2.a(this.f6987e, appLovinAd, map);
            k2.this.f6971b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            k2.this.a("accepted");
            v2.c(this.f6987e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            k2.this.a("network_timeout");
            v2.a(this.f6987e, appLovinAd, i10);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", "network_timeout");
            mapHashMap.put("code", String.valueOf(i10));
            k2.this.f6971b.g().a(f2.J, (com.applovin.impl.sdk.ad.b) appLovinAd, mapHashMap);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            v2.a(this.f6986d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z11 = true;
            boolean z12 = (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) appLovinAdF).I0();
            k2 k2Var = k2.this;
            if (z12) {
                d10 = 100.0d;
            }
            k2Var.f6979j = d10;
            k2 k2Var2 = k2.this;
            if (!z10 && !z12) {
                z11 = false;
            }
            k2Var2.f6978i = z11;
            v2.a(this.f6986d, appLovinAd, k2.this.f6979j, k2.this.f6978i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f6983a = appLovinAd;
            this.f6984b = appLovinAdDisplayListener;
            this.f6985c = appLovinAdClickListener;
            this.f6986d = appLovinAdVideoPlaybackListener;
            this.f6987e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z10) {
            if (StringUtils.isValidString(bVar.w())) {
                return bVar.w();
            }
            if (z10) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public k2(String str, AppLovinSdk appLovinSdk) {
        this.f6971b = appLovinSdk.a();
        this.f6972c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f6974e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f6975f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.f6973d != null;
    }

    public String c() {
        return this.f6974e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6971b.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6971b.Q().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f6975f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f6973d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6972c.loadNextIncentivizedAd(this.f6974e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f6973d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.f fVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, fVar, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.f fVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f6973d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, fVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f6976g) {
            str = this.f6977h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f6971b.s0().a((k5) new w6(bVar, appLovinAdRewardListener, this.f6971b), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f6976g) {
            this.f6977h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f6970a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = h2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "showRewardedAd", mapA);
        this.f6971b.g().d(f2.D, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = q7.a(appLovinAdImpl, this.f6971b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f6971b.A0(), context);
        for (String str : this.f6970a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f6970a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, androidx.lifecycle.f fVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = h2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "showRewardedAdView", mapA);
        this.f6971b.g().d(f2.D, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = q7.a(appLovinAdImpl, this.f6971b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f6971b.A0(), context);
        for (String str : this.f6970a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f6970a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, fVar);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, n2 n2Var) {
        v2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        v2.a(n2Var, str);
        Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f6971b.g().d(f2.G, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f6973d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f6973d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f6973d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
