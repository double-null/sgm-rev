package cc;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: NetworkUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static final void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
            g0 g0Var = g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public static final boolean b(URL url) {
        t.f(url, "<this>");
        return t.a("http", url.getProtocol()) || t.a("https", url.getProtocol());
    }

    public static final byte[] c(URLConnection uRLConnection) throws IOException {
        t.f(uRLConnection, "<this>");
        InputStream it = uRLConnection.getInputStream();
        try {
            t.e(it, "it");
            byte[] bArrC = fd.a.c(it);
            fd.b.a(it, null);
            return bArrC;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(it, th);
                throw th2;
            }
        }
    }
}
