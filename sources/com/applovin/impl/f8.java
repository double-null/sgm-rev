package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f6580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f6581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6585g;

    public enum a {
        Progressive,
        Streaming
    }

    private f8() {
    }

    public static f8 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = q8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                lVar.Q();
                if (!com.applovin.impl.sdk.p.a()) {
                    return null;
                }
                lVar.Q().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            f8 f8Var = new f8();
            f8Var.f6579a = uri;
            f8Var.f6580b = uri;
            f8Var.f6585g = a(q8Var);
            f8Var.f6581c = a((String) q8Var.a().get("delivery"));
            f8Var.f6584f = StringUtils.parseInt((String) q8Var.a().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
            f8Var.f6583e = StringUtils.parseInt((String) q8Var.a().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
            f8Var.f6582d = ((String) q8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return f8Var;
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastVideoFile", "Error occurred while initializing", th);
            }
            lVar.E().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.f6585g;
    }

    public String c() {
        return this.f6582d;
    }

    public Uri d() {
        return this.f6579a;
    }

    public Uri e() {
        return this.f6580b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        if (this.f6583e != f8Var.f6583e || this.f6584f != f8Var.f6584f || this.f6585g != f8Var.f6585g) {
            return false;
        }
        Uri uri = this.f6579a;
        if (uri == null ? f8Var.f6579a != null : !uri.equals(f8Var.f6579a)) {
            return false;
        }
        Uri uri2 = this.f6580b;
        if (uri2 == null ? f8Var.f6580b != null : !uri2.equals(f8Var.f6580b)) {
            return false;
        }
        if (this.f6581c != f8Var.f6581c) {
            return false;
        }
        String str = this.f6582d;
        String str2 = f8Var.f6582d;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f6579a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f6580b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f6581c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f6582d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f6583e) * 31) + this.f6584f) * 31) + Long.valueOf(this.f6585g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f6579a + ", videoUri=" + this.f6580b + ", deliveryType=" + this.f6581c + ", fileType='" + this.f6582d + "', width=" + this.f6583e + ", height=" + this.f6584f + ", bitrate=" + this.f6585g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(q8 q8Var) {
        Map mapA = q8Var.a();
        long j10 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        return j10 != 0 ? j10 : (StringUtils.parseLong((String) mapA.get("minBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f6580b = uri;
    }

    public static f8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0);
        int i11 = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0);
        int i12 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        f8 f8Var = new f8();
        f8Var.f6579a = uri;
        f8Var.f6580b = uri2;
        f8Var.f6581c = aVarValueOf;
        f8Var.f6582d = string2;
        f8Var.f6583e = i10;
        f8Var.f6584f = i11;
        f8Var.f6585g = i12;
        return f8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f6579a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f6580b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f6581c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f6582d);
        JsonUtils.putInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.f6583e);
        JsonUtils.putInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.f6584f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f6585g);
        return jSONObject;
    }
}
