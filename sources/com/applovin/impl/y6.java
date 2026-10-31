package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.NativeProtocol;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y6 extends t6 {
    protected y6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private q4 b(JSONObject jSONObject) {
        Map<String, String> mapEmptyMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        s0.c(jSONObject2, this.f6990a);
        s0.b(jSONObject, this.f6990a);
        s0.a(jSONObject, this.f6990a);
        try {
            mapEmptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get(NativeProtocol.WEB_DIALOG_PARAMS));
        } catch (Throwable unused) {
            mapEmptyMap = Collections.emptyMap();
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return q4.a(string, mapEmptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        q4 q4VarB = b(jSONObject);
        a(q4VarB);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Pending reward handled: " + q4VarB);
        }
    }

    protected abstract void a(q4 q4Var);

    @Override // com.applovin.impl.t6
    protected int g() {
        return ((Integer) this.f6990a.a(z4.f9252i1)).intValue();
    }

    protected abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    class a implements r0.e {
        a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (y6.this.h()) {
                com.applovin.impl.sdk.p pVar = y6.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var = y6.this;
                    y6Var.f6992c.b(y6Var.f6991b, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.p pVar2 = y6.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var2 = y6.this;
                    y6Var2.f6992c.b(y6Var2.f6991b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar3 = y6.this.f6992c;
            if (com.applovin.impl.sdk.p.a()) {
                y6 y6Var3 = y6.this;
                y6Var3.f6992c.a(y6Var3.f6991b, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            y6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (y6.this.h()) {
                com.applovin.impl.sdk.p pVar = y6.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var = y6.this;
                    y6Var.f6992c.b(y6Var.f6991b, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar2 = y6.this.f6992c;
            if (com.applovin.impl.sdk.p.a()) {
                y6 y6Var2 = y6.this;
                y6Var2.f6992c.b(y6Var2.f6991b, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            y6.this.a(i10);
        }
    }
}
