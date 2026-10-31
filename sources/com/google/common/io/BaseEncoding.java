package com.google.common.io;

import c0.IbU.elEbP;
import com.android.billingclient.gp.VRfCTjjLv;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.base.p;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BaseEncoding f11740a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BaseEncoding f11741b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseEncoding f11742c = new d("base32()", elEbP.pLkGWZqQoQyQLsf, '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BaseEncoding f11743d = new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BaseEncoding f11744e = new b("base16()", "0123456789ABCDEF");

    public static final class DecodingException extends IOException {
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f11746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f11747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f11748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f11749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f11750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f11751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean[] f11752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f11753i;

        a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        char c(int i10) {
            return this.f11746b[i10];
        }

        public boolean d(char c10) {
            byte[] bArr = this.f11751g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11753i == aVar.f11753i && Arrays.equals(this.f11746b, aVar.f11746b);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f11746b) + (this.f11753i ? 1231 : 1237);
        }

        public String toString() {
            return this.f11745a;
        }

        private a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f11745a = (String) p.l(str);
            this.f11746b = (char[]) p.l(cArr);
            try {
                int iE = u2.d.e(cArr.length, RoundingMode.UNNECESSARY);
                this.f11748d = iE;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iE);
                int i10 = 1 << (3 - iNumberOfTrailingZeros);
                this.f11749e = i10;
                this.f11750f = iE >> iNumberOfTrailingZeros;
                this.f11747c = cArr.length - 1;
                this.f11751g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f11750f; i11++) {
                    zArr[u2.d.b(i11 * 8, this.f11748d, RoundingMode.CEILING)] = true;
                }
                this.f11752h = zArr;
                this.f11753i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                p.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                p.f(z10, VRfCTjjLv.UYAJbNoCHQe, c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }
    }

    private static final class b extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final char[] f11754h;

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.l(appendable);
            p.q(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f11754h[i13]);
                appendable.append(this.f11754h[i13 | UserVerificationMethods.USER_VERIFY_HANDPRINT]);
            }
        }

        private b(a aVar) {
            super(aVar, null);
            this.f11754h = new char[512];
            p.d(aVar.f11746b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f11754h[i10] = aVar.c(i10 >>> 4);
                this.f11754h[i10 | UserVerificationMethods.USER_VERIFY_HANDPRINT] = aVar.c(i10 & 15);
            }
        }
    }

    private static final class c extends d {
        c(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.l(appendable);
            int i12 = i10 + i11;
            p.q(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i10] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                appendable.append(this.f11755f.c(i15 >>> 18));
                appendable.append(this.f11755f.c((i15 >>> 12) & 63));
                appendable.append(this.f11755f.c((i15 >>> 6) & 63));
                appendable.append(this.f11755f.c(i15 & 63));
                i11 -= 3;
                i10 = i14 + 1;
            }
            if (i10 < i12) {
                f(appendable, bArr, i10, i12 - i10);
            }
        }

        private c(a aVar, Character ch) {
            super(aVar, ch);
            p.d(aVar.f11746b.length == 64);
        }
    }

    private static class d extends BaseEncoding {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final a f11755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Character f11756g;

        d(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding
        void d(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.l(appendable);
            p.q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                f(appendable, bArr, i10 + i12, Math.min(this.f11755f.f11750f, i11 - i12));
                i12 += this.f11755f.f11750f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int e(int i10) {
            a aVar = this.f11755f;
            return aVar.f11749e * u2.d.b(i10, aVar.f11750f, RoundingMode.CEILING);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f11755f.equals(dVar.f11755f) && Objects.equals(this.f11756g, dVar.f11756g);
        }

        void f(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            p.l(appendable);
            p.q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            p.d(i11 <= this.f11755f.f11750f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f11755f.f11748d;
            while (i12 < i11 * 8) {
                a aVar = this.f11755f;
                appendable.append(aVar.c(((int) (j10 >>> (i14 - i12))) & aVar.f11747c));
                i12 += this.f11755f.f11748d;
            }
            if (this.f11756g != null) {
                while (i12 < this.f11755f.f11750f * 8) {
                    appendable.append(this.f11756g.charValue());
                    i12 += this.f11755f.f11748d;
                }
            }
        }

        public int hashCode() {
            return this.f11755f.hashCode() ^ Objects.hashCode(this.f11756g);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f11755f);
            if (8 % this.f11755f.f11748d != 0) {
                if (this.f11756g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f11756g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        d(a aVar, Character ch) {
            this.f11755f = (a) p.l(aVar);
            p.i(ch == null || !aVar.d(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f11756g = ch;
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding a() {
        return f11741b;
    }

    public String b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public final String c(byte[] bArr, int i10, int i11) {
        p.q(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(e(i11));
        try {
            d(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void d(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int e(int i10);
}
