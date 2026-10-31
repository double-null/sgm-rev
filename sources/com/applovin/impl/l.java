package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import c2.YDwL.tFQWuE;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends p3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdRevenueListener, w.a, MaxAdViewAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f7019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k8 f7020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f7021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f7022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f7023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f7024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f7025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f7026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f7027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxAd f7028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f7029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f7030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f7031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f7032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f7033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f7034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private w f7035r;

    /* JADX INFO: loaded from: classes.dex */
    class a extends MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f7028k != null) {
                l.this.f7027j.destroy(l.this.f7028k);
            }
            l.this.f7028k = maxAd;
            l.this.f7027j.render(l.this.f7026i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.f7018a;
    }

    public void initialize(final n nVar, final o oVar, k8 k8Var, final com.applovin.impl.sdk.l lVar) {
        List listA;
        this.f7018a = lVar;
        this.f7019b = nVar;
        this.f7020c = k8Var;
        this.f7030m = lVar.u0().b();
        m mVar = new m(nVar, oVar, k8Var, this);
        this.f7021d = mVar;
        mVar.a(new u2.a() { // from class: com.applovin.impl.tb
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                this.f8838a.a(lVar, nVar, oVar, l2Var, t2Var);
            }
        });
        b();
        if (nVar.f().f()) {
            if ((k8Var != null && !k8Var.b().d().C()) || (listA = lVar.W().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f7035r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
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
        this.f7033p.setControlState(AdControlButton.b.LOAD);
        this.f7034q.setText("");
        if (204 == maxError.getCode()) {
            q7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        q7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f7034q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f7033p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f7022e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f7019b.a()) {
            a(this.f7026i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f7018a.u0().c()) {
            q7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f7021d.j() != this.f7019b.f()) {
            q7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f7019b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f7035r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f7021d.k());
        this.f7031n = (ListView) findViewById(R.id.listView);
        this.f7032o = findViewById(R.id.ad_presenter_view);
        this.f7033p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f7034q = (TextView) findViewById(R.id.status_textview);
        this.f7031n.setAdapter((ListAdapter) this.f7021d);
        this.f7034q.setText(a());
        this.f7034q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7033p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f7032o.setBackground(layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        VMRunner.invoke("rBDX2Wc0ASzYW091", new Object[]{this});
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f7033p.setControlState(AdControlButton.b.LOAD);
        this.f7034q.setText("");
        q7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + CwEo.hIoWqzCcvr + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.l lVar, final n nVar, final o oVar, l2 l2Var, final t2 t2Var) {
        if (t2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, lVar.e(), new d.b() { // from class: com.applovin.impl.sb
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(t2Var, nVar, oVar, lVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    private void b() {
        String strC = this.f7019b.c();
        if (this.f7019b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f7019b.a());
            this.f7022e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f7022e.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7022e.setExtraParameter("disable_precache", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7022e.setExtraParameter("allow_pause_auto_refresh_immediately", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7022e.stopAutoRefresh();
            this.f7022e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f7019b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f7023f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7023f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f7019b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f7024g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7024g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f7019b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f7025h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7025h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f7019b.a()) {
            this.f7026i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.l.p());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f7027j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            this.f7027j.setNativeAdListener(new a());
            this.f7027j.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        boolean zIsAdViewAd = maxAdFormat.isAdViewAd();
        String str = WKirgUEJJ.ECV;
        if (zIsAdViewAd) {
            this.f7022e.setLocalExtraParameter(str, dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7023f.setLocalExtraParameter(str, dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7024g.setLocalExtraParameter(str, dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7025h.setLocalExtraParameter(str, dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7027j.setLocalExtraParameter(str, dTBAdResponse);
        }
        a(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(t2 t2Var, n nVar, o oVar, com.applovin.impl.sdk.l lVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) t2Var).v(), lVar);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7022e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7023f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7024g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7025h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7027j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tFQWuE.DVfaaW);
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        k8 k8Var = this.f7020c;
        sb2.append(k8Var != null ? k8Var.b().a() : this.f7021d.j().c());
        com.applovin.impl.sdk.p.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f7020c != null) {
            this.f7018a.u0().a(this.f7020c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f7022e.setPlacement("[Mediation Debugger Live Ad]");
            this.f7022e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f7019b.a()) {
            this.f7023f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f7019b.a()) {
            this.f7024g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f7019b.a()) {
            this.f7025h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f7019b.a()) {
            this.f7027j.setPlacement("[Mediation Debugger Live Ad]");
            this.f7027j.loadAd();
        } else {
            q7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f7029l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f7029l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.rb
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8141a.a(dialogInterface);
            }
        });
        this.f7029l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f7029l = null;
    }

    private String a() {
        if (this.f7018a.u0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        return this.f7021d.j() != this.f7019b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        k8 k8Var = this.f7020c;
        sb2.append(k8Var != null ? k8Var.b().a() : this.f7021d.j().c());
        com.applovin.impl.sdk.p.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f7022e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f7019b.a()) {
            this.f7023f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f7019b.a()) {
            this.f7024g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f7019b.a()) {
            this.f7025h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f7019b.a()) {
            a(this.f7026i, MaxAdFormat.MREC.getSize());
        }
    }
}
