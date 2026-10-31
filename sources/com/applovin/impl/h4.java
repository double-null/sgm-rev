package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f6728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f6729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f6730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f6731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f6732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected AdSession f6733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected AdEvents f6734g;

    public h4(AppLovinAdBase appLovinAdBase) {
        this.f6728a = appLovinAdBase;
        this.f6729b = appLovinAdBase.getSdk();
        this.f6730c = appLovinAdBase.getSdk().Q();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f6731d = str;
    }

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.wa
            @Override // java.lang.Runnable
            public final void run() {
                this.f9035a.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f6728a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.d(this.f6731d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f6733f != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.k(this.f6731d, "Attempting to start session again for ad: " + this.f6728a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6730c.a(this.f6731d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f6733f = adSessionCreateAdSession;
            try {
                this.f6734g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f6733f);
                this.f6733f.start();
                this.f6732e = true;
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6730c.a(this.f6731d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6730c.a(this.f6731d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.a(this.f6731d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f6734g.loaded();
    }

    protected void a(AdSession adSession) {
    }

    public void c(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ua
            @Override // java.lang.Runnable
            public final void run() {
                this.f8898a.b(webView);
            }
        });
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new Runnable() { // from class: com.applovin.impl.xa
            @Override // java.lang.Runnable
            public final void run() {
                this.f9074a.b();
            }
        });
    }

    public void g() {
        b("track impression event", new Runnable() { // from class: com.applovin.impl.ya
            @Override // java.lang.Runnable
            public final void run() {
                this.f9158a.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f6734g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f6733f.registerAdView(view);
        this.f6733f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j4 j4Var = (j4) it.next();
            if (j4Var.c() != null) {
                try {
                    this.f6733f.addFriendlyObstruction(j4Var.c(), j4Var.b(), j4Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6730c.a(this.f6731d, "Failed to add friendly obstruction (" + j4Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f6733f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f6732e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6730c.a(this.f6731d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.a(this.f6731d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(final View view, final List list) {
        b("update main view: " + view, new Runnable() { // from class: com.applovin.impl.va
            @Override // java.lang.Runnable
            public final void run() {
                this.f8959a.a(view, list);
            }
        });
    }

    public void b(final String str) {
        b("track error", new Runnable() { // from class: com.applovin.impl.sa
            @Override // java.lang.Runnable
            public final void run() {
                this.f8181a.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f6732e = false;
        this.f6733f.finish();
        this.f6733f = null;
        this.f6734g = null;
    }

    protected void b(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ta
            @Override // java.lang.Runnable
            public final void run() {
                this.f8835a.a(str, runnable);
            }
        });
    }
}
