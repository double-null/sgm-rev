package e4;

import android.net.Uri;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import id.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import ud.o0;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements e4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14409c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4.b f14410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zc.j f14411b;

    /* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {73, 75, 78}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14412h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f14414j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p<JSONObject, zc.f<? super g0>, Object> f14415k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<String, zc.f<? super g0>, Object> f14416l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, p<? super JSONObject, ? super zc.f<? super g0>, ? extends Object> pVar, p<? super String, ? super zc.f<? super g0>, ? extends Object> pVar2, zc.f<? super b> fVar) {
            super(2, fVar);
            this.f14414j = map;
            this.f14415k = pVar;
            this.f14416l = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return e.this.new b(this.f14414j, this.f14415k, this.f14416l, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f14412h;
            try {
                if (i10 == 0) {
                    s.b(obj);
                    URLConnection uRLConnectionOpenConnection = e.this.c().openConnection();
                    t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f14414j.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        h0 h0Var = new h0();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            h0Var.f21514a = line;
                            if (line == 0) {
                                break;
                            }
                            sb2.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        p<JSONObject, zc.f<? super g0>, Object> pVar = this.f14415k;
                        this.f14412h = 1;
                        if (pVar.invoke(jSONObject, this) == objF) {
                            return objF;
                        }
                    } else {
                        p<String, zc.f<? super g0>, Object> pVar2 = this.f14416l;
                        String str = "Bad response code: " + responseCode;
                        this.f14412h = 2;
                        if (pVar2.invoke(str, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
            } catch (Exception e10) {
                p<String, zc.f<? super g0>, Object> pVar3 = this.f14416l;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f14412h = 3;
                if (pVar3.invoke(message, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    public e(b4.b appInfo, @w2.b zc.j blockingDispatcher) {
        t.f(appInfo, "appInfo");
        t.f(blockingDispatcher, "blockingDispatcher");
        this.f14410a = appInfo;
        this.f14411b = blockingDispatcher;
    }

    @Override // e4.a
    public Object a(Map<String, String> map, p<? super JSONObject, ? super zc.f<? super g0>, ? extends Object> pVar, p<? super String, ? super zc.f<? super g0>, ? extends Object> pVar2, zc.f<? super g0> fVar) {
        Object objG = ud.i.g(this.f14411b, new b(map, pVar, pVar2, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath(UICvx.Znl).appendPath(this.f14410a.b()).appendPath("settings").appendQueryParameter("build_version", this.f14410a.a().a()).appendQueryParameter("display_version", this.f14410a.a().f()).build().toString());
    }
}
