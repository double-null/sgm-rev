package db;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import id.l;
import id.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pb.i1;
import pb.q;
import pb.s;
import ud.e1;
import ud.n0;
import ud.p0;
import ud.t2;
import wc.g0;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f13487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final db.b f13488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f13489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f13490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f13491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f13492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f13493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f13494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f13495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f13496l;

    /* JADX INFO: renamed from: db.a$a, reason: collision with other inner class name */
    private static final class C0177a extends dc.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final eb.a f13497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f13498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p f13499d;

        public C0177a(eb.a algorithm, Bitmap image, p callback) {
            t.f(algorithm, "algorithm");
            t.f(image, "image");
            t.f(callback, "callback");
            this.f13497b = algorithm;
            this.f13498c = image;
            this.f13499d = callback;
        }

        @Override // dc.b
        public void d() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Boolean boolG = this.f13497b.g(this.f13498c);
            if (boolG != null) {
                this.f13499d.invoke(this, new q(boolG.booleanValue(), this.f13497b.d(), System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                this.f13499d.invoke(this, null);
            }
        }
    }

    private static final class b extends dc.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f13500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f13501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f13502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l f13503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ec.a f13504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f13505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f13506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f13507i;

        /* JADX INFO: renamed from: db.a$b$a, reason: collision with other inner class name */
        private final class C0178a implements kb.b {
            public C0178a() {
            }

            @Override // kb.b
            public void a(Bitmap bitmap) {
                t.f(bitmap, "bitmap");
                b.this.e(bitmap);
            }

            @Override // kb.b
            public void a() {
                b.this.m();
            }
        }

        /* JADX INFO: renamed from: db.a$b$b, reason: collision with other inner class name */
        static final class C0179b extends u implements p {
            C0179b() {
                super(2);
            }

            public final void b(C0177a algorithmTask, q qVar) {
                t.f(algorithmTask, "algorithmTask");
                b.this.g(algorithmTask, qVar);
            }

            @Override // id.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C0177a) obj, (q) obj2);
                return g0.f27756a;
            }
        }

        public b(View view, Handler screenshotCallbackHandler, double d10, List algorithms, l callback) {
            t.f(view, "view");
            t.f(screenshotCallbackHandler, "screenshotCallbackHandler");
            t.f(algorithms, "algorithms");
            t.f(callback, "callback");
            this.f13500b = screenshotCallbackHandler;
            this.f13501c = d10;
            this.f13502d = algorithms;
            this.f13503e = callback;
            this.f13504f = new ec.a(p0.a(new n0("DetectorTaskManager").z(t2.b(null, 1, null)).z(e1.a())));
            this.f13505g = new WeakReference(view);
            this.f13506h = new CopyOnWriteArrayList();
            this.f13507i = new CopyOnWriteArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(Bitmap bitmap) {
            if (!k()) {
                wb.k.g(bitmap);
                return;
            }
            Bitmap bitmapA = wb.k.a(bitmap, this.f13501c);
            if (!t.a(bitmapA, bitmap)) {
                wb.k.g(bitmap);
            }
            if (!k()) {
                wb.k.g(bitmap);
                return;
            }
            List list = this.f13502d;
            ArrayList<C0177a> arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0177a((eb.a) it.next(), bitmapA, new C0179b()));
            }
            this.f13506h.addAll(arrayList);
            for (C0177a c0177a : arrayList) {
                if (!this.f13504f.c(c0177a)) {
                    f(c0177a);
                }
            }
        }

        private final void f(C0177a c0177a) {
            this.f13506h.remove(c0177a);
            if (this.f13506h.isEmpty()) {
                l();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C0177a c0177a, q qVar) {
            if (qVar != null) {
                this.f13507i.add(qVar);
            }
            f(c0177a);
        }

        private final boolean k() {
            return !c();
        }

        private final void l() {
            if (k()) {
                this.f13503e.invoke(this.f13507i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m() {
            l();
        }

        @Override // dc.b, wb.b
        public void a(boolean z10) {
            super.a(z10);
            if (z10) {
                Iterator it = this.f13506h.iterator();
                while (it.hasNext()) {
                    this.f13504f.a((C0177a) it.next());
                }
                this.f13506h.clear();
            }
        }

        @Override // dc.b
        public void d() {
            View view = (View) this.f13505g.get();
            if (view == null) {
                return;
            }
            kb.a.f21299a.a(view, this.f13500b, Bitmap.Config.ARGB_8888, new C0178a());
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f13510d = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final fc.b invoke() {
            HandlerThread handlerThread = new HandlerThread("BrokenCreativeDetectorTaskManager");
            handlerThread.start();
            return new fc.b(new Handler(handlerThread.getLooper()));
        }
    }

    static final class d extends u implements l {
        d() {
            super(1);
        }

        public final void a(List it) {
            t.f(it, "it");
            a.this.c(it);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return g0.f27756a;
        }
    }

    public a(int i10, String adElementName, s brokenCreativeDetectorParams, db.b brokenCreativeDetectorListener) {
        t.f(adElementName, "adElementName");
        t.f(brokenCreativeDetectorParams, "brokenCreativeDetectorParams");
        t.f(brokenCreativeDetectorListener, "brokenCreativeDetectorListener");
        this.f13485a = i10;
        this.f13486b = adElementName;
        this.f13487c = brokenCreativeDetectorParams;
        this.f13488d = brokenCreativeDetectorListener;
        this.f13489e = m.a(c.f13510d);
        this.f13490f = new CopyOnWriteArrayList();
        this.f13491g = new AtomicBoolean(false);
        this.f13492h = new AtomicBoolean(false);
        this.f13493i = new AtomicBoolean(false);
        this.f13494j = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List list) {
        if (e()) {
            Iterator it = list.iterator();
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                float fC = qVar.a().c();
                if (qVar.c()) {
                    d11 += (double) fC;
                }
                d10 += (double) fC;
            }
            boolean z10 = (d10 != 0.0d ? d11 / d10 : 0.0d) >= this.f13487c.e();
            if (!this.f13487c.g() || z10) {
                pb.t tVar = new pb.t(db.c.f13512a.a(z10), this.f13485a, this.f13486b, System.currentTimeMillis() - this.f13495k, list);
                if (this.f13487c.f() || !this.f13490f.contains(tVar)) {
                    this.f13490f.add(tVar);
                    d(tVar);
                }
            }
            i1 i1VarC = this.f13487c.c();
            if (!(i1VarC == i1.ValidCreative && z10) && ((i1VarC != i1.BrokenCreative || z10) && i1VarC != i1.Never)) {
                this.f13493i.set(true);
            } else {
                l();
            }
        }
    }

    private final void d(pb.t tVar) {
        if (e()) {
            pa.t.g("BrokenCreativeDetector", "Notify detector result: %s", tVar);
            this.f13488d.i(tVar);
        }
    }

    private final boolean e() {
        return (!j() || k() || i()) ? false : true;
    }

    private final void f() {
        synchronized (this.f13494j) {
            b bVar = this.f13496l;
            if (bVar != null) {
                h().a(bVar);
            }
        }
    }

    private final fc.b h() {
        return (fc.b) this.f13489e.getValue();
    }

    private final boolean i() {
        return this.f13492h.get();
    }

    private final boolean j() {
        return this.f13491g.get();
    }

    private final boolean k() {
        return this.f13493i.get();
    }

    private final void l() {
        synchronized (this.f13494j) {
            f();
            if (e()) {
                b bVar = this.f13496l;
                if (bVar != null) {
                    h().b(bVar, this.f13487c.d());
                }
            }
        }
    }

    public final void a(View view) {
        t.f(view, "view");
        if (k() || i()) {
            return;
        }
        synchronized (this.f13494j) {
            if (this.f13491g.compareAndSet(false, true)) {
                List<pb.p> listA = this.f13487c.a();
                ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(eb.b.f14517a.a((pb.p) it.next()));
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f13495k = System.currentTimeMillis();
                this.f13496l = new b(view, h().g(), this.f13487c.b(), arrayList, new d());
                l();
                g0 g0Var = g0.f27756a;
            }
        }
    }

    public final void g() {
        this.f13492h.set(true);
        m();
    }

    public final void m() {
        synchronized (this.f13494j) {
            this.f13491g.set(false);
            f();
            this.f13496l = null;
            g0 g0Var = g0.f27756a;
        }
    }
}
