package me;

import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f22295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f22296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f22299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f22300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f22301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b0 f22302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b0 f22303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b0 f22304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f22305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f22306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final re.c f22307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f22308n;

    public b0(z request, y protocol, String message, int i10, s sVar, t headers, c0 c0Var, b0 b0Var, b0 b0Var2, b0 b0Var3, long j10, long j11, re.c cVar) {
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(protocol, "protocol");
        kotlin.jvm.internal.t.f(message, "message");
        kotlin.jvm.internal.t.f(headers, "headers");
        this.f22295a = request;
        this.f22296b = protocol;
        this.f22297c = message;
        this.f22298d = i10;
        this.f22299e = sVar;
        this.f22300f = headers;
        this.f22301g = c0Var;
        this.f22302h = b0Var;
        this.f22303i = b0Var2;
        this.f22304j = b0Var3;
        this.f22305k = j10;
        this.f22306l = j11;
        this.f22307m = cVar;
    }

    public static /* synthetic */ String p(b0 b0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return b0Var.o(str, str2);
    }

    public final b0 B() {
        return this.f22304j;
    }

    public final y C() {
        return this.f22296b;
    }

    public final long F() {
        return this.f22306l;
    }

    public final z G() {
        return this.f22295a;
    }

    public final long H() {
        return this.f22305k;
    }

    public final c0 b() {
        return this.f22301g;
    }

    public final d c() {
        d dVar = this.f22308n;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.f22362n.b(this.f22300f);
        this.f22308n = dVarB;
        return dVarB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c0 c0Var = this.f22301g;
        if (c0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        c0Var.close();
    }

    public final b0 e() {
        return this.f22303i;
    }

    public final List<h> f() {
        String str;
        t tVar = this.f22300f;
        int i10 = this.f22298d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return kotlin.collections.t.k();
            }
            str = "Proxy-Authenticate";
        }
        return se.e.a(tVar, str);
    }

    public final int h() {
        return this.f22298d;
    }

    public final re.c k() {
        return this.f22307m;
    }

    public final s n() {
        return this.f22299e;
    }

    public final String o(String name, String str) {
        kotlin.jvm.internal.t.f(name, "name");
        String strA = this.f22300f.a(name);
        return strA == null ? str : strA;
    }

    public final t s() {
        return this.f22300f;
    }

    public final boolean t() {
        int i10 = this.f22298d;
        return 200 <= i10 && i10 < 300;
    }

    public String toString() {
        return "Response{protocol=" + this.f22296b + ", code=" + this.f22298d + ", message=" + this.f22297c + ", url=" + this.f22295a.j() + '}';
    }

    public final String u() {
        return this.f22297c;
    }

    public final b0 v() {
        return this.f22302h;
    }

    public final a z() {
        return new a(this);
    }

    /* JADX INFO: compiled from: Response.kt */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z f22309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y f22310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f22312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f22313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t.a f22314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c0 f22315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b0 f22316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b0 f22317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private b0 f22318j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f22319k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f22320l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private re.c f22321m;

        public a() {
            this.f22311c = -1;
            this.f22314f = new t.a();
        }

        private final void e(b0 b0Var) {
            if (b0Var == null) {
                return;
            }
            if (!(b0Var.b() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void f(String str, b0 b0Var) {
            if (b0Var == null) {
                return;
            }
            if (!(b0Var.b() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n(str, ".body != null").toString());
            }
            if (!(b0Var.v() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n(str, ".networkResponse != null").toString());
            }
            if (!(b0Var.e() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n(str, ".cacheResponse != null").toString());
            }
            if (!(b0Var.B() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n(str, ".priorResponse != null").toString());
            }
        }

        public final void A(b0 b0Var) {
            this.f22316h = b0Var;
        }

        public final void B(b0 b0Var) {
            this.f22318j = b0Var;
        }

        public final void C(y yVar) {
            this.f22310b = yVar;
        }

        public final void D(long j10) {
            this.f22320l = j10;
        }

        public final void E(z zVar) {
            this.f22309a = zVar;
        }

        public final void F(long j10) {
            this.f22319k = j10;
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            i().a(name, value);
            return this;
        }

        public a b(c0 c0Var) {
            u(c0Var);
            return this;
        }

        public b0 c() {
            int i10 = this.f22311c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(kotlin.jvm.internal.t.n("code < 0: ", Integer.valueOf(h())).toString());
            }
            z zVar = this.f22309a;
            if (zVar == null) {
                throw new IllegalStateException("request == null".toString());
            }
            y yVar = this.f22310b;
            if (yVar == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f22312d;
            if (str != null) {
                return new b0(zVar, yVar, str, i10, this.f22313e, this.f22314f.d(), this.f22315g, this.f22316h, this.f22317i, this.f22318j, this.f22319k, this.f22320l, this.f22321m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public a d(b0 b0Var) {
            f("cacheResponse", b0Var);
            v(b0Var);
            return this;
        }

        public a g(int i10) {
            w(i10);
            return this;
        }

        public final int h() {
            return this.f22311c;
        }

        public final t.a i() {
            return this.f22314f;
        }

        public a j(s sVar) {
            x(sVar);
            return this;
        }

        public a k(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            i().h(name, value);
            return this;
        }

        public a l(t headers) {
            kotlin.jvm.internal.t.f(headers, "headers");
            y(headers.d());
            return this;
        }

        public final void m(re.c deferredTrailers) {
            kotlin.jvm.internal.t.f(deferredTrailers, "deferredTrailers");
            this.f22321m = deferredTrailers;
        }

        public a n(String message) {
            kotlin.jvm.internal.t.f(message, "message");
            z(message);
            return this;
        }

        public a o(b0 b0Var) {
            f("networkResponse", b0Var);
            A(b0Var);
            return this;
        }

        public a p(b0 b0Var) {
            e(b0Var);
            B(b0Var);
            return this;
        }

        public a q(y protocol) {
            kotlin.jvm.internal.t.f(protocol, "protocol");
            C(protocol);
            return this;
        }

        public a r(long j10) {
            D(j10);
            return this;
        }

        public a s(z request) {
            kotlin.jvm.internal.t.f(request, "request");
            E(request);
            return this;
        }

        public a t(long j10) {
            F(j10);
            return this;
        }

        public final void u(c0 c0Var) {
            this.f22315g = c0Var;
        }

        public final void v(b0 b0Var) {
            this.f22317i = b0Var;
        }

        public final void w(int i10) {
            this.f22311c = i10;
        }

        public final void x(s sVar) {
            this.f22313e = sVar;
        }

        public final void y(t.a aVar) {
            kotlin.jvm.internal.t.f(aVar, "<set-?>");
            this.f22314f = aVar;
        }

        public final void z(String str) {
            this.f22312d = str;
        }

        public a(b0 response) {
            kotlin.jvm.internal.t.f(response, "response");
            this.f22311c = -1;
            this.f22309a = response.G();
            this.f22310b = response.C();
            this.f22311c = response.h();
            this.f22312d = response.u();
            this.f22313e = response.n();
            this.f22314f = response.s().d();
            this.f22315g = response.b();
            this.f22316h = response.v();
            this.f22317i = response.e();
            this.f22318j = response.B();
            this.f22319k = response.H();
            this.f22320l = response.F();
            this.f22321m = response.k();
        }
    }
}
