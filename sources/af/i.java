package af;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f368c;

    public i(f sink, Deflater deflater) {
        kotlin.jvm.internal.t.f(sink, "sink");
        kotlin.jvm.internal.t.f(deflater, "deflater");
        this.f366a = sink;
        this.f367b = deflater;
    }

    private final void b(boolean z10) throws IOException {
        x xVarF;
        int iDeflate;
        e buffer = this.f366a.getBuffer();
        while (true) {
            xVarF = buffer.F(1);
            if (z10) {
                Deflater deflater = this.f367b;
                byte[] bArr = xVarF.f401a;
                int i10 = xVarF.f403c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.f367b;
                byte[] bArr2 = xVarF.f401a;
                int i11 = xVarF.f403c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                xVarF.f403c += iDeflate;
                buffer.z(buffer.size() + ((long) iDeflate));
                this.f366a.emitCompleteSegments();
            } else if (this.f367b.needsInput()) {
                break;
            }
        }
        if (xVarF.f402b == xVarF.f403c) {
            buffer.f352a = xVarF.b();
            y.b(xVarF);
        }
    }

    public final void c() throws IOException {
        this.f367b.finish();
        b(false);
    }

    @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f368c) {
            return;
        }
        c();
        th = null;
        try {
            this.f367b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f366a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f368c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // af.a0, java.io.Flushable
    public void flush() throws IOException {
        b(true);
        this.f366a.flush();
    }

    @Override // af.a0
    public d0 timeout() {
        return this.f366a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f366a + ')';
    }

    @Override // af.a0
    public void y(e source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            x xVar = source.f352a;
            kotlin.jvm.internal.t.c(xVar);
            int iMin = (int) Math.min(j10, xVar.f403c - xVar.f402b);
            this.f367b.setInput(xVar.f401a, xVar.f402b, iMin);
            b(false);
            long j11 = iMin;
            source.z(source.size() - j11);
            int i10 = xVar.f402b + iMin;
            xVar.f402b = i10;
            if (i10 == xVar.f403c) {
                source.f352a = xVar.b();
                y.b(xVar);
            }
            j10 -= j11;
        }
    }
}
