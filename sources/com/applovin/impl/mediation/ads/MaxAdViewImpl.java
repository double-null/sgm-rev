package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.a3;
import com.applovin.impl.d3;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.h8;
import com.applovin.impl.i8;
import com.applovin.impl.k5;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.p0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements com.applovin.impl.sdk.g.a, i8.a, com.applovin.impl.j.b {
    private static final Map E = new HashMap();
    private static final Object F = new Object();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdView f7203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f7205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d3 f7207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f7210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f7211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f7212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.g f7213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final h8 f7214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i8 f7215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f7216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f7217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d3 f7218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MaxAd f7219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f7223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7225x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7226y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f7227z;

    /* JADX INFO: loaded from: classes.dex */
    private class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            v2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.Z().destroyAd(maxAd);
                return;
            }
            d3 d3Var = (d3) maxAd;
            d3Var.g(MaxAdViewImpl.this.f7208g);
            d3Var.f(MaxAdViewImpl.this.f7209h);
            if (d3Var.z() == null) {
                MaxAdViewImpl.this.sdk.Z().destroyAd(d3Var);
                onAdLoadFailed(d3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (d3Var.z0()) {
                long jU0 = d3Var.u0();
                MaxAdViewImpl.this.sdk.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl.this.sdk.Q().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jU0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.f7213l.a(jU0);
                if (MaxAdViewImpl.this.f7213l.g() || MaxAdViewImpl.this.f7222u) {
                    com.applovin.impl.sdk.p pVar2 = MaxAdViewImpl.this.logger;
                    if (com.applovin.impl.sdk.p.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f7213l.j();
                }
            }
            com.applovin.impl.sdk.p pVar3 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            v2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(d3Var);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, com.applovin.impl.mediation.ads.a.InterfaceC0112a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7218q)) {
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7219r)) {
                MaxAdViewImpl.this.f7219r = null;
                if ((MaxAdViewImpl.this.f7218q.A0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.f7220s) {
                    MaxAdViewImpl.this.f7220s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f7218q)) {
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7218q)) {
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7218q)) {
                MaxAdViewImpl.this.f7219r = maxAd;
                if ((MaxAdViewImpl.this.f7218q.A0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.f7213l.g()) {
                    MaxAdViewImpl.this.f7220s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7218q)) {
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                v2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            v2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            v2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f7225x) {
                com.applovin.impl.sdk.p pVar = MaxAdViewImpl.this.logger;
                if (com.applovin.impl.sdk.p.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(t3.S7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            com.applovin.impl.sdk.p pVar2 = MaxAdViewImpl.this.logger;
            if (com.applovin.impl.sdk.p.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.Z().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f7204c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f7206e = Long.MAX_VALUE;
        this.f7216o = new Object();
        this.f7217p = new Object();
        this.f7218q = null;
        this.f7219r = null;
        this.f7223v = new AtomicBoolean();
        this.f7225x = false;
        this.f7202a = context.getApplicationContext();
        this.f7203b = maxAdView;
        this.f7205d = view;
        this.f7211j = new b();
        this.f7212k = new d();
        this.f7213l = new com.applovin.impl.sdk.g(this.sdk, this);
        this.f7214m = new h8(maxAdView, this.sdk);
        this.f7215n = new i8(maxAdView, this.sdk, this);
        this.f7210i = maxAdViewConfiguration;
        this.sdk.k().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        a(str);
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(t3.T7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7288a.g();
                }
            });
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f7208g;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.g.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(t3.S7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        d3 d3Var = this.f7218q;
        if (d3Var != null && d3Var.T().equalsIgnoreCase(str)) {
            this.f7218q.h(str2);
            v2.b(this.adReviewListener, str2, this.f7218q);
            return;
        }
        d3 d3Var2 = this.f7207f;
        if (d3Var2 == null || !d3Var2.T().equalsIgnoreCase(str)) {
            return;
        }
        this.f7207f.h(str2);
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.f7218q, this.f7214m.a(this.f7218q));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(t3.P7)).booleanValue() && this.f7213l.h()) {
            if (g8.b(i10)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f7213l.d();
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f7213l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f7218q != null && com.applovin.impl.sdk.p.a()) {
            this.logger.k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        q7.b(str, this.tag);
        this.f7209h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f7218q != null && com.applovin.impl.sdk.p.a()) {
            this.logger.k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f7208g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f7206e = i10;
    }

    public void startAutoRefresh() {
        this.f7222u = false;
        if (!this.f7213l.g()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f7213l.m();
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f7213l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f7218q == null) {
            if (this.f7226y || ((Boolean) this.sdk.a(t3.R7)).booleanValue()) {
                this.f7222u = true;
                return;
            } else {
                com.applovin.impl.sdk.p.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f7213l.b() + "ms");
        }
        this.f7213l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f7203b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        sb2.append(a());
        sb2.append('}');
        return sb2.toString();
    }

    private void e() {
        this.f7223v.set(false);
        if (this.f7207f != null) {
            i();
            return;
        }
        if (!b()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else if (this.f7221t) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(com.applovin.impl.i.REFRESH);
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f7223v.set(true);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f7217p) {
            z10 = false;
            this.f7223v.set(false);
            z11 = this.f7207f != null;
            if (!z11) {
                if (b()) {
                    if (!this.f7221t) {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                        }
                        this.f7223v.set(true);
                    } else if (com.applovin.impl.sdk.p.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                    }
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network...");
                }
                z10 = true;
            }
        }
        if (z11) {
            i();
        } else if (z10) {
            loadAd(com.applovin.impl.i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f7207f != null) {
            this.sdk.Z().destroyAd(this.f7207f);
        }
        synchronized (this.f7216o) {
            this.f7225x = true;
        }
        this.f7213l.a();
        this.sdk.k().b(this);
        if (this.sdk.T() != null) {
            this.sdk.T().c(this.adUnitId, this.f7204c);
        } else {
            this.sdk.S().c(this.adUnitId, this.f7204c);
        }
        super.destroy();
    }

    private void h() {
        d3 d3Var;
        if (this.f7203b != null) {
            if (((Boolean) this.sdk.a(z4.Z6)).booleanValue()) {
                com.applovin.impl.s.b(this.f7203b, this.f7205d);
            } else {
                com.applovin.impl.s.a(this.f7203b, this.f7205d);
            }
        }
        this.f7215n.b();
        synchronized (this.f7216o) {
            d3Var = this.f7218q;
        }
        MaxAd maxAd = this.f7219r;
        if (maxAd != null && maxAd.equals(d3Var)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            v2.b(this.f7211j, maxAd);
        }
        if (d3Var != null) {
            this.sdk.Z().destroyAd(d3Var);
        }
    }

    private void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f7207f + "...");
        }
        this.f7211j.onAdLoaded(this.f7207f);
        this.f7207f = null;
    }

    public void loadAd(com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f7226y || ((Boolean) this.sdk.a(t3.R7)).booleanValue();
        if (z10 && !this.f7213l.g() && this.f7213l.h()) {
            com.applovin.impl.sdk.p.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f7213l.b()) + " seconds.");
            return;
        }
        if (!z10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f7211j);
        } else if (this.f7207f != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f7224w) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f7223v.set(true);
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f7211j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final d3 d3Var) {
        View viewZ = d3Var.z();
        String str = viewZ == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f7203b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + d3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, (MaxAd) d3Var, (MaxError) maxErrorImpl, true);
            this.sdk.Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, d3Var);
            return;
        }
        h();
        a((a3) d3Var);
        if (d3Var.t0()) {
            this.f7215n.a(d3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (d3Var.v0() != Long.MAX_VALUE) {
            this.f7205d.setBackgroundColor((int) d3Var.v0());
        } else {
            long j10 = this.f7206e;
            if (j10 != Long.MAX_VALUE) {
                this.f7205d.setBackgroundColor((int) j10);
            } else {
                this.f7205d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewZ);
        a(viewZ, d3Var);
        this.sdk.z().d(d3Var);
        c(d3Var);
        synchronized (this.f7216o) {
            this.f7218q = d3Var;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.Z().processRawAdImpression(d3Var, this.f7211j);
        if (StringUtils.isValidString(this.f7218q.getAdReviewCreativeId())) {
            v2.a(this.adReviewListener, this.f7218q.getAdReviewCreativeId(), (MaxAd) this.f7218q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f7289a.a(d3Var);
            }
        }, d3Var.x0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final d3 d3Var) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f7291a.b(d3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE, this.f7212k);
    }

    private void d() {
        if (b()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f7224w = true;
            this.sdk.s0().a((k5) new u6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7293a.c();
                }
            }), f6.b.MEDIATION);
        }
    }

    private void a(final com.applovin.impl.i iVar, final com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        if (a()) {
            boolean zC = q7.c(this.sdk);
            this.sdk.E().a(f2.f6472b1, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                com.applovin.impl.sdk.p.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f7285a.a(interfaceC0112a, iVar);
            }
        });
    }

    private void c(d3 d3Var) {
        int height = this.f7203b.getHeight();
        int width = this.f7203b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f7202a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f7202a, width);
            MaxAdFormat format = d3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(iPxToDp2, this.f7203b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), p0.b(this.f7202a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n**************************************************\n`MaxAdView` size ");
                sb2.append(iPxToDp2);
                sb2.append("x");
                sb2.append(iPxToDp);
                sb2.append(" dp smaller than required ");
                sb2.append(this.D ? "adaptive " : "");
                sb2.append("size: ");
                sb2.append(iMin);
                sb2.append("x");
                sb2.append(height2);
                sb2.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb2.toString();
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.b("AppLovinSdk", string);
                }
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "container_width_dp", iPxToDp2);
                JsonUtils.putInt(jSONObject, "container_height_dp", iPxToDp);
                JsonUtils.putInt(jSONObject, "required_width_dp", iMin);
                JsonUtils.putInt(jSONObject, "required_height_dp", height2);
                JsonUtils.putBoolean(jSONObject, "is_adaptive", this.D);
                this.sdk.E().a(f2.f6472b1, "adViewContainerUndersized", CollectionUtils.hashMap("details", jSONObject.toString()), this.f7204c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a, com.applovin.impl.i iVar) {
        int adaptiveWidth;
        d3 d3Var = this.f7218q;
        if (d3Var != null) {
            long jA = this.f7214m.a(d3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f7218q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f7203b.getContext(), this.f7203b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f7203b.getContext(), this.f7203b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put(GEmOVMyH.juFUmu, Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f7213l.g() || this.f7222u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f7227z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f7210i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            com.applovin.impl.sdk.p.j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + iPxToDp + " dp).");
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0112a + "...");
        }
        this.sdk.Z().loadAd(this.adUnitId, this.f7204c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.f7202a, interfaceC0112a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f7226y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.f7227z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.B = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Updated force precache to: " + str2);
            }
            this.C = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.f7210i == null) {
                com.applovin.impl.sdk.p.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f7224w = false;
        synchronized (this.f7217p) {
            zCompareAndSet = this.f7223v.compareAndSet(true, false);
            if (!zCompareAndSet) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.logger.a(this.tag, "Saving precache ad...");
                }
                d3 d3Var = (d3) maxAd;
                this.f7207f = d3Var;
                d3Var.g(this.f7208g);
                this.f7207f.f(this.f7209h);
            }
        }
        if (zCompareAndSet) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f7211j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(t3.Y7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d3 d3Var) {
        long jA = this.f7214m.a(d3Var);
        if (!d3Var.t0()) {
            a(d3Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(t3.L7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.sdk.Q().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f7222u && !this.f7213l.g()) {
            this.f7221t = true;
            this.f7224w = false;
            long jLongValue = ((Long) this.sdk.a(t3.K7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.sdk.Q().a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f7213l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f7224w) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f7224w = false;
        }
        if (this.f7223v.get()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            v2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(String str) {
        int iIntValue;
        synchronized (F) {
            Map map = E;
            Integer num = (Integer) map.get(str);
            iIntValue = num != null ? 1 + num.intValue() : 1;
            map.put(str, Integer.valueOf(iIntValue));
        }
        if (iIntValue == ((Integer) this.sdk.a(t3.G8)).intValue()) {
            com.applovin.impl.sdk.p.j(this.tag, "You are creating multiple MaxAdView instances for ad unit (" + str + ")! For best ad performance, please use a single MaxAdView instance and call loadAd() to refresh.");
            this.sdk.E().a(f2.f6472b1, "excessiveAdViewAllocations", CollectionUtils.hashMap("ad_unit_id", str));
        }
    }

    private void a(View view, d3 d3Var) {
        int iY0 = d3Var.y0();
        int iW0 = d3Var.w0();
        int iDpToPx = iY0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iY0);
        int iDpToPx2 = iW0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iW0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : g8.a(this.f7203b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(d3 d3Var, long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.Z().processViewabilityAdImpressionPostback(d3Var, j10, this.f7211j);
    }

    private void a(long j10) {
        if (q7.a(j10, ((Long) this.sdk.a(t3.X7)).longValue()) && !this.C) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f7221t = true;
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f7221t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f7224w = false;
        if (this.f7223v.compareAndSet(true, false)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f7211j.onAdLoaded(maxAd);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        d3 d3Var = (d3) maxAd;
        this.f7207f = d3Var;
        d3Var.g(this.f7208g);
        this.f7207f.f(this.f7209h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f7216o) {
            z10 = this.f7225x;
        }
        return z10;
    }
}
