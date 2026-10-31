package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f2144f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    i f2148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2149e;

    /* JADX INFO: compiled from: CodedInputStream.java */
    private static final class b extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f2150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f2151h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f2152i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f2153j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f2154k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f2155l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f2156m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f2157n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f2158o;

        private void O() {
            int i10 = this.f2152i + this.f2153j;
            this.f2152i = i10;
            int i11 = i10 - this.f2155l;
            int i12 = this.f2158o;
            if (i11 <= i12) {
                this.f2153j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2153j = i13;
            this.f2152i = i10 - i13;
        }

        private void Q() throws IOException {
            if (this.f2152i - this.f2154k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f2150g;
                int i11 = this.f2154k;
                this.f2154k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        private void S() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f2152i;
                int i11 = this.f2154k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f2150g, i11, iL, y.f2394b);
                    this.f2154k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.v();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f2152i;
                int i11 = this.f2154k;
                if (iL <= i10 - i11) {
                    String strA = o1.a(this.f2150g, i11, iL);
                    this.f2154k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.k();
            }
            throw InvalidProtocolBufferException.v();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws IOException {
            if (f()) {
                this.f2156m = 0;
                return 0;
            }
            int iL = L();
            this.f2156m = iL;
            if (p1.a(iL) != 0) {
                return this.f2156m;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) throws IOException {
            int iB = p1.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(p1.c(p1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.g();
            }
            P(4);
            return true;
        }

        public byte H() throws IOException {
            int i10 = this.f2154k;
            if (i10 == this.f2152i) {
                throw InvalidProtocolBufferException.v();
            }
            byte[] bArr = this.f2150g;
            this.f2154k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f2152i;
                int i12 = this.f2154k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f2154k = i13;
                    return Arrays.copyOfRange(this.f2150g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.v();
            }
            if (i10 == 0) {
                return y.f2396d;
            }
            throw InvalidProtocolBufferException.k();
        }

        public int J() throws IOException {
            int i10 = this.f2154k;
            if (this.f2152i - i10 < 4) {
                throw InvalidProtocolBufferException.v();
            }
            byte[] bArr = this.f2150g;
            this.f2154k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws IOException {
            int i10 = this.f2154k;
            if (this.f2152i - i10 < 8) {
                throw InvalidProtocolBufferException.v();
            }
            byte[] bArr = this.f2150g;
            this.f2154k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int L() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f2154k
                int r1 = r5.f2152i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f2150g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f2154k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.N()
                int r0 = (int) r0
                return r0
            L70:
                r5.f2154k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.L():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long M() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f2154k
                int r1 = r11.f2152i
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f2150g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f2154k = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.N()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f2154k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.b.M():long");
        }

        long N() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        public void P(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f2152i;
                int i12 = this.f2154k;
                if (i10 <= i11 - i12) {
                    this.f2154k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.v();
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f2156m != i10) {
                throw InvalidProtocolBufferException.c();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f2154k - this.f2155l;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() throws IOException {
            return this.f2154k == this.f2152i;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f2158o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.n();
            }
            int i11 = this.f2158o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.v();
            }
            this.f2158o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() throws IOException {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f2152i;
                int i11 = this.f2154k;
                if (iL <= i10 - i11) {
                    g gVarI = (this.f2151h && this.f2157n) ? g.I(this.f2150g, i11, iL) : g.o(this.f2150g, i11, iL);
                    this.f2154k += iL;
                    return gVarI;
                }
            }
            return iL == 0 ? g.f2126b : g.H(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() throws IOException {
            return h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() throws IOException {
            return h.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f2158o = Integer.MAX_VALUE;
            this.f2150g = bArr;
            this.f2152i = i11 + i10;
            this.f2154k = i10;
            this.f2155l = i10;
            this.f2151h = z10;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    private static final class c extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f2159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f2160h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f2161i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f2162j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f2163k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f2164l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f2165m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f2166n;

        private static int H(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.p();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.p();
                throw e10;
            }
        }

        private g J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return g.h(bArrM);
            }
            int i11 = this.f2163k;
            int i12 = this.f2161i;
            int length = i12 - i11;
            this.f2165m += i12;
            this.f2163k = 0;
            this.f2161i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2160h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return g.H(bArr);
        }

        private byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f2163k;
            int i12 = this.f2161i;
            int length = i12 - i11;
            this.f2165m += i12;
            this.f2163k = 0;
            this.f2161i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2160h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) throws IOException {
            if (i10 == 0) {
                return y.f2396d;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i11 = this.f2165m;
            int i12 = this.f2163k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f2147c > 0) {
                throw InvalidProtocolBufferException.t();
            }
            int i14 = this.f2166n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw InvalidProtocolBufferException.v();
            }
            int i15 = this.f2161i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f2159g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2160h, this.f2163k, bArr, 0, i15);
            this.f2165m += this.f2161i;
            this.f2163k = 0;
            this.f2161i = 0;
            while (i15 < i10) {
                int I = I(this.f2159g, bArr, i15, i10 - i15);
                if (I == -1) {
                    throw InvalidProtocolBufferException.v();
                }
                this.f2165m += I;
                i15 += I;
            }
            return bArr;
        }

        private List<byte[]> N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f2159g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.v();
                    }
                    this.f2165m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f2161i + this.f2162j;
            this.f2161i = i10;
            int i11 = this.f2165m + i10;
            int i12 = this.f2166n;
            if (i11 <= i12) {
                this.f2162j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2162j = i13;
            this.f2161i = i10 - i13;
        }

        private void U(int i10) throws IOException {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f2147c - this.f2165m) - this.f2163k) {
                throw InvalidProtocolBufferException.v();
            }
            throw InvalidProtocolBufferException.t();
        }

        private static long V(InputStream inputStream, long j10) throws IOException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.p();
                throw e10;
            }
        }

        private void X(int i10) throws IOException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i11 = this.f2165m;
            int i12 = this.f2163k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f2166n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw InvalidProtocolBufferException.v();
            }
            this.f2165m = i11 + i12;
            int i15 = this.f2161i - i12;
            this.f2161i = 0;
            this.f2163k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f2159g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f2159g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } catch (Throwable th) {
                    this.f2165m += i15;
                    T();
                    throw th;
                }
            }
            this.f2165m += i15;
            T();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f2161i;
            int i17 = i16 - this.f2163k;
            this.f2163k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f2161i;
                if (i18 <= i19) {
                    this.f2163k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f2163k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws IOException {
            if (this.f2161i - this.f2163k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f2160h;
                int i11 = this.f2163k;
                this.f2163k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        private void a0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        private boolean b0(int i10) throws IOException {
            int i11 = this.f2163k;
            int i12 = i11 + i10;
            int i13 = this.f2161i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f2147c;
            int i15 = this.f2165m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f2166n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f2160h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f2165m += i11;
                this.f2161i -= i11;
                this.f2163k = 0;
            }
            InputStream inputStream = this.f2159g;
            byte[] bArr2 = this.f2160h;
            int i16 = this.f2161i;
            int I = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f2147c - this.f2165m) - i16));
            if (I == 0 || I < -1 || I > this.f2160h.length) {
                throw new IllegalStateException(this.f2159g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f2161i += I;
            T();
            if (this.f2161i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws IOException {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f2161i;
                int i11 = this.f2163k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f2160h, i11, iQ, y.f2394b);
                    this.f2163k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw InvalidProtocolBufferException.k();
            }
            if (iQ > this.f2161i) {
                return new String(L(iQ, false), y.f2394b);
            }
            U(iQ);
            String str2 = new String(this.f2160h, this.f2163k, iQ, y.f2394b);
            this.f2163k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f2163k;
            int i11 = this.f2161i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f2160h;
                this.f2163k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw InvalidProtocolBufferException.k();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f2160h;
                    this.f2163k = iQ + 0;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return o1.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws IOException {
            if (f()) {
                this.f2164l = 0;
                return 0;
            }
            int iQ = Q();
            this.f2164l = iQ;
            if (p1.a(iQ) != 0) {
                return this.f2164l;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i10) throws IOException {
            int iB = p1.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(p1.c(p1.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.g();
            }
            W(4);
            return true;
        }

        public byte K() throws IOException {
            if (this.f2163k == this.f2161i) {
                U(1);
            }
            byte[] bArr = this.f2160h;
            int i10 = this.f2163k;
            this.f2163k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws IOException {
            int i10 = this.f2163k;
            if (this.f2161i - i10 < 4) {
                U(4);
                i10 = this.f2163k;
            }
            byte[] bArr = this.f2160h;
            this.f2163k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws IOException {
            int i10 = this.f2163k;
            if (this.f2161i - i10 < 8) {
                U(8);
                i10 = this.f2163k;
            }
            byte[] bArr = this.f2160h;
            this.f2163k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int Q() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f2163k
                int r1 = r5.f2161i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f2160h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f2163k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.S()
                int r0 = (int) r0
                return r0
            L70:
                r5.f2163k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.Q():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long R() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f2163k
                int r1 = r11.f2161i
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f2160h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f2163k = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.S()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f2163k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.c.R():long");
        }

        long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        public void W(int i10) throws IOException {
            int i11 = this.f2161i;
            int i12 = this.f2163k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f2163k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f2164l != i10) {
                throw InvalidProtocolBufferException.c();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f2165m + this.f2163k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() throws IOException {
            return this.f2163k == this.f2161i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i10) {
            this.f2166n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.k();
            }
            int i11 = i10 + this.f2165m + this.f2163k;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.n();
            }
            int i12 = this.f2166n;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.v();
            }
            this.f2166n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() throws IOException {
            int iQ = Q();
            int i10 = this.f2161i;
            int i11 = this.f2163k;
            if (iQ <= i10 - i11 && iQ > 0) {
                g gVarO = g.o(this.f2160h, i11, iQ);
                this.f2163k += iQ;
                return gVarO;
            }
            if (iQ == 0) {
                return g.f2126b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw InvalidProtocolBufferException.k();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() throws IOException {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() throws IOException {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() throws IOException {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() throws IOException {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() throws IOException {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() throws IOException {
            return h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() throws IOException {
            return h.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f2166n = Integer.MAX_VALUE;
            y.b(inputStream, "input");
            this.f2159g = inputStream;
            this.f2160h = new byte[i10];
            this.f2161i = 0;
            this.f2163k = 0;
            this.f2165m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static h h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(y.f2396d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static h k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A() throws IOException;

    public abstract String B() throws IOException;

    public abstract int C() throws IOException;

    public abstract int D() throws IOException;

    public abstract long E() throws IOException;

    public abstract boolean F(int i10) throws IOException;

    public void G() throws IOException {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f2145a++;
            zF = F(iC);
            this.f2145a--;
        } while (zF);
    }

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public void b() throws InvalidProtocolBufferException {
        if (this.f2145a >= this.f2146b) {
            throw InvalidProtocolBufferException.o();
        }
    }

    public abstract int e();

    public abstract boolean f() throws IOException;

    public abstract void l(int i10);

    public abstract int m(int i10) throws InvalidProtocolBufferException;

    public abstract boolean n() throws IOException;

    public abstract g o() throws IOException;

    public abstract double p() throws IOException;

    public abstract int q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract float t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;

    private h() {
        this.f2146b = f2144f;
        this.f2147c = Integer.MAX_VALUE;
        this.f2149e = false;
    }
}
