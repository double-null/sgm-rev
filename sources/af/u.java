package af;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
final class u implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f392b;

    public u(OutputStream out, d0 timeout) {
        kotlin.jvm.internal.t.f(out, "out");
        kotlin.jvm.internal.t.f(timeout, "timeout");
        this.f391a = out;
        this.f392b = timeout;
    }

    @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f391a.close();
    }

    @Override // af.a0, java.io.Flushable
    public void flush() throws IOException {
        this.f391a.flush();
    }

    @Override // af.a0
    public d0 timeout() {
        return this.f392b;
    }

    public String toString() {
        return "sink(" + this.f391a + ')';
    }

    @Override // af.a0
    public void y(e source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f392b.f();
            x xVar = source.f352a;
            kotlin.jvm.internal.t.c(xVar);
            int iMin = (int) Math.min(j10, xVar.f403c - xVar.f402b);
            this.f391a.write(xVar.f401a, xVar.f402b, iMin);
            xVar.f402b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.z(source.size() - j11);
            if (xVar.f402b == xVar.f403c) {
                source.f352a = xVar.b();
                y.b(xVar);
            }
        }
    }
}
