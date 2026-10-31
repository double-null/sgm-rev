package d8;

import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import v8.h0;
import x7.l0;

/* JADX INFO: compiled from: OggOpusAudioPacketizer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f13397d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f13398e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f13399a = AudioProcessor.f17933a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13401c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13400b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f13400b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f13397d.length;
            length += f13398e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f13400b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f13397d);
            }
            byteBufferC.put(f13398e);
        }
        int iJ = this.f13401c + h0.j(byteBuffer);
        this.f13401c = iJ;
        f(byteBufferC, iJ, this.f13400b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f13400b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f13398e;
            byteBufferC.putInt(i10 + bArr2.length + 22, l0.x(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, l0.x(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f13400b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f13399a.capacity() < i10) {
            this.f13399a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f13399a.clear();
        }
        return this.f13399a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, l0.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.i.a(i11));
    }

    public void a(DecoderInputBuffer decoderInputBuffer, List<byte[]> list) {
        x7.a.e(decoderInputBuffer.f18057d);
        if (decoderInputBuffer.f18057d.limit() - decoderInputBuffer.f18057d.position() == 0) {
            return;
        }
        this.f13399a = b(decoderInputBuffer.f18057d, (this.f13400b == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.g();
        decoderInputBuffer.q(this.f13399a.remaining());
        decoderInputBuffer.f18057d.put(this.f13399a);
        decoderInputBuffer.r();
    }

    public void d() {
        this.f13399a = AudioProcessor.f17933a;
        this.f13401c = 0;
        this.f13400b = 2;
    }
}
