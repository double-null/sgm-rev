package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* JADX INFO: loaded from: classes.dex */
public class a2 extends x1 {
    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        super(bVar, activity, lVar);
    }

    @Override // com.applovin.impl.x1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f9055d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f9054c.o(), (this.f9054c.v0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f9055d.addView(kVar, this.f9056e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f9055d);
        } else {
            this.f9053b.setContentView(this.f9055d);
        }
    }
}
