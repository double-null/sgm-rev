package io.bidmachine.media3.exoplayer.mediacodec;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes4.dex */
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19275l;

    public f() {
        super(2);
        this.f19275l = 32;
    }

    private boolean w(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!A()) {
            return true;
        }
        if (this.f19274k >= this.f19275l) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f18057d;
        return byteBuffer2 == null || (byteBuffer = this.f18057d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean A() {
        return this.f19274k > 0;
    }

    public void B(int i10) {
        x7.a.a(i10 > 0);
        this.f19275l = i10;
    }

    @Override // io.bidmachine.media3.decoder.DecoderInputBuffer, a8.a
    public void g() {
        super.g();
        this.f19274k = 0;
    }

    public boolean v(DecoderInputBuffer decoderInputBuffer) {
        x7.a.a(!decoderInputBuffer.s());
        x7.a.a(!decoderInputBuffer.i());
        x7.a.a(!decoderInputBuffer.j());
        if (!w(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f19274k;
        this.f19274k = i10 + 1;
        if (i10 == 0) {
            this.f18059f = decoderInputBuffer.f18059f;
            if (decoderInputBuffer.l()) {
                o(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f18057d;
        if (byteBuffer != null) {
            q(byteBuffer.remaining());
            this.f18057d.put(byteBuffer);
        }
        this.f19273j = decoderInputBuffer.f18059f;
        return true;
    }

    public long x() {
        return this.f18059f;
    }

    public long y() {
        return this.f19273j;
    }

    public int z() {
        return this.f19274k;
    }
}
