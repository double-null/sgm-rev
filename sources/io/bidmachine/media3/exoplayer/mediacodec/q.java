package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import x7.h0;
import x7.l0;

/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f19305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k8.c f19306b;

    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static class b implements h.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [io.bidmachine.media3.exoplayer.mediacodec.q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // io.bidmachine.media3.exoplayer.mediacodec.h.b
        public h b(h.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecC = c(aVar);
                try {
                    h0.a("configureCodec");
                    Surface surface = aVar.f19284d;
                    mediaCodecC.configure(aVar.f19282b, surface, aVar.f19285e, (surface == null && aVar.f19281a.f19298k && l0.f28136a >= 35) ? 8 : 0);
                    h0.b();
                    h0.a("startCodec");
                    mediaCodecC.start();
                    h0.b();
                    return new q(mediaCodecC, aVar.f19286f);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        }

        protected MediaCodec c(h.a aVar) throws IOException {
            x7.a.e(aVar.f19281a);
            String str = aVar.f19281a.f19288a;
            h0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            h0.b();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, a8.c cVar, long j10, int i12) {
        this.f19305a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void b(int i10, int i11, int i12, long j10, int i13) {
        this.f19305a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void c(Bundle bundle) {
        this.f19305a.setParameters(bundle);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public MediaFormat e() {
        return this.f19305a.getOutputFormat();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void f() {
        this.f19305a.detachOutputSurface();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f19305a.flush();
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void g(int i10) {
        this.f19305a.setVideoScalingMode(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void h(final h.d dVar, Handler handler) {
        this.f19305a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k8.g
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f21264a.r(dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public ByteBuffer i(int i10) {
        return this.f19305a.getInputBuffer(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void j(Surface surface) {
        this.f19305a.setOutputSurface(surface);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public boolean k() {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void l(int i10, long j10) {
        this.f19305a.releaseOutputBuffer(i10, j10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public int m() {
        return this.f19305a.dequeueInputBuffer(0L);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f19305a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void o(int i10, boolean z10) {
        this.f19305a.releaseOutputBuffer(i10, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public ByteBuffer p(int i10) {
        return this.f19305a.getOutputBuffer(i10);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h
    public void release() {
        k8.c cVar;
        try {
            int i10 = l0.f28136a;
            if (i10 >= 30 && i10 < 33) {
                this.f19305a.stop();
            }
        } finally {
            if (l0.f28136a >= 35 && (cVar = this.f19306b) != null) {
                cVar.d(this.f19305a);
            }
            this.f19305a.release();
        }
    }

    private q(MediaCodec mediaCodec, k8.c cVar) {
        this.f19305a = mediaCodec;
        this.f19306b = cVar;
        if (l0.f28136a < 35 || cVar == null) {
            return;
        }
        cVar.b(mediaCodec);
    }
}
