package io.bidmachine.analytics.internal.l;

import android.content.Context;
import com.android.billingclient.gp.VRfCTjjLv;
import io.bidmachine.analytics.internal.E.e;
import io.bidmachine.analytics.internal.h.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import wc.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.j.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f17019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final id.l f17020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f17021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private F f17022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final A f17007o = new A(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final wc.k f17008p = wc.m.a(m.f17053a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final wc.k f17009q = wc.m.a(k.f17051a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final wc.k f17010r = wc.m.a(j.f17050a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final wc.k f17011s = wc.m.a(l.f17052a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final wc.k f17012t = wc.m.a(C2436b.f17042a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final wc.k f17013u = wc.m.a(C2437c.f17043a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final wc.k f17014v = wc.m.a(C2439e.f17045a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final wc.k f17015w = wc.m.a(C2438d.f17044a);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final wc.k f17016x = wc.m.a(x.f17064a);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final wc.k f17017y = wc.m.a(z.f17066a);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final wc.k f17018z = wc.m.a(y.f17065a);
    private static final wc.k A = wc.m.a(h.f17048a);
    private static final wc.k B = wc.m.a(i.f17049a);
    private static final wc.k C = wc.m.a(s.f17059a);
    private static final wc.k D = wc.m.a(t.f17060a);
    private static final wc.k E = wc.m.a(C2440f.f17046a);
    private static final wc.k F = wc.m.a(g.f17047a);
    private static final wc.k G = wc.m.a(q.f17057a);
    private static final wc.k H = wc.m.a(r.f17058a);
    private static final wc.k I = wc.m.a(n.f17054a);
    private static final wc.k J = wc.m.a(p.f17056a);
    private static final wc.k K = wc.m.a(v.f17062a);
    private static final wc.k L = wc.m.a(u.f17061a);
    private static final wc.k M = wc.m.a(o.f17055a);
    private static final wc.k N = wc.m.a(w.f17063a);

    public static final class A {
        public /* synthetic */ A(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String a() {
            return (String) a.f17012t.getValue();
        }

        public final String b() {
            return (String) a.f17013u.getValue();
        }

        public final String c() {
            return (String) a.f17015w.getValue();
        }

        public final String d() {
            return (String) a.f17014v.getValue();
        }

        public final String e() {
            return (String) a.E.getValue();
        }

        public final String f() {
            return (String) a.F.getValue();
        }

        public final String g() {
            return (String) a.A.getValue();
        }

        public final String h() {
            return (String) a.B.getValue();
        }

        public final String i() {
            return (String) a.f17010r.getValue();
        }

        public final String j() {
            return (String) a.f17009q.getValue();
        }

        public final String k() {
            return (String) a.f17011s.getValue();
        }

        public final String l() {
            return (String) a.f17008p.getValue();
        }

        public final String m() {
            return (String) a.I.getValue();
        }

        public final String n() {
            return (String) a.M.getValue();
        }

        public final String o() {
            return (String) a.J.getValue();
        }

        public final String p() {
            return (String) a.G.getValue();
        }

        public final String q() {
            return (String) a.H.getValue();
        }

        public final String r() {
            return (String) a.C.getValue();
        }

        public final String s() {
            return (String) a.D.getValue();
        }

        public final String t() {
            return (String) a.L.getValue();
        }

        public final String u() {
            return (String) a.K.getValue();
        }

        public final String v() {
            return (String) a.N.getValue();
        }

        public final String w() {
            return (String) a.f17016x.getValue();
        }

        public final String x() {
            return (String) a.f17018z.getValue();
        }

        public final String y() {
            return (String) a.f17017y.getValue();
        }

        private A() {
        }
    }

    public static final class B implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f17023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f17024b;

        public B(b bVar) {
            this.f17023a = bVar;
        }

        private final JSONObject a(Object obj) {
            try {
                Method method = this.f17024b;
                if (method == null) {
                    method = obj.getClass().getMethod(a.f17007o.n(), null);
                    this.f17024b = method;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof JSONObject) {
                    return (JSONObject) objInvoke;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object objE;
            String name = method.getName();
            A a10 = a.f17007o;
            if (kotlin.jvm.internal.t.a(name, a10.m())) {
                return Boolean.valueOf(obj == (objArr != null ? kotlin.collections.o.E(objArr, 0) : null));
            }
            if (kotlin.jvm.internal.t.a(name, a10.o())) {
                return Integer.valueOf(System.identityHashCode(obj));
            }
            if (kotlin.jvm.internal.t.a(name, a10.u())) {
                return a10.v();
            }
            if (kotlin.jvm.internal.t.a(method.getName(), a10.t()) && objArr != null && (objE = kotlin.collections.o.E(objArr, 0)) != null) {
                try {
                    wc.r.a aVar = wc.r.f27774b;
                    JSONObject jSONObjectA = a(objE);
                    if (jSONObjectA == null || jSONObjectA.length() <= 0) {
                        this.f17023a.a(new io.bidmachine.analytics.internal.g.h("isimp", io.bidmachine.analytics.internal.g.h.a.MONITOR_NO_CONTENT, null, 4, null));
                        return null;
                    }
                    try {
                        this.f17023a.a(e.a(jSONObjectA));
                    } catch (Throwable th) {
                        this.f17023a.a(new io.bidmachine.analytics.internal.g.h("isimp", io.bidmachine.analytics.internal.g.h.a.MONITOR_BAD_CONTENT, e.a(th)));
                    }
                    wc.r.c(g0.f27756a);
                } catch (Throwable th2) {
                    wc.r.a aVar2 = wc.r.f27774b;
                    wc.r.c(wc.s.a(th2));
                }
            }
            return null;
        }
    }

    public static final class C implements E {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0284a f17025e = new C0284a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f17026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f17027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f17028d;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$C$a, reason: collision with other inner class name */
        public static final class C0284a {

            /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$C$a$a, reason: collision with other inner class name */
            static final class C0285a extends kotlin.jvm.internal.u implements id.q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0285a f17029a = new C0285a();

                C0285a() {
                    super(3);
                }

                @Override // id.q
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final E invoke(Object obj, Method method, Method method2) {
                    return new C(obj, method, method2);
                }
            }

            public /* synthetic */ C0284a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final E a(b bVar) {
                E.C0288a c0288a = E.f17035a;
                A a10 = a.f17007o;
                return c0288a.a(bVar, a10.e(), a10.f(), a10.p(), a10.q(), C0285a.f17029a);
            }

            private C0284a() {
            }
        }

        public C(Object obj, Method method, Method method2) {
            this.f17026b = obj;
            this.f17027c = method;
            this.f17028d = method2;
        }

        @Override // io.bidmachine.analytics.internal.l.a.E
        public void a() throws IllegalAccessException, InvocationTargetException {
            this.f17027c.invoke(null, this.f17026b);
        }

        @Override // io.bidmachine.analytics.internal.l.a.E
        public void b() throws IllegalAccessException, InvocationTargetException {
            this.f17028d.invoke(null, this.f17026b);
        }
    }

    public static final class D implements E {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0286a f17030e = new C0286a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f17031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f17032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f17033d;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$D$a, reason: collision with other inner class name */
        public static final class C0286a {

            /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$D$a$a, reason: collision with other inner class name */
            static final class C0287a extends kotlin.jvm.internal.u implements id.q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0287a f17034a = new C0287a();

                C0287a() {
                    super(3);
                }

                @Override // id.q
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final E invoke(Object obj, Method method, Method method2) {
                    return new D(obj, method, method2);
                }
            }

            public /* synthetic */ C0286a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final E a(b bVar) {
                E.C0288a c0288a = E.f17035a;
                A a10 = a.f17007o;
                return c0288a.a(bVar, a10.g(), a10.h(), a10.r(), a10.s(), C0287a.f17034a);
            }

            private C0286a() {
            }
        }

        public D(Object obj, Method method, Method method2) {
            this.f17031b = obj;
            this.f17032c = method;
            this.f17033d = method2;
        }

        @Override // io.bidmachine.analytics.internal.l.a.E
        public void a() throws IllegalAccessException, InvocationTargetException {
            this.f17032c.invoke(null, this.f17031b);
        }

        @Override // io.bidmachine.analytics.internal.l.a.E
        public void b() throws IllegalAccessException, InvocationTargetException {
            this.f17033d.invoke(null, this.f17031b);
        }
    }

    public interface E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0288a f17035a = C0288a.f17036a;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$E$a, reason: collision with other inner class name */
        public static final class C0288a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ C0288a f17036a = new C0288a();

            private C0288a() {
            }

            public final E a(b bVar, String str, String str2, String str3, String str4, id.q qVar) {
                Class<?> cls;
                Class<?> cls2;
                try {
                    cls = Class.forName(str);
                } catch (Throwable unused) {
                    cls = null;
                }
                if (cls == null) {
                    return null;
                }
                try {
                    cls2 = Class.forName(str2);
                } catch (Throwable unused2) {
                    cls2 = null;
                }
                if (cls2 == null) {
                    return null;
                }
                return (E) qVar.invoke(Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new B(bVar)), cls.getMethod(str3, cls2), cls.getMethod(str4, cls2));
            }
        }

        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$a, reason: collision with other inner class name */
    public static final class C0290a extends kotlin.jvm.internal.u implements id.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0290a f17041a = new C0290a();

        C0290a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // id.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke(b bVar) {
            return new F(bVar, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$b, reason: case insensitive filesystem */
    static final class C2436b extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2436b f17042a = new C2436b();

        C2436b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("QkFOTkVS");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$c, reason: case insensitive filesystem */
    static final class C2437c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2437c f17043a = new C2437c();

        C2437c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("SU5URVJTVElUSUFM");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$d, reason: case insensitive filesystem */
    static final class C2438d extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2438d f17044a = new C2438d();

        C2438d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("TkFUSVZFQUQ=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$e, reason: case insensitive filesystem */
    static final class C2439e extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2439e f17045a = new C2439e();

        C2439e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("UkVXQVJERURfVklERU8=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$f, reason: case insensitive filesystem */
    static final class C2440f extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2440f f17046a = new C2440f();

        C2440f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLmlyb25zb3VyY2UubWVkaWF0aW9uc2RrLklyb25Tb3VyY2U=");
        }
    }

    static final class g extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f17047a = new g();

        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLmlyb25zb3VyY2UubWVkaWF0aW9uc2RrLmltcHJlc3Npb25EYXRhLkltcHJlc3Npb25EYXRhTGlzdGVuZXI=");
        }
    }

    static final class h extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f17048a = new h();

        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLnVuaXR5M2QubWVkaWF0aW9uLkxldmVsUGxheQ==");
        }
    }

    static final class i extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f17049a = new i();

        i() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLnVuaXR5M2QubWVkaWF0aW9uLmltcHJlc3Npb24uTGV2ZWxQbGF5SW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class j extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f17050a = new j();

        j() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("YWRGb3JtYXQ=");
        }
    }

    static final class k extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f17051a = new k();

        k() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("YWROZXR3b3Jr");
        }
    }

    static final class l extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f17052a = new l();

        l() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cHJlY2lzaW9u");
        }
    }

    static final class m extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f17053a = new m();

        m() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cmV2ZW51ZQ==");
        }
    }

    static final class n extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f17054a = new n();

        n() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("ZXF1YWxz");
        }
    }

    static final class o extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f17055a = new o();

        o() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Z2V0QWxsRGF0YQ==");
        }
    }

    static final class p extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f17056a = new p();

        p() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("aGFzaENvZGU=");
        }
    }

    static final class q extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f17057a = new q();

        q() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("YWRkSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class r extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f17058a = new r();

        r() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cmVtb3ZlSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class s extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f17059a = new s();

        s() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("YWRkSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class t extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f17060a = new t();

        t() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cmVtb3ZlSW1wcmVzc2lvbkRhdGFMaXN0ZW5lcg==");
        }
    }

    static final class u extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f17061a = new u();

        u() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("b25JbXByZXNzaW9uU3VjY2Vzcw==");
        }
    }

    static final class v extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f17062a = new v();

        v() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("dG9TdHJpbmc=");
        }
    }

    static final class w extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f17063a = new w();

        w() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("TGlzdGVuZXI=");
        }
    }

    static final class x extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f17064a = new x();

        x() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a(VRfCTjjLv.bpPZXGpE);
        }
    }

    static final class y extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f17065a = new y();

        y() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Q1BN");
        }
    }

    static final class z extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f17066a = new z();

        z() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("UkFURQ==");
        }
    }

    public /* synthetic */ a(io.bidmachine.analytics.internal.p002a.a aVar, id.l lVar, int i10, kotlin.jvm.internal.k kVar) {
        this(aVar, (i10 & 2) != 0 ? C0290a.f17041a : lVar);
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17021m;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(io.bidmachine.analytics.internal.i.a.b bVar) {
        super.b(bVar);
        this.f17022n = (F) this.f17020l.invoke(this);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public io.bidmachine.analytics.internal.j.a.b b(Map map) {
        Object obj;
        String string;
        A a10 = f17007o;
        Float fA = io.bidmachine.analytics.internal.E.b.a(map.get(a10.l()));
        if (fA == null || (obj = map.get(a10.j())) == null || (string = obj.toString()) == null) {
            return null;
        }
        return new io.bidmachine.analytics.internal.j.a.b(null, this.f17019k.d().currentTimeMillis(), 0, fA, d(map), string, null, false, 197, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public io.bidmachine.analytics.internal.g.a c(Map map) {
        String string;
        String upperCase;
        A a10 = f17007o;
        Object obj = map.get(a10.i());
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        if (kotlin.jvm.internal.t.a(upperCase, a10.a())) {
            return io.bidmachine.analytics.internal.g.a.BANNER;
        }
        if (kotlin.jvm.internal.t.a(upperCase, a10.b())) {
            return io.bidmachine.analytics.internal.g.a.INTERSTITIAL;
        }
        if (kotlin.jvm.internal.t.a(upperCase, a10.d())) {
            return io.bidmachine.analytics.internal.g.a.REWARDED;
        }
        if (kotlin.jvm.internal.t.a(upperCase, a10.c())) {
            return io.bidmachine.analytics.internal.g.a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        F f10 = this.f17022n;
        if (f10 != null) {
            f10.a();
        }
    }

    @Override // io.bidmachine.analytics.internal.j.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        super.f(context);
        F f10 = this.f17022n;
        if (f10 != null) {
            f10.b();
        }
    }

    public a(io.bidmachine.analytics.internal.p002a.a aVar, id.l lVar) {
        super(aVar);
        this.f17019k = aVar;
        this.f17020l = lVar;
        this.f17021m = "isimp";
    }

    private final io.bidmachine.analytics.internal.g.g d(Map map) {
        String string;
        String upperCase;
        A a10 = f17007o;
        Object obj = map.get(a10.k());
        if (obj != null && (string = obj.toString()) != null && (upperCase = string.toUpperCase(Locale.US)) != null) {
            if (kotlin.jvm.internal.t.a(upperCase, a10.w()) ? true : kotlin.jvm.internal.t.a(upperCase, a10.y())) {
                return io.bidmachine.analytics.internal.g.g.PRECISE;
            }
            return kotlin.jvm.internal.t.a(upperCase, a10.x()) ? io.bidmachine.analytics.internal.g.g.ESTIMATED : io.bidmachine.analytics.internal.g.g.ESTIMATED;
        }
        return io.bidmachine.analytics.internal.g.g.ESTIMATED;
    }

    public static final class F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.h.b f17037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E f17038b;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.l.a$F$a, reason: collision with other inner class name */
        static final class C0289a extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.bidmachine.analytics.internal.h.b f17039a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0289a(io.bidmachine.analytics.internal.h.b bVar) {
                super(0);
                this.f17039a = bVar;
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke() {
                return D.f17030e.a(this.f17039a);
            }
        }

        static final class b extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.bidmachine.analytics.internal.h.b f17040a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.bidmachine.analytics.internal.h.b bVar) {
                super(0);
                this.f17040a = bVar;
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke() {
                return C.f17025e.a(this.f17040a);
            }
        }

        public F(io.bidmachine.analytics.internal.h.b bVar, List list) {
            E e10;
            this.f17037a = bVar;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    e10 = null;
                    break;
                }
                e10 = (E) ((id.a) it.next()).invoke();
            } while (e10 == null);
            if (e10 == null) {
                throw new IllegalArgumentException("No implementation found for isimp");
            }
            this.f17038b = e10;
        }

        public final void a() {
            this.f17038b.b();
        }

        public final void b() {
            this.f17038b.a();
        }

        public /* synthetic */ F(io.bidmachine.analytics.internal.h.b bVar, List list, int i10, kotlin.jvm.internal.k kVar) {
            this(bVar, (i10 & 2) != 0 ? kotlin.collections.t.n(new C0289a(bVar), new b(bVar)) : list);
        }
    }
}
