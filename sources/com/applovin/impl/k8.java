package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c4 f7003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7004c;

    public k8(JSONObject jSONObject, MaxAdFormat maxAdFormat, g3 g3Var, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f7003b = new c4(jSONObject2, lVar);
        } else {
            this.f7003b = null;
        }
        this.f7002a = new w2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, g3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f7004c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f7004c.add(new c4(jSONObject3, lVar));
            }
        }
    }

    public c4 a() {
        return this.f7003b;
    }

    public w2 b() {
        return this.f7002a;
    }

    public List c() {
        return this.f7004c;
    }

    public boolean d() {
        return this.f7003b != null;
    }
}
