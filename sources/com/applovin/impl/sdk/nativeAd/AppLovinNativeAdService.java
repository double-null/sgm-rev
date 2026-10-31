package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.f6;
import com.applovin.impl.j6;
import com.applovin.impl.k5;
import com.applovin.impl.s0;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v2;
import com.applovin.impl.z5;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final com.applovin.impl.sdk.p logger;
    private final com.applovin.impl.sdk.l sdk;

    public AppLovinNativeAdService(com.applovin.impl.sdk.l lVar) {
        this.sdk = lVar;
        this.logger = lVar.Q();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            com.applovin.impl.sdk.p.h(TAG, "Empty ad token");
            v2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(strTrim, this.sdk);
        if (kVar.c() == com.applovin.impl.k.a.REGULAR) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + kVar);
            }
            this.sdk.s0().a((k5) new z5(kVar, appLovinNativeAdLoadListener, this.sdk), f6.b.CORE);
            return;
        }
        if (kVar.c() != com.applovin.impl.k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            com.applovin.impl.sdk.p.h(TAG, "Invalid token type");
            v2.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject jSONObjectA = kVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            com.applovin.impl.sdk.p.h(TAG, str2);
            v2.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        s0.c(jSONObjectA, this.sdk);
        s0.b(jSONObjectA, this.sdk);
        s0.a(jSONObjectA, this.sdk);
        if (JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray()).length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + kVar);
            }
            this.sdk.s0().a((k5) new j6(jSONObjectA, appLovinNativeAdLoadListener, this.sdk), f6.b.CORE);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.logger.b(TAG, "No ad returned from the server for token: " + kVar);
        }
        v2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
    }
}
