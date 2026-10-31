package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.ServerProtocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5962b;

    private a8() {
    }

    public static a8 a(q8 q8Var, a8 a8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (a8Var == null) {
            try {
                a8Var = new a8();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastSystemInfo", "Error occurred while initializing", th);
                }
                lVar.E().a("VastSystemInfo", th);
                return null;
            }
        }
        if (!StringUtils.isValidString(a8Var.f5961a)) {
            String strD = q8Var.d();
            if (StringUtils.isValidString(strD)) {
                a8Var.f5961a = strD;
            }
        }
        if (!StringUtils.isValidString(a8Var.f5962b)) {
            String str = (String) q8Var.a().get(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            if (StringUtils.isValidString(str)) {
                a8Var.f5962b = str;
            }
        }
        return a8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        String str = this.f5961a;
        if (str == null ? a8Var.f5961a != null : !str.equals(a8Var.f5961a)) {
            return false;
        }
        String str2 = this.f5962b;
        String str3 = a8Var.f5962b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f5961a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5962b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f5961a + "', version='" + this.f5962b + "'}";
    }

    public static a8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        a8 a8Var = new a8();
        a8Var.f5961a = JsonUtils.getString(jSONObject, "name", null);
        a8Var.f5962b = JsonUtils.getString(jSONObject, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, null);
        return a8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f5961a);
        JsonUtils.putString(jSONObject, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.f5962b);
        return jSONObject;
    }
}
