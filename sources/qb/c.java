package qb;

import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import pb.b0;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public class c<ResponseType> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final dc.d f24704k = new ec.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f24706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f24707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f24708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f24709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f24710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f24711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f24712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private dc.d f24713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private rb.b f24714j;

    public static class a<ResponseType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f24716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f24717c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f24718d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f24719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f24720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f f24721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f24722h;

        public a(String str, e eVar) {
            this.f24715a = str;
            this.f24716b = eVar;
        }

        public a<ResponseType> a(String str, String str2) {
            this.f24717c.put(str, str2);
            return this;
        }

        public c<ResponseType> b() {
            return new c<>(this.f24715a, this.f24716b, this.f24717c, this.f24718d, this.f24719e, this.f24720f, null, null, this.f24721g, this.f24722h);
        }

        public c<ResponseType> c() {
            c<ResponseType> cVarB = b();
            cVarB.i();
            return cVarB;
        }

        public a<ResponseType> d(d<ResponseType> dVar) {
            this.f24722h = dVar;
            return this;
        }

        public a<ResponseType> e(f<ResponseType> fVar) {
            this.f24721g = fVar;
            return this;
        }

        public a<ResponseType> f(String str) {
            if (!TextUtils.isEmpty(str)) {
                a("User-Agent", str);
            }
            return this;
        }
    }

    public static abstract class b<T> implements f<T>, g<byte[], T> {
        @Override // qb.c.f
        public T a(URLConnection uRLConnection) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        l.b(inputStream2, byteArrayOutputStream);
                        T tB = b(byteArrayOutputStream.toByteArray());
                        d0.i(byteArrayOutputStream);
                        d0.b(byteArrayOutputStream);
                        d0.b(inputStream2);
                        return tB;
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        th = th;
                        d0.i(byteArrayOutputStream);
                        d0.b(byteArrayOutputStream);
                        d0.b(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    inputStream = inputStream2;
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        }
    }

    /* JADX INFO: renamed from: qb.c$c, reason: collision with other inner class name */
    public interface InterfaceC0401c {
    }

    public interface d<ResponseType> {
        void a(b0 b0Var);

        void onSuccess(ResponseType responsetype);
    }

    public enum e {
        Get("GET"),
        Post("POST");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24726a;

        e(String str) {
            this.f24726a = str;
        }

        public String c() {
            return this.f24726a;
        }
    }

    public interface f<ResponseType> {
        ResponseType a(URLConnection uRLConnection);
    }

    public interface g<From, To> {
        To b(From from);
    }

    public static class h extends b<String> {
        @Override // qb.c.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public interface i {
    }

    private class k extends rb.b {
        private k() {
        }

        @Override // rb.b
        public void d() {
            c.this.g();
        }
    }

    public c(String str, e eVar, Map<String, String> map, Map<String, String> map2, Integer num, Integer num2, i iVar, InterfaceC0401c interfaceC0401c, f<ResponseType> fVar, d<ResponseType> dVar) {
        this.f24705a = str;
        this.f24706b = eVar;
        this.f24709e = num;
        this.f24710f = num2;
        this.f24711g = fVar;
        this.f24707c = map;
        this.f24708d = map2;
        this.f24712h = dVar;
    }

    private String a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    private HttpURLConnection b(String str) throws Throwable {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod(this.f24706b.c());
                for (Map.Entry entry : this.f24707c.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                Integer num = this.f24709e;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.f24709e.intValue());
                }
                Integer num2 = this.f24710f;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.f24710f.intValue());
                }
                switch (httpURLConnection2.getResponseCode()) {
                    case MRAID_ERROR_VALUE:
                    case INVALID_IFA_STATUS_VALUE:
                    case 303:
                    case MRAID_BRIDGE_ERROR_VALUE:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField) && d0.u(headerField)) {
                            cc.h.b(httpURLConnection2);
                            return b(headerField);
                        }
                        return httpURLConnection2;
                    case AD_EXPIRED_VALUE:
                    case 306:
                    default:
                        return httpURLConnection2;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                cc.h.b(httpURLConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void c() {
        this.f24713i = null;
        this.f24714j = null;
    }

    private void d(Object obj) {
        d dVar = this.f24712h;
        if (dVar != null) {
            dVar.onSuccess(obj);
        }
    }

    private void e(b0 b0Var) {
        d dVar = this.f24712h;
        if (dVar != null) {
            dVar.a(b0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        HttpURLConnection httpURLConnectionB;
        Throwable th;
        try {
            httpURLConnectionB = b(a(this.f24705a, this.f24708d));
            try {
                int responseCode = httpURLConnectionB.getResponseCode();
                if (responseCode == 200) {
                    f fVar = this.f24711g;
                    if (fVar == null) {
                        d(null);
                        cc.h.b(httpURLConnectionB);
                        return;
                    } else {
                        try {
                            d(fVar.a(httpURLConnectionB));
                        } catch (Throwable th2) {
                            e(b0.a(th2));
                        }
                    }
                } else if (responseCode == 204) {
                    d(null);
                } else {
                    e(new b0("Server response code - " + responseCode + " " + httpURLConnectionB.getResponseMessage()));
                }
                cc.h.b(httpURLConnectionB);
            } catch (Throwable th3) {
                th = th3;
                try {
                    e(b0.a(th));
                } finally {
                    cc.h.b(httpURLConnectionB);
                }
            }
        } catch (Throwable th4) {
            httpURLConnectionB = null;
            th = th4;
        }
    }

    public void h() {
        dc.d dVar = this.f24713i;
        rb.b bVar = this.f24714j;
        if (dVar != null && bVar != null) {
            dVar.a(bVar);
        }
        c();
    }

    public void i() {
        j(f24704k);
    }

    public void j(dc.d dVar) {
        h();
        this.f24713i = dVar;
        k kVar = new k();
        this.f24714j = kVar;
        try {
            dVar.execute(kVar);
        } catch (Throwable th) {
            e(b0.a(th));
        }
    }
}
