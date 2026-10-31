package io.bidmachine.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import u7.q;
import x7.l0;

/* JADX INFO: compiled from: VideoRendererEventListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface p {

    /* JADX INFO: compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f19985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p f19986b;

        public a(Handler handler, p pVar) {
            this.f19985a = pVar != null ? (Handler) x7.a.e(handler) : null;
            this.f19986b = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((p) l0.i(this.f19986b)).g(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((p) l0.i(this.f19986b)).f(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(b8.b bVar) {
            bVar.c();
            ((p) l0.i(this.f19986b)).t(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((p) l0.i(this.f19986b)).q(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(b8.b bVar) {
            ((p) l0.i(this.f19986b)).n(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(q qVar, b8.c cVar) {
            ((p) l0.i(this.f19986b)).j(qVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((p) l0.i(this.f19986b)).u(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((p) l0.i(this.f19986b)).A(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((p) l0.i(this.f19986b)).m(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(u7.l0 l0Var) {
            ((p) l0.i(this.f19986b)).c(l0Var);
        }

        public void A(final Object obj) {
            if (this.f19985a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f19985a.post(new Runnable() { // from class: t8.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25684a.w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25690a.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25682a.y(exc);
                    }
                });
            }
        }

        public void D(final u7.l0 l0Var) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25674a.z(l0Var);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25678a.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25676a.r(str);
                    }
                });
            }
        }

        public void m(final b8.b bVar) {
            bVar.c();
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25698a.s(bVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25695a.t(i10, j10);
                    }
                });
            }
        }

        public void o(final b8.b bVar) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25693a.u(bVar);
                    }
                });
            }
        }

        public void p(final q qVar, final b8.c cVar) {
            Handler handler = this.f19985a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25687a.v(qVar, cVar);
                    }
                });
            }
        }
    }

    default void c(u7.l0 l0Var) {
    }

    default void f(String str) {
    }

    default void m(Exception exc) {
    }

    default void n(b8.b bVar) {
    }

    default void t(b8.b bVar) {
    }

    default void A(long j10, int i10) {
    }

    default void j(q qVar, b8.c cVar) {
    }

    default void q(int i10, long j10) {
    }

    default void u(Object obj, long j10) {
    }

    default void g(String str, long j10, long j11) {
    }
}
