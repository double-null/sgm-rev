package io.bidmachine.media3.exoplayer.drm;

import android.os.Handler;
import io.bidmachine.media3.exoplayer.source.r;
import java.util.concurrent.CopyOnWriteArrayList;
import x7.l0;

/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h {

    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.b f18577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0323a> f18578c;

        /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.drm.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        private static final class C0323a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f18579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public h f18580b;

            public C0323a(Handler handler, h hVar) {
                this.f18579a = handler;
                this.f18580b = hVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(h hVar) {
            hVar.p0(this.f18576a, this.f18577b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(h hVar) {
            hVar.k0(this.f18576a, this.f18577b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(h hVar) {
            hVar.m0(this.f18576a, this.f18577b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(h hVar, int i10) {
            hVar.Z(this.f18576a, this.f18577b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(h hVar, Exception exc) {
            hVar.b0(this.f18576a, this.f18577b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(h hVar) {
            hVar.l0(this.f18576a, this.f18577b);
        }

        public void g(Handler handler, h hVar) {
            x7.a.e(handler);
            x7.a.e(hVar);
            this.f18578c.add(new C0323a(handler, hVar));
        }

        public void h() {
            for (C0323a c0323a : this.f18578c) {
                final h hVar = c0323a.f18580b;
                l0.c1(c0323a.f18579a, new Runnable() { // from class: g8.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15522a.n(hVar);
                    }
                });
            }
        }

        public void i() {
            for (C0323a c0323a : this.f18578c) {
                final h hVar = c0323a.f18580b;
                l0.c1(c0323a.f18579a, new Runnable() { // from class: g8.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15526a.o(hVar);
                    }
                });
            }
        }

        public void j() {
            for (C0323a c0323a : this.f18578c) {
                final h hVar = c0323a.f18580b;
                l0.c1(c0323a.f18579a, new Runnable() { // from class: g8.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15524a.p(hVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0323a c0323a : this.f18578c) {
                final h hVar = c0323a.f18580b;
                l0.c1(c0323a.f18579a, new Runnable() { // from class: g8.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15517a.q(hVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0323a c0323a : this.f18578c) {
                final h hVar = c0323a.f18580b;
                l0.c1(c0323a.f18579a, new Runnable() { // from class: g8.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15514a.r(hVar, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0323a c0323a : this.f18578c) {
                final h hVar = c0323a.f18580b;
                l0.c1(c0323a.f18579a, new Runnable() { // from class: g8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15520a.s(hVar);
                    }
                });
            }
        }

        public void t(h hVar) {
            for (C0323a c0323a : this.f18578c) {
                if (c0323a.f18580b == hVar) {
                    this.f18578c.remove(c0323a);
                }
            }
        }

        public a u(int i10, r.b bVar) {
            return new a(this.f18578c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0323a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f18578c = copyOnWriteArrayList;
            this.f18576a = i10;
            this.f18577b = bVar;
        }
    }

    default void k0(int i10, r.b bVar) {
    }

    default void l0(int i10, r.b bVar) {
    }

    default void m0(int i10, r.b bVar) {
    }

    default void p0(int i10, r.b bVar) {
    }

    default void Z(int i10, r.b bVar, int i11) {
    }

    default void b0(int i10, r.b bVar, Exception exc) {
    }
}
