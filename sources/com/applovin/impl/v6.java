package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;
import pb.vBC.NyXuoef;

/* JADX INFO: loaded from: classes.dex */
public class v6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r2 f8949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Exception f8950h;

    public v6(com.applovin.impl.sdk.l lVar, r2 r2Var, Exception exc) {
        super("TaskValidateLicense", lVar);
        this.f8949g = r2Var;
        this.f8950h = exc;
    }

    private String e() {
        return s0.a((String) this.f6990a.a(z4.f9368v0), (String) this.f6990a.a(z4.f9377w0), this.f6990a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a aVarF = this.f6990a.B().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f6990a.a(z4.E3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        com.applovin.impl.sdk.m.b bVarH = this.f6990a.B().H();
        if (((Boolean) this.f6990a.a(z4.F3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f8501a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f8502b);
        }
        String strE = this.f6990a.y0().e();
        if (((Boolean) this.f6990a.a(z4.G3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f6990a.a(z4.J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f6990a.v());
        }
        if (((Boolean) this.f6990a.a(z4.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f6990a.j0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f6990a.B().e());
        JSONObject jSONObject2 = new JSONObject();
        r2 r2Var = this.f8949g;
        if (r2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", r2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f8949g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f8949g.c());
            JsonUtils.putInt(jSONObject2, "n", this.f8949g.b());
        }
        Exception exc = this.f8950h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return s0.a((String) this.f6990a.a(z4.f9359u0), (String) this.f6990a.a(z4.f9377w0), this.f6990a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6990a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f6990a.a(z4.W5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f6990a.a(z4.f9397y3)).intValue()).a(w4.a.a(((Integer) this.f6990a.a(z4.D5)).intValue())).a(), this.f6990a);
        aVar.c(z4.f9359u0);
        aVar.b(z4.f9368v0);
        this.f6990a.s0().a(aVar);
    }

    /* JADX INFO: loaded from: classes2.dex */
    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "License Validation successful");
            }
            c5.b(b5.f6138i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            Map map = CollectionUtils.map("code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f6990a.x0().d(f2.f6500l, map);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, NyXuoef.DtI);
            }
            if (!this.f6990a.c(z4.A).contains(String.valueOf(i10))) {
                c5.b(b5.f6138i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f6990a.x0().d(f2.f6503m, map);
        }
    }
}
