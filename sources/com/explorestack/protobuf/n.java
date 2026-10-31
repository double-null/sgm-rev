package com.explorestack.protobuf;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f10639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f10641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    o f10642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10643e;

    /* JADX INFO: compiled from: CodedInputStream.java */
    private static final class b extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f10644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f10645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f10646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10647i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f10648j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f10649k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10650l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f10651m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f10652n;

        private void V() {
            int i10 = this.f10646h + this.f10647i;
            this.f10646h = i10;
            int i11 = i10 - this.f10649k;
            int i12 = this.f10652n;
            if (i11 <= i12) {
                this.f10647i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10647i = i13;
            this.f10646h = i10 - i13;
        }

        private void Y() throws IOException {
            if (this.f10646h - this.f10648j >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f10644f;
                int i11 = this.f10648j;
                this.f10648j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void a0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (P() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.explorestack.protobuf.n
        public <T extends MessageLite> T A(s1<T> s1Var, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            T partialFrom = s1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
            return partialFrom;
        }

        @Override // com.explorestack.protobuf.n
        public void B(MessageLite.Builder builder, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            builder.mergeFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.explorestack.protobuf.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int C() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f10648j
                int r1 = r5.f10646h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f10644f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f10648j = r3
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
                long r0 = r5.U()
                int r0 = (int) r0
                return r0
            L70:
                r5.f10648j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.b.C():int");
        }

        @Override // com.explorestack.protobuf.n
        public int E() throws IOException {
            return R();
        }

        @Override // com.explorestack.protobuf.n
        public long F() throws IOException {
            return S();
        }

        @Override // com.explorestack.protobuf.n
        public int G() throws IOException {
            return n.b(C());
        }

        @Override // com.explorestack.protobuf.n
        public long H() throws IOException {
            return n.c(T());
        }

        @Override // com.explorestack.protobuf.n
        public String I() throws IOException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f10646h;
                int i11 = this.f10648j;
                if (iC <= i10 - i11) {
                    String str = new String(this.f10644f, i11, iC, l0.f10621a);
                    this.f10648j += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.n
        public String J() throws IOException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f10646h;
                int i11 = this.f10648j;
                if (iC <= i10 - i11) {
                    String strH = a3.h(this.f10644f, i11, iC);
                    this.f10648j += iC;
                    return strH;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.n
        public int K() throws IOException {
            if (f()) {
                this.f10650l = 0;
                return 0;
            }
            int iC = C();
            this.f10650l = iC;
            if (c3.a(iC) != 0) {
                return this.f10650l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.n
        public int L() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long M() throws IOException {
            return T();
        }

        @Override // com.explorestack.protobuf.n
        public boolean O(int i10) throws IOException {
            int iB = c3.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(C());
                return true;
            }
            if (iB == 3) {
                W();
                a(c3.c(c3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            X(4);
            return true;
        }

        public byte P() throws IOException {
            int i10 = this.f10648j;
            if (i10 == this.f10646h) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f10644f;
            this.f10648j = i10 + 1;
            return bArr[i10];
        }

        public byte[] Q(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f10646h;
                int i12 = this.f10648j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f10648j = i13;
                    return Arrays.copyOfRange(this.f10644f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return l0.f10623c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int R() throws IOException {
            int i10 = this.f10648j;
            if (this.f10646h - i10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f10644f;
            this.f10648j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long S() throws IOException {
            int i10 = this.f10648j;
            if (this.f10646h - i10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f10644f;
            this.f10648j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long T() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f10648j
                int r1 = r11.f10646h
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f10644f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f10648j = r3
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
                long r0 = r11.U()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f10648j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.b.T():long");
        }

        long U() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bP = P();
                j10 |= ((long) (bP & 127)) << i10;
                if ((bP & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void W() throws IOException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        public void X(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f10646h;
                int i12 = this.f10648j;
                if (i10 <= i11 - i12) {
                    this.f10648j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.explorestack.protobuf.n
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f10650l != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.explorestack.protobuf.n
        public int d() {
            int i10 = this.f10652n;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - e();
        }

        @Override // com.explorestack.protobuf.n
        public int e() {
            return this.f10648j - this.f10649k;
        }

        @Override // com.explorestack.protobuf.n
        public boolean f() throws IOException {
            return this.f10648j == this.f10646h;
        }

        @Override // com.explorestack.protobuf.n
        public void o(int i10) {
            this.f10652n = i10;
            V();
        }

        @Override // com.explorestack.protobuf.n
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i11 = this.f10652n;
            if (iE > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10652n = iE;
            V();
            return i11;
        }

        @Override // com.explorestack.protobuf.n
        public boolean q() throws IOException {
            return T() != 0;
        }

        @Override // com.explorestack.protobuf.n
        public ByteString r() throws IOException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f10646h;
                int i11 = this.f10648j;
                if (iC <= i10 - i11) {
                    ByteString byteStringWrap = (this.f10645g && this.f10651m) ? ByteString.wrap(this.f10644f, i11, iC) : ByteString.copyFrom(this.f10644f, i11, iC);
                    this.f10648j += iC;
                    return byteStringWrap;
                }
            }
            return iC == 0 ? ByteString.EMPTY : ByteString.wrap(Q(iC));
        }

        @Override // com.explorestack.protobuf.n
        public double s() throws IOException {
            return Double.longBitsToDouble(S());
        }

        @Override // com.explorestack.protobuf.n
        public int t() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public int u() throws IOException {
            return R();
        }

        @Override // com.explorestack.protobuf.n
        public long v() throws IOException {
            return S();
        }

        @Override // com.explorestack.protobuf.n
        public float w() throws IOException {
            return Float.intBitsToFloat(R());
        }

        @Override // com.explorestack.protobuf.n
        public void x(int i10, MessageLite.Builder builder, y yVar) throws IOException {
            int i11 = this.f10639a;
            if (i11 >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f10639a = i11 + 1;
            builder.mergeFrom(this, yVar);
            a(c3.c(i10, 4));
            this.f10639a--;
        }

        @Override // com.explorestack.protobuf.n
        public int y() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long z() throws IOException {
            return T();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f10652n = Integer.MAX_VALUE;
            this.f10644f = bArr;
            this.f10646h = i11 + i10;
            this.f10648j = i10;
            this.f10649k = i10;
            this.f10645g = z10;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    private static final class c extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Iterable<ByteBuffer> f10653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Iterator<ByteBuffer> f10654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteBuffer f10655h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f10656i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f10657j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f10658k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10659l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10660m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f10661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f10662o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f10663p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f10664q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f10665r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f10666s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f10667t;

        private long P() {
            return this.f10667t - this.f10664q;
        }

        private void Q() throws InvalidProtocolBufferException {
            if (!this.f10654g.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            d0();
        }

        private void S(byte[] bArr, int i10, int i11) throws IOException {
            if (i11 < 0 || i11 > Y()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (P() == 0) {
                    Q();
                }
                int iMin = Math.min(i12, (int) P());
                long j10 = iMin;
                z2.p(this.f10664q, bArr, (i11 - i12) + i10, j10);
                i12 -= iMin;
                this.f10664q += j10;
            }
        }

        private void X() {
            int i10 = this.f10658k + this.f10659l;
            this.f10658k = i10;
            int i11 = i10 - this.f10663p;
            int i12 = this.f10660m;
            if (i11 <= i12) {
                this.f10659l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10659l = i13;
            this.f10658k = i10 - i13;
        }

        private int Y() {
            return (int) ((((long) (this.f10658k - this.f10662o)) - this.f10664q) + this.f10665r);
        }

        private void b0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer c0(int i10, int i11) throws IOException {
            int iPosition = this.f10655h.position();
            int iLimit = this.f10655h.limit();
            try {
                try {
                    this.f10655h.position(i10);
                    this.f10655h.limit(i11);
                    ByteBuffer byteBufferSlice = this.f10655h.slice();
                    this.f10655h.position(iPosition);
                    this.f10655h.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                this.f10655h.position(iPosition);
                this.f10655h.limit(iLimit);
                throw th;
            }
        }

        private void d0() {
            ByteBuffer next = this.f10654g.next();
            this.f10655h = next;
            this.f10662o += (int) (this.f10664q - this.f10665r);
            long jPosition = next.position();
            this.f10664q = jPosition;
            this.f10665r = jPosition;
            this.f10667t = this.f10655h.limit();
            long jK = z2.k(this.f10655h);
            this.f10666s = jK;
            this.f10664q += jK;
            this.f10665r += jK;
            this.f10667t += jK;
        }

        @Override // com.explorestack.protobuf.n
        public <T extends MessageLite> T A(s1<T> s1Var, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            T partialFrom = s1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
            return partialFrom;
        }

        @Override // com.explorestack.protobuf.n
        public void B(MessageLite.Builder builder, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            builder.mergeFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (com.explorestack.protobuf.z2.w(r4) < 0) goto L34;
         */
        @Override // com.explorestack.protobuf.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int C() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f10664q
                long r2 = r10.f10667t
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.explorestack.protobuf.z2.w(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f10664q
                long r4 = r4 + r2
                r10.f10664q = r4
                return r0
            L1a:
                long r6 = r10.f10667t
                long r8 = r10.f10664q
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.W()
                int r0 = (int) r0
                return r0
            L90:
                r10.f10664q = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.c.C():int");
        }

        @Override // com.explorestack.protobuf.n
        public int E() throws IOException {
            return T();
        }

        @Override // com.explorestack.protobuf.n
        public long F() throws IOException {
            return U();
        }

        @Override // com.explorestack.protobuf.n
        public int G() throws IOException {
            return n.b(C());
        }

        @Override // com.explorestack.protobuf.n
        public long H() throws IOException {
            return n.c(V());
        }

        @Override // com.explorestack.protobuf.n
        public String I() throws IOException {
            int iC = C();
            if (iC > 0) {
                long j10 = iC;
                long j11 = this.f10667t;
                long j12 = this.f10664q;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[iC];
                    z2.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, l0.f10621a);
                    this.f10664q += j10;
                    return str;
                }
            }
            if (iC > 0 && iC <= Y()) {
                byte[] bArr2 = new byte[iC];
                S(bArr2, 0, iC);
                return new String(bArr2, l0.f10621a);
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.n
        public String J() throws IOException {
            int iC = C();
            if (iC > 0) {
                long j10 = iC;
                long j11 = this.f10667t;
                long j12 = this.f10664q;
                if (j10 <= j11 - j12) {
                    String strG = a3.g(this.f10655h, (int) (j12 - this.f10665r), iC);
                    this.f10664q += j10;
                    return strG;
                }
            }
            if (iC >= 0 && iC <= Y()) {
                byte[] bArr = new byte[iC];
                S(bArr, 0, iC);
                return a3.h(bArr, 0, iC);
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.n
        public int K() throws IOException {
            if (f()) {
                this.f10661n = 0;
                return 0;
            }
            int iC = C();
            this.f10661n = iC;
            if (c3.a(iC) != 0) {
                return this.f10661n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.n
        public int L() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long M() throws IOException {
            return V();
        }

        @Override // com.explorestack.protobuf.n
        public boolean O(int i10) throws IOException {
            int iB = c3.b(i10);
            if (iB == 0) {
                b0();
                return true;
            }
            if (iB == 1) {
                a0(8);
                return true;
            }
            if (iB == 2) {
                a0(C());
                return true;
            }
            if (iB == 3) {
                Z();
                a(c3.c(c3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a0(4);
            return true;
        }

        public byte R() throws IOException {
            if (P() == 0) {
                Q();
            }
            long j10 = this.f10664q;
            this.f10664q = 1 + j10;
            return z2.w(j10);
        }

        public int T() throws IOException {
            if (P() < 4) {
                return (R() & 255) | ((R() & 255) << 8) | ((R() & 255) << 16) | ((R() & 255) << 24);
            }
            long j10 = this.f10664q;
            this.f10664q = 4 + j10;
            return ((z2.w(j10 + 3) & 255) << 24) | (z2.w(j10) & 255) | ((z2.w(1 + j10) & 255) << 8) | ((z2.w(2 + j10) & 255) << 16);
        }

        public long U() throws IOException {
            long jR;
            byte bR;
            if (P() >= 8) {
                long j10 = this.f10664q;
                this.f10664q = 8 + j10;
                jR = (((long) z2.w(j10)) & 255) | ((((long) z2.w(1 + j10)) & 255) << 8) | ((((long) z2.w(2 + j10)) & 255) << 16) | ((((long) z2.w(3 + j10)) & 255) << 24) | ((((long) z2.w(4 + j10)) & 255) << 32) | ((((long) z2.w(5 + j10)) & 255) << 40) | ((((long) z2.w(6 + j10)) & 255) << 48);
                bR = z2.w(j10 + 7);
            } else {
                jR = (((long) R()) & 255) | ((((long) R()) & 255) << 8) | ((((long) R()) & 255) << 16) | ((((long) R()) & 255) << 24) | ((((long) R()) & 255) << 32) | ((((long) R()) & 255) << 40) | ((((long) R()) & 255) << 48);
                bR = R();
            }
            return ((((long) bR) & 255) << 56) | jR;
        }

        public long V() throws IOException {
            long jW;
            long j10;
            long j11;
            int i10;
            long j12 = this.f10664q;
            if (this.f10667t != j12) {
                long j13 = j12 + 1;
                byte bW = z2.w(j12);
                if (bW >= 0) {
                    this.f10664q++;
                    return bW;
                }
                if (this.f10667t - this.f10664q >= 10) {
                    long j14 = j13 + 1;
                    int iW = bW ^ (z2.w(j13) << 7);
                    if (iW >= 0) {
                        long j15 = j14 + 1;
                        int iW2 = iW ^ (z2.w(j14) << 14);
                        if (iW2 < 0) {
                            j14 = j15 + 1;
                            int iW3 = iW2 ^ (z2.w(j15) << 21);
                            if (iW3 < 0) {
                                i10 = iW3 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long jW2 = ((long) iW3) ^ (((long) z2.w(j14)) << 28);
                                if (jW2 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j16 = j15 + 1;
                                    long jW3 = jW2 ^ (((long) z2.w(j15)) << 35);
                                    if (jW3 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        jW2 = jW3 ^ (((long) z2.w(j16)) << 42);
                                        if (jW2 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            jW3 = jW2 ^ (((long) z2.w(j15)) << 49);
                                            if (jW3 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                jW = (jW3 ^ (((long) z2.w(j16)) << 56)) ^ 71499008037633920L;
                                                if (jW < 0) {
                                                    long j17 = 1 + j15;
                                                    if (z2.w(j15) >= 0) {
                                                        j14 = j17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    jW = jW3 ^ j10;
                                    j14 = j16;
                                }
                                jW = jW2 ^ j11;
                            }
                            this.f10664q = j14;
                            return jW;
                        }
                        jW = iW2 ^ 16256;
                        j14 = j15;
                        this.f10664q = j14;
                        return jW;
                    }
                    i10 = iW ^ (-128);
                    jW = i10;
                    this.f10664q = j14;
                    return jW;
                }
            }
            return W();
        }

        long W() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bR = R();
                j10 |= ((long) (bR & 127)) << i10;
                if ((bR & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void Z() throws IOException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        @Override // com.explorestack.protobuf.n
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f10661n != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public void a0(int i10) throws IOException {
            if (i10 < 0 || i10 > (((long) (this.f10658k - this.f10662o)) - this.f10664q) + this.f10665r) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i10 > 0) {
                if (P() == 0) {
                    Q();
                }
                int iMin = Math.min(i10, (int) P());
                i10 -= iMin;
                this.f10664q += (long) iMin;
            }
        }

        @Override // com.explorestack.protobuf.n
        public int d() {
            int i10 = this.f10660m;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - e();
        }

        @Override // com.explorestack.protobuf.n
        public int e() {
            return (int) ((((long) (this.f10662o - this.f10663p)) + this.f10664q) - this.f10665r);
        }

        @Override // com.explorestack.protobuf.n
        public boolean f() throws IOException {
            return (((long) this.f10662o) + this.f10664q) - this.f10665r == ((long) this.f10658k);
        }

        @Override // com.explorestack.protobuf.n
        public void o(int i10) {
            this.f10660m = i10;
            X();
        }

        @Override // com.explorestack.protobuf.n
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i10 + e();
            int i11 = this.f10660m;
            if (iE > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10660m = iE;
            X();
            return i11;
        }

        @Override // com.explorestack.protobuf.n
        public boolean q() throws IOException {
            return V() != 0;
        }

        @Override // com.explorestack.protobuf.n
        public ByteString r() throws IOException {
            int iC = C();
            if (iC > 0) {
                long j10 = iC;
                long j11 = this.f10667t;
                long j12 = this.f10664q;
                if (j10 <= j11 - j12) {
                    if (this.f10656i && this.f10657j) {
                        int i10 = (int) (j12 - this.f10666s);
                        ByteString byteStringWrap = ByteString.wrap(c0(i10, iC + i10));
                        this.f10664q += j10;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[iC];
                    z2.p(j12, bArr, 0L, j10);
                    this.f10664q += j10;
                    return ByteString.wrap(bArr);
                }
            }
            if (iC <= 0 || iC > Y()) {
                if (iC == 0) {
                    return ByteString.EMPTY;
                }
                if (iC < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.f10656i || !this.f10657j) {
                byte[] bArr2 = new byte[iC];
                S(bArr2, 0, iC);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iC > 0) {
                if (P() == 0) {
                    Q();
                }
                int iMin = Math.min(iC, (int) P());
                int i11 = (int) (this.f10664q - this.f10666s);
                arrayList.add(ByteString.wrap(c0(i11, i11 + iMin)));
                iC -= iMin;
                this.f10664q += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.explorestack.protobuf.n
        public double s() throws IOException {
            return Double.longBitsToDouble(U());
        }

        @Override // com.explorestack.protobuf.n
        public int t() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public int u() throws IOException {
            return T();
        }

        @Override // com.explorestack.protobuf.n
        public long v() throws IOException {
            return U();
        }

        @Override // com.explorestack.protobuf.n
        public float w() throws IOException {
            return Float.intBitsToFloat(T());
        }

        @Override // com.explorestack.protobuf.n
        public void x(int i10, MessageLite.Builder builder, y yVar) throws IOException {
            int i11 = this.f10639a;
            if (i11 >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f10639a = i11 + 1;
            builder.mergeFrom(this, yVar);
            a(c3.c(i10, 4));
            this.f10639a--;
        }

        @Override // com.explorestack.protobuf.n
        public int y() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long z() throws IOException {
            return V();
        }

        private c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            super();
            this.f10660m = Integer.MAX_VALUE;
            this.f10658k = i10;
            this.f10653f = iterable;
            this.f10654g = iterable.iterator();
            this.f10656i = z10;
            this.f10662o = 0;
            this.f10663p = 0;
            if (i10 != 0) {
                d0();
                return;
            }
            this.f10655h = l0.f10624d;
            this.f10664q = 0L;
            this.f10665r = 0L;
            this.f10667t = 0L;
            this.f10666s = 0L;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    private static final class d extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InputStream f10668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f10669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f10670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10671i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f10672j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f10673k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10674l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10675m;

        private static int P(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private static int Q(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private ByteString R(int i10) throws IOException {
            byte[] bArrU = U(i10);
            if (bArrU != null) {
                return ByteString.copyFrom(bArrU);
            }
            int i11 = this.f10672j;
            int i12 = this.f10670h;
            int length = i12 - i11;
            this.f10674l += i12;
            this.f10672j = 0;
            this.f10670h = 0;
            List<byte[]> listV = V(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f10669g, i11, bArr, 0, length);
            for (byte[] bArr2 : listV) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] T(int i10, boolean z10) throws IOException {
            byte[] bArrU = U(i10);
            if (bArrU != null) {
                return z10 ? (byte[]) bArrU.clone() : bArrU;
            }
            int i11 = this.f10672j;
            int i12 = this.f10670h;
            int length = i12 - i11;
            this.f10674l += i12;
            this.f10672j = 0;
            this.f10670h = 0;
            List<byte[]> listV = V(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f10669g, i11, bArr, 0, length);
            for (byte[] bArr2 : listV) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] U(int i10) throws IOException {
            if (i10 == 0) {
                return l0.f10623c;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.f10674l;
            int i12 = this.f10672j;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f10641c > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i14 = this.f10675m;
            if (i13 > i14) {
                e0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i15 = this.f10670h - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > P(this.f10668f)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f10669g, this.f10672j, bArr, 0, i15);
            this.f10674l += this.f10670h;
            this.f10672j = 0;
            this.f10670h = 0;
            while (i15 < i10) {
                int iQ = Q(this.f10668f, bArr, i15, i10 - i15);
                if (iQ == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f10674l += iQ;
                i15 += iQ;
            }
            return bArr;
        }

        private List<byte[]> V(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f10668f.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f10674l += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void a0() {
            int i10 = this.f10670h + this.f10671i;
            this.f10670h = i10;
            int i11 = this.f10674l + i10;
            int i12 = this.f10675m;
            if (i11 <= i12) {
                this.f10671i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10671i = i13;
            this.f10670h = i10 - i13;
        }

        private void b0(int i10) throws IOException {
            if (j0(i10)) {
                return;
            }
            if (i10 <= (this.f10641c - this.f10674l) - this.f10672j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long c0(InputStream inputStream, long j10) throws IOException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private void f0(int i10) throws IOException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.f10674l;
            int i12 = this.f10672j;
            int i13 = i11 + i12 + i10;
            int i14 = this.f10675m;
            if (i13 > i14) {
                e0((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10674l = i11 + i12;
            int i15 = this.f10670h - i12;
            this.f10670h = 0;
            this.f10672j = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jC0 = c0(this.f10668f, j10);
                    if (jC0 < 0 || jC0 > j10) {
                        throw new IllegalStateException(this.f10668f.getClass() + "#skip returned invalid result: " + jC0 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jC0 == 0) {
                        break;
                    } else {
                        i15 += (int) jC0;
                    }
                } catch (Throwable th) {
                    this.f10674l += i15;
                    a0();
                    throw th;
                }
            }
            this.f10674l += i15;
            a0();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f10670h;
            int i17 = i16 - this.f10672j;
            this.f10672j = i16;
            b0(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f10670h;
                if (i18 <= i19) {
                    this.f10672j = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f10672j = i19;
                    b0(1);
                }
            }
        }

        private void g0() throws IOException {
            if (this.f10670h - this.f10672j >= 10) {
                h0();
            } else {
                i0();
            }
        }

        private void h0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f10669g;
                int i11 = this.f10672j;
                this.f10672j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void i0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean j0(int i10) throws IOException {
            int i11 = this.f10672j;
            int i12 = i11 + i10;
            int i13 = this.f10670h;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f10641c;
            int i15 = this.f10674l;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f10675m) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f10669g;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f10674l += i11;
                this.f10670h -= i11;
                this.f10672j = 0;
            }
            InputStream inputStream = this.f10668f;
            byte[] bArr2 = this.f10669g;
            int i16 = this.f10670h;
            int iQ = Q(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f10641c - this.f10674l) - i16));
            if (iQ == 0 || iQ < -1 || iQ > this.f10669g.length) {
                throw new IllegalStateException(this.f10668f.getClass() + "#read(byte[]) returned invalid result: " + iQ + "\nThe InputStream implementation is buggy.");
            }
            if (iQ <= 0) {
                return false;
            }
            this.f10670h += iQ;
            a0();
            if (this.f10670h >= i10) {
                return true;
            }
            return j0(i10);
        }

        @Override // com.explorestack.protobuf.n
        public <T extends MessageLite> T A(s1<T> s1Var, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            T partialFrom = s1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
            return partialFrom;
        }

        @Override // com.explorestack.protobuf.n
        public void B(MessageLite.Builder builder, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            builder.mergeFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.explorestack.protobuf.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int C() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f10672j
                int r1 = r5.f10670h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f10669g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f10672j = r3
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
                long r0 = r5.Z()
                int r0 = (int) r0
                return r0
            L70:
                r5.f10672j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.d.C():int");
        }

        @Override // com.explorestack.protobuf.n
        public int E() throws IOException {
            return W();
        }

        @Override // com.explorestack.protobuf.n
        public long F() throws IOException {
            return X();
        }

        @Override // com.explorestack.protobuf.n
        public int G() throws IOException {
            return n.b(C());
        }

        @Override // com.explorestack.protobuf.n
        public long H() throws IOException {
            return n.c(Y());
        }

        @Override // com.explorestack.protobuf.n
        public String I() throws IOException {
            int iC = C();
            if (iC > 0) {
                int i10 = this.f10670h;
                int i11 = this.f10672j;
                if (iC <= i10 - i11) {
                    String str = new String(this.f10669g, i11, iC, l0.f10621a);
                    this.f10672j += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC > this.f10670h) {
                return new String(T(iC, false), l0.f10621a);
            }
            b0(iC);
            String str2 = new String(this.f10669g, this.f10672j, iC, l0.f10621a);
            this.f10672j += iC;
            return str2;
        }

        @Override // com.explorestack.protobuf.n
        public String J() throws IOException {
            byte[] bArrT;
            int iC = C();
            int i10 = this.f10672j;
            int i11 = this.f10670h;
            if (iC <= i11 - i10 && iC > 0) {
                bArrT = this.f10669g;
                this.f10672j = i10 + iC;
            } else {
                if (iC == 0) {
                    return "";
                }
                i10 = 0;
                if (iC <= i11) {
                    b0(iC);
                    bArrT = this.f10669g;
                    this.f10672j = iC + 0;
                } else {
                    bArrT = T(iC, false);
                }
            }
            return a3.h(bArrT, i10, iC);
        }

        @Override // com.explorestack.protobuf.n
        public int K() throws IOException {
            if (f()) {
                this.f10673k = 0;
                return 0;
            }
            int iC = C();
            this.f10673k = iC;
            if (c3.a(iC) != 0) {
                return this.f10673k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.n
        public int L() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long M() throws IOException {
            return Y();
        }

        @Override // com.explorestack.protobuf.n
        public boolean O(int i10) throws IOException {
            int iB = c3.b(i10);
            if (iB == 0) {
                g0();
                return true;
            }
            if (iB == 1) {
                e0(8);
                return true;
            }
            if (iB == 2) {
                e0(C());
                return true;
            }
            if (iB == 3) {
                d0();
                a(c3.c(c3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            e0(4);
            return true;
        }

        public byte S() throws IOException {
            if (this.f10672j == this.f10670h) {
                b0(1);
            }
            byte[] bArr = this.f10669g;
            int i10 = this.f10672j;
            this.f10672j = i10 + 1;
            return bArr[i10];
        }

        public int W() throws IOException {
            int i10 = this.f10672j;
            if (this.f10670h - i10 < 4) {
                b0(4);
                i10 = this.f10672j;
            }
            byte[] bArr = this.f10669g;
            this.f10672j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long X() throws IOException {
            int i10 = this.f10672j;
            if (this.f10670h - i10 < 8) {
                b0(8);
                i10 = this.f10672j;
            }
            byte[] bArr = this.f10669g;
            this.f10672j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long Y() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f10672j
                int r1 = r11.f10670h
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f10669g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f10672j = r3
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
                long r0 = r11.Z()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f10672j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.d.Y():long");
        }

        long Z() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bS = S();
                j10 |= ((long) (bS & 127)) << i10;
                if ((bS & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.explorestack.protobuf.n
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f10673k != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.explorestack.protobuf.n
        public int d() {
            int i10 = this.f10675m;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f10674l + this.f10672j);
        }

        public void d0() throws IOException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        @Override // com.explorestack.protobuf.n
        public int e() {
            return this.f10674l + this.f10672j;
        }

        public void e0(int i10) throws IOException {
            int i11 = this.f10670h;
            int i12 = this.f10672j;
            if (i10 > i11 - i12 || i10 < 0) {
                f0(i10);
            } else {
                this.f10672j = i12 + i10;
            }
        }

        @Override // com.explorestack.protobuf.n
        public boolean f() throws IOException {
            return this.f10672j == this.f10670h && !j0(1);
        }

        @Override // com.explorestack.protobuf.n
        public void o(int i10) {
            this.f10675m = i10;
            a0();
        }

        @Override // com.explorestack.protobuf.n
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = i10 + this.f10674l + this.f10672j;
            int i12 = this.f10675m;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10675m = i11;
            a0();
            return i12;
        }

        @Override // com.explorestack.protobuf.n
        public boolean q() throws IOException {
            return Y() != 0;
        }

        @Override // com.explorestack.protobuf.n
        public ByteString r() throws IOException {
            int iC = C();
            int i10 = this.f10670h;
            int i11 = this.f10672j;
            if (iC > i10 - i11 || iC <= 0) {
                return iC == 0 ? ByteString.EMPTY : R(iC);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.f10669g, i11, iC);
            this.f10672j += iC;
            return byteStringCopyFrom;
        }

        @Override // com.explorestack.protobuf.n
        public double s() throws IOException {
            return Double.longBitsToDouble(X());
        }

        @Override // com.explorestack.protobuf.n
        public int t() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public int u() throws IOException {
            return W();
        }

        @Override // com.explorestack.protobuf.n
        public long v() throws IOException {
            return X();
        }

        @Override // com.explorestack.protobuf.n
        public float w() throws IOException {
            return Float.intBitsToFloat(W());
        }

        @Override // com.explorestack.protobuf.n
        public void x(int i10, MessageLite.Builder builder, y yVar) throws IOException {
            int i11 = this.f10639a;
            if (i11 >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f10639a = i11 + 1;
            builder.mergeFrom(this, yVar);
            a(c3.c(i10, 4));
            this.f10639a--;
        }

        @Override // com.explorestack.protobuf.n
        public int y() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long z() throws IOException {
            return Y();
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f10675m = Integer.MAX_VALUE;
            l0.b(inputStream, "input");
            this.f10668f = inputStream;
            this.f10669g = new byte[i10];
            this.f10670h = 0;
            this.f10672j = 0;
            this.f10674l = 0;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    /* JADX INFO: loaded from: classes2.dex */
    private static final class e extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ByteBuffer f10676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f10677g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f10678h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f10679i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f10680j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f10681k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f10682l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10683m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f10684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f10685o;

        private int P(long j10) {
            return (int) (j10 - this.f10678h);
        }

        static boolean Q() {
            return z2.K();
        }

        private void W() {
            long j10 = this.f10679i + ((long) this.f10682l);
            this.f10679i = j10;
            int i10 = (int) (j10 - this.f10681k);
            int i11 = this.f10685o;
            if (i10 <= i11) {
                this.f10682l = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f10682l = i12;
            this.f10679i = j10 - ((long) i12);
        }

        private int X() {
            return (int) (this.f10679i - this.f10680j);
        }

        private void a0() throws IOException {
            if (X() >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f10680j;
                this.f10680j = 1 + j10;
                if (z2.w(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void c0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer d0(long j10, long j11) throws IOException {
            int iPosition = this.f10676f.position();
            int iLimit = this.f10676f.limit();
            try {
                try {
                    this.f10676f.position(P(j10));
                    this.f10676f.limit(P(j11));
                    ByteBuffer byteBufferSlice = this.f10676f.slice();
                    this.f10676f.position(iPosition);
                    this.f10676f.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                this.f10676f.position(iPosition);
                this.f10676f.limit(iLimit);
                throw th;
            }
        }

        @Override // com.explorestack.protobuf.n
        public <T extends MessageLite> T A(s1<T> s1Var, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            T partialFrom = s1Var.parsePartialFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
            return partialFrom;
        }

        @Override // com.explorestack.protobuf.n
        public void B(MessageLite.Builder builder, y yVar) throws IOException {
            int iC = C();
            if (this.f10639a >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iP = p(iC);
            this.f10639a++;
            builder.mergeFrom(this, yVar);
            a(0);
            this.f10639a--;
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (com.explorestack.protobuf.z2.w(r4) < 0) goto L34;
         */
        @Override // com.explorestack.protobuf.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int C() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f10680j
                long r2 = r10.f10679i
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.explorestack.protobuf.z2.w(r0)
                if (r0 < 0) goto L17
                r10.f10680j = r4
                return r0
            L17:
                long r6 = r10.f10679i
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.explorestack.protobuf.z2.w(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.V()
                int r0 = (int) r0
                return r0
            L8b:
                r10.f10680j = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.e.C():int");
        }

        @Override // com.explorestack.protobuf.n
        public int E() throws IOException {
            return S();
        }

        @Override // com.explorestack.protobuf.n
        public long F() throws IOException {
            return T();
        }

        @Override // com.explorestack.protobuf.n
        public int G() throws IOException {
            return n.b(C());
        }

        @Override // com.explorestack.protobuf.n
        public long H() throws IOException {
            return n.c(U());
        }

        @Override // com.explorestack.protobuf.n
        public String J() throws IOException {
            int iC = C();
            if (iC > 0 && iC <= X()) {
                String strG = a3.g(this.f10676f, P(this.f10680j), iC);
                this.f10680j += (long) iC;
                return strG;
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.explorestack.protobuf.n
        public int K() throws IOException {
            if (f()) {
                this.f10683m = 0;
                return 0;
            }
            int iC = C();
            this.f10683m = iC;
            if (c3.a(iC) != 0) {
                return this.f10683m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.explorestack.protobuf.n
        public int L() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long M() throws IOException {
            return U();
        }

        @Override // com.explorestack.protobuf.n
        public boolean O(int i10) throws IOException {
            int iB = c3.b(i10);
            if (iB == 0) {
                a0();
                return true;
            }
            if (iB == 1) {
                Z(8);
                return true;
            }
            if (iB == 2) {
                Z(C());
                return true;
            }
            if (iB == 3) {
                Y();
                a(c3.c(c3.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Z(4);
            return true;
        }

        public byte R() throws IOException {
            long j10 = this.f10680j;
            if (j10 == this.f10679i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10680j = 1 + j10;
            return z2.w(j10);
        }

        public int S() throws IOException {
            long j10 = this.f10680j;
            if (this.f10679i - j10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10680j = 4 + j10;
            return ((z2.w(j10 + 3) & 255) << 24) | (z2.w(j10) & 255) | ((z2.w(1 + j10) & 255) << 8) | ((z2.w(2 + j10) & 255) << 16);
        }

        public long T() throws IOException {
            long j10 = this.f10680j;
            if (this.f10679i - j10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10680j = 8 + j10;
            return ((((long) z2.w(j10 + 7)) & 255) << 56) | (((long) z2.w(j10)) & 255) | ((((long) z2.w(1 + j10)) & 255) << 8) | ((((long) z2.w(2 + j10)) & 255) << 16) | ((((long) z2.w(3 + j10)) & 255) << 24) | ((((long) z2.w(4 + j10)) & 255) << 32) | ((((long) z2.w(5 + j10)) & 255) << 40) | ((((long) z2.w(6 + j10)) & 255) << 48);
        }

        public long U() throws IOException {
            long jW;
            long j10;
            long j11;
            int i10;
            long j12 = this.f10680j;
            if (this.f10679i != j12) {
                long j13 = j12 + 1;
                byte bW = z2.w(j12);
                if (bW >= 0) {
                    this.f10680j = j13;
                    return bW;
                }
                if (this.f10679i - j13 >= 9) {
                    long j14 = j13 + 1;
                    int iW = bW ^ (z2.w(j13) << 7);
                    if (iW >= 0) {
                        long j15 = j14 + 1;
                        int iW2 = iW ^ (z2.w(j14) << 14);
                        if (iW2 < 0) {
                            j14 = j15 + 1;
                            int iW3 = iW2 ^ (z2.w(j15) << 21);
                            if (iW3 < 0) {
                                i10 = iW3 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long jW2 = ((long) iW3) ^ (((long) z2.w(j14)) << 28);
                                if (jW2 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j16 = j15 + 1;
                                    long jW3 = jW2 ^ (((long) z2.w(j15)) << 35);
                                    if (jW3 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        jW2 = jW3 ^ (((long) z2.w(j16)) << 42);
                                        if (jW2 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            jW3 = jW2 ^ (((long) z2.w(j15)) << 49);
                                            if (jW3 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                jW = (jW3 ^ (((long) z2.w(j16)) << 56)) ^ 71499008037633920L;
                                                if (jW < 0) {
                                                    long j17 = 1 + j15;
                                                    if (z2.w(j15) >= 0) {
                                                        j14 = j17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    jW = jW3 ^ j10;
                                    j14 = j16;
                                }
                                jW = jW2 ^ j11;
                            }
                            this.f10680j = j14;
                            return jW;
                        }
                        jW = iW2 ^ 16256;
                        j14 = j15;
                        this.f10680j = j14;
                        return jW;
                    }
                    i10 = iW ^ (-128);
                    jW = i10;
                    this.f10680j = j14;
                    return jW;
                }
            }
            return V();
        }

        long V() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bR = R();
                j10 |= ((long) (bR & 127)) << i10;
                if ((bR & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void Y() throws IOException {
            int iK;
            do {
                iK = K();
                if (iK == 0) {
                    return;
                }
            } while (O(iK));
        }

        public void Z(int i10) throws IOException {
            if (i10 >= 0 && i10 <= X()) {
                this.f10680j += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // com.explorestack.protobuf.n
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f10683m != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.explorestack.protobuf.n
        public int d() {
            int i10 = this.f10685o;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - e();
        }

        @Override // com.explorestack.protobuf.n
        public int e() {
            return (int) (this.f10680j - this.f10681k);
        }

        @Override // com.explorestack.protobuf.n
        public boolean f() throws IOException {
            return this.f10680j == this.f10679i;
        }

        @Override // com.explorestack.protobuf.n
        public void o(int i10) {
            this.f10685o = i10;
            W();
        }

        @Override // com.explorestack.protobuf.n
        public int p(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i10 + e();
            int i11 = this.f10685o;
            if (iE > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f10685o = iE;
            W();
            return i11;
        }

        @Override // com.explorestack.protobuf.n
        public boolean q() throws IOException {
            return U() != 0;
        }

        @Override // com.explorestack.protobuf.n
        public ByteString r() throws IOException {
            int iC = C();
            if (iC <= 0 || iC > X()) {
                if (iC == 0) {
                    return ByteString.EMPTY;
                }
                if (iC < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f10677g && this.f10684n) {
                long j10 = this.f10680j;
                long j11 = iC;
                ByteBuffer byteBufferD0 = d0(j10, j10 + j11);
                this.f10680j += j11;
                return ByteString.wrap(byteBufferD0);
            }
            byte[] bArr = new byte[iC];
            long j12 = iC;
            z2.p(this.f10680j, bArr, 0L, j12);
            this.f10680j += j12;
            return ByteString.wrap(bArr);
        }

        @Override // com.explorestack.protobuf.n
        public double s() throws IOException {
            return Double.longBitsToDouble(T());
        }

        @Override // com.explorestack.protobuf.n
        public int t() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public int u() throws IOException {
            return S();
        }

        @Override // com.explorestack.protobuf.n
        public long v() throws IOException {
            return T();
        }

        @Override // com.explorestack.protobuf.n
        public float w() throws IOException {
            return Float.intBitsToFloat(S());
        }

        @Override // com.explorestack.protobuf.n
        public void x(int i10, MessageLite.Builder builder, y yVar) throws IOException {
            int i11 = this.f10639a;
            if (i11 >= this.f10640b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f10639a = i11 + 1;
            builder.mergeFrom(this, yVar);
            a(c3.c(i10, 4));
            this.f10639a--;
        }

        @Override // com.explorestack.protobuf.n
        public int y() throws IOException {
            return C();
        }

        @Override // com.explorestack.protobuf.n
        public long z() throws IOException {
            return U();
        }

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f10685o = Integer.MAX_VALUE;
            this.f10676f = byteBuffer;
            long jK = z2.k(byteBuffer);
            this.f10678h = jK;
            this.f10679i = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f10680j = jPosition;
            this.f10681k = jPosition;
            this.f10677g = z10;
        }

        @Override // com.explorestack.protobuf.n
        public String I() throws IOException {
            int iC = C();
            if (iC > 0 && iC <= X()) {
                byte[] bArr = new byte[iC];
                long j10 = iC;
                z2.p(this.f10680j, bArr, 0L, j10);
                String str = new String(bArr, l0.f10621a);
                this.f10680j += j10;
                return str;
            }
            if (iC == 0) {
                return KBBdKxoAiHo.vIpdvRvlusqKdJu;
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int D(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static n g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static n h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? l(l0.f10623c) : new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static n i(Iterable<ByteBuffer> iterable, boolean z10) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new c(iterable, iRemaining, z10) : g(new m0(iterable));
    }

    public static n j(ByteBuffer byteBuffer) {
        return k(byteBuffer, false);
    }

    static n k(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return n(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.Q()) {
            return new e(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return n(bArr, 0, iRemaining, true);
    }

    public static n l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static n m(byte[] bArr, int i10, int i11) {
        return n(bArr, i10, i11, false);
    }

    static n n(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.p(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract <T extends MessageLite> T A(s1<T> s1Var, y yVar) throws IOException;

    public abstract void B(MessageLite.Builder builder, y yVar) throws IOException;

    public abstract int C() throws IOException;

    public abstract int E() throws IOException;

    public abstract long F() throws IOException;

    public abstract int G() throws IOException;

    public abstract long H() throws IOException;

    public abstract String I() throws IOException;

    public abstract String J() throws IOException;

    public abstract int K() throws IOException;

    public abstract int L() throws IOException;

    public abstract long M() throws IOException;

    final boolean N() {
        return this.f10643e;
    }

    public abstract boolean O(int i10) throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract int e();

    public abstract boolean f() throws IOException;

    public abstract void o(int i10);

    public abstract int p(int i10) throws InvalidProtocolBufferException;

    public abstract boolean q() throws IOException;

    public abstract ByteString r() throws IOException;

    public abstract double s() throws IOException;

    public abstract int t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public abstract float w() throws IOException;

    public abstract void x(int i10, MessageLite.Builder builder, y yVar) throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;

    private n() {
        this.f10640b = 100;
        this.f10641c = Integer.MAX_VALUE;
        this.f10643e = false;
    }
}
