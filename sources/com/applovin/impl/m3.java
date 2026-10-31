package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f7104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f7105b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f7107d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f7109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j5 f7110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final j5 f7111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7113j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7106c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Object f7108e = new Object();

    public m3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f7104a = lVar;
        if (((Boolean) lVar.a(z4.G6)).booleanValue()) {
            this.f7110g = new j5(jSONObject2);
            this.f7111h = new j5(jSONObject);
            this.f7105b = null;
            this.f7107d = null;
        } else {
            this.f7105b = jSONObject2;
            this.f7107d = jSONObject;
            this.f7110g = null;
            this.f7111h = null;
        }
        this.f7109f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f7104a.a(t3.f8805m8)).intValue()));
    }

    protected double a(String str, double d10) {
        double d11;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str, d10);
        }
        synchronized (this.f7106c) {
            d11 = JsonUtils.getDouble(this.f7105b, str, d10);
        }
        return d11;
    }

    protected Boolean b(String str, Boolean bool) {
        Boolean bool2;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str, bool);
        }
        synchronized (this.f7106c) {
            bool2 = JsonUtils.getBoolean(this.f7105b, str, bool);
        }
        return bool2;
    }

    protected boolean c(String str) {
        boolean zHas;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str);
        }
        synchronized (this.f7108e) {
            zHas = this.f7107d.has(str);
        }
        return zHas;
    }

    protected boolean d(String str) {
        boolean zHas;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str);
        }
        synchronized (this.f7106c) {
            zHas = this.f7105b.has(str);
        }
        return zHas;
    }

    protected Object e(String str) {
        Object objOpt;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.b(str);
        }
        synchronized (this.f7108e) {
            objOpt = this.f7107d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a();
        }
        synchronized (this.f7106c) {
            jSONObject = this.f7105b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f7112i;
    }

    public Map i() {
        return this.f7109f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            j5 j5Var = this.f7111h;
            bundle = j5Var != null ? (Bundle) j5Var.a(new o.a() { // from class: com.applovin.impl.xb
                @Override // o.a
                public final Object apply(Object obj) {
                    return m3.a((j5) obj);
                }
            }) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f7104a.p0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, b(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_CURRENCY)) {
            bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, b(AppLovinEventParameters.REVENUE_CURRENCY, ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f7104a.a(t3.I7)).longValue());
    }

    public Boolean n() {
        String str = this.f7104a.p0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f7104a.p0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.f7113j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    protected JSONObject a() {
        JSONObject jSONObject;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a();
        }
        synchronized (this.f7108e) {
            jSONObject = this.f7107d;
        }
        return jSONObject;
    }

    protected int b(String str, int i10) {
        int i11;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str, i10);
        }
        synchronized (this.f7106c) {
            i11 = JsonUtils.getInt(this.f7105b, str, i10);
        }
        return i11;
    }

    protected void c(String str, int i10) {
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            j5Var.b(str, i10);
            return;
        }
        synchronized (this.f7108e) {
            JsonUtils.putInt(this.f7107d, str, i10);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f7104a.t0().j();
    }

    public String e() {
        return this.f7113j;
    }

    public void g(String str) {
        this.f7112i = str;
    }

    protected Boolean a(String str, Boolean bool) {
        Boolean bool2;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, bool);
        }
        synchronized (this.f7108e) {
            bool2 = JsonUtils.getBoolean(this.f7107d, str, bool);
        }
        return bool2;
    }

    protected JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str, jSONArray);
        }
        synchronized (this.f7106c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7105b, str, jSONArray);
        }
        return jSONArray2;
    }

    protected void c(String str, long j10) {
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            j5Var.b(str, j10);
            return;
        }
        synchronized (this.f7108e) {
            JsonUtils.putLong(this.f7107d, str, j10);
        }
    }

    protected double a(String str, float f10) {
        double d10;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, f10);
        }
        synchronized (this.f7108e) {
            d10 = JsonUtils.getDouble(this.f7107d, str, f10);
        }
        return d10;
    }

    protected long b(String str, long j10) {
        long j11;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str, j10);
        }
        synchronized (this.f7106c) {
            j11 = JsonUtils.getLong(this.f7105b, str, j10);
        }
        return j11;
    }

    protected void c(String str, String str2) {
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            j5Var.b(str, str2);
            return;
        }
        synchronized (this.f7108e) {
            JsonUtils.putString(this.f7107d, str, str2);
        }
    }

    protected int a(String str, int i10) {
        int i11;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, i10);
        }
        synchronized (this.f7108e) {
            i11 = JsonUtils.getInt(this.f7107d, str, i10);
        }
        return i11;
    }

    protected String b(String str, String str2) {
        String string;
        j5 j5Var = this.f7110g;
        if (j5Var != null) {
            return j5Var.a(str, str2);
        }
        synchronized (this.f7106c) {
            string = JsonUtils.getString(this.f7105b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    protected JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, jSONArray);
        }
        synchronized (this.f7108e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7107d, str, jSONArray);
        }
        return jSONArray2;
    }

    protected float b(String str, float f10) {
        float f11;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, f10);
        }
        synchronized (this.f7108e) {
            f11 = JsonUtils.getFloat(this.f7107d, str, f10);
        }
        return f11;
    }

    protected JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, jSONObject);
        }
        synchronized (this.f7108e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f7107d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            j5 j5Var = this.f7110g;
            if (j5Var != null) {
                listOptList = j5Var.b(str, Collections.emptyList());
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            j5 j5Var2 = this.f7111h;
            if (j5Var2 != null) {
                listOptList2 = j5Var2.b(str, Collections.emptyList());
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(listOptList.size() + listOptList2.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    protected long a(String str, long j10) {
        long j11;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, j10);
        }
        synchronized (this.f7108e) {
            j11 = JsonUtils.getLong(this.f7107d, str, j10);
        }
        return j11;
    }

    protected String a(String str, String str2) {
        String string;
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            return j5Var.a(str, str2);
        }
        synchronized (this.f7108e) {
            string = JsonUtils.getString(this.f7107d, str, str2);
        }
        return string;
    }

    protected void a(String str, Object obj) {
        j5 j5Var = this.f7111h;
        if (j5Var != null) {
            j5Var.a(str, obj);
            return;
        }
        synchronized (this.f7108e) {
            JsonUtils.putObject(this.f7107d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(j5 j5Var) {
        return JsonUtils.toBundle(j5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}
