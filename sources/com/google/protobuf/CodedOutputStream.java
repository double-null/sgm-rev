package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CodedOutputStream extends com.google.protobuf.h {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    l wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = v1.hasUnsafeArrayOperations();

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static abstract class b extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        final void buffer(byte b10) {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr[i10] = b10;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i10) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.position = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j10) {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.position = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i10) {
            if (i10 >= 0) {
                bufferUInt32NoTag(i10);
            } else {
                bufferUInt64NoTag(i10);
            }
        }

        final void bufferTag(int i10, int i11) {
            bufferUInt32NoTag(x1.makeTag(i10, i11));
        }

        final void bufferUInt32NoTag(int i10) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.totalBytesWritten++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.totalBytesWritten++;
                return;
            }
            long j10 = this.position;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                v1.putByte(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            v1.putByte(bArr4, i14, (byte) i10);
            this.totalBytesWritten += (int) (((long) this.position) - j10);
        }

        final void bufferUInt64NoTag(long j10) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.totalBytesWritten++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.totalBytesWritten++;
                return;
            }
            long j11 = this.position;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                v1.putByte(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            v1.putByte(bArr4, i13, (byte) j10);
            this.totalBytesWritten += (int) (((long) this.position) - j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.buffer = bArr;
            this.offset = i10;
            this.position = i10;
            this.limit = i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public final void write(byte b10) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i10, i iVar) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(iVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(i iVar) throws IOException {
            writeUInt32NoTag(iVar.size());
            iVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.position = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.position = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i10, s0 s0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(s0 s0Var) throws IOException {
            writeUInt32NoTag(s0Var.getSerializedSize());
            s0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, s0 s0Var) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, s0Var);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            c0.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, i iVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, iVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i10 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i11 = i10 + iComputeUInt32SizeNoTag2;
                    this.position = i11;
                    int iEncode = w1.encode(str, this.buffer, i11, spaceLeft());
                    this.position = i10;
                    writeUInt32NoTag((iEncode - i10) - iComputeUInt32SizeNoTag2);
                    this.position = iEncode;
                } else {
                    writeUInt32NoTag(w1.encodedLength(str));
                    this.position = w1.encode(str, this.buffer, this.position, spaceLeft());
                }
            } catch (w1.d e10) {
                this.position = i10;
                inefficientWriteStringNoTag(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(x1.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
                }
            }
            byte[] bArr2 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    v1.putByte(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                v1.putByte(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e10);
                }
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessage(int i10, s0 s0Var, l1 l1Var) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
            l1Var.writeTo(s0Var, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(s0 s0Var, l1 l1Var) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
            l1Var.writeTo(s0Var, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.buffer, this.position, i11);
                this.position += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }
    }

    private static final class d extends b {
        private final com.google.protobuf.h out;

        d(com.google.protobuf.h hVar, int i10) {
            super(i10);
            if (hVar == null) {
                throw new NullPointerException("out");
            }
            this.out = hVar;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i10) throws IOException {
            if (this.limit - this.position < i10) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte b10) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i10, 0);
            buffer(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, i iVar) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(iVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(i iVar) throws IOException {
            writeUInt32NoTag(iVar.size());
            iVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i10, 5);
            bufferFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i10, 1);
            bufferFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            flush();
            this.out.writeLazy(bArr, i10, i11);
            this.totalBytesWritten += i11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, s0 s0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(s0 s0Var) throws IOException {
            writeUInt32NoTag(s0Var.getSerializedSize());
            s0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, s0 s0Var) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, s0Var);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            c0.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, i iVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, iVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i10 = iComputeUInt32SizeNoTag + length;
            int i11 = this.limit;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iEncode = w1.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i10 > i11 - this.position) {
                doFlush();
            }
            int i12 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i13 = i12 + iComputeUInt32SizeNoTag2;
                    this.position = i13;
                    int iEncode2 = w1.encode(str, this.buffer, i13, this.limit - i13);
                    this.position = i12;
                    int i14 = (iEncode2 - i12) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i14);
                    this.position = iEncode2;
                    this.totalBytesWritten += i14;
                } else {
                    int iEncodedLength = w1.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = w1.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                }
            } catch (w1.d e10) {
                this.totalBytesWritten -= this.position - i12;
                this.position = i12;
                inefficientWriteStringNoTag(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(x1.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, s0 s0Var, l1 l1Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var, l1Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(s0 s0Var, l1 l1Var) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
            l1Var.writeTo(s0Var, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            flush();
            this.out.write(bArr, i10, i11);
            this.totalBytesWritten += i11;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }
    }

    private static final class e extends c {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.c, com.google.protobuf.CodedOutputStream
        public void flush() {
            c0.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    private static final class f extends b {
        private final OutputStream out;

        f(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i10) throws IOException {
            if (this.limit - this.position < i10) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte b10) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i10, 0);
            buffer(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, i iVar) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(iVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(i iVar) throws IOException {
            writeUInt32NoTag(iVar.size());
            iVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i10, 5);
            bufferFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i10, 1);
            bufferFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, s0 s0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(s0 s0Var) throws IOException {
            writeUInt32NoTag(s0Var.getSerializedSize());
            s0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, s0 s0Var) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, s0Var);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            c0.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, i iVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, iVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i10 = iComputeUInt32SizeNoTag + length;
                int i11 = this.limit;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iEncode = w1.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i10 > i11 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i12 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i13 = i12 + iComputeUInt32SizeNoTag2;
                        this.position = i13;
                        int iEncode2 = w1.encode(str, this.buffer, i13, this.limit - i13);
                        this.position = i12;
                        iEncodedLength = (iEncode2 - i12) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = w1.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = w1.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (w1.d e10) {
                    this.totalBytesWritten -= this.position - i12;
                    this.position = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (w1.d e12) {
                inefficientWriteStringNoTag(str, e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(x1.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, s0 s0Var, l1 l1Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var, l1Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(s0 s0Var, l1 l1Var) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
            l1Var.writeTo(s0Var, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.limit;
            int i13 = this.position;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.buffer, i13, i11);
                this.position += i11;
                this.totalBytesWritten += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.buffer, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.position = this.limit;
            this.totalBytesWritten += i14;
            doFlush();
            if (i16 <= this.limit) {
                System.arraycopy(bArr, i15, this.buffer, 0, i16);
                this.position = i16;
            } else {
                this.out.write(bArr, i15, i16);
            }
            this.totalBytesWritten += i16;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.limit;
            int i11 = this.position;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.buffer, i11, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.buffer, i11, i12);
            int i13 = iRemaining - i12;
            this.position = this.limit;
            this.totalBytesWritten += i12;
            doFlush();
            while (true) {
                int i14 = this.limit;
                if (i13 > i14) {
                    byteBuffer.get(this.buffer, 0, i14);
                    this.out.write(this.buffer, 0, this.limit);
                    int i15 = this.limit;
                    i13 -= i15;
                    this.totalBytesWritten += i15;
                } else {
                    byteBuffer.get(this.buffer, 0, i13);
                    this.position = i13;
                    this.totalBytesWritten += i13;
                    return;
                }
            }
        }
    }

    private static final class g extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        g(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws IOException {
            try {
                w1.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            c0.position(this.originalBuffer, this.buffer.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte b10) throws IOException {
            try {
                this.buffer.put(b10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, i iVar) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(iVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(i iVar) throws IOException {
            writeUInt32NoTag(iVar.size());
            iVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            try {
                this.buffer.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            try {
                this.buffer.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, s0 s0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(s0 s0Var) throws IOException {
            writeUInt32NoTag(s0Var.getSerializedSize());
            s0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, s0 s0Var) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, s0Var);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            c0.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, i iVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, iVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                    c0.position(this.buffer, iPosition2);
                    encode(str);
                    int iPosition3 = this.buffer.position();
                    c0.position(this.buffer, iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    c0.position(this.buffer, iPosition3);
                } else {
                    writeUInt32NoTag(w1.encodedLength(str));
                    encode(str);
                }
            } catch (w1.d e10) {
                c0.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(x1.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.buffer.put((byte) i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            while (((-128) & j10) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.buffer.put((byte) j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.buffer.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, s0 s0Var, l1 l1Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var, l1Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(s0 s0Var, l1 l1Var) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
            l1Var.writeTo(s0Var, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }
    }

    private static final class h extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        h(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = v1.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) byteBuffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j10) {
            return (int) (j10 - this.address);
        }

        static boolean isSupported() {
            return v1.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j10) {
            c0.position(this.buffer, bufferPos(j10));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            c0.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte b10) throws IOException {
            long j10 = this.position;
            if (j10 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j10;
            v1.putByte(j10, b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, i iVar) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(iVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(i iVar) throws IOException {
            writeUInt32NoTag(iVar.size());
            iVar.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i10);
            this.position += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j10);
            this.position += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, s0 s0Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(s0 s0Var) throws IOException {
            writeUInt32NoTag(s0Var.getSerializedSize());
            s0Var.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, s0 s0Var) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, s0Var);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            c0.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, i iVar) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, iVar);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j10 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                    c0.position(this.buffer, iBufferPos);
                    w1.encodeUtf8(str, this.buffer);
                    int iPosition = this.buffer.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.position += (long) iPosition;
                } else {
                    int iEncodedLength = w1.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    w1.encodeUtf8(str, this.buffer);
                    this.position += (long) iEncodedLength;
                }
            } catch (w1.d e10) {
                this.position = j10;
                repositionBuffer(j10);
                inefficientWriteStringNoTag(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(x1.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i10 & (-128)) != 0) {
                    long j10 = this.position;
                    this.position = j10 + 1;
                    v1.putByte(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                long j11 = this.position;
                this.position = 1 + j11;
                v1.putByte(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.position;
                if (j12 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.position = 1 + j12;
                    v1.putByte(j12, (byte) i10);
                    return;
                } else {
                    this.position = j12 + 1;
                    v1.putByte(j12, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.position;
                    this.position = j11 + 1;
                    v1.putByte(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.position;
                this.position = 1 + j12;
                v1.putByte(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.position;
                if (j13 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.position = 1 + j13;
                    v1.putByte(j13, (byte) j10);
                    return;
                } else {
                    this.position = j13 + 1;
                    v1.putByte(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, s0 s0Var, l1 l1Var) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(s0Var, l1Var);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(s0 s0Var, l1 l1Var) throws IOException {
            writeUInt32NoTag(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
            l1Var.writeTo(s0Var, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.limit - j10;
                long j12 = this.position;
                if (j11 >= j12) {
                    v1.copyMemory(bArr, i10, j12, j10);
                    this.position += j10;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.h
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) iRemaining;
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeTagSize(i10) + computeBoolSizeNoTag(z10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeTagSize(i10) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeTagSize(i10) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i10, i iVar) {
        return computeTagSize(i10) + computeBytesSizeNoTag(iVar);
    }

    public static int computeBytesSizeNoTag(i iVar) {
        return computeLengthDelimitedFieldSize(iVar.size());
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeTagSize(i10) + computeDoubleSizeNoTag(d10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeTagSize(i10) + computeEnumSizeNoTag(i11);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeTagSize(i10) + computeFixed32SizeNoTag(i11);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j10) {
        return computeTagSize(i10) + computeFixed64SizeNoTag(j10);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeTagSize(i10) + computeFloatSizeNoTag(f10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, s0 s0Var) {
        return (computeTagSize(i10) * 2) + s0Var.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(s0 s0Var) {
        return s0Var.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeInt32SizeNoTag(i11);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeUInt32SizeNoTag(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeInt64SizeNoTag(j10);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, f0 f0Var) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeLazyFieldSize(3, f0Var);
    }

    public static int computeLazyFieldSize(int i10, f0 f0Var) {
        return computeTagSize(i10) + computeLazyFieldSizeNoTag(f0Var);
    }

    public static int computeLazyFieldSizeNoTag(f0 f0Var) {
        return computeLengthDelimitedFieldSize(f0Var.getSerializedSize());
    }

    static int computeLengthDelimitedFieldSize(int i10) {
        return computeUInt32SizeNoTag(i10) + i10;
    }

    public static int computeMessageSetExtensionSize(int i10, s0 s0Var) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeMessageSize(3, s0Var);
    }

    public static int computeMessageSize(int i10, s0 s0Var) {
        return computeTagSize(i10) + computeMessageSizeNoTag(s0Var);
    }

    public static int computeMessageSizeNoTag(s0 s0Var) {
        return computeLengthDelimitedFieldSize(s0Var.getSerializedSize());
    }

    static int computePreferredBufferSize(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int computeRawMessageSetExtensionSize(int i10, i iVar) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeBytesSize(3, iVar);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeTagSize(i10) + computeSFixed32SizeNoTag(i11);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j10) {
        return computeTagSize(i10) + computeSFixed64SizeNoTag(j10);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeSInt32SizeNoTag(i11);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeSInt64SizeNoTag(j10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i10, String str) {
        return computeTagSize(i10) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = w1.encodedLength(str);
        } catch (w1.d unused) {
            length = str.getBytes(a0.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(x1.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeUInt32SizeNoTag(i11);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeUInt64SizeNoTag(j10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, w1.d dVar) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.h
    public abstract void write(byte b10) throws IOException;

    @Override // com.google.protobuf.h
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.h
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, i iVar) throws IOException;

    public abstract void writeBytesNoTag(i iVar) throws IOException;

    public final void writeDouble(int i10, double d10) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j10) throws IOException;

    public abstract void writeFixed64NoTag(long j10) throws IOException;

    public final void writeFloat(int i10, float f10) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i10, s0 s0Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(s0Var);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(s0 s0Var) throws IOException {
        s0Var.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, j10);
    }

    public final void writeInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    @Override // com.google.protobuf.h
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.h
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, s0 s0Var) throws IOException;

    abstract void writeMessage(int i10, s0 s0Var, l1 l1Var) throws IOException;

    public abstract void writeMessageNoTag(s0 s0Var) throws IOException;

    abstract void writeMessageNoTag(s0 s0Var, l1 l1Var) throws IOException;

    public abstract void writeMessageSetExtension(int i10, s0 s0Var) throws IOException;

    public final void writeRawByte(byte b10) throws IOException {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public abstract void writeRawMessageSetExtension(int i10, i iVar) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j10) throws IOException {
        writeFixed64(i10, j10);
    }

    public final void writeSFixed64NoTag(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, encodeZigZag64(j10));
    }

    public final void writeSInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j10));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j10) throws IOException;

    public abstract void writeUInt64NoTag(long j10) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    static int computeGroupSize(int i10, s0 s0Var, l1 l1Var) {
        return (computeTagSize(i10) * 2) + computeGroupSizeNoTag(s0Var, l1Var);
    }

    @Deprecated
    static int computeGroupSizeNoTag(s0 s0Var, l1 l1Var) {
        return ((com.google.protobuf.a) s0Var).getSerializedSize(l1Var);
    }

    static int computeMessageSize(int i10, s0 s0Var, l1 l1Var) {
        return computeTagSize(i10) + computeMessageSizeNoTag(s0Var, l1Var);
    }

    static int computeMessageSizeNoTag(s0 s0Var, l1 l1Var) {
        return computeLengthDelimitedFieldSize(((com.google.protobuf.a) s0Var).getSerializedSize(l1Var));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new f(outputStream, i10);
    }

    @Deprecated
    final void writeGroupNoTag(s0 s0Var, l1 l1Var) throws IOException {
        l1Var.writeTo(s0Var, this.wrapper);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(i iVar) throws IOException {
        iVar.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    @Deprecated
    final void writeGroup(int i10, s0 s0Var, l1 l1Var) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(s0Var, l1Var);
        writeTag(i10, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (h.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(com.google.protobuf.h hVar, int i10) {
        if (i10 >= 0) {
            return new d(hVar, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
