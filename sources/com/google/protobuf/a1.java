package com.google.protobuf;

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
/* JADX INFO: loaded from: classes4.dex */
final class a1 extends i.AbstractC0158i {
    private final ByteBuffer buffer;

    a1(ByteBuffer byteBuffer) {
        a0.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i10, int i11) {
        if (i10 < this.buffer.position() || i11 > this.buffer.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        c0.position(byteBufferSlice, i10 - this.buffer.position());
        c0.limit(byteBufferSlice, i11 - this.buffer.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return i.copyFrom(this.buffer.slice());
    }

    @Override // com.google.protobuf.i
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.i
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.i
    public byte byteAt(int i10) {
        try {
            return this.buffer.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.i
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.i
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.buffer.slice();
        c0.position(byteBufferSlice, i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (size() != iVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof a1) {
            return this.buffer.equals(((a1) obj).buffer);
        }
        return obj instanceof k1 ? obj.equals(this) : this.buffer.equals(iVar.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.i.AbstractC0158i
    boolean equalsRange(i iVar, int i10, int i11) {
        return substring(0, i11).equals(iVar.substring(i10, i11 + i10));
    }

    @Override // com.google.protobuf.i
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.google.protobuf.i
    public boolean isValidUtf8() {
        return w1.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.i
    public j newCodedInput() {
        return j.newInstance(this.buffer, true);
    }

    @Override // com.google.protobuf.i
    public InputStream newInput() {
        return new a();
    }

    @Override // com.google.protobuf.i
    protected int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.buffer.get(i13);
        }
        return i10;
    }

    @Override // com.google.protobuf.i
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        return w1.partialIsValidUtf8(i10, this.buffer, i11, i12 + i11);
    }

    @Override // com.google.protobuf.i
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.i
    public i substring(int i10, int i11) {
        try {
            return new a1(slice(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.i
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            iArrayOffset = this.buffer.arrayOffset() + this.buffer.position();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.i
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.i
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        if (!this.buffer.hasArray()) {
            g.write(slice(i10, i11 + i10), outputStream);
        } else {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i10, i11);
        }
    }

    /* JADX INFO: compiled from: NioByteString.java */
    class a extends InputStream {
        private final ByteBuffer buf;

        a() {
            this.buf = a1.this.buffer.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.buf.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            c0.mark(this.buf);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.buf.hasRemaining()) {
                return this.buf.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                c0.reset(this.buf);
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, this.buf.remaining());
            this.buf.get(bArr, i10, iMin);
            return iMin;
        }
    }

    @Override // com.google.protobuf.i
    void writeTo(h hVar) throws IOException {
        hVar.writeLazy(this.buffer.slice());
    }
}
