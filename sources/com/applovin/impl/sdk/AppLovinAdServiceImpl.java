package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import b2.Bo.yeILL;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a6;
import com.applovin.impl.b5;
import com.applovin.impl.c6;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g6;
import com.applovin.impl.g8;
import com.applovin.impl.k5;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, com.applovin.impl.sdk.a.InterfaceC0117a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f8192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8194d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8195e = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f8196f = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: classes.dex */
    class b implements o2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f8197a;

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f8191a.j().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f8191a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f8191a);
            }
            Collection collectionEmptySet = Collections.emptySet();
            synchronized (this.f8197a.f8199a) {
                if (!this.f8197a.f8201c) {
                    collectionEmptySet = new HashSet(this.f8197a.f8202d);
                    this.f8197a.f8202d.clear();
                }
                c cVar = this.f8197a;
                cVar.f8200b = false;
                cVar.f8201c = false;
            }
            Iterator it = collectionEmptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.o2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection collectionEmptySet = Collections.emptySet();
            synchronized (this.f8197a.f8199a) {
                if (!this.f8197a.f8201c) {
                    collectionEmptySet = new HashSet(this.f8197a.f8202d);
                    this.f8197a.f8202d.clear();
                }
                c cVar = this.f8197a;
                cVar.f8200b = false;
                cVar.f8201c = false;
            }
            Iterator it = collectionEmptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private b(c cVar) {
            this.f8197a = cVar;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f8199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f8202d;

        private c() {
            this.f8199a = new Object();
            this.f8202d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f8200b + ", isReloadingExpiredAd=" + this.f8201c + ", pendingAdListeners=" + this.f8202d + '}';
        }
    }

    AppLovinAdServiceImpl(l lVar) {
        this.f8191a = lVar;
        this.f8192b = lVar.Q();
        HashMap map = new HashMap(6);
        this.f8193c = map;
        map.put(com.applovin.impl.u.c(), new c());
        map.put(com.applovin.impl.u.k(), new c());
        map.put(com.applovin.impl.u.j(), new c());
        map.put(com.applovin.impl.u.m(), new c());
        map.put(com.applovin.impl.u.b(), new c());
        map.put(com.applovin.impl.u.h(), new c());
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f8195e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f8191a.B().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA = this.f8191a.j().a(uVar);
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + uVar + "...");
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f8196f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f8195e) {
            map = CollectionUtils.map(this.f8195e);
            this.f8195e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strI = this.f8191a.B().I();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strI) && p.a()) {
            this.f8192b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strI;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            p.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(strTrim, this.f8191a);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (kVar.c() == com.applovin.impl.k.a.REGULAR) {
            if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Loading next ad for token: " + kVar);
            }
            a(new c6(kVar, jElapsedRealtime, appLovinAdLoadListener, this.f8191a));
            return;
        }
        if (kVar.c() != com.applovin.impl.k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            p.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final JSONObject jSONObjectA = kVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            p.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.s0.c(jSONObjectA, this.f8191a);
        com.applovin.impl.s0.b(jSONObjectA, this.f8191a);
        com.applovin.impl.s0.a(jSONObjectA, this.f8191a);
        this.f8191a.n().a();
        if (JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray()).length() <= 0) {
            if (p.a()) {
                this.f8192b.b("AppLovinAdService", "No ad returned from the server for token: " + kVar);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Rendering ad for token: " + kVar);
        }
        final com.applovin.impl.u uVarA = q7.a(jSONObjectA, this.f8191a);
        MaxAdFormat maxAdFormatD = uVarA.d();
        if (((Boolean) this.f8191a.a(z4.f9189b1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f8191a.i().a(uVarA, new e.a() { // from class: com.applovin.impl.sdk.x
                @Override // com.applovin.impl.sdk.e.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f8727a.a(appLovinAdLoadListener, jSONObjectA, uVarA, jElapsedRealtime, bVar);
                }
            });
        } else {
            a(new g6(jSONObjectA, uVarA, jElapsedRealtime, appLovinAdLoadListener, this.f8191a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l10;
        if (((Boolean) this.f8191a.a(z4.B2)).booleanValue() && (l10 = (Long) this.f8191a.b(b5.N)) != null && System.currentTimeMillis() - l10.longValue() <= ((Long) this.f8191a.a(z4.F2)).longValue()) {
            if (((Boolean) this.f8191a.a(z4.E2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0117a
    public void onAdExpired(com.applovin.impl.u1 u1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) u1Var;
        com.applovin.impl.u adZone = appLovinAdImpl.getAdZone();
        if (p.a()) {
            this.f8192b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f8191a.j().b(appLovinAdImpl);
        if (this.f8191a.I0() || !((Boolean) this.f8191a.a(z4.f9243h1)).booleanValue()) {
            return;
        }
        c cVarA = a(adZone);
        synchronized (cVarA.f8199a) {
            if (!cVarA.f8200b) {
                this.f8191a.Q();
                if (p.a()) {
                    this.f8191a.Q().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                }
                cVarA.f8200b = true;
                cVarA.f8201c = true;
                a(adZone, new b(cVarA));
            } else if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f8196f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f8193c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent) {
        if (bVar == null) {
            if (p.a()) {
                this.f8192b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (p.a()) {
            this.f8192b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, y1 y1Var, Context context) {
        if (bVar == null) {
            if (p.a()) {
                this.f8192b.b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
            a(y1Var.b().getController(), uri, context);
        }
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (bVar == null) {
            if (p.a()) {
                this.f8192b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (p.a()) {
                this.f8192b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.e eVar : listE) {
            String strA = a(eVar.c(), j10, j11, list, bVar.w(), z10, i10);
            String strA2 = a(eVar.a(), j10, j11, list, bVar.w(), z10, i10);
            if (StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.e(strA, strA2));
            } else if (p.a()) {
                this.f8192b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (p.a()) {
                this.f8192b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.B());
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j10, int i10, boolean z10) {
        if (bVar == null) {
            if (p.a()) {
                this.f8192b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> listI0 = bVar.i0();
        if (listI0 == null || listI0.isEmpty()) {
            if (p.a()) {
                this.f8192b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.e eVar : listI0) {
            if (StringUtils.isValidString(eVar.c())) {
                String strA = a(eVar.c(), j10, i10, string, z10);
                String strA2 = a(eVar.a(), j10, i10, string, z10);
                if (strA != null) {
                    a(new com.applovin.impl.e(strA, strA2));
                } else if (p.a()) {
                    this.f8192b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            } else if (p.a()) {
                this.f8192b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f8689a.a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof o2) {
            ((o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f8191a.Q();
            if (p.a()) {
                this.f8191a.Q().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f8191a.E().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", OgqfiHA.xOGLIWvsQmvyWo);
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (p.a()) {
            this.f8192b.a(wHzciBnJlYkdX.XwpZUoNVKaZLpwm, "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar, long j10, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.w
                @Override // java.lang.Runnable
                public final void run() {
                    appLovinAdLoadListener.adReceived(bVar);
                }
            });
        } else {
            a(new g6(jSONObject, uVar, j10, appLovinAdLoadListener, this.f8191a));
        }
    }

    private boolean b() {
        if (!com.applovin.impl.p0.b()) {
            return true;
        }
        Context contextP = l.p();
        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) ((ActivityManager) contextP.getSystemService("activity")).getHistoricalProcessExitReasons(contextP.getPackageName(), 0, 1).get(0);
        return applicationExitInfo.getReason() == 10 || applicationExitInfo.getReason() == 11;
    }

    private void a(com.applovin.impl.u uVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f8191a.Q();
            if (p.a()) {
                this.f8191a.Q().a("AppLovinAdService", "Loading next ad of zone {" + uVar + "}...");
            }
            c cVarA = a(uVar);
            synchronized (cVarA.f8199a) {
                cVarA.f8202d.add(appLovinAdLoadListener);
                if (!cVarA.f8200b) {
                    cVarA.f8200b = true;
                    a(uVar, new b(cVarA));
                } else if (p.a()) {
                    this.f8192b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(k5 k5Var) {
        if (!this.f8191a.D0()) {
            p.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f8191a.c();
        this.f8191a.s0().a(k5Var, f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f8716a.a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            p.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f8191a.E().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            p.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(yeILL.hDWENhzVhNPHsei);
            sb2.append(appLovinAdLoadListener instanceof o2 ? "V2" : "");
            this.f8191a.E().a("AppLovinAdService", sb2.toString(), th);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        if (n7.a(uri)) {
            a(uri, bVarG, aVar.i(), aVar, context, this.f8191a);
        } else if (bVarG != null && bVarG.isCustomTabsEnabled()) {
            this.f8191a.A().a(uri, aVar, this.f8191a.w0());
        } else {
            n7.b(uri, bVarG, context, this.f8191a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f8191a.a(z4.f9376w)).booleanValue() || (context = g8.b(appLovinAdView, this.f8191a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (n7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f8191a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.f8191a.A().a(uri, aVar, this.f8191a.w0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th) {
            if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f8191a.E().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (n7.b(uri, bVar, context, this.f8191a)) {
            v2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.v();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, l lVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, lVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, lVar);
            }
            if (aVar != null) {
                aVar.v();
                return;
            }
            return;
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, l lVar) {
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = n7.b(uri, bVar, context, lVar);
        if (zB) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lVar.i0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                v2.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            lVar.Q();
            if (p.a()) {
                lVar.Q().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f8191a.Q();
                if (p.a()) {
                    this.f8191a.Q().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f8191a.E().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j10, long j11, List list, String str2, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i10 != j.f8413h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(j.a(i10)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (p.a()) {
            this.f8192b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f8191a.b(b5.Q);
        if (TextUtils.isEmpty(str)) {
            if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f8191a.E().d(f2.Q0, mapTryToStringMap);
        String str2 = (String) this.f8191a.b(b5.P);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, ykDFMuXDQMaR.DYVEZS, null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l10 = (Long) this.f8191a.b(b5.O);
            if (l10 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l10));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l10));
            }
            a(new com.applovin.impl.e(string, string2));
            return;
        }
        if (p.a()) {
            this.f8192b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.f8191a.h0().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (p.a()) {
            this.f8192b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final com.applovin.impl.u uVar, final b bVar) {
        AppLovinAdImpl appLovinAdImplE = this.f8191a.j().e(uVar);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (p.a()) {
                this.f8192b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + uVar);
            }
            bVar.adReceived(appLovinAdImplE);
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        MaxAdFormat maxAdFormatD = uVar.d();
        if (((Boolean) this.f8191a.a(z4.f9189b1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f8191a.i().a(uVar, new e.a() { // from class: com.applovin.impl.sdk.u
                @Override // com.applovin.impl.sdk.e.a
                public final void a(com.applovin.impl.sdk.ad.b bVar2) {
                    this.f8693a.a(bVar, uVar, jElapsedRealtime, bVar2);
                }
            });
        } else {
            a(new a6(uVar, jElapsedRealtime, bVar, this.f8191a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final b bVar, com.applovin.impl.u uVar, long j10, final com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.s
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.adReceived(bVar2);
                }
            });
        } else {
            a(new a6(uVar, j10, bVar, this.f8191a));
        }
    }

    private c a(com.applovin.impl.u uVar) {
        c cVar;
        synchronized (this.f8194d) {
            cVar = (c) this.f8193c.get(uVar);
            if (cVar == null) {
                cVar = new c();
                this.f8193c.put(uVar, cVar);
            }
        }
        return cVar;
    }
}
