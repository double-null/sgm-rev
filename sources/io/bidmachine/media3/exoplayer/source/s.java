package io.bidmachine.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface s {

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f19690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0328a> f19691c;

        /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.source.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        private static final class C0328a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f19692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public s f19693b;

            public C0328a(Handler handler, s sVar) {
                this.f19692a = handler;
                this.f19693b = sVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(n8.j jVar, s sVar) {
            sVar.o0(this.f19689a, this.f19690b, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(n8.i iVar, n8.j jVar, s sVar) {
            sVar.T(this.f19689a, this.f19690b, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(n8.i iVar, n8.j jVar, s sVar) {
            sVar.f0(this.f19689a, this.f19690b, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(n8.i iVar, n8.j jVar, IOException iOException, boolean z10, s sVar) {
            sVar.U(this.f19689a, this.f19690b, iVar, jVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(n8.i iVar, n8.j jVar, int i10, s sVar) {
            sVar.R(this.f19689a, this.f19690b, iVar, jVar, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(r.b bVar, n8.j jVar, s sVar) {
            sVar.K(this.f19689a, bVar, jVar);
        }

        public void A(final n8.i iVar, final n8.j jVar, final IOException iOException, final boolean z10) {
            i(new x7.l() { // from class: n8.p
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f22808a.p(iVar, jVar, iOException, z10, (io.bidmachine.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void B(n8.i iVar, int i10, int i11) {
            C(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public void C(n8.i iVar, int i10, int i11, u7.q qVar, int i12, Object obj, long j10, long j11, int i13) {
            D(iVar, new n8.j(i10, i11, qVar, i12, obj, x7.l0.t1(j10), x7.l0.t1(j11)), i13);
        }

        public void D(final n8.i iVar, final n8.j jVar, final int i10) {
            i(new x7.l() { // from class: n8.o
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f22804a.q(iVar, jVar, i10, (io.bidmachine.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void E(s sVar) {
            for (C0328a c0328a : this.f19691c) {
                if (c0328a.f19693b == sVar) {
                    this.f19691c.remove(c0328a);
                }
            }
        }

        public void F(int i10, long j10, long j11) {
            G(new n8.j(1, i10, null, 3, null, x7.l0.t1(j10), x7.l0.t1(j11)));
        }

        public void G(final n8.j jVar) {
            final r.b bVar = (r.b) x7.a.e(this.f19690b);
            i(new x7.l() { // from class: n8.m
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f22799a.r(bVar, jVar, (io.bidmachine.media3.exoplayer.source.s) obj);
                }
            });
        }

        public a H(int i10, r.b bVar) {
            return new a(this.f19691c, i10, bVar);
        }

        public void h(Handler handler, s sVar) {
            x7.a.e(handler);
            x7.a.e(sVar);
            this.f19691c.add(new C0328a(handler, sVar));
        }

        public void i(final x7.l<s> lVar) {
            for (C0328a c0328a : this.f19691c) {
                final s sVar = c0328a.f19693b;
                x7.l0.c1(c0328a.f19692a, new Runnable() { // from class: n8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.accept(sVar);
                    }
                });
            }
        }

        public void j(int i10, u7.q qVar, int i11, Object obj, long j10) {
            k(new n8.j(1, i10, qVar, i11, obj, x7.l0.t1(j10), -9223372036854775807L));
        }

        public void k(final n8.j jVar) {
            i(new x7.l() { // from class: n8.n
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f22802a.m(jVar, (io.bidmachine.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void s(n8.i iVar, int i10) {
            t(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(n8.i iVar, int i10, int i11, u7.q qVar, int i12, Object obj, long j10, long j11) {
            u(iVar, new n8.j(i10, i11, qVar, i12, obj, x7.l0.t1(j10), x7.l0.t1(j11)));
        }

        public void u(final n8.i iVar, final n8.j jVar) {
            i(new x7.l() { // from class: n8.k
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f22793a.n(iVar, jVar, (io.bidmachine.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void v(n8.i iVar, int i10) {
            w(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void w(n8.i iVar, int i10, int i11, u7.q qVar, int i12, Object obj, long j10, long j11) {
            x(iVar, new n8.j(i10, i11, qVar, i12, obj, x7.l0.t1(j10), x7.l0.t1(j11)));
        }

        public void x(final n8.i iVar, final n8.j jVar) {
            i(new x7.l() { // from class: n8.l
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f22796a.o(iVar, jVar, (io.bidmachine.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void y(n8.i iVar, int i10, int i11, u7.q qVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            A(iVar, new n8.j(i10, i11, qVar, i12, obj, x7.l0.t1(j10), x7.l0.t1(j11)), iOException, z10);
        }

        public void z(n8.i iVar, int i10, IOException iOException, boolean z10) {
            y(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        private a(CopyOnWriteArrayList<C0328a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f19691c = copyOnWriteArrayList;
            this.f19689a = i10;
            this.f19690b = bVar;
        }
    }

    default void K(int i10, r.b bVar, n8.j jVar) {
    }

    default void o0(int i10, r.b bVar, n8.j jVar) {
    }

    default void T(int i10, r.b bVar, n8.i iVar, n8.j jVar) {
    }

    default void f0(int i10, r.b bVar, n8.i iVar, n8.j jVar) {
    }

    default void R(int i10, r.b bVar, n8.i iVar, n8.j jVar, int i11) {
    }

    default void U(int i10, r.b bVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z10) {
    }
}
