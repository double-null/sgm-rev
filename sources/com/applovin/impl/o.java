package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m8 f7730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f7732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7733f = false;

    o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.l lVar) {
        this.f7728a = JsonUtils.getString(jSONObject, "name", "");
        this.f7729b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f7730c = a(jSONObject);
        this.f7731d = a("bidders", jSONObject, map, maxAdFormat, lVar);
        this.f7732e = a("waterfall", jSONObject, map, maxAdFormat, lVar);
    }

    public List a() {
        return this.f7731d;
    }

    public String b() {
        return this.f7729b;
    }

    public String c() {
        return this.f7728a;
    }

    public m8 d() {
        return this.f7730c;
    }

    public List e() {
        return this.f7732e;
    }

    public boolean f() {
        return this.f7733f;
    }

    private m8 a(JSONObject jSONObject) {
        return new m8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.l lVar) {
        g3 g3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (g3Var = (g3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (g3Var.C()) {
                    this.f7733f = true;
                }
                arrayList.add(new k8(jSONObject2, maxAdFormat, g3Var, lVar));
            }
        }
        return arrayList;
    }
}
