package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.util.HashMap;
import org.json.JSONObject;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes2.dex */
public class x6 extends y6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e3 f9066g;

    public x6(e3 e3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateMaxReward", lVar);
        this.f9066g = e3Var;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, yhXxbqGRMeI.VeotsZA, this.f9066g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9066g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9066g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f9066g.getFormat().getLabel());
        String strV0 = this.f9066g.v0();
        if (!StringUtils.isValidString(strV0)) {
            strV0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strV0);
        String strC = this.f9066g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, zKUlck.QKhjUs, strC);
    }

    @Override // com.applovin.impl.t6
    protected String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.y6
    protected boolean h() {
        return this.f9066g.A0();
    }

    @Override // com.applovin.impl.y6
    protected void a(q4 q4Var) {
        this.f9066g.a(q4Var);
    }

    @Override // com.applovin.impl.t6
    protected void a(int i10) {
        super.a(i10);
        String str = (i10 < 400 || i10 >= 500) ? "network_timeout" : "rejected";
        this.f9066g.a(q4.a(str));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
        mapHashMap.put("code", String.valueOf(i10));
        this.f6990a.R().a(f2.f6526w0, this.f9066g, mapHashMap);
    }
}
