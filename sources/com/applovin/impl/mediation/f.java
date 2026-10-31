package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.b5;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.l6;
import com.applovin.impl.m1;
import com.applovin.impl.m3;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7470c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f7471d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7472e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONArray f7473f = new JSONArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f7474g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f7475h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f7476i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f7477j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f7478k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f7479l;

    public f(com.applovin.impl.sdk.l lVar) {
        this.f7468a = lVar;
        this.f7469b = lVar.Q();
    }

    public void a(Activity activity) {
        if (this.f7470c.compareAndSet(false, true)) {
            String str = (String) this.f7468a.a(b5.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<m3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f7468a.u0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f7479l = listA;
                    for (m3 m3Var : listA) {
                        this.f7476i.put(m3Var.b(), m3Var);
                    }
                    long j10 = StringUtils.parseLong(this.f7468a.p0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    m5 m5Var = new m5(listA, activity, this.f7468a);
                    if (j10 > 0) {
                        this.f7468a.s0().a(m5Var, f6.b.MEDIATION, j10);
                    } else {
                        this.f7468a.s0().a(m5Var);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7469b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                    m1.a((Throwable) e10);
                }
            }
        }
    }

    public boolean c() {
        return this.f7470c.get();
    }

    private void c(m3 m3Var) {
        String strB = m3Var.b();
        synchronized (this.f7472e) {
            if (this.f7471d.contains(strB)) {
                return;
            }
            this.f7471d.add(strB);
            this.f7468a.R().d(f2.f6477d0, h2.a(m3Var));
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f7475h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f7473f);
        }
        return jSONArrayShallowCopy;
    }

    boolean b(m3 m3Var) {
        boolean zContainsKey;
        synchronized (this.f7475h) {
            zContainsKey = this.f7474g.containsKey(m3Var.b());
        }
        return zContainsKey;
    }

    public u4 a(m3 m3Var, Activity activity) {
        m3 m3VarA = a(m3Var);
        if (m3VarA == null) {
            return u4.a("AdapterInitialization:" + m3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = m3Var.b();
        synchronized (this.f7478k) {
            u4 u4Var = (u4) this.f7477j.get(strB);
            if (u4Var != null) {
                boolean z10 = true;
                boolean z11 = m3VarA.q() && u4Var.e();
                if (!((Boolean) this.f7468a.a(z4.Y6)).booleanValue() || !u4Var.a()) {
                    z10 = false;
                }
                if (!z11 && !z10) {
                    return u4Var;
                }
            }
            final u4 u4Var2 = new u4("AdapterInitialization:" + m3Var.c());
            this.f7477j.put(strB, u4Var2);
            h hVarA = this.f7468a.V().a(m3VarA);
            if (hVarA == null) {
                u4Var2.a("Adapter implementation not found");
                return u4Var2;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f7469b.d("MediationAdapterInitializationManager", "Initializing adapter " + m3VarA);
            }
            c(m3VarA);
            hVarA.a(MaxAdapterParametersImpl.a(m3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.w
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                    f.a(u4Var2, initializationStatus, str);
                }
            });
            l6.a(m3VarA.m(), u4Var2, "The adapter (" + m3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f7468a);
            return u4Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(u4 u4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                u4Var.a(str);
                return;
            } else {
                u4Var.b(initializationStatus);
                return;
            }
        }
        m1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        u4Var.a("Adapter reported INITIALIZING");
    }

    private m3 a(m3 m3Var) {
        List<m3> list;
        if (((Boolean) this.f7468a.a(t3.I8)).booleanValue()) {
            m3 m3Var2 = (m3) this.f7476i.get(m3Var.b());
            return m3Var2 != null ? m3Var2 : m3Var;
        }
        if (!this.f7468a.u0().c() || (list = this.f7479l) == null) {
            return m3Var;
        }
        for (m3 m3Var3 : list) {
            if (m3Var3.b().equals(m3Var.b())) {
                return m3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f7475h) {
            num = (Integer) this.f7474g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f7475h) {
            hashSet = new HashSet(this.f7474g.keySet());
        }
        return hashSet;
    }

    void a(m3 m3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z10;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f7475h) {
            z10 = !b(m3Var);
            if (z10) {
                this.f7474g.put(m3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", m3Var.b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f7473f.put(jSONObject);
            }
        }
        if (z10) {
            this.f7468a.a(m3Var);
            this.f7468a.Z().processAdapterInitializationPostback(m3Var, j10, initializationStatus, str);
            this.f7468a.u().a(initializationStatus, m3Var.b());
        }
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new m3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f7468a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f7475h) {
            this.f7474g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f7468a.u().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
