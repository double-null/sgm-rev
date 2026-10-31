package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g6 extends k5 implements o2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f6677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f6678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f6679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f6680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f6681k;

    public g6(JSONObject jSONObject, u uVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        this(jSONObject, uVar, j10, false, appLovinAdLoadListener, lVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Starting task for AppLovin ad...");
            }
            this.f6990a.s0().a(new m6(jSONObject, this.f6677g, this.f6679i, this, this.f6990a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Starting task for VAST ad...");
            }
            this.f6990a.s0().a(k6.a(jSONObject, this.f6677g, this, this.f6990a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6680j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f6681k || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f6990a.g().a(f2.B, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.o2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6680j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof o2) {
            ((o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f6681k) {
            return;
        }
        this.f6990a.g().a(f2.C, this.f6678h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f6677g, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.k(this.f6991b, "No ads were returned from the server");
            }
            q7.a(this.f6678h.e(), this.f6678h.d(), this.f6677g, this.f6990a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public g6(JSONObject jSONObject, u uVar, long j10, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessAdResponse", lVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f6677g = jSONObject;
        this.f6678h = uVar;
        this.f6679i = j10;
        this.f6680j = appLovinAdLoadListener;
        this.f6681k = z10;
    }
}
