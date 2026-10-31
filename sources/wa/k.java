package wa;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.t;
import pa.s;
import pb.b0;
import pb.b1;
import pb.c1;
import pb.k1;
import pb.r0;
import wc.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends qa.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ob.h f27675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private xa.b f27676t;

    public final class a implements xa.d {
        public a() {
        }

        @Override // xa.d
        public void a(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.q();
            }
            k.this.u().m();
        }

        @Override // xa.d
        public void b(xa.b player, boolean z10) {
            t.f(player, "player");
            View viewO = k.this.o();
            Integer numValueOf = viewO != null ? Integer.valueOf(viewO.getId()) : null;
            if (z10) {
                k.this.u().q(numValueOf);
            } else {
                k.this.u().p(numValueOf);
            }
        }

        @Override // xa.d
        public void c(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.u(player.l());
            }
            k.this.E().e(k.this);
        }

        @Override // xa.d
        public void d(xa.b player, long j10) {
            t.f(player, "player");
            k.this.u().u(player.f(), j10);
        }

        @Override // xa.d
        public void e(xa.b player, float f10) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.b0(f10);
            }
        }

        @Override // xa.d
        public void f(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.E();
            }
            k.this.u().c();
        }

        @Override // xa.d
        public void g(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.J();
            }
            k.this.u().e();
        }

        @Override // xa.d
        public void h(xa.b player, b0 error) {
            t.f(player, "player");
            t.f(error, "error");
            k.this.Z(error);
        }

        @Override // xa.d
        public void i(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.r();
            }
            k.this.u().h();
        }

        @Override // xa.d
        public void j(xa.b player) {
            t.f(player, "player");
            k.this.x();
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.W();
            }
            k.this.u().b();
        }

        @Override // xa.d
        public void k(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.L();
            }
            k.this.u().a();
        }

        @Override // xa.d
        public void l(xa.b player, b0 error) {
            t.f(player, "player");
            t.f(error, "error");
            k.this.f0(error);
        }

        @Override // xa.d
        public void m(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.c0();
            }
            k.this.u().i();
        }

        @Override // xa.d
        public void n(xa.b player) {
            t.f(player, "player");
            ob.h hVar = k.this.f27675s;
            if (hVar != null) {
                hVar.S(player.f(), player.getVolume());
            }
            k.this.u().r();
        }
    }

    public final class b implements la.g.a {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(k this$0, Uri uri) {
            t.f(this$0, "this$0");
            t.f(uri, "$uri");
            try {
                xa.b bVar = this$0.f27676t;
                if (bVar != null) {
                    bVar.a(uri);
                    bVar.k();
                }
            } catch (Throwable th) {
                pa.t.i(th);
                this$0.Z(b0.f23943b.a(th));
            }
        }

        @Override // la.g.a
        public void a(b0 error) {
            t.f(error, "error");
            k.this.Z(error);
        }

        @Override // la.g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Uri uri) {
            t.f(uri, "uri");
            final k kVar = k.this;
            qb.h.d(new Runnable() { // from class: wa.l
                @Override // java.lang.Runnable
                public final void run() {
                    k.b.c(kVar, uri);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, Object assetsHolder, la.g repository, pb.a adElementParams, qa.c adFormListener, fb.b eventCallback, db.a aVar, ob.h hVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        this.f27675s = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(b0 b0Var) {
        ob.h hVar = this.f27675s;
        if (hVar != null) {
            hVar.a(b0Var);
        }
        E().c(this, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(k this$0, ViewGroup rootContainer) {
        t.f(this$0, "this$0");
        t.f(rootContainer, "$rootContainer");
        xa.b bVar = this$0.f27676t;
        ob.h hVar = this$0.f27675s;
        if (hVar == null || bVar == null) {
            return;
        }
        hVar.R(bVar.l(), rootContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(k this$0, Integer num) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.q(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(k this$0, String str) {
        t.f(this$0, "this$0");
        try {
            xa.b bVarA = xa.c.a(this$0.G(), str);
            bVarA.b(this$0.new a());
            ob.h hVar = this$0.f27675s;
            if (hVar != null) {
                hVar.T(bVarA.l());
            }
            this$0.f27676t = bVarA;
        } catch (Throwable th) {
            pa.t.i(th);
            this$0.Z(b0.f23943b.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(b0 b0Var) {
        ob.h hVar = this.f27675s;
        if (hVar != null) {
            hVar.a(b0Var);
        }
        E().a(this, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(k this$0, Integer num) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.p(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(k this$0) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.destroy();
        }
        this$0.f27676t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(k this$0) {
        t.f(this$0, "this$0");
        this$0.X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(k this$0) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(k this$0) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(k this$0) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(k this$0) {
        t.f(this$0, "this$0");
        xa.b bVar = this$0.f27676t;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // qa.a
    public View J() {
        xa.b bVar = this.f27676t;
        if (bVar != null) {
            return bVar.l();
        }
        return null;
    }

    @Override // qa.a
    protected void L() {
        g0 g0Var;
        ob.h hVar = this.f27675s;
        if (hVar != null) {
            hVar.i(new s() { // from class: wa.i
                @Override // wb.v
                public final void p() {
                    k.k0(this.f27673a);
                }
            });
            g0Var = g0.f27756a;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            X();
        }
    }

    public final void X() {
        qb.h.d(new s() { // from class: wa.j
            @Override // wb.v
            public final void p() {
                k.j0(this.f27674a);
            }
        });
    }

    @Override // pa.d0, pa.g
    public void a() {
        e();
    }

    @Override // pa.d
    public void b() {
        b1 b1VarL = g().l();
        List<String> listE = null;
        c1 c1VarA = b1VarL != null ? b1VarL.a() : null;
        if (c1VarA == null) {
            String strN = g().n();
            if (strN != null) {
                listE = kotlin.collections.s.e(strN);
            }
        } else if (c1VarA instanceof k1) {
            listE = ((k1) c1VarA).a();
        } else {
            C("Invalid resource type (" + c1VarA.getClass().getSimpleName() + "), it should be UrlResourceSource");
        }
        r0 r0VarE = r0.f24202b.e(listE == null ? kotlin.collections.t.k() : listE);
        if (r0VarE != null) {
            final String strE = r0VarE.a() == r0.b.STREAM ? "exo" : g().e("player");
            qb.h.d(new Runnable() { // from class: wa.c
                @Override // java.lang.Runnable
                public final void run() {
                    k.c0(this.f27664a, strE);
                }
            });
            I().b(r0VarE, H(), new b());
        } else {
            Z(new b0("Invalid adm url (" + listE + ')'));
        }
    }

    @Override // qa.a, pa.d
    public void c() {
        qb.h.d(new s() { // from class: wa.f
            @Override // wb.v
            public final void p() {
                k.m0(this.f27669a);
            }
        });
    }

    @Override // qa.a, pa.d
    public void d() {
        super.d();
        qb.h.d(new s() { // from class: wa.g
            @Override // wb.v
            public final void p() {
                k.l0(this.f27670a);
            }
        });
    }

    @Override // pa.d0, pa.b0
    public void e() {
        qb.h.d(new s() { // from class: wa.b
            @Override // wb.v
            public final void p() {
                k.o0(this.f27663a);
            }
        });
    }

    @Override // pa.d
    public void f(final ViewGroup rootContainer) {
        t.f(rootContainer, "rootContainer");
        qb.h.d(new s() { // from class: wa.h
            @Override // wb.v
            public final void p() {
                k.a0(this.f27671a, rootContainer);
            }
        });
    }

    @Override // pa.d0, pa.y
    public void i() {
        qb.h.d(new s() { // from class: wa.e
            @Override // wb.v
            public final void p() {
                k.n0(this.f27668a);
            }
        });
    }

    @Override // pa.d0, pa.v
    public void p(final Integer num) {
        qb.h.d(new s() { // from class: wa.d
            @Override // wb.v
            public final void p() {
                k.g0(this.f27666a, num);
            }
        });
    }

    @Override // pa.d0, pa.v
    public void q(final Integer num) {
        qb.h.d(new s() { // from class: wa.a
            @Override // wb.v
            public final void p() {
                k.b0(this.f27661a, num);
            }
        });
    }

    @Override // pa.d0
    public void w() {
        ob.h hVar = this.f27675s;
        if (hVar != null) {
            hVar.onClicked();
        }
        super.w();
    }

    @Override // qa.a
    public void x() {
        super.x();
        ob.h hVar = this.f27675s;
        if (hVar != null) {
            hVar.onShown();
        }
    }
}
