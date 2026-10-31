package io.bidmachine.media3.exoplayer.source;

import io.bidmachine.media3.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import v8.o0;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes4.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r8.b f19521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.a0 f19523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f19524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f19525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f19526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19527g;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    private static final class a implements r8.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f19528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f19529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r8.a f19530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f19531d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // r8.b.a
        public r8.a a() {
            return (r8.a) x7.a.e(this.f19530c);
        }

        public a b() {
            this.f19530c = null;
            a aVar = this.f19531d;
            this.f19531d = null;
            return aVar;
        }

        public void c(r8.a aVar, a aVar2) {
            this.f19530c = aVar;
            this.f19531d = aVar2;
        }

        public void d(long j10, int i10) {
            x7.a.g(this.f19530c == null);
            this.f19528a = j10;
            this.f19529b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f19528a)) + this.f19530c.f24928b;
        }

        @Override // r8.b.a
        public r8.b.a next() {
            a aVar = this.f19531d;
            if (aVar == null || aVar.f19530c == null) {
                return null;
            }
            return aVar;
        }
    }

    public d0(r8.b bVar) {
        this.f19521a = bVar;
        int iE = bVar.e();
        this.f19522b = iE;
        this.f19523c = new x7.a0(32);
        a aVar = new a(0L, iE);
        this.f19524d = aVar;
        this.f19525e = aVar;
        this.f19526f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f19530c == null) {
            return;
        }
        this.f19521a.b(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f19529b) {
            aVar = aVar.f19531d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f19527g + ((long) i10);
        this.f19527g = j10;
        a aVar = this.f19526f;
        if (j10 == aVar.f19529b) {
            this.f19526f = aVar.f19531d;
        }
    }

    private int h(int i10) {
        a aVar = this.f19526f;
        if (aVar.f19530c == null) {
            aVar.c(this.f19521a.a(), new a(this.f19526f.f19529b, this.f19522b));
        }
        return Math.min(i10, (int) (this.f19526f.f19529b - this.f19527g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f19529b - j10));
            byteBuffer.put(aVarD.f19530c.f24927a, aVarD.e(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f19529b) {
                aVarD = aVarD.f19531d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f19529b - j10));
            System.arraycopy(aVarD.f19530c.f24927a, aVarD.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f19529b) {
                aVarD = aVarD.f19531d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, f0.b bVar, x7.a0 a0Var) {
        long j10 = bVar.f19563b;
        int iP = 1;
        a0Var.S(1);
        a aVarJ = j(aVar, j10, a0Var.e(), 1);
        long j11 = j10 + 1;
        byte b10 = a0Var.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        a8.c cVar = decoderInputBuffer.f18056c;
        byte[] bArr = cVar.f135a;
        if (bArr == null) {
            cVar.f135a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, cVar.f135a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            a0Var.S(2);
            aVarJ2 = j(aVarJ2, j12, a0Var.e(), 2);
            j12 += 2;
            iP = a0Var.P();
        }
        int i11 = iP;
        int[] iArr = cVar.f138d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f139e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            a0Var.S(i12);
            aVarJ2 = j(aVarJ2, j12, a0Var.e(), i12);
            j12 += (long) i12;
            a0Var.W(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = a0Var.P();
                iArr4[i13] = a0Var.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f19562a - ((int) (j12 - bVar.f19563b));
        }
        o0.a aVar2 = (o0.a) x7.l0.i(bVar.f19564c);
        cVar.c(i11, iArr2, iArr4, aVar2.f27404b, cVar.f135a, aVar2.f27403a, aVar2.f27405c, aVar2.f27406d);
        long j13 = bVar.f19563b;
        int i14 = (int) (j12 - j13);
        bVar.f19563b = j13 + ((long) i14);
        bVar.f19562a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, f0.b bVar, x7.a0 a0Var) {
        if (decoderInputBuffer.s()) {
            aVar = k(aVar, decoderInputBuffer, bVar, a0Var);
        }
        if (!decoderInputBuffer.i()) {
            decoderInputBuffer.q(bVar.f19562a);
            return i(aVar, bVar.f19563b, decoderInputBuffer.f18057d, bVar.f19562a);
        }
        a0Var.S(4);
        a aVarJ = j(aVar, bVar.f19563b, a0Var.e(), 4);
        int iL = a0Var.L();
        bVar.f19563b += 4;
        bVar.f19562a -= 4;
        decoderInputBuffer.q(iL);
        a aVarI = i(aVarJ, bVar.f19563b, decoderInputBuffer.f18057d, iL);
        bVar.f19563b += (long) iL;
        int i10 = bVar.f19562a - iL;
        bVar.f19562a = i10;
        decoderInputBuffer.u(i10);
        return i(aVarI, bVar.f19563b, decoderInputBuffer.f18060g, bVar.f19562a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f19524d;
            if (j10 < aVar.f19529b) {
                break;
            }
            this.f19521a.c(aVar.f19530c);
            this.f19524d = this.f19524d.b();
        }
        if (this.f19525e.f19528a < aVar.f19528a) {
            this.f19525e = aVar;
        }
    }

    public void c(long j10) {
        x7.a.a(j10 <= this.f19527g);
        this.f19527g = j10;
        if (j10 != 0) {
            a aVar = this.f19524d;
            if (j10 != aVar.f19528a) {
                while (this.f19527g > aVar.f19529b) {
                    aVar = aVar.f19531d;
                }
                a aVar2 = (a) x7.a.e(aVar.f19531d);
                a(aVar2);
                a aVar3 = new a(aVar.f19529b, this.f19522b);
                aVar.f19531d = aVar3;
                if (this.f19527g == aVar.f19529b) {
                    aVar = aVar3;
                }
                this.f19526f = aVar;
                if (this.f19525e == aVar2) {
                    this.f19525e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f19524d);
        a aVar4 = new a(this.f19527g, this.f19522b);
        this.f19524d = aVar4;
        this.f19525e = aVar4;
        this.f19526f = aVar4;
    }

    public long e() {
        return this.f19527g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, f0.b bVar) {
        l(this.f19525e, decoderInputBuffer, bVar, this.f19523c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, f0.b bVar) {
        this.f19525e = l(this.f19525e, decoderInputBuffer, bVar, this.f19523c);
    }

    public void n() {
        a(this.f19524d);
        this.f19524d.d(0L, this.f19522b);
        a aVar = this.f19524d;
        this.f19525e = aVar;
        this.f19526f = aVar;
        this.f19527g = 0L;
        this.f19521a.d();
    }

    public void o() {
        this.f19525e = this.f19524d;
    }

    public int p(u7.h hVar, int i10, boolean z10) throws IOException {
        int iH = h(i10);
        a aVar = this.f19526f;
        int i11 = hVar.read(aVar.f19530c.f24927a, aVar.e(this.f19527g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(x7.a0 a0Var, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f19526f;
            a0Var.l(aVar.f19530c.f24927a, aVar.e(this.f19527g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
