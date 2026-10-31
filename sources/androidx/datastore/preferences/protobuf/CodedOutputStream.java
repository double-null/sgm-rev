package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f2082c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f2083d = n1.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j f2084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2085b;

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
        final byte[] f2086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f2087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2088g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2089h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f2086e = bArr;
            this.f2087f = bArr.length;
        }

        final void a1(byte b10) {
            byte[] bArr = this.f2086e;
            int i10 = this.f2088g;
            this.f2088g = i10 + 1;
            bArr[i10] = b10;
            this.f2089h++;
        }

        final void b1(int i10) {
            byte[] bArr = this.f2086e;
            int i11 = this.f2088g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f2088g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f2089h += 4;
        }

        final void c1(long j10) {
            byte[] bArr = this.f2086e;
            int i10 = this.f2088g;
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
            this.f2088g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f2089h += 8;
        }

        final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1(i10);
            }
        }

        final void e1(int i10, int i11) {
            f1(p1.c(i10, i11));
        }

        final void f1(int i10) {
            if (!CodedOutputStream.f2083d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f2086e;
                    int i11 = this.f2088g;
                    this.f2088g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f2089h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f2086e;
                int i12 = this.f2088g;
                this.f2088g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f2089h++;
                return;
            }
            long j10 = this.f2088g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f2086e;
                int i13 = this.f2088g;
                this.f2088g = i13 + 1;
                n1.H(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f2086e;
            int i14 = this.f2088g;
            this.f2088g = i14 + 1;
            n1.H(bArr4, i14, (byte) i10);
            this.f2089h += (int) (((long) this.f2088g) - j10);
        }

        final void g1(long j10) {
            if (!CodedOutputStream.f2083d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f2086e;
                    int i10 = this.f2088g;
                    this.f2088g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f2089h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2086e;
                int i11 = this.f2088g;
                this.f2088g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f2089h++;
                return;
            }
            long j11 = this.f2088g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f2086e;
                int i12 = this.f2088g;
                this.f2088g = i12 + 1;
                n1.H(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f2086e;
            int i13 = this.f2088g;
            this.f2088g = i13 + 1;
            n1.H(bArr4, i13, (byte) j10);
            this.f2089h += (int) (((long) this.f2088g) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f2094i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f2094i = outputStream;
        }

        private void h1() throws IOException {
            this.f2094i.write(this.f2086e, 0, this.f2088g);
            this.f2088g = 0;
        }

        private void i1(int i10) throws IOException {
            if (this.f2087f - this.f2088g < i10) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void E0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void H0(int i10, p0 p0Var, e1 e1Var) throws IOException {
            V0(i10, 2);
            l1(p0Var, e1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(p0 p0Var) throws IOException {
            X0(p0Var.getSerializedSize());
            p0Var.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J0(int i10, p0 p0Var) throws IOException {
            V0(1, 3);
            W0(2, i10);
            k1(3, p0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(int i10, g gVar) throws IOException {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void U0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iW = CodedOutputStream.W(length);
                int i10 = iW + length;
                int i11 = this.f2087f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = o1.b(str, bArr, 0, length);
                    X0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f2088g) {
                    h1();
                }
                int iW2 = CodedOutputStream.W(str.length());
                int i12 = this.f2088g;
                try {
                    if (iW2 == iW) {
                        int i13 = i12 + iW2;
                        this.f2088g = i13;
                        int iB2 = o1.b(str, this.f2086e, i13, this.f2087f - i13);
                        this.f2088g = i12;
                        iC = (iB2 - i12) - iW2;
                        f1(iC);
                        this.f2088g = iB2;
                    } else {
                        iC = o1.c(str);
                        f1(iC);
                        this.f2088g = o1.b(str, this.f2086e, this.f2088g, iC);
                    }
                    this.f2089h += iC;
                } catch (o1.d e10) {
                    this.f2089h -= this.f2088g - i12;
                    this.f2088g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (o1.d e12) {
                c0(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void V0(int i10, int i11) throws IOException {
            X0(p1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void X0(int i10) throws IOException {
            i1(5);
            f1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int i10, long j10) throws IOException {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Z0(long j10) throws IOException {
            i1(10);
            g1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.f
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0() throws IOException {
            if (this.f2088g > 0) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i0(byte b10) throws IOException {
            if (this.f2088g == this.f2087f) {
                h1();
            }
            a1(b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j0(int i10, boolean z10) throws IOException {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : (byte) 0);
        }

        public void j1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f2087f;
            int i13 = this.f2088g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f2086e, i13, i11);
                this.f2088g += i11;
                this.f2089h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f2086e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f2088g = this.f2087f;
            this.f2089h += i14;
            h1();
            if (i16 <= this.f2087f) {
                System.arraycopy(bArr, i15, this.f2086e, 0, i16);
                this.f2088g = i16;
            } else {
                this.f2094i.write(bArr, i15, i16);
            }
            this.f2089h += i16;
        }

        public void k1(int i10, p0 p0Var) throws IOException {
            V0(i10, 2);
            I0(p0Var);
        }

        void l1(p0 p0Var, e1 e1Var) throws IOException {
            X0(((androidx.datastore.preferences.protobuf.a) p0Var).f(e1Var));
            e1Var.b(p0Var, this.f2084a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void m0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            j1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(int i10, g gVar) throws IOException {
            V0(i10, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(g gVar) throws IOException {
            X0(gVar.size());
            gVar.K(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t0(int i10, int i11) throws IOException {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u0(int i10) throws IOException {
            i1(4);
            b1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i10, long j10) throws IOException {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(long j10) throws IOException {
            i1(8);
            c1(j10);
        }
    }

    public static int A(int i10, b0 b0Var) {
        return U(i10) + B(b0Var);
    }

    public static int B(b0 b0Var) {
        return C(b0Var.b());
    }

    static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, p0 p0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, p0Var);
    }

    public static int E(int i10, p0 p0Var) {
        return U(i10) + G(p0Var);
    }

    static int F(int i10, p0 p0Var, e1 e1Var) {
        return U(i10) + H(p0Var, e1Var);
    }

    public static int G(p0 p0Var) {
        return C(p0Var.getSerializedSize());
    }

    static int H(p0 p0Var, e1 e1Var) {
        return C(((androidx.datastore.preferences.protobuf.a) p0Var).f(e1Var));
    }

    static int I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int J(int i10, g gVar) {
        return (U(1) * 2) + V(2, i10) + g(3, gVar);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = o1.c(str);
        } catch (o1.d unused) {
            length = str.getBytes(y.f2394b).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(p1.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static CodedOutputStream e0(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i10, g gVar) {
        return U(i10) + h(gVar);
    }

    public static CodedOutputStream g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int h(g gVar) {
        return C(gVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, p0 p0Var, e1 e1Var) {
        return (U(i10) * 2) + u(p0Var, e1Var);
    }

    @Deprecated
    public static int t(p0 p0Var) {
        return p0Var.getSerializedSize();
    }

    @Deprecated
    static int u(p0 p0Var, e1 e1Var) {
        return ((androidx.datastore.preferences.protobuf.a) p0Var).f(e1Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        return Y(i10);
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, b0 b0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, b0Var);
    }

    @Deprecated
    final void A0(int i10, p0 p0Var, e1 e1Var) throws IOException {
        V0(i10, 3);
        C0(p0Var, e1Var);
        V0(i10, 4);
    }

    @Deprecated
    public final void B0(p0 p0Var) throws IOException {
        p0Var.a(this);
    }

    @Deprecated
    final void C0(p0 p0Var, e1 e1Var) throws IOException {
        e1Var.b(p0Var, this.f2084a);
    }

    public abstract void D0(int i10, int i11) throws IOException;

    public abstract void E0(int i10) throws IOException;

    public final void F0(int i10, long j10) throws IOException {
        Y0(i10, j10);
    }

    public final void G0(long j10) throws IOException {
        Z0(j10);
    }

    abstract void H0(int i10, p0 p0Var, e1 e1Var) throws IOException;

    public abstract void I0(p0 p0Var) throws IOException;

    public abstract void J0(int i10, p0 p0Var) throws IOException;

    public abstract void K0(int i10, g gVar) throws IOException;

    public final void L0(int i10, int i11) throws IOException {
        t0(i10, i11);
    }

    public final void M0(int i10) throws IOException {
        u0(i10);
    }

    public final void N0(int i10, long j10) throws IOException {
        v0(i10, j10);
    }

    public final void O0(long j10) throws IOException {
        w0(j10);
    }

    public final void P0(int i10, int i11) throws IOException {
        W0(i10, Z(i11));
    }

    public final void Q0(int i10) throws IOException {
        X0(Z(i10));
    }

    public final void R0(int i10, long j10) throws IOException {
        Y0(i10, a0(j10));
    }

    public final void S0(long j10) throws IOException {
        Z0(a0(j10));
    }

    public abstract void T0(int i10, String str) throws IOException;

    public abstract void U0(String str) throws IOException;

    public abstract void V0(int i10, int i11) throws IOException;

    public abstract void W0(int i10, int i11) throws IOException;

    public abstract void X0(int i10) throws IOException;

    public abstract void Y0(int i10, long j10) throws IOException;

    public abstract void Z0(long j10) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.f
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void b0() throws IOException;

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c0(String str, o1.d dVar) throws IOException {
        f2082c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.f2394b);
        try {
            X0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean d0() {
        return this.f2085b;
    }

    public abstract int h0();

    public abstract void i0(byte b10) throws IOException;

    public abstract void j0(int i10, boolean z10) throws IOException;

    public final void k0(boolean z10) throws IOException {
        i0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void l0(byte[] bArr) throws IOException {
        m0(bArr, 0, bArr.length);
    }

    abstract void m0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void n0(int i10, g gVar) throws IOException;

    public abstract void o0(g gVar) throws IOException;

    public final void p0(int i10, double d10) throws IOException {
        v0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void q0(double d10) throws IOException {
        w0(Double.doubleToRawLongBits(d10));
    }

    public final void r0(int i10, int i11) throws IOException {
        D0(i10, i11);
    }

    public final void s0(int i10) throws IOException {
        E0(i10);
    }

    public abstract void t0(int i10, int i11) throws IOException;

    public abstract void u0(int i10) throws IOException;

    public abstract void v0(int i10, long j10) throws IOException;

    public abstract void w0(long j10) throws IOException;

    public final void x0(int i10, float f10) throws IOException {
        t0(i10, Float.floatToRawIntBits(f10));
    }

    public final void y0(float f10) throws IOException {
        u0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void z0(int i10, p0 p0Var) throws IOException {
        V0(i10, 3);
        B0(p0Var);
        V0(i10, 4);
    }

    private CodedOutputStream() {
    }

    private static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f2090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f2091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f2092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f2093h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f2090e = bArr;
            this.f2091f = i10;
            this.f2093h = i10;
            this.f2092g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(int i10, int i11) throws IOException {
            V0(i10, 0);
            E0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void H0(int i10, p0 p0Var, e1 e1Var) throws IOException {
            V0(i10, 2);
            X0(((androidx.datastore.preferences.protobuf.a) p0Var).f(e1Var));
            e1Var.b(p0Var, this.f2084a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I0(p0 p0Var) throws IOException {
            X0(p0Var.getSerializedSize());
            p0Var.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J0(int i10, p0 p0Var) throws IOException {
            V0(1, 3);
            W0(2, i10);
            b1(3, p0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(int i10, g gVar) throws IOException {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U0(String str) throws IOException {
            int i10 = this.f2093h;
            try {
                int iW = CodedOutputStream.W(str.length() * 3);
                int iW2 = CodedOutputStream.W(str.length());
                if (iW2 == iW) {
                    int i11 = i10 + iW2;
                    this.f2093h = i11;
                    int iB = o1.b(str, this.f2090e, i11, h0());
                    this.f2093h = i10;
                    X0((iB - i10) - iW2);
                    this.f2093h = iB;
                } else {
                    X0(o1.c(str));
                    this.f2093h = o1.b(str, this.f2090e, this.f2093h, h0());
                }
            } catch (o1.d e10) {
                this.f2093h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V0(int i10, int i11) throws IOException {
            X0(p1.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(int i10, int i11) throws IOException {
            V0(i10, 0);
            X0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X0(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f2090e;
                    int i11 = this.f2093h;
                    this.f2093h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093h), Integer.valueOf(this.f2092g), 1), e10);
                }
            }
            byte[] bArr2 = this.f2090e;
            int i12 = this.f2093h;
            this.f2093h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int i10, long j10) throws IOException {
            V0(i10, 0);
            Z0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z0(long j10) throws IOException {
            if (CodedOutputStream.f2083d && h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f2090e;
                    int i10 = this.f2093h;
                    this.f2093h = i10 + 1;
                    n1.H(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2090e;
                int i11 = this.f2093h;
                this.f2093h = i11 + 1;
                n1.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f2090e;
                    int i12 = this.f2093h;
                    this.f2093h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093h), Integer.valueOf(this.f2092g), 1), e10);
                }
            }
            byte[] bArr4 = this.f2090e;
            int i13 = this.f2093h;
            this.f2093h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.f
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            a1(bArr, i10, i11);
        }

        public final void a1(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f2090e, this.f2093h, i11);
                this.f2093h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093h), Integer.valueOf(this.f2092g), Integer.valueOf(i11)), e10);
            }
        }

        public final void b1(int i10, p0 p0Var) throws IOException {
            V0(i10, 2);
            I0(p0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int h0() {
            return this.f2092g - this.f2093h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f2090e;
                int i10 = this.f2093h;
                this.f2093h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093h), Integer.valueOf(this.f2092g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j0(int i10, boolean z10) throws IOException {
            V0(i10, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            a1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n0(int i10, g gVar) throws IOException {
            V0(i10, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o0(g gVar) throws IOException {
            X0(gVar.size());
            gVar.K(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(int i10, int i11) throws IOException {
            V0(i10, 5);
            u0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(int i10) throws IOException {
            try {
                byte[] bArr = this.f2090e;
                int i11 = this.f2093h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f2093h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093h), Integer.valueOf(this.f2092g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i10, long j10) throws IOException {
            V0(i10, 1);
            w0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j10) throws IOException {
            try {
                byte[] bArr = this.f2090e;
                int i10 = this.f2093h;
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
                this.f2093h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093h), Integer.valueOf(this.f2092g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0() {
        }
    }
}
