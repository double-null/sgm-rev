package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f5954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f5955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f5956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f5957d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f5958e = new Object();

    public a5(com.applovin.impl.sdk.l lVar) {
        this.f5954a = lVar;
        Context contextP = com.applovin.impl.sdk.l.p();
        this.f5955b = contextP;
        this.f5956c = contextP.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(z4.class.getName());
            Class.forName(t3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    private void d() {
        String strB = ((Boolean) c5.a(b5.f6139j, Boolean.FALSE, com.applovin.impl.sdk.l.p())).booleanValue() ? "" : b();
        synchronized (this.f5958e) {
            for (z4 z4Var : z4.c()) {
                try {
                    Object objA = this.f5954a.a(strB + z4Var.b(), null, z4Var.a().getClass(), this.f5956c);
                    if (objA != null) {
                        this.f5957d.put(z4Var.b(), objA);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.p.c("SettingsManager", "Unable to load \"" + z4Var.b() + "\"", th);
                    this.f5954a.E().a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    public Object a(z4 z4Var) {
        if (z4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f5958e) {
            Object obj = this.f5957d.get(z4Var.b());
            if (obj == null) {
                return z4Var.a();
            }
            return z4Var.a(obj);
        }
    }

    public List b(z4 z4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(z4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(z4 z4Var) {
        return CollectionUtils.explode((String) a(z4Var));
    }

    public void e() {
        Boolean bool = (Boolean) c5.a(b5.f6139j, Boolean.FALSE, com.applovin.impl.sdk.l.p());
        String strB = b();
        synchronized (this.f5958e) {
            SharedPreferences.Editor editorEdit = this.f5956c.edit();
            for (z4 z4Var : z4.c()) {
                Object obj = this.f5957d.get(z4Var.b());
                if (obj != null) {
                    String strB2 = z4Var.b();
                    this.f5954a.a(strB + z4Var.b(), obj, editorEdit);
                    if (bool.booleanValue()) {
                        this.f5954a.a(strB2, obj, editorEdit);
                    }
                }
            }
            if (((Boolean) this.f5954a.a(z4.J6)).booleanValue()) {
                c5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public boolean c() {
        return this.f5954a.p0().isVerboseLoggingEnabled() || ((Boolean) a(z4.f9268k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + q7.f(this.f5954a.k0()) + ".";
    }

    public void a(z4 z4Var, Object obj) {
        if (z4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f5958e) {
                this.f5957d.put(z4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f5958e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, z4.f9358u.b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            try {
                                z4 z4VarA = z4.a(next);
                                if (z4VarA != null) {
                                    Object objA = zBooleanValue ? a(z4VarA) : null;
                                    Object objA2 = a(next, jSONObject, z4VarA.a());
                                    this.f5957d.put(z4VarA.b(), objA2);
                                    if (z4VarA == z4.M5) {
                                        this.f5957d.put(z4.N5.b(), Long.valueOf(System.currentTimeMillis()));
                                    }
                                    if (zBooleanValue && !objA2.equals(objA)) {
                                        map.put(z4VarA, objA);
                                    }
                                }
                            } catch (Throwable th) {
                                com.applovin.impl.sdk.p.c("SettingsManager", "Unable to convert setting object ", th);
                                this.f5954a.E().a("SettingsManager", "loadSettingsThrowable", th);
                            }
                        } catch (JSONException e10) {
                            com.applovin.impl.sdk.p.c("SettingsManager", "Unable to parse JSON settingsValues array", e10);
                            this.f5954a.E().a("SettingsManager", "loadSettingsException", e10);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    x2 x2Var = new x2();
                    x2Var.a("========== UPDATED SETTINGS ==========");
                    for (z4 z4Var : map.keySet()) {
                        x2Var.a(z4Var.b(), a(z4Var) + " (" + map.get(z4Var) + ")");
                    }
                    x2Var.a("========== END ==========");
                    this.f5954a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f5954a.Q().a("SettingsManager", x2Var.toString());
                    }
                }
                c5.b(b5.f6139j, (Boolean) a(z4.X6), com.applovin.impl.sdk.l.p());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f5958e) {
            this.f5957d.clear();
        }
        this.f5954a.a(this.f5956c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
