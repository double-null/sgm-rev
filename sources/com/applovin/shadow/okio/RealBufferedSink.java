package com.applovin.shadow.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            this.sink.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink emit() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink emitCompleteSegments() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.RealBufferedSink.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    return;
                }
                realBufferedSink.flush();
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i10) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    throw new IOException("closed");
                }
                realBufferedSink.bufferField.writeByte((int) ((byte) i10));
                RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int i10, int i11) throws IOException {
                kotlin.jvm.internal.t.f(data, "data");
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.write(data, i10, i11);
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.bufferField.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.bufferField, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            emitCompleteSegments();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeByte(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeByte(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeDecimalLong(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeDecimalLong(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeHexadecimalUnsignedLong(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeInt(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeInt(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeIntLe(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeIntLe(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeLong(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLong(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeLongLe(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLongLe(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeShort(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShort(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeShortLe(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShortLe(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeString(String string, Charset charset) {
        kotlin.jvm.internal.t.f(string, "string");
        kotlin.jvm.internal.t.f(charset, "charset");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8(String string) {
        kotlin.jvm.internal.t.f(string, "string");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8CodePoint(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        if (!this.closed) {
            this.bufferField.write(source, j10);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeString(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.t.f(string, "string");
        kotlin.jvm.internal.t.f(charset, "charset");
        if (!this.closed) {
            this.bufferField.writeString(string, i10, i11, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8(String string, int i10, int i11) {
        kotlin.jvm.internal.t.f(string, "string");
        if (!this.closed) {
            this.bufferField.writeUtf8(string, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        kotlin.jvm.internal.t.f(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(ByteString byteString, int i10, int i11) {
        kotlin.jvm.internal.t.f(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(byte[] source) {
        kotlin.jvm.internal.t.f(source, "source");
        if (!this.closed) {
            this.bufferField.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.t.f(source, "source");
        if (!this.closed) {
            this.bufferField.write(source, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException(zKUlck.JGnvriGCHkBNhI.toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(Source source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
