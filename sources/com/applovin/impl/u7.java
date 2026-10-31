package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f8893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z7 f8894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8895e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8896f = new HashMap();

    private u7() {
    }

    public static u7 a(q8 q8Var, u7 u7Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        q8 q8VarC;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (u7Var == null) {
            try {
                u7Var = new u7();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                lVar.E().a("VastCompanionAd", th);
                return null;
            }
        }
        if (u7Var.f8891a == 0 && u7Var.f8892b == 0) {
            int i10 = StringUtils.parseInt((String) q8Var.a().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
            int i11 = StringUtils.parseInt((String) q8Var.a().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
            if (i10 > 0 && i11 > 0) {
                u7Var.f8891a = i10;
                u7Var.f8892b = i11;
            }
        }
        u7Var.f8894d = z7.a(q8Var, u7Var.f8894d, lVar);
        if (u7Var.f8893c == null && (q8VarC = q8Var.c("CompanionClickThrough")) != null) {
            String strD = q8VarC.d();
            if (StringUtils.isValidString(strD)) {
                u7Var.f8893c = Uri.parse(strD);
            }
        }
        d8.a(q8Var.a("CompanionClickTracking"), u7Var.f8895e, v7Var, lVar);
        d8.a(q8Var, u7Var.f8896f, v7Var, lVar);
        return u7Var;
    }

    public Set b() {
        return this.f8895e;
    }

    public Uri c() {
        return this.f8893c;
    }

    public Map d() {
        return this.f8896f;
    }

    public z7 e() {
        return this.f8894d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (this.f8891a != u7Var.f8891a || this.f8892b != u7Var.f8892b) {
            return false;
        }
        Uri uri = this.f8893c;
        if (uri == null ? u7Var.f8893c != null : !uri.equals(u7Var.f8893c)) {
            return false;
        }
        z7 z7Var = this.f8894d;
        if (z7Var == null ? u7Var.f8894d != null : !z7Var.equals(u7Var.f8894d)) {
            return false;
        }
        Set set = this.f8895e;
        if (set == null ? u7Var.f8895e != null : !set.equals(u7Var.f8895e)) {
            return false;
        }
        Map map = this.f8896f;
        Map map2 = u7Var.f8896f;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public int hashCode() {
        int i10 = ((this.f8891a * 31) + this.f8892b) * 31;
        Uri uri = this.f8893c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        z7 z7Var = this.f8894d;
        int iHashCode2 = (iHashCode + (z7Var != null ? z7Var.hashCode() : 0)) * 31;
        Set set = this.f8895e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f8896f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f8891a + ", height=" + this.f8892b + ", destinationUri=" + this.f8893c + ", nonVideoResource=" + this.f8894d + ", clickTrackers=" + this.f8895e + ", eventTrackers=" + this.f8896f + '}';
    }

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0);
        int i11 = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        z7 z7VarA = z7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), lVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, oqHAiWkeGzWld.qorOZTZrQlHI, new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArray, i12, (JSONObject) null), lVar);
            if (b8VarA != null) {
                hashSet.add(b8VarA);
            }
        }
        u7 u7Var = new u7();
        u7Var.f8891a = i10;
        u7Var.f8892b = i11;
        u7Var.f8893c = uri;
        u7Var.f8894d = z7VarA;
        u7Var.f8895e.addAll(hashSet);
        return u7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.f8891a);
        JsonUtils.putInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.f8892b);
        Uri uri = this.f8893c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        z7 z7Var = this.f8894d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", z7Var != null ? z7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f8895e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((b8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
