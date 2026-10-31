package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: SynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes4.dex */
class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f19307a;

    public r(MediaCodec mediaCodec) {
        this.f19307a = mediaCodec;
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, a8.c cVar, long j10, int i12) {
        this.f19307a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void b(int i10, int i11, int i12, long j10, int i13) {
        this.f19307a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void c(Bundle bundle) {
        this.f19307a.setParameters(bundle);
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void d() {
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void flush() {
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void shutdown() {
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.i
    public void start() {
    }
}
