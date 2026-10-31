package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t6 extends k5 {
    protected t6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    protected abstract void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, r0.e eVar) {
        Map mapC = s0.c(this.f6990a);
        if (((Boolean) this.f6990a.a(z4.L5)).booleanValue() || ((Boolean) this.f6990a.a(z4.E5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6990a).b(s0.b(f(), this.f6990a)).a(s0.a(f(), this.f6990a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f6990a.a(z4.V5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(w4.a.a(((Integer) this.f6990a.a(z4.C5)).intValue())).a(), this.f6990a, eVar);
        aVar.c(z4.f9296n0);
        aVar.b(z4.f9305o0);
        this.f6990a.s0().a(aVar);
    }

    protected abstract String f();

    protected abstract int g();

    /* JADX INFO: loaded from: classes.dex */
    class a extends o6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ r0.e f8828n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, r0.e eVar) {
            super(aVar, lVar);
            this.f8828n = eVar;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f8828n.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f8828n.a(str, i10, str2, jSONObject);
        }
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f6990a.y0().e();
        if (((Boolean) this.f6990a.a(z4.H3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f6990a.a(z4.J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f6990a.v());
        }
        if (((Boolean) this.f6990a.a(z4.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, ykDFMuXDQMaR.KekWciQkRfsWpPn, this.f6990a.j0());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected void a(int i10) {
        s0.a(i10, this.f6990a);
    }
}
