package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a3 extends m3 implements MaxAd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f5937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f5938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f5939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c3 f5940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f5941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f5942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaxAdWaterfallInfo f5943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f5944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f5945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f5946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f5949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f5950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f5951y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f5952z;

    protected a3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.l lVar) {
        super(c3Var.e(), jSONObject, jSONObject2, lVar);
        this.f5937k = new AtomicBoolean();
        this.f5938l = new AtomicBoolean();
        this.f5939m = new AtomicBoolean();
        this.f5940n = c3Var;
        this.f5941o = hVar;
        this.f5942p = hVar != null ? hVar.b() : null;
    }

    private long M() {
        return a("load_started_time_ms", 0L);
    }

    public static a3 a(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new d3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new f3(c3Var, jSONObject, jSONObject2, lVar);
        }
        if (fromString.isFullscreenAd()) {
            return new e3(c3Var, jSONObject, jSONObject2, lVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(j5 j5Var) {
        return Double.valueOf(JsonUtils.getDouble(j5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(j5 j5Var) {
        return JsonUtils.deepCopy(j5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(j5 j5Var) {
        return JsonUtils.getString(j5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public String A() {
        return this.f5942p;
    }

    public com.applovin.impl.mediation.h B() {
        return this.f5941o;
    }

    public String C() {
        return a("bcode", "");
    }

    public long D() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String E() {
        return a("bid_response", (String) null);
    }

    public Bundle F() {
        JSONObject jSONObjectA;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return (Bundle) j5Var.a(new o.a() { // from class: com.applovin.impl.v8
                @Override // o.a
                public final Object apply(Object obj) {
                    return this.f8958a.c((j5) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", U());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long G() {
        return this.f5950x;
    }

    public double H() {
        return a("ecpm", -1.0f);
    }

    public long I() {
        if (M() > 0) {
            return L() - M();
        }
        return -1L;
    }

    public double J() {
        return a("floor", -1.0d);
    }

    public long K() {
        return this.f5948v;
    }

    public long L() {
        return a("load_completed_time_ms", 0L);
    }

    public String N() {
        return this.f5951y;
    }

    public int O() {
        return a("mspc", ((Integer) this.f7104a.a(t3.f8811s8)).intValue());
    }

    public JSONObject P() {
        j5 j5Var = this.f7111h;
        return j5Var != null ? (JSONObject) j5Var.a(new o.a() { // from class: com.applovin.impl.w8
            @Override // o.a
            public final Object apply(Object obj) {
                return a3.d((j5) obj);
            }
        }) : a("publisher_extra_info", new JSONObject());
    }

    public c3 Q() {
        return this.f5940n;
    }

    public String R() {
        return JsonUtils.getString(S(), "revenue_event", "");
    }

    public JSONObject S() {
        j5 j5Var = this.f7111h;
        return j5Var != null ? (JSONObject) j5Var.a(new o.a() { // from class: com.applovin.impl.u8
            @Override // o.a
            public final Object apply(Object obj) {
                return a3.f((j5) obj);
            }
        }) : a("revenue_parameters", new JSONObject());
    }

    public String T() {
        return b("event_id", "");
    }

    public String U() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public long V() {
        return this.f5949w;
    }

    public List W() {
        return b("mwf_info_urls");
    }

    public String X() {
        return b("waterfall_name", "");
    }

    public String Y() {
        return b("waterfall_test_name", "");
    }

    public boolean Z() {
        return StringUtils.isValidString(E());
    }

    public abstract a3 a(com.applovin.impl.mediation.h hVar);

    public boolean a0() {
        com.applovin.impl.mediation.h hVar = this.f5941o;
        return hVar != null && hVar.k() && this.f5941o.j();
    }

    public boolean b0() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean c0() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void d0() {
        this.f5950x = SystemClock.elapsedRealtime() - this.f5946t;
    }

    public void e0() {
        this.f5945s = SystemClock.elapsedRealtime();
        this.f5947u = this.f7104a.o0().getTotalBackgroundDurationMillis();
    }

    public void f0() {
        long totalBackgroundDurationMillis = this.f7104a.o0().getTotalBackgroundDurationMillis() - this.f5947u;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5945s;
        this.f5949w = jElapsedRealtime;
        this.f5948v = jElapsedRealtime - totalBackgroundDurationMillis;
    }

    public void g0() {
        this.f5946t = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f5952z;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f5941o;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f5944r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f7104a.a(t3.f8817x8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            j5 j5Var = this.f7111h;
            return j5Var != null ? ((Double) j5Var.a(new o.a() { // from class: com.applovin.impl.x8
                @Override // o.a
                public final Object apply(Object obj) {
                    return a3.e((j5) obj);
                }
            })).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f7104a.Q();
        if (!com.applovin.impl.sdk.p.a()) {
            return 0.0d;
        }
        this.f7104a.Q().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        j5 j5Var = this.f7111h;
        return j5Var != null ? (String) j5Var.a(new o.a() { // from class: com.applovin.impl.z8
            @Override // o.a
            public final Object apply(Object obj) {
                return a3.g((j5) obj);
            }
        }) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f5943q;
    }

    public void h(String str) {
        this.f5952z = str;
    }

    public void h0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void i(String str) {
        this.f5951y = str;
    }

    public void i0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean j0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public Boolean k0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public Boolean l0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.impl.m3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public View z() {
        com.applovin.impl.mediation.h hVar;
        if (!a0() || (hVar = this.f5941o) == null) {
            return null;
        }
        return hVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(j5 j5Var) {
        JSONObject jSONObjectA;
        if (j5Var.a("credentials")) {
            jSONObjectA = j5Var.a("credentials", new JSONObject());
        } else {
            jSONObjectA = j5Var.a(edUJlCZxhVnO.vuwEmOx, new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", U());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectY = y();
        if (jSONObjectY.has(str)) {
            return JsonUtils.getString(jSONObjectY, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectP = P();
        return jSONObjectP.has(str) ? JsonUtils.getString(jSONObjectP, str, str2) : a(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a(vgmm.FpvxwhJL, (String) null);
    }

    public void t() {
        this.f5941o = null;
        this.f5943q = null;
    }

    public AtomicBoolean u() {
        return this.f5937k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f5939m;
    }

    public AtomicBoolean x() {
        return this.f5938l;
    }

    public JSONObject y() {
        j5 j5Var = this.f7111h;
        return j5Var != null ? (JSONObject) j5Var.a(new o.a() { // from class: com.applovin.impl.y8
            @Override // o.a
            public final Object apply(Object obj) {
                return a3.b((j5) obj);
            }
        }) : a("ad_values", new JSONObject());
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f5943q = maxAdWaterfallInfo;
    }

    public void a(long j10) {
        this.f5944r = j10;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectP = P();
        JsonUtils.putAll(jSONObjectP, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectP);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
