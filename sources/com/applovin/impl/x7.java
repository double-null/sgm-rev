package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class x7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f9067a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f9068b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f9069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f9070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9072f;

    public static x7 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        q8 q8VarC = q8Var.c("StaticResource");
        if (q8VarC == null || !URLUtil.isValidUrl(q8VarC.d())) {
            lVar.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            lVar.Q().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        x7 x7Var = new x7();
        x7Var.f9069c = Uri.parse(q8VarC.d());
        q8 q8VarB = q8Var.b("IconClickThrough");
        if (q8VarB != null && URLUtil.isValidUrl(q8VarB.d())) {
            x7Var.f9070d = Uri.parse(q8VarB.d());
        }
        String str = (String) q8Var.a().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        int i10 = 0;
        int i11 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) q8Var.a().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i10 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) lVar.a(z4.f9193b5)).intValue();
        if (i11 <= 0 || i10 <= 0) {
            x7Var.f9072f = iIntValue;
            x7Var.f9071e = iIntValue;
        } else {
            double d10 = i11 / i10;
            int iMin = Math.min(Math.max(i11, i10), iIntValue);
            if (i11 >= i10) {
                x7Var.f9071e = iMin;
                x7Var.f9072f = (int) (((double) iMin) / d10);
            } else {
                x7Var.f9072f = iMin;
                x7Var.f9071e = (int) (((double) iMin) * d10);
            }
        }
        return x7Var;
    }

    public Set b() {
        return this.f9067a;
    }

    public Uri c() {
        return this.f9070d;
    }

    public int d() {
        return this.f9072f;
    }

    public Uri e() {
        return this.f9069c;
    }

    public Set f() {
        return this.f9068b;
    }

    public int g() {
        return this.f9071e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.l lVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, lVar);
        return imageView;
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        b8 b8VarA;
        b8 b8VarA2;
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        x7Var.f9069c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (b8VarA2 = b8.a(jSONObject2, lVar)) != null) {
                x7Var.f9067a.add(b8VarA2);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && (b8VarA = b8.a(jSONObject3, lVar)) != null) {
                x7Var.f9068b.add(b8VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        x7Var.f9070d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        x7Var.f9071e = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0);
        x7Var.f9072f = JsonUtils.getInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0);
        return x7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f9067a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((b8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f9068b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((b8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f9069c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f9070d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.f9071e);
        JsonUtils.putInt(jSONObject, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.f9072f);
        return jSONObject;
    }
}
