package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes.dex */
final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f2253a;

    /* JADX INFO: compiled from: Utf8.java */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw InvalidProtocolBufferException.f();
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
                throw InvalidProtocolBufferException.f();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 < -62 || m(b11)) {
                throw InvalidProtocolBufferException.f();
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

        abstract String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        abstract int b(String str, byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: compiled from: Utf8.java */
    static final class c extends b {
        c() {
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
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
                        throw InvalidProtocolBufferException.f();
                    }
                    a.k(b11, bArr[i15], cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.f();
                    }
                    int i17 = i15 + 1;
                    a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.f();
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

        @Override // androidx.datastore.preferences.protobuf.o1.b
        int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            char cCharAt;
            int length = str.length();
            int i15 = i11 + i10;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i10 + length;
            }
            int i17 = i10 + i16;
            while (i16 < length) {
                char cCharAt2 = str.charAt(i16);
                if (cCharAt2 >= 128 || i17 >= i15) {
                    if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                        i17 = i18 + 1;
                        bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                                    throw new d(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt3 = str.charAt(i19);
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

        static boolean c() {
            return n1.B() && n1.C();
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            Charset charset = y.f2394b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw InvalidProtocolBufferException.f();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        int b(String str, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            char c11;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = ((long) i11) + j13;
            int length = str.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (cCharAt = str.charAt(i13)) >= 128) {
                    break;
                }
                n1.H(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    n1.H(bArr, j13, (byte) cCharAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (cCharAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    n1.H(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    long j17 = j16 + j10;
                    n1.H(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j19 = j13 + 1;
                                n1.H(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                n1.H(bArr, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j21 = j20 + 1;
                                n1.H(bArr, j20, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 = 1;
                                j11 = j21 + 1;
                                n1.H(bArr, j21, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    long j22 = j13 + j10;
                    n1.H(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    n1.H(bArr, j22, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    n1.H(bArr, j23, (byte) ((cCharAt2 & '?') | 128));
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
    }

    static {
        f2253a = (!e.c() || androidx.datastore.preferences.protobuf.d.c()) ? new c() : new e();
    }

    static String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return f2253a.a(bArr, i10, i11);
    }

    static int b(String str, byte[] bArr, int i10, int i11) {
        return f2253a.b(str, bArr, i10, i11);
    }

    static int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int iD = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                iD += d(str, i10);
                break;
            }
            iD += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iD >= length) {
            return iD;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iD) + 4294967296L));
    }

    private static int d(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }
}
