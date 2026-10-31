package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class v7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f8952f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8953a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f8955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f8956d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f8954b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8957e = System.currentTimeMillis();

    public v7(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        this.f8953a = lVar;
        this.f8955c = jSONObject;
        this.f8956d = jSONObject2;
    }

    public List a() {
        return this.f8954b;
    }

    public JSONObject b() {
        return this.f8955c;
    }

    public long c() {
        return this.f8957e;
    }

    public int d() {
        return this.f8954b.size();
    }

    public JSONObject e() {
        return this.f8956d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f8955c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f8952f;
    }

    public int g() {
        return q7.c(JsonUtils.getInt(this.f8955c, "video_completion_percent", -1));
    }
}
