package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.AppRestartDuringAdDetectionService;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: loaded from: classes2.dex */
public class p2 implements AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f7820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f7821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7822c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f7823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f7824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f7825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f7826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f7827h;

    /* JADX INFO: loaded from: classes.dex */
    class a implements AppLovinAdLoadListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            p2.this.b(appLovinAd);
            p2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            p2.this.b(i10);
        }
    }

    public Map h() {
        return this.f7822c;
    }

    public boolean i() {
        final com.applovin.impl.sdk.ad.b bVar = this.f7827h;
        if (bVar == null) {
            return false;
        }
        if (!((Boolean) this.f7820a.a(z4.U6)).booleanValue()) {
            bVar.s0();
        }
        bVar.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.od
            @Override // java.lang.Runnable
            public final void run() {
                this.f7783a.b(bVar);
            }
        });
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f7826g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f7824e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7823d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f7825f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f7822c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "showInterstitialAd", mapA);
            this.f7820a.g().d(f2.D, mapA);
        }
        AppLovinAd appLovinAdA = q7.a(appLovinAd, this.f7820a);
        Context contextE = e();
        String strA = a(appLovinAdA, appLovinAd, contextE);
        if (StringUtils.isValidString(strA)) {
            a("interstitialAdShowFailed", strA, appLovinAd);
        } else {
            if (((Boolean) this.f7820a.a(z4.f9212d6)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                return;
            }
            a((com.applovin.impl.sdk.ad.b) appLovinAdA, contextE);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    private Context e() {
        return (Context) this.f7821b.get();
    }

    private long g() {
        String str = this.f7820a.p0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f7820a.a(z4.Z1)).longValue());
        }
        return 0L;
    }

    public AppLovinAdDisplayListener c() {
        return this.f7824e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f7825f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f7827h;
    }

    public p2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                this.f7820a = appLovinSdk.a();
                this.f7821b = new WeakReference(context);
                return;
            }
            throw new IllegalArgumentException(vgmm.JcFSTs);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public AppLovinAdClickListener b() {
        return this.f7826g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar) {
        if (((Boolean) this.f7820a.a(z4.U6)).booleanValue()) {
            if (AppRestartDuringAdDetectionService.a()) {
                this.f7820a.x0().a(f2.f6506n);
                return;
            }
            bVar.s0();
        }
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(androidx.lifecycle.f fVar, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        a((com.applovin.impl.sdk.ad.b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(fVar, this), activity);
    }

    protected boolean a(com.applovin.impl.sdk.ad.b bVar) {
        List listA = q7.a(!bVar.D0(), bVar, this.f7820a, com.applovin.impl.sdk.l.p());
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f7820a.a(z4.X0)).booleanValue() && (!q7.a(listA, bVar))) {
            a(listA, (com.applovin.impl.sdk.ad.a) bVar);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        if (((Boolean) this.f7820a.a(z4.Z5)).booleanValue()) {
            com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + listA);
            a("missingCachedAdResources", str, bVar);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f7820a.E().a(f2.V0, "missingCachedAdResources", mapHashMap);
            return true;
        }
        com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + listA);
        bVar.G0();
        HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", mapHashMap2);
        this.f7820a.E().a(f2.V0, "missingCachedAdResources", mapHashMap2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        a(bVar, appLovinAdDisplayListener, str, th, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (this.f7827h.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f7820a.k0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f7820a.e().a() == null && ((Boolean) this.f7820a.a(z4.f9343s2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, final ViewGroup viewGroup, final androidx.lifecycle.f fVar) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "showInterstitialAdView", mapA);
            this.f7820a.g().d(f2.D, mapA);
        }
        if (viewGroup != null && fVar != null) {
            final AppLovinAd appLovinAdA = q7.a(appLovinAd, this.f7820a);
            final Activity activityW0 = this.f7820a.w0();
            String strA = a(appLovinAdA, appLovinAd, activityW0);
            if (StringUtils.isValidString(strA)) {
                a("interstitialAdShowFailed", strA, appLovinAd);
                return;
            } else {
                if (((Boolean) this.f7820a.a(z4.f9212d6)).booleanValue() && a((com.applovin.impl.sdk.ad.b) appLovinAdA)) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.md
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7131a.a(fVar, appLovinAdA, viewGroup, activityW0);
                    }
                });
                return;
            }
        }
        com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements y1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f7829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f7830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7831c;

        b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f7829a = activity;
            this.f7830b = appLovinFullscreenAdViewObserver;
            this.f7831c = viewGroup;
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            if (d.d(this.f7829a)) {
                com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                p2.b(p2.this.f7827h, p2.this.f7824e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, this.f7830b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", mapHashMap);
                p2.this.f7820a.g().a(f2.G, p2.this.f7827h, mapHashMap);
                return;
            }
            this.f7830b.setPresenter(y1Var);
            try {
                y1Var.a(this.f7831c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", str);
                p2.b(p2.this.f7827h, p2.this.f7824e, str, th, this.f7830b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap2);
                p2.this.f7820a.g().a(f2.G, p2.this.f7827h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th) {
            p2.b(p2.this.f7827h, p2.this.f7824e, str, th, this.f7830b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            p2.this.f7820a.g().a(f2.G, p2.this.f7827h, mapHashMap);
        }
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("InterstitialAdDialogWrapper", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.b(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f7820a.g().a(f2.L, aVar, mapHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.jd
            @Override // java.lang.Runnable
            public final void run() {
                this.f6929a.a(appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.nd
            @Override // java.lang.Runnable
            public final void run() {
                this.f7719a.a(i10);
            }
        });
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.p.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof n2) {
            v2.a(appLovinAdDisplayListener, str);
        } else {
            v2.b(appLovinAdDisplayListener, bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    public void a() {
        this.f7826g = null;
        this.f7823d = null;
        this.f7825f = null;
        this.f7824e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7820a.l().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", xjwcmjDeOXR.DXkixYUN + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f7820a.a(z4.M1)).booleanValue()) {
            return null;
        }
        com.applovin.impl.sdk.p.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f7820a.f().a(bVar);
        this.f7827h = bVar;
        long jG = g();
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((Boolean) this.f7820a.a(z4.f9189b1)).booleanValue()) {
            this.f7820a.i().a(this.f7827h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.kd
            @Override // java.lang.Runnable
            public final void run() {
                this.f7011a.a(context);
            }
        }, jG);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Activity activity) {
        this.f7820a.f().a(bVar);
        this.f7827h = bVar;
        long jG = g();
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jG + "ms...");
        }
        if (((Boolean) this.f7820a.a(z4.f9189b1)).booleanValue()) {
            this.f7820a.i().a(this.f7827h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.ld
            @Override // java.lang.Runnable
            public final void run() {
                this.f7079a.a(viewGroup, activity, appLovinFullscreenAdViewObserver);
            }
        }, jG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f7820a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7820a.Q().a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        y1.a(this.f7827h, this.f7826g, this.f7824e, this.f7825f, this.f7822c, this.f7820a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.f7824e != null) {
            if (this.f7824e instanceof n2) {
                ((n2) this.f7824e).onAdDisplayFailed(str2);
            } else {
                this.f7824e.adHidden(appLovinAd);
            }
        }
        Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, str, mapA);
        CollectionUtils.putStringIfValid("error_message", str2, mapA);
        this.f7820a.g().d(f2.G, mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f7823d != null) {
            this.f7823d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (this.f7823d != null) {
            this.f7823d.failedToReceiveAd(i10);
        }
    }
}
