package me;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f22627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f22629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f22630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Object> f22631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f22632f;

    public z(u url, String method, t headers, a0 a0Var, Map<Class<?>, ? extends Object> tags) {
        kotlin.jvm.internal.t.f(url, "url");
        kotlin.jvm.internal.t.f(method, "method");
        kotlin.jvm.internal.t.f(headers, "headers");
        kotlin.jvm.internal.t.f(tags, "tags");
        this.f22627a = url;
        this.f22628b = method;
        this.f22629c = headers;
        this.f22630d = a0Var;
        this.f22631e = tags;
    }

    public final a0 a() {
        return this.f22630d;
    }

    public final d b() {
        d dVar = this.f22632f;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.f22362n.b(this.f22629c);
        this.f22632f = dVarB;
        return dVarB;
    }

    public final Map<Class<?>, Object> c() {
        return this.f22631e;
    }

    public final String d(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        return this.f22629c.a(name);
    }

    public final List<String> e(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        return this.f22629c.f(name);
    }

    public final t f() {
        return this.f22629c;
    }

    public final boolean g() {
        return this.f22627a.i();
    }

    public final String h() {
        return this.f22628b;
    }

    public final a i() {
        return new a(this);
    }

    public final u j() {
        return this.f22627a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(h());
        sb2.append(", url=");
        sb2.append(j());
        if (f().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (wc.q<? extends String, ? extends String> qVar : f()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kotlin.collections.t.t();
                }
                wc.q<? extends String, ? extends String> qVar2 = qVar;
                String strB = qVar2.b();
                String strC = qVar2.c();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strB);
                sb2.append(':');
                sb2.append(strC);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!c().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(c());
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: compiled from: Request.kt */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f22633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f22635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a0 f22636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<Class<?>, Object> f22637e;

        public a() {
            this.f22637e = new LinkedHashMap();
            this.f22634b = "GET";
            this.f22635c = new t.a();
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            d().a(name, value);
            return this;
        }

        public z b() {
            u uVar = this.f22633a;
            if (uVar != null) {
                return new z(uVar, this.f22634b, this.f22635c.d(), this.f22636d, ne.d.U(this.f22637e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c() {
            return g("GET", null);
        }

        public final t.a d() {
            return this.f22635c;
        }

        public a e(String name, String value) {
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(value, "value");
            d().h(name, value);
            return this;
        }

        public a f(t headers) {
            kotlin.jvm.internal.t.f(headers, "headers");
            k(headers.d());
            return this;
        }

        public a g(String method, a0 a0Var) {
            kotlin.jvm.internal.t.f(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (a0Var == null) {
                if (!(true ^ se.f.e(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!se.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            l(method);
            j(a0Var);
            return this;
        }

        public a h(a0 body) {
            kotlin.jvm.internal.t.f(body, "body");
            return g("POST", body);
        }

        public a i(String name) {
            kotlin.jvm.internal.t.f(name, "name");
            d().g(name);
            return this;
        }

        public final void j(a0 a0Var) {
            this.f22636d = a0Var;
        }

        public final void k(t.a aVar) {
            kotlin.jvm.internal.t.f(aVar, "<set-?>");
            this.f22635c = aVar;
        }

        public final void l(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.f22634b = str;
        }

        public final void m(u uVar) {
            this.f22633a = uVar;
        }

        public a n(String url) {
            kotlin.jvm.internal.t.f(url, "url");
            if (rd.c0.M(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = kotlin.jvm.internal.t.n("http:", strSubstring);
            } else if (rd.c0.M(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = kotlin.jvm.internal.t.n("https:", strSubstring2);
            }
            return o(u.f22538k.d(url));
        }

        public a o(u url) {
            kotlin.jvm.internal.t.f(url, "url");
            m(url);
            return this;
        }

        public a(z request) {
            Map<Class<?>, Object> mapU;
            kotlin.jvm.internal.t.f(request, "request");
            this.f22637e = new LinkedHashMap();
            this.f22633a = request.j();
            this.f22634b = request.h();
            this.f22636d = request.a();
            if (!request.c().isEmpty()) {
                mapU = o0.u(request.c());
            } else {
                mapU = new LinkedHashMap<>();
            }
            this.f22637e = mapU;
            this.f22635c = request.f().d();
        }
    }
}
