package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f6620g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f6622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f6623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f2.b f6624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f6625d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f6626e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6619f = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f6621h = new Object();

    /* JADX INFO: loaded from: classes.dex */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.applovin.impl.g2$a$a, reason: collision with other inner class name */
        class C0108a implements Thread.UncaughtExceptionHandler {
            C0108a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                g2.this.f6622a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g2.this.f6622a.Q().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) g2.this.f6622a.a(z4.S)).intValue());
            thread.setUncaughtExceptionHandler(new C0108a());
            return thread;
        }
    }

    public g2(com.applovin.impl.sdk.l lVar, f2.b bVar) {
        this.f6622a = lVar;
        this.f6623b = lVar.Q();
        this.f6624c = bVar;
        a();
    }

    private void c(f2 f2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (f2Var.a() == f2.b.AD || f2Var.a() == f2.b.MEDIATED_AD || f2Var.a() == f2.b.USER_SESSION || !q7.a(((Integer) this.f6622a.a(z4.B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(f2Var, map).openConnection();
                try {
                    int i10 = f6619f;
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", f2Var.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6623b.a("HealthEventsReporter", f2Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.f6625d.put(f2Var, Long.valueOf(System.currentTimeMillis()));
                    q7.a(httpURLConnection, this.f6622a);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6623b.d("HealthEventsReporter", "Failed to report " + f2Var.b() + " with extra parameters " + map, th);
                        }
                        q7.a(httpURLConnection, this.f6622a);
                    } catch (Throwable th3) {
                        q7.a(httpURLConnection, this.f6622a);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                httpURLConnection = null;
                th = th4;
            }
        }
    }

    public void d(f2 f2Var, Map map) {
        a(f2Var, map, 0L);
    }

    private void a() {
        if (f6620g != null) {
            return;
        }
        synchronized (f6621h) {
            if (f6620g != null) {
                return;
            }
            f6620g = Executors.newFixedThreadPool(1, new a());
        }
    }

    private void d(final f2 f2Var, List list) {
        final String str = (String) this.f6622a.a(z4.C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = f2Var.a(this.f6622a);
        if (q7.a(dA)) {
            if (((Boolean) this.f6622a.a(z4.I)).booleanValue()) {
                a(str, f2Var, a(f2Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject jSONObjectA = a(f2Var, dA, Collections.singletonList((Map) it.next()));
                f6620g.execute(new Runnable() { // from class: com.applovin.impl.la
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7073a.a(str, f2Var, jSONObjectA);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, f2 f2Var, JSONObject jSONObject) {
        String str2 = GEmOVMyH.xyvDsgRPc;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes(Constants.ENCODING);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i10 = f6619f;
                httpURLConnection2.setConnectTimeout(i10);
                httpURLConnection2.setReadTimeout(i10);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", f2Var.b());
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6623b.a(str2, f2Var.b() + " reported with code " + responseCode);
                }
                this.f6625d.put(f2Var, Long.valueOf(System.currentTimeMillis()));
                q7.a(httpURLConnection2, this.f6622a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6623b.d(str2, "Failed to report " + f2Var.b(), th);
                    }
                } finally {
                    q7.a(httpURLConnection, this.f6622a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void a(f2 f2Var, String str) {
        a(f2Var, str, new HashMap());
    }

    public void a(f2 f2Var, String str, Map map) {
        map.put(ShareConstants.FEED_SOURCE_PARAM, str);
        d(f2Var, map);
    }

    public void a(f2 f2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f6626e.add(str2)) {
            map.put(ShareConstants.FEED_SOURCE_PARAM, str);
            a(f2Var, str, map);
        }
    }

    public void a(f2 f2Var, Map map, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(f2Var, arrayList, j10);
    }

    public void a(final f2 f2Var, final List list, long j10) {
        if (a(f2Var, j10)) {
            return;
        }
        try {
            if (q7.i()) {
                f6620g.execute(new Runnable() { // from class: com.applovin.impl.ka
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7006a.b(f2Var, list);
                    }
                });
            } else {
                b(f2Var, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6623b.d("HealthEventsReporter", "Failed to report " + f2Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(f2 f2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6623b.a("HealthEventsReporter", "Reporting " + f2Var.b() + " with extra parameters collection " + list);
        }
        if (this.f6624c != f2Var.a()) {
            m1.a("Health event " + f2Var.b() + " category: " + f2Var.a() + " does not match the reporter category: " + this.f6624c, new Object[0]);
        }
        c(f2Var, list);
        d(f2Var, list);
    }

    private Map c(f2 f2Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (f2Var == f2.Y0) {
            map2.remove("details");
        }
        return map2;
    }

    private Map b(f2 f2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", f2Var.b());
        if (f2Var == f2.U0 || f2Var == f2.T0 || f2Var == f2.f6499k1 || f2Var == f2.f6493i1) {
            if (((Boolean) this.f6622a.a(z4.f9354t4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(o8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", o8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", o8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f6622a.B().K(), map2);
        }
        Map mapN = this.f6622a.B().N();
        map2.put("platform", String.valueOf(mapN.get("platform")));
        map2.put("country_code", String.valueOf(mapN.get("country_code")));
        map2.put("cc", this.f6622a.w().getCountryCode());
        map2.put("applovin_random_token", this.f6622a.j0());
        map2.put("compass_random_token", this.f6622a.v());
        map2.put(UomBEukHFwrS.LavnSHBOMaL, Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), map2);
        map2.put("md", (String) this.f6622a.a(z4.f9349t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(f2Var, map));
        }
        return map2;
    }

    private URL a(f2 f2Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb2.append("?");
        Iterator it = b(f2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), Constants.ENCODING);
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), Constants.ENCODING);
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return new URL(sb2.toString());
    }

    private JSONObject a(f2 f2Var, double d10, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (f2Var == f2.U0 || f2Var == f2.T0 || f2Var == f2.f6499k1 || f2Var == f2.f6493i1) {
            if (((Boolean) this.f6622a.a(z4.f9354t4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(o8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", o8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", o8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f6622a.B().K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapN = this.f6622a.B().N();
        JsonUtils.putObject(jSONObject2, "platform", mapN.get("platform"));
        JsonUtils.putObject(jSONObject2, "os", mapN.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapN.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapN.get("brand"));
        JsonUtils.putObject(jSONObject2, DeviceRequestsHelper.DEVICE_INFO_MODEL, mapN.get(DeviceRequestsHelper.DEVICE_INFO_MODEL));
        JsonUtils.putObject(jSONObject2, "brand_name", mapN.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", mapN.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", mapN.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapN.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f6622a.w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f6622a.j0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.f6622a.v());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.f6622a.s()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map mapG = this.f6622a.B().G();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapG.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f6622a.a(z4.R3));
        JsonUtils.putObject(jSONObject2, "app_version", mapG.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapG.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(mapG.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapG.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.f6622a.a(z4.f9349t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f6622a.X());
        SessionTracker sessionTrackerO0 = this.f6622a.o0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerO0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerO0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, SDKAnalyticsEvents.PARAMETER_SESSION_ID, sessionTrackerO0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.l.o()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", f2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d10);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void b(Map map) {
        PackageInfo packageInfoA = q7.a(com.applovin.impl.sdk.l.p(), 0);
        map.put("package_name", com.applovin.impl.sdk.l.p().getPackageName());
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfoA != null ? packageInfoA.versionCode : 0));
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f6622a.J().a();
        Long lC = this.f6622a.J().c();
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
            map.put("fs_ad_memory_usage", lC != null ? lC.toString() : "Error");
        } else {
            if (objA instanceof a3) {
                a3 a3Var = (a3) objA;
                map.put("fs_ad_network", a3Var.getNetworkName());
                map.put("fs_ad_creative_id", a3Var.getCreativeId());
                map.put("fs_ad_memory_usage", lC != null ? lC.toString() : "Error");
                return;
            }
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
            map.put("fs_ad_memory_usage", "None");
        }
    }

    private boolean a(f2 f2Var, long j10) {
        Long l10 = (Long) this.f6625d.get(f2Var);
        return System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1L) < j10;
    }
}
