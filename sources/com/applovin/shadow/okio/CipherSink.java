package com.applovin.shadow.okio;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* JADX INFO: compiled from: CipherSink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CipherSink implements Sink {
    private final int blockSize;
    private final Cipher cipher;
    private boolean closed;
    private final BufferedSink sink;

    public CipherSink(BufferedSink sink, Cipher cipher) {
        kotlin.jvm.internal.t.f(sink, "sink");
        kotlin.jvm.internal.t.f(cipher, "cipher");
        this.sink = sink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                BufferedSink bufferedSink = this.sink;
                byte[] bArrDoFinal = this.cipher.doFinal();
                kotlin.jvm.internal.t.e(bArrDoFinal, "doFinal(...)");
                bufferedSink.write(bArrDoFinal);
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        }
        Buffer buffer = this.sink.getBuffer();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
            segmentWritableSegment$okio.limit += iDoFinal;
            buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
        } catch (Throwable th3) {
            th = th3;
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        return th;
    }

    private final int update(Buffer buffer, long j10) throws IOException, ShortBufferException {
        Segment segment = buffer.head;
        kotlin.jvm.internal.t.c(segment);
        int iMin = (int) Math.min(j10, segment.limit - segment.pos);
        Buffer buffer2 = this.sink.getBuffer();
        int outputSize = this.cipher.getOutputSize(iMin);
        while (outputSize > 8192) {
            int i10 = this.blockSize;
            if (iMin <= i10) {
                BufferedSink bufferedSink = this.sink;
                byte[] bArrUpdate = this.cipher.update(buffer.readByteArray(j10));
                kotlin.jvm.internal.t.e(bArrUpdate, "update(...)");
                bufferedSink.write(bArrUpdate);
                return (int) j10;
            }
            iMin -= i10;
            outputSize = this.cipher.getOutputSize(iMin);
        }
        Segment segmentWritableSegment$okio = buffer2.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, iMin, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
        segmentWritableSegment$okio.limit += iUpdate;
        buffer2.setSize$okio(buffer2.size() + ((long) iUpdate));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer2.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        this.sink.emitCompleteSegments();
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        int i11 = segment.pos + iMin;
        segment.pos = i11;
        if (i11 == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.closed = true;
        Throwable thDoFinal = doFinal();
        try {
            this.sink.close();
        } catch (Throwable th) {
            if (thDoFinal == null) {
                thDoFinal = th;
            }
        }
        if (thDoFinal != null) {
            throw thDoFinal;
        }
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.sink.flush();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            j10 -= (long) update(source, j10);
        }
    }
}
