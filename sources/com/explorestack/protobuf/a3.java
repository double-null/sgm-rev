package com.explorestack.protobuf;

import com.applovin.shadow.okio.Utf8;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes.dex */
final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f10192a;

    /* JADX INFO: compiled from: Utf8.java */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iR = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
            cArr[i10] = l(iR);
            cArr[i10 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m(b12)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 < -62 || m(b11)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
        }

        private static int r(byte b10) {
            return b10 & Utf8.REPLACEMENT_BYTE;
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    static abstract class b {
        b() {
        }

        private static int j(ByteBuffer byteBuffer, int i10, int i11) {
            int iL = i10 + a3.l(byteBuffer, i10, i11);
            while (iL < i11) {
                int i12 = iL + 1;
                byte b10 = byteBuffer.get(iL);
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 < -62 || byteBuffer.get(i12) > -65) {
                            return -1;
                        }
                        i12++;
                    } else {
                        if (b10 >= -16) {
                            if (i12 >= i11 - 2) {
                                return a3.p(byteBuffer, b10, i12, i11 - i12);
                            }
                            int i13 = i12 + 1;
                            byte b11 = byteBuffer.get(i12);
                            if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                                int i14 = i13 + 1;
                                if (byteBuffer.get(i13) <= -65) {
                                    i12 = i14 + 1;
                                    if (byteBuffer.get(i14) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i12 >= i11 - 1) {
                            return a3.p(byteBuffer, b10, i12, i11 - i12);
                        }
                        int i15 = i12 + 1;
                        byte b12 = byteBuffer.get(i12);
                        if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || byteBuffer.get(i15) > -65))) {
                            return -1;
                        }
                        iL = i15 + 1;
                    }
                }
                iL = i12;
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i10, i11) : c(byteBuffer, i10, i11);
        }

        abstract String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        final String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!a.n(b10)) {
                    break;
                }
                i10++;
                a.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (a.n(b11)) {
                    int i16 = i14 + 1;
                    a.i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = byteBuffer.get(i15);
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.p(b11)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    a.k(b11, byteBuffer.get(i15), cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = i15 + 1;
                    a.j(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i18 = i15 + 1;
                    byte b13 = byteBuffer.get(i15);
                    int i19 = i18 + 1;
                    a.h(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        abstract String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException;

        abstract int e(CharSequence charSequence, byte[] bArr, int i10, int i11);

        final boolean f(ByteBuffer byteBuffer, int i10, int i11) {
            return h(0, byteBuffer, i10, i11) == 0;
        }

        final boolean g(byte[] bArr, int i10, int i11) {
            return i(0, bArr, i10, i11) == 0;
        }

        final int h(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? l(i10, byteBuffer, i11, i12) : k(i10, byteBuffer, i11, i12);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return i(i10, byteBuffer.array(), i11 + iArrayOffset, iArrayOffset + i12);
        }

        abstract int i(int i10, byte[] bArr, int i11, int i12);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.explorestack.protobuf.a3.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.explorestack.protobuf.a3.a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.explorestack.protobuf.a3.b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.a3.b.k(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int l(int i10, ByteBuffer byteBuffer, int i11, int i12);
    }

    /* JADX INFO: compiled from: Utf8.java */
    static final class c extends b {
        c() {
        }

        private static int m(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return n(bArr, i10, i11);
        }

        private static int n(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return a3.q(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i12 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return a3.q(bArr, i12, i11);
                    }
                    int i15 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i10 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // com.explorestack.protobuf.a3.b
        String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.n(b10)) {
                    break;
                }
                i10++;
                a.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.n(b11)) {
                    int i16 = i14 + 1;
                    a.i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.p(b11)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    a.k(b11, bArr[i15], cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = i15 + 1;
                    a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    a.h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.explorestack.protobuf.a3.b
        String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            return c(byteBuffer, i10, i11);
        }

        @Override // com.explorestack.protobuf.a3.b
        int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            char cCharAt;
            int length = charSequence.length();
            int i15 = i11 + i10;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i10 + length;
            }
            int i17 = i10 + i16;
            while (i16 < length) {
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt2 >= 128 || i17 >= i15) {
                    if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                        i17 = i18 + 1;
                        bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                    throw new d(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i20 = i17 + 1;
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    int i21 = i20 + 1;
                                    bArr[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i22 = i21 + 1;
                                    bArr[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 = i22 + 1;
                                    bArr[i22] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new d(i16 - 1, length);
                        }
                        int i23 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i12 = i24 + 1;
                        bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i16++;
                } else {
                    i12 = i17 + 1;
                    bArr[i17] = (byte) cCharAt2;
                }
                i17 = i12;
                i16++;
            }
            return i17;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.explorestack.protobuf.a3.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.explorestack.protobuf.a3.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.explorestack.protobuf.a3.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.explorestack.protobuf.a3.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.a3.c.i(int, byte[], int, int):int");
        }

        @Override // com.explorestack.protobuf.a3.b
        int l(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            return k(i10, byteBuffer, i11, i12);
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    static final class e extends b {
        e() {
        }

        static boolean m() {
            return z2.J() && z2.K();
        }

        private static int n(long j10, int i10) {
            long j11;
            int iP = p(j10, i10);
            long j12 = j10 + ((long) iP);
            int i11 = i10 - iP;
            while (true) {
                byte bW = 0;
                while (i11 > 0) {
                    long j13 = j12 + 1;
                    bW = z2.w(j12);
                    if (bW < 0) {
                        j12 = j13;
                        break;
                    }
                    i11--;
                    j12 = j13;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (bW < -32) {
                    if (i12 == 0) {
                        return bW;
                    }
                    i11 = i12 - 1;
                    if (bW >= -62) {
                        j11 = 1 + j12;
                        if (z2.w(j12) > -65) {
                        }
                    }
                    return -1;
                }
                if (bW >= -16) {
                    if (i12 < 3) {
                        return r(j12, bW, i12);
                    }
                    i11 = i12 - 3;
                    long j14 = j12 + 1;
                    byte bW2 = z2.w(j12);
                    if (bW2 <= -65 && (((bW << 28) + (bW2 + 112)) >> 30) == 0) {
                        long j15 = j14 + 1;
                        if (z2.w(j14) <= -65) {
                            j11 = 1 + j15;
                            if (z2.w(j15) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 < 2) {
                    return r(j12, bW, i12);
                }
                i11 = i12 - 2;
                long j16 = j12 + 1;
                byte bW3 = z2.w(j12);
                if (bW3 <= -65 && ((bW != -32 || bW3 >= -96) && (bW != -19 || bW3 < -96))) {
                    j11 = 1 + j16;
                    if (z2.w(j16) > -65) {
                    }
                }
                return -1;
                j12 = j11;
            }
        }

        private static int o(byte[] bArr, long j10, int i10) {
            long j11;
            int iQ = q(bArr, j10, i10);
            int i11 = i10 - iQ;
            long j12 = j10 + ((long) iQ);
            while (true) {
                byte bX = 0;
                while (i11 > 0) {
                    long j13 = j12 + 1;
                    bX = z2.x(bArr, j12);
                    if (bX < 0) {
                        j12 = j13;
                        break;
                    }
                    i11--;
                    j12 = j13;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (bX < -32) {
                    if (i12 == 0) {
                        return bX;
                    }
                    i11 = i12 - 1;
                    if (bX >= -62) {
                        j11 = 1 + j12;
                        if (z2.x(bArr, j12) > -65) {
                        }
                    }
                    return -1;
                }
                if (bX >= -16) {
                    if (i12 < 3) {
                        return s(bArr, bX, j12, i12);
                    }
                    i11 = i12 - 3;
                    long j14 = j12 + 1;
                    byte bX2 = z2.x(bArr, j12);
                    if (bX2 <= -65 && (((bX << 28) + (bX2 + 112)) >> 30) == 0) {
                        long j15 = j14 + 1;
                        if (z2.x(bArr, j14) <= -65) {
                            j11 = 1 + j15;
                            if (z2.x(bArr, j15) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 < 2) {
                    return s(bArr, bX, j12, i12);
                }
                i11 = i12 - 2;
                long j16 = j12 + 1;
                byte bX3 = z2.x(bArr, j12);
                if (bX3 <= -65 && ((bX != -32 || bX3 >= -96) && (bX != -19 || bX3 < -96))) {
                    j11 = 1 + j16;
                    if (z2.x(bArr, j16) > -65) {
                    }
                }
                return -1;
                j12 = j11;
            }
        }

        private static int p(long j10, int i10) {
            if (i10 < 16) {
                return 0;
            }
            int i11 = 8 - (((int) j10) & 7);
            int i12 = i11;
            while (i12 > 0) {
                long j11 = 1 + j10;
                if (z2.w(j10) < 0) {
                    return i11 - i12;
                }
                i12--;
                j10 = j11;
            }
            int i13 = i10 - i11;
            while (i13 >= 8 && (z2.D(j10) & (-9187201950435737472L)) == 0) {
                j10 += 8;
                i13 -= 8;
            }
            return i10 - i13;
        }

        private static int q(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            while (i11 < i10) {
                long j11 = 1 + j10;
                if (z2.x(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            return i10;
        }

        private static int r(long j10, int i10, int i11) {
            if (i11 == 0) {
                return a3.m(i10);
            }
            if (i11 == 1) {
                return a3.n(i10, z2.w(j10));
            }
            if (i11 == 2) {
                return a3.o(i10, z2.w(j10), z2.w(j10 + 1));
            }
            throw new AssertionError();
        }

        private static int s(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return a3.m(i10);
            }
            if (i11 == 1) {
                return a3.n(i10, z2.x(bArr, j10));
            }
            if (i11 == 2) {
                return a3.o(i10, z2.x(bArr, j10), z2.x(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.explorestack.protobuf.a3.b
        String b(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte bX = z2.x(bArr, i10);
                if (!a.n(bX)) {
                    break;
                }
                i10++;
                a.i(bX, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte bX2 = z2.x(bArr, i10);
                if (a.n(bX2)) {
                    int i16 = i14 + 1;
                    a.i(bX2, cArr, i14);
                    while (i15 < i12) {
                        byte bX3 = z2.x(bArr, i15);
                        if (!a.n(bX3)) {
                            break;
                        }
                        i15++;
                        a.i(bX3, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.p(bX2)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    a.k(bX2, z2.x(bArr, i15), cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(bX2)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i17 = i15 + 1;
                    a.j(bX2, z2.x(bArr, i15), z2.x(bArr, i17), cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i18 = i15 + 1;
                    byte bX4 = z2.x(bArr, i15);
                    int i19 = i18 + 1;
                    a.h(bX2, bX4, z2.x(bArr, i18), z2.x(bArr, i19), cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.explorestack.protobuf.a3.b
        String d(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long jK = z2.k(byteBuffer) + ((long) i10);
            long j10 = ((long) i11) + jK;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (jK < j10) {
                byte bW = z2.w(jK);
                if (!a.n(bW)) {
                    break;
                }
                jK++;
                a.i(bW, cArr, i12);
                i12++;
            }
            while (true) {
                int i13 = i12;
                while (jK < j10) {
                    long j11 = jK + 1;
                    byte bW2 = z2.w(jK);
                    if (a.n(bW2)) {
                        int i14 = i13 + 1;
                        a.i(bW2, cArr, i13);
                        while (j11 < j10) {
                            byte bW3 = z2.w(j11);
                            if (!a.n(bW3)) {
                                break;
                            }
                            j11++;
                            a.i(bW3, cArr, i14);
                            i14++;
                        }
                        i13 = i14;
                        jK = j11;
                    } else if (a.p(bW2)) {
                        if (j11 >= j10) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        jK = j11 + 1;
                        a.k(bW2, z2.w(j11), cArr, i13);
                        i13++;
                    } else if (a.o(bW2)) {
                        if (j11 >= j10 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j12 = j11 + 1;
                        a.j(bW2, z2.w(j11), z2.w(j12), cArr, i13);
                        i13++;
                        jK = j12 + 1;
                    } else {
                        if (j11 >= j10 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j13 = j11 + 1;
                        byte bW4 = z2.w(j11);
                        long j14 = j13 + 1;
                        byte bW5 = z2.w(j13);
                        jK = j14 + 1;
                        a.h(bW2, bW4, bW5, z2.w(j14), cArr, i13);
                        i12 = i13 + 1 + 1;
                    }
                }
                return new String(cArr, 0, i13);
            }
        }

        @Override // com.explorestack.protobuf.a3.b
        int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            char c11;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = ((long) i11) + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                z2.Q(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    z2.Q(bArr, j13, (byte) cCharAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (cCharAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    z2.Q(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    long j17 = j16 + j10;
                    z2.Q(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j19 = j13 + 1;
                                z2.Q(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                z2.Q(bArr, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j21 = j20 + 1;
                                z2.Q(bArr, j20, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 = 1;
                                j11 = j21 + 1;
                                z2.Q(bArr, j21, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    long j22 = j13 + j10;
                    z2.Q(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    z2.Q(bArr, j22, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    z2.Q(bArr, j23, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j23 + 1;
                    j12 = 1;
                    c11 = 128;
                }
                i13++;
                c10 = c11;
                long j24 = j12;
                j13 = j11;
                j10 = j24;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.explorestack.protobuf.z2.x(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.explorestack.protobuf.z2.x(r13, r2) > (-65)) goto L59;
         */
        @Override // com.explorestack.protobuf.a3.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int i(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.a3.e.i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (com.explorestack.protobuf.z2.w(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (com.explorestack.protobuf.z2.w(r2) > (-65)) goto L59;
         */
        @Override // com.explorestack.protobuf.a3.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.a3.e.l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f10192a = (!e.m() || com.explorestack.protobuf.d.c()) ? new c() : new e();
    }

    static String g(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        return f10192a.a(byteBuffer, i10, i11);
    }

    static String h(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return f10192a.b(bArr, i10, i11);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f10192a.e(charSequence, bArr, i10, i11);
    }

    static int j(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iK = length;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt >= 2048) {
                iK += k(charSequence, i10);
                break;
            }
            iK += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iK >= length) {
            return iK;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iK) + 4294967296L));
    }

    private static int k(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 - 7;
        int i13 = i10;
        while (i13 < i12 && (byteBuffer.getLong(i13) & (-9187201950435737472L)) == 0) {
            i13 += 8;
        }
        return i13 - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            return m(i10);
        }
        if (i12 == 1) {
            return n(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return o(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return m(b10);
        }
        if (i12 == 1) {
            return n(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return o(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    static boolean r(ByteBuffer byteBuffer) {
        return f10192a.f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean s(byte[] bArr) {
        return f10192a.g(bArr, 0, bArr.length);
    }

    public static boolean t(byte[] bArr, int i10, int i11) {
        return f10192a.g(bArr, i10, i11);
    }

    static int u(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        return f10192a.h(i10, byteBuffer, i11, i12);
    }

    public static int v(int i10, byte[] bArr, int i11, int i12) {
        return f10192a.i(i10, bArr, i11, i12);
    }
}
