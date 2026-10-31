package io.bidmachine.analytics.internal.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.o0;
import ud.y0;
import ud.y2;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f17222l = new i(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final wc.k f17223m = wc.m.a(d.f17245a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final wc.k f17224n = wc.m.a(e.f17246a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final wc.k f17225o = wc.m.a(f.f17247a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final wc.k f17226p = wc.m.a(C0301b.f17243a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final wc.k f17227q = wc.m.a(h.f17249a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final wc.k f17228r = wc.m.a(c.f17244a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final wc.k f17229s = wc.m.a(g.f17248a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final wc.k f17230t = wc.m.a(a.f17242a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile io.bidmachine.analytics.internal.q.c f17232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f17233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f17234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wc.k f17235e = wc.m.a(o.f17256a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f17236f = wc.m.a(new l());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wc.k f17237g = wc.m.a(new m());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.k f17238h = wc.m.a(new n());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wc.k f17239i = wc.m.a(new p());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wc.k f17240j = wc.m.a(new j());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ServiceConnection f17241k = new q();

    static final class a extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17242a = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("cGxheUJpbGxpbmdMaWJyYXJ5VmVyc2lvbg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.b$b, reason: collision with other inner class name */
    static final class C0301b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0301b f17243a = new C0301b();

        C0301b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("VkVSU0lPTl9OQU1F");
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17244a = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLkluQXBwQmlsbGluZ1NlcnZpY2UuQklORA==");
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17245a = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5CdWlsZENvbmZpZw==");
        }
    }

    static final class e extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f17246a = new e();

        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLmFuZHJvaWQuYmlsbGluZ2NsaWVudC5rdHguQnVpbGRDb25maWc=");
        }
    }

    static final class f extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f17247a = new f();

        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLmdvb2dsZS5hbmRyb2lkLnBsYXkuYmlsbGluZ2NsaWVudC52ZXJzaW9u");
        }
    }

    static final class g extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f17248a = new g();

        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLmFuZHJvaWQudmVuZGluZw==");
        }
    }

    static final class h extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f17249a = new h();

        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.E.e.a("Y29tLmFuZHJvaWQudmVuZGluZy5CSUxMSU5H");
        }
    }

    public static final class i {
        public /* synthetic */ i(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String a() {
            return (String) b.f17230t.getValue();
        }

        public final String b() {
            return (String) b.f17226p.getValue();
        }

        public final String c() {
            return (String) b.f17228r.getValue();
        }

        public final String d() {
            return (String) b.f17223m.getValue();
        }

        public final String e() {
            return (String) b.f17224n.getValue();
        }

        public final String f() {
            return (String) b.f17225o.getValue();
        }

        public final String g() {
            return (String) b.f17229s.getValue();
        }

        public final String h() {
            return (String) b.f17227q.getValue();
        }

        private i() {
        }
    }

    static final class j extends u implements id.a {
        j() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.p002a.e invoke() {
            Object objC;
            io.bidmachine.analytics.internal.p002a.e eVarA;
            b bVar = b.this;
            try {
                r.a aVar = r.f27774b;
                String strP = bVar.p();
                if (strP == null || (eVarA = io.bidmachine.analytics.internal.p002a.e.f16862d.a(strP)) == null) {
                    String strN = bVar.n();
                    eVarA = strN != null ? io.bidmachine.analytics.internal.p002a.e.f16862d.a(strN) : null;
                }
                objC = r.c(eVarA);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            return (io.bidmachine.analytics.internal.p002a.e) (r.k(objC) ? null : objC);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17251a;

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
            return b.this.new k(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f17251a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            while (b.this.f17232b == null) {
                this.f17251a = 1;
                if (y0.a(100L, this) == objF) {
                    return objF;
                }
            }
            io.bidmachine.analytics.internal.q.c cVar = b.this.f17232b;
            if (cVar != null) {
                return cVar.I();
            }
            return null;
        }
    }

    static final class l extends u implements id.a {
        l() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.a(b.f17222l.d());
        }
    }

    static final class m extends u implements id.a {
        m() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.a(b.f17222l.e());
        }
    }

    static final class n extends u implements id.a {
        n() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return b.this.m();
        }
    }

    static final class o extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f17256a = new o();

        o() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final md.d invoke() {
            return md.e.a(System.nanoTime());
        }
    }

    static final class p extends u implements id.a {
        p() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strO = b.this.o();
            if (strO != null) {
                return strO;
            }
            String strN = b.this.n();
            return strN == null ? b.this.p() : strN;
        }
    }

    public static final class q implements ServiceConnection {
        q() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            io.bidmachine.analytics.internal.p002a.e eVarL = b.this.l();
            if (eVarL == null) {
                return;
            }
            b bVar = b.this;
            String strR = bVar.r();
            io.bidmachine.analytics.internal.q.c cVar = null;
            if (strR != null) {
                b bVar2 = b.this;
                cVar = new io.bidmachine.analytics.internal.q.c(new io.bidmachine.analytics.internal.q.d.a(iBinder, null, 2, null), bVar2.f17231a.getPackageName(), eVarL, strR, bVar2.q().g());
            }
            bVar.f17232b = cVar;
            b bVar3 = b.this;
            bVar3.f17233c = bVar3.f17232b != null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f17233c = false;
            b.this.f17232b = null;
        }
    }

    public b(Context context) {
        this.f17231a = context;
    }

    private final Intent k() {
        i iVar = f17222l;
        Intent intent = new Intent(iVar.c());
        intent.setPackage(iVar.g());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m() {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            Bundle bundle = this.f17231a.getPackageManager().getApplicationInfo(this.f17231a.getPackageName(), 128).metaData;
            objC = r.c(bundle != null ? bundle.getString(f17222l.f()) : null);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        return (String) (r.k(objC) ? null : objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.f17236f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return (String) this.f17237g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p() {
        return (String) this.f17238h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final md.d q() {
        return (md.d) this.f17235e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r() {
        return (String) this.f17239i.getValue();
    }

    private final ComponentName s() {
        ServiceInfo serviceInfo;
        List<ResolveInfo> listQueryIntentServices = this.f17231a.getPackageManager().queryIntentServices(k(), 0);
        if (listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            return null;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!t.a(f17222l.g(), str) || str2 == null) {
            return null;
        }
        return new ComponentName(str, str2);
    }

    public final void i() {
        ComponentName componentNameS = s();
        if (componentNameS == null) {
            throw new IllegalArgumentException("Component name not found");
        }
        String strR = r();
        if (strR == null) {
            throw new IllegalArgumentException("Library version not found");
        }
        Context context = this.f17231a;
        Intent intentK = k();
        intentK.setComponent(componentNameS);
        intentK.putExtra(f17222l.a(), strR);
        if (!context.bindService(intentK, this.f17241k, 1)) {
            throw new IllegalStateException("Can't connect");
        }
        this.f17234d = true;
    }

    public final void j() {
        if (this.f17234d) {
            this.f17231a.unbindService(this.f17241k);
        }
        this.f17234d = false;
    }

    public final io.bidmachine.analytics.internal.p002a.e l() {
        return (io.bidmachine.analytics.internal.p002a.e) this.f17240j.getValue();
    }

    public final boolean t() {
        return this.f17231a.getPackageManager().checkPermission(f17222l.h(), this.f17231a.getPackageName()) == 0;
    }

    public final boolean u() {
        return s() != null;
    }

    public final Object a(long j10, zc.f fVar) {
        return y2.c(j10, new k(null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String str) {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            Object obj = Class.forName(str).getField(f17222l.b()).get(null);
            t.d(obj, "null cannot be cast to non-null type kotlin.String");
            objC = r.c((String) obj);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        return (String) (r.k(objC) ? null : objC);
    }
}
