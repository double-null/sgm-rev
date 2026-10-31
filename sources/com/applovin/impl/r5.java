package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r5 extends k5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONObject f8080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f8081k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f8082l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f8083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f8084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f8085i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements e5.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f8086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f8087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f8089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Collection f8090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f8091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f8092g;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8089d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i10, b bVar, com.applovin.impl.sdk.l lVar) {
            this.f8088c = i10;
            this.f8086a = bVar;
            this.f8091f = lVar;
            this.f8092g = lVar.Q();
            this.f8087b = new Object();
            this.f8090e = new ArrayList(i10);
            this.f8089d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.e5.a
        public void a(e5 e5Var) {
            boolean z10;
            synchronized (this.f8087b) {
                this.f8090e.add(e5Var);
                int i10 = this.f8088c - 1;
                this.f8088c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f8089d.compareAndSet(false, true)) {
                if (q7.i() && ((Boolean) this.f8091f.a(z4.P)).booleanValue()) {
                    this.f8091f.s0().a((k5) new u6(this.f8091f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.ke
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7013a.a();
                        }
                    }), f6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<e5> arrayList;
            synchronized (this.f8087b) {
                arrayList = new ArrayList(this.f8090e);
            }
            JSONArray jSONArray = new JSONArray();
            for (e5 e5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    f5 f5VarF = e5Var.f();
                    jSONObject.put("name", f5VarF.c());
                    jSONObject.put("class", f5VarF.b());
                    jSONObject.put("adapter_version", e5Var.a());
                    jSONObject.put("sdk_version", e5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = e5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", e5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", e5Var.b());
                    jSONObject2.put("is_cached", e5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8092g.a("TaskCollectSignals", "Collected signal from " + f5VarF);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8092g.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f8091f.E().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f8086a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public r5(c3 c3Var, Context context, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskCollectSignals", lVar);
        this.f8083g = c3Var;
        this.f8084h = context;
        this.f8085i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f8085i, this.f6990a);
        this.f6990a.s0().a(new u6(this.f6990a, "timeoutCollectSignal", cVar), f6.b.TIMEOUT, ((Long) this.f6990a.a(t3.H7)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new f5(this.f8083g, jSONArray.getJSONObject(i10), jSONObject, this.f6990a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f8082l.get(this.f8083g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f8083g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f8081k) {
                jSONArray = JsonUtils.getJSONArray(f8080j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f8082l.size() > 0) {
                    b(jSONArray, f8080j);
                    return;
                } else {
                    a(jSONArray, f8080j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.k(this.f6991b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f6990a.a(b5.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f8082l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
            this.f6990a.E().a("TaskCollectSignals", "waitForSignals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
            this.f6990a.E().a("TaskCollectSignals", "parseSignalsJSON", e11);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f6990a.E().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(final f5 f5Var, final e5.a aVar) {
        if (f5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.je
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6931a.b(f5Var, aVar);
                }
            });
        } else {
            this.f6990a.Z().collectSignal(f5Var, this.f8084h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(f5 f5Var, e5.a aVar) {
        this.f6990a.Z().collectSignal(f5Var, this.f8084h, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "No signals collected: " + str, th);
        }
        b bVar = this.f8085i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f8081k) {
            f8080j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f8082l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            com.applovin.impl.sdk.p.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            lVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }
}
