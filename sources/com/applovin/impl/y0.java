package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f9089a;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private y0(JSONObject jSONObject) {
        this.f9089a = jSONObject;
    }

    public static y0 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), SDKConstants.PARAM_KEY, null);
        if ("TOS".equalsIgnoreCase(string) && lVar.y().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && lVar.y().f() == null) {
            return null;
        }
        return new y0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f9089a, "event", null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f9089a, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, null);
        if ("default".equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        return ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9089a, "title", (JSONObject) null);
        return com.applovin.impl.sdk.l.a(JsonUtils.getString(jSONObject, SDKConstants.PARAM_KEY, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f9089a, "destination_state_id", -1);
    }
}
