package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes.dex */
class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public InputStreamSource(InputStream input, Timeout timeout) {
        kotlin.jvm.internal.t.f(input, "input");
        kotlin.jvm.internal.t.f(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int i10 = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit));
            if (i10 != -1) {
                segmentWritableSegment$okio.limit += i10;
                long j11 = i10;
                sink.setSize$okio(sink.size() + j11);
                return j11;
            }
            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                return -1L;
            }
            sink.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
            return -1L;
        } catch (AssertionError e10) {
            if (Okio.isAndroidGetsocknameError(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
