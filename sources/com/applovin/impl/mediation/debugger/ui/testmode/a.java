package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.g3;
import com.applovin.impl.p3;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.ServerProtocol;
import com.pairip.VMRunner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends p3 implements MaxRewardedAdListener, AdControlButton.a, MaxAdRevenueListener, w.a, MaxAdViewAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g3 f7406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f7407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f7408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f7409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f7410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f7411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f7412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f7413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f7414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f7415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdControlButton f7417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f7418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f7419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f7420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f7421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f7422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f7423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f7424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f7425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f7426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f7427v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f7428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f7429x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    class C0113a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f7430a;

        C0113a(MaxNativeAdView maxNativeAdView) {
            this.f7430a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f7413h != null) {
                a.this.f7414i.destroy(a.this.f7413h);
            }
            a.this.f7413h = maxAd;
            a.this.f7414i.render(this.f7430a, maxAd);
            a.this.f7426u.removeAllViews();
            a.this.f7426u.addView(this.f7430a);
            a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List listR = this.f7406a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f7406a.m();
        this.f7416k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f7407b.A0(), this);
        this.f7412g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        this.f7412g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f7421p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7421p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.p3
    protected l getSdk() {
        return this.f7407b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f7406a.x() == null || !this.f7406a.x().containsKey(maxAdFormat)) ? this.f7406a.m() : (String) this.f7406a.x().get(maxAdFormat);
    }

    public void initialize(g3 g3Var) {
        this.f7406a = g3Var;
        this.f7407b = g3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        q7.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        q7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        q7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        q7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        q7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        q7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        q7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f7408c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f7409d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7410e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7411f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7412g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7414i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f7429x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f7429x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("WeRgj8puZu310vUv", new Object[]{this, bundle});
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        VMRunner.invoke("YNW7qcLjh5AjITLG", new Object[]{this});
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f7409d.removeAllViews();
        this.f7418m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f7426u.setVisibility(0);
        this.f7425t.setVisibility(8);
        this.f7424s.setBackgroundColor(-1);
        this.f7423r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f7408c.removeAllViews();
        this.f7417l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f7425t.setVisibility(0);
        this.f7426u.setVisibility(8);
        this.f7423r.setBackgroundColor(-1);
        this.f7424s.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f7426u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f7406a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f7414i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7414i.setNativeAdListener(new C0113a(maxNativeAdView));
            this.f7414i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f7422q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7422q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f7426u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f7409d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7410e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f7411f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7412g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7414i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f7408c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f7425t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f7406a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f7407b.A0(), this);
            this.f7409d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7409d.setExtraParameter("disable_precache", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7409d.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7409d.stopAutoRefresh();
            this.f7409d.setListener(this);
            this.f7425t.addView(this.f7409d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f7418m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7418m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f7425t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List listR = this.f7406a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f7407b.A0(), this);
            this.f7410e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7410e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f7419n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7419n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f7406a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f7407b.A0(), this);
            this.f7408c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f7408c.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7408c.setExtraParameter("disable_precache", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7408c.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7408c.stopAutoRefresh();
            this.f7408c.setListener(this);
            frameLayout.addView(this.f7408c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f7417l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7417l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f7406a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7410e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7411f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7412g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f7406a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f7427v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        boolean z11 = maxAdFormat3 == maxAdFormat && this.f7428w.isChecked();
        if (!z10 && !z11) {
            this.f7407b.u0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f7407b.u0().a(this.f7406a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f7408c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f7409d.loadAd();
            this.f7423r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7410e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7411f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7412g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7414i.loadAd();
            this.f7424s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f7418m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f7419n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f7420o;
            }
            if (str.equals(this.f7416k)) {
                return this.f7421p;
            }
            if (str.equals("test_mode_native")) {
                return this.f7422q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f7417l;
    }
}
