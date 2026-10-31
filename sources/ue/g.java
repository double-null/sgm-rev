package ue;

import af.c0;
import af.d0;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Http2Reader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27000e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f27001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af.g f27002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f27004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ue.c.a f27005d;

    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Logger a() {
            return g.f27001f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    public interface c {
        void a(int i10, ue.a aVar);

        void ackSettings();

        void b(int i10, ue.a aVar, af.h hVar);

        void c(boolean z10, int i10, af.g gVar, int i11) throws IOException;

        void d(boolean z10, l lVar);

        void headers(boolean z10, int i10, int i11, List<ue.b> list);

        void ping(boolean z10, int i10, int i11);

        void priority(int i10, int i11, int i12, boolean z10);

        void pushPromise(int i10, int i11, List<ue.b> list) throws IOException;

        void windowUpdate(int i10, long j10);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        t.e(logger, "getLogger(Http2::class.java.name)");
        f27001f = logger;
    }

    public g(af.g source, boolean z10) {
        t.f(source, "source");
        this.f27002a = source;
        this.f27003b = z10;
        b bVar = new b(source);
        this.f27004c = bVar;
        this.f27005d = new ue.c.a(bVar, 4096, 0, 4, null);
    }

    private final void f(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i11 & 8) != 0 ? ne.d.d(this.f27002a.readByte(), 255) : 0;
        cVar.c(z10, i12, this.f27002a, f27000e.b(i10, i11, iD));
        this.f27002a.skip(iD);
    }

    private final void h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException(t.n("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f27002a.readInt();
        int i14 = this.f27002a.readInt();
        int i15 = i10 - 8;
        ue.a aVarA = ue.a.f26842b.a(i14);
        if (aVarA == null) {
            throw new IOException(t.n("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i14)));
        }
        af.h byteString = af.h.f362e;
        if (i15 > 0) {
            byteString = this.f27002a.readByteString(i15);
        }
        cVar.b(i13, aVarA, byteString);
    }

    private final List<ue.b> k(int i10, int i11, int i12, int i13) throws IOException {
        this.f27004c.f(i10);
        b bVar = this.f27004c;
        bVar.h(bVar.b());
        this.f27004c.k(i11);
        this.f27004c.e(i12);
        this.f27004c.n(i13);
        this.f27005d.k();
        return this.f27005d.e();
    }

    private final void n(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iD = (i11 & 8) != 0 ? ne.d.d(this.f27002a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            p(cVar, i12);
            i10 -= 5;
        }
        cVar.headers(z10, i12, -1, k(f27000e.b(i10, i11, iD), iD, i11, i12));
    }

    private final void o(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException(t.n("TYPE_PING length != 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.ping((i11 & 1) != 0, this.f27002a.readInt(), this.f27002a.readInt());
    }

    private final void p(c cVar, int i10) throws IOException {
        int i11 = this.f27002a.readInt();
        cVar.priority(i10, i11 & Integer.MAX_VALUE, ne.d.d(this.f27002a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void s(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            p(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void t(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i11 & 8) != 0 ? ne.d.d(this.f27002a.readByte(), 255) : 0;
        cVar.pushPromise(i12, this.f27002a.readInt() & Integer.MAX_VALUE, k(f27000e.b(i10 - 4, i11, iD), iD, i11, i12));
    }

    private final void u(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f27002a.readInt();
        ue.a aVarA = ue.a.f26842b.a(i13);
        if (aVarA == null) {
            throw new IOException(t.n("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i13)));
        }
        cVar.a(i12, aVarA);
    }

    private final void v(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.ackSettings();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException(t.n("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i10)));
        }
        l lVar = new l();
        od.f fVarM = od.k.m(od.k.n(0, i10), 6);
        int iA = fVarM.a();
        int iC = fVarM.c();
        int iD = fVarM.d();
        if ((iD > 0 && iA <= iC) || (iD < 0 && iC <= iA)) {
            while (true) {
                int i13 = iA + iD;
                int iE = ne.d.e(this.f27002a.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int i14 = this.f27002a.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i14 < 16384 || i14 > 16777215)) {
                            throw new IOException(t.n("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i14)));
                        }
                    } else {
                        if (i14 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i14 != 0 && i14 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                lVar.h(iE, i14);
                if (iA != iC) {
                    iA = i13;
                }
            }
        }
        cVar.d(false, lVar);
    }

    private final void z(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException(t.n("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
        }
        long jF = ne.d.f(this.f27002a.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.windowUpdate(i12, jF);
    }

    public final boolean c(boolean z10, c handler) throws IOException {
        t.f(handler, "handler");
        try {
            this.f27002a.require(9L);
            int iK = ne.d.K(this.f27002a);
            if (iK > 16384) {
                throw new IOException(t.n("FRAME_SIZE_ERROR: ", Integer.valueOf(iK)));
            }
            int iD = ne.d.d(this.f27002a.readByte(), 255);
            int iD2 = ne.d.d(this.f27002a.readByte(), 255);
            int i10 = this.f27002a.readInt() & Integer.MAX_VALUE;
            Logger logger = f27001f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.f26890a.c(true, i10, iK, iD, iD2));
            }
            if (z10 && iD != 4) {
                throw new IOException(t.n("Expected a SETTINGS frame but was ", d.f26890a.b(iD)));
            }
            switch (iD) {
                case 0:
                    f(handler, iK, iD2, i10);
                    return true;
                case 1:
                    n(handler, iK, iD2, i10);
                    return true;
                case 2:
                    s(handler, iK, iD2, i10);
                    return true;
                case 3:
                    u(handler, iK, iD2, i10);
                    return true;
                case 4:
                    v(handler, iK, iD2, i10);
                    return true;
                case 5:
                    t(handler, iK, iD2, i10);
                    return true;
                case 6:
                    o(handler, iK, iD2, i10);
                    return true;
                case 7:
                    h(handler, iK, iD2, i10);
                    return true;
                case 8:
                    z(handler, iK, iD2, i10);
                    return true;
                default:
                    this.f27002a.skip(iK);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27002a.close();
    }

    public final void e(c handler) throws IOException {
        t.f(handler, "handler");
        if (this.f27003b) {
            if (!c(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        af.g gVar = this.f27002a;
        af.h hVar = d.f26891b;
        af.h byteString = gVar.readByteString(hVar.F());
        Logger logger = f27001f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(ne.d.t(t.n("<< CONNECTION ", byteString.p()), new Object[0]));
        }
        if (!t.a(hVar, byteString)) {
            throw new IOException(t.n("Expected a connection header but was ", byteString.I()));
        }
    }

    /* JADX INFO: compiled from: Http2Reader.kt */
    public static final class b implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final af.g f27006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27011f;

        public b(af.g source) {
            t.f(source, "source");
            this.f27006a = source;
        }

        private final void c() throws IOException {
            int i10 = this.f27009d;
            int iK = ne.d.K(this.f27006a);
            this.f27010e = iK;
            this.f27007b = iK;
            int iD = ne.d.d(this.f27006a.readByte(), 255);
            this.f27008c = ne.d.d(this.f27006a.readByte(), 255);
            a aVar = g.f27000e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(d.f26890a.c(true, this.f27009d, this.f27007b, iD, this.f27008c));
            }
            int i11 = this.f27006a.readInt() & Integer.MAX_VALUE;
            this.f27009d = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        public final int b() {
            return this.f27010e;
        }

        public final void e(int i10) {
            this.f27008c = i10;
        }

        public final void f(int i10) {
            this.f27010e = i10;
        }

        public final void h(int i10) {
            this.f27007b = i10;
        }

        public final void k(int i10) {
            this.f27011f = i10;
        }

        public final void n(int i10) {
            this.f27009d = i10;
        }

        @Override // af.c0
        public long read(af.e sink, long j10) throws IOException {
            t.f(sink, "sink");
            while (true) {
                int i10 = this.f27010e;
                if (i10 != 0) {
                    long j11 = this.f27006a.read(sink, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f27010e -= (int) j11;
                    return j11;
                }
                this.f27006a.skip(this.f27011f);
                this.f27011f = 0;
                if ((this.f27008c & 4) != 0) {
                    return -1L;
                }
                c();
            }
        }

        @Override // af.c0
        public d0 timeout() {
            return this.f27006a.timeout();
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
