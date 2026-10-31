package io.bidmachine.media3.exoplayer.video;

import android.media.MediaFormat;
import android.view.Surface;
import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.h2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import u7.l0;
import u7.q;
import x7.c0;

/* JADX INFO: compiled from: DefaultVideoSink.java */
/* JADX INFO: loaded from: classes4.dex */
final class d implements VideoSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f19837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.h f19838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f19839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<VideoSink.b> f19840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f19841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f19842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private VideoSink.a f19845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Executor f19846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t8.h f19847k;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultVideoSink.java */
    final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f19848a;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            d.this.f19845i.a(d.this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(l0 l0Var) {
            d.this.f19845i.c(d.this, l0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i() {
            d.this.f19845i.b(d.this);
        }

        @Override // io.bidmachine.media3.exoplayer.video.o.a
        public void c(final l0 l0Var) {
            this.f19848a = new q.b().B0(l0Var.f26206a).d0(l0Var.f26207b).u0("video/raw").N();
            d.this.f19846j.execute(new Runnable() { // from class: io.bidmachine.media3.exoplayer.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19852a.h(l0Var);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.video.o.a
        public void d() {
            d.this.f19846j.execute(new Runnable() { // from class: io.bidmachine.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19851a.g();
                }
            });
            ((VideoSink.b) d.this.f19840d.remove()).b();
        }

        @Override // io.bidmachine.media3.exoplayer.video.o.a
        public void e(long j10, long j11, boolean z10) {
            if (z10 && d.this.f19841e != null) {
                d.this.f19846j.execute(new Runnable() { // from class: io.bidmachine.media3.exoplayer.video.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19850a.i();
                    }
                });
            }
            q qVarN = this.f19848a;
            if (qVarN == null) {
                qVarN = new q.b().N();
            }
            d.this.f19847k.a(j11, d.this.f19838b.nanoTime(), qVarN, null);
            ((VideoSink.b) d.this.f19840d.remove()).a(j10);
        }
    }

    public d(n nVar, x7.h hVar) {
        this.f19837a = nVar;
        nVar.o(hVar);
        this.f19838b = hVar;
        this.f19839c = new o(new b(), nVar);
        this.f19840d = new ArrayDeque();
        this.f19842f = new q.b().N();
        this.f19843g = -9223372036854775807L;
        this.f19845i = VideoSink.a.f19835a;
        this.f19846j = new Executor() { // from class: io.bidmachine.media3.exoplayer.video.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                d.G(runnable);
            }
        };
        this.f19847k = new t8.h() { // from class: io.bidmachine.media3.exoplayer.video.c
            @Override // t8.h
            public final void a(long j10, long j11, q qVar, MediaFormat mediaFormat) {
                d.H(j10, j11, qVar, mediaFormat);
            }
        };
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void A(t8.h hVar) {
        this.f19847k = hVar;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public Surface a() {
        return (Surface) x7.a.i(this.f19841e);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public boolean b() {
        return this.f19839c.d();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void d(int i10, q qVar, List<Object> list) {
        x7.a.g(list.isEmpty());
        int i11 = qVar.f26259v;
        q qVar2 = this.f19842f;
        if (i11 != qVar2.f26259v || qVar.f26260w != qVar2.f26260w) {
            this.f19839c.i(i11, qVar.f26260w);
        }
        float f10 = qVar.f26261x;
        if (f10 != this.f19842f.f26261x) {
            this.f19837a.p(f10);
        }
        this.f19842f = qVar;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void e(h2.a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void f() {
        this.f19837a.a();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void g() {
        this.f19839c.l();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void h(long j10, long j11) {
        if (j10 != this.f19843g) {
            this.f19839c.h(j10);
            this.f19843g = j10;
        }
        this.f19844h = j11;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void i(long j10, long j11) throws VideoSink.VideoSinkException {
        try {
            this.f19839c.j(j10, j11);
        } catch (ExoPlaybackException e10) {
            throw new VideoSink.VideoSinkException(e10, this.f19842f);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void k() {
        this.f19837a.l();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void l(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public boolean m(q qVar) {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public boolean n(boolean z10) {
        return this.f19837a.d(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void o(boolean z10) {
        this.f19837a.h(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void p() {
        this.f19837a.k();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public boolean r(long j10, boolean z10, VideoSink.b bVar) {
        this.f19840d.add(bVar);
        this.f19839c.g(j10 - this.f19844h);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void s() {
        this.f19837a.g();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void t(int i10) {
        this.f19837a.n(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void u(float f10) {
        this.f19837a.r(f10);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void v() {
        this.f19841e = null;
        this.f19837a.q(null);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void w(VideoSink.a aVar, Executor executor) {
        this.f19845i = aVar;
        this.f19846j = executor;
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void x(boolean z10) {
        if (z10) {
            this.f19837a.m();
        }
        this.f19839c.b();
        this.f19840d.clear();
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void y(Surface surface, c0 c0Var) {
        this.f19841e = surface;
        this.f19837a.q(surface);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void z(boolean z10) {
        this.f19837a.e(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.video.VideoSink
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(long j10, long j11, q qVar, MediaFormat mediaFormat) {
    }
}
