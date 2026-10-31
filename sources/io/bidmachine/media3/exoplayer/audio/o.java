package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import x7.l0;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
final class o extends io.bidmachine.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f18304m = l0.f28141f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18306o;

    @Override // io.bidmachine.media3.common.audio.b, io.bidmachine.media3.common.audio.AudioProcessor
    public boolean b() {
        return super.b() && this.f18305n == 0;
    }

    @Override // io.bidmachine.media3.common.audio.b, io.bidmachine.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        int i10;
        if (super.b() && (i10 = this.f18305n) > 0) {
            l(i10).put(this.f18304m, 0, this.f18305n).flip();
            this.f18305n = 0;
        }
        return super.e();
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f18303l);
        this.f18306o += (long) (iMin / this.f17946b.f17939d);
        this.f18303l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f18303l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f18305n + i11) - this.f18304m.length;
        ByteBuffer byteBufferL = l(length);
        int iP = l0.p(length, 0, this.f18305n);
        byteBufferL.put(this.f18304m, 0, iP);
        int iP2 = l0.p(length - iP, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iP2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iP2;
        int i13 = this.f18305n - iP;
        this.f18305n = i13;
        byte[] bArr = this.f18304m;
        System.arraycopy(bArr, iP, bArr, 0, i13);
        byteBuffer.get(this.f18304m, this.f18305n, i12);
        this.f18305n += i12;
        byteBufferL.flip();
    }

    @Override // io.bidmachine.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f17938c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f18302k = true;
        return (this.f18300i == 0 && this.f18301j == 0) ? AudioProcessor.a.f17935e : aVar;
    }

    @Override // io.bidmachine.media3.common.audio.b
    protected void i() {
        if (this.f18302k) {
            this.f18302k = false;
            int i10 = this.f18301j;
            int i11 = this.f17946b.f17939d;
            this.f18304m = new byte[i10 * i11];
            this.f18303l = this.f18300i * i11;
        }
        this.f18305n = 0;
    }

    @Override // io.bidmachine.media3.common.audio.b
    protected void j() {
        if (this.f18302k) {
            int i10 = this.f18305n;
            if (i10 > 0) {
                this.f18306o += (long) (i10 / this.f17946b.f17939d);
            }
            this.f18305n = 0;
        }
    }

    @Override // io.bidmachine.media3.common.audio.b
    protected void k() {
        this.f18304m = l0.f28141f;
    }

    public long m() {
        return this.f18306o;
    }

    public void n() {
        this.f18306o = 0L;
    }

    public void o(int i10, int i11) {
        this.f18300i = i10;
        this.f18301j = i11;
    }
}
