package te;

import af.a0;
import af.c0;
import af.d0;
import af.l;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import me.b0;
import me.n;
import me.t;
import me.u;
import me.x;
import me.z;
import rd.f0;
import se.i;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements se.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f25799h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f25800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final re.f f25801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final af.g f25802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final af.f f25803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final te.a f25805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f25806g;

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private abstract class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f25807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25809c;

        public a(b this$0) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f25809c = this$0;
            this.f25807a = new l(this$0.f25802c.timeout());
        }

        protected final boolean b() {
            return this.f25808b;
        }

        public final void c() {
            if (this.f25809c.f25804e == 6) {
                return;
            }
            if (this.f25809c.f25804e != 5) {
                throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(this.f25809c.f25804e)));
            }
            this.f25809c.n(this.f25807a);
            this.f25809c.f25804e = 6;
        }

        protected final void e(boolean z10) {
            this.f25808b = z10;
        }

        @Override // af.c0
        public long read(af.e sink, long j10) throws IOException {
            kotlin.jvm.internal.t.f(sink, "sink");
            try {
                return this.f25809c.f25802c.read(sink, j10);
            } catch (IOException e10) {
                this.f25809c.getConnection().y();
                c();
                throw e10;
            }
        }

        @Override // af.c0
        public d0 timeout() {
            return this.f25807a;
        }
    }

    /* JADX INFO: renamed from: te.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private final class C0433b implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f25810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25812c;

        public C0433b(b this$0) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f25812c = this$0;
            this.f25810a = new l(this$0.f25803d.timeout());
        }

        @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f25811b) {
                return;
            }
            this.f25811b = true;
            this.f25812c.f25803d.writeUtf8(UICvx.xmGTWUfmClNE);
            this.f25812c.n(this.f25810a);
            this.f25812c.f25804e = 3;
        }

        @Override // af.a0, java.io.Flushable
        public synchronized void flush() {
            if (this.f25811b) {
                return;
            }
            this.f25812c.f25803d.flush();
        }

        @Override // af.a0
        public d0 timeout() {
            return this.f25810a;
        }

        @Override // af.a0
        public void y(af.e source, long j10) throws IOException {
            kotlin.jvm.internal.t.f(source, "source");
            if (!(!this.f25811b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            this.f25812c.f25803d.writeHexadecimalUnsignedLong(j10);
            this.f25812c.f25803d.writeUtf8("\r\n");
            this.f25812c.f25803d.y(source, j10);
            this.f25812c.f25803d.writeUtf8("\r\n");
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u f25813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f25814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f25816g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b this$0, u url) {
            super(this$0);
            kotlin.jvm.internal.t.f(this$0, "this$0");
            kotlin.jvm.internal.t.f(url, "url");
            this.f25816g = this$0;
            this.f25813d = url;
            this.f25814e = -1L;
            this.f25815f = true;
        }

        private final void f() throws IOException {
            if (this.f25814e != -1) {
                this.f25816g.f25802c.readUtf8LineStrict();
            }
            try {
                this.f25814e = this.f25816g.f25802c.readHexadecimalUnsignedLong();
                String string = f0.d1(this.f25816g.f25802c.readUtf8LineStrict()).toString();
                if (this.f25814e >= 0) {
                    if (!(string.length() > 0) || rd.c0.O(string, ";", false, 2, null)) {
                        if (this.f25814e == 0) {
                            this.f25815f = false;
                            b bVar = this.f25816g;
                            bVar.f25806g = bVar.f25805f.a();
                            x xVar = this.f25816g.f25800a;
                            kotlin.jvm.internal.t.c(xVar);
                            n nVarN = xVar.n();
                            u uVar = this.f25813d;
                            t tVar = this.f25816g.f25806g;
                            kotlin.jvm.internal.t.c(tVar);
                            se.e.f(nVarN, uVar, tVar);
                            c();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f25814e + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.f25815f && !ne.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f25816g.getConnection().y();
                c();
            }
            e(true);
        }

        @Override // te.b.a, af.c0
        public long read(af.e sink, long j10) throws IOException {
            kotlin.jvm.internal.t.f(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!b())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f25815f) {
                return -1L;
            }
            long j11 = this.f25814e;
            if (j11 == 0 || j11 == -1) {
                f();
                if (!this.f25815f) {
                    return -1L;
                }
            }
            long j12 = super.read(sink, Math.min(j10, this.f25814e));
            if (j12 != -1) {
                this.f25814e -= j12;
                return j12;
            }
            this.f25816g.getConnection().y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f25817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f25818e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b this$0, long j10) {
            super(this$0);
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f25818e = this$0;
            this.f25817d = j10;
            if (j10 == 0) {
                c();
            }
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.f25817d != 0 && !ne.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f25818e.getConnection().y();
                c();
            }
            e(true);
        }

        @Override // te.b.a, af.c0
        public long read(af.e sink, long j10) throws IOException {
            kotlin.jvm.internal.t.f(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!b())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f25817d;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(sink, Math.min(j11, j10));
            if (j12 == -1) {
                this.f25818e.getConnection().y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            long j13 = this.f25817d - j12;
            this.f25817d = j13;
            if (j13 == 0) {
                c();
            }
            return j12;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private final class f implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f25819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f25821c;

        public f(b this$0) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f25821c = this$0;
            this.f25819a = new l(this$0.f25803d.timeout());
        }

        @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f25820b) {
                return;
            }
            this.f25820b = true;
            this.f25821c.n(this.f25819a);
            this.f25821c.f25804e = 3;
        }

        @Override // af.a0, java.io.Flushable
        public void flush() throws IOException {
            if (this.f25820b) {
                return;
            }
            this.f25821c.f25803d.flush();
        }

        @Override // af.a0
        public d0 timeout() {
            return this.f25819a;
        }

        @Override // af.a0
        public void y(af.e source, long j10) throws IOException {
            kotlin.jvm.internal.t.f(source, "source");
            if (!(!this.f25820b)) {
                throw new IllegalStateException("closed".toString());
            }
            ne.d.l(source.size(), 0L, j10);
            this.f25821c.f25803d.y(source, j10);
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    private final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f25823e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b this$0) {
            super(this$0);
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f25823e = this$0;
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (!this.f25822d) {
                c();
            }
            e(true);
        }

        @Override // te.b.a, af.c0
        public long read(af.e sink, long j10) throws IOException {
            kotlin.jvm.internal.t.f(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!b())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f25822d) {
                return -1L;
            }
            long j11 = super.read(sink, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f25822d = true;
            c();
            return -1L;
        }
    }

    public b(x xVar, re.f connection, af.g source, af.f sink) {
        kotlin.jvm.internal.t.f(connection, "connection");
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(sink, "sink");
        this.f25800a = xVar;
        this.f25801b = connection;
        this.f25802c = source;
        this.f25803d = sink;
        this.f25805f = new te.a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(l lVar) {
        d0 d0VarI = lVar.i();
        lVar.j(d0.f348e);
        d0VarI.a();
        d0VarI.b();
    }

    private final boolean o(z zVar) {
        return rd.c0.B("chunked", zVar.d("Transfer-Encoding"), true);
    }

    private final boolean p(b0 b0Var) {
        return rd.c0.B("chunked", b0.p(b0Var, "Transfer-Encoding", null, 2, null), true);
    }

    private final a0 q() {
        int i10 = this.f25804e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        this.f25804e = 2;
        return new C0433b(this);
    }

    private final c0 r(u uVar) {
        int i10 = this.f25804e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        this.f25804e = 5;
        return new c(this, uVar);
    }

    private final c0 s(long j10) {
        int i10 = this.f25804e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        this.f25804e = 5;
        return new e(this, j10);
    }

    private final a0 t() {
        int i10 = this.f25804e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        this.f25804e = 2;
        return new f(this);
    }

    private final c0 u() {
        int i10 = this.f25804e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        this.f25804e = 5;
        getConnection().y();
        return new g(this);
    }

    @Override // se.d
    public void a(z request) {
        kotlin.jvm.internal.t.f(request, "request");
        i iVar = i.f25444a;
        Proxy.Type type = getConnection().z().b().type();
        kotlin.jvm.internal.t.e(type, "connection.route().proxy.type()");
        w(request.f(), iVar.a(request, type));
    }

    @Override // se.d
    public long b(b0 response) {
        kotlin.jvm.internal.t.f(response, "response");
        if (!se.e.b(response)) {
            return 0L;
        }
        if (p(response)) {
            return -1L;
        }
        return ne.d.v(response);
    }

    @Override // se.d
    public c0 c(b0 response) {
        kotlin.jvm.internal.t.f(response, "response");
        if (!se.e.b(response)) {
            return s(0L);
        }
        if (p(response)) {
            return r(response.G().j());
        }
        long jV = ne.d.v(response);
        return jV != -1 ? s(jV) : u();
    }

    @Override // se.d
    public void cancel() {
        getConnection().d();
    }

    @Override // se.d
    public a0 d(z request, long j10) throws ProtocolException {
        kotlin.jvm.internal.t.f(request, "request");
        if (request.a() != null && request.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (o(request)) {
            return q();
        }
        if (j10 != -1) {
            return t();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // se.d
    public void finishRequest() {
        this.f25803d.flush();
    }

    @Override // se.d
    public void flushRequest() throws IOException {
        this.f25803d.flush();
    }

    @Override // se.d
    public re.f getConnection() {
        return this.f25801b;
    }

    @Override // se.d
    public b0.a readResponseHeaders(boolean z10) {
        int i10 = this.f25804e;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        try {
            se.k kVarA = se.k.f25447d.a(this.f25805f.b());
            b0.a aVarL = new b0.a().q(kVarA.f25448a).g(kVarA.f25449b).n(kVarA.f25450c).l(this.f25805f.a());
            if (z10 && kVarA.f25449b == 100) {
                return null;
            }
            if (kVarA.f25449b == 100) {
                this.f25804e = 3;
                return aVarL;
            }
            this.f25804e = 4;
            return aVarL;
        } catch (EOFException e10) {
            throw new IOException(kotlin.jvm.internal.t.n("unexpected end of stream on ", getConnection().z().a().l().n()), e10);
        }
    }

    public final void v(b0 response) {
        kotlin.jvm.internal.t.f(response, "response");
        long jV = ne.d.v(response);
        if (jV == -1) {
            return;
        }
        c0 c0VarS = s(jV);
        ne.d.M(c0VarS, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        c0VarS.close();
    }

    public final void w(t headers, String requestLine) {
        kotlin.jvm.internal.t.f(headers, "headers");
        kotlin.jvm.internal.t.f(requestLine, "requestLine");
        int i10 = this.f25804e;
        if (!(i10 == 0)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n("state: ", Integer.valueOf(i10)).toString());
        }
        this.f25803d.writeUtf8(requestLine).writeUtf8("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f25803d.writeUtf8(headers.c(i11)).writeUtf8(": ").writeUtf8(headers.e(i11)).writeUtf8("\r\n");
        }
        this.f25803d.writeUtf8("\r\n");
        this.f25804e = 1;
    }
}
