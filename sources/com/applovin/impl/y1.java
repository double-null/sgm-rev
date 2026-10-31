package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b2.Bo.yeILL;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y1 implements AppLovinBroadcastManager.Receiver, com.applovin.impl.adview.a.b {
    protected int A;
    protected int B;
    protected boolean C;
    private ContentObserver D;
    private Float E;
    protected AppLovinAdClickListener F;
    protected AppLovinAdDisplayListener G;
    protected AppLovinAdVideoPlaybackListener H;
    protected j7 I;
    protected j7 J;
    protected boolean K;
    private final j0 L;
    private boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f9094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f9095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f9096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Activity f9097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f9099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.b f9100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.j.a f9101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdView f9102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f9103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f9104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f9105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final long f9106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f9107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f9108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f9111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected long f9112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f9114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f9115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f9116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f9117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ArrayList f9118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f9119z;

    /* JADX INFO: loaded from: classes.dex */
    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f9096c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f9096c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            y1.this.a("web_view");
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements com.applovin.impl.sdk.j.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.j.a
        public void a(int i10) {
            y1 y1Var = y1.this;
            if (y1Var.B != com.applovin.impl.sdk.j.f8413h) {
                y1Var.C = true;
            }
            com.applovin.impl.adview.b bVarF = y1Var.f9102i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.p pVar = y1.this.f9096c;
                if (com.applovin.impl.sdk.p.a()) {
                    y1.this.f9096c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.j.a(i10) && !com.applovin.impl.sdk.j.a(y1.this.B)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            y1.this.B = i10;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f9124a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Handler handler, com.applovin.impl.sdk.l lVar) {
            super(handler);
            this.f9124a = lVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Float fB = this.f9124a.q().b();
            if (fB == null || y1.this.E == null || fB.equals(y1.this.E)) {
                return;
            }
            String str = fB.floatValue() > y1.this.E.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            y1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            y1.this.E = fB;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class e extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u4 f9126a;

        e(u4 u4Var) {
            this.f9126a = u4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f9126a.b(null);
                y1.this.f9095b.e().b(this);
            }
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface g {
        void a(y1 y1Var);

        void a(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: classes.dex */
    class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f9096c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            v2.a(y1.this.F, appLovinAd);
            y1.this.A++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y1 y1Var = y1.this;
            if (view != y1Var.f9104k || !((Boolean) y1Var.f9095b.a(z4.f9190b2)).booleanValue()) {
                com.applovin.impl.sdk.p pVar = y1.this.f9096c;
                if (com.applovin.impl.sdk.p.a()) {
                    y1.this.f9096c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            y1.f(y1.this);
            if (y1.this.f9094a.O0()) {
                y1.this.e("javascript:al_onCloseButtonTapped(" + y1.this.f9117x + "," + y1.this.f9119z + "," + y1.this.A + ");");
            }
            List listH = y1.this.f9094a.H();
            com.applovin.impl.sdk.p pVar2 = y1.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f9096c.a("AppLovinFullscreenActivity", "Handling close button tap " + y1.this.f9117x + " with multi close delay: " + listH);
            }
            if (listH == null || listH.size() <= y1.this.f9117x) {
                y1.this.a("native_close_button");
                return;
            }
            y1.this.f9118y.add(Long.valueOf(SystemClock.elapsedRealtime() - y1.this.f9111r));
            List listF = y1.this.f9094a.F();
            if (listF != null && listF.size() > y1.this.f9117x) {
                y1 y1Var2 = y1.this;
                y1Var2.f9104k.a((com.applovin.impl.adview.e.a) listF.get(y1Var2.f9117x));
            }
            com.applovin.impl.sdk.p pVar3 = y1.this.f9096c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.f9096c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listH.get(y1.this.f9117x));
            }
            y1.this.f9104k.setVisibility(8);
            y1 y1Var3 = y1.this;
            y1Var3.a(y1Var3.f9104k, ((Integer) listH.get(y1Var3.f9117x)).intValue(), new Runnable() { // from class: com.applovin.impl.wg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9045a.a();
                }
            });
        }

        /* synthetic */ h(y1 y1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            y1.this.f9111r = SystemClock.elapsedRealtime();
        }
    }

    private void B() {
        if (this.f9101h != null) {
            this.f9095b.q().a(this.f9101h);
        }
        if (this.f9100g != null) {
            this.f9095b.e().a(this.f9100g);
        }
    }

    static /* synthetic */ int f(y1 y1Var) {
        int i10 = y1Var.f9117x;
        y1Var.f9117x = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    protected abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j10);

    protected abstract void m();

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
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
            case "com.applovin.render_process_gone":
                if (!this.f9114u) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void q() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.M) {
            a("back_button");
        }
        if (this.f9094a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f9102i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f9102i.destroy();
            this.f9102i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.F = null;
        this.G = null;
        this.H = null;
        this.f9097d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    protected void x() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.K = true;
    }

    public boolean y() {
        return this.f9109p;
    }

    class c extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f9122a;

        c(com.applovin.impl.sdk.l lVar) {
            this.f9122a = lVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!y1.this.z() && a(activity)) {
                y1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (y1.this.z() && a(activity)) {
                y1.this.d();
            }
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(q7.a(activity.getApplicationContext(), EFLCCdIRcb.EuBwmp, this.f9122a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.p.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    private void f(final String str) {
        if (this.f9108o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pg
            @Override // java.lang.Runnable
            public final void run() {
                this.f7869a.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f9094a.T() <= this.f9098e && !com.applovin.impl.d.d(this.f9097d)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f9109p = false;
            long jC = this.f9094a.c();
            if (jC > 0) {
                a(jC).a(u4.f8876i, new u4.b() { // from class: com.applovin.impl.rg
                    @Override // com.applovin.impl.u4.b
                    public final void a(boolean z10, Object obj, Object obj2) {
                        this.f8150a.a(z10, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f9094a.A0().getAndSet(true)) {
            return;
        }
        this.f9095b.s0().a((k5) new p6(this.f9094a, this.f9095b), f6.b.OTHER);
    }

    public AppLovinAdView b() {
        return this.f9102i;
    }

    public void e(boolean z10) {
        this.f9110q = z10;
    }

    public boolean g() {
        return this.f9113t;
    }

    protected boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f9094a.getType();
    }

    protected boolean i() {
        return this.f9097d instanceof AppLovinFullscreenActivity;
    }

    protected void l() {
        if (this.f9109p || this.f9110q || !this.f9108o.compareAndSet(false, true)) {
            return;
        }
        v2.b(this.G, this.f9094a);
        this.f9095b.J().b(this.f9094a);
        HashMap map = new HashMap();
        com.applovin.impl.sdk.ad.b bVar = this.f9094a;
        if (bVar != null) {
            CollectionUtils.putStringIfValid(ShareConstants.FEED_SOURCE_PARAM, bVar.w(), map);
            CollectionUtils.putStringIfValid("details", h2.b(this.f9094a), map);
        }
        this.f9095b.g().a(f2.H, this.f9094a, map);
    }

    protected void n() {
        j7 j7Var = this.I;
        if (j7Var != null) {
            j7Var.d();
        }
    }

    protected void o() {
        j7 j7Var = this.I;
        if (j7Var != null) {
            j7Var.e();
        }
    }

    protected void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f9102i == null || !this.f9094a.u0() || (bVarF = this.f9102i.getController().f()) == null) {
            return;
        }
        this.L.a(bVarF, new f());
    }

    y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f9099f = handler;
        this.f9106m = SystemClock.elapsedRealtime();
        this.f9107n = new AtomicBoolean();
        this.f9108o = new AtomicBoolean();
        this.f9111r = -1L;
        this.f9117x = 0;
        this.f9118y = new ArrayList();
        this.f9119z = 0;
        this.A = 0;
        this.B = com.applovin.impl.sdk.j.f8413h;
        this.M = false;
        this.f9094a = bVar;
        this.f9095b = lVar;
        this.f9096c = lVar.Q();
        this.f9097d = activity;
        this.f9098e = bVar.T();
        this.F = appLovinAdClickListener;
        this.G = appLovinAdDisplayListener;
        this.H = appLovinAdVideoPlaybackListener;
        this.L = new j0(lVar);
        h hVar = new h(this, null);
        if (((Boolean) lVar.a(z4.f9334r2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) lVar.a(z4.f9388x2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(UICvx.WEhlxbpxbi));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(RHIpdOnfgiYkEj.iRY));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        w1 w1Var = new w1(lVar.A0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f9102i = w1Var;
        w1Var.setAdClickListener(hVar);
        this.f9102i.setAdDisplayListener(new a());
        bVar.i().putString("ad_view_address", g8.a(this.f9102i));
        this.f9102i.getController().a(this);
        e2 e2Var = new e2(map, lVar);
        if (e2Var.c()) {
            this.f9103j = new com.applovin.impl.adview.k(e2Var, activity);
        }
        lVar.l().trackImpression(bVar);
        List listH = bVar.H();
        if (bVar.s() < 0 && listH == null) {
            this.f9104k = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.q(), activity);
            this.f9104k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(com.applovin.impl.adview.e.a.WHITE_ON_TRANSPARENT, activity);
        this.f9105l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.og
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7791a.a(view);
            }
        });
        if (bVar.V0()) {
            this.f9101h = new b();
        } else {
            this.f9101h = null;
        }
        this.f9100g = new c(lVar);
        if (bVar.R0()) {
            this.E = lVar.q().b();
            this.D = new d(handler, lVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.D);
        }
    }

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        d("javascript:al_onWindowFocusChanged( " + z10 + " );");
        j7 j7Var = this.J;
        if (j7Var != null) {
            if (z10) {
                j7Var.e();
            } else {
                j7Var.d();
            }
        }
    }

    public void d(boolean z10) {
        this.f9109p = z10;
    }

    public void e(String str) {
        a(str, 0L);
    }

    class f implements j0.c {
        f() {
        }

        @Override // com.applovin.impl.j0.c
        public void a(int i10, int i11) {
            Map mapA = h2.a((AppLovinAdImpl) y1.this.f9094a);
            mapA.putAll(h2.a(y1.this.f9094a));
            mapA.put("details", "detection_count=" + i10 + yeILL.ewECSgcNARkjkA + i11);
            y1.this.f9095b.E().d(f2.T0, mapA);
        }

        @Override // com.applovin.impl.j0.c
        public void a(int i10, int i11, int i12) {
            Map mapA = h2.a((AppLovinAdImpl) y1.this.f9094a);
            mapA.putAll(h2.a(y1.this.f9094a));
            mapA.put("details", "detections_to_report=" + i10 + ",detection_count=" + i11 + ",total_checks=" + i12);
            y1.this.f9095b.E().d(f2.U0, mapA);
            if (((Boolean) y1.this.f9095b.a(z4.f9392x6)).booleanValue()) {
                y1.this.x();
            }
            if (((Boolean) y1.this.f9095b.a(z4.Q0)).booleanValue()) {
                y1.this.f9095b.I().c(y1.this.f9094a, com.applovin.impl.sdk.l.p());
            }
            if (((Boolean) y1.this.f9095b.a(z4.f9356t6)).booleanValue()) {
                y1.this.a("black_view_auto_dismiss");
                return;
            }
            y1 y1Var = y1.this;
            y1Var.M = ((Boolean) y1Var.f9095b.a(z4.f9365u6)).booleanValue();
            if (((Boolean) y1.this.f9095b.a(z4.f9374v6)).booleanValue()) {
                y1.this.A();
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.l lVar, Activity activity, g gVar) {
        y1 b2Var;
        if (bVar instanceof r7) {
            try {
                b2Var = new b2(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + lVar + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                b2Var = new c2(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + lVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                b2Var = new z1(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + lVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        b2Var.B();
        gVar.a(b2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f9109p = true;
            long jF = this.f9094a.f();
            if (jF < 0) {
                return;
            }
            a(new Runnable() { // from class: com.applovin.impl.qg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8026a.j();
                }
            }, jF);
            return;
        }
        f("app_relaunch");
    }

    public void e() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f9114u = true;
    }

    protected void c(boolean z10) {
        a(z10, ((Long) this.f9095b.a(z4.f9325q2)).longValue());
        if (!this.f9094a.t0()) {
            v2.a(this.G, this.f9094a);
        }
        this.f9095b.J().a(this.f9094a);
        if (!this.f9094a.t0() && (this.f9094a.hasVideoUrl() || h())) {
            v2.a(this.H, this.f9094a);
        }
        new p4(this.f9097d).a(this.f9094a);
        this.f9094a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f9102i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    protected void d(String str) {
        if (this.f9094a.w0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        g8.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.vg
            @Override // java.lang.Runnable
            public final void run() {
                y1.a(gVar, runnable);
            }
        });
    }

    private void b(String str, Map map) {
        e(p8.b(str, map));
    }

    private void d(String str, Map map) {
        e(p8.d(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f9094a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mg
            @Override // java.lang.Runnable
            public final void run() {
                y1.b(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Void r10, Void r11) {
        if (z10) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    protected int c() {
        int iU = this.f9094a.u();
        return (iU <= 0 && ((Boolean) this.f9095b.a(z4.f9316p2)).booleanValue()) ? this.f9115v + 1 : iU;
    }

    private u4 a(long j10) {
        final u4 u4Var = new u4("bringAdActivityToFront");
        final e eVar = new e(u4Var);
        this.f9095b.e().a(eVar);
        Intent intent = new Intent(this.f9097d, (Class<?>) (this.f9094a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f9097d.startActivity(intent);
        a(new Runnable() { // from class: com.applovin.impl.ng
            @Override // java.lang.Runnable
            public final void run() {
                this.f7725a.a(eVar, u4Var);
            }
        }, j10);
        return u4Var;
    }

    protected void c(long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.I = j7.a(j10, this.f9095b, new Runnable() { // from class: com.applovin.impl.ug
            @Override // java.lang.Runnable
            public final void run() {
                this.f8909a.k();
            }
        });
    }

    private void c(String str, Map map) {
        e(p8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, u4 u4Var) {
        this.f9095b.e().b(bVar);
        if (u4Var.d()) {
            return;
        }
        u4Var.a((Object) null);
    }

    protected boolean a(boolean z10) {
        List listA = q7.a(z10, this.f9094a, this.f9095b, this.f9097d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f9095b.a(z4.X0)).booleanValue() && (!q7.a(listA, this.f9094a))) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f9094a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = h2.a((AppLovinAdImpl) this.f9094a);
        if (((Boolean) this.f9095b.a(z4.Z5)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f9095b.a(z4.f9203c6)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.G;
                if (appLovinAdDisplayListener instanceof n2) {
                    v2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                p2.a(this.f9094a, this.G, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f9095b.g().a(f2.G, this.f9094a, mapHashMap);
            return ((Boolean) this.f9095b.a(z4.f9194b6)).booleanValue();
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f9094a.G0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.b(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f9095b.g().a(f2.L, aVar, mapHashMap);
    }

    public void a(p0.a aVar, p0.a aVar2, p0.a aVar3) {
        if (((Boolean) this.f9095b.a(z4.J4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", q7.b(this.f9097d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(p8.a(map));
        }
    }

    public void a(String str) {
        this.f9113t = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9106m;
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f9094a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f9099f.removeCallbacksAndMessages(null);
        com.applovin.impl.sdk.ad.b bVar2 = this.f9094a;
        a("javascript:al_onPoststitialDismiss();", bVar2 != null ? bVar2.x() : 0L);
        if (((Boolean) this.f9095b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar3 = this.f9094a;
            if (bVar3 != null) {
                bVar3.a(str);
            }
            m();
        }
        l();
        this.L.b();
        if (this.f9101h != null) {
            this.f9095b.q().b(this.f9101h);
        }
        if (this.f9100g != null) {
            this.f9095b.e().b(this.f9100g);
        }
        if (this.D != null) {
            this.f9097d.getContentResolver().unregisterContentObserver(this.D);
            this.D = null;
        }
        if (i()) {
            if (this.f9110q) {
                return;
            }
            ((AppLovinFullscreenActivity) this.f9097d).finishFromSdk();
        } else {
            this.f9095b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f9095b.Q().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
            }
            r();
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f9096c == null || !com.applovin.impl.sdk.p.a()) {
            return;
        }
        this.f9096c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    protected void a(final String str, long j10) {
        if (j10 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.tg
            @Override // java.lang.Runnable
            public final void run() {
                this.f8852a.b(str);
            }
        }, j10);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j10, final Runnable runnable) {
        if (j10 >= ((Long) this.f9095b.a(z4.f9182a2)).longValue()) {
            return;
        }
        this.J = j7.a(TimeUnit.SECONDS.toMillis(j10), this.f9095b, new Runnable() { // from class: com.applovin.impl.sg
            @Override // java.lang.Runnable
            public final void run() {
                y1.c(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void a(int i10, boolean z10, boolean z11, long j10) {
        if (this.f9109p || this.f9110q || !this.f9107n.compareAndSet(false, true)) {
            return;
        }
        if (this.f9094a.hasVideoUrl() || h()) {
            v2.a(this.H, this.f9094a, i10, z11);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9106m;
        this.f9095b.l().trackVideoEnd(this.f9094a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i10, z10);
        long jElapsedRealtime2 = this.f9111r != -1 ? SystemClock.elapsedRealtime() - this.f9111r : -1L;
        this.f9095b.l().trackFullScreenAdClosed(this.f9094a, jElapsedRealtime2, this.f9118y, j10, this.C, this.B);
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i10 + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j10 + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f9095b.E().a(f2.V0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.K = true;
    }

    protected void a(boolean z10, long j10) {
        if (this.f9094a.J0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    private void a(String str, Map map) {
        e(p8.a(str, map));
    }

    protected void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f9099f);
    }
}
