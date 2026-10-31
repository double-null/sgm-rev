package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes2.dex */
public class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f7654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f7655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f7656e;

    public MaxAdFormat a() {
        return this.f7654c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f7654c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public String c() {
        return this.f7652a;
    }

    public String d() {
        return this.f7653b;
    }

    public String e() {
        return "\n---------- " + this.f7653b + " ----------\nIdentifier - " + this.f7652a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f7655d;
    }

    public List g() {
        return this.f7656e;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f7653b.compareToIgnoreCase(nVar.f7653b);
    }

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.l lVar) {
        String str = zKUlck.rhYcFlqG;
        this.f7652a = JsonUtils.getString(jSONObject, "name", str);
        this.f7653b = JsonUtils.getString(jSONObject, "display_name", str);
        this.f7654c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f7656e = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f7656e.add(new o(jSONObject2, map, this.f7654c, lVar));
            }
        }
        this.f7655d = this.f7656e.isEmpty() ? null : (o) this.f7656e.get(0);
    }
}
