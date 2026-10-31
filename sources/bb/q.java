package bb;

import android.content.Context;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import pb.a1;
import pb.v0;
import wb.d0;

/* JADX INFO: loaded from: classes5.dex */
public class q implements bb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wb.y f4419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pb.c f4421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f4422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ab.c f4423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lb.a f4424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Queue f4425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f4426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f4427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f4428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f4429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    mb.l f4430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile t f4431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile t f4432n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4433a;

        static {
            int[] iArr = new int[pb.u.values().length];
            f4433a = iArr;
            try {
                iArr[pb.u.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4433a[pb.u.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4433a[pb.u.StreamLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class b implements u {
        b() {
        }

        @Override // bb.u
        public void k(t tVar, pb.b0 b0Var) {
            pa.t.b(q.this.f4419a, "onAdPhaseFailToLoad (%s) - %s", tVar, b0Var);
            q.this.C(tVar);
            if (!q.this.P()) {
                q.this.v(b0Var);
                return;
            }
            if (!q.this.f4424f.c()) {
                q.this.S();
                return;
            }
            q.this.y(tVar, new pb.b0("Fail to load after show (CacheType - " + q.this.I() + ") - " + b0Var));
        }

        @Override // bb.u
        public void l(t tVar) {
            pa.t.g(q.this.f4419a, "onAdPhaseLoaded (%s)", tVar);
            if (q.this.O()) {
                q.this.a0();
                q.this.T();
            }
        }
    }

    private class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f4435a;

        public c(r rVar) {
            this.f4435a = rVar;
        }

        @Override // bb.v
        public void a() {
            q.this.G();
        }

        @Override // bb.v
        public void b() {
            q.this.V();
        }

        @Override // bb.v
        public void c() {
            q.this.W();
        }

        @Override // bb.v
        public void d() {
            this.f4435a.d();
        }

        @Override // bb.v
        public void e() {
            if (!q.this.N()) {
                a();
            } else {
                q.this.a0();
                q.this.b0();
            }
        }

        @Override // bb.v
        public void f() {
            this.f4435a.f();
        }

        @Override // bb.v
        public void g() {
            this.f4435a.onAdClicked();
        }

        @Override // bb.v
        public void i(pb.t tVar) {
            q.this.s(tVar);
        }

        @Override // bb.v
        public void j(a1 a1Var) {
            this.f4435a.j(a1Var);
        }
    }

    private class d implements mb.l.c {
        private d() {
        }

        @Override // mb.l.c
        public void a() {
            q.this.U();
        }

        @Override // mb.l.c
        public void b() {
            q.this.Y();
        }

        @Override // mb.l.c
        public void i(pb.t tVar) {
            q.this.s(tVar);
        }

        /* synthetic */ d(q qVar, a aVar) {
            this();
        }
    }

    public q(Context context, pb.c cVar, r rVar, ab.c cVar2) {
        wb.y yVar = new wb.y("AdController");
        this.f4419a = yVar;
        this.f4424f = new lb.d(yVar.toString());
        this.f4420b = context.getApplicationContext();
        this.f4421c = cVar;
        this.f4422d = rVar;
        this.f4423e = cVar2;
        this.f4425g = new ConcurrentLinkedQueue();
        this.f4426h = new AtomicBoolean(false);
        this.f4427i = new AtomicBoolean(false);
        this.f4428j = new AtomicBoolean(false);
        this.f4429k = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(final t tVar) {
        pa.s sVar = new pa.s() { // from class: bb.g
            @Override // wb.v
            public final void p() {
                this.f4407a.C(tVar);
            }
        };
        tVar.b(true);
        this.f4423e.e(tVar.d(), pb.f.Disappear, false, null, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(t tVar) {
        o(tVar, this.f4432n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        final r rVar = this.f4422d;
        Objects.requireNonNull(rVar);
        pa.s sVar = new pa.s() { // from class: bb.h
            @Override // wb.v
            public final void p() {
                rVar.a();
            }
        };
        t tVar = this.f4431m;
        if (tVar == null) {
            sVar.run();
        } else {
            tVar.b(true);
            this.f4423e.e(tVar.d(), pb.f.Disappear, false, null, sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void F(t tVar) {
        tVar.c();
        M(tVar);
    }

    private void M(t tVar) {
        if (this.f4424f.h()) {
            tVar.a(true);
        }
        if (this.f4424f.n()) {
            tVar.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        d0.r(this.f4431m, new wb.i() { // from class: bb.k
            @Override // wb.i
            public final void execute(Object obj) {
                this.f4413a.E((t) obj);
            }
        });
    }

    private void o(final t tVar, t tVar2) {
        d0.r(tVar2, new wb.i() { // from class: bb.e
            @Override // wb.i
            public final void execute(Object obj) {
                this.f4404a.A((t) obj);
            }
        });
        this.f4423e.e(tVar.d(), pb.f.Appear, false, null, new pa.s() { // from class: bb.f
            @Override // wb.v
            public final void p() {
                this.f4405a.F(tVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(t tVar, pb.b0 b0Var) {
        this.f4422d.k(tVar, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(id.a aVar) {
        ((xb.a) aVar.invoke()).J(this.f4419a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(pb.d dVar) {
        if (this.f4430l != null) {
            return;
        }
        mb.l lVar = new mb.l(this.f4420b, dVar, this.f4423e);
        this.f4430l = lVar;
        lVar.setListener(new d(this, null));
        this.f4430l.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(boolean z10, t tVar) {
        if (z10 && this.f4424f.f()) {
            b0();
            this.f4422d.p(this);
        }
        if (z10) {
            return;
        }
        this.f4424f.j();
    }

    pb.u I() {
        return this.f4421c.c();
    }

    boolean J(t tVar) {
        return this.f4425g.remove(tVar);
    }

    t K() {
        return (t) this.f4425g.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void C(t tVar) {
        pa.t.g(this.f4419a, "removeAndDestroyAdPhaseController (%s)", tVar);
        d0.r(tVar, new wb.i() { // from class: bb.i
            @Override // wb.i
            public final void execute(Object obj) {
                this.f4410a.J((t) obj);
            }
        });
        x(tVar);
    }

    boolean N() {
        return K() != null;
    }

    boolean O() {
        Iterator it = this.f4425g.iterator();
        while (it.hasNext()) {
            if (!((t) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public boolean P() {
        return this.f4424f.a();
    }

    void Q() {
        if (this.f4426h.compareAndSet(false, true)) {
            for (t tVar : this.f4425g) {
                pa.t.g(this.f4419a, "loadAdPhase (%s)", tVar);
                tVar.b();
            }
        }
    }

    void R() {
        final pb.d dVarE = this.f4421c.e();
        qb.h.d(new pa.s() { // from class: bb.j
            @Override // wb.v
            public final void p() {
                this.f4411a.r(dVarE);
            }
        });
    }

    void S() {
        if (this.f4424f.r()) {
            this.f4422d.q(this);
        }
    }

    boolean T() {
        if (!this.f4424f.a(true)) {
            return false;
        }
        this.f4422d.r(this);
        return true;
    }

    void U() {
        this.f4422d.h();
    }

    void V() {
        if (this.f4429k.compareAndSet(true, false)) {
            this.f4422d.b();
        }
    }

    void W() {
        if (this.f4429k.compareAndSet(false, true)) {
            this.f4422d.c();
        }
    }

    void X() {
        mb.l lVar = this.f4430l;
        if (lVar != null && this.f4428j.compareAndSet(true, false)) {
            lVar.s();
            this.f4422d.m(lVar);
        }
    }

    void Y() {
        T();
    }

    void Z() {
        mb.l lVar = this.f4430l;
        if (lVar != null && this.f4428j.compareAndSet(false, true)) {
            this.f4422d.o(lVar);
            lVar.t();
        }
    }

    void a0() {
        if (this.f4427i.compareAndSet(false, true)) {
            this.f4422d.g();
            this.f4432n = this.f4431m;
            t tVarK = K();
            if (tVarK == null) {
                y(this.f4432n, this.f4432n == null ? new pb.b0("No ad phase to show") : null);
            } else {
                if (this.f4432n != tVarK) {
                    J(tVarK);
                    tVarK.c(new c(this.f4422d));
                    this.f4431m = tVarK;
                    this.f4423e.a(tVarK.d(), pb.f.Appear);
                }
                this.f4422d.l(tVarK);
                X();
            }
            this.f4427i.set(false);
        }
    }

    @Override // bb.a
    public void d() {
        pa.t.g(this.f4419a, "performHide", new Object[0]);
        d0.r(this.f4431m, new wb.i() { // from class: bb.b
            @Override // wb.i
            public final void execute(Object obj) {
                ((t) obj).b(false);
            }
        });
        X();
    }

    @Override // bb.a
    public void destroy() {
        pa.t.g(this.f4419a, "destroy", new Object[0]);
        this.f4423e.a();
        x(this.f4431m);
        Iterator it = this.f4425g.iterator();
        while (it.hasNext()) {
            x((t) it.next());
        }
        n();
        d0.r(this.f4430l, new wb.i() { // from class: bb.o
            @Override // wb.i
            public final void execute(Object obj) {
                ((mb.l) obj).j();
            }
        });
        this.f4430l = null;
        d0.r(la.f.b(), new wb.i() { // from class: bb.p
            @Override // wb.i
            public final void execute(Object obj) {
                this.f4418a.q((id.a) obj);
            }
        });
        this.f4424f.destroy();
    }

    @Override // bb.a
    public void e() {
        pa.t.g(this.f4419a, "onCollapsed", new Object[0]);
        d0.r(this.f4431m, new wb.i() { // from class: bb.c
            @Override // wb.i
            public final void execute(Object obj) {
                ((t) obj).e();
            }
        });
    }

    @Override // bb.a
    public v0 g() {
        return this.f4421c.d();
    }

    void n() {
        this.f4425g.clear();
    }

    void s(pb.t tVar) {
        if (this.f4424f.i()) {
            return;
        }
        this.f4422d.i(tVar);
    }

    public String toString() {
        return this.f4419a.toString();
    }

    boolean u(t tVar) {
        return this.f4425g.add(tVar);
    }

    boolean v(pb.b0 b0Var) {
        if (!this.f4424f.a(false)) {
            return false;
        }
        this.f4422d.n(this, b0Var);
        return true;
    }

    void x(t tVar) {
        pa.t.g(this.f4419a, "destroyAdPhaseController (%s)", tVar);
        d0.r(tVar, new wb.i() { // from class: bb.d
            @Override // wb.i
            public final void execute(Object obj) {
                ((t) obj).destroy();
            }
        });
        if (this.f4431m == tVar) {
            this.f4431m = null;
        }
        if (this.f4432n == tVar) {
            this.f4432n = null;
        }
    }

    void y(final t tVar, pb.b0 b0Var) {
        d0.r(b0Var, new wb.i() { // from class: bb.n
            @Override // wb.i
            public final void execute(Object obj) {
                this.f4416a.p(tVar, (pb.b0) obj);
            }
        });
        G();
    }

    @Override // bb.a
    public void a(final boolean z10) {
        pa.t.g(this.f4419a, "onShown (isViewability - %s)", Boolean.valueOf(z10));
        d0.r(this.f4431m, new wb.i() { // from class: bb.m
            @Override // wb.i
            public final void execute(Object obj) {
                this.f4414a.t(z10, (t) obj);
            }
        });
    }

    @Override // bb.a
    public void b() {
        pa.t.g(this.f4419a, "load (cacheType - %s)", I());
        Queue<pb.d> queueA = this.f4421c.a();
        if (queueA.isEmpty()) {
            this.f4422d.n(this, new pb.b0("Ad phase queue is empty"));
            return;
        }
        if (P()) {
            this.f4422d.r(this);
            return;
        }
        if (this.f4424f.b()) {
            for (pb.d dVar : queueA) {
                wb.y yVar = new wb.y("AdPhaseController");
                u(new b0(this.f4420b, dVar, this.f4419a, yVar, new lb.c(yVar.toString(), pa.h.j()), new b(), this.f4423e));
            }
            int i10 = a.f4433a[I().ordinal()];
            if (i10 == 1) {
                Q();
                return;
            }
            if (i10 == 2) {
                R();
                Q();
            } else {
                if (i10 != 3) {
                    return;
                }
                R();
            }
        }
    }

    @Override // bb.a
    public boolean c() {
        pa.t.g(this.f4419a, "performShow", new Object[0]);
        this.f4424f.s();
        t tVar = this.f4431m;
        if (tVar == null) {
            Z();
            Q();
            return false;
        }
        if (!this.f4424f.h()) {
            return true;
        }
        F(tVar);
        return true;
    }

    @Override // bb.a
    public void f() {
        pa.t.g(this.f4419a, "onExpanded", new Object[0]);
        d0.r(this.f4431m, new wb.i() { // from class: bb.l
            @Override // wb.i
            public final void execute(Object obj) {
                ((t) obj).f();
            }
        });
    }
}
