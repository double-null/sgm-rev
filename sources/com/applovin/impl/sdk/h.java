package com.applovin.impl.sdk;

import com.applovin.impl.a3;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import sc.NfwM.XDucgbzInpQa;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8382a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8383b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8384c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8385d = new Object();

    /* JADX INFO: loaded from: classes2.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f8387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f8388c;

        public String b() {
            return JsonUtils.getString(this.f8387b, "bcode", "");
        }

        public c c() {
            return (c) this.f8388c.getLast();
        }

        public String toString() {
            return "AdInfo{states='" + this.f8388c.toString() + "', adUnitId='" + a("ad_unit_id") + "', format='" + a("ad_format") + "', adapterName='" + a("network_name") + "', adapterClass='" + a("adapter_class") + "', adapterVersion='" + a("adapter_version") + "', bCode='" + b() + "', creativeId='" + a("creative_id") + "', updated=" + this.f8386a + '}';
        }

        private b(a3 a3Var, c cVar) {
            JSONObject jSONObject = new JSONObject();
            this.f8387b = jSONObject;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f8388c = arrayDeque;
            a(cVar);
            JsonUtils.putString(jSONObject, "ad_unit_id", a3Var.getAdUnitId());
            JsonUtils.putString(jSONObject, "ad_format", a3Var.getFormat().getLabel());
            JsonUtils.putString(jSONObject, "network_name", a3Var.c());
            JsonUtils.putString(jSONObject, "adapter_class", a3Var.b());
            JsonUtils.putString(jSONObject, "adapter_version", a3Var.A());
            JsonUtils.putString(jSONObject, "bcode", a3Var.C());
            JsonUtils.putString(jSONObject, "creative_id", a3Var.getCreativeId());
            JsonUtils.putString(jSONObject, XDucgbzInpQa.Mdj, arrayDeque.toString());
        }

        public JSONObject a() {
            return this.f8387b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f8386a = System.currentTimeMillis();
            this.f8388c.add(cVar);
            JsonUtils.putString(this.f8387b, "operation", cVar.toString());
        }

        private String a(String str) {
            return JsonUtils.getString(this.f8387b, str, "");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK(zKUlck.XfdfdRnQwpKhL),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8397a;

        c(String str) {
            this.f8397a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f8397a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public h() {
        a();
    }

    private Set b(c cVar) {
        HashSet hashSet;
        synchronized (this.f8383b) {
            hashSet = new HashSet(a(cVar));
        }
        return hashSet;
    }

    public void a(a3 a3Var, c cVar) {
        synchronized (this.f8385d) {
            String strC = a3Var.C();
            b bVar = (b) this.f8384c.get(strC);
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(a3Var, cVar);
                this.f8384c.put(strC, bVar);
            } else if (bVar.c() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.f8384c.remove(strC);
            }
            a(bVar, cVar);
        }
    }

    public void a() {
        synchronized (this.f8383b) {
            for (c cVar : c.values()) {
                this.f8382a.put(cVar, new HashSet());
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f8383b) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a((c) it.next()).add(dVar);
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f8383b) {
            Iterator it = this.f8382a.keySet().iterator();
            while (it.hasNext()) {
                a((c) it.next()).remove(dVar);
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f8383b) {
            Set set = (Set) this.f8382a.get(cVar);
            if (com.applovin.impl.m1.a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    private void a(b bVar, c cVar) {
        Iterator it = b(cVar).iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(bVar);
        }
    }
}
