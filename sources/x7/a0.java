package x7;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f28089d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f28090e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.collect.w<Charset> f28091f = com.google.common.collect.w.I(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f28092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28094c;

    public a0() {
        this.f28092a = l0.f28141f;
    }

    private void Y(Charset charset) {
        if (m(charset, f28089d) == '\r') {
            m(charset, f28090e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f28093b;
        while (true) {
            int i12 = this.f28094c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && l0.I0(this.f28092a[i11])) {
                return i11;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f28092a;
                if (bArr[i11] == 0 && l0.I0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f28092a;
                if (bArr2[i11 + 1] == 0 && l0.I0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte b10;
        byte b11;
        byte b12 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b10 = this.f28092a[this.f28093b];
            b11 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f28092a;
                int i10 = this.f28093b;
                b11 = bArr[i10];
                b10 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f28092a;
                int i11 = this.f28093b;
                b11 = bArr2[i11 + 1];
                b10 = bArr2[i11];
            }
            b12 = 2;
        }
        return com.google.common.primitives.f.g(b11, b10, (byte) 0, b12);
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return (char) 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!com.google.common.primitives.b.a(cArr, c10)) {
            return (char) 0;
        }
        this.f28093b += i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f28093b = i17 + 1;
        return j15 | (((long) bArr[i17]) & 255);
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f28093b;
        int i12 = (i11 + i10) - 1;
        String strI = l0.I(this.f28092a, i11, (i12 >= this.f28094c || this.f28092a[i12] != 0) ? i10 : i10 - 1);
        this.f28093b += i10;
        return strI;
    }

    public short D() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f28093b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String E(int i10) {
        return F(i10, StandardCharsets.UTF_8);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f28092a, this.f28093b, i10, charset);
        this.f28093b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        this.f28093b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f28093b = i11 + 1 + 2;
        return i12;
    }

    public long J() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
        this.f28093b = i13 + 1;
        return j11 | (((long) bArr[i13]) & 255);
    }

    public int K() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f28093b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int M() {
        return com.google.common.primitives.f.d(N());
    }

    public long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f28093b == this.f28094c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jH = H();
            j10 |= (127 & jH) << (i10 * 7);
            if ((jH & 128) == 0) {
                break;
            }
        }
        return j10;
    }

    public int P() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f28093b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public long Q() {
        int i10;
        int i11;
        long j10 = this.f28092a[this.f28093b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f28092a[this.f28093b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
        }
        this.f28093b += i11;
        return j10;
    }

    public Charset R() {
        if (a() >= 3) {
            byte[] bArr = this.f28092a;
            int i10 = this.f28093b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f28093b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f28092a;
        int i11 = this.f28093b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f28093b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f28093b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void S(int i10) {
        U(b() < i10 ? new byte[i10] : this.f28092a, i10);
    }

    public void T(byte[] bArr) {
        U(bArr, bArr.length);
    }

    public void U(byte[] bArr, int i10) {
        this.f28092a = bArr;
        this.f28094c = i10;
        this.f28093b = 0;
    }

    public void V(int i10) {
        a.a(i10 >= 0 && i10 <= this.f28092a.length);
        this.f28094c = i10;
    }

    public void W(int i10) {
        a.a(i10 >= 0 && i10 <= this.f28094c);
        this.f28093b = i10;
    }

    public void X(int i10) {
        W(this.f28093b + i10);
    }

    public int a() {
        return this.f28094c - this.f28093b;
    }

    public int b() {
        return this.f28092a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f28092a = Arrays.copyOf(this.f28092a, i10);
        }
    }

    public byte[] e() {
        return this.f28092a;
    }

    public int f() {
        return this.f28093b;
    }

    public int g() {
        return this.f28094c;
    }

    public char h(Charset charset) {
        a.b(f28091f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f28092a[this.f28093b] & 255;
    }

    public void k(z zVar, int i10) {
        l(zVar.f28202a, 0, i10);
        zVar.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f28092a, this.f28093b, bArr, i10, i11);
        this.f28093b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f28093b;
        while (i10 < this.f28094c && this.f28092a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f28092a;
        int i11 = this.f28093b;
        String strI = l0.I(bArr, i11, i10 - i11);
        this.f28093b = i10;
        if (i10 < this.f28094c) {
            this.f28093b = i10 + 1;
        }
        return strI;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f28093b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int r() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f28093b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public String s() {
        return t(StandardCharsets.UTF_8);
    }

    public String t(Charset charset) {
        a.b(f28091f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            R();
        }
        String strF = F(d(charset) - this.f28093b, charset);
        if (this.f28093b == this.f28094c) {
            return strF;
        }
        Y(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f28093b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long v() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i16 + 1;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f28093b = i17 + 1;
        return j15 | ((((long) bArr[i17]) & 255) << 56);
    }

    public short w() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f28093b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long x() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        this.f28093b = i13 + 1;
        return j11 | ((((long) bArr[i13]) & 255) << 24);
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int z() {
        byte[] bArr = this.f28092a;
        int i10 = this.f28093b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f28093b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public a0(int i10) {
        this.f28092a = new byte[i10];
        this.f28094c = i10;
    }

    public long O() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException(xjwcmjDeOXR.XzMHwrtvMcfySd + jA);
    }

    public a0(byte[] bArr) {
        this.f28092a = bArr;
        this.f28094c = bArr.length;
    }

    public a0(byte[] bArr, int i10) {
        this.f28092a = bArr;
        this.f28094c = i10;
    }
}
