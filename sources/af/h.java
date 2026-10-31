package af;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h implements Serializable, Comparable<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f361d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f362e = new h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f365c;

    /* JADX INFO: compiled from: ByteString.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ h f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = b.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final h a(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            byte[] bArrA = af.a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((bf.b.e(str.charAt(i11)) << 4) + bf.b.e(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            kotlin.jvm.internal.t.f(str, "<this>");
            kotlin.jvm.internal.t.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            return new h(bytes);
        }

        public final h d(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            h hVar = new h(f0.a(str));
            hVar.B(str);
            return hVar;
        }

        public final h e(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            int iE = b.e(bArr, i11);
            b.b(bArr.length, i10, iE);
            return new h(kotlin.collections.m.i(bArr, i10, iE + i10));
        }

        public final h g(InputStream inputStream, int i10) throws IOException {
            kotlin.jvm.internal.t.f(inputStream, "<this>");
            int i11 = 0;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new h(bArr);
        }
    }

    public h(byte[] data) {
        kotlin.jvm.internal.t.f(data, "data");
        this.f363a = data;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        h hVarG = f361d.g(objectInputStream, objectInputStream.readInt());
        Field declaredField = h.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, hVarG.f363a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f363a.length);
        objectOutputStream.write(this.f363a);
    }

    public final void B(String str) {
        this.f365c = str;
    }

    public final h C() {
        return e("SHA-1");
    }

    public final h D() {
        return e("SHA-256");
    }

    public final int F() {
        return n();
    }

    public final boolean G(h prefix) {
        kotlin.jvm.internal.t.f(prefix, "prefix");
        return w(0, prefix, 0, prefix.F());
    }

    public h H() {
        for (int i10 = 0; i10 < h().length; i10++) {
            byte b10 = h()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrH = h();
                byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
                kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public String I() {
        String strO = o();
        if (strO != null) {
            return strO;
        }
        String strB = f0.b(s());
        B(strB);
        return strB;
    }

    public void K(e buffer, int i10, int i11) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        bf.b.d(this, buffer, i10, i11);
    }

    public String b() {
        return af.a.c(h(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(af.h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.t.f(r10, r0)
            int r0 = r9.F()
            int r1 = r10.F()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: af.h.compareTo(af.h):int");
    }

    public h e(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f363a, 0, F());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.t.e(digestBytes, "digestBytes");
        return new h(digestBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.F() == h().length && hVar.x(0, h(), 0, h().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte g(int i10) {
        return t(i10);
    }

    public final byte[] h() {
        return this.f363a;
    }

    public int hashCode() {
        int iK = k();
        if (iK != 0) {
            return iK;
        }
        int iHashCode = Arrays.hashCode(h());
        z(iHashCode);
        return iHashCode;
    }

    public final int k() {
        return this.f364b;
    }

    public int n() {
        return h().length;
    }

    public final String o() {
        return this.f365c;
    }

    public String p() {
        char[] cArr = new char[h().length * 2];
        int i10 = 0;
        for (byte b10 : h()) {
            int i11 = i10 + 1;
            cArr[i10] = bf.b.f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = bf.b.f()[b10 & 15];
        }
        return rd.c0.t(cArr);
    }

    public byte[] s() {
        return h();
    }

    public byte t(int i10) {
        return h()[i10];
    }

    public String toString() {
        String str;
        if (h().length == 0) {
            str = "[size=0]";
        } else {
            int iC = bf.b.c(h(), 64);
            if (iC != -1) {
                String strI = I();
                String strSubstring = strI.substring(0, iC);
                kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strK = rd.c0.K(rd.c0.K(rd.c0.K(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iC >= strI.length()) {
                    return "[text=" + strK + ']';
                }
                return "[size=" + h().length + " text=" + strK + "…]";
            }
            if (h().length > 64) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(h().length);
                sb2.append(" hex=");
                int iD = b.d(this, 64);
                if (iD <= h().length) {
                    if (!(iD + 0 >= 0)) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    sb2.append((iD == h().length ? this : new h(kotlin.collections.m.i(h(), 0, iD))).p());
                    sb2.append("…]");
                    return sb2.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + h().length + ')').toString());
            }
            str = "[hex=" + p() + ']';
        }
        return str;
    }

    public final h v() {
        return e("MD5");
    }

    public boolean w(int i10, h other, int i11, int i12) {
        kotlin.jvm.internal.t.f(other, "other");
        return other.x(i11, h(), i10, i12);
    }

    public boolean x(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.t.f(other, "other");
        return i10 >= 0 && i10 <= h().length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.a(h(), i10, other, i11, i12);
    }

    public final void z(int i10) {
        this.f364b = i10;
    }
}
