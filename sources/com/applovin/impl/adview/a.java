package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.adjust.sdk.Constants;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b5;
import com.applovin.impl.e2;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.g8;
import com.applovin.impl.h2;
import com.applovin.impl.h4;
import com.applovin.impl.j4;
import com.applovin.impl.n2;
import com.applovin.impl.o1;
import com.applovin.impl.p8;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.impl.x2;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f5987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.l f5988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f5989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.p f5990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f5991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f5992g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f5994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.browser.customtabs.f f5996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f5997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f5998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f5999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WebView f6000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f6001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f6002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f6003r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f5993h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f6004s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f6005t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f6006u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f6007v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f6008w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f6009x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f6010y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile boolean f6011z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    class C0102a extends v4 {
        C0102a() {
        }

        @Override // com.applovin.impl.v4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: loaded from: classes.dex */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f5999n != null) {
                a.this.f5999n.setVisibility(8);
            }
        }

        /* synthetic */ c(a aVar, C0102a c0102a) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        class C0103a implements k.a {
            C0103a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f5999n.addView(a.this.f6001p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.p unused = a.this.f5990e;
                if (com.applovin.impl.sdk.p.a()) {
                    a.this.f5990e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f6004s != null) {
                if (a.this.f5999n == null) {
                    com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f6004s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    v2.a(a.this.C, a.this.f6004s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f5988c.g().a(f2.G, a.this.f6004s, mapHashMap);
                    return;
                }
                a.this.u();
                com.applovin.impl.sdk.p unused = a.this.f5990e;
                if (com.applovin.impl.sdk.p.a()) {
                    a.this.f5990e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f6004s.getAdIdNumber() + "...");
                }
                a.b(a.this.f5999n, a.this.f6004s.getSize());
                if (a.this.f6001p != null) {
                    g8.c(a.this.f6001p);
                    a.this.f6001p = null;
                }
                e2 e2Var = new e2(a.this.f5993h, a.this.f5988c);
                if (e2Var.c()) {
                    a.this.f6001p = new k(e2Var, a.this.f5986a);
                    a.this.f6001p.a(new C0103a());
                }
                a.this.f5999n.setAdHtmlLoaded(false);
                a.this.f5999n.a(a.this.f6004s);
                if (a.this.f6004s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f6011z) {
                    return;
                }
                a.this.f6004s.setHasShown(true);
            }
        }

        /* synthetic */ d(a aVar, C0102a c0102a) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f6016a;

        e(a aVar, com.applovin.impl.sdk.l lVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f6016a = aVar;
        }

        private a a() {
            return this.f6016a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.p.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        com.applovin.impl.sdk.ad.b bVar = this.f6004s;
        x2 x2Var = new x2();
        x2Var.a().a(bVar).a(i());
        if (!q7.a(bVar.getSize())) {
            x2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        x2Var.a(this.f5988c);
        x2Var.a();
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", x2Var.toString());
        }
    }

    private void w() {
        if (this.f6004s.P0()) {
            int iC = this.f5988c.q().c();
            if (com.applovin.impl.sdk.j.a(iC)) {
                this.f5999n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f5999n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void x() {
        if (q7.a(this.f5994i)) {
            if (((Boolean) this.f5988c.a(z4.I1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f5988c.a(z4.J1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f5988c.a(z4.K1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f5988c.a(z4.L1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        x();
        if (this.f6004s != null) {
            com.applovin.impl.g.a(this.f5999n, this.f5988c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void B() {
        if (this.f6010y) {
            if (this.f6004s == null || !this.f6004s.Z0()) {
                v2.b(this.B, this.f6004s);
            }
            if (this.f6004s != null && this.f6004s.isOpenMeasurementEnabled() && q7.a(this.f6004s.getSize())) {
                this.f6004s.getAdEventTracker().f();
            }
            if (this.f5999n != null && this.f6006u != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f5990e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f5990e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void C() {
        if (!this.f6010y || this.f6011z) {
            return;
        }
        this.f6011z = true;
    }

    public void D() {
        if (this.f6010y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f6008w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f6011z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return a.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6105a.s();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void v() {
        if ((this.f5986a instanceof o1) && this.f6004s != null && this.f6004s.M() == com.applovin.impl.sdk.ad.b.EnumC0118b.DISMISS) {
            ((o1) this.f5986a).dismiss("postitial_click");
        }
    }

    public void y() {
        if (this.f6006u != null || this.f6007v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "Ad: " + this.f6004s + " closed.");
        }
        a(this.f6003r);
        v2.b(this.B, this.f6004s);
        this.f6004s = null;
    }

    public void z() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f5992g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension2 = -1;
        if (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) {
            iApplyDimension = -1;
        } else {
            iApplyDimension = appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension2 = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f6089a.q();
            }
        });
    }

    private void m() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f5999n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f5987b == null || (bVar = this.f5999n) == null || bVar.getParent() != null) {
            return;
        }
        this.f5987b.addView(this.f5999n);
        b(this.f5999n, this.f6004s.getSize());
        if (this.f6004s.isOpenMeasurementEnabled()) {
            this.f6004s.getAdEventTracker().a((View) this.f5999n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f6006u != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f5990e.a("AppLovinAdView", "Detaching expanded ad: " + this.f6006u.b());
            }
            this.f6007v = this.f6006u;
            this.f6006u = null;
            a(this.f5994i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f6007v;
        if (fVar == null && this.f6006u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f6007v.dismiss();
            this.f6007v = null;
        } else {
            aVarB = this.f6006u.b();
            this.f6006u.dismiss();
            this.f6006u = null;
        }
        v2.a(this.C, aVarB, (AppLovinAdView) this.f5987b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        f().loadUrl("chrome://crash");
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f6004s;
    }

    public androidx.browser.customtabs.f h() {
        return this.f5996k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f5987b;
    }

    public com.applovin.impl.sdk.l j() {
        return this.f5988c;
    }

    public AppLovinAdSize k() {
        return this.f5994i;
    }

    public String l() {
        return this.f5995j;
    }

    public void t() {
        if (this.f5988c == null || this.f5998m == null || this.f5986a == null || !this.f6010y) {
            com.applovin.impl.sdk.p.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f5989d.loadNextAd(this.f5995j, this.f5994i, this.f5998m);
        }
    }

    private void d(boolean z10) {
        if (this.f5990e != null && com.applovin.impl.sdk.p.a() && com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "Destroying...");
        }
        p8.b(this.f5999n, z10);
        this.f5999n = null;
        p8.b(this.f6000o, z10);
        this.f6000o = null;
        this.f5996k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f6011z = true;
    }

    public void c(boolean z10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f5999n;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void c(int i10) {
        String strA = g8.a(i10);
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b("javascript:al_onWindowVisibilityChanged( " + strA + " );");
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.l lVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f5988c = lVar;
            this.f5989d = lVar.l();
            this.f5990e = lVar.Q();
            this.f5991f = AppLovinCommunicator.getInstance(context);
            this.f5994i = appLovinAdSize;
            this.f5995j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f5986a = context;
            this.f5987b = appLovinAdView;
            this.f5997l = new com.applovin.impl.adview.c(this, lVar);
            C0102a c0102a = null;
            this.f6003r = new c(this, c0102a);
            this.f6002q = new d(this, c0102a);
            this.f5998m = new e(this, lVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException(VRfCTjjLv.HVcUCHpBTvhK);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(p8.c(str, map));
    }

    public void c(Uri uri) {
        if (this.f6004s != null && this.f6004s.x0() && this.f6000o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f5988c.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f5988c.Q().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f5986a);
            this.f6000o = webView;
            webView.setWebViewClient(new C0102a());
            this.f6000o.getSettings().setJavaScriptEnabled(true);
            this.f6000o.loadDataWithBaseURL((String) this.f5988c.a(z4.f9357t7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace(EFLCCdIRcb.FhDePikSJXo, queryParameter)), "text/html", Constants.ENCODING, null);
        }
    }

    private void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f6108a.r();
            }
        });
    }

    private void d(String str, Map map) {
        a(p8.d(str, map));
    }

    public void b() {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10) {
        if (this.f5999n != null && this.f6006u != null) {
            a();
        }
        d(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f6004s.getAdEventTracker().c(webView);
        k kVar = this.f6001p;
        if (kVar != null && kVar.a()) {
            h4 adEventTracker = this.f6004s.getAdEventTracker();
            k kVar2 = this.f6001p;
            adEventTracker.b(webView, Collections.singletonList(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f6004s.getAdEventTracker().a((View) webView);
        }
        this.f6004s.getAdEventTracker().h();
        this.f6004s.getAdEventTracker().g();
    }

    protected void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f5997l, this.f5988c, this.f5986a);
            this.f5999n = bVar;
            bVar.setBackgroundColor(0);
            this.f5999n.setWillNotCacheDrawing(false);
            this.f5987b.setBackgroundColor(0);
            this.f5987b.addView(this.f5999n);
            b(this.f5999n, appLovinAdSize);
            if (!this.f6010y) {
                a(this.f6003r);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6095a.o();
                }
            });
            this.f6010y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f5988c.E().a("AppLovinAdView", "initAdWebView", th);
            this.f6009x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f6006u == null && (this.f6004s instanceof com.applovin.impl.sdk.ad.a) && this.f5999n != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f6004s;
            Context context = this.f5986a;
            Activity activityB = context instanceof Activity ? (Activity) context : g8.b(this.f5999n, this.f5988c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f5987b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f5999n);
                }
                f fVar = new f(aVar, this.f5999n, activityB, this.f5988c);
                this.f6006u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.t
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f6099a.a(dialogInterface);
                    }
                });
                this.f6006u.show();
                v2.c(this.C, this.f6004s, (AppLovinAdView) this.f5987b);
                if (this.f6004s.isOpenMeasurementEnabled()) {
                    this.f6004s.getAdEventTracker().a((View) this.f6006u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriF1 = aVar.f1();
            if (uriF1 != null) {
                this.f5989d.trackAndLaunchClick(aVar, i(), this, uriF1, motionEvent);
            }
            this.f5999n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                t();
            }
        }
    }

    public void a(final boolean z10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f6103a.b(z10);
            }
        });
    }

    public void a(String str, Object obj) {
        this.f5993h.put(str, obj);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            q7.b(appLovinAd, this.f5988c);
            if (this.f6010y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = h2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "renderAd", mapA);
                    this.f5988c.g().d(f2.D, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) q7.a(appLovinAd, this.f5988c);
                if (bVar == null) {
                    com.applovin.impl.sdk.p.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    v2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = h2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f5988c.g().d(f2.G, mapA2);
                    return;
                }
                if (bVar == this.f6004s) {
                    com.applovin.impl.sdk.p.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f5988c.a(z4.M1)).booleanValue()) {
                        if (this.B instanceof n2) {
                            v2.a(this.B, "Attempting to show ad again");
                        } else if (!q7.c(this.f5988c)) {
                            this.f5988c.g().a(f2.f6472b1, bVar, CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f5988c.g().a(f2.G, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f5990e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                v2.b(this.B, this.f6004s);
                if (this.f6004s != null && this.f6004s.isOpenMeasurementEnabled()) {
                    this.f6004s.getAdEventTracker().f();
                }
                this.f6008w.set(null);
                this.f6005t = null;
                this.f6004s = bVar;
                if (this.f6004s.isCustomTabsEnabled()) {
                    this.f5996k = this.f5988c.A().a(this);
                    this.f5988c.A().b(this.f6004s.getCustomTabsWarmupUrls(), this.f5996k);
                }
                if (!this.f6011z && q7.a(this.f5994i)) {
                    this.f5988c.l().trackImpression(bVar);
                }
                if (this.f6006u != null) {
                    c();
                }
                a(this.f6002q);
                return;
            }
            com.applovin.impl.sdk.p.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f6011z) {
                c(appLovinAd);
            } else {
                this.f6008w.set(appLovinAd);
                if (com.applovin.impl.sdk.p.a()) {
                    this.f5990e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6097a.a(appLovinAd);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i10) {
        if (!this.f6011z) {
            a(this.f6003r);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f6106a.a(i10);
            }
        });
    }

    private void b(String str) {
        if (((Boolean) this.f5988c.a(z4.I1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(p8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f6004s == null || !this.f6004s.x0()) {
            return;
        }
        if (this.f6000o == null) {
            this.f5988c.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f5988c.Q().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter("event_name");
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f5988c.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f5988c.Q().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f6090a.a(queryParameter2, queryParameter);
            }
        });
    }

    public void a(final WebView webView, String str) {
        if (this.f6004s == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.u
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (((Boolean) this.f5988c.a(z4.C6)).booleanValue()) {
            String strL = this.f6004s.l();
            if (str == null || strL == null || !str.startsWith(strL)) {
                return;
            }
        }
        try {
            if (this.f6004s != this.f6005t) {
                this.f6005t = this.f6004s;
                w();
                this.f5999n.setAdHtmlLoaded(true);
                if (this.B != null) {
                    this.f5988c.z().d(this.f6004s);
                    if (this.f6004s.t0()) {
                        this.f5988c.g().a(f2.F, this.f6004s, CollectionUtils.hashMap("details", h2.b(this.f6004s)));
                    } else {
                        this.f5988c.g().a(f2.E, this.f6004s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f6004s.A())));
                        v2.a(this.B, this.f6004s);
                    }
                    if (this.f6004s.Q0()) {
                        String str2 = (String) this.f5988c.r0().a(b5.T, "");
                        JSONObject jSONObject = new JSONObject();
                        JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                        this.f5999n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                    } else {
                        this.f5999n.a("javascript:al_onAdViewRendered();");
                    }
                    if (this.f6004s.t0()) {
                        this.f5999n.a("javascript:al_onAdRestored( '" + this.f6004s.a0() + "' );");
                    }
                }
                if ((this.f6004s instanceof com.applovin.impl.sdk.ad.a) && this.f6004s.isOpenMeasurementEnabled()) {
                    this.f5988c.s0().a(new u6(this.f5988c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6101a.b(webView);
                        }
                    }), f6.b.OTHER, 500L);
                }
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinAdView", "Exception while notifying ad display listener", th);
            com.applovin.impl.sdk.l lVar = this.f5988c;
            if (lVar != null) {
                lVar.E().a("AppLovinAdView", "onAdHtmlLoaded", th);
            }
        }
    }

    public void a(final MotionEvent motionEvent) {
        a(new Runnable() { // from class: com.applovin.impl.adview.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f6093a.b(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new Runnable() { // from class: com.applovin.impl.adview.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f6096a.p();
            }
        });
    }

    public void a(Uri uri) {
        Context context = this.f5986a;
        Activity activityB = context instanceof Activity ? (Activity) context : g8.b(this.f5999n, this.f5988c);
        if (activityB instanceof AppLovinFullscreenActivity) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) activityB;
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("hide_status_bar", appLovinFullscreenActivity.isHidingStatusBar());
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("hide_navigation_bar", appLovinFullscreenActivity.isHidingNavigationBar());
            appLovinFullscreenActivity.configureSystemUiBars(booleanQueryParameter, booleanQueryParameter2, uri.getBooleanQueryParameter("hide_no_bar", (booleanQueryParameter || booleanQueryParameter2) ? false : true), uri.getBooleanQueryParameter("allow_ad_rendering_within_display_cutout", appLovinFullscreenActivity.isAllowingAdRenderingWithinDisplayCutout()));
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        if (appLovinAdView != null) {
            this.f5989d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent);
        } else if (com.applovin.impl.sdk.p.a()) {
            this.f5990e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        v2.a(this.D, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f6009x.compareAndSet(true, false)) {
            a(this.f5994i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.l lVar = this.f5988c;
            if (lVar != null) {
                lVar.E().a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.l lVar = this.f5988c;
            if (lVar != null) {
                lVar.E().a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f5992g = bVar;
    }

    private void a(String str, Map map) {
        a(p8.a(str, map));
    }

    private void a(String str) {
        if (this.f6004s == null || this.f5999n == null || !q7.a(this.f6004s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f5999n.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f5988c.a(z4.U2)).booleanValue()) {
            p8.a(this.f6000o, str3, this.f5988c);
        } else {
            p8.a(this.f6000o, str3);
        }
    }
}
