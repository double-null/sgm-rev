package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ForwardingSink;
import com.applovin.shadow.okio.Sink;
import id.l;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;
    private final l<IOException, g0> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(Sink delegate, l<? super IOException, g0> onException) {
        super(delegate);
        t.f(delegate, "delegate");
        t.f(onException, "onException");
        this.onException = onException;
    }

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    public final l<IOException, g0> getOnException() {
        return this.onException;
    }

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws EOFException {
        t.f(source, "source");
        if (this.hasErrors) {
            source.skip(j10);
            return;
        }
        try {
            super.write(source, j10);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
