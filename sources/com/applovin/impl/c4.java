package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6255b;

    public c4(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f6254a = JsonUtils.getString(jSONObject, "id", "");
        this.f6255b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f6254a;
    }

    public String b() {
        return this.f6255b;
    }
}
