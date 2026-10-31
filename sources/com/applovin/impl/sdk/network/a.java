package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import d5.LXP.wcAlQCOdREZdI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f8569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f8570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f8571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f8576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f8577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f8578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f8579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f8581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w4.a f8582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f8583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f8584r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes.dex */
    public static class C0120a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f8585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f8586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f8587c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map f8589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        JSONObject f8590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f8591g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f8593i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f8594j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f8595k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f8597m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f8598n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f8599o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f8600p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        w4.a f8601q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f8592h = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f8596l = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Map f8588d = new HashMap();

        public C0120a(l lVar) {
            this.f8593i = ((Integer) lVar.a(z4.Y2)).intValue();
            this.f8594j = ((Integer) lVar.a(z4.X2)).intValue();
            this.f8597m = ((Boolean) lVar.a(z4.f9362u3)).booleanValue();
            this.f8598n = ((Boolean) lVar.a(z4.f9319p5)).booleanValue();
            this.f8601q = w4.a.a(((Integer) lVar.a(z4.f9328q5)).intValue());
            this.f8600p = ((Boolean) lVar.a(z4.Q5)).booleanValue();
        }

        public C0120a a(Map map) {
            this.f8589e = map;
            return this;
        }

        public C0120a b(String str) {
            this.f8586b = str;
            return this;
        }

        public C0120a c(String str) {
            this.f8585a = str;
            return this;
        }

        public C0120a d(boolean z10) {
            this.f8596l = z10;
            return this;
        }

        public C0120a e(boolean z10) {
            this.f8597m = z10;
            return this;
        }

        public C0120a f(boolean z10) {
            this.f8599o = z10;
            return this;
        }

        public C0120a a(JSONObject jSONObject) {
            this.f8590f = jSONObject;
            return this;
        }

        public C0120a b(Map map) {
            this.f8588d = map;
            return this;
        }

        public C0120a c(int i10) {
            this.f8593i = i10;
            return this;
        }

        public C0120a a(String str) {
            this.f8587c = str;
            return this;
        }

        public C0120a b(int i10) {
            this.f8594j = i10;
            return this;
        }

        public C0120a c(boolean z10) {
            this.f8595k = z10;
            return this;
        }

        public C0120a a(Object obj) {
            this.f8591g = obj;
            return this;
        }

        public C0120a b(boolean z10) {
            this.f8600p = z10;
            return this;
        }

        public C0120a a(int i10) {
            this.f8592h = i10;
            return this;
        }

        public C0120a a(boolean z10) {
            this.f8598n = z10;
            return this;
        }

        public C0120a a(w4.a aVar) {
            this.f8601q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    protected a(C0120a c0120a) {
        this.f8567a = c0120a.f8586b;
        this.f8568b = c0120a.f8585a;
        this.f8569c = c0120a.f8588d;
        this.f8570d = c0120a.f8589e;
        this.f8571e = c0120a.f8590f;
        this.f8572f = c0120a.f8587c;
        this.f8573g = c0120a.f8591g;
        int i10 = c0120a.f8592h;
        this.f8574h = i10;
        this.f8575i = i10;
        this.f8576j = c0120a.f8593i;
        this.f8577k = c0120a.f8594j;
        this.f8578l = c0120a.f8595k;
        this.f8579m = c0120a.f8596l;
        this.f8580n = c0120a.f8597m;
        this.f8581o = c0120a.f8598n;
        this.f8582p = c0120a.f8601q;
        this.f8583q = c0120a.f8599o;
        this.f8584r = c0120a.f8600p;
    }

    public String a() {
        return this.f8572f;
    }

    public void b(String str) {
        this.f8567a = str;
    }

    public void c(String str) {
        this.f8568b = str;
    }

    public Object d() {
        return this.f8573g;
    }

    public w4.a e() {
        return this.f8582p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f8567a;
        if (str == null ? aVar.f8567a != null : !str.equals(aVar.f8567a)) {
            return false;
        }
        Map map = this.f8569c;
        if (map == null ? aVar.f8569c != null : !map.equals(aVar.f8569c)) {
            return false;
        }
        Map map2 = this.f8570d;
        if (map2 == null ? aVar.f8570d != null : !map2.equals(aVar.f8570d)) {
            return false;
        }
        String str2 = this.f8572f;
        if (str2 == null ? aVar.f8572f != null : !str2.equals(aVar.f8572f)) {
            return false;
        }
        String str3 = this.f8568b;
        if (str3 == null ? aVar.f8568b != null : !str3.equals(aVar.f8568b)) {
            return false;
        }
        JSONObject jSONObject = this.f8571e;
        if (jSONObject == null ? aVar.f8571e != null : !jSONObject.equals(aVar.f8571e)) {
            return false;
        }
        Object obj2 = this.f8573g;
        if (obj2 == null ? aVar.f8573g == null : obj2.equals(aVar.f8573g)) {
            return this.f8574h == aVar.f8574h && this.f8575i == aVar.f8575i && this.f8576j == aVar.f8576j && this.f8577k == aVar.f8577k && this.f8578l == aVar.f8578l && this.f8579m == aVar.f8579m && this.f8580n == aVar.f8580n && this.f8581o == aVar.f8581o && this.f8582p == aVar.f8582p && this.f8583q == aVar.f8583q && this.f8584r == aVar.f8584r;
        }
        return false;
    }

    public String f() {
        return this.f8567a;
    }

    public Map g() {
        return this.f8570d;
    }

    public String h() {
        return this.f8568b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f8567a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8572f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8568b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f8573g;
        int iHashCode5 = ((((((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f8574h) * 31) + this.f8575i) * 31) + this.f8576j) * 31) + this.f8577k) * 31) + (this.f8578l ? 1 : 0)) * 31) + (this.f8579m ? 1 : 0)) * 31) + (this.f8580n ? 1 : 0)) * 31) + (this.f8581o ? 1 : 0)) * 31) + this.f8582p.b()) * 31) + (this.f8583q ? 1 : 0)) * 31) + (this.f8584r ? 1 : 0);
        Map map = this.f8569c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f8570d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f8571e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iHashCode5 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.f8569c;
    }

    public int j() {
        return this.f8575i;
    }

    public int k() {
        return this.f8577k;
    }

    public int l() {
        return this.f8576j;
    }

    public boolean m() {
        return this.f8581o;
    }

    public boolean n() {
        return this.f8578l;
    }

    public boolean o() {
        return this.f8584r;
    }

    public boolean p() {
        return this.f8579m;
    }

    public boolean q() {
        return this.f8580n;
    }

    public boolean r() {
        return this.f8583q;
    }

    public void a(String str) {
        this.f8572f = str;
    }

    public JSONObject b() {
        return this.f8571e;
    }

    public int c() {
        return this.f8574h - this.f8575i;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f8567a + ", backupEndpoint=" + this.f8572f + ", httpMethod=" + this.f8568b + ", httpHeaders=" + this.f8570d + ", body=" + this.f8571e + ", emptyResponse=" + this.f8573g + ", initialRetryAttempts=" + this.f8574h + ", retryAttemptsLeft=" + this.f8575i + ", timeoutMillis=" + this.f8576j + ", retryDelayMillis=" + this.f8577k + wcAlQCOdREZdI.lsRuyynP + this.f8578l + ", retryOnAllErrors=" + this.f8579m + ", retryOnNoConnection=" + this.f8580n + ", encodingEnabled=" + this.f8581o + ", encodingType=" + this.f8582p + ", trackConnectionSpeed=" + this.f8583q + ", gzipBodyEncoding=" + this.f8584r + '}';
    }

    public void a(int i10) {
        this.f8575i = i10;
    }

    public static C0120a a(l lVar) {
        return new C0120a(lVar);
    }
}
