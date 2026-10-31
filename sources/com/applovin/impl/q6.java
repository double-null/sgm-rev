package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q6 extends r6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e3 f7999g;

    public q6(e3 e3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskReportMaxReward", lVar);
        this.f7999g = e3Var;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f7999g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7999g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7999g.e());
        String strV0 = this.f7999g.v0();
        if (!StringUtils.isValidString(strV0)) {
            strV0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strV0);
        String strC = this.f7999g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.r6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Reported reward successfully for mediated ad: " + this.f7999g);
        }
    }

    @Override // com.applovin.impl.t6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.r6
    protected q4 h() {
        return this.f7999g.r0();
    }

    @Override // com.applovin.impl.r6
    protected void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "No reward result was found for mediated ad: " + this.f7999g);
        }
    }

    @Override // com.applovin.impl.t6
    protected void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Failed to report reward for mediated ad: " + this.f7999g + " - error code: " + i10);
        }
        this.f6990a.R().a(f2.f6524v0, this.f7999g, CollectionUtils.map("code", String.valueOf(i10)));
    }
}
