package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f6904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6905h;

    public j6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessNativeAdResponse", lVar);
        this.f6904g = jSONObject;
        this.f6905h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f6904g, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processing ad...");
            }
            this.f6990a.s0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f6904g, this.f6905h, this.f6990a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.k(this.f6991b, "No ads were returned from the server");
        }
        q7.a("native_native", MaxAdFormat.NATIVE, this.f6904g, this.f6990a);
        this.f6905h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
