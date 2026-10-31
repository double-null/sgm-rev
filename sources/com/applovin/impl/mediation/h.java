package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.a3;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.impl.e3;
import com.applovin.impl.f5;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.m3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.ServerProtocol;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m3 f7499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAdapter f7501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a3 f7503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f7504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxNativeAd f7505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxNativeAdView f7506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f7507m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MaxAdapterResponseParameters f7509o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f7513s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f7495a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f7508n = new b(this, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f7510p = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f7511q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f7512r = new AtomicBoolean(false);

    /* JADX INFO: loaded from: classes.dex */
    class a implements MaxSignalCollectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f5 f7514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u4 f7515b;

        a(f5 f5Var, u4 u4Var) {
            this.f7514a = f5Var;
            this.f7515b = u4Var;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f7514a.y() && TextUtils.isEmpty(str)) {
                this.f7515b.a(new MaxErrorImpl("Signal is not a valid string"));
            } else {
                this.f7515b.b(str);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            this.f7515b.a(new MaxErrorImpl(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediationServiceImpl.b f7517a;

        private b() {
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": native ad displayed with extra info: " + bundle);
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": native ad loaded with extra info: " + bundle);
            }
            h.this.f7505k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }

        private void b(String str, final Bundle bundle) {
            if (h.this.f7503i.x().compareAndSet(false, true)) {
                a(str, this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7611a.i(bundle);
                    }
                });
            }
        }

        private void c(String str, final Bundle bundle) {
            if (!h.this.f7503i.x().get()) {
                h.this.f7512r.set(true);
                a(str, this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7622a.j(bundle);
                    }
                });
                return;
            }
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.b("MediationAdapterWrapper", h.this.f7500f + ": blocking ad loaded callback for " + h.this.f7503i + " since onAdHidden() has been called");
            }
            h.this.f7496b.u().a(h.this.f7503i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Bundle bundle) {
            this.f7517a.a(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Bundle bundle) {
            this.f7517a.a(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Bundle bundle) {
            this.f7517a.a(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Bundle bundle) {
            this.f7517a.c(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Bundle bundle) {
            this.f7517a.c(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Bundle bundle) {
            this.f7517a.e(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Bundle bundle) {
            if (h.this.f7511q.compareAndSet(false, true)) {
                this.f7517a.f(h.this.f7503i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d(OgqfiHA.YnPgabhwfLJd, h.this.f7500f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7603a.a(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7641a.a();
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": adview ad displayed with extra info: " + bundle);
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(final Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.z0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7645a.b(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": adview ad hidden with extra info: " + bundle);
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": adview ad loaded with extra info: " + bundle);
            }
            h.this.f7504j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7590a.c(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": app open ad displayed with extra info: " + bundle);
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": app open ad hidden with extra info: " + bundle);
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": app open ad loaded with extra info: " + bundle);
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7598a.d(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": interstitial ad displayed with extra info: " + bundle);
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": interstitial ad hidden with extra info " + bundle);
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + sRGQSqxgxlS.rMXftHdTDnYJ + bundle);
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7607a.e(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.b1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7350a.f(bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.k("MediationAdapterWrapper", h.this.f7500f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": rewarded ad displayed with extra info: " + bundle);
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": rewarded ad hidden with extra info: " + bundle);
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": rewarded ad loaded with extra info: " + bundle);
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward, final Bundle bundle) {
            if (h.this.f7503i instanceof e3) {
                final e3 e3Var = (e3) h.this.f7503i;
                if (e3Var.w0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.p unused = h.this.f7497c;
                    if (com.applovin.impl.sdk.p.a()) {
                        h.this.f7497c.d("MediationAdapterWrapper", h.this.f7500f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7615a.a(e3Var, maxReward, bundle);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Bundle bundle) {
            this.f7517a.d(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f7517a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bundle bundle) {
            this.f7517a.a(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (h.this.f7503i.x().get()) {
                com.applovin.impl.sdk.p unused = h.this.f7497c;
                if (com.applovin.impl.sdk.p.a()) {
                    h.this.f7497c.b("MediationAdapterWrapper", h.this.f7500f + ": blocking ad load failed callback for " + h.this.f7503i + " since onAdHidden() has been called");
                }
                h.this.f7496b.u().a(h.this.f7503i, str);
                return;
            }
            a(str, this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7581a.a(maxError);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError) {
            if (h.this.f7511q.compareAndSet(false, true)) {
                this.f7517a.onAdLoadFailed(h.this.f7502h, maxError);
            }
        }

        private void a(String str, final Bundle bundle) {
            if (!h.this.f7503i.x().get()) {
                if (!((Boolean) h.this.f7496b.a(t3.J8)).booleanValue()) {
                    if (h.this.f7503i.u().compareAndSet(false, true)) {
                        a(str, this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.x0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7636a.h(bundle);
                            }
                        });
                        return;
                    }
                    return;
                }
                a(str, this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7632a.g(bundle);
                    }
                });
                return;
            }
            com.applovin.impl.sdk.p unused = h.this.f7497c;
            if (com.applovin.impl.sdk.p.a()) {
                h.this.f7497c.b("MediationAdapterWrapper", h.this.f7500f + ": blocking ad displayed callback for " + h.this.f7503i + " since onAdHidden() has been called");
            }
            h.this.f7496b.u().a(h.this.f7503i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError, final Bundle bundle) {
            if (h.this.f7503i.x().get()) {
                com.applovin.impl.sdk.p unused = h.this.f7497c;
                if (com.applovin.impl.sdk.p.a()) {
                    h.this.f7497c.b("MediationAdapterWrapper", h.this.f7500f + ": blocking ad display failed callback for " + h.this.f7503i + " since onAdHidden() has been called");
                }
                h.this.f7496b.u().a(h.this.f7503i, str);
                return;
            }
            a(str, this.f7517a, new Runnable() { // from class: com.applovin.impl.mediation.a1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7199a.a(maxError, bundle);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f7517a.a(h.this.f7503i, maxError, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(e3 e3Var, MaxReward maxReward, Bundle bundle) {
            this.f7517a.a(e3Var, maxReward, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Bundle bundle) {
            this.f7517a.a(h.this.f7503i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            this.f7517a.onAdCollapsed(h.this.f7503i);
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            h.this.f7495a.post(new Runnable() { // from class: com.applovin.impl.mediation.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7627a.a(runnable, maxAdListener, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + (maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                h.this.f7496b.E().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", h.this.f7499e.b()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: classes.dex */
    static class c implements MaxAdapter.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f7519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m3 f7520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MaxAdapter.OnCompletionListener f7522d;

        public c(com.applovin.impl.sdk.l lVar, m3 m3Var, long j10, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f7519a = lVar;
            this.f7520b = m3Var;
            this.f7521c = j10;
            this.f7522d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.c1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7360a.a(initializationStatus, str);
                }
            }, this.f7520b.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f7519a.U().a(this.f7520b, SystemClock.elapsedRealtime() - this.f7521c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.f7522d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class d extends k5 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f7523g;

        /* synthetic */ d(h hVar, a aVar) {
            this();
        }

        private void b(a3 a3Var) {
            if (a3Var != null) {
                this.f6990a.b0().a(a3Var);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f7511q.get()) {
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, h.this.f7500f + " is timing out " + h.this.f7503i + "...");
            }
            b(h.this.f7503i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            b bVar = (b) this.f7523g.get();
            if (bVar != null) {
                bVar.a(this.f6991b, maxErrorImpl);
            }
        }

        private d() {
            super("TaskTimeoutMediatedAd", h.this.f7496b);
            this.f7523g = new WeakReference(h.this.f7508n);
        }
    }

    h(m3 m3Var, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.l lVar) {
        if (m3Var == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f7498d = m3Var.c();
        this.f7501g = maxAdapter;
        this.f7496b = lVar;
        this.f7497c = lVar.Q();
        this.f7499e = m3Var;
        this.f7500f = maxAdapter.getClass().getSimpleName();
        this.f7513s = z10;
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f7500f + "'}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        a("destroy");
        MaxAdapter maxAdapter = this.f7501g;
        if (maxAdapter != null) {
            this.f7501g = null;
            maxAdapter.onDestroy();
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f7497c.k("MediationAdapterWrapper", "Mediation adapter '" + this.f7500f + "' is already destroyed");
        }
        this.f7504j = null;
        this.f7505k = null;
        this.f7506l = null;
        this.f7507m = null;
    }

    public MaxNativeAdView f() {
        return this.f7506l;
    }

    public String g() {
        return this.f7498d;
    }

    public ViewGroup h() {
        return this.f7507m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f7501g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f7498d, th);
            this.f7496b.E().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f7499e.b()));
            a("sdk_version");
            this.f7496b.V().a(this.f7499e.b(), "sdk_version", this.f7503i);
            return null;
        }
    }

    public boolean j() {
        return this.f7511q.get() && this.f7512r.get();
    }

    public boolean k() {
        return this.f7510p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f7501g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f7508n);
    }

    public MediationServiceImpl.b c() {
        return this.f7508n.f7517a;
    }

    public View d() {
        return this.f7504j;
    }

    public MaxNativeAd e() {
        return this.f7505k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f7501g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f7508n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f7501g).loadNativeAd(maxAdapterResponseParameters, activity, this.f7508n);
    }

    void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        b("initialize", new Runnable() { // from class: com.applovin.impl.mediation.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7525a.a(onCompletionListener, maxAdapterInitializationParameters, activity);
            }
        });
    }

    public void b(a3 a3Var, final Activity activity) {
        Runnable runnable;
        if (a(a3Var, activity)) {
            if (a3Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7634a.a(activity);
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7466a.b(activity);
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7480a.c(activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, a3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7497c.a("MediationAdapterWrapper", "Initializing " + this.f7500f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f7499e.r());
        }
        this.f7501g.initialize(maxAdapterInitializationParameters, activity, new c(this.f7496b, this.f7499e, jElapsedRealtime, onCompletionListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedAdapter) this.f7501g).showRewardedAd(this.f7509o, activity, this.f7508n);
    }

    void a(String str, a3 a3Var) {
        this.f7502h = str;
        this.f7503i = a3Var;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f7506l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f7507m = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity) {
        ((MaxAppOpenAdapter) this.f7501g).showAppOpenAd(this.f7509o, activity, this.f7508n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final a3 a3Var, final Activity activity, MediationServiceImpl.b bVar) {
        final Runnable runnable;
        if (a3Var != null) {
            if (!this.f7510p.get()) {
                String str2 = "Mediation adapter '" + this.f7500f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f7509o = maxAdapterResponseParameters;
            this.f7508n.a(bVar);
            final MaxAdFormat format = a3Var.getFormat();
            if (format == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7563a.a(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7573a.b(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7638a.c(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format == MaxAdFormat.NATIVE) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7642a.d(maxAdapterResponseParameters, activity);
                    }
                };
            } else if (format.isAdViewAd()) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7195a.a(maxAdapterResponseParameters, format, activity);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(Constants.LOAD_AD, format, new Runnable() { // from class: com.applovin.impl.mediation.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7347a.a(a3Var, runnable);
                }
            });
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ViewGroup viewGroup, androidx.lifecycle.f fVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f7501g).showRewardedAd(this.f7509o, viewGroup, fVar, activity, this.f7508n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f7501g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f7498d, th);
            this.f7496b.E().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f7499e.b()));
            a("adapter_version");
            this.f7496b.V().a(this.f7499e.b(), "adapter_version", this.f7503i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f7501g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f7508n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f7501g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f7508n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a3 a3Var, Runnable runnable) {
        a(this.f7499e, a3Var);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f7498d + " due to: " + th;
            com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str);
            this.f7508n.a(Constants.LOAD_AD, new MaxErrorImpl(-1, str));
            this.f7496b.E().a("MediationAdapterWrapper", Constants.LOAD_AD, th, CollectionUtils.hashMap("adapter_class", this.f7499e.b()));
            a(Constants.LOAD_AD);
            this.f7496b.V().a(this.f7499e.b(), Constants.LOAD_AD, this.f7503i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        ((MaxInterstitialAdapter) this.f7501g).showInterstitialAd(this.f7509o, activity, this.f7508n);
    }

    public void a(a3 a3Var, final ViewGroup viewGroup, final androidx.lifecycle.f fVar, final Activity activity) {
        Runnable runnable;
        if (a(a3Var, activity)) {
            if (a3Var.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7356a.a(viewGroup, fVar, activity);
                    }
                };
            } else if (a3Var.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7392a.b(viewGroup, fVar, activity);
                    }
                };
            } else {
                throw new IllegalStateException(cTJaRZ.CthhKKgkdB + a3Var + ": " + a3Var.getFormat() + " is not a supported ad format");
            }
            a(runnable, a3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, androidx.lifecycle.f fVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f7501g).showInterstitialAd(this.f7509o, viewGroup, fVar, activity, this.f7508n);
    }

    private boolean a(a3 a3Var, Activity activity) {
        if (a3Var != null) {
            if (a3Var.B() == null) {
                com.applovin.impl.sdk.p.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f7508n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (a3Var.B() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != a3Var.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f7510p.get()) {
                    String str = "Mediation adapter '" + this.f7500f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str);
                    this.f7508n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException("Mediation adapter '" + this.f7500f + "' does not have an ad loaded. Please load an ad first");
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(final Runnable runnable, a3 a3Var) {
        a3Var.g0();
        a("show_ad", a3Var.getFormat(), new Runnable() { // from class: com.applovin.impl.mediation.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7538a.a(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f7498d + " due to: " + th;
            com.applovin.impl.sdk.p.h("MediationAdapterWrapper", str);
            this.f7508n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f7496b.E().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f7499e.b()));
            a("show_ad");
            this.f7496b.V().a(this.f7499e.b(), "show_ad", this.f7503i);
        }
    }

    void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final f5 f5Var, final Activity activity, final u4 u4Var) {
        if (u4Var != null) {
            if (!this.f7510p.get()) {
                com.applovin.impl.sdk.p.h("MediationAdapterWrapper", "Mediation adapter '" + this.f7500f + CwEo.KoXJrHq);
                u4Var.a(new MaxErrorImpl("The adapter (" + this.f7500f + ") is disabled"));
                return;
            }
            MaxAdapter maxAdapter = this.f7501g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7554a.a(maxSignalProvider, maxAdapterSignalCollectionParameters, activity, f5Var, u4Var);
                    }
                });
                return;
            }
            u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "The adapter (" + this.f7500f + ") does not support signal collection"));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, f5 f5Var, u4 u4Var) {
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(f5Var, u4Var));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f7498d + " due to: " + th);
            com.applovin.impl.sdk.p.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            u4Var.a(maxErrorImpl);
            this.f7496b.E().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f7499e.b()));
            a("collect_signal");
            this.f7496b.V().a(this.f7499e.b(), "collect_signal", this.f7503i);
        }
        if (!u4Var.d() && f5Var.m() == 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7497c.a("MediationAdapterWrapper", "Failing signal collection " + f5Var + " since it has 0 timeout");
            }
            u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + this.f7500f + ") has 0 timeout"));
        }
    }

    void a() {
        if (this.f7513s) {
            return;
        }
        b("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7494a.l();
            }
        });
    }

    private void a(m3 m3Var, a3 a3Var) {
        a(new d(this, null), m3Var, a3Var);
    }

    private void a(k5 k5Var, m3 m3Var, a3 a3Var) {
        long jM = m3Var.m();
        if (jM <= 0) {
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVar = this.f7497c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Non-positive timeout set for ");
                if (a3Var != null) {
                    m3Var = a3Var;
                }
                sb2.append(m3Var);
                sb2.append(", not scheduling a timeout");
                pVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVar2 = this.f7497c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting timeout ");
            sb3.append(jM);
            sb3.append("ms for ");
            if (a3Var != null) {
                m3Var = a3Var;
            }
            sb3.append(m3Var);
            pVar2.a("MediationAdapterWrapper", sb3.toString());
        }
        this.f7496b.s0().a(k5Var, f6.b.TIMEOUT, jM);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7497c.d("MediationAdapterWrapper", "Marking " + this.f7500f + " as disabled due to: " + str);
        }
        this.f7510p.set(false);
    }

    private void a(final String str, MaxAdFormat maxAdFormat, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7544a.a(str, runnable);
            }
        };
        if (a(str, maxAdFormat)) {
            this.f7495a.post(runnable2);
            return;
        }
        u6 u6Var = new u6(this.f7496b, str + ":" + this.f7499e.c(), runnable2);
        if (((Boolean) this.f7496b.a(z4.Z)).booleanValue()) {
            this.f7496b.s0().a(u6Var, this.f7499e);
        } else {
            this.f7496b.s0().a(u6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7497c.a("MediationAdapterWrapper", this.f7500f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7497c.a("MediationAdapterWrapper", this.f7500f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("MediationAdapterWrapper", "Failed operation " + str + " for " + this.f7498d, th);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fail_");
            sb2.append(str);
            a(sb2.toString());
            if (!str.equals("destroy")) {
                this.f7496b.V().a(this.f7499e.b(), str, this.f7503i);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("is_wrapper", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            CollectionUtils.putStringIfValid("adapter_class", this.f7499e.b(), mapHashMap);
            this.f7496b.E().a("MediationAdapterWrapper", str, th, mapHashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean boolJ0;
        Boolean boolL0;
        Boolean boolK0;
        MaxAdapter maxAdapter = this.f7501g;
        if (maxAdapter == null) {
            return this.f7499e.r();
        }
        if ("initialize".equals(str)) {
            Boolean boolShouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (boolShouldInitializeOnUiThread != null) {
                return boolShouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean boolShouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (boolShouldCollectSignalsOnUiThread != null) {
                return boolShouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if (Constants.LOAD_AD.equals(str) && maxAdFormat != null) {
            a3 a3Var = this.f7503i;
            if (a3Var != null && (boolK0 = a3Var.k0()) != null) {
                return boolK0.booleanValue();
            }
            Boolean boolShouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (boolShouldLoadAdsOnUiThread != null) {
                return boolShouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null) {
            a3 a3Var2 = this.f7503i;
            if (a3Var2 != null && (boolL0 = a3Var2.l0()) != null) {
                return boolL0.booleanValue();
            }
            Boolean boolShouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat);
            if (boolShouldShowAdsOnUiThread != null) {
                return boolShouldShowAdsOnUiThread.booleanValue();
            }
        } else if ("destroy".equals(str)) {
            a3 a3Var3 = this.f7503i;
            if (a3Var3 != null && (boolJ0 = a3Var3.j0()) != null) {
                return boolJ0.booleanValue();
            }
            Boolean boolShouldDestroyOnUiThread = maxAdapter.shouldDestroyOnUiThread();
            if (boolShouldDestroyOnUiThread != null) {
                return boolShouldDestroyOnUiThread.booleanValue();
            }
            return true;
        }
        return this.f7499e.r();
    }
}
