package af;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.internal.Buffer;
import com.facebook.internal.NativeProtocol;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f353b;

    /* JADX INFO: compiled from: Buffer.kt */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f355b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f357d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f356c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f358e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f359f = -1;

        public final void b(x xVar) {
            this.f355b = xVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f354a != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f354a = null;
            b(null);
            this.f356c = -1L;
            this.f357d = null;
            this.f358e = -1;
            this.f359f = -1;
        }
    }

    public final h B() {
        if (size() <= 2147483647L) {
            return C((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final h C(int i10) {
        if (i10 == 0) {
            return h.f362e;
        }
        af.b.b(size(), 0L, i10);
        x xVar = this.f352a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.t.c(xVar);
            int i14 = xVar.f403c;
            int i15 = xVar.f402b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            xVar = xVar.f406f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        x xVar2 = this.f352a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.t.c(xVar2);
            bArr[i16] = xVar2.f401a;
            i11 += xVar2.f403c - xVar2.f402b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = xVar2.f402b;
            xVar2.f404d = true;
            i16++;
            xVar2 = xVar2.f406f;
        }
        return new z(bArr, iArr);
    }

    public final x F(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        x xVar = this.f352a;
        if (xVar != null) {
            kotlin.jvm.internal.t.c(xVar);
            x xVar2 = xVar.f407g;
            kotlin.jvm.internal.t.c(xVar2);
            return (xVar2.f403c + i10 > 8192 || !xVar2.f405e) ? xVar2.c(y.c()) : xVar2;
        }
        x xVarC = y.c();
        this.f352a = xVarC;
        xVarC.f407g = xVarC;
        xVarC.f406f = xVarC;
        return xVarC;
    }

    @Override // af.f
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public e D(h byteString) {
        kotlin.jvm.internal.t.f(byteString, "byteString");
        byteString.K(this, 0, byteString.F());
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source) {
        kotlin.jvm.internal.t.f(source, "source");
        return write(source, 0, source.length);
    }

    @Override // af.f
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.t.f(source, "source");
        long j10 = i11;
        af.b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            x xVarF = F(1);
            int iMin = Math.min(i12 - i10, 8192 - xVarF.f403c);
            int i13 = i10 + iMin;
            kotlin.collections.m.d(source, xVarF.f401a, xVarF.f403c, i10, i13);
            xVarF.f403c += iMin;
            i10 = i13;
        }
        z(size() + j10);
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e writeByte(int i10) {
        x xVarF = F(1);
        byte[] bArr = xVarF.f401a;
        int i11 = xVarF.f403c;
        xVarF.f403c = i11 + 1;
        bArr[i11] = (byte) i10;
        z(size() + 1);
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public e writeDecimalLong(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        x xVarF = F(i10);
        byte[] bArr = xVarF.f401a;
        int i11 = xVarF.f403c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = bf.a.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        xVarF.f403c += i10;
        z(size() + ((long) i10));
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public e writeHexadecimalUnsignedLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        x xVarF = F(i10);
        byte[] bArr = xVarF.f401a;
        int i11 = xVarF.f403c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = bf.a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        xVarF.f403c += i10;
        z(size() + ((long) i10));
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        x xVarF = F(4);
        byte[] bArr = xVarF.f401a;
        int i11 = xVarF.f403c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        xVarF.f403c = i14 + 1;
        z(size() + 4);
        return this;
    }

    public e U(int i10) {
        return writeInt(af.b.f(i10));
    }

    @Override // af.f
    public long V(c0 source) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // af.f
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public e writeShort(int i10) {
        x xVarF = F(2);
        byte[] bArr = xVarF.f401a;
        int i11 = xVarF.f403c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        xVarF.f403c = i12 + 1;
        z(size() + 2);
        return this;
    }

    public e a0(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.t.f(string, "string");
        kotlin.jvm.internal.t.f(charset, "charset");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.t.a(charset, rd.d.f24999b)) {
            return j0(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    public final void b() throws EOFException {
        skip(size());
    }

    public e e0(String string, Charset charset) {
        kotlin.jvm.internal.t.f(string, "string");
        kotlin.jvm.internal.t.f(charset, "charset");
        return a0(string, 0, string.length(), charset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (size() == eVar.size()) {
                if (size() == 0) {
                    return true;
                }
                x xVar = this.f352a;
                kotlin.jvm.internal.t.c(xVar);
                x xVar2 = eVar.f352a;
                kotlin.jvm.internal.t.c(xVar2);
                int i10 = xVar.f402b;
                int i11 = xVar2.f402b;
                long j10 = 0;
                while (j10 < size()) {
                    long jMin = Math.min(xVar.f403c - i10, xVar2.f403c - i11);
                    long j11 = 0;
                    while (j11 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (xVar.f401a[i10] == xVar2.f401a[i11]) {
                            j11++;
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == xVar.f403c) {
                        xVar = xVar.f406f;
                        kotlin.jvm.internal.t.c(xVar);
                        i10 = xVar.f402b;
                    }
                    if (i11 == xVar2.f403c) {
                        xVar2 = xVar2.f406f;
                        kotlin.jvm.internal.t.c(xVar2);
                        i11 = xVar2.f402b;
                    }
                    j10 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // af.g
    public boolean exhausted() {
        return this.f353b == 0;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return n();
    }

    public int hashCode() {
        x xVar = this.f352a;
        if (xVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = xVar.f403c;
            for (int i12 = xVar.f402b; i12 < i11; i12++) {
                i10 = (i10 * 31) + xVar.f401a[i12];
            }
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
        } while (xVar != this.f352a);
        return i10;
    }

    @Override // af.f
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public e writeUtf8(String string) {
        kotlin.jvm.internal.t.f(string, "string");
        return j0(string, 0, string.length());
    }

    public long indexOf(byte b10, long j10, long j11) {
        x xVar;
        int i10;
        long size = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (xVar = this.f352a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                xVar = xVar.f407g;
                kotlin.jvm.internal.t.c(xVar);
                size -= (long) (xVar.f403c - xVar.f402b);
            }
            while (size < j11) {
                byte[] bArr = xVar.f401a;
                int iMin = (int) Math.min(xVar.f403c, (((long) xVar.f402b) + j11) - size);
                i10 = (int) ((((long) xVar.f402b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (xVar.f403c - xVar.f402b);
                xVar = xVar.f406f;
                kotlin.jvm.internal.t.c(xVar);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (xVar.f403c - xVar.f402b)) + size;
            if (j12 > j10) {
                break;
            }
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = xVar.f401a;
            int iMin2 = (int) Math.min(xVar.f403c, (((long) xVar.f402b) + j11) - size);
            i10 = (int) ((((long) xVar.f402b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (xVar.f403c - xVar.f402b);
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - xVar.f402b)) + size;
    }

    @Override // af.g
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public e j0(String string, int i10, int i11) {
        char cCharAt;
        kotlin.jvm.internal.t.f(string, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                x xVarF = F(1);
                byte[] bArr = xVarF.f401a;
                int i12 = xVarF.f403c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = xVarF.f403c;
                int i15 = (i12 + i10) - i14;
                xVarF.f403c = i14 + i15;
                z(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    x xVarF2 = F(2);
                    byte[] bArr2 = xVarF2.f401a;
                    int i16 = xVarF2.f403c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    xVarF2.f403c = i16 + 2;
                    z(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    x xVarF3 = F(3);
                    byte[] bArr3 = xVarF3.f401a;
                    int i17 = xVarF3.f403c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    xVarF3.f403c = i17 + 3;
                    z(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                            x xVarF4 = F(4);
                            byte[] bArr4 = xVarF4.f401a;
                            int i20 = xVarF4.f403c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            xVarF4.f403c = i20 + 4;
                            z(size() + 4);
                            i10 += 2;
                        }
                    }
                    writeByte(63);
                    i10 = i18;
                }
                i10++;
            }
        }
        return this;
    }

    public final long k() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        x xVar = this.f352a;
        kotlin.jvm.internal.t.c(xVar);
        x xVar2 = xVar.f407g;
        kotlin.jvm.internal.t.c(xVar2);
        int i10 = xVar2.f403c;
        if (i10 < 8192 && xVar2.f405e) {
            size -= (long) (i10 - xVar2.f402b);
        }
        return size;
    }

    public e k0(int i10) {
        if (i10 < 128) {
            writeByte(i10);
        } else if (i10 < 2048) {
            x xVarF = F(2);
            byte[] bArr = xVarF.f401a;
            int i11 = xVarF.f403c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            xVarF.f403c = i11 + 2;
            z(size() + 2);
        } else {
            boolean z10 = false;
            if (55296 <= i10 && i10 < 57344) {
                z10 = true;
            }
            if (z10) {
                writeByte(63);
            } else if (i10 < 65536) {
                x xVarF2 = F(3);
                byte[] bArr2 = xVarF2.f401a;
                int i12 = xVarF2.f403c;
                bArr2[i12] = (byte) ((i10 >> 12) | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
                bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                xVarF2.f403c = i12 + 3;
                z(size() + 3);
            } else {
                if (i10 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + af.b.i(i10));
                }
                x xVarF3 = F(4);
                byte[] bArr3 = xVarF3.f401a;
                int i13 = xVarF3.f403c;
                bArr3[i13] = (byte) ((i10 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                xVarF3.f403c = i13 + 4;
                z(size() + 4);
            }
        }
        return this;
    }

    @Override // af.g
    public int l0(t options) throws EOFException {
        kotlin.jvm.internal.t.f(options, "options");
        int iD = bf.a.d(this, options, false, 2, null);
        if (iD == -1) {
            return -1;
        }
        skip(options.g()[iD].F());
        return iD;
    }

    @Override // af.g
    public long m(a0 sink) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.y(this, size);
        }
        return size;
    }

    public final e n() {
        e eVar = new e();
        if (size() != 0) {
            x xVar = this.f352a;
            kotlin.jvm.internal.t.c(xVar);
            x xVarD = xVar.d();
            eVar.f352a = xVarD;
            xVarD.f407g = xVarD;
            xVarD.f406f = xVarD;
            for (x xVar2 = xVar.f406f; xVar2 != xVar; xVar2 = xVar2.f406f) {
                x xVar3 = xVarD.f407g;
                kotlin.jvm.internal.t.c(xVar3);
                kotlin.jvm.internal.t.c(xVar2);
                xVar3.c(xVar2.d());
            }
            eVar.z(size());
        }
        return eVar;
    }

    public final e o(e out, long j10, long j11) {
        kotlin.jvm.internal.t.f(out, "out");
        af.b.b(size(), j10, j11);
        if (j11 != 0) {
            out.z(out.size() + j11);
            x xVar = this.f352a;
            while (true) {
                kotlin.jvm.internal.t.c(xVar);
                int i10 = xVar.f403c;
                int i11 = xVar.f402b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                xVar = xVar.f406f;
            }
            while (j11 > 0) {
                kotlin.jvm.internal.t.c(xVar);
                x xVarD = xVar.d();
                int i12 = xVarD.f402b + ((int) j10);
                xVarD.f402b = i12;
                xVarD.f403c = Math.min(i12 + ((int) j11), xVarD.f403c);
                x xVar2 = out.f352a;
                if (xVar2 == null) {
                    xVarD.f407g = xVarD;
                    xVarD.f406f = xVarD;
                    out.f352a = xVarD;
                } else {
                    kotlin.jvm.internal.t.c(xVar2);
                    x xVar3 = xVar2.f407g;
                    kotlin.jvm.internal.t.c(xVar3);
                    xVar3.c(xVarD);
                }
                j11 -= (long) (xVarD.f403c - xVarD.f402b);
                xVar = xVar.f406f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        x xVar = this.f352a;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), xVar.f403c - xVar.f402b);
        sink.put(xVar.f401a, xVar.f402b, iMin);
        int i10 = xVar.f402b + iMin;
        xVar.f402b = i10;
        this.f353b -= (long) iMin;
        if (i10 == xVar.f403c) {
            this.f352a = xVar.b();
            y.b(xVar);
        }
        return iMin;
    }

    @Override // af.g
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        x xVar = this.f352a;
        kotlin.jvm.internal.t.c(xVar);
        int i10 = xVar.f402b;
        int i11 = xVar.f403c;
        int i12 = i10 + 1;
        byte b10 = xVar.f401a[i10];
        z(size() - 1);
        if (i12 == i11) {
            this.f352a = xVar.b();
            y.b(xVar);
        } else {
            xVar.f402b = i12;
        }
        return b10;
    }

    @Override // af.g
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // af.g
    public h readByteString() {
        return readByteString(size());
    }

    @Override // af.g
    public long readDecimalLong() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z11 = false;
        do {
            x xVar = this.f352a;
            kotlin.jvm.internal.t.c(xVar);
            byte[] bArr = xVar.f401a;
            int i11 = xVar.f402b;
            int i12 = xVar.f403c;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j10 < Buffer.OVERFLOW_ZONE || (j10 == Buffer.OVERFLOW_ZONE && i13 < j11)) {
                        e eVarWriteByte = new e().writeDecimalLong(j10).writeByte(b10);
                        if (!z10) {
                            eVarWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + eVarWriteByte.readUtf8());
                    }
                    j10 = (j10 * 10) + ((long) i13);
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.f352a = xVar.b();
                y.b(xVar);
            } else {
                xVar.f402b = i11;
            }
            if (z11) {
                break;
            }
        } while (this.f352a != null);
        z(size() - ((long) i10));
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + af.b.h(t(0L)));
    }

    public void readFully(byte[] sink) throws EOFException {
        kotlin.jvm.internal.t.f(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // af.g
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i10;
        int i11;
        if (size() == 0) {
            throw new EOFException();
        }
        int i12 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            x xVar = this.f352a;
            kotlin.jvm.internal.t.c(xVar);
            byte[] bArr = xVar.f401a;
            int i13 = xVar.f402b;
            int i14 = xVar.f403c;
            while (i13 < i14) {
                byte b10 = bArr[i13];
                if (b10 < 48 || b10 > 57) {
                    if (b10 >= 97 && b10 <= 102) {
                        i10 = b10 - 97;
                    } else {
                        if (b10 < 65 || b10 > 70) {
                            if (i12 != 0) {
                                z10 = true;
                                break;
                            }
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + af.b.h(b10));
                        }
                        i10 = b10 - 65;
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = b10 - 48;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new e().writeHexadecimalUnsignedLong(j10).writeByte(b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i11);
                i13++;
                i12++;
            }
            if (i13 == i14) {
                this.f352a = xVar.b();
                y.b(xVar);
            } else {
                xVar.f402b = i13;
            }
            if (z10) {
                break;
            }
        } while (this.f352a != null);
        z(size() - ((long) i12));
        return j10;
    }

    @Override // af.g
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        x xVar = this.f352a;
        kotlin.jvm.internal.t.c(xVar);
        int i10 = xVar.f402b;
        int i11 = xVar.f403c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = xVar.f401a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        z(size() - 4);
        if (i17 == i11) {
            this.f352a = xVar.b();
            y.b(xVar);
        } else {
            xVar.f402b = i17;
        }
        return i18;
    }

    public int readIntLe() throws EOFException {
        return af.b.f(readInt());
    }

    @Override // af.g
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        x xVar = this.f352a;
        kotlin.jvm.internal.t.c(xVar);
        int i10 = xVar.f402b;
        int i11 = xVar.f403c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = xVar.f401a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        z(size() - 2);
        if (i13 == i11) {
            this.f352a = xVar.b();
            y.b(xVar);
        } else {
            xVar.f402b = i13;
        }
        return (short) i14;
    }

    public short readShortLe() throws EOFException {
        return af.b.g(readShort());
    }

    @Override // af.g
    public String readString(Charset charset) {
        kotlin.jvm.internal.t.f(charset, "charset");
        return readString(this.f353b, charset);
    }

    public String readUtf8() {
        return readString(this.f353b, rd.d.f24999b);
    }

    @Override // af.g
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // af.g
    public void require(long j10) throws EOFException {
        if (this.f353b < j10) {
            throw new EOFException();
        }
    }

    public final long size() {
        return this.f353b;
    }

    @Override // af.g
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            x xVar = this.f352a;
            if (xVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, xVar.f403c - xVar.f402b);
            long j11 = iMin;
            z(size() - j11);
            j10 -= j11;
            int i10 = xVar.f402b + iMin;
            xVar.f402b = i10;
            if (i10 == xVar.f403c) {
                this.f352a = xVar.b();
                y.b(xVar);
            }
        }
    }

    public final byte t(long j10) {
        af.b.b(size(), j10, 1L);
        x xVar = this.f352a;
        if (xVar == null) {
            kotlin.jvm.internal.t.c(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                xVar = xVar.f407g;
                kotlin.jvm.internal.t.c(xVar);
                size -= (long) (xVar.f403c - xVar.f402b);
            }
            kotlin.jvm.internal.t.c(xVar);
            return xVar.f401a[(int) ((((long) xVar.f402b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (xVar.f403c - xVar.f402b)) + j11;
            if (j12 > j10) {
                kotlin.jvm.internal.t.c(xVar);
                return xVar.f401a[(int) ((((long) xVar.f402b) + j10) - j11)];
            }
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
            j11 = j12;
        }
    }

    @Override // af.c0
    public d0 timeout() {
        return d0.f348e;
    }

    public String toString() {
        return B().toString();
    }

    public long u(h targetBytes) {
        kotlin.jvm.internal.t.f(targetBytes, "targetBytes");
        return v(targetBytes, 0L);
    }

    public long v(h targetBytes, long j10) {
        int i10;
        int i11;
        kotlin.jvm.internal.t.f(targetBytes, "targetBytes");
        long size = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        x xVar = this.f352a;
        if (xVar == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                xVar = xVar.f407g;
                kotlin.jvm.internal.t.c(xVar);
                size -= (long) (xVar.f403c - xVar.f402b);
            }
            if (targetBytes.F() == 2) {
                byte bG = targetBytes.g(0);
                byte bG2 = targetBytes.g(1);
                while (size < size()) {
                    byte[] bArr = xVar.f401a;
                    i10 = (int) ((((long) xVar.f402b) + j10) - size);
                    int i12 = xVar.f403c;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (xVar.f403c - xVar.f402b);
                            xVar = xVar.f406f;
                            kotlin.jvm.internal.t.c(xVar);
                            j10 = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bG || b10 == bG2) {
                                i11 = xVar.f402b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrS = targetBytes.s();
            while (size < size()) {
                byte[] bArr2 = xVar.f401a;
                i10 = (int) ((((long) xVar.f402b) + j10) - size);
                int i13 = xVar.f403c;
                while (true) {
                    if (i10 < i13) {
                        byte b11 = bArr2[i10];
                        int length = bArrS.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                i10++;
                            } else if (b11 == bArrS[i14]) {
                                i11 = xVar.f402b;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        size += (long) (xVar.f403c - xVar.f402b);
                        xVar = xVar.f406f;
                        kotlin.jvm.internal.t.c(xVar);
                        j10 = size;
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (xVar.f403c - xVar.f402b)) + size;
            if (j11 > j10) {
                break;
            }
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
            size = j11;
        }
        if (targetBytes.F() == 2) {
            byte bG3 = targetBytes.g(0);
            byte bG4 = targetBytes.g(1);
            while (size < size()) {
                byte[] bArr3 = xVar.f401a;
                i10 = (int) ((((long) xVar.f402b) + j10) - size);
                int i15 = xVar.f403c;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (xVar.f403c - xVar.f402b);
                        xVar = xVar.f406f;
                        kotlin.jvm.internal.t.c(xVar);
                        j10 = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bG3 || b12 == bG4) {
                            i11 = xVar.f402b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrS2 = targetBytes.s();
        while (size < size()) {
            byte[] bArr4 = xVar.f401a;
            i10 = (int) ((((long) xVar.f402b) + j10) - size);
            int i16 = xVar.f403c;
            while (true) {
                if (i10 < i16) {
                    byte b13 = bArr4[i10];
                    int length2 = bArrS2.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length2) {
                            i10++;
                        } else if (b13 == bArrS2[i17]) {
                            i11 = xVar.f402b;
                        } else {
                            i17++;
                        }
                    }
                } else {
                    size += (long) (xVar.f403c - xVar.f402b);
                    xVar = xVar.f406f;
                    kotlin.jvm.internal.t.c(xVar);
                    j10 = size;
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // af.a0
    public void y(e source, long j10) {
        x xVar;
        kotlin.jvm.internal.t.f(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        af.b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            x xVar2 = source.f352a;
            kotlin.jvm.internal.t.c(xVar2);
            int i10 = xVar2.f403c;
            x xVar3 = source.f352a;
            kotlin.jvm.internal.t.c(xVar3);
            if (j10 < i10 - xVar3.f402b) {
                x xVar4 = this.f352a;
                if (xVar4 != null) {
                    kotlin.jvm.internal.t.c(xVar4);
                    xVar = xVar4.f407g;
                } else {
                    xVar = null;
                }
                if (xVar != null && xVar.f405e) {
                    if ((((long) xVar.f403c) + j10) - ((long) (xVar.f404d ? 0 : xVar.f402b)) <= 8192) {
                        x xVar5 = source.f352a;
                        kotlin.jvm.internal.t.c(xVar5);
                        xVar5.f(xVar, (int) j10);
                        source.z(source.size() - j10);
                        z(size() + j10);
                        return;
                    }
                }
                x xVar6 = source.f352a;
                kotlin.jvm.internal.t.c(xVar6);
                source.f352a = xVar6.e((int) j10);
            }
            x xVar7 = source.f352a;
            kotlin.jvm.internal.t.c(xVar7);
            long j11 = xVar7.f403c - xVar7.f402b;
            source.f352a = xVar7.b();
            x xVar8 = this.f352a;
            if (xVar8 == null) {
                this.f352a = xVar7;
                xVar7.f407g = xVar7;
                xVar7.f406f = xVar7;
            } else {
                kotlin.jvm.internal.t.c(xVar8);
                x xVar9 = xVar8.f407g;
                kotlin.jvm.internal.t.c(xVar9);
                xVar9.c(xVar7).a();
            }
            source.z(source.size() - j11);
            z(size() + j11);
            j10 -= j11;
        }
    }

    public final void z(long j10) {
        this.f353b = j10;
    }

    /* JADX INFO: compiled from: Buffer.kt */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.size() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            kotlin.jvm.internal.t.f(sink, "sink");
            return e.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // af.g
    public byte[] readByteArray(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // af.g
    public h readByteString(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new h(readByteArray(j10));
        }
        h hVarC = C((int) j10);
        skip(j10);
        return hVarC;
    }

    public String readString(long j10, Charset charset) throws EOFException {
        kotlin.jvm.internal.t.f(charset, "charset");
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f353b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        x xVar = this.f352a;
        kotlin.jvm.internal.t.c(xVar);
        int i10 = xVar.f402b;
        if (((long) i10) + j10 > xVar.f403c) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(xVar.f401a, i10, i11, charset);
        int i12 = xVar.f402b + i11;
        xVar.f402b = i12;
        this.f353b -= j10;
        if (i12 == xVar.f403c) {
            this.f352a = xVar.b();
            y.b(xVar);
        }
        return str;
    }

    public String readUtf8(long j10) throws EOFException {
        return readString(j10, rd.d.f24999b);
    }

    @Override // af.g
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return bf.a.b(this, jIndexOf);
        }
        if (j11 < size() && t(j11 - 1) == 13 && t(j11) == 10) {
            return bf.a.b(this, j11);
        }
        e eVar = new e();
        o(eVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + eVar.readByteString().p() + (char) 8230);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            x xVarF = F(1);
            int iMin = Math.min(i10, 8192 - xVarF.f403c);
            source.get(xVarF.f401a, xVarF.f403c, iMin);
            i10 -= iMin;
            xVarF.f403c += iMin;
        }
        this.f353b += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.t.f(sink, "sink");
        af.b.b(sink.length, i10, i11);
        x xVar = this.f352a;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, xVar.f403c - xVar.f402b);
        byte[] bArr = xVar.f401a;
        int i12 = xVar.f402b;
        kotlin.collections.m.d(bArr, sink, i10, i12, i12 + iMin);
        xVar.f402b += iMin;
        z(size() - ((long) iMin));
        if (xVar.f402b == xVar.f403c) {
            this.f352a = xVar.b();
            y.b(xVar);
        }
        return iMin;
    }

    @Override // af.c0
    public long read(e sink, long j10) {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.y(this, j10);
        return j10;
    }

    @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // af.f, af.a0, java.io.Flushable
    public void flush() {
    }

    @Override // af.g, af.f
    public e getBuffer() {
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public e emit() {
        return this;
    }

    @Override // af.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e emitCompleteSegments() {
        return this;
    }
}
