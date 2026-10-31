package cc;

import android.os.SystemClock;
import io.bidmachine.util.network.IllegalResponseException;
import io.bidmachine.util.network.RequestInDestroyedStateException;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.e1;
import ud.n0;
import ud.t2;
import wc.g0;

/* JADX INFO: compiled from: NetworkRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g<ResponseType> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f5478w = new b(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final dc.d f5479x = new ec.b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final dc.d f5480y = new ec.a(new n0("NetworkTimeOutTaskManager").z(t2.b(null, 1, null)).z(e1.b()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cc.d f5482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f5483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f5484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f5485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f5486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f5487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f5488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f5489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n<ResponseType> f5490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c<ResponseType> f5491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f5492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sd.a f5493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f5494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f5495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f5496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f5497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private dc.d f5498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private dc.b f5499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private dc.b f5500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte[] f5501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5502v;

    /* JADX INFO: compiled from: NetworkRequest.kt */
    public static final class a<ResponseType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final cc.d f5504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, String> f5505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, String> f5506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k f5507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f5508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f5509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f5510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private l f5511i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n<ResponseType> f5512j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c<ResponseType> f5513k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private d f5514l;

        public a(String url, cc.d method) {
            t.f(url, "url");
            t.f(method, "method");
            this.f5503a = url;
            this.f5504b = method;
            this.f5505c = new HashMap();
            this.f5506d = new HashMap();
            this.f5507e = k.Manual;
        }

        public static /* synthetic */ g c(a aVar, dc.d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                dVar = g.f5479x;
            }
            return aVar.b(dVar);
        }

        public final g<ResponseType> a() {
            return new g<>(this.f5503a, this.f5504b, this.f5505c, this.f5506d, this.f5507e, this.f5508f, this.f5509g, this.f5510h, this.f5511i, this.f5512j, this.f5513k, this.f5514l);
        }

        public final g<ResponseType> b(dc.d taskManager) {
            t.f(taskManager, "taskManager");
            g<ResponseType> gVarA = a();
            gVarA.r(taskManager);
            return gVarA;
        }

        public final a<ResponseType> d(c<ResponseType> cVar) {
            this.f5513k = cVar;
            return this;
        }

        public final a<ResponseType> e(d dVar) {
            this.f5514l = dVar;
            return this;
        }

        public final a<ResponseType> f(k redirect) {
            t.f(redirect, "redirect");
            this.f5507e = redirect;
            return this;
        }

        public final a<ResponseType> g(l lVar) {
            this.f5511i = lVar;
            return this;
        }

        public final a<ResponseType> h(n<ResponseType> nVar) {
            this.f5512j = nVar;
            return this;
        }

        public final a<ResponseType> i(Long l10) {
            this.f5508f = l10;
            return this;
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    public interface c<ResponseType> {
        void a(cc.e eVar);

        void onSuccess(ResponseType responsetype);
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    public interface d {
        void a(m mVar);
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    private final class e extends dc.b {
        public e() {
        }

        @Override // dc.b
        public void d() {
            g.this.t();
        }
    }

    /* JADX INFO: compiled from: NetworkRequest.kt */
    private final class f extends dc.b {
        public f() {
        }

        @Override // dc.b
        public void d() {
            g.this.p();
        }
    }

    /* JADX INFO: renamed from: cc.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NetworkRequest.kt */
    static final class C0098g extends u implements id.a<g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g<ResponseType> f5517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f5518e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0098g(g<ResponseType> gVar, long j10) {
            super(0);
            this.f5517d = gVar;
            this.f5518e = j10;
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() {
            invoke2();
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f5517d.h() == null) {
                g<ResponseType> gVar = this.f5517d;
                sd.a.C0418a c0418a = sd.a.f25407b;
                ((g) gVar).f5493m = sd.a.e(sd.c.t(SystemClock.elapsedRealtime() - this.f5518e, sd.d.MILLISECONDS));
            }
        }
    }

    public g(String url, cc.d method, Map<String, String> headers, Map<String, String> queryParameters, k redirect, Long l10, Integer num, Integer num2, l lVar, n<ResponseType> nVar, c<ResponseType> cVar, d dVar) {
        t.f(url, "url");
        t.f(method, "method");
        t.f(headers, "headers");
        t.f(queryParameters, "queryParameters");
        t.f(redirect, "redirect");
        this.f5481a = url;
        this.f5482b = method;
        this.f5483c = headers;
        this.f5484d = queryParameters;
        this.f5485e = redirect;
        this.f5486f = l10;
        this.f5487g = num;
        this.f5488h = num2;
        this.f5489i = lVar;
        this.f5490j = nVar;
        this.f5491k = cVar;
        this.f5492l = dVar;
        this.f5494n = new AtomicBoolean(false);
        this.f5495o = new AtomicBoolean(false);
        this.f5496p = new AtomicBoolean(false);
        this.f5497q = new AtomicBoolean(false);
    }

    private final void k(boolean z10, cc.e eVar) {
        c<ResponseType> cVarI;
        if (this.f5495o.compareAndSet(false, true) || z10) {
            if ((!j() || z10) && (cVarI = i()) != null) {
                cVarI.a(eVar);
            }
        }
    }

    private final void l(boolean z10, Throwable th) {
        k(z10, new cc.e(th));
    }

    static /* synthetic */ void m(g gVar, boolean z10, Throwable th, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        gVar.l(z10, th);
    }

    private final void n(ResponseType responsetype) {
        c<ResponseType> cVarI;
        if (!this.f5495o.compareAndSet(false, true) || j() || (cVarI = i()) == null) {
            return;
        }
        cVarI.onSuccess(responsetype);
    }

    private final HttpURLConnection o(URL url) throws Throwable {
        boolean z10 = true;
        int i10 = this.f5502v + 1;
        this.f5502v = i10;
        if (i10 > 20) {
            throw new IllegalStateException("The maximum number of connections for one request has been reached");
        }
        if (j()) {
            throw new RequestInDestroyedStateException();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection2.setInstanceFollowRedirects(this.f5485e == k.Native);
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setUseCaches(false);
            httpURLConnection2.setAllowUserInteraction(false);
            try {
                l lVar = this.f5489i;
                if (lVar != null) {
                    lVar.a(httpURLConnection2);
                }
                httpURLConnection2.setRequestMethod(this.f5482b.c());
                for (Map.Entry<String, String> entry : this.f5483c.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                }
                Integer num = this.f5487g;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.f5487g.intValue());
                }
                Integer num2 = this.f5488h;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.f5488h.intValue());
                }
                if (this.f5497q.compareAndSet(false, true)) {
                    l lVar2 = this.f5489i;
                    this.f5501u = lVar2 != null ? lVar2.getBody() : null;
                }
                byte[] bArr = this.f5501u;
                if (bArr != null) {
                    httpURLConnection2.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    t.e(outputStream, "httpURLConnection.outputStream");
                    BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                    try {
                        bufferedOutputStream.write(bArr);
                        g0 g0Var = g0.f27756a;
                        fd.b.a(bufferedOutputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fd.b.a(bufferedOutputStream, th);
                            throw th2;
                        }
                    }
                }
                if (j()) {
                    throw new RequestInDestroyedStateException();
                }
                if (this.f5485e == k.Manual) {
                    int responseCode = httpURLConnection2.getResponseCode();
                    switch (responseCode) {
                        case MRAID_ERROR_VALUE:
                        case INVALID_IFA_STATUS_VALUE:
                        case 303:
                        case MRAID_BRIDGE_ERROR_VALUE:
                        case 307:
                        case 308:
                            String headerField = httpURLConnection2.getHeaderField("Location");
                            i.a(httpURLConnection2);
                            if (headerField != null && headerField.length() != 0) {
                                z10 = false;
                            }
                            if (z10) {
                                throw new IllegalArgumentException("Location header url could not be null or empty when server responds with " + responseCode + " code");
                            }
                            URL url2 = new URL(url, headerField);
                            if (i.b(url2)) {
                                return o(url2);
                            }
                            throw new IllegalArgumentException("Location header url is not http or https, but has " + url2.getProtocol() + " protocol");
                        case AD_EXPIRED_VALUE:
                        case 306:
                        default:
                            break;
                    }
                }
                return httpURLConnection2;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                i.a(httpURLConnection);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (j()) {
            return;
        }
        g();
        dc.d dVar = this.f5498r;
        if (dVar == null) {
            dVar = f5479x;
        }
        dVar.c(new Runnable() { // from class: cc.f
            @Override // java.lang.Runnable
            public final void run() {
                g.q(this.f5477a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(g this$0) {
        t.f(this$0, "this$0");
        this$0.k(true, new cc.e(new TimeoutException("NetworkRequest timeout reached")));
    }

    public static /* synthetic */ void s(g gVar, dc.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = f5479x;
        }
        gVar.r(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        HttpURLConnection httpURLConnectionO;
        C0098g c0098g = new C0098g(this, SystemClock.elapsedRealtime());
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionO = o(new URL(h.a(this.f5481a, this.f5484d)));
            try {
                if (!j()) {
                    int responseCode = httpURLConnectionO.getResponseCode();
                    if (!j()) {
                        if (responseCode == 200) {
                            n<ResponseType> nVar = this.f5490j;
                            ResponseType responsetypeA = nVar != null ? nVar.a(httpURLConnectionO) : null;
                            c0098g.invoke();
                            n(responsetypeA);
                        } else if (responseCode != 204) {
                            c0098g.invoke();
                            m(this, false, new IllegalResponseException(responseCode), 1, null);
                        } else {
                            c0098g.invoke();
                            n(null);
                        }
                        d dVar = this.f5492l;
                        if (dVar != null) {
                            dVar.a(new m(Integer.valueOf(responseCode), httpURLConnectionO.getHeaderFields()));
                        }
                        return;
                    }
                }
                c0098g.invoke();
                i.a(httpURLConnectionO);
            } catch (RequestInDestroyedStateException unused) {
                httpURLConnection = httpURLConnectionO;
                c0098g.invoke();
                i.a(httpURLConnection);
            } catch (Throwable th) {
                th = th;
                try {
                    m(this, false, th, 1, null);
                } finally {
                    c0098g.invoke();
                    i.a(httpURLConnectionO);
                }
            }
        } catch (RequestInDestroyedStateException unused2) {
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionO = null;
        }
    }

    private final void u() {
        v();
        Long l10 = this.f5486f;
        if (l10 == null || l10.longValue() <= 0) {
            return;
        }
        try {
            f fVar = new f();
            f5480y.b(fVar, this.f5486f.longValue());
            this.f5500t = fVar;
            g0 g0Var = g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    private final void v() {
        dc.b bVar = this.f5500t;
        if (bVar != null) {
            f5480y.a(bVar);
        }
        this.f5500t = null;
    }

    public final void g() {
        dc.d dVar;
        this.f5496p.set(true);
        v();
        dc.b bVar = this.f5499s;
        if (bVar != null && (dVar = this.f5498r) != null) {
            dVar.a(bVar);
        }
        this.f5498r = null;
        this.f5499s = null;
        this.f5501u = null;
    }

    public final sd.a h() {
        return this.f5493m;
    }

    public final c<ResponseType> i() {
        return this.f5491k;
    }

    public final boolean j() {
        return this.f5496p.get();
    }

    public final void r(dc.d taskManager) {
        t.f(taskManager, "taskManager");
        if (j()) {
            l(true, new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"));
            return;
        }
        if (this.f5494n.compareAndSet(false, true)) {
            u();
            try {
                e eVar = new e();
                taskManager.execute(eVar);
                this.f5498r = taskManager;
                this.f5499s = eVar;
            } catch (Throwable th) {
                m(this, false, th, 1, null);
            }
        }
    }
}
