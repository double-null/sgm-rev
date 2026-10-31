package af;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: Source.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(e eVar, long j10) throws IOException;

    d0 timeout();
}
