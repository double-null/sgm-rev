package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.h2;
import com.applovin.impl.l0;
import com.applovin.impl.p0;
import com.applovin.impl.p8;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.impl.v4;
import com.applovin.impl.z4;
import com.applovin.impl.z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b extends l0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f6038j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f6039k = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f6042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f6045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f6046i;

    class a extends v4 {
        a() {
        }

        @Override // com.applovin.impl.v4
        protected Map a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.l lVar, Context context) {
        super(context);
        this.f6045h = new ArrayList();
        this.f6046i = new Object();
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f6041d = lVar;
        this.f6040c = lVar.Q();
        Integer num = (Integer) lVar.a(z4.K6);
        if (num.intValue() > 0) {
            synchronized (f6039k) {
                Set set = f6038j;
                set.add(this);
                q7.a("AdWebView", set.size(), num.intValue(), lVar.E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new com.applovin.impl.t(cVar != null ? cVar.d() : null, lVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (p0.g() && ((Boolean) lVar.a(z4.f9230f6)).booleanValue()) {
            setWebViewRenderProcessClient(new d(lVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return b.a(view, motionEvent);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.c0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f6051a.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f6043f = true;
        this.f6044g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f6042e;
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f6044g = z10;
        if (z10 && ((Boolean) this.f6041d.a(z4.C6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f6046i) {
            Iterator it = this.f6045h.iterator();
            while (it.hasNext()) {
                p8.a(this, (String) it.next(), "AdWebView", this.f6041d);
            }
            this.f6045h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.p.a()) {
            return true;
        }
        this.f6040c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.f6043f) {
            this.f6042e = bVar;
            try {
                applySettings(bVar);
                if (q7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.l(), ((com.applovin.impl.sdk.ad.a) bVar).h1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6040c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof r7) {
                    r7 r7Var = (r7) bVar;
                    u7 u7VarG1 = r7Var.g1();
                    if (u7VarG1 != null) {
                        z7 z7VarE = u7VarG1.e();
                        Uri uriC = z7VarE.c();
                        String string = uriC != null ? uriC.toString() : "";
                        String strB = z7VarE.b();
                        String strI1 = r7Var.i1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6040c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (z7VarE.d() == z7.a.STATIC) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6040c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f6041d.a(z4.S4), string);
                            if (r7Var.x1() && r7Var.isOpenMeasurementEnabled() && r7Var.y1()) {
                                strA = this.f6041d.g0().a(strA, h2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.l(), strA, "text/html", null, "");
                            return;
                        }
                        if (z7VarE.d() == z7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strI1, strB);
                                String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6040c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.l(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6040c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.l(), strI1, this.f6041d, r7Var);
                                return;
                            }
                            return;
                        }
                        if (z7VarE.d() == z7.a.IFRAME) {
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6040c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(string, bVar.l(), strI1, this.f6041d, r7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strI1, strB);
                                    String str2 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.p.a()) {
                                        this.f6040c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                    }
                                    loadDataWithBaseURL(bVar.l(), str2, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6040c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6040c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.p.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void a(String str) {
        if (((Boolean) this.f6041d.a(z4.C6)).booleanValue()) {
            if (this.f6044g) {
                p8.a(this, str, "AdWebView", this.f6041d);
                return;
            }
            synchronized (this.f6045h) {
                this.f6045h.add(str);
            }
            return;
        }
        p8.a(this, str, "AdWebView", this.f6041d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.l lVar, r7 r7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6040c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + strA);
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) lVar.a(z4.T4), str);
        if (StringUtils.isValidString(strA2)) {
            if (r7Var.x1() && r7Var.isOpenMeasurementEnabled()) {
                strA2 = lVar.g0().a(strA2, h2.a((AppLovinAdImpl) r7Var));
            }
            String str4 = strA2;
            if (com.applovin.impl.sdk.p.a()) {
                this.f6040c.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6040c.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
    }
}
