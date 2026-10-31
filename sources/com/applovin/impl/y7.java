package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes2.dex */
public class y7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9154b;

    private y7(String str, String str2) {
        this.f9153a = str;
        this.f9154b = str2;
    }

    public static y7 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new y7((String) q8Var.a().get("apiFramework"), q8Var.d());
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            lVar.E().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String b() {
        return this.f9153a;
    }

    public String c() {
        return this.f9154b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y7 y7Var = (y7) obj;
        String str = this.f9153a;
        if (str == null ? y7Var.f9153a != null : !str.equals(y7Var.f9153a)) {
            return false;
        }
        String str2 = this.f9154b;
        String str3 = y7Var.f9154b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f9153a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9154b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f9153a + '\'' + cNMUz.DJihiOm + this.f9154b + "'}";
    }

    public static y7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        return new y7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f9153a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f9154b);
        return jSONObject;
    }
}
