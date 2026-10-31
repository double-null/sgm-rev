package io.bidmachine.media3.exoplayer.video;

import android.view.Surface;
import io.bidmachine.media3.exoplayer.h2;
import java.util.List;
import java.util.concurrent.Executor;
import u7.l0;
import u7.q;
import x7.c0;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f19834a;

        public VideoSinkException(Throwable th, q qVar) {
            super(th);
            this.f19834a = qVar;
        }
    }

    public interface b {
        void a(long j10);

        void b();
    }

    void A(t8.h hVar);

    Surface a();

    boolean b();

    void d(int i10, q qVar, List<Object> list);

    void e(h2.a aVar);

    void f();

    void g();

    void h(long j10, long j11);

    void i(long j10, long j11) throws VideoSinkException;

    boolean isInitialized();

    void k();

    void l(List<Object> list);

    boolean m(q qVar) throws VideoSinkException;

    boolean n(boolean z10);

    void o(boolean z10);

    void p();

    boolean r(long j10, boolean z10, b bVar);

    void release();

    void s();

    void t(int i10);

    void u(float f10);

    void v();

    void w(a aVar, Executor executor);

    void x(boolean z10);

    void y(Surface surface, c0 c0Var);

    void z(boolean z10);

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19835a = new C0330a();

        void a(VideoSink videoSink);

        void b(VideoSink videoSink);

        void c(VideoSink videoSink, l0 l0Var);

        /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        class C0330a implements a {
            C0330a() {
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
            public void a(VideoSink videoSink) {
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
            public void b(VideoSink videoSink) {
            }

            @Override // io.bidmachine.media3.exoplayer.video.VideoSink.a
            public void c(VideoSink videoSink, l0 l0Var) {
            }
        }
    }
}
