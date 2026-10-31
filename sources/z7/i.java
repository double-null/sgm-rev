package z7;

import android.net.Uri;
import com.google.common.base.q;
import com.google.common.collect.p;
import com.google.common.collect.v;
import com.google.common.collect.w0;
import io.bidmachine.media3.datasource.DataSourceException;
import io.bidmachine.media3.datasource.HttpDataSource$HttpDataSourceException;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public class i extends z7.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f29047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f29049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f29050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q<String> f29051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f29052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f29053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HttpURLConnection f29054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InputStream f29055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f29056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f29057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f29058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f29059t;

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class b implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f29061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q<String> f29062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f29063d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f29066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29067h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f29068i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f29060a = new l();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f29064e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f29065f = 8000;

        @Override // z7.d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a() {
            i iVar = new i(this.f29063d, this.f29064e, this.f29065f, this.f29066g, this.f29067h, this.f29060a, this.f29062c, this.f29068i);
            o oVar = this.f29061b;
            if (oVar != null) {
                iVar.a(oVar);
            }
            return iVar;
        }

        public b c(String str) {
            this.f29063d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    static class c extends p<String, List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f29069a;

        public c(Map<String, List<String>> map) {
            this.f29069a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean s(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean t(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.q
        public Map<String, List<String>> c() {
            return this.f29069a;
        }

        @Override // com.google.common.collect.p, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.p, java.util.Map
        public boolean containsValue(Object obj) {
            return super.e(obj);
        }

        @Override // com.google.common.collect.p, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return w0.b(super.entrySet(), new q() { // from class: z7.k
                @Override // com.google.common.base.q
                public final boolean apply(Object obj) {
                    return i.c.s((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.p, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.g(obj);
        }

        @Override // com.google.common.collect.p, java.util.Map
        public int hashCode() {
            return super.k();
        }

        @Override // com.google.common.collect.p, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.p, java.util.Map
        public Set<String> keySet() {
            return w0.b(super.keySet(), new q() { // from class: z7.j
                @Override // com.google.common.base.q
                public final boolean apply(Object obj) {
                    return i.c.t((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.p, java.util.Map
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.p, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private void s() {
        HttpURLConnection httpURLConnection = this.f29054o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                r.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL t(URL url, String str, g gVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", gVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, gVar, 2001, 1);
            }
            if (this.f29044e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f29045f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", gVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2001, 1);
        }
    }

    private static boolean u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection v(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionX = x(url);
        httpURLConnectionX.setConnectTimeout(this.f29046g);
        httpURLConnectionX.setReadTimeout(this.f29047h);
        HashMap map2 = new HashMap();
        l lVar = this.f29049j;
        if (lVar != null) {
            map2.putAll(lVar.a());
        }
        map2.putAll(this.f29050k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionX.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = m.a(j10, j11);
        if (strA != null) {
            httpURLConnectionX.setRequestProperty("Range", strA);
        }
        String str = this.f29048i;
        if (str != null) {
            httpURLConnectionX.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionX.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionX.setInstanceFollowRedirects(z11);
        httpURLConnectionX.setDoOutput(bArr != null);
        httpURLConnectionX.setRequestMethod(g.c(i10));
        if (bArr != null) {
            httpURLConnectionX.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionX.connect();
            OutputStream outputStream = httpURLConnectionX.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionX.connect();
        }
        return httpURLConnectionX;
    }

    private HttpURLConnection w(g gVar) throws IOException {
        URL url = new URL(gVar.f29009a.toString());
        int i10 = gVar.f29011c;
        byte[] bArr = gVar.f29012d;
        long j10 = gVar.f29015g;
        long j11 = gVar.f29016h;
        boolean zD = gVar.d(1);
        if (!this.f29044e && !this.f29045f && !this.f29052m) {
            return v(url, i10, bArr, j10, j11, zD, true, gVar.f29013e);
        }
        URL urlT = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i13), gVar, 2001, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i11;
            URL url2 = urlT;
            long j14 = j11;
            HttpURLConnection httpURLConnectionV = v(urlT, i11, bArr2, j12, j11, zD, false, gVar.f29013e);
            int responseCode = httpURLConnectionV.getResponseCode();
            String headerField = httpURLConnectionV.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionV.disconnect();
                urlT = t(url2, headerField, gVar);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionV;
                }
                httpURLConnectionV.disconnect();
                if (this.f29052m && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                urlT = t(url2, headerField, gVar);
            }
            i12 = i13;
            j10 = j13;
            j11 = j14;
        }
    }

    private int y(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f29058s;
        if (j10 != -1) {
            long j11 = j10 - this.f29059t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) l0.i(this.f29055p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f29059t += (long) i12;
        o(i12);
        return i12;
    }

    private void z(long j10, g gVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) l0.i(this.f29055p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), gVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException(gVar, 2008, 1);
            }
            j10 -= (long) i10;
            o(i10);
        }
    }

    @Override // z7.d
    public Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f29054o;
        return httpURLConnection == null ? v.t() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // z7.d
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f29055p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, (g) l0.i(this.f29053n), 2000, 3);
                }
            }
            this.f29055p = null;
            s();
            if (this.f29056q) {
                this.f29056q = false;
                p();
            }
            this.f29054o = null;
            this.f29053n = null;
        } catch (Throwable th) {
            this.f29055p = null;
            s();
            if (this.f29056q) {
                this.f29056q = false;
                p();
            }
            this.f29054o = null;
            this.f29053n = null;
            throw th;
        }
    }

    @Override // z7.d
    public long i(final g gVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrB;
        this.f29053n = gVar;
        long j10 = 0;
        this.f29059t = 0L;
        this.f29058s = 0L;
        q(gVar);
        try {
            HttpURLConnection httpURLConnectionW = w(gVar);
            this.f29054o = httpURLConnectionW;
            this.f29057r = httpURLConnectionW.getResponseCode();
            String responseMessage = httpURLConnectionW.getResponseMessage();
            int i10 = this.f29057r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionW.getHeaderFields();
                if (this.f29057r == 416) {
                    if (gVar.f29015g == m.c(httpURLConnectionW.getHeaderField("Content-Range"))) {
                        this.f29056q = true;
                        r(gVar);
                        long j11 = gVar.f29016h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionW.getErrorStream();
                try {
                    bArrB = errorStream != null ? t2.a.b(errorStream) : l0.f28141f;
                } catch (IOException unused) {
                    bArrB = l0.f28141f;
                }
                byte[] bArr = bArrB;
                s();
                throw new HttpDataSource$InvalidResponseCodeException(this.f29057r, responseMessage, this.f29057r == 416 ? new DataSourceException(2008) : null, headerFields, gVar, bArr);
            }
            final String contentType = httpURLConnectionW.getContentType();
            q<String> qVar = this.f29051l;
            if (qVar != null && !qVar.apply(contentType)) {
                s();
                throw new HttpDataSource$HttpDataSourceException(contentType, gVar) { // from class: io.bidmachine.media3.datasource.HttpDataSource$InvalidContentTypeException

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f18035d;

                    {
                        super("Invalid content type: " + contentType, gVar, 2003, 1);
                        this.f18035d = contentType;
                    }
                };
            }
            if (this.f29057r == 200) {
                long j12 = gVar.f29015g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zU = u(httpURLConnectionW);
            if (zU) {
                this.f29058s = gVar.f29016h;
            } else {
                long j13 = gVar.f29016h;
                if (j13 != -1) {
                    this.f29058s = j13;
                } else {
                    long jB = m.b(httpURLConnectionW.getHeaderField("Content-Length"), httpURLConnectionW.getHeaderField("Content-Range"));
                    this.f29058s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f29055p = httpURLConnectionW.getInputStream();
                if (zU) {
                    this.f29055p = new GZIPInputStream(this.f29055p);
                }
                this.f29056q = true;
                r(gVar);
                try {
                    z(j10, gVar);
                    return this.f29058s;
                } catch (IOException e10) {
                    s();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2000, 1);
                }
            } catch (IOException e11) {
                s();
                throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2000, 1);
            }
        } catch (IOException e12) {
            s();
            throw HttpDataSource$HttpDataSourceException.e(e12, gVar, 1);
        }
    }

    @Override // z7.d
    public Uri m() {
        HttpURLConnection httpURLConnection = this.f29054o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        g gVar = this.f29053n;
        if (gVar != null) {
            return gVar.f29009a;
        }
        return null;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        try {
            return y(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource$HttpDataSourceException.e(e10, (g) l0.i(this.f29053n), 2);
        }
    }

    HttpURLConnection x(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private i(String str, int i10, int i11, boolean z10, boolean z11, l lVar, q<String> qVar, boolean z12) {
        super(true);
        this.f29048i = str;
        this.f29046g = i10;
        this.f29047h = i11;
        this.f29044e = z10;
        this.f29045f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f29049j = lVar;
        this.f29051l = qVar;
        this.f29050k = new l();
        this.f29052m = z12;
    }
}
