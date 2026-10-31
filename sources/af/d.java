package af;

import java.io.EOFException;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes5.dex */
final class d implements a0 {
    @Override // af.a0
    public d0 timeout() {
        return d0.f348e;
    }

    @Override // af.a0
    public void y(e source, long j10) throws EOFException {
        kotlin.jvm.internal.t.f(source, "source");
        source.skip(j10);
    }

    @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // af.a0, java.io.Flushable
    public void flush() {
    }
}
