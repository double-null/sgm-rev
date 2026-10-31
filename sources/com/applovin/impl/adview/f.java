package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.o1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
class f extends Dialog implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f6064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f6067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f6068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f6069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f6070g;

    f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f6065b = lVar;
        this.f6066c = lVar.Q();
        this.f6064a = activity;
        this.f6067d = bVar;
        this.f6068e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f6064a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6075a.f();
            }
        });
    }

    @Override // com.applovin.impl.o1
    public void dismiss(String str) {
        this.f6064a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6076a.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f6067d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f6064a.getWindow().getAttributes().flags, this.f6064a.getWindow().getAttributes().flags);
                window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f6066c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6066c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f6067d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f6070g.isClickable()) {
            this.f6070g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6067d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f6064a);
        this.f6069f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6069f.setBackgroundColor(-1157627904);
        this.f6069f.addView(this.f6067d);
        if (!this.f6068e.m1()) {
            a(this.f6068e.g1());
            g();
        }
        setContentView(this.f6069f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f6069f.removeView(this.f6067d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f6070g == null) {
                a();
            }
            this.f6070g.setVisibility(0);
            this.f6070g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f6070g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6066c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.f6067d;
    }

    private void a(e.a aVar) {
        if (this.f6070g != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6066c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f6064a);
        this.f6070g = eVarA;
        eVarA.setVisibility(8);
        this.f6070g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6063a.a(view);
            }
        });
        this.f6070g.setClickable(false);
        int iA = a(((Integer) this.f6065b.a(z4.D1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.l lVar = this.f6065b;
        z4 z4Var = z4.G1;
        layoutParams.addRule(((Boolean) lVar.a(z4Var)).booleanValue() ? 9 : 11);
        this.f6070g.a(iA);
        int iA2 = a(((Integer) this.f6065b.a(z4.F1)).intValue());
        int iA3 = a(((Integer) this.f6065b.a(z4.E1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f6069f.addView(this.f6070g, layoutParams);
        this.f6070g.bringToFront();
        int iA4 = a(((Integer) this.f6065b.a(z4.H1)).intValue());
        View view = new View(this.f6064a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f6065b.a(z4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6072a.b(view2);
            }
        });
        this.f6069f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f6068e;
    }

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f6070g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f6064a, i10);
    }
}
