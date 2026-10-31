package com.explorestack.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f9688c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f9689d = z2.J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    p f9690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9691b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f9692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f9693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f9695h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f9692e = bArr;
            this.f9693f = bArr.length;
        }

        final void g1(byte b10) {
            byte[] bArr = this.f9692e;
            int i10 = this.f9694g;
            this.f9694g = i10 + 1;
            bArr[i10] = b10;
            this.f9695h++;
        }

        final void h1(int i10) {
            byte[] bArr = this.f9692e;
            int i11 = this.f9694g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f9694g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f9695h += 4;
        }

        final void i1(long j10) {
            byte[] bArr = this.f9692e;
            int i10 = this.f9694g;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f9694g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f9695h += 8;
        }

        final void j1(int i10) {
            if (i10 >= 0) {
                l1(i10);
            } else {
                m1(i10);
            }
        }

        final void k1(int i10, int i11) {
            l1(c3.c(i10, i11));
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final int l0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void l1(int i10) {
            if (!CodedOutputStream.f9689d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f9692e;
                    int i11 = this.f9694g;
                    this.f9694g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f9695h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f9692e;
                int i12 = this.f9694g;
                this.f9694g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f9695h++;
                return;
            }
            long j10 = this.f9694g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f9692e;
                int i13 = this.f9694g;
                this.f9694g = i13 + 1;
                z2.Q(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f9692e;
            int i14 = this.f9694g;
            this.f9694g = i14 + 1;
            z2.Q(bArr4, i14, (byte) i10);
            this.f9695h += (int) (((long) this.f9694g) - j10);
        }

        final void m1(long j10) {
            if (!CodedOutputStream.f9689d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f9692e;
                    int i10 = this.f9694g;
                    this.f9694g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f9695h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f9692e;
                int i11 = this.f9694g;
                this.f9694g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f9695h++;
                return;
            }
            long j11 = this.f9694g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f9692e;
                int i12 = this.f9694g;
                this.f9694g = i12 + 1;
                z2.Q(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f9692e;
            int i13 = this.f9694g;
            this.f9694g = i13 + 1;
            z2.Q(bArr4, i13, (byte) j10);
            this.f9695h += (int) (((long) this.f9694g) - j11);
        }
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f9700i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f9700i = outputStream;
        }

        private void n1() throws IOException {
            this.f9700i.write(this.f9692e, 0, this.f9694g);
            this.f9694g = 0;
        }

        private void o1(int i10) throws IOException {
            if (this.f9693f - this.f9694g < i10) {
                n1();
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void A0(long j10) throws IOException {
            o1(8);
            i1(j10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void H0(int i10, int i11) throws IOException {
            o1(20);
            k1(i10, 0);
            j1(i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void I0(int i10) throws IOException {
            if (i10 >= 0) {
                d1(i10);
            } else {
                f1(i10);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void L0(int i10, MessageLite messageLite) throws IOException {
            b1(i10, 2);
            N0(messageLite);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        void M0(int i10, MessageLite messageLite, b2 b2Var) throws IOException {
            b1(i10, 2);
            r1(messageLite, b2Var);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void N0(MessageLite messageLite) throws IOException {
            d1(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void O0(int i10, MessageLite messageLite) throws IOException {
            b1(1, 3);
            c1(2, i10);
            L0(3, messageLite);
            b1(1, 4);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void P0(int i10, ByteString byteString) throws IOException {
            b1(1, 3);
            c1(2, i10);
            r0(3, byteString);
            b1(1, 4);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void Z0(int i10, String str) throws IOException {
            b1(i10, 2);
            a1(str);
        }

        @Override // com.explorestack.protobuf.l
        public void a(ByteBuffer byteBuffer) throws IOException {
            p1(byteBuffer);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void a1(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iZ = CodedOutputStream.Z(length);
                int i10 = iZ + length;
                int i11 = this.f9693f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = a3.i(str, bArr, 0, length);
                    d1(i12);
                    b(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f9694g) {
                    n1();
                }
                int iZ2 = CodedOutputStream.Z(str.length());
                int i13 = this.f9694g;
                try {
                    if (iZ2 == iZ) {
                        int i14 = i13 + iZ2;
                        this.f9694g = i14;
                        int i15 = a3.i(str, this.f9692e, i14, this.f9693f - i14);
                        this.f9694g = i13;
                        iJ = (i15 - i13) - iZ2;
                        l1(iJ);
                        this.f9694g = i15;
                    } else {
                        iJ = a3.j(str);
                        l1(iJ);
                        this.f9694g = a3.i(str, this.f9692e, this.f9694g, iJ);
                    }
                    this.f9695h += iJ;
                } catch (a3.d e10) {
                    this.f9695h -= this.f9694g - i13;
                    this.f9694g = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (a3.d e12) {
                f0(str, e12);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream, com.explorestack.protobuf.l
        public void b(byte[] bArr, int i10, int i11) throws IOException {
            q1(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void b1(int i10, int i11) throws IOException {
            d1(c3.c(i10, i11));
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void c1(int i10, int i11) throws IOException {
            o1(20);
            k1(i10, 0);
            l1(i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void d1(int i10) throws IOException {
            o1(5);
            l1(i10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void e0() throws IOException {
            if (this.f9694g > 0) {
                n1();
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void e1(int i10, long j10) throws IOException {
            o1(20);
            k1(i10, 0);
            m1(j10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void f1(long j10) throws IOException {
            o1(10);
            m1(j10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void m0(byte b10) throws IOException {
            if (this.f9694g == this.f9693f) {
                n1();
            }
            g1(b10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void n0(int i10, boolean z10) throws IOException {
            o1(11);
            k1(i10, 0);
            g1(z10 ? (byte) 1 : (byte) 0);
        }

        public void p1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f9693f;
            int i11 = this.f9694g;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f9692e, i11, iRemaining);
                this.f9694g += iRemaining;
                this.f9695h += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f9692e, i11, i12);
            int i13 = iRemaining - i12;
            this.f9694g = this.f9693f;
            this.f9695h += i12;
            n1();
            while (true) {
                int i14 = this.f9693f;
                if (i13 <= i14) {
                    byteBuffer.get(this.f9692e, 0, i13);
                    this.f9694g = i13;
                    this.f9695h += i13;
                    return;
                } else {
                    byteBuffer.get(this.f9692e, 0, i14);
                    this.f9700i.write(this.f9692e, 0, this.f9693f);
                    int i15 = this.f9693f;
                    i13 -= i15;
                    this.f9695h += i15;
                }
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void q0(byte[] bArr, int i10, int i11) throws IOException {
            d1(i11);
            q1(bArr, i10, i11);
        }

        public void q1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f9693f;
            int i13 = this.f9694g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f9692e, i13, i11);
                this.f9694g += i11;
                this.f9695h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f9692e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f9694g = this.f9693f;
            this.f9695h += i14;
            n1();
            if (i16 <= this.f9693f) {
                System.arraycopy(bArr, i15, this.f9692e, 0, i16);
                this.f9694g = i16;
            } else {
                this.f9700i.write(bArr, i15, i16);
            }
            this.f9695h += i16;
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void r0(int i10, ByteString byteString) throws IOException {
            b1(i10, 2);
            s0(byteString);
        }

        void r1(MessageLite messageLite, b2 b2Var) throws IOException {
            d1(((com.explorestack.protobuf.a) messageLite).getSerializedSize(b2Var));
            b2Var.c(messageLite, this.f9690a);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void s0(ByteString byteString) throws IOException {
            d1(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void x0(int i10, int i11) throws IOException {
            o1(14);
            k1(i10, 5);
            h1(i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void y0(int i10) throws IOException {
            o1(4);
            h1(i10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void z0(int i10, long j10) throws IOException {
            o1(18);
            k1(i10, 1);
            i1(j10);
        }
    }

    public static int A(long j10) {
        return b0(j10);
    }

    public static int B(int i10, p0 p0Var) {
        return (X(1) * 2) + Y(2, i10) + C(3, p0Var);
    }

    public static int C(int i10, p0 p0Var) {
        return X(i10) + D(p0Var);
    }

    public static int D(p0 p0Var) {
        return E(p0Var.c());
    }

    static int E(int i10) {
        return Z(i10) + i10;
    }

    public static int F(int i10, MessageLite messageLite) {
        return (X(1) * 2) + Y(2, i10) + G(3, messageLite);
    }

    public static int G(int i10, MessageLite messageLite) {
        return X(i10) + I(messageLite);
    }

    static int H(int i10, MessageLite messageLite, b2 b2Var) {
        return X(i10) + J(messageLite, b2Var);
    }

    public static int I(MessageLite messageLite) {
        return E(messageLite.getSerializedSize());
    }

    static int J(MessageLite messageLite, b2 b2Var) {
        return E(((com.explorestack.protobuf.a) messageLite).getSerializedSize(b2Var));
    }

    static int K(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int L(int i10, ByteString byteString) {
        return (X(1) * 2) + Y(2, i10) + h(3, byteString);
    }

    @Deprecated
    public static int M(int i10) {
        return Z(i10);
    }

    public static int N(int i10, int i11) {
        return X(i10) + O(i11);
    }

    public static int O(int i10) {
        return 4;
    }

    public static int P(int i10, long j10) {
        return X(i10) + Q(j10);
    }

    public static int Q(long j10) {
        return 8;
    }

    public static int R(int i10, int i11) {
        return X(i10) + S(i11);
    }

    public static int S(int i10) {
        return Z(c0(i10));
    }

    public static int T(int i10, long j10) {
        return X(i10) + U(j10);
    }

    public static int U(long j10) {
        return b0(d0(j10));
    }

    public static int V(int i10, String str) {
        return X(i10) + W(str);
    }

    public static int W(String str) {
        int length;
        try {
            length = a3.j(str);
        } catch (a3.d unused) {
            length = str.getBytes(l0.f10621a).length;
        }
        return E(length);
    }

    public static int X(int i10) {
        return Z(c3.c(i10, 0));
    }

    public static int Y(int i10, int i11) {
        return X(i10) + Z(i11);
    }

    public static int Z(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int a0(int i10, long j10) {
        return X(i10) + b0(j10);
    }

    public static int b0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int c0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long d0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(int i10, boolean z10) {
        return X(i10) + f(z10);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return E(bArr.length);
    }

    public static int h(int i10, ByteString byteString) {
        return X(i10) + i(byteString);
    }

    public static CodedOutputStream h0(OutputStream outputStream) {
        return i0(outputStream, 4096);
    }

    public static int i(ByteString byteString) {
        return E(byteString.size());
    }

    public static CodedOutputStream i0(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int j(int i10, double d10) {
        return X(i10) + k(d10);
    }

    public static CodedOutputStream j0(byte[] bArr) {
        return k0(bArr, 0, bArr.length);
    }

    public static int k(double d10) {
        return 8;
    }

    public static CodedOutputStream k0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int l(int i10, int i11) {
        return X(i10) + m(i11);
    }

    public static int m(int i10) {
        return y(i10);
    }

    public static int n(int i10, int i11) {
        return X(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return X(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return X(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    @Deprecated
    public static int t(int i10, MessageLite messageLite) {
        return (X(i10) * 2) + v(messageLite);
    }

    @Deprecated
    static int u(int i10, MessageLite messageLite, b2 b2Var) {
        return (X(i10) * 2) + w(messageLite, b2Var);
    }

    @Deprecated
    public static int v(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    @Deprecated
    static int w(MessageLite messageLite, b2 b2Var) {
        return ((com.explorestack.protobuf.a) messageLite).getSerializedSize(b2Var);
    }

    public static int x(int i10, int i11) {
        return X(i10) + y(i11);
    }

    public static int y(int i10) {
        if (i10 >= 0) {
            return Z(i10);
        }
        return 10;
    }

    public static int z(int i10, long j10) {
        return X(i10) + A(j10);
    }

    public abstract void A0(long j10) throws IOException;

    public final void B0(int i10, float f10) throws IOException {
        x0(i10, Float.floatToRawIntBits(f10));
    }

    public final void C0(float f10) throws IOException {
        y0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void D0(int i10, MessageLite messageLite) throws IOException {
        b1(i10, 3);
        F0(messageLite);
        b1(i10, 4);
    }

    @Deprecated
    final void E0(int i10, MessageLite messageLite, b2 b2Var) throws IOException {
        b1(i10, 3);
        G0(messageLite, b2Var);
        b1(i10, 4);
    }

    @Deprecated
    public final void F0(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    @Deprecated
    final void G0(MessageLite messageLite, b2 b2Var) throws IOException {
        b2Var.c(messageLite, this.f9690a);
    }

    public abstract void H0(int i10, int i11) throws IOException;

    public abstract void I0(int i10) throws IOException;

    public final void J0(int i10, long j10) throws IOException {
        e1(i10, j10);
    }

    public final void K0(long j10) throws IOException {
        f1(j10);
    }

    public abstract void L0(int i10, MessageLite messageLite) throws IOException;

    abstract void M0(int i10, MessageLite messageLite, b2 b2Var) throws IOException;

    public abstract void N0(MessageLite messageLite) throws IOException;

    public abstract void O0(int i10, MessageLite messageLite) throws IOException;

    public abstract void P0(int i10, ByteString byteString) throws IOException;

    @Deprecated
    public final void Q0(int i10) throws IOException {
        d1(i10);
    }

    public final void R0(int i10, int i11) throws IOException {
        x0(i10, i11);
    }

    public final void S0(int i10) throws IOException {
        y0(i10);
    }

    public final void T0(int i10, long j10) throws IOException {
        z0(i10, j10);
    }

    public final void U0(long j10) throws IOException {
        A0(j10);
    }

    public final void V0(int i10, int i11) throws IOException {
        c1(i10, c0(i11));
    }

    public final void W0(int i10) throws IOException {
        d1(c0(i10));
    }

    public final void X0(int i10, long j10) throws IOException {
        e1(i10, d0(j10));
    }

    public final void Y0(long j10) throws IOException {
        f1(d0(j10));
    }

    public abstract void Z0(int i10, String str) throws IOException;

    public abstract void a1(String str) throws IOException;

    @Override // com.explorestack.protobuf.l
    public abstract void b(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void b1(int i10, int i11) throws IOException;

    public abstract void c1(int i10, int i11) throws IOException;

    public final void d() {
        if (l0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void d1(int i10) throws IOException;

    public abstract void e0() throws IOException;

    public abstract void e1(int i10, long j10) throws IOException;

    final void f0(String str, a3.d dVar) throws IOException {
        f9688c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(l0.f10621a);
        try {
            d1(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public abstract void f1(long j10) throws IOException;

    boolean g0() {
        return this.f9691b;
    }

    public abstract int l0();

    public abstract void m0(byte b10) throws IOException;

    public abstract void n0(int i10, boolean z10) throws IOException;

    public final void o0(boolean z10) throws IOException {
        m0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void p0(byte[] bArr) throws IOException {
        q0(bArr, 0, bArr.length);
    }

    abstract void q0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void r0(int i10, ByteString byteString) throws IOException;

    public abstract void s0(ByteString byteString) throws IOException;

    public final void t0(int i10, double d10) throws IOException {
        z0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void u0(double d10) throws IOException {
        A0(Double.doubleToRawLongBits(d10));
    }

    public final void v0(int i10, int i11) throws IOException {
        H0(i10, i11);
    }

    public final void w0(int i10) throws IOException {
        I0(i10);
    }

    public abstract void x0(int i10, int i11) throws IOException;

    public abstract void y0(int i10) throws IOException;

    public abstract void z0(int i10, long j10) throws IOException;

    private CodedOutputStream() {
    }

    private static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f9696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f9697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9699h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f9696e = bArr;
            this.f9697f = i10;
            this.f9699h = i10;
            this.f9698g = i12;
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void A0(long j10) throws IOException {
            try {
                byte[] bArr = this.f9696e;
                int i10 = this.f9699h;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f9699h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), 1), e10);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void H0(int i10, int i11) throws IOException {
            b1(i10, 0);
            I0(i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void I0(int i10) throws IOException {
            if (i10 >= 0) {
                d1(i10);
            } else {
                f1(i10);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void L0(int i10, MessageLite messageLite) throws IOException {
            b1(i10, 2);
            N0(messageLite);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        final void M0(int i10, MessageLite messageLite, b2 b2Var) throws IOException {
            b1(i10, 2);
            d1(((com.explorestack.protobuf.a) messageLite).getSerializedSize(b2Var));
            b2Var.c(messageLite, this.f9690a);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void N0(MessageLite messageLite) throws IOException {
            d1(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void O0(int i10, MessageLite messageLite) throws IOException {
            b1(1, 3);
            c1(2, i10);
            L0(3, messageLite);
            b1(1, 4);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void P0(int i10, ByteString byteString) throws IOException {
            b1(1, 3);
            c1(2, i10);
            r0(3, byteString);
            b1(1, 4);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void Z0(int i10, String str) throws IOException {
            b1(i10, 2);
            a1(str);
        }

        @Override // com.explorestack.protobuf.l
        public final void a(ByteBuffer byteBuffer) throws IOException {
            g1(byteBuffer);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void a1(String str) throws IOException {
            int i10 = this.f9699h;
            try {
                int iZ = CodedOutputStream.Z(str.length() * 3);
                int iZ2 = CodedOutputStream.Z(str.length());
                if (iZ2 == iZ) {
                    int i11 = i10 + iZ2;
                    this.f9699h = i11;
                    int i12 = a3.i(str, this.f9696e, i11, l0());
                    this.f9699h = i10;
                    d1((i12 - i10) - iZ2);
                    this.f9699h = i12;
                } else {
                    d1(a3.j(str));
                    this.f9699h = a3.i(str, this.f9696e, this.f9699h, l0());
                }
            } catch (a3.d e10) {
                this.f9699h = i10;
                f0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream, com.explorestack.protobuf.l
        public final void b(byte[] bArr, int i10, int i11) throws IOException {
            h1(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void b1(int i10, int i11) throws IOException {
            d1(c3.c(i10, i11));
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void c1(int i10, int i11) throws IOException {
            b1(i10, 0);
            d1(i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void d1(int i10) throws IOException {
            if (!CodedOutputStream.f9689d || com.explorestack.protobuf.d.c() || l0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f9696e;
                        int i11 = this.f9699h;
                        this.f9699h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f9696e;
                int i12 = this.f9699h;
                this.f9699h = i12 + 1;
                bArr2[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f9696e;
                int i13 = this.f9699h;
                this.f9699h = i13 + 1;
                z2.Q(bArr3, i13, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f9696e;
            int i14 = this.f9699h;
            this.f9699h = i14 + 1;
            z2.Q(bArr4, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                byte[] bArr5 = this.f9696e;
                int i16 = this.f9699h;
                this.f9699h = i16 + 1;
                z2.Q(bArr5, i16, (byte) i15);
                return;
            }
            byte[] bArr6 = this.f9696e;
            int i17 = this.f9699h;
            this.f9699h = i17 + 1;
            z2.Q(bArr6, i17, (byte) (i15 | 128));
            int i18 = i15 >>> 7;
            if ((i18 & (-128)) == 0) {
                byte[] bArr7 = this.f9696e;
                int i19 = this.f9699h;
                this.f9699h = i19 + 1;
                z2.Q(bArr7, i19, (byte) i18);
                return;
            }
            byte[] bArr8 = this.f9696e;
            int i20 = this.f9699h;
            this.f9699h = i20 + 1;
            z2.Q(bArr8, i20, (byte) (i18 | 128));
            int i21 = i18 >>> 7;
            if ((i21 & (-128)) == 0) {
                byte[] bArr9 = this.f9696e;
                int i22 = this.f9699h;
                this.f9699h = i22 + 1;
                z2.Q(bArr9, i22, (byte) i21);
                return;
            }
            byte[] bArr10 = this.f9696e;
            int i23 = this.f9699h;
            this.f9699h = i23 + 1;
            z2.Q(bArr10, i23, (byte) (i21 | 128));
            byte[] bArr11 = this.f9696e;
            int i24 = this.f9699h;
            this.f9699h = i24 + 1;
            z2.Q(bArr11, i24, (byte) (i21 >>> 7));
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void e1(int i10, long j10) throws IOException {
            b1(i10, 0);
            f1(j10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void f1(long j10) throws IOException {
            if (CodedOutputStream.f9689d && l0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f9696e;
                    int i10 = this.f9699h;
                    this.f9699h = i10 + 1;
                    z2.Q(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f9696e;
                int i11 = this.f9699h;
                this.f9699h = i11 + 1;
                z2.Q(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f9696e;
                    int i12 = this.f9699h;
                    this.f9699h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), 1), e10);
                }
            }
            byte[] bArr4 = this.f9696e;
            int i13 = this.f9699h;
            this.f9699h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void g1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f9696e, this.f9699h, iRemaining);
                this.f9699h += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), Integer.valueOf(iRemaining)), e10);
            }
        }

        public final void h1(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f9696e, this.f9699h, i11);
                this.f9699h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final int l0() {
            return this.f9698g - this.f9699h;
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void m0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f9696e;
                int i10 = this.f9699h;
                this.f9699h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), 1), e10);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void n0(int i10, boolean z10) throws IOException {
            b1(i10, 0);
            m0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void q0(byte[] bArr, int i10, int i11) throws IOException {
            d1(i11);
            h1(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void r0(int i10, ByteString byteString) throws IOException {
            b1(i10, 2);
            s0(byteString);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void s0(ByteString byteString) throws IOException {
            d1(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void x0(int i10, int i11) throws IOException {
            b1(i10, 5);
            y0(i11);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void y0(int i10) throws IOException {
            try {
                byte[] bArr = this.f9696e;
                int i11 = this.f9699h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f9699h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9699h), Integer.valueOf(this.f9698g), 1), e10);
            }
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public final void z0(int i10, long j10) throws IOException {
            b1(i10, 1);
            A0(j10);
        }

        @Override // com.explorestack.protobuf.CodedOutputStream
        public void e0() {
        }
    }
}
