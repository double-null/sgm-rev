package f6;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f14624e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f14625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f14626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14628d;

    public a(Context context, String str) {
        this(new e(context, str));
    }

    private static <T> c6.c<T> b(HttpURLConnection httpURLConnection, c<T> cVar, c<String> cVar2) throws IOException {
        InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        List<String> list = httpURLConnection.getHeaderFields().get("Content-Encoding");
        boolean z10 = false;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).equalsIgnoreCase("gzip")) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            inputStream = new GZIPInputStream(inputStream);
        }
        int responseCode = httpURLConnection.getResponseCode();
        try {
            return responseCode != 200 ? c6.c.a(c6.d.SERVER_ERROR, new c6.b(responseCode, cVar2.a(inputStream))) : c6.c.b(cVar.a(inputStream));
        } catch (IOException e10) {
            return c6.c.a(c6.d.INTERNAL_ERROR, new c6.b(responseCode, e10));
        }
    }

    private static HttpURLConnection c(Uri uri) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
        if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
        throw new IllegalArgumentException("The scheme of the server url must be https." + uri);
    }

    private static void d(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private static byte[] e(Map<String, String> map) {
        if (map.isEmpty()) {
            return f14624e;
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        try {
            return builder.build().getEncodedQuery().getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final <T> c6.c<T> a(Uri uri, Map<String, String> map, Map<String, String> map2, c<T> cVar) {
        byte[] bArrE = e(map2);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                int length = bArrE.length;
                HttpURLConnection httpURLConnectionC = c(uri);
                httpURLConnectionC.setInstanceFollowRedirects(true);
                httpURLConnectionC.setRequestProperty("User-Agent", this.f14625a.b());
                httpURLConnectionC.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnectionC.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnectionC.setRequestProperty("Content-Length", String.valueOf(length));
                httpURLConnectionC.setConnectTimeout(this.f14627c);
                httpURLConnectionC.setReadTimeout(this.f14628d);
                httpURLConnectionC.setRequestMethod("POST");
                httpURLConnectionC.setDoOutput(true);
                try {
                    d(httpURLConnectionC, map);
                    httpURLConnectionC.connect();
                    OutputStream outputStream = httpURLConnectionC.getOutputStream();
                    outputStream.write(bArrE);
                    outputStream.flush();
                    c6.c<T> cVarB = b(httpURLConnectionC, cVar, this.f14626b);
                    httpURLConnectionC.disconnect();
                    return cVarB;
                } catch (IOException e10) {
                    e = e10;
                    httpURLConnection = httpURLConnectionC;
                    c6.c<T> cVarA = c6.c.a(c6.d.NETWORK_ERROR, new c6.b(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return cVarA;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public final <T> c6.c<T> f(Uri uri, Map<String, String> map, Map<String, String> map2, c<T> cVar) throws Throwable {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionC = c(builderBuildUpon.build());
                httpURLConnectionC.setInstanceFollowRedirects(true);
                httpURLConnectionC.setRequestProperty("User-Agent", this.f14625a.b());
                httpURLConnectionC.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnectionC.setConnectTimeout(this.f14627c);
                httpURLConnectionC.setReadTimeout(this.f14628d);
                httpURLConnectionC.setRequestMethod("GET");
                try {
                    d(httpURLConnectionC, map);
                    httpURLConnectionC.connect();
                    c6.c<T> cVarB = b(httpURLConnectionC, cVar, this.f14626b);
                    httpURLConnectionC.disconnect();
                    return cVarB;
                } catch (IOException e10) {
                    e = e10;
                    httpURLConnection = httpURLConnectionC;
                    c6.c<T> cVarA = c6.c.a(c6.d.NETWORK_ERROR, new c6.b(e));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return cVarA;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionC;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    private a(e eVar) {
        this.f14625a = eVar;
        this.f14626b = new d(Constants.ENCODING);
        this.f14627c = 90000;
        this.f14628d = 90000;
    }
}
