package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7124c;

    public m8(JSONObject jSONObject) {
        this.f7122a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f7123b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f7124c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f7122a;
    }

    public String b() {
        return this.f7123b;
    }

    public List c() {
        return this.f7124c;
    }
}
