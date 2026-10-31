package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a6 extends t5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f5959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f5960j;

    public a6(u uVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        this(uVar, j10, appLovinAdLoadListener, "TaskFetchNextAd", lVar);
    }

    @Override // com.applovin.impl.t5
    protected k5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.f8825g, this.f5959i, this.f5960j, this.f6990a);
    }

    @Override // com.applovin.impl.t5
    protected String e() {
        return s0.a(this.f6990a);
    }

    @Override // com.applovin.impl.t5
    protected String f() {
        return s0.b(this.f6990a);
    }

    public a6(u uVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.f5959i = j10;
        this.f5960j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.t5
    protected void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f5960j;
        if (!(appLovinAdLoadListener instanceof o2)) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        } else {
            ((o2) this.f5960j).failedToReceiveAdV2(new AppLovinError(i10, str));
        }
    }
}
