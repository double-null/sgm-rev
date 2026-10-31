package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import x7.l0;

/* JADX INFO: compiled from: ToFloatPcmAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
final class n extends io.bidmachine.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f18299i = Float.floatToIntBits(Float.NaN);

    n() {
    }

    private static void m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f18299i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f17946b.f17938c;
        if (i11 == 21) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // io.bidmachine.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f17938c;
        if (l0.F0(i10)) {
            return i10 != 4 ? new AudioProcessor.a(aVar.f17936a, aVar.f17937b, 4) : AudioProcessor.a.f17935e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
