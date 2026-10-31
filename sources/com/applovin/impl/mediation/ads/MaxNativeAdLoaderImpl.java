package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.a3;
import com.applovin.impl.f3;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.q7;
import com.applovin.impl.t3;
import com.applovin.impl.u1;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.a.InterfaceC0117a, com.applovin.impl.j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f7262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.i f7265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f7267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f7268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f7269h;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f7270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f7271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7272c;

        a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f7270a = maxNativeAd;
            this.f7271b = list;
            this.f7272c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7270a.prepareForInteraction(this.f7271b, this.f7272c)) {
                return;
            }
            com.applovin.impl.sdk.p.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f7274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f3 f7275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f7276c;

        b(MaxNativeAdView maxNativeAdView, f3 f3Var, MaxNativeAd maxNativeAd) {
            this.f7274a = maxNativeAdView;
            this.f7275b = f3Var;
            this.f7276c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.sdk.p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, UomBEukHFwrS.OwuPmTMknBxLhR + this.f7274a);
            }
            MaxNativeAdLoaderImpl.this.sdk.z().d(this.f7275b);
            this.f7274a.render(this.f7275b, MaxNativeAdLoaderImpl.this.f7262a, MaxNativeAdLoaderImpl.this.sdk);
            this.f7276c.setNativeAdView(this.f7274a);
            if (this.f7276c.prepareForInteraction(this.f7274a.getClickableViews(), this.f7274a)) {
                return;
            }
            this.f7276c.prepareViewForInteraction(this.f7274a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements com.applovin.impl.mediation.ads.a.InterfaceC0112a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f7267f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f7267f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            com.applovin.impl.sdk.p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f7267f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f7267f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7337a.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            v2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            com.applovin.impl.sdk.p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            f3 f3Var = (f3) maxAd;
            f3Var.g(MaxNativeAdLoaderImpl.this.f7263b);
            f3Var.f(MaxNativeAdLoaderImpl.this.f7264c);
            synchronized (MaxNativeAdLoaderImpl.this.f7266e) {
                MaxNativeAdLoaderImpl.this.f7269h.add(f3Var);
            }
            MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(f3Var.N());
            if (maxNativeAdViewA == null) {
                com.applovin.impl.sdk.p pVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                com.applovin.impl.sdk.p pVar3 = MaxNativeAdLoaderImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f7267f);
                }
                v2.a(MaxNativeAdLoaderImpl.this.f7267f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(f3Var);
                return;
            }
            a(maxNativeAdViewA);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, f3Var, f3Var.getNativeAd());
            com.applovin.impl.sdk.p pVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f7267f);
            }
            v2.a(MaxNativeAdLoaderImpl.this.f7267f, maxNativeAdViewA, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(f3Var);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            f3 f3VarB;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (f3VarB = adViewTracker.b()) == null) {
                return;
            }
            com.applovin.impl.sdk.p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(f3VarB);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    public MaxNativeAdLoaderImpl(String str, com.applovin.impl.sdk.l lVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", lVar);
        this.f7262a = new c(this, null);
        this.f7265d = com.applovin.impl.i.PUBLISHER_INITIATED;
        this.f7266e = new Object();
        this.f7268g = new HashMap();
        this.f7269h = new HashSet();
        lVar.k().a(this);
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f7267f = null;
        this.sdk.k().b(this);
        synchronized (this.f7266e) {
            this.f7268g.clear();
            this.f7269h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f7263b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((f3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (com.applovin.impl.sdk.p.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f7262a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.Z().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f7265d, this.localExtraParameters, this.extraParameters, com.applovin.impl.sdk.l.p(), this.f7262a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0117a
    public void onAdExpired(u1 u1Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + u1Var + "), listener=" + this.f7267f);
        }
        v2.b(this.f7267f, (MaxAd) u1Var, true);
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        f3 f3Var;
        Iterator it = this.f7269h.iterator();
        do {
            if (!it.hasNext()) {
                f3Var = null;
                break;
            }
            f3Var = (f3) it.next();
        } while (!f3Var.T().equalsIgnoreCase(str));
        if (f3Var != null) {
            f3Var.h(str2);
            v2.b(this.adReviewListener, str2, f3Var);
            synchronized (this.f7266e) {
                this.f7269h.remove(f3Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        f3 f3Var = (f3) maxAd;
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        f3Var.a(viewGroup);
        this.sdk.z().d(f3Var);
        a((a3) f3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(f3Var, viewGroup, this.f7262a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.s0().a((k5) new u6(this.sdk, "renderMaxNativeAd", aVar), f6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof f3)) {
            com.applovin.impl.sdk.p.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            com.applovin.impl.sdk.p.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        f3 f3Var = (f3) maxAd;
        MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (nativeAd == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(t3.f8797e8)).booleanValue()) {
            com.applovin.impl.sdk.p.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, f3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        q7.b(str, this.tag);
        this.f7264c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof com.applovin.impl.i)) {
            this.f7265d = (com.applovin.impl.i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f7267f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f7263b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f7267f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f3 f3Var) {
        if (f3Var.x0().get()) {
            return;
        }
        this.sdk.f().a(f3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f7266e) {
            this.f7268g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof f3) {
            f3 f3Var = (f3) maxAd;
            if (f3Var.A0()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Native ad (" + f3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f7266e) {
                this.f7269h.remove(f3Var);
            }
            MaxNativeAdView maxNativeAdViewV0 = f3Var.v0();
            if (maxNativeAdViewV0 != null && (adViewTracker = maxNativeAdViewV0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                maxNativeAdViewV0.recycle();
            }
            MaxNativeAd nativeAd = f3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(f3Var);
            this.sdk.Z().destroyAd(f3Var);
            if (this.sdk.T() != null) {
                this.sdk.T().c(this.adUnitId, f3Var.N());
                return;
            } else {
                this.sdk.S().c(this.adUnitId, f3Var.N());
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f7266e) {
            maxNativeAdView = (MaxNativeAdView) this.f7268g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, f3 f3Var, MaxNativeAd maxNativeAd) {
        f3Var.a(maxNativeAdView);
        a((a3) f3Var);
        b bVar = new b(maxNativeAdView, f3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.s0().a((k5) new u6(this.sdk, "renderMaxNativeAd", bVar), f6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
