package af;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f369a;

    public j(a0 delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.f369a = delegate;
    }

    @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f369a.close();
    }

    @Override // af.a0, java.io.Flushable
    public void flush() throws IOException {
        this.f369a.flush();
    }

    @Override // af.a0
    public d0 timeout() {
        return this.f369a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f369a + ')';
    }

    @Override // af.a0
    public void y(e source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        this.f369a.y(source, j10);
    }
}
