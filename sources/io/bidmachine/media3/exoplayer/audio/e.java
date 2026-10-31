package io.bidmachine.media3.exoplayer.audio;

import android.os.Handler;
import u7.q;
import x7.l0;

/* JADX INFO: compiled from: AudioRendererEventListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface e {

    /* JADX INFO: compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f18238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f18239b;

        public a(Handler handler, e eVar) {
            this.f18238a = eVar != null ? (Handler) x7.a.e(handler) : null;
            this.f18239b = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(String str) {
            ((e) l0.i(this.f18239b)).h(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void B(b8.b bVar) {
            bVar.c();
            ((e) l0.i(this.f18239b)).o(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void C(b8.b bVar) {
            ((e) l0.i(this.f18239b)).p(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void D(q qVar, b8.c cVar) {
            ((e) l0.i(this.f18239b)).r(qVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void E(long j10) {
            ((e) l0.i(this.f18239b)).l(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void F(boolean z10) {
            ((e) l0.i(this.f18239b)).a(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void G(int i10, long j10, long j11) {
            ((e) l0.i(this.f18239b)).z(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(Exception exc) {
            ((e) l0.i(this.f18239b)).y(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Exception exc) {
            ((e) l0.i(this.f18239b)).b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(AudioSink.a aVar) {
            ((e) l0.i(this.f18239b)).e(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(AudioSink.a aVar) {
            ((e) l0.i(this.f18239b)).d(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(String str, long j10, long j11) {
            ((e) l0.i(this.f18239b)).i(str, j10, j11);
        }

        public void H(final long j10) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13380a.E(j10);
                    }
                });
            }
        }

        public void I(final boolean z10) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13386a.F(z10);
                    }
                });
            }
        }

        public void J(final int i10, final long j10, final long j11) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13363a.G(i10, j10, j11);
                    }
                });
            }
        }

        public void m(final Exception exc) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13371a.v(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13382a.w(exc);
                    }
                });
            }
        }

        public void o(final AudioSink.a aVar) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13367a.x(aVar);
                    }
                });
            }
        }

        public void p(final AudioSink.a aVar) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13384a.y(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13359a.z(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13369a.A(str);
                    }
                });
            }
        }

        public void s(final b8.b bVar) {
            bVar.c();
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13376a.B(bVar);
                    }
                });
            }
        }

        public void t(final b8.b bVar) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13378a.C(bVar);
                    }
                });
            }
        }

        public void u(final q qVar, final b8.c cVar) {
            Handler handler = this.f18238a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: d8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13373a.D(qVar, cVar);
                    }
                });
            }
        }
    }

    default void a(boolean z10) {
    }

    default void b(Exception exc) {
    }

    default void d(AudioSink.a aVar) {
    }

    default void e(AudioSink.a aVar) {
    }

    default void h(String str) {
    }

    default void l(long j10) {
    }

    default void o(b8.b bVar) {
    }

    default void p(b8.b bVar) {
    }

    default void y(Exception exc) {
    }

    default void r(q qVar, b8.c cVar) {
    }

    default void i(String str, long j10, long j11) {
    }

    default void z(int i10, long j10, long j11) {
    }
}
