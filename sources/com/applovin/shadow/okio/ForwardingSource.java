package com.applovin.shadow.okio;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingSource implements Source {
    private final Source delegate;

    public ForwardingSource(Source delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m155deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
