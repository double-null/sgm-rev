package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.Arrays;
import x7.l0;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
final class h extends io.bidmachine.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f18279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f18280j;

    h() {
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) x7.a.e(this.f18280j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f17946b.f17939d) * this.f17947c.f17939d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iQ = (l0.Q(this.f17946b.f17938c) * i10) + iPosition;
                int i11 = this.f17946b.f17938c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iQ));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f17946b.f17938c);
                    }
                    byteBufferL.putFloat(byteBuffer.getFloat(iQ));
                }
            }
            iPosition += this.f17946b.f17939d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // io.bidmachine.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f18279i;
        if (iArr == null) {
            return AudioProcessor.a.f17935e;
        }
        int i10 = aVar.f17938c;
        if (i10 != 2 && i10 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f17937b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f17937b) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new AudioProcessor.a(aVar.f17936a, iArr.length, aVar.f17938c) : AudioProcessor.a.f17935e;
    }

    @Override // io.bidmachine.media3.common.audio.b
    protected void i() {
        this.f18280j = this.f18279i;
    }

    @Override // io.bidmachine.media3.common.audio.b
    protected void k() {
        this.f18280j = null;
        this.f18279i = null;
    }

    public void m(int[] iArr) {
        this.f18279i = iArr;
    }
}
