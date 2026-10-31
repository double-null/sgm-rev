package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8830a;

    private t7(List list) {
        this.f8830a = list;
    }

    public static t7 a(q8 q8Var, t7 t7Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        try {
            List listB = t7Var != null ? t7Var.b() : new ArrayList();
            Iterator it = q8Var.a("Verification").iterator();
            while (it.hasNext()) {
                s7 s7VarA = s7.a((q8) it.next(), v7Var, lVar);
                if (s7VarA != null) {
                    listB.add(s7VarA);
                }
            }
            return new t7(listB);
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            lVar.E().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.f8830a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7) {
            return this.f8830a.equals(((t7) obj).f8830a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8830a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f8830a + "'}";
    }

    static t7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            s7 s7VarA = s7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), lVar);
            if (s7VarA != null) {
                arrayList.add(s7VarA);
            }
        }
        return new t7(arrayList);
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f8830a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f8830a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((s7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
