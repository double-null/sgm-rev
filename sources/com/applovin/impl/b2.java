package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class b2 extends c2 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final r7 f6127o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Set f6128p0;

    /* JADX INFO: loaded from: classes.dex */
    class a implements c1.b {
        a() {
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b2.this.f6229f0 - ((long) (b2.this.Q.getDuration() - b2.this.Q.getCurrentPosition())));
            int iC = b2.this.C();
            HashSet hashSet = new HashSet();
            for (b8 b8Var : new HashSet(b2.this.f6128p0)) {
                if (b8Var.a(seconds, iC)) {
                    hashSet.add(b8Var);
                    b2.this.f6128p0.remove(b8Var);
                }
            }
            b2.this.a(hashSet);
            if (iC >= 25 && iC < 50) {
                b2.this.f6127o0.getAdEventTracker().x();
                return;
            }
            if (iC >= 50 && iC < 75) {
                b2.this.f6127o0.getAdEventTracker().y();
            } else if (iC >= 75) {
                b2.this.f6127o0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !b2.this.f6232i0;
        }
    }

    public b2(final com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f6128p0 = hashSet;
        r7 r7Var = (r7) bVar;
        this.f6127o0 = r7Var;
        if (r7Var.r1()) {
            ImageView imageViewA = x7.a(r7Var.l1().e(), activity, lVar);
            this.X = imageViewA;
            imageViewA.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5963a.a(bVar, lVar, activity, view);
                }
            });
        }
        r7.d dVar = r7.d.VIDEO;
        hashSet.addAll(r7Var.a(dVar, c8.f6270a));
        a(r7.d.IMPRESSION);
        a(dVar, "creativeView");
        r7Var.getAdEventTracker().g();
    }

    private void V() {
        if (!G() || this.f6128p0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.k("AppLovinFullscreenActivity", "Firing " + this.f6128p0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f6128p0);
    }

    @Override // com.applovin.impl.c2
    public void D() {
        a(r7.d.VIDEO, "skip");
        this.f6127o0.getAdEventTracker().B();
        super.D();
    }

    @Override // com.applovin.impl.c2
    protected void E() {
        super.E();
        r7 r7Var = this.f6127o0;
        if (r7Var != null) {
            r7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.c2
    protected void N() {
        long jR;
        int iS;
        long millis = 0;
        if (this.f6127o0.Q() >= 0 || this.f6127o0.R() >= 0) {
            if (this.f6127o0.Q() >= 0) {
                jR = this.f6127o0.Q();
            } else {
                r7 r7Var = this.f6127o0;
                e8 e8VarP1 = r7Var.p1();
                if (e8VarP1 == null || e8VarP1.d() <= 0) {
                    long j10 = this.f6229f0;
                    if (j10 > 0) {
                        millis = j10;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(e8VarP1.d());
                }
                if (r7Var.W0() && (iS = (int) r7Var.s()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iS);
                }
                jR = (long) (millis * (((double) this.f6127o0.R()) / 100.0d));
            }
            c(jR);
        }
    }

    @Override // com.applovin.impl.c2
    protected void Q() {
        super.Q();
        r7 r7Var = this.f6127o0;
        if (r7Var != null) {
            r7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.c2
    public void R() {
        V();
        if (!d8.a(this.f6127o0)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.f6232i0) {
                return;
            }
            a(r7.d.COMPANION, "creativeView");
            this.f6127o0.getAdEventTracker().w();
            super.R();
        }
    }

    @Override // com.applovin.impl.c2
    public void T() {
        super.T();
        a(r7.d.VIDEO, this.f6228e0 ? "mute" : "unmute");
        this.f6127o0.getAdEventTracker().b(this.f6228e0);
    }

    @Override // com.applovin.impl.c2
    protected void d(long j10) {
        super.d(j10);
        this.f6127o0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j10), q7.e(this.f9095b));
    }

    @Override // com.applovin.impl.c2
    public void g(String str) {
        a(r7.d.ERROR, w7.MEDIA_FILE_ERROR);
        this.f6127o0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.y1
    public void s() {
        super.s();
        a(this.f6232i0 ? r7.d.COMPANION : r7.d.VIDEO, "pause");
        this.f6127o0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.y1
    public void t() {
        super.t();
        a(this.f6232i0 ? r7.d.COMPANION : r7.d.VIDEO, "resume");
        this.f6127o0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void v() {
        this.f6225b0.c();
        super.v();
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    private boolean U() {
        return this.X != null && this.f6127o0.r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, Activity activity, View view) {
        Uri uriC = this.f6127o0.l1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9096c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(r7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                lVar.A().a(uriC, b().getController(), activity);
            } else {
                n7.b(uriC, bVar, activity, lVar);
            }
        }
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void a(String str) {
        if (this.f6127o0 != null) {
            a(r7.d.VIDEO, MRAIDPresenter.CLOSE);
            a(r7.d.COMPANION, MRAIDPresenter.CLOSE);
        }
        super.a(str);
    }

    @Override // com.applovin.impl.c2, com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (U()) {
            a(r7.d.INDUSTRY_ICON_IMPRESSION);
            this.X.setVisibility(0);
        }
        this.f6225b0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.R;
        if (aVar != null) {
            arrayList.add(new j4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.S;
        if (gVar != null) {
            arrayList.add(new j4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        k0 k0Var = this.T;
        if (k0Var != null) {
            arrayList.add(new j4(k0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.V;
        if (progressBar != null) {
            arrayList.add(new j4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.U;
        if (imageView != null) {
            arrayList.add(new j4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.k kVar = this.f9103j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9103j;
            arrayList.add(new j4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f6127o0.getAdEventTracker().b(this.Q, arrayList);
    }

    @Override // com.applovin.impl.c2
    public void a(MotionEvent motionEvent) {
        a(r7.d.VIDEO_CLICK);
        this.f6127o0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar) {
        a(dVar, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar, String str) {
        a(dVar, str, w7.UNSPECIFIED);
    }

    private void a(r7.d dVar, w7 w7Var) {
        a(dVar, KBBdKxoAiHo.dsvziOddGlRzMU, w7Var);
    }

    private void a(r7.d dVar, String str, w7 w7Var) {
        a(this.f6127o0.a(dVar, str), w7Var);
    }

    private void a(Set set, w7 w7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.Q.getCurrentPosition());
        f8 f8VarQ1 = this.f6127o0.q1();
        Uri uriD = f8VarQ1 != null ? f8VarQ1.d() : null;
        if (com.applovin.impl.sdk.p.a()) {
            this.f9096c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        d8.a(set, seconds, uriD, w7Var, this.f9095b);
    }
}
