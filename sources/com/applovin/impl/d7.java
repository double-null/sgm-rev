package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f6367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f6370e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? OTHER : ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public d7(JSONObject jSONObject, String str) {
        this.f6369d = str;
        this.f6366a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f6367b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f6368c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f6370e = bool;
    }

    public String b() {
        return this.f6369d;
    }

    public String c() {
        return this.f6368c;
    }

    public Integer d() {
        return this.f6367b;
    }

    public String e() {
        Boolean bool = this.f6370e;
        return "\n" + this.f6369d + " - " + (bool != null ? String.valueOf(bool) : q0.b().a(com.applovin.impl.sdk.l.p()));
    }

    public a f() {
        return this.f6366a;
    }

    public Boolean a() {
        return this.f6370e;
    }
}
