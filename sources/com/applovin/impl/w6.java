package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w6 extends y6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f9013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f9014h;

    public w6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateAppLovinReward", lVar);
        this.f9013g = bVar;
        this.f9014h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.t6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f9013g.getAdZone().e());
        String clCode = this.f9013g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.t6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.y6
    protected boolean h() {
        return this.f9013g.K0();
    }

    @Override // com.applovin.impl.y6
    protected void a(q4 q4Var) {
        this.f9013g.a(q4Var);
        String strB = q4Var.b();
        Map<String, String> mapA = q4Var.a();
        if (strB.equals("accepted")) {
            this.f9014h.userRewardVerified(this.f9013g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f9014h.userOverQuota(this.f9013g, mapA);
        } else if (strB.equals("rejected")) {
            this.f9014h.userRewardRejected(this.f9013g, mapA);
        } else {
            this.f9014h.validationRequestFailed(this.f9013g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.t6
    protected void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f9014h.userRewardRejected(this.f9013g, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f9014h.validationRequestFailed(this.f9013g, i10);
            str = "network_timeout";
        }
        this.f9013g.a(q4.a(str));
    }
}
