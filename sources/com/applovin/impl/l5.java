package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class l5 extends k5 {
    l5(com.applovin.impl.sdk.l lVar) {
        super("TaskApiSubmitData", lVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.m mVarB = this.f6990a.B();
        Map mapP = mVarB.p();
        q7.a("platform", "type", mapP);
        q7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(mapP));
        Map mapG = mVarB.G();
        q7.a("sdk_version", "applovin_sdk_version", mapG);
        q7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.d(this.f6991b, "Submitting user data...");
        }
        Map mapC = s0.c(this.f6990a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f6990a.a(z4.K5)).booleanValue() || ((Boolean) this.f6990a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            l5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            s0.a(i10, this.f6990a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f6990a.q0().a(z4.f9223f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f6990a.q0().a(z4.f9259j, JsonUtils.getString(jSONObject2, "device_token", ""));
        s0.a(jSONObject2, this.f6990a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6990a).b(s0.b("2.0/device", this.f6990a)).a(s0.a("2.0/device", this.f6990a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f6990a.a(z4.S5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f6990a.a(z4.f9218e3)).intValue()).a(w4.a.a(((Integer) this.f6990a.a(z4.B5)).intValue())).a(), this.f6990a);
        aVar.c(z4.f9296n0);
        aVar.b(z4.f9305o0);
        this.f6990a.s0().a(aVar);
    }
}
