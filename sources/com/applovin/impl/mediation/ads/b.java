package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.f3;
import com.applovin.impl.h8;
import com.applovin.impl.i8;

/* JADX INFO: loaded from: classes.dex */
public class b implements i8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3 f7281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i8 f7282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8 f7283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0112a f7284e;

    public b(f3 f3Var, ViewGroup viewGroup, a.InterfaceC0112a interfaceC0112a, com.applovin.impl.sdk.l lVar) {
        this.f7280a = lVar;
        this.f7281b = f3Var;
        this.f7284e = interfaceC0112a;
        this.f7283d = new h8(viewGroup, lVar);
        i8 i8Var = new i8(viewGroup, lVar, this);
        this.f7282c = i8Var;
        i8Var.a(f3Var);
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f7282c.b();
    }

    public f3 b() {
        return this.f7281b;
    }

    public void c() {
        this.f7280a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7280a.Q().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f7281b.x0().compareAndSet(false, true)) {
            this.f7280a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7280a.Q().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f7281b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.p.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f7280a.f().a(this.f7281b);
            }
            this.f7280a.Z().processRawAdImpression(this.f7281b, this.f7284e);
        }
    }

    @Override // com.applovin.impl.i8.a
    public void onLogVisibilityImpression() {
        a(this.f7283d.a(this.f7281b));
    }

    private void a(long j10) {
        if (this.f7281b.y0().compareAndSet(false, true)) {
            this.f7280a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7280a.Q().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f7280a.Z().processViewabilityAdImpressionPostback(this.f7281b, j10, this.f7284e);
        }
    }
}
