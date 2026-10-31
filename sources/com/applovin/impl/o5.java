package com.applovin.impl;

import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o5 extends n5 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f7757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f7758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7760u;

    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                o5.this.f7757r.n1();
                o5.this.f7757r.a(uri);
            }
        }
    }

    class b implements n5.c {
        b() {
        }

        @Override // com.applovin.impl.n5.c
        public void a(String str) {
            o5.this.f7757r.d(o5.this.c(str));
            o5.this.f7757r.b(true);
            com.applovin.impl.sdk.p pVar = o5.this.f6992c;
            if (com.applovin.impl.sdk.p.a()) {
                o5 o5Var = o5.this;
                o5Var.f6992c.a(o5Var.f6991b, "Finish caching non-video resources for ad #" + o5.this.f7757r.getAdIdNumber());
            }
            o5 o5Var2 = o5.this;
            o5Var2.f6992c.f(o5Var2.f6991b, "Ad updated with cachedHTML = " + o5.this.f7757r.h1());
        }
    }

    public o5(com.applovin.impl.sdk.ad.a aVar, long j10, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, lVar, appLovinAdLoadListener);
        this.f7757r = aVar;
        this.f7758s = j10;
    }

    private void j() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Caching non-optional HTML resources...");
        }
        this.f7757r.d(c(a(this.f7757r.h1(), this.f7757r.V(), this.f7757r)));
        this.f7757r.b(true);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Finish caching non-optional HTML resources for ad #" + this.f7757r.getAdIdNumber());
        }
        this.f6992c.f(this.f6991b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f7757r.h1());
    }

    private void k() {
        Uri uriB;
        if (i() || (uriB = b(this.f7757r.l1())) == null) {
            return;
        }
        this.f7757r.n1();
        this.f7757r.a(uriB);
    }

    private d0 l() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Caching HTML resources...");
        }
        return a(this.f7757r.h1(), this.f7757r.V(), new b());
    }

    private e0 m() {
        return a(this.f7757r.l1(), new a());
    }

    private void n() {
        ArrayList<String> arrayList = new ArrayList(this.f7757r.J());
        arrayList.addAll(this.f7757r.c0());
        if (CollectionUtils.isEmpty(arrayList)) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Caching optional HTML resources...");
        }
        String strH1 = this.f7757r.h1();
        for (String str : arrayList) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Caching optional resource: " + str);
            }
            int iA = this.f6990a.I().a(str, this.f7688g);
            Map mapA = h2.a((AppLovinAdImpl) this.f7688g);
            String strA = this.f6990a.I().a(com.applovin.impl.sdk.l.p(), str, this.f7757r.getCachePrefix(), this.f7757r.V(), true, true, iA, this.f7690i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.a(this.f6991b, "Updating HTML with cached optional resource: " + strA);
                }
                this.f7757r.a(strA, str);
                strH1 = strH1.replace(str, strA);
                this.f7757r.d(strH1);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Finish caching optional HTML resources for ad #" + this.f7757r.getAdIdNumber());
        }
    }

    private void o() {
        Long l10 = (Long) this.f6990a.a(z4.f9181a1);
        if (l10.longValue() <= 0) {
            e();
            return;
        }
        long jE1 = (this.f7757r.e1() - l10.longValue()) - (SystemClock.elapsedRealtime() - this.f7758s);
        if (jE1 > 0) {
            this.f6990a.s0().a(new u6(this.f6990a, "delayAdLoadSuccessCallback", new Runnable() { // from class: com.applovin.impl.yc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9161a.e();
                }
            }), f6.b.CACHING, jE1);
        } else {
            e();
        }
    }

    public void b(boolean z10) {
        this.f7760u = z10;
    }

    public void c(boolean z10) {
        this.f7759t = z10;
    }

    @Override // com.applovin.impl.n5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zD0 = this.f7757r.D0();
        boolean z10 = this.f7760u;
        if (zD0 || z10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Begin caching for streaming ad #" + this.f7757r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f6990a.a(z4.J0)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                if (!zD0) {
                    e();
                    d0 d0VarL = l();
                    if (d0VarL != null) {
                        arrayList.add(d0VarL);
                    }
                } else if (this.f7759t) {
                    e();
                    d0 d0VarL2 = l();
                    if (d0VarL2 != null) {
                        arrayList.add(d0VarL2);
                    }
                    e0 e0VarM = m();
                    if (e0VarM != null) {
                        arrayList.add(e0VarM);
                    }
                } else {
                    d0 d0VarL3 = l();
                    if (d0VarL3 != null) {
                        a(Arrays.asList(d0VarL3));
                    }
                    e();
                    e0 e0VarM2 = m();
                    if (e0VarM2 != null) {
                        arrayList.add(e0VarM2);
                    }
                }
                a(arrayList);
                e();
            } else if (zD0) {
                if (this.f7759t) {
                    e();
                }
                j();
                if (!this.f7759t) {
                    e();
                }
                k();
            } else {
                e();
                j();
            }
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Begin processing for non-streaming ad #" + this.f7757r.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f6990a.a(z4.J0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarL4 = l();
                if (d0VarL4 != null) {
                    arrayList2.add(d0VarL4);
                }
                e0 e0VarM3 = m();
                if (e0VarM3 != null) {
                    arrayList2.add(e0VarM3);
                }
                a(arrayList2);
                o();
                n();
                e();
            } else {
                j();
                k();
                o();
                n();
                e();
            }
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        if (q7.j(com.applovin.impl.sdk.l.p())) {
            str = q7.c(str);
        }
        if (!this.f7757r.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f6990a.g0().a(str, h2.a((AppLovinAdImpl) this.f7688g));
    }
}
