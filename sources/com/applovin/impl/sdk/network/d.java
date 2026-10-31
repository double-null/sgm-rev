package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import pb.vBC.NyXuoef;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f8621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f8622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f8623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w4.a f8624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f8629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8630n;

    /* JADX INFO: loaded from: classes.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f8634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f8635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f8636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f8637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w4.a f8638h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f8639i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f8640j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f8641k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f8642l;

        public b a(String str) {
            this.f8634d = str;
            return this;
        }

        public b b(String str) {
            this.f8631a = str;
            return this;
        }

        public b c(String str) {
            this.f8632b = str;
            return this;
        }

        public b d(String str) {
            this.f8633c = str;
            return this;
        }

        public b a(Map map) {
            this.f8636f = map;
            return this;
        }

        public b b(Map map) {
            this.f8635e = map;
            return this;
        }

        public b c(Map map) {
            this.f8637g = map;
            return this;
        }

        public b d(boolean z10) {
            this.f8641k = z10;
            return this;
        }

        public b a(w4.a aVar) {
            this.f8638h = aVar;
            return this;
        }

        public b b(boolean z10) {
            this.f8642l = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f8640j = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f8639i = z10;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public static b b() {
        return new b();
    }

    void a() {
        Map map = CollectionUtils.map(this.f8621e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f8621e = map;
    }

    int c() {
        return this.f8630n;
    }

    String d() {
        return this.f8620d;
    }

    String e() {
        return this.f8629m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8617a.equals(((d) obj).f8617a);
    }

    w4.a f() {
        return this.f8624h;
    }

    Map g() {
        return this.f8622f;
    }

    String h() {
        return this.f8618b;
    }

    public int hashCode() {
        return this.f8617a.hashCode();
    }

    Map i() {
        return this.f8621e;
    }

    Map j() {
        return this.f8623g;
    }

    String k() {
        return this.f8619c;
    }

    void l() {
        this.f8630n++;
    }

    public boolean m() {
        return this.f8627k;
    }

    boolean n() {
        return this.f8625i;
    }

    boolean o() {
        return this.f8626j;
    }

    boolean p() {
        return this.f8628l;
    }

    JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f8617a);
        jSONObject.put("communicatorRequestId", this.f8629m);
        jSONObject.put("httpMethod", this.f8618b);
        jSONObject.put("targetUrl", this.f8619c);
        jSONObject.put("backupUrl", this.f8620d);
        jSONObject.put("encodingType", this.f8624h);
        jSONObject.put("isEncodingEnabled", this.f8625i);
        jSONObject.put("gzipBodyEncoding", this.f8626j);
        jSONObject.put("isAllowedPreInitEvent", this.f8627k);
        jSONObject.put("attemptNumber", this.f8630n);
        if (this.f8621e != null) {
            jSONObject.put("parameters", new JSONObject(this.f8621e));
        }
        if (this.f8622f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f8622f));
        }
        if (this.f8623g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f8623g));
        }
        return jSONObject;
    }

    d(JSONObject jSONObject, l lVar) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f8617a = string;
        this.f8618b = string3;
        this.f8629m = string2;
        this.f8619c = string4;
        this.f8620d = string5;
        this.f8621e = mapSynchronizedMap;
        this.f8622f = mapSynchronizedMap2;
        this.f8623g = mapSynchronizedMap3;
        this.f8624h = w4.a.a(jSONObject.optInt("encodingType", w4.a.DEFAULT.b()));
        this.f8625i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f8626j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f8627k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f8628l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f8630n = i10;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f8617a + "', communicatorRequestId='" + this.f8629m + '\'' + NyXuoef.iNGoMQBjrqxxCwO + this.f8618b + "', targetUrl='" + this.f8619c + "', backupUrl='" + this.f8620d + "', attemptNumber=" + this.f8630n + ", isEncodingEnabled=" + this.f8625i + ", isGzipBodyEncoding=" + this.f8626j + ", isAllowedPreInitEvent=" + this.f8627k + ", shouldFireInWebView=" + this.f8628l + '}';
    }

    private d(b bVar) {
        this.f8617a = UUID.randomUUID().toString();
        this.f8618b = bVar.f8632b;
        this.f8619c = bVar.f8633c;
        this.f8620d = bVar.f8634d;
        this.f8621e = bVar.f8635e;
        this.f8622f = bVar.f8636f;
        this.f8623g = bVar.f8637g;
        this.f8624h = bVar.f8638h;
        this.f8625i = bVar.f8639i;
        this.f8626j = bVar.f8640j;
        this.f8627k = bVar.f8641k;
        this.f8628l = bVar.f8642l;
        this.f8629m = bVar.f8631a;
        this.f8630n = 0;
    }
}
