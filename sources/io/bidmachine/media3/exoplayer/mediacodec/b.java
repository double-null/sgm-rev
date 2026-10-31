package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.common.base.w;
import java.nio.ByteBuffer;
import x7.h0;
import x7.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f19233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f19234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f19235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k8.c f19236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19238f;

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.mediacodec.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
    public static final class C0327b implements h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w<HandlerThread> f19239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w<HandlerThread> f19240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f19241d;

        public C0327b(final int i10) {
            this(new w() { // from class: k8.a
                @Override // com.google.common.base.w
                public final Object get() {
                    return io.bidmachine.media3.exoplayer.mediacodec.b.C0327b.g(i10);
                }
            }, new w() { // from class: k8.b
                @Override // com.google.common.base.w
                public final Object get() {
                    return io.bidmachine.media3.exoplayer.mediacodec.b.C0327b.h(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread g(int i10) {
            return new HandlerThread(b.u(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread h(int i10) {
            return new HandlerThread(b.v(i10));
        }

        private static boolean i(u7.q qVar) {
            int i10 = l0.f28136a;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || u7.w.t(qVar.f26252o);
        }

        @Override // io.bidmachine.media3.exoplayer.mediacodec.h.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b b(h.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            i cVar;
            int i10;
            String str = aVar.f19281a.f19288a;
            b bVar = null;
            try {
                h0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f19241d && i(aVar.f19283c)) {
                        cVar = new r(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        cVar = new c(mediaCodecCreateByCodecName, this.f19240c.get());
                        i10 = 0;
                    }
                    i iVar = cVar;
                    int i11 = i10;
                    b bVar2 = new b(mediaCodecCreateByCodecName, this.f19239b.get(), iVar, aVar.f19286f);
                    try {
                        h0.b();
                        Surface surface = aVar.f19284d;
                        if (surface == null && aVar.f19281a.f19298k && l0.f28136a >= 35) {
                            i11 |= 8;
                        }
                        bVar2.x(aVar.f19282b, surface, aVar.f19285e, i11);
                        return bVar2;
                    } catch (Exception e10) {
                        e = e10;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void f(boolean z10) {
            this.f19241d = z10;
        }

        public C0327b(w<HandlerThread> wVar, w<HandlerThread> wVar2) {
            this.f19239b = wVar;
            this.f19240c = wVar2;
            this.f19241d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i10) {
        return w(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i10) {
        return w(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String w(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        k8.c cVar;
        this.f19234b.h(this.f19233a);
        h0.a("configureCodec");
        this.f19233a.configure(mediaFormat, surface, mediaCrypto, i10);
        h0.b();
        this.f19235c.start();
        h0.a("startCodec");
        this.f19233a.start();
        h0.b();
        if (l0.f28136a >= 35 && (cVar = this.f19236d) != null) {
            cVar.b(this.f19233a);
        }
        this.f19238f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, a8.c cVar, long j10, int i12) {
        this.f19235c.a(i10, i11, cVar, j10, i12);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void b(int i10, int i11, int i12, long j10, int i13) {
        this.f19235c.b(i10, i11, i12, j10, i13);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void c(Bundle bundle) {
        this.f19235c.c(bundle);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public boolean d(h.c cVar) {
        this.f19234b.p(cVar);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public MediaFormat e() {
        return this.f19234b.g();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void f() {
        this.f19233a.detachOutputSurface();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f19235c.flush();
        this.f19233a.flush();
        this.f19234b.e();
        this.f19233a.start();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void g(int i10) {
        this.f19233a.setVideoScalingMode(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void h(final h.d dVar, Handler handler) {
        this.f19233a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: io.bidmachine.media3.exoplayer.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f19231a.y(dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public ByteBuffer i(int i10) {
        return this.f19233a.getInputBuffer(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void j(Surface surface) {
        this.f19233a.setOutputSurface(surface);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public boolean k() {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void l(int i10, long j10) {
        this.f19233a.releaseOutputBuffer(i10, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public int m() {
        this.f19235c.d();
        return this.f19234b.c();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public int n(MediaCodec.BufferInfo bufferInfo) {
        this.f19235c.d();
        return this.f19234b.d(bufferInfo);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void o(int i10, boolean z10) {
        this.f19233a.releaseOutputBuffer(i10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public ByteBuffer p(int i10) {
        return this.f19233a.getOutputBuffer(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void release() {
        k8.c cVar;
        k8.c cVar2;
        try {
            if (this.f19238f == 1) {
                this.f19235c.shutdown();
                this.f19234b.q();
            }
            this.f19238f = 2;
            if (this.f19237e) {
                return;
            }
            try {
                int i10 = l0.f28136a;
                if (i10 >= 30 && i10 < 33) {
                    this.f19233a.stop();
                }
            } finally {
                if (l0.f28136a >= 35 && (cVar2 = this.f19236d) != null) {
                    cVar2.d(this.f19233a);
                }
                this.f19233a.release();
                this.f19237e = true;
            }
        } catch (Throwable th) {
            if (!this.f19237e) {
                try {
                    int i11 = l0.f28136a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f19233a.stop();
                    }
                } finally {
                    if (l0.f28136a >= 35 && (cVar = this.f19236d) != null) {
                        cVar.d(this.f19233a);
                    }
                    this.f19233a.release();
                    this.f19237e = true;
                }
            }
            throw th;
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, i iVar, k8.c cVar) {
        this.f19233a = mediaCodec;
        this.f19234b = new e(handlerThread);
        this.f19235c = iVar;
        this.f19236d = cVar;
        this.f19238f = 0;
    }
}
