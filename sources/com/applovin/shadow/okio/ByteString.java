package com.applovin.shadow.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import rd.c0;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    /* JADX INFO: compiled from: ByteString.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = rd.d.f24999b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i10, i11);
        }

        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m144deprecated_decodeBase64(String string) {
            kotlin.jvm.internal.t.f(string, "string");
            return decodeBase64(string);
        }

        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m145deprecated_decodeHex(String string) {
            kotlin.jvm.internal.t.f(string, "string");
            return decodeHex(string);
        }

        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m146deprecated_encodeString(String string, Charset charset) {
            kotlin.jvm.internal.t.f(string, "string");
            kotlin.jvm.internal.t.f(charset, "charset");
            return encodeString(string, charset);
        }

        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m147deprecated_encodeUtf8(String string) {
            kotlin.jvm.internal.t.f(string, "string");
            return encodeUtf8(string);
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m148deprecated_of(ByteBuffer buffer) {
            kotlin.jvm.internal.t.f(buffer, "buffer");
            return of(buffer);
        }

        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m150deprecated_read(InputStream inputstream, int i10) {
            kotlin.jvm.internal.t.f(inputstream, "inputstream");
            return read(inputstream, i10);
        }

        public final ByteString decodeBase64(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        public final ByteString decodeHex(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((com.applovin.shadow.okio.internal.ByteString.decodeHexDigit(str.charAt(i11)) << 4) + com.applovin.shadow.okio.internal.ByteString.decodeHexDigit(str.charAt(i11 + 1)));
            }
            return new ByteString(bArr);
        }

        public final ByteString encodeString(String str, Charset charset) {
            kotlin.jvm.internal.t.f(str, "<this>");
            kotlin.jvm.internal.t.f(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            kotlin.jvm.internal.t.f(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(ByteBuffer byteBuffer) {
            kotlin.jvm.internal.t.f(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString read(InputStream inputStream, int i10) throws IOException {
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
            return new ByteString(bArr);
        }

        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m149deprecated_of(byte[] array, int i10, int i11) {
            kotlin.jvm.internal.t.f(array, "array");
            return of(array, i10, i11);
        }

        public final ByteString of(byte... data) {
            kotlin.jvm.internal.t.f(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        public final ByteString of(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i11);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
            return new ByteString(kotlin.collections.m.i(bArr, i10, iResolveDefaultParameter + i10));
        }
    }

    public ByteString(byte[] data) {
        kotlin.jvm.internal.t.f(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        byteString.copyInto(i10, bArr, i11, i12);
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.indexOf(byteString2, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i10);
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    public static final ByteString read(InputStream inputStream, int i10) throws IOException {
        return Companion.read(inputStream, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i10, i11);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m142deprecated_getByte(int i10) {
        return getByte(i10);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m143deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.t.e(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public void copyInto(int i10, byte[] target, int i11, int i12) {
        kotlin.jvm.internal.t.f(target, "target");
        kotlin.collections.m.d(getData$okio(), target, i11, i10, i12 + i10);
    }

    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.t.c(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(ByteString suffix) {
        kotlin.jvm.internal.t.f(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i10) {
        return internalGet$okio(i10);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return c0.t(cArr);
    }

    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        kotlin.jvm.internal.t.f(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.t.e(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public ByteString hmacSha1(ByteString key) {
        kotlin.jvm.internal.t.f(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public ByteString hmacSha256(ByteString key) {
        kotlin.jvm.internal.t.f(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public ByteString hmacSha512(ByteString key) {
        kotlin.jvm.internal.t.f(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(ByteString other) {
        kotlin.jvm.internal.t.f(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i10) {
        return getData$okio()[i10];
    }

    public final int lastIndexOf(ByteString other) {
        kotlin.jvm.internal.t.f(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i10, ByteString other, int i11, int i12) {
        kotlin.jvm.internal.t.f(other, "other");
        return other.rangeEquals(i11, getData$okio(), i10, i12);
    }

    public final void setHashCode$okio(int i10) {
        this.hashCode = i10;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString prefix) {
        kotlin.jvm.internal.t.f(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public String string(Charset charset) {
        kotlin.jvm.internal.t.f(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString toAsciiLowercase() {
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b10 = getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b10 = getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream out) throws IOException {
        kotlin.jvm.internal.t.f(out, "out");
        out.write(this.data);
    }

    public void write$okio(Buffer buffer, int i10, int i11) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        com.applovin.shadow.okio.internal.ByteString.commonWrite(this, buffer, i10, i11);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.indexOf(bArr, i10);
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(com.applovin.shadow.okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.t.f(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.ByteString.compareTo(com.applovin.shadow.okio.ByteString):int");
    }

    public final boolean endsWith(byte[] suffix) {
        kotlin.jvm.internal.t.f(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public final int indexOf(byte[] other) {
        kotlin.jvm.internal.t.f(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] other) {
        kotlin.jvm.internal.t.f(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.t.f(other, "other");
        return i10 >= 0 && i10 <= getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && SegmentedByteString.arrayRangeEquals(getData$okio(), i10, other, i11, i12);
    }

    public final boolean startsWith(byte[] prefix) {
        kotlin.jvm.internal.t.f(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final ByteString substring(int i10) {
        return substring$default(this, i10, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i10);
    }

    public static final ByteString of(byte[] bArr, int i10, int i11) {
        return Companion.of(bArr, i10, i11);
    }

    public final int indexOf(ByteString other, int i10) {
        kotlin.jvm.internal.t.f(other, "other");
        return indexOf(other.internalArray$okio(), i10);
    }

    public final int lastIndexOf(ByteString other, int i10) {
        kotlin.jvm.internal.t.f(other, "other");
        return lastIndexOf(other.internalArray$okio(), i10);
    }

    public ByteString substring(int i10, int i11) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i11);
        if (i10 >= 0) {
            if (iResolveDefaultParameter <= getData$okio().length) {
                if (iResolveDefaultParameter - i10 >= 0) {
                    return (i10 == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new ByteString(kotlin.collections.m.i(getData$okio(), i10, iResolveDefaultParameter));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public String toString() {
        boolean z10;
        boolean z11;
        ByteString byteString;
        String str;
        boolean z12 = true;
        if (getData$okio().length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            int iCodePointIndexToCharIndex = com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(getData$okio(), 64);
            String str2 = zKUlck.bdhrpwetxkS;
            if (iCodePointIndexToCharIndex == -1) {
                if (getData$okio().length <= 64) {
                    str = "[hex=" + hex() + ']';
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(getData$okio().length);
                    sb2.append(" hex=");
                    int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
                    if (iResolveDefaultParameter <= getData$okio().length) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (iResolveDefaultParameter + 0 < 0) {
                            z12 = false;
                        }
                        if (z12) {
                            if (iResolveDefaultParameter == getData$okio().length) {
                                byteString = this;
                            } else {
                                byteString = new ByteString(kotlin.collections.m.i(getData$okio(), 0, iResolveDefaultParameter));
                            }
                            sb2.append(byteString.hex());
                            sb2.append("…]");
                            return sb2.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
                }
            } else {
                String strUtf8 = utf8();
                String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
                kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strK = c0.K(c0.K(c0.K(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iCodePointIndexToCharIndex < strUtf8.length()) {
                    return str2 + getData$okio().length + " text=" + strK + "…]";
                }
                return "[text=" + strK + ']';
            }
        } else {
            str = "[size=0]";
        }
        return str;
    }

    public int indexOf(byte[] other, int i10) {
        kotlin.jvm.internal.t.f(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!SegmentedByteString.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public int lastIndexOf(byte[] other, int i10) {
        kotlin.jvm.internal.t.f(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, i10), getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
