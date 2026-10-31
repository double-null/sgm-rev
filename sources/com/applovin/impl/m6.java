package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f7117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f7118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f7119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f7120j;

    public m6(JSONObject jSONObject, JSONObject jSONObject2, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderAppLovinAd", lVar);
        this.f7117g = jSONObject;
        this.f7118h = jSONObject2;
        this.f7119i = j10;
        this.f7120j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f7117g, this.f7118h, this.f6990a);
        Boolean bool = JsonUtils.getBoolean(this.f7117g, "gs_load_immediately", Boolean.FALSE);
        Boolean bool2 = JsonUtils.getBoolean(this.f7117g, "vs_load_immediately", Boolean.TRUE);
        o5 o5Var = new o5(aVar, this.f7119i, this.f6990a, this.f7120j);
        o5Var.c(bool2.booleanValue());
        o5Var.b(bool.booleanValue());
        this.f6990a.s0().a((k5) o5Var, f6.b.CACHING);
    }
}
