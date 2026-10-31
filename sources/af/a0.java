package af;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: compiled from: Sink.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @Override // java.io.Flushable
    void flush() throws IOException;

    d0 timeout();

    void y(e eVar, long j10) throws IOException;
}
