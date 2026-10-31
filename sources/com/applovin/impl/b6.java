package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b6 extends t5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6158i;

    public b6(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.f6158i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.t5
    protected k5 a(JSONObject jSONObject) {
        return new j6(jSONObject, this.f6158i, this.f6990a);
    }

    @Override // com.applovin.impl.t5
    protected String e() {
        return s0.d(this.f6990a);
    }

    @Override // com.applovin.impl.t5
    protected String f() {
        return s0.e(this.f6990a);
    }

    @Override // com.applovin.impl.t5
    protected void a(int i10, String str) {
        super.a(i10, str);
        this.f6158i.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }
}
