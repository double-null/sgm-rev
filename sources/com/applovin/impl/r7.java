package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r7 extends com.applovin.impl.sdk.ad.b {
    private final Set A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f8094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f8095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a8 f8096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f8097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e8 f8098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final u7 f8099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f8100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final t7 f8101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final n4 f8102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Set f8103z;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f8104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f8105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.l f8106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f8107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f8108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f8109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a8 f8110g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e8 f8111h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private u7 f8112i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private t7 f8113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Set f8114k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Set f8115l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f8105b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f8108e = str;
            return this;
        }

        public b b(Set set) {
            this.f8114k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f8104a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.l lVar) {
            if (lVar != null) {
                this.f8106c = lVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f8109f = str;
            return this;
        }

        public b a(a8 a8Var) {
            this.f8110g = a8Var;
            return this;
        }

        public b a(e8 e8Var) {
            this.f8111h = e8Var;
            return this;
        }

        public b a(u7 u7Var) {
            this.f8112i = u7Var;
            return this;
        }

        public b a(t7 t7Var) {
            this.f8113j = t7Var;
            return this;
        }

        public b a(Set set) {
            this.f8115l = set;
            return this;
        }

        public b a(long j10) {
            this.f8107d = j10;
            return this;
        }

        public r7 a() {
            return new r7(this);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set h1() {
        u7 u7Var = this.f8099v;
        return u7Var != null ? u7Var.b() : Collections.emptySet();
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(j5 j5Var) {
        return q7.a(j5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), L(), N0(), this.sdk);
    }

    private Set o1() {
        e8 e8Var = this.f8098u;
        return e8Var != null ? e8Var.b() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List B() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new o.a() { // from class: com.applovin.impl.le
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f7083a.o((j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), L(), N0(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean D0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String K() {
        return this.f8100w;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public void d(String str) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri e0() {
        return f1();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7) || !super.equals(obj)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        String str = this.f8094q;
        if (str == null ? r7Var.f8094q != null : !str.equals(r7Var.f8094q)) {
            return false;
        }
        String str2 = this.f8095r;
        if (str2 == null ? r7Var.f8095r != null : !str2.equals(r7Var.f8095r)) {
            return false;
        }
        a8 a8Var = this.f8096s;
        if (a8Var == null ? r7Var.f8096s != null : !a8Var.equals(r7Var.f8096s)) {
            return false;
        }
        e8 e8Var = this.f8098u;
        if (e8Var == null ? r7Var.f8098u != null : !e8Var.equals(r7Var.f8098u)) {
            return false;
        }
        u7 u7Var = this.f8099v;
        if (u7Var == null ? r7Var.f8099v != null : !u7Var.equals(r7Var.f8099v)) {
            return false;
        }
        t7 t7Var = this.f8101x;
        if (t7Var == null ? r7Var.f8101x != null : !t7Var.equals(r7Var.f8101x)) {
            return false;
        }
        Set set = this.f8103z;
        if (set == null ? r7Var.f8103z != null : !set.equals(r7Var.f8103z)) {
            return false;
        }
        Set set2 = this.A;
        Set set3 = r7Var.A;
        if (set2 != null) {
            return set2.equals(set3);
        }
        return set3 == null;
    }

    public Uri f1() {
        e8 e8Var = this.f8098u;
        if (e8Var != null) {
            return e8Var.c();
        }
        return null;
    }

    public u7 g1() {
        return this.f8099v;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f8097t;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        e8 e8Var = this.f8098u;
        return (e8Var == null || (listG = e8Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f8094q;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8095r;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        a8 a8Var = this.f8096s;
        int iHashCode4 = (iHashCode3 + (a8Var != null ? a8Var.hashCode() : 0)) * 31;
        e8 e8Var = this.f8098u;
        int iHashCode5 = (iHashCode4 + (e8Var != null ? e8Var.hashCode() : 0)) * 31;
        u7 u7Var = this.f8099v;
        int iHashCode6 = (iHashCode5 + (u7Var != null ? u7Var.hashCode() : 0)) * 31;
        t7 t7Var = this.f8101x;
        int iHashCode7 = (iHashCode6 + (t7Var != null ? t7Var.hashCode() : 0)) * 31;
        Set set = this.f8103z;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.A;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f8101x != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public x7 l1() {
        e8 e8Var = this.f8098u;
        if (e8Var != null) {
            return e8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri n0() {
        f8 f8VarQ1 = q1();
        if (f8VarQ1 != null) {
            return f8VarQ1.e();
        }
        return null;
    }

    public a8 n1() {
        return this.f8096s;
    }

    public e8 p1() {
        return this.f8098u;
    }

    public f8 q1() {
        Long lF = s0.f(this.sdk);
        return this.f8098u.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean r1() {
        return l1() != null;
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f8094q + "', adDescription='" + this.f8095r + "', systemInfo=" + this.f8096s + ", videoCreative=" + this.f8098u + ", companionAd=" + this.f8099v + ", adVerifications=" + this.f8101x + ", impressionTrackers=" + this.f8103z + ", errorTrackers=" + this.A + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean z0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    private r7(b bVar) {
        super(bVar.f8104a, bVar.f8105b, bVar.f8106c);
        this.f8094q = bVar.f8108e;
        this.f8096s = bVar.f8110g;
        this.f8095r = bVar.f8109f;
        this.f8098u = bVar.f8111h;
        this.f8099v = bVar.f8112i;
        this.f8101x = bVar.f8113j;
        this.f8103z = bVar.f8114k;
        this.A = bVar.f8115l;
        this.f8102y = new n4(this);
        Uri uriN0 = n0();
        if (uriN0 != null) {
            this.f8100w = uriN0.toString();
        } else {
            this.f8100w = "";
        }
        this.f8097t = bVar.f8107d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.sdk.Q().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f8103z;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.A;
        }
        this.sdk.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.sdk.Q().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    public t7 e1() {
        return this.f8101x;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public n4 getAdEventTracker() {
        return this.f8102y;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void G0() {
    }

    private Set a(c cVar, String[] strArr) {
        Map mapD;
        u7 u7Var;
        e8 e8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (e8Var = this.f8098u) != null) {
                mapD = e8Var.e();
            } else {
                mapD = (cVar != c.COMPANION_AD || (u7Var = this.f8099v) == null) ? null : u7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((Collection) mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f8105b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f8104a = jSONObject3;
        bVar.f8106c = lVar;
        bVar.f8107d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f8108e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f8109f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f8110g = a8.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), lVar);
        bVar.f8111h = e8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), lVar);
        bVar.f8112i = u7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), lVar);
        bVar.f8113j = t7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), lVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), lVar);
            if (b8VarA != null) {
                hashSet.add(b8VarA);
            }
        }
        bVar.f8114k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            b8 b8VarA2 = b8.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), lVar);
            if (b8VarA2 != null) {
                hashSet2.add(b8VarA2);
            }
        }
        bVar.f8115l = hashSet2;
        r7 r7Var = new r7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                r7Var.a(next, string);
            }
        }
        return r7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f8097t);
        JsonUtils.putString(jSONObject, "title", this.f8094q);
        JsonUtils.putString(jSONObject, "ad_description", this.f8095r);
        a8 a8Var = this.f8096s;
        if (a8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", a8Var.a());
        }
        e8 e8Var = this.f8098u;
        if (e8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", e8Var.a());
        }
        u7 u7Var = this.f8099v;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", u7Var.a());
        }
        t7 t7Var = this.f8101x;
        if (t7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", t7Var.a());
        }
        if (this.f8103z != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f8103z.iterator();
            while (it.hasNext()) {
                jSONArray.put(((b8) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.A != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.A.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((b8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
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
