package cc;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.jvm.internal.t;
import wb.d0;

/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5519a = new h();

    private h() {
    }

    public static final String a(String url, Map<String, String> queryParameters) {
        t.f(url, "url");
        t.f(queryParameters, "queryParameters");
        if (queryParameters.isEmpty()) {
            return url;
        }
        Uri.Builder builderBuildUpon = Uri.parse(url).buildUpon();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        t.e(string, "parse(url).buildUpon().a…     }.build().toString()");
        return string;
    }

    public static final void b(HttpURLConnection httpURLConnection) {
        i.a(httpURLConnection);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1 A[Catch: Exception -> 0x00d3, all -> 0x00e8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d3, blocks: (B:26:0x0074, B:31:0x0090, B:38:0x00a5, B:41:0x00ab, B:42:0x00ae, B:47:0x00c1), top: B:69:0x0074, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e8, blocks: (B:4:0x0022, B:7:0x002b, B:59:0x00e1, B:8:0x0031, B:10:0x003a, B:16:0x0046, B:19:0x0051, B:21:0x005b, B:24:0x0069, B:26:0x0074, B:31:0x0090, B:38:0x00a5, B:41:0x00ab, B:42:0x00ae, B:47:0x00c1, B:50:0x00c8, B:56:0x00da, B:53:0x00d3), top: B:66:0x0022, inners: #2 }] */
    public static final String c(String urlString, int i10) {
        t.f(urlString, "urlString");
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(urlString);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection2.setInstanceFollowRedirects(false);
            httpURLConnection2.setConnectTimeout(i10);
            httpURLConnection2.setReadTimeout(i10);
            try {
                switch (httpURLConnection2.getResponseCode()) {
                    case MRAID_ERROR_VALUE:
                    case INVALID_IFA_STATUS_VALUE:
                    case 303:
                    case MRAID_BRIDGE_ERROR_VALUE:
                    case 307:
                    case 308:
                        String nextUrl = httpURLConnection2.getHeaderField("Location");
                        boolean z10 = true;
                        if (nextUrl == null || nextUrl.length() == 0) {
                            String string = url.toString();
                            t.e(string, "url.toString()");
                            i.a(httpURLConnection2);
                            return string;
                        }
                        t.e(nextUrl, "nextUrl");
                        if (d0.u(nextUrl)) {
                            i.a(httpURLConnection2);
                            t.e(nextUrl, "nextUrl");
                            String strD = d(nextUrl, 0, 2, null);
                            i.a(httpURLConnection2);
                            return strD;
                        }
                        if (new URI(nextUrl).getScheme() != null) {
                            t.e(nextUrl, "nextUrl");
                            i.a(httpURLConnection2);
                            return nextUrl;
                        }
                        try {
                            String string2 = new URL(url, nextUrl).toString();
                            t.e(string2, "URL(url, nextUrl).toString()");
                            int length = string2.length() - 1;
                            int i11 = 0;
                            boolean z11 = false;
                            while (i11 <= length) {
                                boolean z12 = t.g(string2.charAt(!z11 ? i11 : length), 32) <= 0;
                                if (z11) {
                                    if (!z12) {
                                        if (string2.subSequence(i11, length + 1).toString().length() == 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            t.e(nextUrl, "nextUrl");
                                            i.a(httpURLConnection2);
                                            return nextUrl;
                                        }
                                        i.a(httpURLConnection2);
                                        String strD2 = d(string2, 0, 2, null);
                                        i.a(httpURLConnection2);
                                        return strD2;
                                    }
                                    length--;
                                } else if (z12) {
                                    i11++;
                                } else {
                                    z11 = true;
                                }
                            }
                            if (string2.subSequence(i11, length + 1).toString().length() == 0) {
                                z10 = false;
                            }
                            if (z10) {
                                t.e(nextUrl, "nextUrl");
                                i.a(httpURLConnection2);
                                return nextUrl;
                            }
                            i.a(httpURLConnection2);
                            String strD3 = d(string2, 0, 2, null);
                            i.a(httpURLConnection2);
                            return strD3;
                        } catch (Exception unused) {
                            t.e(nextUrl, "nextUrl");
                            i.a(httpURLConnection2);
                            return nextUrl;
                        }
                    case AD_EXPIRED_VALUE:
                    case 306:
                    default:
                        String string3 = url.toString();
                        t.e(string3, "url.toString()");
                        i.a(httpURLConnection2);
                        return string3;
                }
            } catch (Throwable unused2) {
                httpURLConnection = httpURLConnection2;
            }
            httpURLConnection = httpURLConnection2;
        } catch (Throwable unused3) {
        }
        i.a(httpURLConnection);
        return urlString;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 500;
        }
        return c(str, i10);
    }
}
