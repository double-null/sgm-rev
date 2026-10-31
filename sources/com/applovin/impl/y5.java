package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r0.e f9150g;

    public y5(r0.e eVar, com.applovin.impl.sdk.l lVar) {
        super("TaskFetchMediationDebuggerInfo", lVar, true);
        this.f9150g = eVar;
    }

    protected Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f6990a.a(z4.f9319p5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6990a.k0());
        }
        Map mapG = this.f6990a.B().G();
        map.put("package_name", String.valueOf(mapG.get("package_name")));
        map.put("app_version", String.valueOf(mapG.get("app_version")));
        Map mapN = this.f6990a.B().N();
        map.put("platform", String.valueOf(mapN.get("platform")));
        map.put("os", String.valueOf(mapN.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f6990a.a(z4.H5)).booleanValue() || ((Boolean) this.f6990a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6990a).c("POST").b(n3.i(this.f6990a)).a(n3.h(this.f6990a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f6990a.a(t3.E7)).intValue()).a(w4.a.a(((Integer) this.f6990a.a(z4.f9382w5)).intValue())).a(), this.f6990a, d());
        aVar.c(t3.A7);
        aVar.b(t3.B7);
        this.f6990a.s0().a(aVar);
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10) {
            super(aVar, lVar, z10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            y5.this.f9150g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            y5.this.f9150g.a(str, i10, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", y3.b(this.f6990a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a aVarF = this.f6990a.B().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapM0 = this.f6990a.m0();
        if (!CollectionUtils.isEmpty(mapM0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapM0));
        }
        return jSONObject;
    }
}
