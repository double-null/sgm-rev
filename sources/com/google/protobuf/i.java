package com.google.protobuf;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final i EMPTY = new j(a0.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<i> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final f byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* JADX INFO: compiled from: ByteString.java */
    class a extends c {
        private final int limit;
        private int position = 0;

        a() {
            this.limit = i.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // com.google.protobuf.i.c, com.google.protobuf.i.g
        public byte nextByte() {
            int i10 = this.position;
            if (i10 >= this.limit) {
                throw new NoSuchElementException();
            }
            this.position = i10 + 1;
            return i.this.internalByteAt(i10);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    class b implements Comparator<i> {
        b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.i$g, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.i$g, java.util.Iterator] */
        @Override // java.util.Comparator
        public int compare(i iVar, i iVar2) {
            ?? Iterator2 = iVar.iterator2();
            ?? Iterator3 = iVar2.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompareTo = Integer.valueOf(i.toInt(Iterator2.nextByte())).compareTo(Integer.valueOf(i.toInt(Iterator3.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(iVar.size()).compareTo(Integer.valueOf(iVar2.size()));
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    static abstract class c implements g {
        c() {
        }

        @Override // com.google.protobuf.i.g
        public abstract /* synthetic */ byte nextByte();

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.i.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static final class e extends j {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            i.checkRange(i10, i10 + i11, bArr.length);
            this.bytesOffset = i10;
            this.bytesLength = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        public byte byteAt(int i10) {
            i.checkIndex(i10, size());
            return this.bytes[this.bytesOffset + i10];
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.i.j
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        byte internalByteAt(int i10) {
            return this.bytes[this.bytesOffset + i10];
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return i.wrap(toByteArray());
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private interface f {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: compiled from: ByteString.java */
    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: compiled from: ByteString.java */
    static final class h {
        private final byte[] buffer;
        private final CodedOutputStream output;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public i build() {
            this.output.checkNoSpaceLeft();
            return new j(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteString.java */
    static abstract class AbstractC0158i extends i {
        private static final long serialVersionUID = 1;

        AbstractC0158i() {
        }

        abstract boolean equalsRange(i iVar, int i10, int i11);

        @Override // com.google.protobuf.i
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.i
        protected final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.i, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.i
        void writeToReverse(com.google.protobuf.h hVar) throws IOException {
            writeTo(hVar);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static class j extends AbstractC0158i {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        j(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.i
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.i
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.i
        public byte byteAt(int i10) {
            return this.bytes[i10];
        }

        @Override // com.google.protobuf.i
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.i
        protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.bytes, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = jVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(jVar, 0, size());
            }
            return false;
        }

        protected int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.i
        byte internalByteAt(int i10) {
            return this.bytes[i10];
        }

        @Override // com.google.protobuf.i
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return w1.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.i
        public final com.google.protobuf.j newCodedInput() {
            return com.google.protobuf.j.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.i
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.i
        protected final int partialHash(int i10, int i11, int i12) {
            return a0.partialHash(i10, this.bytes, getOffsetIntoBytes() + i11, i12);
        }

        @Override // com.google.protobuf.i
        protected final int partialIsValidUtf8(int i10, int i11, int i12) {
            int offsetIntoBytes = getOffsetIntoBytes() + i11;
            return w1.partialIsValidUtf8(i10, this.bytes, offsetIntoBytes, i12 + offsetIntoBytes);
        }

        @Override // com.google.protobuf.i
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.i
        public final i substring(int i10, int i11) {
            int iCheckRange = i.checkRange(i10, i11, size());
            return iCheckRange == 0 ? i.EMPTY : new e(this.bytes, getOffsetIntoBytes() + i10, iCheckRange);
        }

        @Override // com.google.protobuf.i
        protected final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.i
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.i
        final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i10, i11);
        }

        @Override // com.google.protobuf.i
        final void writeTo(com.google.protobuf.h hVar) throws IOException {
            hVar.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.i.AbstractC0158i
        final boolean equalsRange(i iVar, int i10, int i11) {
            if (i11 <= iVar.size()) {
                int i12 = i10 + i11;
                if (i12 <= iVar.size()) {
                    if (iVar instanceof j) {
                        j jVar = (j) iVar;
                        byte[] bArr = this.bytes;
                        byte[] bArr2 = jVar.bytes;
                        int offsetIntoBytes = getOffsetIntoBytes() + i11;
                        int offsetIntoBytes2 = getOffsetIntoBytes();
                        int offsetIntoBytes3 = jVar.getOffsetIntoBytes() + i10;
                        while (offsetIntoBytes2 < offsetIntoBytes) {
                            if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                                return false;
                            }
                            offsetIntoBytes2++;
                            offsetIntoBytes3++;
                        }
                        return true;
                    }
                    return iVar.substring(i10, i12).equals(substring(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + iVar.size());
            }
            throw new IllegalArgumentException(sRGQSqxgxlS.tzxAyhjCZwl + i11 + size());
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static final class l implements f {
        private l() {
        }

        /* synthetic */ l(a aVar) {
            this();
        }

        @Override // com.google.protobuf.i.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        byteArrayCopier = com.google.protobuf.d.isOnAndroidDevice() ? new l(aVar) : new d(aVar);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new b();
    }

    i() {
    }

    private static i balancedConcat(Iterator<i> it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return balancedConcat(it, i11).concat(balancedConcat(it, i10 - i11));
    }

    static void checkIndex(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int checkRange(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static i copyFrom(byte[] bArr, int i10, int i11) {
        checkRange(i10, i10 + i11, bArr.length);
        return new j(byteArrayCopier.copyFrom(bArr, i10, i11));
    }

    public static i copyFromUtf8(String str) {
        return new j(str.getBytes(a0.UTF_8));
    }

    public static final i empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i10) {
        int iHexDigit = hexDigit(str.charAt(i10));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i10) + " at index " + i10);
    }

    public static i fromHex(String str) {
        if (str.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (extractHexDigit(str, i11 + 1) | (extractHexDigit(str, i11) << 4));
        }
        return new j(bArr);
    }

    private static int hexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'A';
        if (c10 < 'A' || c10 > 'F') {
            c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    static h newCodedBuilder(int i10) {
        return new h(i10, null);
    }

    public static k newOutput(int i10) {
        return new k(i10);
    }

    private static i readChunk(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        if (i11 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i11);
    }

    public static i readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b10) {
        return b10 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return q1.escapeBytes(this);
        }
        return q1.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<i> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    static i wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new a1(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i10);

    public final i concat(i iVar) {
        if (Integer.MAX_VALUE - size() >= iVar.size()) {
            return k1.concatenate(this, iVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + iVar.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    protected abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public final boolean endsWith(i iVar) {
        return size() >= iVar.size() && substring(size() - iVar.size()).equals(iVar);
    }

    public abstract boolean equals(Object obj);

    protected abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    abstract byte internalByteAt(int i10);

    protected abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract com.google.protobuf.j newCodedInput();

    public abstract InputStream newInput();

    protected abstract int partialHash(int i10, int i11, int i12);

    protected abstract int partialIsValidUtf8(int i10, int i11, int i12);

    protected final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(i iVar) {
        return size() >= iVar.size() && substring(0, iVar.size()).equals(iVar);
    }

    public final i substring(int i10) {
        return substring(i10, size());
    }

    public abstract i substring(int i10, int i11);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return a0.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    protected abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(a0.UTF_8);
    }

    abstract void writeTo(com.google.protobuf.h hVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    final void writeTo(OutputStream outputStream, int i10, int i11) throws IOException {
        checkRange(i10, i10 + i11, size());
        if (i11 > 0) {
            writeToInternal(outputStream, i10, i11);
        }
    }

    abstract void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException;

    abstract void writeToReverse(com.google.protobuf.h hVar) throws IOException;

    public static k newOutput() {
        return new k(128);
    }

    public static i readFrom(InputStream inputStream, int i10) throws IOException {
        return readFrom(inputStream, i10, i10);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i10, int i11, int i12) {
        checkRange(i10, i10 + i12, size());
        checkRange(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    public static i copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static i readFrom(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            i chunk = readChunk(inputStream, i10);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    public static final class k extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<i> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        k(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i10;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i10];
        }

        private void flushFullBuffer(int i10) {
            this.flushedBuffers.add(new j(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i10, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i10 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i10 >= bArr.length) {
                this.flushedBuffers.add(new j(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i10 > 0) {
                this.flushedBuffers.add(new j(Arrays.copyOf(bArr, i10)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized i toByteString() {
            flushLastBuffer();
            return i.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i11 = this.bufferPos;
            this.bufferPos = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i10;
            i[] iVarArr;
            byte[] bArr;
            int i11;
            synchronized (this) {
                iVarArr = (i[]) this.flushedBuffers.toArray(new i[0]);
                bArr = this.buffer;
                i11 = this.bufferPos;
            }
            for (i iVar : iVarArr) {
                iVar.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i11));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            int i12 = this.bufferPos;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.bufferPos += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                flushFullBuffer(i13);
                System.arraycopy(bArr, i10 + length2, this.buffer, 0, i13);
                this.bufferPos = i13;
            }
        }
    }

    public static i copyFrom(ByteBuffer byteBuffer, int i10) {
        checkRange(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    static i wrap(byte[] bArr) {
        return new j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? ykDFMuXDQMaR.ZrxluWYAWauVk : toStringInternal(charset);
    }

    static i wrap(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static i copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static i copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new j(str.getBytes(str2));
    }

    public static i copyFrom(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    public static i copyFrom(Iterable<i> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<i> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
