package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import c0.IbU.elEbP;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.e3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.i0;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u1;
import com.applovin.impl.u6;
import com.applovin.impl.v1;
import com.applovin.impl.v2;
import com.applovin.impl.y3;
import com.applovin.impl.z3;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.a.InterfaceC0117a, com.applovin.impl.j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f7232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f7233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f7234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e3 f7236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f7237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f7238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f7239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i0 f7240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f7241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f7243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f7244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f7245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f7246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference f7247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f7248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f7249s;

    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        Activity getActivity();
    }

    /* JADX INFO: loaded from: classes.dex */
    protected class b implements MaxAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0112a {
        protected b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final e3 e3Var = (e3) maxAd;
            MaxFullscreenAdImpl.this.e();
            d dVar = MaxFullscreenAdImpl.this.f7243m;
            d dVar2 = d.NONE;
            final boolean z10 = dVar != dVar2;
            if (z10) {
                com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed from: " + MaxFullscreenAdImpl.this.f7243m.b());
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", e3Var.x0());
                CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, MaxFullscreenAdImpl.this.f7243m.b(), mapHashMap);
                MaxFullscreenAdImpl.this.sdk.R().a(f2.C0, e3Var, mapHashMap);
                MaxFullscreenAdImpl.this.f7243m = dVar2;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7322a.a(maxAd, z10, e3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final e3 e3Var = (e3) maxAd;
            d dVar = MaxFullscreenAdImpl.this.f7243m;
            d dVar2 = d.NONE;
            if (dVar != dVar2) {
                com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded from: " + MaxFullscreenAdImpl.this.f7243m.b());
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", e3Var.x0());
                CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, MaxFullscreenAdImpl.this.f7243m.b(), mapHashMap);
                MaxFullscreenAdImpl.this.sdk.R().a(f2.B0, e3Var, mapHashMap);
                MaxFullscreenAdImpl.this.f7243m = dVar2;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(e3Var);
            MaxFullscreenAdImpl.this.e(e3Var);
            MaxFullscreenAdImpl.this.g();
            Integer num = (Integer) MaxFullscreenAdImpl.this.sdk.a(t3.B8);
            if (num.intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.s0().b(new u6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7330a.a(e3Var);
                    }
                }), f6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(num.intValue()));
            }
            com.applovin.impl.sdk.p pVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f7243m = d.NONE;
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7332a.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.f();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7334a.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            e3 e3Var;
            synchronized (MaxFullscreenAdImpl.this.f7235e) {
                e3Var = MaxFullscreenAdImpl.this.f7236f;
            }
            MaxFullscreenAdImpl.this.sdk.J().a(MaxFullscreenAdImpl.this.adUnitId);
            final e3 e3Var2 = (e3) maxAd;
            MaxFullscreenAdImpl.this.d(e3Var2);
            if (!MaxFullscreenAdImpl.this.f7238h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7327a.a(e3Var2, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f7239i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.h();
            }
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + e3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            v2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) e3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            v2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            v2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f7243m == d.NONE) {
                com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                }
                v2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                return;
            }
            com.applovin.impl.sdk.p pVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "Attempting ad failover from: " + MaxFullscreenAdImpl.this.f7243m.b());
            }
            e3Var.j(MaxFullscreenAdImpl.this.f7246p);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f7246p);
            CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, MaxFullscreenAdImpl.this.f7243m.b(), mapHashMap);
            MaxFullscreenAdImpl.this.sdk.R().a(f2.A0, e3Var, mapHashMap);
            MaxFullscreenAdImpl.this.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var) {
            if (e3Var.x().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.R().a(f2.f6522u0, e3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, e3 e3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 ? MaxFullscreenAdImpl.this.c(e3Var) : false) {
                return;
            }
            com.applovin.impl.sdk.p pVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            v2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    /* JADX INFO: loaded from: classes.dex */
    private enum d {
        NONE("none"),
        FAILOVER_CACHE("failover_cache"),
        PRELOADED_ADS_QUEUE("preloaded_ads_queue");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7261a;

        d(String str) {
            this.f7261a = str;
        }

        public String b() {
            return this.f7261a;
        }
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.l lVar, Context context) {
        super(str, maxAdFormat, str2, lVar);
        this.f7235e = new Object();
        this.f7236f = null;
        this.f7237g = c.IDLE;
        this.f7238h = new AtomicBoolean();
        this.f7239i = new AtomicBoolean();
        this.f7243m = d.NONE;
        this.f7247q = new WeakReference(null);
        this.f7248r = new WeakReference(null);
        this.f7249s = new WeakReference(null);
        this.f7231a = aVar;
        this.f7233c = createAdListenerWrapper();
        this.f7234d = new com.applovin.impl.mediation.b(lVar);
        this.f7232b = new WeakReference(context);
        lVar.k().a(this);
        com.applovin.impl.sdk.p.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    protected b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f7294a.c();
            }
        });
    }

    public boolean isLoading() {
        boolean z10;
        synchronized (this.f7235e) {
            z10 = this.f7237g == c.LOADING;
        }
        return z10;
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f7235e) {
            e3 e3Var = this.f7236f;
            z10 = e3Var != null && e3Var.a0() && this.f7237g == c.READY;
        }
        if (!z10) {
            this.sdk.J().c(this.adUnitId);
        }
        return z10;
    }

    public boolean isShowing() {
        boolean z10;
        synchronized (this.f7235e) {
            z10 = this.f7237g == c.SHOWING;
        }
        return z10;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0117a
    public void onAdExpired(u1 u1Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f7238h.set(true);
        a aVar = this.f7231a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            f();
            this.f7233c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, com.applovin.impl.i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f7233c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        e3 e3Var = this.f7236f;
        if (e3Var == null || !e3Var.T().equalsIgnoreCase(str)) {
            return;
        }
        this.f7236f.h(str2);
        v2.b(this.adReviewListener, str2, this.f7236f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        e3 e3Var;
        List listB = this.sdk.u0().b();
        if (!this.sdk.u0().d() || listB == null || (e3Var = this.f7236f) == null || listB.contains(e3Var.c())) {
            if (activity == null) {
                activity = this.sdk.w0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7295a.a(str, str2, activity);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f7236f.c() + "> which is not in the list of selected ad networks " + listB;
        com.applovin.impl.sdk.p.h(this.tag, str3);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f7320a.b(str3);
            }
        });
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f7231a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        final Long l10 = (Long) this.sdk.a(z4.H2);
        if (l10.longValue() <= 0) {
            return;
        }
        this.f7240j = i0.a(l10.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f7316a.a(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Activity activityW0 = (Activity) this.f7247q.get();
        if (activityW0 == null) {
            activityW0 = this.sdk.w0();
        }
        Activity activity = activityW0;
        if (this.f7242l) {
            showAd(this.f7244n, this.f7245o, (ViewGroup) this.f7248r.get(), (androidx.lifecycle.f) this.f7249s.get(), activity);
        } else {
            showAd(this.f7244n, this.f7245o, activity);
        }
    }

    public void loadAd(final com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f7237g == c.DESTROYED) {
            boolean zC = q7.c(this.sdk);
            this.sdk.E().a(f2.f6472b1, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f7231a;
            final Activity activity = aVar != null ? aVar.getActivity() : null;
            final Context context = (Context) this.f7232b.get();
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7310a.a(activity, context, iVar);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f7236f + "), listener=" + this.adListener);
        }
        v2.f(this.adListener, (MaxAd) this.f7236f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        e3 e3Var = this.f7236f;
        a((MaxAd) e3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + e3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) e3Var, (MaxError) maxErrorImpl, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(e3 e3Var) {
        if (this.sdk.f().a(e3Var, this)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + e3Var);
            }
            this.f7236f = e3Var;
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(e3 e3Var) {
        if (((Boolean) this.sdk.a(z4.G2)).booleanValue()) {
            List listB = e3Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(h2.a((a3) e3Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(y3.a(e3Var, this.sdk)));
            HashMap map = new HashMap(this.sdk.B().e());
            map.put("mcode", e3Var.v0());
            map.put("bcode", e3Var.C());
            JsonUtils.putJSONObject(jSONObject, "postback_body", new JSONObject(map));
            this.sdk.r0().b(b5.R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        e3 e3Var;
        if (this.f7238h.compareAndSet(true, false)) {
            synchronized (this.f7235e) {
                e3Var = this.f7236f;
                this.f7236f = null;
            }
            this.sdk.Z().destroyAd(e3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f7235e) {
            if (this.f7236f != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f7236f + "...");
                }
                this.sdk.Z().destroyAd(this.f7236f);
            }
        }
        this.sdk.k().b(this);
        this.f7234d.a();
        i0 i0Var = this.f7240j;
        if (i0Var != null) {
            i0Var.a();
            this.f7240j = null;
        }
        super.destroy();
    }

    private boolean g(e3 e3Var) {
        if (!e3Var.E0()) {
            return false;
        }
        if (!b()) {
            a(d.PRELOADED_ADS_QUEUE, e3Var);
            return false;
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f7299a.d();
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, com.applovin.impl.i iVar) {
        Context context2;
        Context contextP = activity;
        if (activity != null) {
            context2 = contextP;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.w0() != null) {
                contextP = this.sdk.w0();
            } else {
                contextP = com.applovin.impl.sdk.l.p();
            }
            context2 = contextP;
        }
        this.sdk.Z().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.f7233c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f7243m = d.PRELOADED_ADS_QUEUE;
        loadAd();
    }

    private boolean b() {
        if (this.sdk.T() != null) {
            return this.sdk.T().e(this.adUnitId);
        }
        return this.sdk.S().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f7242l = false;
        this.f7247q = new WeakReference(activity);
        this.sdk.Z().showFullscreenAd(this.f7236f, activity, this.localExtraParameters, this.extraParameters, this.f7233c);
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final androidx.lifecycle.f fVar, Activity activity) {
        e3 e3Var;
        if (viewGroup != null && fVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(t3.f8815w8)).booleanValue()) {
                com.applovin.impl.sdk.p.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                v2.a(this.adListener, (MaxAd) this.f7236f, (MaxError) maxErrorImpl, true);
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f7236f);
                return;
            }
            List listB = this.sdk.u0().b();
            if (this.sdk.u0().d() && listB != null && (e3Var = this.f7236f) != null && !listB.contains(e3Var.c())) {
                final String str3 = "Attempting to show ad from <" + this.f7236f.c() + "> which is not in the list of selected ad networks " + listB;
                com.applovin.impl.sdk.p.h(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7300a.c(str3);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.w0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7302a.a(str, str2, activity2, viewGroup, fVar);
                    }
                });
                return;
            }
            return;
        }
        com.applovin.impl.sdk.p.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f7236f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) this.f7236f, (MaxError) maxErrorImpl2, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f7236f);
    }

    private boolean f(e3 e3Var) {
        if (!e3Var.D0()) {
            return false;
        }
        v1 v1VarH = this.sdk.H();
        final e3 e3VarA = v1VarH.a(this.adUnitId);
        if (e3VarA == null) {
            a(d.FAILOVER_CACHE, e3Var);
            return false;
        }
        if (e3VarA.H() < e3Var.J()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "The failover ad's eCPM does not exceed floor value");
            }
            this.sdk.R().a(f2.H0, e3Var);
            return false;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Loading ad from failover cache");
        }
        v1VarH.b(e3VarA);
        if (e3VarA.R().endsWith("load")) {
            this.f7233c.onAdRevenuePaid(e3VarA);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f7308a.b(e3VarA);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final e3 e3Var) {
        this.f7243m = d.FAILOVER_CACHE;
        e3Var.B().c().a(this.f7233c);
        a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f7318a.a(e3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.f fVar) {
        a(str, str2);
        this.f7242l = true;
        this.f7247q = new WeakReference(activity);
        this.f7248r = new WeakReference(viewGroup);
        this.f7249s = new WeakReference(fVar);
        this.sdk.Z().showFullscreenAd(this.f7236f, viewGroup, fVar, activity, this.localExtraParameters, this.extraParameters, this.f7233c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        e3 e3Var = this.f7236f;
        a((MaxAd) e3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + e3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) e3Var, (MaxError) maxErrorImpl, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (((Boolean) this.sdk.a(z4.G2)).booleanValue()) {
            this.sdk.r0().b(b5.R);
        }
        if (this.f7240j != null) {
            this.sdk.r0().b(b5.S);
            this.f7240j.a();
            this.f7240j = null;
        }
    }

    private boolean a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f7237g == c.DESTROYED) {
            boolean zC = q7.c(this.sdk);
            this.sdk.E().a(f2.f6472b1, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            com.applovin.impl.sdk.p.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            z3 z3Var = new z3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + z3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, (MaxAd) z3Var, (MaxError) maxErrorImpl, true);
            if (this.f7236f != null) {
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f7236f);
            }
            return false;
        }
        Long l10 = (Long) this.sdk.a(t3.f8799g8);
        Long l11 = (Long) this.sdk.a(t3.Z7);
        if (l10.longValue() > 0 && (this.f7236f.getTimeToLiveMillis() < l11.longValue() || this.f7238h.get())) {
            this.f7239i.set(true);
            this.sdk.s0().a(new u6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7314a.a(str);
                }
            }), f6.b.TIMEOUT, l10.longValue());
            return false;
        }
        if (q7.a(com.applovin.impl.sdk.l.p()) != 0 && this.sdk.p0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!q7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(t3.f8814v8)).booleanValue()) {
                    com.applovin.impl.sdk.p.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (com.applovin.impl.sdk.p.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f7236f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    v2.a(this.adListener, (MaxAd) this.f7236f, (MaxError) maxErrorImpl2, true);
                    this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f7236f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.J().e() && !this.sdk.J().d()) {
            return true;
        }
        com.applovin.impl.sdk.p.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f7236f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        v2.a(this.adListener, (MaxAd) this.f7236f, (MaxError) maxErrorImpl3, true);
        this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f7236f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e3 e3Var) {
        if (f(e3Var)) {
            return true;
        }
        return g(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f7239i.compareAndSet(true, false)) {
            com.applovin.impl.sdk.p.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.J().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            z3 z3Var = new z3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + z3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, (MaxAd) z3Var, (MaxError) maxErrorImpl, true);
            if (this.f7236f != null) {
                this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f7236f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f7234d.e(this.f7236f);
        this.f7236f.g(str);
        this.f7236f.f(str2);
        this.f7244n = str;
        this.f7245o = str2;
        this.f7246p = this.f7236f.getNetworkName();
        this.sdk.z().d(this.f7236f);
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f7236f + "...");
        }
        a((a3) this.f7236f);
    }

    private void a() {
        e3 e3Var;
        synchronized (this.f7235e) {
            e3Var = this.f7236f;
            this.f7236f = null;
        }
        this.sdk.Z().destroyAd(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f7241k += l10.longValue();
        this.sdk.r0().b(b5.S, Long.valueOf(this.f7241k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f7237g;
        synchronized (this.f7235e) {
            c cVar3 = c.IDLE;
            if (cVar2 == cVar3) {
                if (cVar == c.LOADING || cVar == c.DESTROYED) {
                    z10 = true;
                } else {
                    if (cVar == c.SHOWING) {
                        com.applovin.impl.sdk.p.h(this.tag, "No ad is loading or loaded");
                    } else if (com.applovin.impl.sdk.p.a()) {
                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                    }
                    z10 = false;
                }
            } else {
                c cVar4 = c.LOADING;
                if (cVar2 == cVar4) {
                    if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            com.applovin.impl.sdk.p.h(this.tag, "An ad is already loading");
                        } else if (cVar != c.READY) {
                            if (cVar == c.SHOWING) {
                                com.applovin.impl.sdk.p.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (cVar != c.DESTROYED) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                } else {
                    c cVar5 = c.READY;
                    if (cVar2 == cVar5) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                com.applovin.impl.sdk.p.h(this.tag, "An ad is already loaded");
                            } else if (cVar == cVar5) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        c cVar6 = c.SHOWING;
                        if (cVar2 == cVar6) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    com.applovin.impl.sdk.p.h(this.tag, "Can not load another ad while the ad is showing");
                                } else if (cVar == cVar5) {
                                    if (com.applovin.impl.sdk.p.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (cVar == cVar6) {
                                    com.applovin.impl.sdk.p.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.p.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z10 = true;
                        } else if (cVar2 == c.DESTROYED) {
                            com.applovin.impl.sdk.p.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (com.applovin.impl.sdk.p.a()) {
                            this.logger.b(this.tag, "Unknown state: " + this.f7237g);
                        }
                        z10 = false;
                    }
                }
            }
            if (z10) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Transitioning from " + this.f7237g + " to " + cVar + "...");
                }
                this.f7237g = cVar;
            } else if (com.applovin.impl.sdk.p.a()) {
                this.logger.k(this.tag, "Not allowed to transition from " + this.f7237g + " to " + cVar);
            }
        }
        if (z10) {
            runnable.run();
            return;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", this.adUnitId);
        CollectionUtils.putStringIfValid("ad_format", this.adFormat.getLabel(), mapHashMap);
        CollectionUtils.putStringIfValid("details", "current_state=" + this.f7237g + elEbP.QhZPOLFHJ + cVar, mapHashMap);
        this.sdk.E().a(f2.f6496j1, "stateTransitionFailed", mapHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((e3) maxAd);
        this.f7234d.a();
        a();
        this.sdk.c0().a((a3) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var) {
        this.f7233c.onAdLoaded(e3Var);
    }

    private void a(d dVar, e3 e3Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Failover ad missing from: " + dVar.b());
        }
        this.sdk.R().a(f2.f6532z0, e3Var, CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, dVar.b()));
    }
}
