package af;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k implements c0 {
    private final c0 delegate;

    public k(c0 delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final c0 m0deprecated_delegate() {
        return this.delegate;
    }

    @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final c0 delegate() {
        return this.delegate;
    }

    @Override // af.c0
    public long read(e sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // af.c0
    public d0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
