package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: NioByteString.java */
/* JADX INFO: loaded from: classes.dex */
final class p1 extends ByteString.LeafByteString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f10741a;

    p1(ByteBuffer byteBuffer) {
        l0.b(byteBuffer, "buffer");
        this.f10741a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer e(int i10, int i11) {
        if (i10 < this.f10741a.position() || i11 > this.f10741a.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f10741a.slice();
        byteBufferSlice.position(i10 - this.f10741a.position());
        byteBufferSlice.limit(i11 - this.f10741a.position());
        return byteBufferSlice;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f10741a.slice());
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f10741a.asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte byteAt(int i10) {
        try {
            return this.f10741a.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f10741a.slice());
    }

    @Override // com.explorestack.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f10741a.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p1) {
            return this.f10741a.equals(((p1) obj).f10741a);
        }
        return obj instanceof a2 ? obj.equals(this) : this.f10741a.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.explorestack.protobuf.ByteString.LeafByteString
    boolean equalsRange(ByteString byteString, int i10, int i11) {
        return substring(0, i11).equals(byteString.substring(i10, i11 + i10));
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean isValidUtf8() {
        return a3.r(this.f10741a);
    }

    @Override // com.explorestack.protobuf.ByteString
    public n newCodedInput() {
        return n.k(this.f10741a, true);
    }

    @Override // com.explorestack.protobuf.ByteString
    public InputStream newInput() {
        return new a();
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f10741a.get(i13);
        }
        return i10;
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        return a3.u(i10, this.f10741a, i11, i12 + i11);
    }

    @Override // com.explorestack.protobuf.ByteString
    public int size() {
        return this.f10741a.remaining();
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        try {
            return new p1(e(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f10741a.hasArray()) {
            byteArray = this.f10741a.array();
            iArrayOffset = this.f10741a.arrayOffset() + this.f10741a.position();
            length = this.f10741a.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.explorestack.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        if (!this.f10741a.hasArray()) {
            k.g(e(i10, i11 + i10), outputStream);
        } else {
            outputStream.write(this.f10741a.array(), this.f10741a.arrayOffset() + this.f10741a.position() + i10, i11);
        }
    }

    /* JADX INFO: compiled from: NioByteString.java */
    class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f10742a;

        a() {
            this.f10742a = p1.this.f10741a.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f10742a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f10742a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f10742a.hasRemaining()) {
                return this.f10742a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                this.f10742a.reset();
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!this.f10742a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, this.f10742a.remaining());
            this.f10742a.get(bArr, i10, iMin);
            return iMin;
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeTo(l lVar) throws IOException {
        lVar.a(this.f10741a.slice());
    }
}
