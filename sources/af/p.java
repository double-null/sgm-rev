package af;

import java.io.IOException;
import java.io.InputStream;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
class p implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f386b;

    @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f385a.close();
    }

    @Override // af.c0
    public long read(e sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f386b.f();
            x xVarF = sink.F(1);
            int i10 = this.f385a.read(xVarF.f401a, xVarF.f403c, (int) Math.min(j10, 8192 - xVarF.f403c));
            if (i10 != -1) {
                xVarF.f403c += i10;
                long j11 = i10;
                sink.z(sink.size() + j11);
                return j11;
            }
            if (xVarF.f402b != xVarF.f403c) {
                return -1L;
            }
            sink.f352a = xVarF.b();
            y.b(xVarF);
            return -1L;
        } catch (AssertionError e10) {
            if (q.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // af.c0
    public d0 timeout() {
        return this.f386b;
    }

    public String toString() {
        return "source(" + this.f385a + ')';
    }

    public p(InputStream inputStream, d0 timeout) {
        kotlin.jvm.internal.t.f(inputStream, cNMUz.AtgeEtucrrLpug);
        kotlin.jvm.internal.t.f(timeout, "timeout");
        this.f385a = inputStream;
        this.f386b = timeout;
    }
}
