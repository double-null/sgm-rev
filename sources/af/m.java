package af;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f375e;

    public m(a0 sink) {
        kotlin.jvm.internal.t.f(sink, "sink");
        v vVar = new v(sink);
        this.f371a = vVar;
        Deflater deflater = new Deflater(-1, true);
        this.f372b = deflater;
        this.f373c = new i(vVar, deflater);
        this.f375e = new CRC32();
        e eVar = vVar.f394b;
        eVar.writeShort(8075);
        eVar.writeByte(8);
        eVar.writeByte(0);
        eVar.writeInt(0);
        eVar.writeByte(0);
        eVar.writeByte(0);
    }

    private final void b(e eVar, long j10) {
        x xVar = eVar.f352a;
        kotlin.jvm.internal.t.c(xVar);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, xVar.f403c - xVar.f402b);
            this.f375e.update(xVar.f401a, xVar.f402b, iMin);
            j10 -= (long) iMin;
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
        }
    }

    private final void c() {
        this.f371a.b((int) this.f375e.getValue());
        this.f371a.b((int) this.f372b.getBytesRead());
    }

    @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f374d) {
            return;
        }
        this.f373c.c();
        c();
        th = null;
        try {
            this.f372b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f371a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f374d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // af.a0, java.io.Flushable
    public void flush() throws IOException {
        this.f373c.flush();
    }

    @Override // af.a0
    public d0 timeout() {
        return this.f371a.timeout();
    }

    @Override // af.a0
    public void y(e source, long j10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        b(source, j10);
        this.f373c.y(source, j10);
    }
}
