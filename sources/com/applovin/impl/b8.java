package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6190e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6191f = -1;

    private b8() {
    }

    public static b8 a(q8 q8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = q8Var.d();
            if (TextUtils.isEmpty(strD)) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            b8 b8Var = new b8();
            b8Var.f6188c = strD;
            b8Var.f6186a = (String) q8Var.a().get("id");
            b8Var.f6187b = (String) q8Var.a().get("event");
            b8Var.f6189d = ((Boolean) lVar.a(z4.f9310o5)).booleanValue();
            if (v7Var != null) {
                b8Var.f6189d = JsonUtils.getBoolean(v7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(b8Var.f6189d)).booleanValue();
            }
            b8Var.f6191f = a(b8Var.b(), v7Var);
            String str = (String) q8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    b8Var.f6191f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                } else if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    int i10 = size - 1;
                    long j10 = 0;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        String str2 = listExplode.get(i11);
                        if (StringUtils.isNumeric(str2)) {
                            int i12 = Integer.parseInt(str2);
                            if (i11 == i10) {
                                seconds = i12;
                            } else if (i11 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i12);
                            } else if (i11 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i12);
                            }
                            j10 += seconds;
                        }
                    }
                    b8Var.f6190e = j10;
                    b8Var.f6191f = -1;
                }
            }
            return b8Var;
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastTracker", "Error occurred while initializing", th);
            }
            lVar.E().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.f6187b;
    }

    public String c() {
        return this.f6188c;
    }

    public boolean d() {
        return this.f6189d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.f6190e != b8Var.f6190e || this.f6191f != b8Var.f6191f) {
            return false;
        }
        String str = this.f6186a;
        if (str == null ? b8Var.f6186a != null : !str.equals(b8Var.f6186a)) {
            return false;
        }
        String str2 = this.f6187b;
        if (str2 == null ? b8Var.f6187b == null : str2.equals(b8Var.f6187b)) {
            return this.f6188c.equals(b8Var.f6188c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6186a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6187b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f6188c.hashCode()) * 31;
        long j10 = this.f6190e;
        return ((iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f6191f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f6186a + "', event='" + this.f6187b + "', uriString='" + this.f6188c + "', offsetSeconds=" + this.f6190e + ", offsetPercent=" + this.f6191f + '}';
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f6190e;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f6191f;
        boolean z12 = i11 >= 0;
        boolean z13 = i10 >= i11;
        if (z10 && z11) {
            return true;
        }
        return z12 && z13;
    }

    private static int a(String str, v7 v7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (v7Var != null) {
            return v7Var.g();
        }
        return 95;
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        b8Var.f6188c = string;
        b8Var.f6186a = JsonUtils.getString(jSONObject, "identifier", "");
        b8Var.f6187b = JsonUtils.getString(jSONObject, "event", "");
        b8Var.f6190e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        b8Var.f6191f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return b8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f6186a);
        JsonUtils.putString(jSONObject, "event", this.f6187b);
        JsonUtils.putString(jSONObject, "uri_string", this.f6188c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f6190e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f6191f);
        return jSONObject;
    }
}
