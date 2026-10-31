package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p6 extends r6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7848g;

    public p6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        super("TaskReportAppLovinReward", lVar);
        this.f7848g = bVar;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f7848g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f7848g.R());
        String clCode = this.f7848g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.r6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Reported reward successfully for ad: " + this.f7848g);
        }
    }

    @Override // com.applovin.impl.t6
    protected String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.r6
    protected q4 h() {
        return this.f7848g.j();
    }

    @Override // com.applovin.impl.r6
    protected void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "No reward result was found for ad: " + this.f7848g);
        }
    }

    @Override // com.applovin.impl.t6
    protected void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "Failed to report reward for ad: " + this.f7848g + " - error code: " + i10);
        }
        this.f6990a.g().a(f2.I, this.f7848g, CollectionUtils.map("code", String.valueOf(i10)));
    }
}
