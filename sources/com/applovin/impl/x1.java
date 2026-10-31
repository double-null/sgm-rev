package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.l f9052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Activity f9053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f9054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ViewGroup f9055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f9056e;

    x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f9056e = layoutParams;
        this.f9054c = bVar;
        this.f9052a = lVar;
        this.f9053b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9055d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f9055d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f9054c.o(), (this.f9054c.v0() ? 3 : 5) | 48, gVar);
    }

    void a(com.applovin.impl.sdk.ad.b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f8301a, dVar.f8305e, dVar.f8304d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f8303c;
        layoutParams.setMargins(i11, dVar.f8302b, i11, 0);
        layoutParams.gravity = i10;
        this.f9055d.addView(gVar, layoutParams);
    }
}
