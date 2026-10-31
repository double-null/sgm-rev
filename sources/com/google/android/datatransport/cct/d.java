package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c2.n;
import c2.o;
import c2.p;
import c2.q;
import c2.r;
import c2.s;
import c2.t;
import c2.u;
import c2.v;
import c2.w;
import c2.x;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.encoders.EncodingException;
import d2.h;
import d2.i;
import e2.f;
import e2.g;
import e2.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: CctTransportBackend.java */
/* JADX INFO: loaded from: classes3.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3.a f11203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f11204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f11205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f11206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n2.a f11207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n2.a f11208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f11209g;

    /* JADX INFO: compiled from: CctTransportBackend.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f11210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n f11211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f11212c;

        a(URL url, n nVar, String str) {
            this.f11210a = url;
            this.f11211b = nVar;
            this.f11212c = str;
        }

        a a(URL url) {
            return new a(url, this.f11211b, this.f11212c);
        }
    }

    /* JADX INFO: compiled from: CctTransportBackend.java */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f11213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f11214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f11215c;

        b(int i10, URL url, long j10) {
            this.f11213a = i10;
            this.f11214b = url;
            this.f11215c = j10;
        }
    }

    d(Context context, n2.a aVar, n2.a aVar2, int i10) {
        this.f11203a = n.b();
        this.f11205c = context;
        this.f11204b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11206d = o(com.google.android.datatransport.cct.a.f11194c);
        this.f11207e = aVar2;
        this.f11208f = aVar;
        this.f11209g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        h2.a.f("CctTransportBackend", "Making request to: %s", aVar.f11210a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f11210a.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(this.f11209g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f11212c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f11203a.a(aVar.f11211b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    h2.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    h2.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    h2.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamN = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamN))).c());
                            if (inputStreamN != null) {
                                inputStreamN.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamN != null) {
                                try {
                                    inputStreamN.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (EncodingException e10) {
            e = e10;
            h2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            h2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            h2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            h2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.c();
        }
        if (w.b.b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.c() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            h2.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f11208f.getTime()).h(this.f11207e.getTime()).b(o.a().c(o.b.ANDROID_FIREBASE).b(c2.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b(DeviceRequestsHelper.DEVICE_INFO_MODEL)).f(iVar2.b("hardware")).d(iVar2.b(DeviceRequestsHelper.DEVICE_INFO_DEVICE)).l(iVar2.b(AppLovinEventTypes.USER_VIEWED_PRODUCT)).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(UserDataStore.COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                b2.b bVarB = hVarE.b();
                if (bVarB.equals(b2.b.b("proto"))) {
                    aVarL = t.l(hVarE.a());
                } else if (bVarB.equals(b2.b.b("json"))) {
                    aVarL = t.k(new String(hVarE.a(), Charset.forName(Constants.ENCODING)));
                } else {
                    h2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.b(iVar3.i("net-type"))).b(w.b.b(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f11214b;
        if (url == null) {
            return null;
        }
        h2.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f11214b);
    }

    private static InputStream n(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // e2.m
    public g a(f fVar) {
        n nVarJ = j(fVar);
        URL urlO = this.f11206d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlO = o(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) i2.b.a(5, new a(urlO, nVarJ, strD), new i2.a() { // from class: com.google.android.datatransport.cct.b
                @Override // i2.a
                public final Object apply(Object obj) {
                    return this.f11202a.e((d.a) obj);
                }
            }, new i2.c() { // from class: com.google.android.datatransport.cct.c
                @Override // i2.c
                public final Object a(Object obj, Object obj2) {
                    return d.m((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f11213a;
            if (i10 == 200) {
                return g.e(bVar.f11215c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            h2.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // e2.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f11204b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL).c("hardware", Build.HARDWARE).c(DeviceRequestsHelper.DEVICE_INFO_DEVICE, Build.DEVICE).c(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c(UserDataStore.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f11205c)).c("application_build", Integer.toString(i(this.f11205c))).d();
    }

    d(Context context, n2.a aVar, n2.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
