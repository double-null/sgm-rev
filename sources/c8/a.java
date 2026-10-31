package c8;

import android.os.Looper;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import java.util.List;

/* JADX INFO: compiled from: AnalyticsCollector.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends u7.y.d, io.bidmachine.media3.exoplayer.source.s, r8.d.a, io.bidmachine.media3.exoplayer.drm.h {
    void A(long j10, int i10);

    void E(u7.y yVar, Looper looper);

    void L();

    void b(Exception exc);

    void d(AudioSink.a aVar);

    void d0(List<io.bidmachine.media3.exoplayer.source.r.b> list, io.bidmachine.media3.exoplayer.source.r.b bVar);

    void e(AudioSink.a aVar);

    void f(String str);

    void g(String str, long j10, long j11);

    void g0(int i10, int i11, boolean z10);

    void h(String str);

    void i(String str, long j10, long j11);

    void j(u7.q qVar, b8.c cVar);

    void l(long j10);

    void m(Exception exc);

    void n(b8.b bVar);

    void o(b8.b bVar);

    void p(b8.b bVar);

    void q(int i10, long j10);

    void r(u7.q qVar, b8.c cVar);

    void r0(b bVar);

    void release();

    void t(b8.b bVar);

    void u(Object obj, long j10);

    void y(Exception exc);

    void z(int i10, long j10, long j11);
}
