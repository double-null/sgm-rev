package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.NativeProtocol;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class r6 extends t6 {
    protected r6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private JSONObject a(q4 q4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", q4Var.b());
        Map mapA = q4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, NativeProtocol.WEB_DIALOG_PARAMS, new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    protected abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.t6
    protected int g() {
        return ((Integer) this.f6990a.a(z4.f9261j1)).intValue();
    }

    protected abstract q4 h();

    protected abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        q4 q4VarH = h();
        if (q4VarH == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Reporting pending reward: " + q4VarH + "...");
        }
        a(a(q4VarH), new a());
    }

    class a implements r0.e {
        a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            r6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r6.this.a(i10);
        }
    }
}
