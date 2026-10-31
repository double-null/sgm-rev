package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z5 extends b6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f9411j;

    public z5(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, lVar);
        this.f9411j = kVar;
    }

    @Override // com.applovin.impl.t5
    protected Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f9411j.b());
        map.put("adtoken_prefix", this.f9411j.d());
        return map;
    }
}
