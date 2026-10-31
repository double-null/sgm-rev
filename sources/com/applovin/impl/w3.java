package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f8995d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f8996e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f8997f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f8998g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f8999h = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f9000i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f9002b = a(t3.D8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f9003c = a(t3.C8);

    public w3(com.applovin.impl.sdk.l lVar) {
        this.f9001a = lVar;
        a((String) c5.a(b5.K, (Object) null, com.applovin.impl.sdk.l.p()), v3.a.AD_UNIT_ID);
        a((String) c5.a(b5.L, (Object) null, com.applovin.impl.sdk.l.p()), v3.a.AD_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10, Long l11) {
        return l10;
    }

    private JSONObject a(z4 z4Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f9001a.a(z4Var), new JSONObject());
    }

    private Map b(u3 u3Var, v3 v3Var, u3.b bVar) {
        if (!a(u3Var, v3Var, bVar) || !b(u3Var, v3Var)) {
            return null;
        }
        String strB = v3Var.b();
        HashMap mapA = a(v3Var.a());
        Object objB = b(v3Var.a());
        HashMap map = new HashMap();
        synchronized (objB) {
            if (v3Var instanceof s3) {
                a((s3) v3Var, mapA);
            }
            HashMap map2 = (HashMap) mapA.get(strB);
            if (map2 == null) {
                map2 = new HashMap();
                mapA.put(strB, map2);
            }
            Iterator it = u3Var.b().iterator();
            while (it.hasNext()) {
                String strB2 = ((u3.a) it.next()).b();
                HashMap map3 = (HashMap) map2.get(strB2);
                if (map3 == null) {
                    map3 = new HashMap();
                    map2.put(strB2, map3);
                }
                Object objA = bVar.a(map3.get(u3Var));
                map3.put(u3Var, objA);
                map.put(strB2, objA);
            }
        }
        Boolean bool = (Boolean) this.f9001a.a(t3.F8);
        if (u3Var.a(u3.a.INSTALL) && bool.booleanValue()) {
            b(v3Var);
        }
        return map;
    }

    private b5 c(v3.a aVar) {
        if (aVar == v3.a.AD_UNIT_ID) {
            return b5.K;
        }
        if (aVar == v3.a.AD_FORMAT) {
            return b5.L;
        }
        return null;
    }

    public Map a(u3 u3Var, v3 v3Var) {
        return b(u3Var, v3Var, new u3.b() { // from class: com.applovin.impl.lg
            @Override // com.applovin.impl.u3.b
            public final Object a(Object obj) {
                return w3.a((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10) {
        return Long.valueOf(l10 != null ? 1 + l10.longValue() : 1L);
    }

    public void a(u3 u3Var, v3 v3Var, final Long l10) {
        b(u3Var, v3Var, new u3.b() { // from class: com.applovin.impl.kg
            @Override // com.applovin.impl.u3.b
            public final Object a(Object obj) {
                return w3.a(l10, (Long) obj);
            }
        });
    }

    public Map a(u3 u3Var, v3.a aVar) {
        return a(u3Var, aVar, u3.a.SESSION);
    }

    private Map a(u3 u3Var, v3.a aVar, u3.a aVar2) {
        HashMap mapA = a(aVar);
        Object objB = b(aVar);
        HashMap map = new HashMap();
        synchronized (objB) {
            for (String str : mapA.keySet()) {
                HashMap map2 = (HashMap) mapA.get(str);
                String strB = aVar2.b();
                if (map2 != null && map2.containsKey(strB)) {
                    HashMap map3 = (HashMap) map2.get(strB);
                    if (aVar == v3.a.AD) {
                        map.put(l3.a(str).b(), map3.get(u3Var));
                    } else {
                        map.put(str, map3.get(u3Var));
                    }
                }
            }
        }
        return map;
    }

    private void a(s3 s3Var, Map map) {
        MaxAdFormat maxAdFormatA = s3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.f9003c, maxAdFormatA.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (l3.a((String) it.next()).a().equals(maxAdFormatA)) {
                i10++;
            }
        }
        if (i10 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i10 >= integer.intValue()) {
            if (l3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(maxAdFormatA)) {
                it2.remove();
                i10--;
            }
        }
    }

    private Object b(v3.a aVar) {
        if (aVar == v3.a.AD_UNIT_ID) {
            return f8996e;
        }
        if (aVar == v3.a.AD_FORMAT) {
            return f8998g;
        }
        return f9000i;
    }

    private boolean b(u3 u3Var, v3 v3Var) {
        Iterator<String> itKeys = this.f9002b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(v3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.f9002b, next, new JSONArray()), u3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(v3.a aVar) {
        if (aVar == v3.a.AD_UNIT_ID) {
            return f8995d;
        }
        if (aVar == v3.a.AD_FORMAT) {
            return f8997f;
        }
        return f8999h;
    }

    private void b(v3 v3Var) {
        b5 b5VarC = c(v3Var.a());
        if (b5VarC == null) {
            return;
        }
        c5.b(b5VarC, a((Map) a(v3Var)), com.applovin.impl.sdk.l.p());
    }

    private boolean a(u3 u3Var, v3 v3Var, u3.b bVar) {
        if (u3Var == null) {
            this.f9001a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f9001a.Q().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (v3Var == null) {
            this.f9001a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f9001a.Q().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f9001a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f9001a.Q().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private HashMap a(v3 v3Var) {
        HashMap map = new HashMap();
        HashMap mapA = a(v3Var.a());
        synchronized (b(v3Var.a())) {
            for (Map.Entry entry : mapA.entrySet()) {
                String str = (String) entry.getKey();
                HashMap map2 = (HashMap) entry.getValue();
                if (!CollectionUtils.isEmpty(map2)) {
                    HashMap map3 = (HashMap) map2.get(u3.a.INSTALL.b());
                    if (!CollectionUtils.isEmpty(map3)) {
                        map.put(str, new HashMap(map3));
                    }
                }
            }
        }
        return map;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                u3 u3Var = (u3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, u3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, v3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap mapA = a(aVar);
            Object objB = b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (objB) {
                for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                    String key = entry.getKey();
                    HashMap map = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        u3 u3VarA = u3.a((String) entry2.getKey());
                        if (u3VarA != null) {
                            map.put(u3VarA, a(entry2.getValue()));
                        }
                    }
                    if (!CollectionUtils.isEmpty(map)) {
                        HashMap map2 = new HashMap();
                        map2.put(u3.a.INSTALL.b(), map);
                        mapA.put(key, map2);
                    }
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
