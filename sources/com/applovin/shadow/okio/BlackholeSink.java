package com.applovin.shadow.okio;

import java.io.EOFException;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes.dex */
final class BlackholeSink implements Sink {
    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws EOFException {
        kotlin.jvm.internal.t.f(source, "source");
        source.skip(j10);
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }
}
