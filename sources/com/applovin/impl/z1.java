package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class z1 extends y1 {
    private final a2 N;
    private i0 O;
    private long P;
    private final AtomicBoolean Q;

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new a2(this.f9094a, this.f9097d, this.f9095b);
        this.Q = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.Q.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.f9111r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f9104k;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f9103j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9103j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f9094a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.f9105l);
        this.f9111r = SystemClock.elapsedRealtime();
        this.Q.set(true);
    }

    protected void J() {
        long jR;
        long millis = 0;
        if (this.f9094a.Q() >= 0 || this.f9094a.R() >= 0) {
            if (this.f9094a.Q() >= 0) {
                jR = this.f9094a.Q();
            } else {
                if (this.f9094a.W0()) {
                    int iI1 = (int) ((com.applovin.impl.sdk.ad.a) this.f9094a).i1();
                    if (iI1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iI1);
                    } else {
                        int iS = (int) this.f9094a.s();
                        if (iS > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iS);
                        }
                    }
                }
                jR = (long) (millis * (((double) this.f9094a.R()) / 100.0d));
            }
            c(jR);
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        this.N.a(this.f9104k, this.f9103j, b(), viewGroup);
        if (((Boolean) this.f9095b.a(z4.f9212d6)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f9103j;
            if (kVar != null) {
                kVar.b();
            }
            b().renderAd(this.f9094a);
            a("javascript:al_onPoststitialShow();", this.f9094a.y());
            if (h()) {
                long jC = C();
                this.P = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f9096c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.P + EFLCCdIRcb.WkEmgler);
                    }
                    this.O = i0.a(this.P, this.f9095b, new Runnable() { // from class: com.applovin.impl.xg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9082a.G();
                        }
                    });
                }
            }
            if (this.f9104k != null) {
                if (this.f9094a.s() >= 0) {
                    a(this.f9104k, this.f9094a.s(), new Runnable() { // from class: com.applovin.impl.yg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9167a.H();
                        }
                    });
                } else {
                    this.f9104k.setVisibility(0);
                }
            }
            J();
            this.f9095b.s0().a(new u6(this.f9095b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.zg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9444a.I();
                }
            }), f6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(q7.e(this.f9095b));
        }
    }

    @Override // com.applovin.impl.y1
    public void b(long j10) {
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        int iD = this.f9094a.D();
        if (iD <= 0 || !(this.f9097d instanceof AppLovinFullscreenActivity)) {
            A();
            return;
        }
        if (this.f9094a.U() >= iD) {
            A();
            return;
        }
        e(true);
        this.f9094a.F0();
        this.f9094a.setHasShown(false);
        a("attempting_reshow_from_render_process_gone");
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.ah
            @Override // java.lang.Runnable
            public final void run() {
                this.f6116a.F();
            }
        }, this.f9094a.h());
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.y1
    public void v() {
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    protected void x() {
        super.x();
        this.Q.set(true);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f9094a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fI1 = ((com.applovin.impl.sdk.ad.a) bVar).i1();
        if (fI1 <= 0.0f) {
            fI1 = this.f9094a.s();
        }
        return (long) (q7.c(fI1) * (((double) this.f9094a.z()) / 100.0d));
    }

    private int D() {
        i0 i0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f9095b.a(z4.f9279l1)).booleanValue() && !this.f9094a.hasShown()) {
                return 0;
            }
            if (!E() && (i0Var = this.O) != null) {
                iMin = (int) Math.min(100.0d, ((this.P - i0Var.b()) / this.P) * 100.0d);
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        y1.a(this.f9094a, this.F, this.G, this.H, null, this.f9095b, this.f9097d, new a());
    }

    protected boolean E() {
        if (!(this.K && this.f9094a.a1()) && h()) {
            return this.Q.get();
        }
        return true;
    }

    /* JADX INFO: loaded from: classes.dex */
    class a implements y1.g {
        a() {
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            ((AppLovinFullscreenActivity) z1.this.f9097d).setPresenter(y1Var);
            z1.this.r();
            y1Var.w();
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "recreateFullscreenAdPresenterAfterRenderProcessGone");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            z1.this.f9095b.g().a(f2.G, z1.this.f9094a, mapHashMap);
            z1.this.e(false);
            z1.this.f9097d.finish();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        if (!((Boolean) this.f9095b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f9094a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        i0 i0Var = this.O;
        if (i0Var != null) {
            i0Var.a();
            this.O = null;
        }
        super.a(str);
    }
}
