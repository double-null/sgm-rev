package af;

import c0.IbU.elEbP;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f380e;

    public n(c0 source) {
        kotlin.jvm.internal.t.f(source, "source");
        w wVar = new w(source);
        this.f377b = wVar;
        Inflater inflater = new Inflater(true);
        this.f378c = inflater;
        this.f379d = new o(wVar, inflater);
        this.f380e = new CRC32();
    }

    private final void c() throws IOException {
        this.f377b.require(10L);
        byte bT = this.f377b.f397b.t(3L);
        boolean z10 = ((bT >> 1) & 1) == 1;
        if (z10) {
            f(this.f377b.f397b, 0L, 10L);
        }
        b("ID1ID2", 8075, this.f377b.readShort());
        this.f377b.skip(8L);
        if (((bT >> 2) & 1) == 1) {
            this.f377b.require(2L);
            if (z10) {
                f(this.f377b.f397b, 0L, 2L);
            }
            long shortLe = this.f377b.f397b.readShortLe() & 65535;
            this.f377b.require(shortLe);
            if (z10) {
                f(this.f377b.f397b, 0L, shortLe);
            }
            this.f377b.skip(shortLe);
        }
        if (((bT >> 3) & 1) == 1) {
            long jIndexOf = this.f377b.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z10) {
                f(this.f377b.f397b, 0L, jIndexOf + 1);
            }
            this.f377b.skip(jIndexOf + 1);
        }
        if (((bT >> 4) & 1) == 1) {
            long jIndexOf2 = this.f377b.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                f(this.f377b.f397b, 0L, jIndexOf2 + 1);
            }
            this.f377b.skip(jIndexOf2 + 1);
        }
        if (z10) {
            b("FHCRC", this.f377b.readShortLe(), (short) this.f380e.getValue());
            this.f380e.reset();
        }
    }

    private final void e() throws IOException {
        b("CRC", this.f377b.readIntLe(), (int) this.f380e.getValue());
        b("ISIZE", this.f377b.readIntLe(), (int) this.f378c.getBytesWritten());
    }

    private final void f(e eVar, long j10, long j11) {
        x xVar = eVar.f352a;
        kotlin.jvm.internal.t.c(xVar);
        while (true) {
            int i10 = xVar.f403c;
            int i11 = xVar.f402b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) xVar.f402b) + j10);
            int iMin = (int) Math.min(xVar.f403c - i12, j11);
            this.f380e.update(xVar.f401a, i12, iMin);
            j11 -= (long) iMin;
            xVar = xVar.f406f;
            kotlin.jvm.internal.t.c(xVar);
            j10 = 0;
        }
    }

    @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f379d.close();
    }

    @Override // af.c0
    public long read(e sink, long j10) throws IOException {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f376a == 0) {
            c();
            this.f376a = (byte) 1;
        }
        if (this.f376a == 1) {
            long size = sink.size();
            long j11 = this.f379d.read(sink, j10);
            if (j11 != -1) {
                f(sink, size, j11);
                return j11;
            }
            this.f376a = (byte) 2;
        }
        if (this.f376a == 2) {
            e();
            this.f376a = (byte) 3;
            if (!this.f377b.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // af.c0
    public d0 timeout() {
        return this.f377b.timeout();
    }

    private final void b(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        kotlin.jvm.internal.t.e(str2, elEbP.FLfCRzfSdOhpzNR);
        throw new IOException(str2);
    }
}
