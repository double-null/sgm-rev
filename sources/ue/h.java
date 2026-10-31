package ue;

import af.a0;
import af.c0;
import af.d0;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import me.t;
import okhttp3.internal.http2.StreamResetException;
import wc.g0;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f27012o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f27014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<t> f27019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f27021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f27022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f27023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f27024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ue.a f27025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f27026n;

    /* JADX INFO: compiled from: Http2Stream.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class b implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final af.e f27028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t f27029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f27030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f27031e;

        public b(h this$0, boolean z10) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f27031e = this$0;
            this.f27027a = z10;
            this.f27028b = new af.e();
        }

        private final void b(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            h hVar = this.f27031e;
            synchronized (hVar) {
                hVar.s().v();
                while (hVar.r() >= hVar.q() && !e() && !c() && hVar.h() == null) {
                    try {
                        hVar.F();
                    } catch (Throwable th) {
                        hVar.s().C();
                        throw th;
                    }
                }
                hVar.s().C();
                hVar.c();
                jMin = Math.min(hVar.q() - hVar.r(), this.f27028b.size());
                hVar.D(hVar.r() + jMin);
                z11 = z10 && jMin == this.f27028b.size();
                g0 g0Var = g0.f27756a;
            }
            this.f27031e.s().v();
            try {
                this.f27031e.g().F0(this.f27031e.j(), z11, this.f27028b, jMin);
            } finally {
                this.f27031e.s().C();
            }
        }

        public final boolean c() {
            return this.f27030d;
        }

        @Override // af.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            h hVar = this.f27031e;
            if (ne.d.f22998h && Thread.holdsLock(hVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + hVar);
            }
            h hVar2 = this.f27031e;
            synchronized (hVar2) {
                if (c()) {
                    return;
                }
                boolean z10 = hVar2.h() == null;
                g0 g0Var = g0.f27756a;
                if (!this.f27031e.o().f27027a) {
                    boolean z11 = this.f27028b.size() > 0;
                    if (this.f27029c != null) {
                        while (this.f27028b.size() > 0) {
                            b(false);
                        }
                        e eVarG = this.f27031e.g();
                        int iJ = this.f27031e.j();
                        t tVar = this.f27029c;
                        kotlin.jvm.internal.t.c(tVar);
                        eVarG.G0(iJ, z10, ne.d.P(tVar));
                    } else if (z11) {
                        while (this.f27028b.size() > 0) {
                            b(true);
                        }
                    } else if (z10) {
                        this.f27031e.g().F0(this.f27031e.j(), true, null, 0L);
                    }
                }
                synchronized (this.f27031e) {
                    f(true);
                    g0 g0Var2 = g0.f27756a;
                }
                this.f27031e.g().flush();
                this.f27031e.b();
            }
        }

        public final boolean e() {
            return this.f27027a;
        }

        public final void f(boolean z10) {
            this.f27030d = z10;
        }

        @Override // af.a0, java.io.Flushable
        public void flush() throws IOException {
            h hVar = this.f27031e;
            if (ne.d.f22998h && Thread.holdsLock(hVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + hVar);
            }
            h hVar2 = this.f27031e;
            synchronized (hVar2) {
                hVar2.c();
                g0 g0Var = g0.f27756a;
            }
            while (this.f27028b.size() > 0) {
                b(false);
                this.f27031e.g().flush();
            }
        }

        @Override // af.a0
        public d0 timeout() {
            return this.f27031e.s();
        }

        @Override // af.a0
        public void y(af.e source, long j10) throws IOException {
            kotlin.jvm.internal.t.f(source, "source");
            h hVar = this.f27031e;
            if (!ne.d.f22998h || !Thread.holdsLock(hVar)) {
                this.f27028b.y(source, j10);
                while (this.f27028b.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    b(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + hVar);
            }
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class c implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f27032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final af.e f27034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final af.e f27035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t f27036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f27037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f27038g;

        public c(h this$0, long j10, boolean z10) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f27038g = this$0;
            this.f27032a = j10;
            this.f27033b = z10;
            this.f27034c = new af.e();
            this.f27035d = new af.e();
        }

        private final void p(long j10) {
            h hVar = this.f27038g;
            if (!ne.d.f22998h || !Thread.holdsLock(hVar)) {
                this.f27038g.g().E0(j10);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + hVar);
        }

        public final boolean b() {
            return this.f27037f;
        }

        public final boolean c() {
            return this.f27033b;
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            h hVar = this.f27038g;
            synchronized (hVar) {
                k(true);
                size = e().size();
                e().b();
                hVar.notifyAll();
                g0 g0Var = g0.f27756a;
            }
            if (size > 0) {
                p(size);
            }
            this.f27038g.b();
        }

        public final af.e e() {
            return this.f27035d;
        }

        public final af.e f() {
            return this.f27034c;
        }

        public final void h(af.g source, long j10) throws IOException {
            boolean zC;
            boolean z10;
            boolean z11;
            long size;
            kotlin.jvm.internal.t.f(source, "source");
            h hVar = this.f27038g;
            if (ne.d.f22998h && Thread.holdsLock(hVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + hVar);
            }
            while (j10 > 0) {
                synchronized (this.f27038g) {
                    zC = c();
                    z10 = true;
                    z11 = e().size() + j10 > this.f27032a;
                    g0 g0Var = g0.f27756a;
                }
                if (z11) {
                    source.skip(j10);
                    this.f27038g.f(ue.a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (zC) {
                    source.skip(j10);
                    return;
                }
                long j11 = source.read(this.f27034c, j10);
                if (j11 == -1) {
                    throw new EOFException();
                }
                j10 -= j11;
                h hVar2 = this.f27038g;
                synchronized (hVar2) {
                    if (b()) {
                        size = f().size();
                        f().b();
                    } else {
                        if (e().size() != 0) {
                            z10 = false;
                        }
                        e().V(f());
                        if (z10) {
                            hVar2.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    p(size);
                }
            }
        }

        public final void k(boolean z10) {
            this.f27037f = z10;
        }

        public final void n(boolean z10) {
            this.f27033b = z10;
        }

        public final void o(t tVar) {
            this.f27036e = tVar;
        }

        @Override // af.c0
        public long read(af.e sink, long j10) throws IOException {
            IOException iOExceptionI;
            long j11;
            boolean z10;
            kotlin.jvm.internal.t.f(sink, "sink");
            long j12 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.t.n("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            while (true) {
                h hVar = this.f27038g;
                synchronized (hVar) {
                    hVar.m().v();
                    try {
                        if (hVar.h() != null) {
                            iOExceptionI = hVar.i();
                            if (iOExceptionI == null) {
                                ue.a aVarH = hVar.h();
                                kotlin.jvm.internal.t.c(aVarH);
                                iOExceptionI = new StreamResetException(aVarH);
                            }
                        } else {
                            iOExceptionI = null;
                        }
                        if (b()) {
                            throw new IOException("stream closed");
                        }
                        if (e().size() > j12) {
                            j11 = e().read(sink, Math.min(j10, e().size()));
                            hVar.C(hVar.l() + j11);
                            long jL = hVar.l() - hVar.k();
                            if (iOExceptionI == null && jL >= hVar.g().Y().c() / 2) {
                                hVar.g().K0(hVar.j(), jL);
                                hVar.B(hVar.l());
                            }
                        } else {
                            if (c() || iOExceptionI != null) {
                                j11 = -1;
                            } else {
                                hVar.F();
                                j11 = -1;
                                z10 = true;
                            }
                            hVar.m().C();
                            g0 g0Var = g0.f27756a;
                        }
                        z10 = false;
                        hVar.m().C();
                        g0 g0Var2 = g0.f27756a;
                    } catch (Throwable th) {
                        hVar.m().C();
                        throw th;
                    }
                    throw th;
                }
                if (!z10) {
                    if (j11 != -1) {
                        p(j11);
                        return j11;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j12 = 0;
            }
        }

        @Override // af.c0
        public d0 timeout() {
            return this.f27038g.m();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class d extends af.c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f27039o;

        public d(h this$0) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            this.f27039o = this$0;
        }

        @Override // af.c
        protected void B() {
            this.f27039o.f(ue.a.CANCEL);
            this.f27039o.g().x0();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // af.c
        protected IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public h(int i10, e connection, boolean z10, boolean z11, t tVar) {
        kotlin.jvm.internal.t.f(connection, "connection");
        this.f27013a = i10;
        this.f27014b = connection;
        this.f27018f = connection.a0().c();
        ArrayDeque<t> arrayDeque = new ArrayDeque<>();
        this.f27019g = arrayDeque;
        this.f27021i = new c(this, connection.Y().c(), z11);
        this.f27022j = new b(this, z10);
        this.f27023k = new d(this);
        this.f27024l = new d(this);
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!t())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(tVar);
        }
    }

    private final boolean e(ue.a aVar, IOException iOException) {
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            if (p().c() && o().e()) {
                return false;
            }
            z(aVar);
            A(iOException);
            notifyAll();
            g0 g0Var = g0.f27756a;
            this.f27014b.w0(this.f27013a);
            return true;
        }
    }

    public final void A(IOException iOException) {
        this.f27026n = iOException;
    }

    public final void B(long j10) {
        this.f27016d = j10;
    }

    public final void C(long j10) {
        this.f27015c = j10;
    }

    public final void D(long j10) {
        this.f27017e = j10;
    }

    public final synchronized t E() throws IOException {
        t tVarRemoveFirst;
        this.f27023k.v();
        while (this.f27019g.isEmpty() && this.f27025m == null) {
            try {
                F();
            } catch (Throwable th) {
                this.f27023k.C();
                throw th;
            }
        }
        this.f27023k.C();
        if (!(!this.f27019g.isEmpty())) {
            IOException iOException = this.f27026n;
            if (iOException != null) {
                throw iOException;
            }
            ue.a aVar = this.f27025m;
            kotlin.jvm.internal.t.c(aVar);
            throw new StreamResetException(aVar);
        }
        tVarRemoveFirst = this.f27019g.removeFirst();
        kotlin.jvm.internal.t.e(tVarRemoveFirst, "headersQueue.removeFirst()");
        return tVarRemoveFirst;
    }

    public final void F() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final d0 G() {
        return this.f27024l;
    }

    public final void a(long j10) {
        this.f27018f += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z10;
        boolean zU;
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z10 = !p().c() && p().b() && (o().e() || o().c());
            zU = u();
            g0 g0Var = g0.f27756a;
        }
        if (z10) {
            d(ue.a.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f27014b.w0(this.f27013a);
        }
    }

    public final void c() throws IOException {
        if (this.f27022j.c()) {
            throw new IOException("stream closed");
        }
        if (this.f27022j.e()) {
            throw new IOException("stream finished");
        }
        if (this.f27025m != null) {
            IOException iOException = this.f27026n;
            if (iOException != null) {
                throw iOException;
            }
            ue.a aVar = this.f27025m;
            kotlin.jvm.internal.t.c(aVar);
            throw new StreamResetException(aVar);
        }
    }

    public final void f(ue.a errorCode) {
        kotlin.jvm.internal.t.f(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f27014b.J0(this.f27013a, errorCode);
        }
    }

    public final e g() {
        return this.f27014b;
    }

    public final synchronized ue.a h() {
        return this.f27025m;
    }

    public final IOException i() {
        return this.f27026n;
    }

    public final int j() {
        return this.f27013a;
    }

    public final long k() {
        return this.f27016d;
    }

    public final long l() {
        return this.f27015c;
    }

    public final d m() {
        return this.f27023k;
    }

    public final a0 n() {
        synchronized (this) {
            if (!(this.f27020h || t())) {
                throw new IllegalStateException(GEmOVMyH.obsNd.toString());
            }
            g0 g0Var = g0.f27756a;
        }
        return this.f27022j;
    }

    public final b o() {
        return this.f27022j;
    }

    public final c p() {
        return this.f27021i;
    }

    public final long q() {
        return this.f27018f;
    }

    public final long r() {
        return this.f27017e;
    }

    public final d s() {
        return this.f27024l;
    }

    public final boolean t() {
        return this.f27014b.J() == ((this.f27013a & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f27025m != null) {
            return false;
        }
        return ((this.f27021i.c() || this.f27021i.b()) && (this.f27022j.e() || this.f27022j.c()) && this.f27020h) ? false : true;
    }

    public final d0 v() {
        return this.f27023k;
    }

    public final void w(af.g source, int i10) throws IOException {
        kotlin.jvm.internal.t.f(source, "source");
        if (!ne.d.f22998h || !Thread.holdsLock(this)) {
            this.f27021i.h(source, i10);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final void x(t headers, boolean z10) {
        boolean zU;
        kotlin.jvm.internal.t.f(headers, "headers");
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f27020h && z10) {
                p().o(headers);
            } else {
                this.f27020h = true;
                this.f27019g.add(headers);
            }
            if (z10) {
                p().n(true);
            }
            zU = u();
            notifyAll();
            g0 g0Var = g0.f27756a;
        }
        if (zU) {
            return;
        }
        this.f27014b.w0(this.f27013a);
    }

    public final synchronized void y(ue.a errorCode) {
        kotlin.jvm.internal.t.f(errorCode, "errorCode");
        if (this.f27025m == null) {
            this.f27025m = errorCode;
            notifyAll();
        }
    }

    public final void z(ue.a aVar) {
        this.f27025m = aVar;
    }

    public final void d(ue.a aVar, IOException iOException) throws IOException {
        kotlin.jvm.internal.t.f(aVar, oqHAiWkeGzWld.nTvBLwcMlkyj);
        if (e(aVar, iOException)) {
            this.f27014b.I0(this.f27013a, aVar);
        }
    }
}
