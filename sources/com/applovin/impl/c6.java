package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c6 extends a6 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k f6259k;

    public c6(k kVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(u.a("adtoken_zone"), j10, appLovinAdLoadListener, "TaskFetchTokenAd", lVar);
        this.f6259k = kVar;
    }

    @Override // com.applovin.impl.t5
    protected Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f6259k.b());
        map.put("adtoken_prefix", this.f6259k.d());
        return map;
    }
}
