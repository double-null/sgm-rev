package io.bidmachine.analytics.internal.k;

import android.content.Context;
import android.os.Bundle;
import id.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b0;
import kotlin.collections.y;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.e2;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.y0;
import wb.e0;
import wc.g0;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.j.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f16979q = new i(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final wc.k f16980r = m.a(d.f16997a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final wc.k f16981s = m.a(c.f16996a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final wc.k f16982t = m.a(b.f16995a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final wc.k f16983u = m.a(C0283a.f16994a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final wc.k f16984v = m.a(h.f17001a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final wc.k f16985w = m.a(f.f16999a);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final wc.k f16986x = m.a(g.f17000a);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final wc.k f16987y = m.a(e.f16998a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f16988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j f16989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f16990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wc.k f16991n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f16992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile Bundle f16993p;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.k.a$a, reason: collision with other inner class name */
    static final class C0283a extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0283a f16994a = new C0283a();

        C0283a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("YW5kcm9pZC5vcy5CdW5kbGU=");
        }
    }

    static final class b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16995a = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLnNhZmVkay5hbmRyb2lkLnV0aWxzLlBlcnNpc3RlbnRDb25jdXJyZW50SGFzaE1hcA==");
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16996a = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLnNhZmVkay5hbmRyb2lkLmFuYWx5dGljcy5TdGF0c0NvbGxlY3Rvcg==");
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f16997a = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            i iVar = a.f16979q;
            return new j(iVar.c(), iVar.b());
        }
    }

    static final class e extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f16998a = new e();

        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("YWRfZm9ybWF0X3R5cGU=");
        }
    }

    static final class f extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f16999a = new f();

        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y2xpY2tfdXJs");
        }
    }

    static final class g extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f17000a = new g();

        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("ZXZlbnRfaWQ=");
        }
    }

    static final class h extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f17001a = new h();

        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("aXNfY2xpY2tlZA==");
        }
    }

    public static final class i {
        public /* synthetic */ i(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String a() {
            return (String) a.f16983u.getValue();
        }

        public final String b() {
            return (String) a.f16982t.getValue();
        }

        public final String c() {
            return (String) a.f16981s.getValue();
        }

        public final j d() {
            return (j) a.f16980r.getValue();
        }

        public final String e() {
            return (String) a.f16987y.getValue();
        }

        public final String f() {
            return (String) a.f16985w.getValue();
        }

        public final String g() {
            return (String) a.f16986x.getValue();
        }

        public final String h() {
            return (String) a.f16984v.getValue();
        }

        private i() {
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17003b;

        public j(String str, String str2) {
            this.f17002a = str;
            this.f17003b = str2;
        }

        public final String a() {
            return this.f17003b;
        }

        public final String b() {
            return this.f17002a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17004a;

        k(zc.f fVar) {
            super(2, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((k) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new k(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jS;
            Object objF = ad.d.f();
            int i10 = this.f17004a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            do {
                Object objM = a.this.m();
                if (r.n(objM)) {
                    sd.a.C0418a c0418a = sd.a.f25407b;
                    jS = sd.c.s(2, sd.d.SECONDS);
                } else {
                    if (r.g(objM) instanceof IllegalStateException) {
                        return g0.f27756a;
                    }
                    sd.a.C0418a c0418a2 = sd.a.f25407b;
                    jS = sd.c.s(30, sd.d.SECONDS);
                }
                this.f17004a = 1;
            } while (y0.b(jS, this) != objF);
            return objF;
        }
    }

    static final class l extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.E.d f17006a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(io.bidmachine.analytics.internal.E.d dVar) {
            super(0);
            this.f17006a = dVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(this.f17006a.b()));
        }
    }

    public /* synthetic */ a(io.bidmachine.analytics.internal.p002a.a aVar, j jVar, io.bidmachine.analytics.internal.E.d dVar, int i10, kotlin.jvm.internal.k kVar) {
        this(aVar, (i10 & 2) != 0 ? f16979q.d() : jVar, (i10 & 4) != 0 ? io.bidmachine.analytics.internal.E.d.f16823g.a() : dVar);
    }

    private final Object l() {
        try {
            r.a aVar = r.f27774b;
            Class<?> cls = Class.forName(this.f16989l.b());
            for (Field field : cls.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == cls) {
                    field.setAccessible(true);
                    r.a aVar2 = r.f27774b;
                    return r.c(field.get(null));
                }
            }
            return r.c(null);
        } catch (Throwable th) {
            r.a aVar3 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f16990m;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    public final o0 k() {
        return (o0) this.f16991n.getValue();
    }

    public final Object m() {
        try {
            r.a aVar = r.f27774b;
            Object objL = l();
            Object obj = r.k(objL) ? null : objL;
            if (obj == null) {
                if (r.k(objL)) {
                    a(io.bidmachine.analytics.internal.g.h.a.MONITOR_INVALID, "Collector not found");
                    return r.c(s.a(new IllegalStateException()));
                }
                a(io.bidmachine.analytics.internal.g.h.a.MONITOR_NO_CONTENT, "Collector disabled");
                return r.c(s.a(new RuntimeException()));
            }
            Object objD = d(obj);
            Object obj2 = r.k(objD) ? null : objD;
            if (obj2 == null) {
                if (!r.k(objD)) {
                    return r.c(g0.f27756a);
                }
                a(io.bidmachine.analytics.internal.g.h.a.MONITOR_INVALID, "List not found");
                return r.c(s.a(new IllegalStateException()));
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
            Iterator it = b0.t0(concurrentHashMap.keySet()).iterator();
            while (it.hasNext()) {
                Object obj3 = concurrentHashMap.get(it.next());
                if (obj3 != null) {
                    Object objC = c(obj3);
                    if (r.k(objC)) {
                        objC = null;
                    }
                    Bundle bundle = (Bundle) objC;
                    if (bundle != null) {
                        a(bundle);
                    }
                }
            }
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(io.bidmachine.analytics.internal.i.a.b bVar) throws ClassNotFoundException {
        super.b(bVar);
        Class.forName(this.f16989l.b());
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public io.bidmachine.analytics.internal.j.a.b b(Map map) {
        String string;
        Boolean boolJ;
        i iVar = f16979q;
        Object obj = map.get(iVar.g());
        if (obj == null || (string = obj.toString()) == null) {
            string = UUID.randomUUID().toString();
        }
        long jCurrentTimeMillis = this.f16988k.d().currentTimeMillis();
        Object obj2 = map.get(iVar.f());
        String string2 = obj2 != null ? obj2.toString() : null;
        Object obj3 = map.get(iVar.h());
        return new io.bidmachine.analytics.internal.j.a.b(string, jCurrentTimeMillis, 0, null, null, null, string2, (obj3 == null || (boolJ = e0.J(obj3, null, 1, null)) == null) ? false : boolJ.booleanValue(), 60, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public io.bidmachine.analytics.internal.g.a c(Map map) {
        String string;
        String upperCase;
        Object obj = map.get(f16979q.e());
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        io.bidmachine.analytics.internal.m.a.K k10 = io.bidmachine.analytics.internal.m.a.f17067p;
        if (t.a(upperCase, k10.a()) ? true : t.a(upperCase, k10.e()) ? true : t.a(upperCase, k10.d())) {
            return io.bidmachine.analytics.internal.g.a.BANNER;
        }
        if (t.a(upperCase, k10.b()) ? true : t.a(upperCase, k10.c())) {
            return io.bidmachine.analytics.internal.g.a.INTERSTITIAL;
        }
        if (t.a(upperCase, k10.g()) ? true : t.a(upperCase, k10.h()) ? true : t.a(upperCase, k10.i())) {
            return io.bidmachine.analytics.internal.g.a.REWARDED;
        }
        if (t.a(upperCase, k10.f())) {
            return io.bidmachine.analytics.internal.g.a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        e2.f(k().q(), null, 1, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        super.f(context);
        ud.k.d(k(), null, null, new k(null), 3, null);
    }

    private final Object d(Object obj) {
        Field field;
        try {
            r.a aVar = r.f27774b;
            Class<?> cls = Class.forName(this.f16989l.a());
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if (!Modifier.isStatic(field.getModifiers()) && cls.isAssignableFrom(field.getType())) {
                    break;
                }
                i10++;
            }
            if (field == null) {
                return r.c(null);
            }
            field.setAccessible(true);
            r.a aVar2 = r.f27774b;
            return r.c(field.get(obj));
        } catch (Throwable th) {
            r.a aVar3 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public a(io.bidmachine.analytics.internal.p002a.a aVar, j jVar, io.bidmachine.analytics.internal.E.d dVar) {
        super(aVar);
        this.f16988k = aVar;
        this.f16989l = jVar;
        this.f16990m = "bic";
        this.f16991n = m.a(new l(dVar));
        this.f16992o = kotlin.collections.t.k();
    }

    private final void a(Bundle bundle) {
        i iVar = f16979q;
        String str = bundle.getString(iVar.g(), "") + '-' + bundle.getBoolean(iVar.h(), false);
        if (this.f16992o.contains(str)) {
            return;
        }
        this.f16993p = bundle;
        List listR0 = b0.r0(this.f16992o);
        listR0.add(str);
        if (listR0.size() > 30) {
            y.B(listR0);
        }
        this.f16992o = b0.p0(listR0);
        a(io.bidmachine.analytics.internal.E.e.a(bundle));
    }

    public final Object c(Object obj) {
        Method method;
        try {
            r.a aVar = r.f27774b;
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Class.forName(f16979q.a());
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getParameterCount() == 0 && cls2.isAssignableFrom(method.getReturnType())) {
                    break;
                }
                i10++;
            }
            if (method == null) {
                for (Method method2 : cls.getMethods()) {
                    if (method2.getParameterCount() == 0 && cls2.isAssignableFrom(method2.getReturnType())) {
                        method = method2;
                        break;
                    }
                }
            }
            if (method == null) {
                return r.c(null);
            }
            method.setAccessible(true);
            Object objInvoke = method.invoke(obj, null);
            r.a aVar2 = r.f27774b;
            return r.c((Bundle) objInvoke);
        } catch (Throwable th) {
            r.a aVar3 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final void a(io.bidmachine.analytics.internal.g.h.a aVar, String str) {
        this.f16993p = null;
        a(new io.bidmachine.analytics.internal.g.h("bic", aVar, str));
    }
}
