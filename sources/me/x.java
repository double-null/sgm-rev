package me;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes5.dex */
public class x implements Cloneable, e.a {
    public static final b E = new b(null);
    private static final List<y> F = ne.d.w(y.HTTP_2, y.HTTP_1_1);
    private static final List<l> G = ne.d.w(l.f22486i, l.f22488k);
    private final int A;
    private final int B;
    private final long C;
    private final re.h D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f22566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f22567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<v> f22568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<v> f22569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r.c f22570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final me.b f22572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f22573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f22574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f22575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f22576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q f22577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Proxy f22578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProxySelector f22579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final me.b f22580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SocketFactory f22581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final SSLSocketFactory f22582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final X509TrustManager f22583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<l> f22584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<y> f22585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final HostnameVerifier f22586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g f22587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ze.c f22588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f22589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f22590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f22591z;

    /* JADX INFO: compiled from: OkHttpClient.kt */
    public static final class a {
        private int A;
        private int B;
        private long C;
        private re.h D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f22592a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k f22593b = new k();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<v> f22594c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<v> f22595d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.c f22596e = ne.d.g(r.f22526b);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22597f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private me.b f22598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f22599h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f22600i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n f22601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f22602k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f22603l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Proxy f22604m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ProxySelector f22605n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private me.b f22606o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private SocketFactory f22607p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private SSLSocketFactory f22608q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private X509TrustManager f22609r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<l> f22610s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<? extends y> f22611t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private HostnameVerifier f22612u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private g f22613v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ze.c f22614w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f22615x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f22616y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f22617z;

        public a() {
            me.b bVar = me.b.f22292b;
            this.f22598g = bVar;
            this.f22599h = true;
            this.f22600i = true;
            this.f22601j = n.f22512b;
            this.f22603l = q.f22523b;
            this.f22606o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.t.e(socketFactory, "getDefault()");
            this.f22607p = socketFactory;
            b bVar2 = x.E;
            this.f22610s = bVar2.a();
            this.f22611t = bVar2.b();
            this.f22612u = ze.d.f29251a;
            this.f22613v = g.f22398d;
            this.f22616y = 10000;
            this.f22617z = 10000;
            this.A = 10000;
            this.C = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        public final Proxy A() {
            return this.f22604m;
        }

        public final me.b B() {
            return this.f22606o;
        }

        public final ProxySelector C() {
            return this.f22605n;
        }

        public final int D() {
            return this.f22617z;
        }

        public final boolean E() {
            return this.f22597f;
        }

        public final re.h F() {
            return this.D;
        }

        public final SocketFactory G() {
            return this.f22607p;
        }

        public final SSLSocketFactory H() {
            return this.f22608q;
        }

        public final int I() {
            return this.A;
        }

        public final X509TrustManager J() {
            return this.f22609r;
        }

        public final a K(ProxySelector proxySelector) {
            kotlin.jvm.internal.t.f(proxySelector, "proxySelector");
            if (!kotlin.jvm.internal.t.a(proxySelector, C())) {
                S(null);
            }
            Q(proxySelector);
            return this;
        }

        public final a L(long j10, TimeUnit unit) {
            kotlin.jvm.internal.t.f(unit, "unit");
            R(ne.d.k("timeout", j10, unit));
            return this;
        }

        public final void M(c cVar) {
            this.f22602k = cVar;
        }

        public final void N(int i10) {
            this.f22616y = i10;
        }

        public final void O(boolean z10) {
            this.f22599h = z10;
        }

        public final void P(boolean z10) {
            this.f22600i = z10;
        }

        public final void Q(ProxySelector proxySelector) {
            this.f22605n = proxySelector;
        }

        public final void R(int i10) {
            this.f22617z = i10;
        }

        public final void S(re.h hVar) {
            this.D = hVar;
        }

        public final a a(v interceptor) {
            kotlin.jvm.internal.t.f(interceptor, "interceptor");
            v().add(interceptor);
            return this;
        }

        public final x b() {
            return new x(this);
        }

        public final a c(c cVar) {
            M(cVar);
            return this;
        }

        public final a d(long j10, TimeUnit unit) {
            kotlin.jvm.internal.t.f(unit, "unit");
            N(ne.d.k("timeout", j10, unit));
            return this;
        }

        public final a e(boolean z10) {
            O(z10);
            return this;
        }

        public final a f(boolean z10) {
            P(z10);
            return this;
        }

        public final me.b g() {
            return this.f22598g;
        }

        public final c h() {
            return this.f22602k;
        }

        public final int i() {
            return this.f22615x;
        }

        public final ze.c j() {
            return this.f22614w;
        }

        public final g k() {
            return this.f22613v;
        }

        public final int l() {
            return this.f22616y;
        }

        public final k m() {
            return this.f22593b;
        }

        public final List<l> n() {
            return this.f22610s;
        }

        public final n o() {
            return this.f22601j;
        }

        public final p p() {
            return this.f22592a;
        }

        public final q q() {
            return this.f22603l;
        }

        public final r.c r() {
            return this.f22596e;
        }

        public final boolean s() {
            return this.f22599h;
        }

        public final boolean t() {
            return this.f22600i;
        }

        public final HostnameVerifier u() {
            return this.f22612u;
        }

        public final List<v> v() {
            return this.f22594c;
        }

        public final long w() {
            return this.C;
        }

        public final List<v> x() {
            return this.f22595d;
        }

        public final int y() {
            return this.B;
        }

        public final List<y> z() {
            return this.f22611t;
        }
    }

    /* JADX INFO: compiled from: OkHttpClient.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final List<l> a() {
            return x.G;
        }

        public final List<y> b() {
            return x.F;
        }
    }

    public x(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorC;
        kotlin.jvm.internal.t.f(builder, "builder");
        this.f22566a = builder.p();
        this.f22567b = builder.m();
        this.f22568c = ne.d.T(builder.v());
        this.f22569d = ne.d.T(builder.x());
        this.f22570e = builder.r();
        this.f22571f = builder.E();
        this.f22572g = builder.g();
        this.f22573h = builder.s();
        this.f22574i = builder.t();
        this.f22575j = builder.o();
        this.f22576k = builder.h();
        this.f22577l = builder.q();
        this.f22578m = builder.A();
        if (builder.A() != null) {
            proxySelectorC = ye.a.f28915a;
        } else {
            proxySelectorC = builder.C();
            proxySelectorC = proxySelectorC == null ? ProxySelector.getDefault() : proxySelectorC;
            if (proxySelectorC == null) {
                proxySelectorC = ye.a.f28915a;
            }
        }
        this.f22579n = proxySelectorC;
        this.f22580o = builder.B();
        this.f22581p = builder.G();
        List<l> listN = builder.n();
        this.f22584s = listN;
        this.f22585t = builder.z();
        this.f22586u = builder.u();
        this.f22589x = builder.i();
        this.f22590y = builder.l();
        this.f22591z = builder.D();
        this.A = builder.I();
        this.B = builder.y();
        this.C = builder.w();
        re.h hVarF = builder.F();
        this.D = hVarF == null ? new re.h() : hVarF;
        boolean z10 = true;
        if (!(listN instanceof Collection) || !listN.isEmpty()) {
            Iterator<T> it = listN.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            this.f22582q = null;
            this.f22588w = null;
            this.f22583r = null;
            this.f22587v = g.f22398d;
        } else if (builder.H() != null) {
            this.f22582q = builder.H();
            ze.c cVarJ = builder.j();
            kotlin.jvm.internal.t.c(cVarJ);
            this.f22588w = cVarJ;
            X509TrustManager x509TrustManagerJ = builder.J();
            kotlin.jvm.internal.t.c(x509TrustManagerJ);
            this.f22583r = x509TrustManagerJ;
            g gVarK = builder.k();
            kotlin.jvm.internal.t.c(cVarJ);
            this.f22587v = gVarK.e(cVarJ);
        } else {
            we.h.a aVar = we.h.f27895a;
            X509TrustManager x509TrustManagerP = aVar.g().p();
            this.f22583r = x509TrustManagerP;
            we.h hVarG = aVar.g();
            kotlin.jvm.internal.t.c(x509TrustManagerP);
            this.f22582q = hVarG.o(x509TrustManagerP);
            ze.c.a aVar2 = ze.c.f29250a;
            kotlin.jvm.internal.t.c(x509TrustManagerP);
            ze.c cVarA = aVar2.a(x509TrustManagerP);
            this.f22588w = cVarA;
            g gVarK2 = builder.k();
            kotlin.jvm.internal.t.c(cVarA);
            this.f22587v = gVarK2.e(cVarA);
        }
        G();
    }

    private final void G() {
        boolean z10;
        if (!(!this.f22568c.contains(null))) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("Null interceptor: ", v()).toString());
        }
        if (!(!this.f22569d.contains(null))) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("Null network interceptor: ", w()).toString());
        }
        List<l> list = this.f22584s;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((l) it.next()).f()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            if (this.f22582q == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f22588w == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f22583r == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f22582q == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f22588w == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f22583r == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!kotlin.jvm.internal.t.a(this.f22587v, g.f22398d)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final me.b A() {
        return this.f22580o;
    }

    public final ProxySelector B() {
        return this.f22579n;
    }

    public final int C() {
        return this.f22591z;
    }

    public final boolean D() {
        return this.f22571f;
    }

    public final SocketFactory E() {
        return this.f22581p;
    }

    public final SSLSocketFactory F() {
        SSLSocketFactory sSLSocketFactory = this.f22582q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int H() {
        return this.A;
    }

    @Override // me.e.a
    public e a(z request) {
        kotlin.jvm.internal.t.f(request, "request");
        return new re.e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final me.b g() {
        return this.f22572g;
    }

    public final c h() {
        return this.f22576k;
    }

    public final int i() {
        return this.f22589x;
    }

    public final g j() {
        return this.f22587v;
    }

    public final int k() {
        return this.f22590y;
    }

    public final k l() {
        return this.f22567b;
    }

    public final List<l> m() {
        return this.f22584s;
    }

    public final n n() {
        return this.f22575j;
    }

    public final p o() {
        return this.f22566a;
    }

    public final q p() {
        return this.f22577l;
    }

    public final r.c q() {
        return this.f22570e;
    }

    public final boolean r() {
        return this.f22573h;
    }

    public final boolean s() {
        return this.f22574i;
    }

    public final re.h t() {
        return this.D;
    }

    public final HostnameVerifier u() {
        return this.f22586u;
    }

    public final List<v> v() {
        return this.f22568c;
    }

    public final List<v> w() {
        return this.f22569d;
    }

    public final int x() {
        return this.B;
    }

    public final List<y> y() {
        return this.f22585t;
    }

    public final Proxy z() {
        return this.f22578m;
    }

    public x() {
        this(new a());
    }
}
