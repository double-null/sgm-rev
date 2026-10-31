package d8;

import io.bidmachine.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import x7.l0;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends io.bidmachine.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f13402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f13403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f13404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f13405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f13406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f13410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f13412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f13415v;

    public v() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    private void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        x7.a.a(this.f13414u >= i10);
        if (i11 == 2) {
            int i12 = this.f13413t;
            int i13 = this.f13414u;
            int i14 = i12 + i13;
            byte[] bArr = this.f13412s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f13415v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f13415v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f13415v, 0, i15);
                    System.arraycopy(this.f13412s, 0, this.f13415v, i15, length);
                }
            }
        } else {
            int i16 = this.f13413t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f13412s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f13415v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f13415v, 0, length2);
                System.arraycopy(this.f13412s, 0, this.f13415v, length2, i10 - length2);
            }
        }
        x7.a.b(i10 % this.f13407n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        x7.a.g(this.f13413t < this.f13412s.length);
        y(this.f13415v, i10, i11);
    }

    private void B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f13412s.length));
        int iS = s(byteBuffer);
        if (iS == byteBuffer.position()) {
            this.f13409p = 1;
        } else {
            byteBuffer.limit(Math.min(iS, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void E(ByteBuffer byteBuffer) {
        int length;
        int i10;
        x7.a.g(this.f13413t < this.f13412s.length);
        int iLimit = byteBuffer.limit();
        int iT = t(byteBuffer);
        int iPosition = iT - byteBuffer.position();
        int i11 = this.f13413t;
        int i12 = this.f13414u;
        int i13 = i11 + i12;
        byte[] bArr = this.f13412s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iT < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f13412s, i10, iMin);
        int i14 = this.f13414u + iMin;
        this.f13414u = i14;
        x7.a.g(i14 <= this.f13412s.length);
        boolean z11 = z10 && iPosition < length;
        z(z11);
        if (z11) {
            this.f13409p = 0;
            this.f13411r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int m(float f10) {
        return n((int) f10);
    }

    private int n(int i10) {
        int i11 = this.f13407n;
        return (i10 / i11) * i11;
    }

    private int o(int i10, int i11) {
        int i12 = this.f13404k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int p(int i10, int i11) {
        return (((this.f13404k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int q(int i10) {
        int iR = ((r(this.f13406m) - this.f13411r) * this.f13407n) - (this.f13412s.length / 2);
        x7.a.g(iR >= 0);
        return m(Math.min((i10 * this.f13402i) + 0.5f, iR));
    }

    private int r(long j10) {
        return (int) ((j10 * ((long) this.f17946b.f17936a)) / 1000000);
    }

    private int s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f13407n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f13407n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean v(byte b10, byte b11) {
        return Math.abs(F(b10, b11)) > this.f13403j;
    }

    private void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f13404k)) / 100);
        }
    }

    private void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void y(byte[] bArr, int i10, int i11) {
        x7.a.b(i10 % this.f13407n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    private void z(boolean z10) {
        int length;
        int iQ;
        int i10 = this.f13414u;
        byte[] bArr = this.f13412s;
        if (i10 == bArr.length || z10) {
            if (this.f13411r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    x7.a.g(i10 >= bArr.length / 2);
                    length = this.f13412s.length / 2;
                    A(length, 0);
                }
                iQ = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iQ2 = q(length2) + (this.f13412s.length / 2);
                A(iQ2, 2);
                iQ = iQ2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iQ = q(length);
                A(iQ, 1);
            }
            x7.a.h(length % this.f13407n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            x7.a.g(i10 >= iQ);
            this.f13414u -= length;
            int i11 = this.f13413t + length;
            this.f13413t = i11;
            this.f13413t = i11 % this.f13412s.length;
            int i12 = this.f13411r;
            int i13 = this.f13407n;
            this.f13411r = i12 + (iQ / i13);
            this.f13410q += (long) ((length - iQ) / i13);
        }
    }

    public void D(boolean z10) {
        this.f13408o = z10;
    }

    @Override // io.bidmachine.media3.common.audio.b, io.bidmachine.media3.common.audio.AudioProcessor
    public boolean c() {
        return super.c() && this.f13408o;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i10 = this.f13409p;
            if (i10 == 0) {
                B(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // io.bidmachine.media3.common.audio.b
    protected AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f17938c == 2) {
            return aVar.f17936a == -1 ? AudioProcessor.a.f17935e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // io.bidmachine.media3.common.audio.b
    public void i() {
        if (c()) {
            this.f13407n = this.f17946b.f17937b * 2;
            int iN = n(r(this.f13405l) / 2) * 2;
            if (this.f13412s.length != iN) {
                this.f13412s = new byte[iN];
                this.f13415v = new byte[iN];
            }
        }
        this.f13409p = 0;
        this.f13410q = 0L;
        this.f13411r = 0;
        this.f13413t = 0;
        this.f13414u = 0;
    }

    @Override // io.bidmachine.media3.common.audio.b
    public void j() {
        if (this.f13414u > 0) {
            z(true);
            this.f13411r = 0;
        }
    }

    @Override // io.bidmachine.media3.common.audio.b
    public void k() {
        this.f13408o = false;
        byte[] bArr = l0.f28141f;
        this.f13412s = bArr;
        this.f13415v = bArr;
    }

    public long u() {
        return this.f13410q;
    }

    public v(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f13411r = 0;
        this.f13413t = 0;
        this.f13414u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        x7.a.a(z10);
        this.f13405l = j10;
        this.f13402i = f10;
        this.f13406m = j11;
        this.f13404k = i10;
        this.f13403j = s10;
        byte[] bArr = l0.f28141f;
        this.f13412s = bArr;
        this.f13415v = bArr;
    }
}
