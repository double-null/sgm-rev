package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8175d;

    private s7(String str, List list, String str2, Set set) {
        this.f8172a = str;
        this.f8173b = list;
        this.f8174c = str2;
        this.f8175d = set;
    }

    public static s7 a(q8 q8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        try {
            String str = (String) q8Var.a().get("vendor");
            q8 q8VarB = q8Var.b("VerificationParameters");
            String strD = q8VarB != null ? q8VarB.d() : null;
            List listA = q8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                y7 y7VarA = y7.a((q8) it.next(), lVar);
                if (y7VarA != null) {
                    arrayList.add(y7VarA);
                }
            }
            HashMap map = new HashMap();
            d8.a(q8Var, map, v7Var, lVar);
            return new s7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastAdVerification", "Error occurred while initializing", th);
            }
            lVar.E().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.f8175d;
    }

    public List c() {
        return this.f8173b;
    }

    public String d() {
        return this.f8172a;
    }

    public String e() {
        return this.f8174c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s7 s7Var = (s7) obj;
        String str = this.f8172a;
        if (str == null ? s7Var.f8172a != null : !str.equals(s7Var.f8172a)) {
            return false;
        }
        List list = this.f8173b;
        if (list == null ? s7Var.f8173b != null : !list.equals(s7Var.f8173b)) {
            return false;
        }
        String str2 = this.f8174c;
        if (str2 == null ? s7Var.f8174c != null : !str2.equals(s7Var.f8174c)) {
            return false;
        }
        Set set = this.f8175d;
        Set set2 = s7Var.f8175d;
        if (set != null) {
            return set.equals(set2);
        }
        return set2 == null;
    }

    public int hashCode() {
        String str = this.f8172a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f8173b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f8174c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f8175d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f8172a + "'javascriptResources='" + this.f8173b + "'verificationParameters='" + this.f8174c + "'errorEventTrackers='" + this.f8175d + "'}";
    }

    public static s7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), lVar);
            if (y7VarA != null) {
                arrayList.add(y7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), lVar);
            if (b8VarA != null) {
                hashSet.add(b8VarA);
            }
        }
        return new s7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f8172a);
        if (this.f8173b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f8173b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f8174c);
        if (this.f8175d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f8175d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((b8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
