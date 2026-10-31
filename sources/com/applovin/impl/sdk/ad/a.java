package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.i4;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f8276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f8277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f8278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i4 f8279t;

    public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.f8276q = h1();
        this.f8277r = l1();
        this.f8278s = k1();
        this.f8279t = new i4(this);
    }

    private String k1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(j5 j5Var) {
        j5Var.b("html", this.f8276q);
        j5Var.b("stream_url", this.f8278s);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean D0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void G0() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.a(new w.b() { // from class: com.applovin.impl.sdk.ad.d
                @Override // w.b
                public final void accept(Object obj) {
                    this.f8315a.o((j5) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f8276q);
            JsonUtils.putString(this.adObject, "stream_url", this.f8278s);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String K() {
        return this.f8277r;
    }

    public void a(Uri uri) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void b(List list) {
        String strH1 = h1();
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(strH1)) {
            return;
        }
        Map mapM = m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            String str = (String) mapM.get(string);
            if (StringUtils.isValidString(str)) {
                strH1 = StringUtils.replace(strH1, string, str);
            }
        }
        d(strH1);
    }

    public void d(String str) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri e0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : f1();
    }

    public Uri f1() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public com.applovin.impl.adview.e.a g1() {
        return a(getIntFromAdObject("expandable_style", com.applovin.impl.adview.e.a.INVISIBLE.b()));
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectA;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            jSONObjectA = j5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectA = jSONObjectDeepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f8276q);
            JsonUtils.putString(jSONObject, "video", this.f8277r);
            JsonUtils.putString(jSONObject, "stream_url", this.f8278s);
        }
        return jSONObjectA;
    }

    public String h1() {
        return getStringFromAdObject("html", "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return n0() != null;
    }

    public float i1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.g0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public String j1() {
        return this.f8278s;
    }

    public String l1() {
        return getStringFromAdObject("video", "");
    }

    public boolean m1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        String strK1 = k1();
        if (StringUtils.isValidString(strK1)) {
            return Uri.parse(strK1);
        }
        String strL1 = l1();
        if (StringUtils.isValidString(strL1)) {
            return Uri.parse(strL1);
        }
        return null;
    }

    public void n1() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean z0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public long e1() {
        return getLongFromAdObject("ad_load_timeout_ms", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public i4 getAdEventTracker() {
        return this.f8279t;
    }

    public static a a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, lVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string3 = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                aVar.a(next, string3);
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.a(Uri.parse(string2));
        }
        return aVar;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f8276q);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f8277r);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f8278s);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : m().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", j5Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}
