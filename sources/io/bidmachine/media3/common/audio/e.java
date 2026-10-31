package io.bidmachine.media3.common.audio;

import java.nio.ByteBuffer;
import x7.l0;

/* JADX INFO: compiled from: ToInt16PcmAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f17946b.f17938c;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else {
            if (i11 != 21) {
                if (i11 == 22) {
                    i10 /= 2;
                } else if (i11 != 268435456) {
                    if (i11 != 1342177280) {
                        if (i11 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i10 /= 2;
                    }
                }
            }
            i10 /= 3;
            i10 *= 2;
        }
        ByteBuffer byteBufferL = l(i10);
        int i12 = this.f17946b.f17938c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferL.put((byte) 0);
                byteBufferL.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sO = (short) (l0.o(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferL.put((byte) (sO & 255));
                byteBufferL.put((byte) ((sO >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 21) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i12 == 22) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 2));
                byteBufferL.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i12 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // io.bidmachine.media3.common.audio.b
    public AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f17938c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f17936a, aVar.f17937b, 2) : AudioProcessor.a.f17935e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
