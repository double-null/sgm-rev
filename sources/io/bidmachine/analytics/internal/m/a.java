package io.bidmachine.analytics.internal.m;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import io.bidmachine.analytics.internal.E.e;
import io.bidmachine.analytics.internal.g.g;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.h.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m0;
import wc.g0;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.j.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f17078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f17079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f17080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private M f17081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final k f17082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final K f17067p = new K(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final k f17068q = m.a(z.f17147a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final k f17069r = m.a(s.f17140a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final k f17070s = m.a(x.f17145a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final k f17071t = m.a(C.f17085a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final k f17072u = m.a(w.f17144a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final k f17073v = m.a(v.f17143a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final k f17074w = m.a(t.f17141a);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final k f17075x = m.a(y.f17146a);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final k f17076y = m.a(C2450k.f17132a);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final k f17077z = m.a(C2451l.f17133a);
    private static final k A = m.a(C2452m.f17134a);
    private static final k B = m.a(C2453n.f17135a);
    private static final k C = m.a(A.f17083a);
    private static final k D = m.a(D.f17086a);
    private static final k E = m.a(u.f17142a);
    private static final k F = m.a(B.f17084a);
    private static final k G = m.a(E.f17087a);
    private static final k H = m.a(r.f17139a);
    private static final k I = m.a(p.f17137a);
    private static final k J = m.a(o.f17136a);
    private static final k K = m.a(q.f17138a);
    private static final k L = m.a(C2441b.f17123a);
    private static final k M = m.a(C2445f.f17127a);
    private static final k N = m.a(C2444e.f17126a);
    private static final k O = m.a(C2442c.f17124a);
    private static final k P = m.a(C2443d.f17125a);
    private static final k Q = m.a(C2447h.f17129a);
    private static final k R = m.a(C2448i.f17130a);
    private static final k S = m.a(C2449j.f17131a);
    private static final k T = m.a(C2446g.f17128a);
    private static final k U = m.a(H.f17090a);
    private static final k V = m.a(G.f17089a);
    private static final k W = m.a(F.f17088a);
    private static final k X = m.a(I.f17091a);
    private static final k Y = m.a(J.f17092a);

    static final class A extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final A f17083a = new A();

        A() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cmVnaXN0ZXJSZWNlaXZlcg==");
        }
    }

    static final class B extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final B f17084a = new B();

        B() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("c3Vic2NyaWJl");
        }
    }

    static final class C extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C f17085a = new C();

        C() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("dG9TdHJpbmc=");
        }
    }

    static final class D extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D f17086a = new D();

        D() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("dW5yZWdpc3RlclJlY2VpdmVy");
        }
    }

    static final class E extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final E f17087a = new E();

        E() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("dW5zdWJzY3JpYmU=");
        }
    }

    static final class F extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final F f17088a = new F();

        F() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("RVNUSU1BVEVE");
        }
    }

    static final class G extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G f17089a = new G();

        G() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("RVhBQ1Q=");
        }
    }

    static final class H extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f17090a = new H();

        H() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("UFVCTElTSEVSX0RFRklORUQ=");
        }
    }

    static final class I extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final I f17091a = new I();

        I() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("VU5ERUZJTkVE");
        }
    }

    static final class J extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final J f17092a = new J();

        J() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("bWF4X3JldmVudWVfZXZlbnRz");
        }
    }

    public static final class K {
        public /* synthetic */ K(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String A() {
            return (String) a.F.getValue();
        }

        public final String B() {
            return (String) a.f17071t.getValue();
        }

        public final String C() {
            return (String) a.D.getValue();
        }

        public final String D() {
            return (String) a.G.getValue();
        }

        public final String E() {
            return (String) a.W.getValue();
        }

        public final String F() {
            return (String) a.V.getValue();
        }

        public final String G() {
            return (String) a.U.getValue();
        }

        public final String H() {
            return (String) a.X.getValue();
        }

        public final String I() {
            return (String) a.Y.getValue();
        }

        public final String a() {
            return (String) a.L.getValue();
        }

        public final String b() {
            return (String) a.O.getValue();
        }

        public final String c() {
            return (String) a.P.getValue();
        }

        public final String d() {
            return (String) a.N.getValue();
        }

        public final String e() {
            return (String) a.M.getValue();
        }

        public final String f() {
            return (String) a.T.getValue();
        }

        public final String g() {
            return (String) a.Q.getValue();
        }

        public final String h() {
            return (String) a.R.getValue();
        }

        public final String i() {
            return (String) a.S.getValue();
        }

        public final String j() {
            return (String) a.f17076y.getValue();
        }

        public final String k() {
            return (String) a.f17077z.getValue();
        }

        public final String l() {
            return (String) a.A.getValue();
        }

        public final String m() {
            return (String) a.B.getValue();
        }

        public final String n() {
            return (String) a.J.getValue();
        }

        public final String o() {
            return (String) a.I.getValue();
        }

        public final String p() {
            return (String) a.K.getValue();
        }

        public final String q() {
            return (String) a.H.getValue();
        }

        public final String r() {
            return (String) a.f17069r.getValue();
        }

        public final String s() {
            return (String) a.f17074w.getValue();
        }

        public final String t() {
            return (String) a.E.getValue();
        }

        public final String u() {
            return (String) a.f17073v.getValue();
        }

        public final String v() {
            return (String) a.f17072u.getValue();
        }

        public final String w() {
            return (String) a.f17070s.getValue();
        }

        public final String x() {
            return (String) a.f17075x.getValue();
        }

        public final String y() {
            return (String) a.f17068q.getValue();
        }

        public final String z() {
            return (String) a.C.getValue();
        }

        private K() {
        }
    }

    public static final class L implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f17093a = m.a(new C0291a());

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$L$a, reason: collision with other inner class name */
        static final class C0291a extends kotlin.jvm.internal.u implements id.a {
            C0291a() {
                super(0);
            }

            @Override // id.a
            public final Object invoke() {
                C0293a c0293a = C0293a.f17102a;
                return Proxy.newProxyInstance(c0293a.k().getClassLoader(), new Class[]{c0293a.k()}, L.this);
            }
        }

        private final Object a() {
            return this.f17093a.getValue();
        }

        public final Object b() {
            return a();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            System.nanoTime();
            String name = method.getName();
            K k10 = a.f17067p;
            if (kotlin.jvm.internal.t.a(name, k10.s())) {
                return "";
            }
            if (!kotlin.jvm.internal.t.a(name, k10.x())) {
                if (kotlin.jvm.internal.t.a(name, k10.r())) {
                    return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
                }
                if (kotlin.jvm.internal.t.a(name, k10.w())) {
                    return Integer.valueOf(System.identityHashCode(obj));
                }
                if (kotlin.jvm.internal.t.a(name, k10.B())) {
                    return String.valueOf(System.identityHashCode(obj));
                }
            }
            return null;
        }
    }

    public static final class M implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17095a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f17097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile b f17098d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k f17096b = m.a(new C0292a());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f17099e = new LinkedHashMap();

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$M$a, reason: collision with other inner class name */
        static final class C0292a extends kotlin.jvm.internal.u implements id.a {
            C0292a() {
                super(0);
            }

            @Override // id.a
            public final Object invoke() {
                C0293a c0293a = C0293a.f17102a;
                return Proxy.newProxyInstance(c0293a.j().getClassLoader(), new Class[]{c0293a.j()}, M.this);
            }
        }

        public M(String str) {
            this.f17095a = str;
        }

        private final Object a() {
            return this.f17096b.getValue();
        }

        public final Object b() {
            return a();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            K k10 = a.f17067p;
            if (kotlin.jvm.internal.t.a(name, k10.y())) {
                Object obj2 = objArr != null ? objArr[0] : null;
                if (!this.f17097c || obj2 == null) {
                    return null;
                }
                a(obj2);
                return null;
            }
            if (kotlin.jvm.internal.t.a(name, k10.r())) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (kotlin.jvm.internal.t.a(name, k10.w())) {
                return Integer.valueOf(System.identityHashCode(obj));
            }
            if (kotlin.jvm.internal.t.a(name, k10.B())) {
                return String.valueOf(System.identityHashCode(obj));
            }
            return null;
        }

        public final void a(boolean z10) {
            this.f17097c = z10;
        }

        public final void a(b bVar) {
            this.f17098d = bVar;
        }

        private final void a(Object obj) {
            b bVar = this.f17098d;
            if (bVar == null) {
                return;
            }
            try {
                wc.r.a aVar = wc.r.f27774b;
                Class<?> cls = obj.getClass();
                Map map = this.f17099e;
                K k10 = a.f17067p;
                String strV = k10.v();
                Object method = map.get(strV);
                if (method == null) {
                    method = cls.getMethod(k10.v(), null);
                    map.put(strV, method);
                }
                Method method2 = (Method) method;
                Map map2 = this.f17099e;
                String strU = k10.u();
                Object method3 = map2.get(strU);
                if (method3 == null) {
                    method3 = cls.getMethod(k10.u(), null);
                    map2.put(strU, method3);
                }
                Method method4 = (Method) method3;
                Object objInvoke = method2.invoke(obj, null);
                if (kotlin.jvm.internal.t.a(objInvoke instanceof String ? (String) objInvoke : null, this.f17095a)) {
                    Object objInvoke2 = method4.invoke(obj, null);
                    Bundle bundle = objInvoke2 instanceof Bundle ? (Bundle) objInvoke2 : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        try {
                            bVar.a(e.a(bundle));
                        } catch (Throwable th) {
                            bVar.a(new h("mimp", h.a.MONITOR_BAD_CONTENT, e.a(th)));
                        }
                    } else {
                        bVar.a(new h("mimp", h.a.MONITOR_NO_CONTENT, null, 4, null));
                    }
                }
                wc.r.c(g0.f27756a);
            } catch (Throwable th2) {
                wc.r.a aVar2 = wc.r.f27774b;
                wc.r.c(wc.s.a(th2));
            }
        }
    }

    static final class N extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final N f17101a = new N();

        N() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L invoke() {
            return new L();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a, reason: collision with other inner class name */
    public static final class C0293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0293a f17102a = new C0293a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final k f17103b = m.a(c.f17115a);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final k f17104c = m.a(d.f17116a);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final k f17105d = m.a(f.f17118a);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final k f17106e = m.a(i.f17121a);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final k f17107f = m.a(C0294a.f17113a);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final k f17108g = m.a(h.f17120a);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final k f17109h = m.a(b.f17114a);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final k f17110i = m.a(g.f17119a);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final k f17111j = m.a(j.f17122a);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final k f17112k = m.a(e.f17117a);

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$a, reason: collision with other inner class name */
        static final class C0294a extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0294a f17113a = new C0294a();

            C0294a() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class invoke() {
                return Class.forName(a.f17067p.l());
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$b */
        static final class b extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f17114a = new b();

            b() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Method invoke() {
                return C0293a.f17102a.a().getDeclaredMethod(a.f17067p.t(), Context.class);
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$c */
        static final class c extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f17115a = new c();

            c() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class invoke() {
                return Class.forName(a.f17067p.j());
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$d */
        static final class d extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f17116a = new d();

            d() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class invoke() {
                return Class.forName(a.f17067p.k());
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$e */
        static final class e extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f17117a = new e();

            e() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Field invoke() throws IllegalAccessException {
                Field field;
                Field[] declaredFields = C0293a.f17102a.c().getDeclaredFields();
                int length = declaredFields.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        field = null;
                        break;
                    }
                    field = declaredFields[i10];
                    if (Modifier.isStatic(field.getModifiers()) && Map.class.isAssignableFrom(field.getType())) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        Map map = obj instanceof Map ? (Map) obj : null;
                        if (map != null && map.containsKey(a.f17067p.I())) {
                            break;
                        }
                    }
                    i10++;
                }
                if (field == null) {
                    return null;
                }
                field.setAccessible(true);
                return field;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$f */
        static final class f extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f17118a = new f();

            f() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Method invoke() {
                C0293a c0293a = C0293a.f17102a;
                return c0293a.c().getDeclaredMethod(a.f17067p.z(), c0293a.d(), IntentFilter.class);
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$g */
        static final class g extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f17119a = new g();

            g() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Method invoke() {
                C0293a c0293a = C0293a.f17102a;
                return c0293a.a().getDeclaredMethod(a.f17067p.A(), c0293a.h(), String.class);
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$h */
        static final class h extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f17120a = new h();

            h() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class invoke() {
                return Class.forName(a.f17067p.m());
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$i */
        static final class i extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f17121a = new i();

            i() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Method invoke() {
                C0293a c0293a = C0293a.f17102a;
                return c0293a.c().getDeclaredMethod(a.f17067p.C(), c0293a.d());
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a$j */
        static final class j extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f17122a = new j();

            j() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Method invoke() {
                C0293a c0293a = C0293a.f17102a;
                return c0293a.a().getDeclaredMethod(a.f17067p.D(), c0293a.h(), String.class);
            }
        }

        private C0293a() {
        }

        private final Field e() {
            return (Field) f17112k.getValue();
        }

        private final Method f() {
            return (Method) f17105d.getValue();
        }

        private final Method g() {
            return (Method) f17110i.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Class h() {
            return (Class) f17108g.getValue();
        }

        private final Method i() {
            return (Method) f17111j.getValue();
        }

        public final Class j() {
            return d();
        }

        public final Class k() {
            return h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Class a() {
            return (Class) f17107f.getValue();
        }

        private final Method b() {
            return (Method) f17109h.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Class c() {
            return (Class) f17103b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Class d() {
            return (Class) f17104c.getValue();
        }

        public final void a(Context context, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            g().invoke(b().invoke(null, context), obj, str);
        }

        public final void b(Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            f().invoke(null, obj, new IntentFilter(str));
        }

        public final void b(Context context, Object obj, String str) throws IllegalAccessException, InvocationTargetException {
            i().invoke(b().invoke(null, context), obj, str);
        }

        public final Object a(Object obj, String str) {
            try {
                wc.r.a aVar = wc.r.f27774b;
                Field fieldE = e();
                Object obj2 = fieldE != null ? fieldE.get(null) : null;
                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                Object obj3 = map != null ? map.get(str) : null;
                List list = m0.j(obj3) ? (List) obj3 : null;
                if (list != null) {
                    Iterator it = list.iterator();
                    int i10 = 0;
                    loop0: while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        }
                        Object next = it.next();
                        if (next == obj) {
                            break;
                        }
                        for (Field field : next.getClass().getDeclaredFields()) {
                            field.setAccessible(true);
                            if (field.get(next) == obj) {
                                break loop0;
                            }
                        }
                        i10++;
                    }
                    if (i10 > 0) {
                        list.add(0, list.remove(i10));
                    }
                }
                return wc.r.c(g0.f27756a);
            } catch (Throwable th) {
                wc.r.a aVar2 = wc.r.f27774b;
                return wc.r.c(wc.s.a(th));
            }
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$b, reason: case insensitive filesystem */
    static final class C2441b extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2441b f17123a = new C2441b();

        C2441b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("QkFOTkVS");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$c, reason: case insensitive filesystem */
    static final class C2442c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2442c f17124a = new C2442c();

        C2442c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("SU5URVI=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$d, reason: case insensitive filesystem */
    static final class C2443d extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2443d f17125a = new C2443d();

        C2443d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("SU5URVJTVElUSUFM");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$e, reason: case insensitive filesystem */
    static final class C2444e extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2444e f17126a = new C2444e();

        C2444e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("TEVBREVS");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$f, reason: case insensitive filesystem */
    static final class C2445f extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2445f f17127a = new C2445f();

        C2445f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("TVJFQw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$g, reason: case insensitive filesystem */
    static final class C2446g extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2446g f17128a = new C2446g();

        C2446g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("TkFUSVZF");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$h, reason: case insensitive filesystem */
    static final class C2447h extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2447h f17129a = new C2447h();

        C2447h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("UkVXQVJE");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$i, reason: case insensitive filesystem */
    static final class C2448i extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2448i f17130a = new C2448i();

        C2448i() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("UkVXQVJERUQ=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$j, reason: case insensitive filesystem */
    static final class C2449j extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2449j f17131a = new C2449j();

        C2449j() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("UkVXQVJERURfSU5URVJTVElUSUFM");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$k, reason: case insensitive filesystem */
    static final class C2450k extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2450k f17132a = new C2450k();

        C2450k() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLmFwcGxvdmluLmltcGwuc2RrLkFwcExvdmluQnJvYWRjYXN0TWFuYWdlcg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$l, reason: case insensitive filesystem */
    static final class C2451l extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2451l f17133a = new C2451l();

        C2451l() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLmFwcGxvdmluLmltcGwuc2RrLkFwcExvdmluQnJvYWRjYXN0TWFuYWdlciRSZWNlaXZlcg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$m, reason: case insensitive filesystem */
    static final class C2452m extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2452m f17134a = new C2452m();

        C2452m() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLmFwcGxvdmluLmNvbW11bmljYXRvci5BcHBMb3ZpbkNvbW11bmljYXRvcg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$n, reason: case insensitive filesystem */
    static final class C2453n extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2453n f17135a = new C2453n();

        C2453n() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Y29tLmFwcGxvdmluLmNvbW11bmljYXRvci5BcHBMb3ZpbkNvbW11bmljYXRvclN1YnNjcmliZXI=");
        }
    }

    static final class o extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f17136a = new o();

        o() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("YWRfZm9ybWF0");
        }
    }

    static final class p extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f17137a = new p();

        p() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("bmV0d29ya19uYW1l");
        }
    }

    static final class q extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f17138a = new q();

        q() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cHJlY2lzaW9u");
        }
    }

    static final class r extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f17139a = new r();

        r() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("cmV2ZW51ZQ==");
        }
    }

    static final class s extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f17140a = new s();

        s() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("ZXF1YWxz");
        }
    }

    static final class t extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f17141a = new t();

        t() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Z2V0Q29tbXVuaWNhdG9ySWQ=");
        }
    }

    static final class u extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f17142a = new u();

        u() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Z2V0SW5zdGFuY2U=");
        }
    }

    static final class v extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f17143a = new v();

        v() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Z2V0TWVzc2FnZURhdGE=");
        }
    }

    static final class w extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f17144a = new w();

        w() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("Z2V0VG9waWM=");
        }
    }

    static final class x extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f17145a = new x();

        x() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("aGFzaENvZGU=");
        }
    }

    static final class y extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f17146a = new y();

        y() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("b25NZXNzYWdlUmVjZWl2ZWQ=");
        }
    }

    static final class z extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f17147a = new z();

        z() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return e.a("b25SZWNlaXZl");
        }
    }

    public a(io.bidmachine.analytics.internal.p002a.a aVar) {
        super(aVar);
        this.f17078k = aVar;
        this.f17079l = "mimp";
        this.f17080m = new AtomicBoolean();
        this.f17082o = m.a(N.f17101a);
    }

    private final void L() throws IllegalAccessException, InvocationTargetException {
        if (this.f17080m.compareAndSet(false, true)) {
            K k10 = f17067p;
            M m10 = new M(k10.I());
            C0293a c0293a = C0293a.f17102a;
            c0293a.b(m10.b(), k10.I());
            c0293a.a(m10.b(), k10.I());
            this.f17081n = m10;
        }
    }

    private final L M() {
        return (L) this.f17082o.getValue();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17079l;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(io.bidmachine.analytics.internal.i.a.b bVar) throws IllegalAccessException, InvocationTargetException {
        super.b(bVar);
        L();
        M m10 = this.f17081n;
        if (m10 == null) {
            return;
        }
        m10.a((b) this);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public io.bidmachine.analytics.internal.j.a.b b(Map map) {
        Object obj;
        String string;
        K k10 = f17067p;
        Float fA = io.bidmachine.analytics.internal.E.b.a(map.get(k10.q()));
        if (fA == null || (obj = map.get(k10.o())) == null || (string = obj.toString()) == null) {
            return null;
        }
        return new io.bidmachine.analytics.internal.j.a.b(null, this.f17078k.d().currentTimeMillis(), 0, fA, d(map), string, null, false, 197, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public io.bidmachine.analytics.internal.g.a c(Map map) {
        String string;
        String upperCase;
        K k10 = f17067p;
        Object obj = map.get(k10.n());
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        if (kotlin.jvm.internal.t.a(upperCase, k10.a()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.e()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.d())) {
            return io.bidmachine.analytics.internal.g.a.BANNER;
        }
        if (kotlin.jvm.internal.t.a(upperCase, k10.b()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.c())) {
            return io.bidmachine.analytics.internal.g.a.INTERSTITIAL;
        }
        if (kotlin.jvm.internal.t.a(upperCase, k10.g()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.h()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.i())) {
            return io.bidmachine.analytics.internal.g.a.REWARDED;
        }
        if (kotlin.jvm.internal.t.a(upperCase, k10.f())) {
            return io.bidmachine.analytics.internal.g.a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) throws IllegalAccessException, InvocationTargetException {
        M m10 = this.f17081n;
        if (m10 != null) {
            m10.a(false);
        }
        C0293a.f17102a.b(context, M().b(), f17067p.I());
    }

    @Override // io.bidmachine.analytics.internal.j.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) throws IllegalAccessException, InvocationTargetException {
        super.f(context);
        M m10 = this.f17081n;
        if (m10 != null) {
            m10.a(true);
        }
        C0293a.f17102a.a(context, M().b(), f17067p.I());
    }

    private final g d(Map map) {
        String string;
        String upperCase;
        K k10 = f17067p;
        Object obj = map.get(k10.p());
        if (obj != null && (string = obj.toString()) != null && (upperCase = string.toUpperCase(Locale.US)) != null) {
            if (kotlin.jvm.internal.t.a(upperCase, k10.G()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.F())) {
                return g.PRECISE;
            }
            return kotlin.jvm.internal.t.a(upperCase, k10.E()) ? true : kotlin.jvm.internal.t.a(upperCase, k10.H()) ? g.ESTIMATED : g.ESTIMATED;
        }
        return g.ESTIMATED;
    }
}
