package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import g7.EinF.ZHgPsTG;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public class g3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final d7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f6630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f6637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f6638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f6639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f6640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f6641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f6642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f6643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f6644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f6645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f6646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f6647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f6648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f6649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f6650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f6651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f6652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f6653y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f6654z;

    /* JADX INFO: loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6660a;

        a(String str) {
            this.f6660a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f6660a;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6669c;

        b(String str, int i10, String str2) {
            this.f6667a = str;
            this.f6668b = i10;
            this.f6669c = str2;
        }

        public String b() {
            return this.f6669c;
        }

        public String c() {
            return this.f6667a;
        }

        public int d() {
            return this.f6668b;
        }
    }

    private a a() {
        a aVar;
        if (!this.f6632d) {
            aVar = this.f6633e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        } else if (this.f6633e) {
            aVar = a.COMPLETE;
        } else {
            aVar = this.f6635g ? a.MISSING : a.INCOMPLETE_INTEGRATION;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f6654z.iterator();
        while (it.hasNext()) {
            if (!((r4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((l1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        if (!this.f6643o || com.applovin.impl.sdk.l.H0()) {
            return E() ? a.INCOMPLETE_INTEGRATION : aVar;
        }
        return a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f6634f;
    }

    public boolean B() {
        return this.f6636h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f6643o;
    }

    public boolean E() {
        if (!this.f6642n || !StringUtils.isValidString(this.f6647s)) {
            return false;
        }
        return !q7.d(this.f6647s).equals(q7.a(this.f6648t, this.f6647s.split("\\.").length));
    }

    public boolean F() {
        return this.f6632d;
    }

    public boolean G() {
        return this.f6630b == a.MISSING && this.f6639k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f6640l;
    }

    public boolean J() {
        return this.f6641m;
    }

    public String b() {
        return this.f6646r;
    }

    public String c() {
        return this.f6648t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f6645q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f6652x;
    }

    public int i() {
        return this.f6631c;
    }

    public String k() {
        return this.f6649u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f6644p;
    }

    public List n() {
        return this.f6654z;
    }

    public final com.applovin.impl.sdk.l o() {
        return this.f6629a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f6646r.equals(string)) {
            this.f6631c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = y3.a(string, this.f6629a);
            if (maxAdapterA != null) {
                String strA = y3.a(maxAdapterA);
                if (this.f6647s.equals(strA)) {
                    return;
                }
                this.f6647s = strA;
                this.f6629a.u().a(this.f6647s, string);
            }
        }
    }

    public String p() {
        return this.f6647s;
    }

    public a q() {
        return this.f6630b;
    }

    public List r() {
        return this.f6653y;
    }

    public List s() {
        return this.B;
    }

    public d7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f6644p + ", displayName=" + this.f6645q + ", sdkAvailable=" + this.f6632d + ", sdkVersion=" + this.f6647s + ", adapterAvailable=" + this.f6633e + ", adapterVersion=" + this.f6648t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f6650v;
    }

    public String w() {
        return this.f6651w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f6637i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f6630b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !F() || !z())) {
            return b.INVALID_INTEGRATION;
        }
        if (this.f6629a.u0().c()) {
            return (this.f6638j && (this.f6631c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f6631c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY;
        }
        return b.DISABLED;
    }

    public boolean z() {
        return this.f6633e;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0258  */
    /* JADX WARN: Code duplicated, block: B:71:0x026a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0276  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c9  */
    public g3(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String adapterVersion;
        String strA;
        boolean zEquals;
        String string;
        boolean zIsBeta;
        boolean z10;
        boolean z11;
        int iLastIndexOf;
        String lowerCase;
        Integer numA;
        JSONObject jSONObject2;
        String string2;
        boolean z12;
        this.f6629a = lVar;
        String string3 = JsonUtils.getString(jSONObject, "name", "");
        this.f6644p = string3;
        this.f6645q = JsonUtils.getString(jSONObject, "display_name", "");
        this.f6646r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f6649u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f6639k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "configuration", new JSONObject());
        this.f6654z = a(jSONObject3, lVar);
        this.f6643o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.f6642n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.D = Arrays.asList(string3);
            this.E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string3));
            HashMap map = new HashMap(jSONObject5.length());
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string4 = JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.D = arrayList;
            this.E = map;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.f6637i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.f6638j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f6650v = JsonUtils.getString(jSONObject6, "message", null);
        this.G = new d7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.f6645q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f6632d = q7.a(list);
        } else {
            this.f6632d = q7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List listEmptyList = Collections.emptyList();
        String str = this.f6646r;
        String string5 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.f6646r = string5;
        }
        MaxAdapter maxAdapterA = y3.a(str, lVar);
        if (maxAdapterA != null) {
            this.f6633e = true;
            try {
                adapterVersion = maxAdapterA.getAdapterVersion();
                try {
                    strA = y3.a(maxAdapterA);
                    try {
                        this.f6636h = y3.a(maxAdapterA, this.f6646r);
                        listEmptyList = a(maxAdapterA, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string6 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            z12 = string6 == null || q7.a(adapterVersion, string6) >= 0;
                            try {
                                string = JsonUtils.getString(jSONObject7, "network_name", null);
                            } catch (Throwable th) {
                                th = th;
                                string = null;
                                com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f6644p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                z10 = z12;
                                zIsBeta = false;
                                Class<?> cls = Class.forName(this.f6646r);
                                zEquals = cls.getMethod(ZHgPsTG.PrmTX, MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                                this.f6648t = adapterVersion;
                                this.f6647s = strA;
                                this.f6653y = listEmptyList;
                                this.f6640l = zEquals;
                                this.f6641m = z10;
                                this.f6651w = string;
                                this.A = a(jSONObject3, adapterVersion, lVar);
                                this.f6635g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.f6630b = a();
                                if (adapterVersion.equals(this.f6649u)) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                this.f6634f = z11;
                                Context contextP = com.applovin.impl.sdk.l.p();
                                iLastIndexOf = this.f6644p.lastIndexOf("_");
                                if (iLastIndexOf != -1) {
                                    lowerCase = this.f6644p.toLowerCase().substring(0, iLastIndexOf);
                                } else {
                                    lowerCase = this.f6644p.toLowerCase();
                                }
                                this.f6652x = contextP.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextP.getPackageName());
                                this.f6631c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(contextP).subscribe(this, "adapter_initialization_status");
                                numA = lVar.U().a(this.f6646r);
                                if (numA != null) {
                                    this.f6631c = numA.intValue();
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                                return;
                            }
                        } else {
                            string = null;
                            z12 = false;
                        }
                        try {
                            z10 = z12;
                            zIsBeta = maxAdapterA.isBeta();
                        } catch (Throwable th2) {
                            th = th2;
                            com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f6644p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                            z10 = z12;
                            zIsBeta = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        string = null;
                        z12 = false;
                        com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f6644p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        z10 = z12;
                        zIsBeta = false;
                        Class<?> cls2 = Class.forName(this.f6646r);
                        zEquals = cls2.getMethod(ZHgPsTG.PrmTX, MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                        this.f6648t = adapterVersion;
                        this.f6647s = strA;
                        this.f6653y = listEmptyList;
                        this.f6640l = zEquals;
                        this.f6641m = z10;
                        this.f6651w = string;
                        this.A = a(jSONObject3, adapterVersion, lVar);
                        this.f6635g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.f6630b = a();
                        if (adapterVersion.equals(this.f6649u)) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        this.f6634f = z11;
                        Context contextP2 = com.applovin.impl.sdk.l.p();
                        iLastIndexOf = this.f6644p.lastIndexOf("_");
                        if (iLastIndexOf != -1) {
                            lowerCase = this.f6644p.toLowerCase().substring(0, iLastIndexOf);
                        } else {
                            lowerCase = this.f6644p.toLowerCase();
                        }
                        this.f6652x = contextP2.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextP2.getPackageName());
                        this.f6631c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(contextP2).subscribe(this, "adapter_initialization_status");
                        numA = lVar.U().a(this.f6646r);
                        if (numA != null) {
                            this.f6631c = numA.intValue();
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    strA = "";
                }
            } catch (Throwable th5) {
                th = th5;
                adapterVersion = "";
                strA = adapterVersion;
            }
            try {
                Class<?> cls3 = Class.forName(this.f6646r);
                zEquals = cls3.getMethod(ZHgPsTG.PrmTX, MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls3);
            } catch (Throwable th6) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th6);
                }
                zEquals = false;
            }
        } else {
            this.f6633e = false;
            adapterVersion = "";
            strA = adapterVersion;
            zEquals = false;
            string = null;
            zIsBeta = false;
            z10 = false;
        }
        this.f6648t = adapterVersion;
        this.f6647s = strA;
        this.f6653y = listEmptyList;
        this.f6640l = zEquals;
        this.f6641m = z10;
        this.f6651w = string;
        this.A = a(jSONObject3, adapterVersion, lVar);
        this.f6635g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f6630b = a();
        if (adapterVersion.equals(this.f6649u) || zIsBeta) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f6634f = z11;
        Context contextP3 = com.applovin.impl.sdk.l.p();
        iLastIndexOf = this.f6644p.lastIndexOf("_");
        if (iLastIndexOf != -1) {
            lowerCase = this.f6644p.toLowerCase().substring(0, iLastIndexOf);
        } else {
            lowerCase = this.f6644p.toLowerCase();
        }
        this.f6652x = contextP3.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextP3.getPackageName());
        this.f6631c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextP3).subscribe(this, "adapter_initialization_status");
        numA = lVar.U().a(this.f6646r);
        if (numA != null) {
            this.f6631c = numA.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.f6632d) {
            this.H = false;
            this.I = null;
            this.J = null;
            return;
        }
        this.H = true;
        this.I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap map2 = new HashMap(jSONObject8.length());
        Iterator<String> itKeys2 = jSONObject8.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (fromString2 != null && jSONObject9 != null && (string2 = JsonUtils.getString(jSONObject9, "uuid", null)) != null) {
                map2.put(fromString2, new x(string2, jSONObject9, fromString2));
            }
        }
        this.J = map2;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f6644p);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f6630b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f6632d || TextUtils.isEmpty(this.f6647s)) ? "UNAVAILABLE" : this.f6647s);
        sb2.append(GEmOVMyH.veT);
        if (this.f6633e && !TextUtils.isEmpty(this.f6648t)) {
            str = this.f6648t;
        }
        sb2.append(str);
        for (r4 r4Var : n()) {
            if (!r4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(r4Var.b());
                sb2.append(": ");
                sb2.append(r4Var.a());
            }
        }
        for (l1 l1Var : f()) {
            if (!l1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(l1Var.b());
                sb2.append(": ");
                sb2.append(l1Var.a());
            }
        }
        return sb2.toString();
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f6646r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            r4 r4Var = new r4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.l.p());
            if (r4Var.c()) {
                arrayList.add(r4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new r4(next, jSONObject2.getString(next), com.applovin.impl.sdk.l.p()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new l1(jSONObject2, lVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && l1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new l1(jSONObject3, lVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g3 g3Var) {
        return this.f6645q.compareToIgnoreCase(g3Var.f6645q);
    }
}
