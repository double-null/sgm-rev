package g3;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import z2.f;

/* JADX INFO: compiled from: HttpGetRequest.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f15315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f15316c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f15314a = str;
        this.f15315b = map;
    }

    private String a(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        sb2.append(next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? URLEncoder.encode(next.getValue(), Constants.ENCODING) : "");
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            sb2.append("&");
            sb2.append(next2.getKey());
            sb2.append("=");
            sb2.append(next2.getValue() != null ? URLEncoder.encode(next2.getValue(), Constants.ENCODING) : "");
        }
        return sb2.toString();
    }

    private String b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    private String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Constants.ENCODING));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    public c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.d();
        InputStream inputStream = null;
        String strE = null;
        inputStream = null;
        try {
            String strB = b(this.f15314a, this.f15315b);
            f.f().i("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f15316c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, strE);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f15316c.put(str, str2);
        return this;
    }
}
