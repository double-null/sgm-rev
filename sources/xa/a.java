package xa;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import pa.s;
import pb.b0;
import qb.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f28266f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f28269i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f28271k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f28267g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f28268h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f28270j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0470a f28261a = new C0470a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f28262b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f28263c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f28264d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f28265e = new AtomicLong(-1);

    /* JADX INFO: renamed from: xa.a$a, reason: collision with other inner class name */
    private class C0470a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f28272a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f28273b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f28274c;

        public C0470a(int i10) {
            this.f28274c = i10;
        }

        private void a() {
            Long lD0 = a.this.d0();
            if (lD0 == null) {
                return;
            }
            long jF = a.this.f();
            if (jF <= 0) {
                return;
            }
            float fLongValue = (lD0.longValue() * 100.0f) / jF;
            int i10 = this.f28273b.get();
            if (fLongValue > (i10 * 25.0f) - 1.0f) {
                if (i10 == 0) {
                    a.this.u();
                } else if (i10 == 1) {
                    a.this.s();
                } else if (i10 == 2) {
                    a.this.t();
                } else if (i10 == 3) {
                    a.this.v();
                } else if (i10 == 4) {
                    a.this.r();
                }
                this.f28273b.incrementAndGet();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.f28273b.set(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            h();
            this.f28272a.set(true);
            h.d(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f28272a.set(false);
            h.c(this);
        }

        @Override // wb.v
        public void p() {
            if (this.f28272a.get()) {
                if (a.this.d()) {
                    a();
                }
                a aVar = a.this;
                aVar.K(aVar.d0());
                h.e(this, this.f28274c);
            }
        }
    }

    private void B(Long l10) {
        this.f28263c.set(true);
        F(g(), l10);
    }

    private void F(boolean z10, Long l10) {
        if (l10 != null) {
            try {
                this.f28271k = l10.longValue();
            } catch (Exception e10) {
                C(e10);
                return;
            }
        }
        if (z10) {
            if (l10 != null) {
                P(l10.longValue());
            }
            o0();
        } else {
            c();
            Uri uri = this.f28269i;
            if (uri != null) {
                Q(uri);
            }
            a();
        }
    }

    private d e0() {
        return this.f28266f;
    }

    private void x() {
        try {
            this.f28270j = j0();
        } catch (Exception unused) {
        }
    }

    protected abstract void A(long j10);

    protected void C(Throwable th) {
        D(b0.a(th));
    }

    protected void D(b0 b0Var) {
        if (this.f28268h) {
            M(b0Var);
        } else {
            S(b0Var);
        }
    }

    protected void E(boolean z10) {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.b(this, z10);
    }

    protected abstract long G();

    protected void H(float f10) {
        W(f10);
        T(f10);
    }

    protected void I(long j10) {
        A(j10);
    }

    protected abstract void J(Uri uri);

    protected void K(Long l10) {
        d dVarE0;
        if (l10 == null || this.f28265e.getAndSet(l10.longValue()) == l10.longValue() || this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.d(this, l10.longValue());
    }

    protected void L(Throwable th) {
        M(b0.a(th));
    }

    protected void M(b0 b0Var) {
        if (this.f28264d.get()) {
            return;
        }
        d dVarE0 = e0();
        if (dVarE0 != null) {
            dVarE0.l(this, b0Var);
        }
        r();
    }

    protected abstract float N();

    protected void O(float f10) {
        z(f10);
    }

    public void P(long j10) {
        try {
            I(j10);
        } catch (Exception unused) {
        }
    }

    protected void Q(Uri uri) {
        J(uri);
    }

    protected void R(Throwable th) {
        S(b0.a(th));
    }

    protected void S(b0 b0Var) {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.h(this, b0Var);
    }

    protected void T(float f10) {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.e(this, f10);
    }

    public void U(float f10) {
        try {
            O(f10);
        } catch (Exception unused) {
        }
    }

    protected abstract boolean V();

    protected void W(float f10) {
        if (f10 == 0.0f && !this.f28267g) {
            this.f28267g = true;
            E(true);
        } else if (this.f28267g) {
            this.f28267g = false;
            E(false);
        }
    }

    protected abstract boolean X();

    protected abstract void Y();

    protected abstract void Z();

    protected void a() {
        a0();
    }

    protected abstract void a0();

    @Override // xa.b
    public void b(d dVar) {
        this.f28266f = dVar;
    }

    protected abstract void b0();

    protected void c() {
        b0();
    }

    protected void c0() {
        this.f28261a.h();
    }

    public boolean d() {
        try {
            return l0();
        } catch (Exception unused) {
            return false;
        }
    }

    public Long d0() {
        try {
            return Long.valueOf(i0());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // xa.b
    public void destroy() {
        this.f28266f = null;
        c0();
    }

    @Override // pa.b0
    public void e() {
        if (!this.f28268h || this.f28264d.get()) {
            return;
        }
        pause();
        P(f());
        j();
    }

    @Override // xa.b
    public long f() {
        return this.f28270j;
    }

    protected void f0() {
        h();
        c0();
    }

    public boolean g() {
        try {
            return m0();
        } catch (Exception unused) {
            return false;
        }
    }

    protected void g0() {
        m();
        w();
    }

    @Override // xa.b
    public float getVolume() {
        try {
            return k0();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    protected void h() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.i(this);
    }

    protected void h0() {
        x();
        if (this.f28263c.compareAndSet(true, false)) {
            F(true, Long.valueOf(this.f28271k));
        }
        o();
    }

    @Override // pa.y
    public void i() {
        try {
            this.f28264d.set(false);
            this.f28261a.d();
            B(0L);
        } catch (Exception e10) {
            L(e10);
        }
    }

    protected long i0() {
        return y();
    }

    protected void j() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.g(this);
    }

    protected long j0() {
        return G();
    }

    @Override // xa.b
    public void k() {
        try {
            a();
        } catch (Exception e10) {
            R(e10);
        }
    }

    protected float k0() {
        return N();
    }

    protected boolean l0() {
        return V();
    }

    protected void m() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.j(this);
    }

    protected boolean m0() {
        return X();
    }

    @Override // xa.b
    public void n() {
        try {
            this.f28268h = true;
            B(this.f28264d.get() ? Long.valueOf(f()) : null);
        } catch (Exception e10) {
            L(e10);
        }
    }

    protected void n0() {
        Y();
    }

    protected void o() {
        d dVarE0;
        if (this.f28262b.compareAndSet(false, true) && (dVarE0 = e0()) != null) {
            dVarE0.c(this);
        }
    }

    protected void o0() {
        Z();
    }

    @Override // pa.v
    public void p(Integer num) {
        U(1.0f);
    }

    @Override // xa.b
    public void pause() {
        try {
            this.f28263c.set(false);
            n0();
            this.f28271k = i0();
        } catch (Exception unused) {
        }
    }

    @Override // pa.v
    public void q(Integer num) {
        U(0.0f);
    }

    protected void r() {
        d dVarE0;
        if (this.f28264d.compareAndSet(false, true) && (dVarE0 = e0()) != null) {
            dVarE0.k(this);
        }
    }

    protected void s() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.a(this);
    }

    protected void t() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.m(this);
    }

    protected void u() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.n(this);
    }

    protected void v() {
        d dVarE0;
        if (this.f28264d.get() || (dVarE0 = e0()) == null) {
            return;
        }
        dVarE0.f(this);
    }

    protected void w() {
        if (this.f28264d.get()) {
            return;
        }
        this.f28261a.f();
    }

    protected abstract long y();

    protected abstract void z(float f10);

    @Override // xa.b
    public void a(Uri uri) {
        try {
            Q(uri);
            this.f28269i = uri;
        } catch (Exception unused) {
        }
    }
}
