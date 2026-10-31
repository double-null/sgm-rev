package ue;

import b2.Bo.yeILL;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Http2Writer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f27040g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f27041h = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af.f f27042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final af.e f27044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c.b f27047f;

    /* JADX INFO: compiled from: Http2Writer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public i(af.f sink, boolean z10) {
        t.f(sink, "sink");
        this.f27042a = sink;
        this.f27043b = z10;
        af.e eVar = new af.e();
        this.f27044c = eVar;
        this.f27045d = Http2.INITIAL_MAX_FRAME_SIZE;
        this.f27047f = new c.b(0, false, eVar, 3, null);
    }

    private final void z(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.f27045d, j10);
            j10 -= jMin;
            h(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f27042a.y(this.f27044c, jMin);
        }
    }

    public final synchronized void b(l peerSettings) throws IOException {
        t.f(peerSettings, "peerSettings");
        if (this.f27046e) {
            throw new IOException("closed");
        }
        this.f27045d = peerSettings.e(this.f27045d);
        if (peerSettings.b() != -1) {
            this.f27047f.e(peerSettings.b());
        }
        h(0, 0, 4, 1);
        this.f27042a.flush();
    }

    public final synchronized void c() throws IOException {
        if (this.f27046e) {
            throw new IOException("closed");
        }
        if (this.f27043b) {
            Logger logger = f27041h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(ne.d.t(t.n(">> CONNECTION ", d.f26891b.p()), new Object[0]));
            }
            this.f27042a.D(d.f26891b);
            this.f27042a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f27046e = true;
        this.f27042a.close();
    }

    public final synchronized void e(boolean z10, int i10, af.e eVar, int i11) throws IOException {
        if (this.f27046e) {
            throw new IOException("closed");
        }
        f(i10, z10 ? 1 : 0, eVar, i11);
    }

    public final void f(int i10, int i11, af.e eVar, int i12) throws IOException {
        h(i10, i12, 0, i11);
        if (i12 > 0) {
            af.f fVar = this.f27042a;
            t.c(eVar);
            fVar.y(eVar, i12);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.f27046e) {
            throw new IOException("closed");
        }
        this.f27042a.flush();
    }

    public final void h(int i10, int i11, int i12, int i13) throws IOException {
        Logger logger = f27041h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.f26890a.c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f27045d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f27045d + ": " + i11).toString());
        }
        if (!((Integer.MIN_VALUE & i10) == 0)) {
            throw new IllegalArgumentException(t.n("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        ne.d.a0(this.f27042a, i11);
        this.f27042a.writeByte(i12 & 255);
        this.f27042a.writeByte(i13 & 255);
        this.f27042a.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void k(int i10, ue.a errorCode, byte[] bArr) throws IOException {
        t.f(errorCode, "errorCode");
        t.f(bArr, yeILL.tSUIugh);
        if (this.f27046e) {
            throw new IOException("closed");
        }
        if (!(errorCode.c() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        h(0, bArr.length + 8, 7, 0);
        this.f27042a.writeInt(i10);
        this.f27042a.writeInt(errorCode.c());
        if (!(bArr.length == 0)) {
            this.f27042a.write(bArr);
        }
        this.f27042a.flush();
    }

    public final synchronized void n(boolean z10, int i10, List<b> headerBlock) throws IOException {
        t.f(headerBlock, "headerBlock");
        if (this.f27046e) {
            throw new IOException("closed");
        }
        this.f27047f.g(headerBlock);
        long size = this.f27044c.size();
        long jMin = Math.min(this.f27045d, size);
        int i11 = size == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        h(i10, (int) jMin, 1, i11);
        this.f27042a.y(this.f27044c, jMin);
        if (size > jMin) {
            z(i10, size - jMin);
        }
    }

    public final int o() {
        return this.f27045d;
    }

    public final synchronized void p(boolean z10, int i10, int i11) throws IOException {
        if (this.f27046e) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z10 ? 1 : 0);
        this.f27042a.writeInt(i10);
        this.f27042a.writeInt(i11);
        this.f27042a.flush();
    }

    public final synchronized void s(int i10, int i11, List<b> requestHeaders) throws IOException {
        t.f(requestHeaders, "requestHeaders");
        if (this.f27046e) {
            throw new IOException("closed");
        }
        this.f27047f.g(requestHeaders);
        long size = this.f27044c.size();
        int iMin = (int) Math.min(((long) this.f27045d) - 4, size);
        long j10 = iMin;
        h(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f27042a.writeInt(i11 & Integer.MAX_VALUE);
        this.f27042a.y(this.f27044c, j10);
        if (size > j10) {
            z(i10, size - j10);
        }
    }

    public final synchronized void t(int i10, ue.a errorCode) throws IOException {
        t.f(errorCode, "errorCode");
        if (this.f27046e) {
            throw new IOException("closed");
        }
        if (!(errorCode.c() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        h(i10, 4, 3, 0);
        this.f27042a.writeInt(errorCode.c());
        this.f27042a.flush();
    }

    public final synchronized void u(l settings) throws IOException {
        int i10;
        t.f(settings, "settings");
        if (this.f27046e) {
            throw new IOException("closed");
        }
        int i11 = 0;
        h(0, settings.i() * 6, 4, 0);
        while (i11 < 10) {
            int i12 = i11 + 1;
            if (settings.f(i11)) {
                if (i11 != 4) {
                    i10 = i11 != 7 ? i11 : 4;
                } else {
                    i10 = 3;
                }
                this.f27042a.writeShort(i10);
                this.f27042a.writeInt(settings.a(i11));
            }
            i11 = i12;
        }
        this.f27042a.flush();
    }

    public final synchronized void v(int i10, long j10) throws IOException {
        if (this.f27046e) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(t.n("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
        }
        h(i10, 4, 8, 0);
        this.f27042a.writeInt((int) j10);
        this.f27042a.flush();
    }
}
