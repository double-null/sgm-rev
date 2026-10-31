package af;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f384d;

    public o(g source, Inflater inflater) {
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(inflater, "inflater");
        this.f381a = source;
        this.f382b = inflater;
    }

    private final void e() throws IOException {
        int i10 = this.f383c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f382b.getRemaining();
        this.f383c -= remaining;
        this.f381a.skip(remaining);
    }

    public final long b(e sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f384d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            x xVarF = sink.F(1);
            int iMin = (int) Math.min(j10, 8192 - xVarF.f403c);
            c();
            int iInflate = this.f382b.inflate(xVarF.f401a, xVarF.f403c, iMin);
            e();
            if (iInflate > 0) {
                xVarF.f403c += iInflate;
                long j11 = iInflate;
                sink.z(sink.size() + j11);
                return j11;
            }
            if (xVarF.f402b == xVarF.f403c) {
                sink.f352a = xVarF.b();
                y.b(xVarF);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean c() throws IOException {
        if (!this.f382b.needsInput()) {
            return false;
        }
        if (this.f381a.exhausted()) {
            return true;
        }
        x xVar = this.f381a.getBuffer().f352a;
        kotlin.jvm.internal.t.c(xVar);
        int i10 = xVar.f403c;
        int i11 = xVar.f402b;
        int i12 = i10 - i11;
        this.f383c = i12;
        this.f382b.setInput(xVar.f401a, i11, i12);
        return false;
    }

    @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f384d) {
            return;
        }
        this.f382b.end();
        this.f384d = true;
        this.f381a.close();
    }

    @Override // af.c0
    public long read(e sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        do {
            long jB = b(sink, j10);
            if (jB > 0) {
                return jB;
            }
            if (this.f382b.finished() || this.f382b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f381a.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // af.c0
    public d0 timeout() {
        return this.f381a.timeout();
    }
}
