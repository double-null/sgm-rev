package re;

import af.a0;
import af.c0;
import af.j;
import af.k;
import af.q;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import me.b0;
import me.r;
import me.z;

/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f25081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f25082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f25083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final se.d f25084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f25086f;

    /* JADX INFO: compiled from: Exchange.kt */
    private final class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f25087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f25089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f25091f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c this$0, a0 delegate, long j10) {
            super(delegate);
            t.f(this$0, "this$0");
            t.f(delegate, "delegate");
            this.f25091f = this$0;
            this.f25087b = j10;
        }

        private final <E extends IOException> E b(E e10) {
            if (this.f25088c) {
                return e10;
            }
            this.f25088c = true;
            return (E) this.f25091f.a(this.f25089d, false, true, e10);
        }

        @Override // af.j, af.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25090e) {
                return;
            }
            this.f25090e = true;
            long j10 = this.f25087b;
            if (j10 != -1 && this.f25089d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // af.j, af.a0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // af.j, af.a0
        public void y(af.e source, long j10) throws IOException {
            t.f(source, "source");
            if (!(!this.f25090e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f25087b;
            if (j11 == -1 || this.f25089d + j10 <= j11) {
                try {
                    super.y(source, j10);
                    this.f25089d += j10;
                    return;
                } catch (IOException e10) {
                    throw b(e10);
                }
            }
            throw new ProtocolException("expected " + this.f25087b + " bytes but received " + (this.f25089d + j10));
        }
    }

    /* JADX INFO: compiled from: Exchange.kt */
    public final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f25092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f25093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f25097f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c this$0, c0 delegate, long j10) {
            super(delegate);
            t.f(this$0, "this$0");
            t.f(delegate, "delegate");
            this.f25097f = this$0;
            this.f25092a = j10;
            this.f25094c = true;
            if (j10 == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e10) {
            if (this.f25095d) {
                return e10;
            }
            this.f25095d = true;
            if (e10 == null && this.f25094c) {
                this.f25094c = false;
                this.f25097f.i().w(this.f25097f.g());
            }
            return (E) this.f25097f.a(this.f25093b, true, false, e10);
        }

        @Override // af.k, af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f25096e) {
                return;
            }
            this.f25096e = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // af.k, af.c0
        public long read(af.e sink, long j10) throws IOException {
            t.f(sink, "sink");
            if (!(!this.f25096e)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j11 = delegate().read(sink, j10);
                if (this.f25094c) {
                    this.f25094c = false;
                    this.f25097f.i().w(this.f25097f.g());
                }
                if (j11 == -1) {
                    b(null);
                    return -1L;
                }
                long j12 = this.f25093b + j11;
                long j13 = this.f25092a;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f25092a + " bytes but received " + j12);
                }
                this.f25093b = j12;
                if (j12 == j13) {
                    b(null);
                }
                return j11;
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(e call, r eventListener, d finder, se.d codec) {
        t.f(call, "call");
        t.f(eventListener, "eventListener");
        t.f(finder, "finder");
        t.f(codec, "codec");
        this.f25081a = call;
        this.f25082b = eventListener;
        this.f25083c = finder;
        this.f25084d = codec;
        this.f25086f = codec.getConnection();
    }

    private final void s(IOException iOException) {
        this.f25083c.h(iOException);
        this.f25084d.getConnection().G(this.f25081a, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            s(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f25082b.s(this.f25081a, e10);
            } else {
                this.f25082b.q(this.f25081a, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f25082b.x(this.f25081a, e10);
            } else {
                this.f25082b.v(this.f25081a, j10);
            }
        }
        return (E) this.f25081a.u(this, z11, z10, e10);
    }

    public final void b() {
        this.f25084d.cancel();
    }

    public final a0 c(z request, boolean z10) throws IOException {
        t.f(request, "request");
        this.f25085e = z10;
        me.a0 a0VarA = request.a();
        t.c(a0VarA);
        long jContentLength = a0VarA.contentLength();
        this.f25082b.r(this.f25081a);
        return new a(this, this.f25084d.d(request, jContentLength), jContentLength);
    }

    public final void d() {
        this.f25084d.cancel();
        this.f25081a.u(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f25084d.finishRequest();
        } catch (IOException e10) {
            this.f25082b.s(this.f25081a, e10);
            s(e10);
            throw e10;
        }
    }

    public final void f() throws IOException {
        try {
            this.f25084d.flushRequest();
        } catch (IOException e10) {
            this.f25082b.s(this.f25081a, e10);
            s(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f25081a;
    }

    public final f h() {
        return this.f25086f;
    }

    public final r i() {
        return this.f25082b;
    }

    public final d j() {
        return this.f25083c;
    }

    public final boolean k() {
        return !t.a(this.f25083c.d().l().h(), this.f25086f.z().a().l().h());
    }

    public final boolean l() {
        return this.f25085e;
    }

    public final void m() {
        this.f25084d.getConnection().y();
    }

    public final void n() {
        this.f25081a.u(this, true, false, null);
    }

    public final me.c0 o(b0 response) throws IOException {
        t.f(response, "response");
        try {
            String strP = b0.p(response, "Content-Type", null, 2, null);
            long jB = this.f25084d.b(response);
            return new se.h(strP, jB, q.d(new b(this, this.f25084d.c(response), jB)));
        } catch (IOException e10) {
            this.f25082b.x(this.f25081a, e10);
            s(e10);
            throw e10;
        }
    }

    public final b0.a p(boolean z10) throws IOException {
        try {
            b0.a responseHeaders = this.f25084d.readResponseHeaders(z10);
            if (responseHeaders != null) {
                responseHeaders.m(this);
            }
            return responseHeaders;
        } catch (IOException e10) {
            this.f25082b.x(this.f25081a, e10);
            s(e10);
            throw e10;
        }
    }

    public final void q(b0 response) {
        t.f(response, "response");
        this.f25082b.y(this.f25081a, response);
    }

    public final void r() {
        this.f25082b.z(this.f25081a);
    }

    public final void t(z request) throws IOException {
        t.f(request, "request");
        try {
            this.f25082b.u(this.f25081a);
            this.f25084d.a(request);
            this.f25082b.t(this.f25081a, request);
        } catch (IOException e10) {
            this.f25082b.s(this.f25081a, e10);
            s(e10);
            throw e10;
        }
    }
}
