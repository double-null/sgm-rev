package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import u7.d0;

/* JADX INFO: compiled from: CompositeMediaSource.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T> extends io.bidmachine.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f19486h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f19487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z7.o f19488j;

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    private final class a implements s, io.bidmachine.media3.exoplayer.drm.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f19489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s.a f19490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.drm.h.a f19491c;

        public a(T t10) {
            this.f19490b = c.this.u(null);
            this.f19491c = c.this.s(null);
            this.f19489a = t10;
        }

        private boolean a(int i10, r.b bVar) {
            r.b bVarD;
            if (bVar != null) {
                bVarD = c.this.D(this.f19489a, bVar);
                if (bVarD == null) {
                    return false;
                }
            } else {
                bVarD = null;
            }
            int iF = c.this.F(this.f19489a, i10);
            s.a aVar = this.f19490b;
            if (aVar.f19689a != iF || !Objects.equals(aVar.f19690b, bVarD)) {
                this.f19490b = c.this.t(iF, bVarD);
            }
            io.bidmachine.media3.exoplayer.drm.h.a aVar2 = this.f19491c;
            if (aVar2.f18576a == iF && Objects.equals(aVar2.f18577b, bVarD)) {
                return true;
            }
            this.f19491c = c.this.r(iF, bVarD);
            return true;
        }

        private n8.j c(n8.j jVar, r.b bVar) {
            long jE = c.this.E(this.f19489a, jVar.f22791f, bVar);
            long jE2 = c.this.E(this.f19489a, jVar.f22792g, bVar);
            return (jE == jVar.f22791f && jE2 == jVar.f22792g) ? jVar : new n8.j(jVar.f22786a, jVar.f22787b, jVar.f22788c, jVar.f22789d, jVar.f22790e, jE, jE2);
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void K(int i10, r.b bVar, n8.j jVar) {
            if (a(i10, bVar)) {
                this.f19490b.G(c(jVar, bVar));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void R(int i10, r.b bVar, n8.i iVar, n8.j jVar, int i11) {
            if (a(i10, bVar)) {
                this.f19490b.D(iVar, c(jVar, bVar), i11);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void T(int i10, r.b bVar, n8.i iVar, n8.j jVar) {
            if (a(i10, bVar)) {
                this.f19490b.u(iVar, c(jVar, bVar));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void U(int i10, r.b bVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f19490b.A(iVar, c(jVar, bVar), iOException, z10);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void Z(int i10, r.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f19491c.k(i11);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void b0(int i10, r.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f19491c.l(exc);
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void f0(int i10, r.b bVar, n8.i iVar, n8.j jVar) {
            if (a(i10, bVar)) {
                this.f19490b.x(iVar, c(jVar, bVar));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void k0(int i10, r.b bVar) {
            if (a(i10, bVar)) {
                this.f19491c.i();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void l0(int i10, r.b bVar) {
            if (a(i10, bVar)) {
                this.f19491c.m();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void m0(int i10, r.b bVar) {
            if (a(i10, bVar)) {
                this.f19491c.j();
            }
        }

        @Override // io.bidmachine.media3.exoplayer.source.s
        public void o0(int i10, r.b bVar, n8.j jVar) {
            if (a(i10, bVar)) {
                this.f19490b.k(c(jVar, bVar));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.drm.h
        public void p0(int i10, r.b bVar) {
            if (a(i10, bVar)) {
                this.f19491c.h();
            }
        }
    }

    /* JADX INFO: compiled from: CompositeMediaSource.java */
    private static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f19493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.c f19494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>.a f19495c;

        public b(r rVar, r.c cVar, c<T>.a aVar) {
            this.f19493a = rVar;
            this.f19494b = cVar;
            this.f19495c = aVar;
        }
    }

    protected c() {
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void B() {
        for (b<T> bVar : this.f19486h.values()) {
            bVar.f19493a.g(bVar.f19494b);
            bVar.f19493a.q(bVar.f19495c);
            bVar.f19493a.b(bVar.f19495c);
        }
        this.f19486h.clear();
    }

    protected abstract r.b D(T t10, r.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract void G(T t10, r rVar, u7.d0 d0Var);

    protected final void I(final T t10, r rVar) {
        x7.a.a(!this.f19486h.containsKey(t10));
        r.c cVar = new r.c() { // from class: n8.c
            @Override // io.bidmachine.media3.exoplayer.source.r.c
            public final void a(io.bidmachine.media3.exoplayer.source.r rVar2, d0 d0Var) {
                this.f22770a.G(t10, rVar2, d0Var);
            }
        };
        a aVar = new a(t10);
        this.f19486h.put(t10, new b<>(rVar, cVar, aVar));
        rVar.p((Handler) x7.a.e(this.f19487i), aVar);
        rVar.i((Handler) x7.a.e(this.f19487i), aVar);
        rVar.h(cVar, this.f19488j, x());
        if (y()) {
            return;
        }
        rVar.o(cVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void j() throws IOException {
        Iterator<b<T>> it = this.f19486h.values().iterator();
        while (it.hasNext()) {
            it.next().f19493a.j();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void v() {
        for (b<T> bVar : this.f19486h.values()) {
            bVar.f19493a.o(bVar.f19494b);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void w() {
        for (b<T> bVar : this.f19486h.values()) {
            bVar.f19493a.f(bVar.f19494b);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void z(z7.o oVar) {
        this.f19488j = oVar;
        this.f19487i = x7.l0.A();
    }

    protected int F(T t10, int i10) {
        return i10;
    }

    protected long E(T t10, long j10, r.b bVar) {
        return j10;
    }
}
