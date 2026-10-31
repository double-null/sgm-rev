package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f8031f = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4 f8034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f8035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8036e = Collections.synchronizedSet(new HashSet());

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f8038b;

        public long a() {
            return this.f8037a;
        }

        public long b() {
            return this.f8038b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f8037a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f8038b = j10;
        }
    }

    private class c implements w.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f8040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f8042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f8043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f8044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f8045g;

        @Override // w.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(d4.d dVar) {
            int i10;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    int iC = dVar.c();
                    try {
                        if (iC <= 0) {
                            r0.this.a(this.f8041c, this.f8039a, iC, jE, (Throwable) null);
                            this.f8045g.a(this.f8039a, iC, null, null);
                            return;
                        }
                        if (iC < 200 || iC >= 400) {
                            this.f8045g.a(this.f8039a, iC, null, null);
                            return;
                        }
                        b bVar = this.f8044f;
                        if (bVar != null) {
                            bVar.a(jE);
                        }
                        r0.this.a(this.f8041c, this.f8039a, iC, jE);
                        byte[] bArrD = dVar.d();
                        if (q7.h(com.applovin.impl.sdk.l.p()) && (!this.f8043e || w4.b(bArrD) != w4.a.V2)) {
                            r0.this.f8032a.u().a(bArrD != null ? new String(dVar.d(), Charset.forName(Constants.ENCODING)) : "", this.f8039a, this.f8040b.b() != null ? this.f8040b.b().toString() : "");
                        }
                        if (bArrD == null) {
                            this.f8045g.a(this.f8039a, this.f8042d, iC);
                            return;
                        }
                        String str = new String(dVar.d(), Charset.forName(Constants.ENCODING));
                        b bVar2 = this.f8044f;
                        if (bVar2 != null) {
                            bVar2.b(bArrD.length);
                            if (this.f8040b.r()) {
                                r0.this.f8035d = new d(this.f8040b.f(), bArrD.length, jE);
                            }
                        }
                        if (this.f8043e) {
                            String strB = w4.b(bArrD, r0.this.f8032a);
                            if (strB == null) {
                                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f8039a));
                                if (((Boolean) r0.this.f8032a.a(z4.O5)).booleanValue()) {
                                    CollectionUtils.putStringIfValid("details", str, mapHashMap);
                                }
                                r0.this.f8032a.E().d(f2.f6508n1, mapHashMap);
                            }
                            str = strB;
                        }
                        try {
                            this.f8045g.a(this.f8039a, r0.this.a(str, this.f8042d), iC);
                        } catch (Throwable th) {
                            String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f8039a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                            com.applovin.impl.sdk.p unused = r0.this.f8033b;
                            if (com.applovin.impl.sdk.p.a()) {
                                r0.this.f8033b.a("ConnectionManager", str2, th);
                            }
                            r0.this.f8032a.E().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f8039a)));
                            this.f8045g.a(this.f8039a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                        }
                    } catch (MalformedURLException e10) {
                        e = e10;
                        i10 = iC;
                        if (this.f8042d != null) {
                            r0.this.a(this.f8041c, this.f8039a, i10, jE, e);
                            this.f8045g.a(this.f8039a, -901, e.getMessage(), null);
                        } else {
                            r0.this.a(this.f8041c, this.f8039a, i10, jE);
                            this.f8045g.a(this.f8039a, this.f8042d, -901);
                        }
                    }
                } catch (MalformedURLException e11) {
                    e = e11;
                    i10 = 0;
                }
            } catch (Throwable th2) {
                int iB = dVar.b();
                try {
                    byte[] bArrF = dVar.f();
                    String str3 = new String(bArrF);
                    if (bArrF != null) {
                        if (this.f8043e) {
                            str3 = w4.b(bArrF, r0.this.f8032a);
                        }
                        objA = r0.this.a(str3, this.f8042d);
                    }
                } catch (Throwable unused2) {
                }
                r0.this.a(this.f8041c, this.f8039a, iB, jE, th2);
                this.f8045g.a(this.f8039a, iB, th2.getMessage(), objA);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f8039a = str;
            this.f8040b = aVar;
            this.f8041c = str2;
            this.f8042d = obj;
            this.f8043e = z10;
            this.f8044f = bVar;
            this.f8045g = eVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8047a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f8049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f8050d;

        public d(String str, long j10, long j11) {
            this.f8048b = str;
            this.f8049c = j10;
            this.f8050d = j11;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f8049c;
        }

        public long c() {
            return this.f8047a;
        }

        public String d() {
            return this.f8048b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f8050d;
        }
    }

    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public r0(com.applovin.impl.sdk.l lVar) {
        this.f8032a = lVar;
        this.f8033b = lVar.Q();
        d4 d4Var = new d4(lVar);
        this.f8034c = d4Var;
        d4Var.a();
    }

    private String c(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    public void b(String str) {
        if (((Boolean) this.f8032a.a(z4.f9405z3)).booleanValue()) {
            String hostAndPath = StringUtils.getHostAndPath(str);
            if (TextUtils.isEmpty(hostAndPath)) {
                return;
            }
            this.f8036e.add(hostAndPath);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01fe A[Catch: all -> 0x0278, TryCatch #1 {all -> 0x0278, blocks: (B:36:0x00eb, B:38:0x00fb, B:42:0x0127, B:41:0x0123, B:43:0x0136, B:47:0x015d, B:49:0x016d, B:53:0x018e, B:69:0x01e4, B:72:0x01f3, B:74:0x01fe, B:55:0x0192, B:58:0x019a, B:64:0x01b2, B:66:0x01b8, B:67:0x01d2, B:50:0x017b, B:75:0x0201, B:77:0x0207, B:79:0x021f, B:80:0x022d, B:81:0x0242, B:60:0x01ab), top: B:96:0x00eb, inners: #0 }] */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        byte[] bytes;
        byte[] bArrA;
        if (aVar != null) {
            String strF = aVar.f();
            String strH = aVar.h();
            if (strF == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (strH == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!strF.toLowerCase().startsWith("http")) {
                    String str = "Requested postback submission to non HTTP endpoint " + strF + "; skipping...";
                    com.applovin.impl.sdk.p.h("ConnectionManager", str);
                    eVar.a(strF, AppLovinErrorCodes.INVALID_URL, str, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(strF);
                HashMap map = new HashMap(2);
                boolean zM = aVar.m();
                w4.a aVarA = ((Boolean) this.f8032a.a(z4.f9355t5)).booleanValue() ? w4.a.a(((Integer) this.f8032a.a(z4.f9328q5)).intValue()) : aVar.e();
                long jA = q7.a(this.f8032a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map mapI = aVar.i();
                    Boolean bool = (Boolean) this.f8032a.a(z4.f9299n3);
                    if (mapI != null && aVar.c() > 0) {
                        mapI.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (zM) {
                        String strA = q7.a(mapI, bool.booleanValue());
                        String strB = w4.b(strA, jA, aVarA, this.f8032a);
                        if (StringUtils.isValidString(strA) && TextUtils.isEmpty(strB)) {
                            CollectionUtils.putStringIfValid("query", strA, map);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, "p", strB);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, mapI, bool.booleanValue());
                    }
                }
                String str2 = httpsString;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str2), f8031f);
                    if (com.applovin.impl.sdk.p.a()) {
                        com.applovin.impl.sdk.p pVar = this.f8033b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Sending ");
                        sb2.append(strH);
                        sb2.append(" request to id=#");
                        sb2.append(str2.hashCode());
                        sb2.append(" \"");
                        sb2.append(boolEndsWith.booleanValue() ? str2 : StringUtils.getHostAndPath(str2));
                        sb2.append("\"...");
                        pVar.d("ConnectionManager", sb2.toString());
                    }
                    d4.c.a aVarA2 = new d4.c.a().a(str2).b(strH).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (zM) {
                            bytes = w4.a(aVar.b().toString(), jA, aVarA, this.f8032a);
                            if (bytes == null) {
                                CollectionUtils.putStringIfValid(SDKConstants.PARAM_A2U_BODY, aVar.b().toString(), map);
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes(Constants.ENCODING);
                        }
                        byte[] bArr = bytes;
                        if ((!zM || aVarA != w4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f8032a.a(z4.P5)).intValue()) {
                            try {
                                bArrA = q7.a(bArr);
                            } catch (Throwable th) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f8033b.a("ConnectionManager", "Failed to gzip POST body for request " + c(str2), th);
                                }
                                this.f8032a.E().a("ConnectionManager", "gzip", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str2)));
                                bArrA = null;
                            }
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && bArrA != null) {
                                aVarA2.a("Content-Encoding", "gzip");
                                aVarA2.a(bArrA);
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        } else {
                            bArrA = null;
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o()) {
                                if (bArr != null) {
                                    aVarA2.a(bArr);
                                }
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        }
                    }
                    if (!map.isEmpty()) {
                        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(str2));
                        if (((Boolean) this.f8032a.a(z4.O5)).booleanValue()) {
                            CollectionUtils.putStringIfValid("details", new JSONObject(map).toString(), mapHashMap);
                        }
                        this.f8032a.E().a(f2.f6505m1, yd.a(",", map.keySet()), mapHashMap);
                    }
                    this.f8034c.a(aVarA2.a(new c(str2, aVar, strH, aVar.d(), zM, bVar, eVar)).a(this.f8032a.s0().c()).a());
                    return;
                } catch (Throwable th2) {
                    a(strH, str2, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th2);
                    eVar.a(str2, 0, th2.getMessage(), null);
                    return;
                }
            }
            throw new IllegalArgumentException("No callback specified");
        }
        throw new IllegalArgumentException("No request specified");
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f8036e.contains(str);
    }

    public d a() {
        return this.f8035d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof q8) {
                return r8.a(str, this.f8032a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8033b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8033b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + s0.g(this.f8032a) + " to " + c(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8033b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + s0.g(this.f8032a) + " to " + c(str2), th);
        }
    }
}
