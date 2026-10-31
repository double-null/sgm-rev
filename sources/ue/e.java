package ue;

import c0.IbU.elEbP;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.facebook.share.internal.ShareConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import okhttp3.internal.http2.ConnectionShutdownException;
import wc.g0;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements Closeable {
    public static final b C = new b(null);
    private static final ue.l D;
    private final d A;
    private final Set<Integer> B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f26896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, ue.h> f26897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qe.e f26902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final qe.d f26903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qe.d f26904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final qe.d f26905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ue.k f26906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f26907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f26908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f26909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f26910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f26912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ue.l f26913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ue.l f26914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f26915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f26916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f26917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f26918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Socket f26919y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ue.i f26920z;

    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qe.e f26922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f26923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public af.g f26925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public af.f f26926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f26927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ue.k f26928h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f26929i;

        public a(boolean z10, qe.e taskRunner) {
            t.f(taskRunner, "taskRunner");
            this.f26921a = z10;
            this.f26922b = taskRunner;
            this.f26927g = c.f26931b;
            this.f26928h = ue.k.f27056b;
        }

        public final e a() {
            return new e(this);
        }

        public final boolean b() {
            return this.f26921a;
        }

        public final String c() {
            String str = this.f26924d;
            if (str != null) {
                return str;
            }
            t.u("connectionName");
            return null;
        }

        public final c d() {
            return this.f26927g;
        }

        public final int e() {
            return this.f26929i;
        }

        public final ue.k f() {
            return this.f26928h;
        }

        public final af.f g() {
            af.f fVar = this.f26926f;
            if (fVar != null) {
                return fVar;
            }
            t.u("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f26923c;
            if (socket != null) {
                return socket;
            }
            t.u("socket");
            return null;
        }

        public final af.g i() {
            af.g gVar = this.f26925e;
            if (gVar != null) {
                return gVar;
            }
            t.u(ShareConstants.FEED_SOURCE_PARAM);
            return null;
        }

        public final qe.e j() {
            return this.f26922b;
        }

        public final a k(c listener) {
            t.f(listener, "listener");
            n(listener);
            return this;
        }

        public final a l(int i10) {
            o(i10);
            return this;
        }

        public final void m(String str) {
            t.f(str, "<set-?>");
            this.f26924d = str;
        }

        public final void n(c cVar) {
            t.f(cVar, "<set-?>");
            this.f26927g = cVar;
        }

        public final void o(int i10) {
            this.f26929i = i10;
        }

        public final void p(af.f fVar) {
            t.f(fVar, "<set-?>");
            this.f26926f = fVar;
        }

        public final void q(Socket socket) {
            t.f(socket, "<set-?>");
            this.f26923c = socket;
        }

        public final void r(af.g gVar) {
            t.f(gVar, "<set-?>");
            this.f26925e = gVar;
        }

        public final a s(Socket socket, String peerName, af.g source, af.f sink) throws IOException {
            String strN;
            t.f(socket, "socket");
            t.f(peerName, "peerName");
            t.f(source, "source");
            t.f(sink, "sink");
            q(socket);
            if (b()) {
                strN = ne.d.f22999i + ' ' + peerName;
            } else {
                strN = t.n("MockWebServer ", peerName);
            }
            m(strN);
            r(source);
            p(sink);
            return this;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final ue.l a() {
            return e.D;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26930a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f26931b = new a();

        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class a extends c {
            a() {
            }

            @Override // ue.e.c
            public void b(ue.h stream) throws IOException {
                t.f(stream, "stream");
                stream.d(ue.a.REFUSED_STREAM, null);
            }
        }

        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public void a(e connection, ue.l settings) {
            t.f(connection, "connection");
            t.f(settings, "settings");
        }

        public abstract void b(ue.h hVar) throws IOException;
    }

    /* JADX INFO: renamed from: ue.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class C0445e extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26955h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ af.e f26956i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f26957j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f26958k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0445e(String str, boolean z10, e eVar, int i10, af.e eVar2, int i11, boolean z11) {
            super(str, z10);
            this.f26952e = str;
            this.f26953f = z10;
            this.f26954g = eVar;
            this.f26955h = i10;
            this.f26956i = eVar2;
            this.f26957j = i11;
            this.f26958k = z11;
        }

        @Override // qe.a
        public long f() {
            try {
                boolean zA = this.f26954g.f26906l.a(this.f26955h, this.f26956i, this.f26957j, this.f26958k);
                if (zA) {
                    this.f26954g.n0().t(this.f26955h, ue.a.CANCEL);
                }
                if (!zA && !this.f26958k) {
                    return -1L;
                }
                synchronized (this.f26954g) {
                    this.f26954g.B.remove(Integer.valueOf(this.f26955h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class f extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f26963i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f26964j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, e eVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f26959e = str;
            this.f26960f = z10;
            this.f26961g = eVar;
            this.f26962h = i10;
            this.f26963i = list;
            this.f26964j = z11;
        }

        @Override // qe.a
        public long f() {
            boolean zOnHeaders = this.f26961g.f26906l.onHeaders(this.f26962h, this.f26963i, this.f26964j);
            if (zOnHeaders) {
                try {
                    this.f26961g.n0().t(this.f26962h, ue.a.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zOnHeaders && !this.f26964j) {
                return -1L;
            }
            synchronized (this.f26961g) {
                this.f26961g.B.remove(Integer.valueOf(this.f26962h));
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class g extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26967g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26968h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f26969i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, e eVar, int i10, List list) {
            super(str, z10);
            this.f26965e = str;
            this.f26966f = z10;
            this.f26967g = eVar;
            this.f26968h = i10;
            this.f26969i = list;
        }

        @Override // qe.a
        public long f() {
            if (!this.f26967g.f26906l.onRequest(this.f26968h, this.f26969i)) {
                return -1L;
            }
            try {
                this.f26967g.n0().t(this.f26968h, ue.a.CANCEL);
                synchronized (this.f26967g) {
                    this.f26967g.B.remove(Integer.valueOf(this.f26968h));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class h extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ue.a f26974i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, e eVar, int i10, ue.a aVar) {
            super(str, z10);
            this.f26970e = str;
            this.f26971f = z10;
            this.f26972g = eVar;
            this.f26973h = i10;
            this.f26974i = aVar;
        }

        @Override // qe.a
        public long f() {
            this.f26972g.f26906l.b(this.f26973h, this.f26974i);
            synchronized (this.f26972g) {
                this.f26972g.B.remove(Integer.valueOf(this.f26973h));
                g0 g0Var = g0.f27756a;
            }
            return -1L;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class i extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26977g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, e eVar) {
            super(str, z10);
            this.f26975e = str;
            this.f26976f = z10;
            this.f26977g = eVar;
        }

        @Override // qe.a
        public long f() {
            this.f26977g.H0(false, 2, 0);
            return -1L;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class j extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f26979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f26980g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, e eVar, long j10) {
            super(str, false, 2, null);
            this.f26978e = str;
            this.f26979f = eVar;
            this.f26980g = j10;
        }

        @Override // qe.a
        public long f() {
            boolean z10;
            synchronized (this.f26979f) {
                if (this.f26979f.f26908n < this.f26979f.f26907m) {
                    z10 = true;
                } else {
                    this.f26979f.f26907m++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f26979f.I(null);
                return -1L;
            }
            this.f26979f.H0(false, 1, 0);
            return this.f26980g;
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class k extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26982f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26983g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26984h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ue.a f26985i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, e eVar, int i10, ue.a aVar) {
            super(str, z10);
            this.f26981e = str;
            this.f26982f = z10;
            this.f26983g = eVar;
            this.f26984h = i10;
            this.f26985i = aVar;
        }

        @Override // qe.a
        public long f() {
            try {
                this.f26983g.I0(this.f26984h, this.f26985i);
                return -1L;
            } catch (IOException e10) {
                this.f26983g.I(e10);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class l extends qe.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f26986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26987f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f26988g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26989h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f26990i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, e eVar, int i10, long j10) {
            super(str, z10);
            this.f26986e = str;
            this.f26987f = z10;
            this.f26988g = eVar;
            this.f26989h = i10;
            this.f26990i = j10;
        }

        @Override // qe.a
        public long f() {
            try {
                this.f26988g.n0().v(this.f26989h, this.f26990i);
                return -1L;
            } catch (IOException e10) {
                this.f26988g.I(e10);
                return -1L;
            }
        }
    }

    static {
        ue.l lVar = new ue.l();
        lVar.h(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        lVar.h(5, Http2.INITIAL_MAX_FRAME_SIZE);
        D = lVar;
    }

    public e(a builder) {
        t.f(builder, "builder");
        boolean zB = builder.b();
        this.f26895a = zB;
        this.f26896b = builder.d();
        this.f26897c = new LinkedHashMap();
        String strC = builder.c();
        this.f26898d = strC;
        this.f26900f = builder.b() ? 3 : 2;
        qe.e eVarJ = builder.j();
        this.f26902h = eVarJ;
        qe.d dVarI = eVarJ.i();
        this.f26903i = dVarI;
        this.f26904j = eVarJ.i();
        this.f26905k = eVarJ.i();
        this.f26906l = builder.f();
        ue.l lVar = new ue.l();
        if (builder.b()) {
            lVar.h(7, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.f26913s = lVar;
        ue.l lVar2 = D;
        this.f26914t = lVar2;
        this.f26918x = lVar2.c();
        this.f26919y = builder.h();
        this.f26920z = new ue.i(builder.g(), zB);
        this.A = new d(this, new ue.g(builder.i(), zB));
        this.B = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            dVarI.i(new j(t.n(strC, " ping"), this, nanos), nanos);
        }
    }

    public static /* synthetic */ void D0(e eVar, boolean z10, qe.e eVar2, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar2 = qe.e.f24785i;
        }
        eVar.C0(z10, eVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(IOException iOException) {
        ue.a aVar = ue.a.PROTOCOL_ERROR;
        H(aVar, aVar, iOException);
    }

    private final ue.h p0(int i10, List<ue.b> list, boolean z10) throws IOException {
        int iU;
        ue.h hVar;
        boolean z11;
        boolean z12 = !z10;
        synchronized (this.f26920z) {
            synchronized (this) {
                if (U() > 1073741823) {
                    B0(ue.a.REFUSED_STREAM);
                }
                if (this.f26901g) {
                    throw new ConnectionShutdownException();
                }
                iU = U();
                z0(U() + 2);
                hVar = new ue.h(iU, this, z12, false, null);
                z11 = !z10 || m0() >= k0() || hVar.r() >= hVar.q();
                if (hVar.u()) {
                    j0().put(Integer.valueOf(iU), hVar);
                }
                g0 g0Var = g0.f27756a;
            }
            if (i10 == 0) {
                n0().n(z12, iU, list);
            } else {
                if (!(true ^ J())) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                n0().s(i10, iU, list);
            }
        }
        if (z11) {
            this.f26920z.flush();
        }
        return hVar;
    }

    public final void A0(ue.l lVar) {
        t.f(lVar, "<set-?>");
        this.f26914t = lVar;
    }

    public final void B0(ue.a statusCode) throws IOException {
        t.f(statusCode, "statusCode");
        synchronized (this.f26920z) {
            f0 f0Var = new f0();
            synchronized (this) {
                if (this.f26901g) {
                    return;
                }
                this.f26901g = true;
                f0Var.f21511a = L();
                g0 g0Var = g0.f27756a;
                n0().k(f0Var.f21511a, statusCode, ne.d.f22991a);
            }
        }
    }

    public final void C0(boolean z10, qe.e taskRunner) throws IOException {
        t.f(taskRunner, "taskRunner");
        if (z10) {
            this.f26920z.c();
            this.f26920z.u(this.f26913s);
            int iC = this.f26913s.c();
            if (iC != 65535) {
                this.f26920z.v(0, iC - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.i().i(new qe.c(this.f26898d, true, this.A), 0L);
    }

    public final synchronized void E0(long j10) {
        long j11 = this.f26915u + j10;
        this.f26915u = j11;
        long j12 = j11 - this.f26916v;
        if (j12 >= this.f26913s.c() / 2) {
            K0(0, j12);
            this.f26916v += j12;
        }
    }

    public final void F0(int i10, boolean z10, af.e eVar, long j10) throws IOException {
        int iMin;
        long j11;
        if (j10 == 0) {
            this.f26920z.e(z10, i10, eVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (m0() >= k0()) {
                    try {
                        if (!j0().containsKey(Integer.valueOf(i10))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j10, k0() - m0()), n0().o());
                j11 = iMin;
                this.f26917w = m0() + j11;
                g0 g0Var = g0.f27756a;
            }
            j10 -= j11;
            this.f26920z.e(z10 && j10 == 0, i10, eVar, iMin);
        }
    }

    public final void G0(int i10, boolean z10, List<ue.b> alternating) throws IOException {
        t.f(alternating, "alternating");
        this.f26920z.n(z10, i10, alternating);
    }

    public final void H(ue.a connectionCode, ue.a streamCode, IOException iOException) {
        int i10;
        Object[] array;
        t.f(connectionCode, "connectionCode");
        t.f(streamCode, "streamCode");
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            B0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!j0().isEmpty()) {
                array = j0().values().toArray(new ue.h[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                j0().clear();
            } else {
                array = null;
            }
            g0 g0Var = g0.f27756a;
        }
        ue.h[] hVarArr = (ue.h[]) array;
        if (hVarArr != null) {
            for (ue.h hVar : hVarArr) {
                try {
                    hVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            n0().close();
        } catch (IOException unused3) {
        }
        try {
            e0().close();
        } catch (IOException unused4) {
        }
        this.f26903i.o();
        this.f26904j.o();
        this.f26905k.o();
    }

    public final void H0(boolean z10, int i10, int i11) {
        try {
            this.f26920z.p(z10, i10, i11);
        } catch (IOException e10) {
            I(e10);
        }
    }

    public final void I0(int i10, ue.a statusCode) throws IOException {
        t.f(statusCode, "statusCode");
        this.f26920z.t(i10, statusCode);
    }

    public final boolean J() {
        return this.f26895a;
    }

    public final void J0(int i10, ue.a errorCode) {
        t.f(errorCode, "errorCode");
        this.f26903i.i(new k(this.f26898d + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    public final String K() {
        return this.f26898d;
    }

    public final void K0(int i10, long j10) {
        this.f26903i.i(new l(this.f26898d + '[' + i10 + "] windowUpdate", true, this, i10, j10), 0L);
    }

    public final int L() {
        return this.f26899e;
    }

    public final c N() {
        return this.f26896b;
    }

    public final int U() {
        return this.f26900f;
    }

    public final ue.l Y() {
        return this.f26913s;
    }

    public final ue.l a0() {
        return this.f26914t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H(ue.a.NO_ERROR, ue.a.CANCEL, null);
    }

    public final Socket e0() {
        return this.f26919y;
    }

    public final void flush() throws IOException {
        this.f26920z.flush();
    }

    public final synchronized ue.h i0(int i10) {
        return this.f26897c.get(Integer.valueOf(i10));
    }

    public final Map<Integer, ue.h> j0() {
        return this.f26897c;
    }

    public final long k0() {
        return this.f26918x;
    }

    public final long m0() {
        return this.f26917w;
    }

    public final ue.i n0() {
        return this.f26920z;
    }

    public final synchronized boolean o0(long j10) {
        if (this.f26901g) {
            return false;
        }
        return this.f26910p >= this.f26909o || j10 < this.f26912r;
    }

    public final ue.h q0(List<ue.b> requestHeaders, boolean z10) throws IOException {
        t.f(requestHeaders, "requestHeaders");
        return p0(0, requestHeaders, z10);
    }

    public final void r0(int i10, af.g source, int i11, boolean z10) throws IOException {
        t.f(source, "source");
        af.e eVar = new af.e();
        long j10 = i11;
        source.require(j10);
        source.read(eVar, j10);
        this.f26904j.i(new C0445e(this.f26898d + '[' + i10 + "] onData", true, this, i10, eVar, i11, z10), 0L);
    }

    public final void s0(int i10, List<ue.b> requestHeaders, boolean z10) {
        t.f(requestHeaders, "requestHeaders");
        this.f26904j.i(new f(this.f26898d + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z10), 0L);
    }

    public final void t0(int i10, List<ue.b> requestHeaders) {
        t.f(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i10))) {
                J0(i10, ue.a.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i10));
            this.f26904j.i(new g(this.f26898d + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
        }
    }

    public final boolean v0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized ue.h w0(int i10) {
        ue.h hVarRemove;
        hVarRemove = this.f26897c.remove(Integer.valueOf(i10));
        notifyAll();
        return hVarRemove;
    }

    public final void x0() {
        synchronized (this) {
            long j10 = this.f26910p;
            long j11 = this.f26909o;
            if (j10 < j11) {
                return;
            }
            this.f26909o = j11 + 1;
            this.f26912r = System.nanoTime() + ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            g0 g0Var = g0.f27756a;
            this.f26903i.i(new i(t.n(this.f26898d, " ping"), true, this), 0L);
        }
    }

    public final void y0(int i10) {
        this.f26899e = i10;
    }

    public final void z0(int i10) {
        this.f26900f = i10;
    }

    public final void u0(int i10, ue.a aVar) {
        t.f(aVar, elEbP.JIRaE);
        this.f26904j.i(new h(this.f26898d + '[' + i10 + "] onReset", true, this, i10, aVar), 0L);
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    public final class d implements ue.g.c, id.a<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ue.g f26932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f26933b;

        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class a extends qe.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f26934e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f26935f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f26936g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ h0 f26937h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, e eVar, h0 h0Var) {
                super(str, z10);
                this.f26934e = str;
                this.f26935f = z10;
                this.f26936g = eVar;
                this.f26937h = h0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qe.a
            public long f() {
                this.f26936g.N().a(this.f26936g, (ue.l) this.f26937h.f21514a);
                return -1L;
            }
        }

        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class b extends qe.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f26938e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f26939f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f26940g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ ue.h f26941h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, e eVar, ue.h hVar) {
                super(str, z10);
                this.f26938e = str;
                this.f26939f = z10;
                this.f26940g = eVar;
                this.f26941h = hVar;
            }

            @Override // qe.a
            public long f() {
                try {
                    this.f26940g.N().b(this.f26941h);
                    return -1L;
                } catch (IOException e10) {
                    we.h.f27895a.g().k(t.n("Http2Connection.Listener failure for ", this.f26940g.K()), 4, e10);
                    try {
                        this.f26941h.d(ue.a.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class c extends qe.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f26942e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f26943f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f26944g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f26945h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f26946i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, e eVar, int i10, int i11) {
                super(str, z10);
                this.f26942e = str;
                this.f26943f = z10;
                this.f26944g = eVar;
                this.f26945h = i10;
                this.f26946i = i11;
            }

            @Override // qe.a
            public long f() {
                this.f26944g.H0(true, this.f26945h, this.f26946i);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: ue.e$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TaskQueue.kt */
        public static final class C0444d extends qe.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f26947e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f26948f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d f26949g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f26950h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ ue.l f26951i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0444d(String str, boolean z10, d dVar, boolean z11, ue.l lVar) {
                super(str, z10);
                this.f26947e = str;
                this.f26948f = z10;
                this.f26949g = dVar;
                this.f26950h = z11;
                this.f26951i = lVar;
            }

            @Override // qe.a
            public long f() {
                this.f26949g.e(this.f26950h, this.f26951i);
                return -1L;
            }
        }

        public d(e this$0, ue.g reader) {
            t.f(this$0, "this$0");
            t.f(reader, "reader");
            this.f26933b = this$0;
            this.f26932a = reader;
        }

        @Override // ue.g.c
        public void a(int i10, ue.a errorCode) {
            t.f(errorCode, "errorCode");
            if (this.f26933b.v0(i10)) {
                this.f26933b.u0(i10, errorCode);
                return;
            }
            ue.h hVarW0 = this.f26933b.w0(i10);
            if (hVarW0 == null) {
                return;
            }
            hVarW0.y(errorCode);
        }

        @Override // ue.g.c
        public void b(int i10, ue.a errorCode, af.h debugData) {
            int i11;
            Object[] array;
            t.f(errorCode, "errorCode");
            t.f(debugData, "debugData");
            debugData.F();
            e eVar = this.f26933b;
            synchronized (eVar) {
                i11 = 0;
                array = eVar.j0().values().toArray(new ue.h[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                eVar.f26901g = true;
                g0 g0Var = g0.f27756a;
            }
            ue.h[] hVarArr = (ue.h[]) array;
            int length = hVarArr.length;
            while (i11 < length) {
                ue.h hVar = hVarArr[i11];
                i11++;
                if (hVar.j() > i10 && hVar.t()) {
                    hVar.y(ue.a.REFUSED_STREAM);
                    this.f26933b.w0(hVar.j());
                }
            }
        }

        @Override // ue.g.c
        public void c(boolean z10, int i10, af.g source, int i11) throws IOException {
            t.f(source, "source");
            if (this.f26933b.v0(i10)) {
                this.f26933b.r0(i10, source, i11, z10);
                return;
            }
            ue.h hVarI0 = this.f26933b.i0(i10);
            if (hVarI0 == null) {
                this.f26933b.J0(i10, ue.a.PROTOCOL_ERROR);
                long j10 = i11;
                this.f26933b.E0(j10);
                source.skip(j10);
                return;
            }
            hVarI0.w(source, i11);
            if (z10) {
                hVarI0.x(ne.d.f22992b, true);
            }
        }

        @Override // ue.g.c
        public void d(boolean z10, ue.l settings) {
            t.f(settings, "settings");
            this.f26933b.f26903i.i(new C0444d(t.n(this.f26933b.K(), " applyAndAckSettings"), true, this, z10, settings), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, ue.l] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void e(boolean z10, ue.l settings) {
            ?? r13;
            long jC;
            int i10;
            ue.h[] hVarArr;
            t.f(settings, "settings");
            h0 h0Var = new h0();
            ue.i iVarN0 = this.f26933b.n0();
            e eVar = this.f26933b;
            synchronized (iVarN0) {
                synchronized (eVar) {
                    ue.l lVarA0 = eVar.a0();
                    if (z10) {
                        r13 = settings;
                    } else {
                        ue.l lVar = new ue.l();
                        lVar.g(lVarA0);
                        lVar.g(settings);
                        r13 = lVar;
                    }
                    h0Var.f21514a = r13;
                    jC = ((long) r13.c()) - ((long) lVarA0.c());
                    i10 = 0;
                    if (jC == 0 || eVar.j0().isEmpty()) {
                        hVarArr = null;
                    } else {
                        Object[] array = eVar.j0().values().toArray(new ue.h[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        hVarArr = (ue.h[]) array;
                    }
                    eVar.A0((ue.l) h0Var.f21514a);
                    eVar.f26905k.i(new a(t.n(eVar.K(), " onSettings"), true, eVar, h0Var), 0L);
                    g0 g0Var = g0.f27756a;
                }
                try {
                    eVar.n0().b((ue.l) h0Var.f21514a);
                } catch (IOException e10) {
                    eVar.I(e10);
                }
                g0 g0Var2 = g0.f27756a;
            }
            if (hVarArr != null) {
                int length = hVarArr.length;
                while (i10 < length) {
                    ue.h hVar = hVarArr[i10];
                    i10++;
                    synchronized (hVar) {
                        hVar.a(jC);
                        g0 g0Var3 = g0.f27756a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [ue.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, ue.g] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void f() throws Throwable {
            ue.a aVar;
            ue.a aVar2 = ue.a.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f26932a.e(this);
                    while (this.f26932a.c(false, this)) {
                    }
                    ue.a aVar3 = ue.a.NO_ERROR;
                    try {
                        this.f26933b.H(aVar3, ue.a.CANCEL, null);
                        aVar = aVar3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ue.a aVar4 = ue.a.PROTOCOL_ERROR;
                        e eVar = this.f26933b;
                        eVar.H(aVar4, aVar4, e10);
                        aVar = eVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f26933b.H(aVar, aVar2, e10);
                    ne.d.m(this.f26932a);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                this.f26933b.H(aVar, aVar2, e10);
                ne.d.m(this.f26932a);
                throw th;
            }
            aVar2 = this.f26932a;
            ne.d.m(aVar2);
        }

        @Override // ue.g.c
        public void headers(boolean z10, int i10, int i11, List<ue.b> headerBlock) {
            t.f(headerBlock, "headerBlock");
            if (this.f26933b.v0(i10)) {
                this.f26933b.s0(i10, headerBlock, z10);
                return;
            }
            e eVar = this.f26933b;
            synchronized (eVar) {
                ue.h hVarI0 = eVar.i0(i10);
                if (hVarI0 != null) {
                    g0 g0Var = g0.f27756a;
                    hVarI0.x(ne.d.Q(headerBlock), z10);
                    return;
                }
                if (eVar.f26901g) {
                    return;
                }
                if (i10 <= eVar.L()) {
                    return;
                }
                if (i10 % 2 == eVar.U() % 2) {
                    return;
                }
                ue.h hVar = new ue.h(i10, eVar, false, z10, ne.d.Q(headerBlock));
                eVar.y0(i10);
                eVar.j0().put(Integer.valueOf(i10), hVar);
                eVar.f26902h.i().i(new b(eVar.K() + '[' + i10 + "] onStream", true, eVar, hVar), 0L);
            }
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ g0 invoke() throws Throwable {
            f();
            return g0.f27756a;
        }

        @Override // ue.g.c
        public void ping(boolean z10, int i10, int i11) {
            if (!z10) {
                this.f26933b.f26903i.i(new c(t.n(this.f26933b.K(), " ping"), true, this.f26933b, i10, i11), 0L);
                return;
            }
            e eVar = this.f26933b;
            synchronized (eVar) {
                try {
                    if (i10 == 1) {
                        eVar.f26908n++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            eVar.f26911q++;
                            eVar.notifyAll();
                        }
                        g0 g0Var = g0.f27756a;
                    } else {
                        eVar.f26910p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ue.g.c
        public void pushPromise(int i10, int i11, List<ue.b> requestHeaders) {
            t.f(requestHeaders, "requestHeaders");
            this.f26933b.t0(i11, requestHeaders);
        }

        @Override // ue.g.c
        public void windowUpdate(int i10, long j10) {
            if (i10 == 0) {
                e eVar = this.f26933b;
                synchronized (eVar) {
                    eVar.f26918x = eVar.k0() + j10;
                    eVar.notifyAll();
                    g0 g0Var = g0.f27756a;
                }
                return;
            }
            ue.h hVarI0 = this.f26933b.i0(i10);
            if (hVarI0 != null) {
                synchronized (hVarI0) {
                    hVarI0.a(j10);
                    g0 g0Var2 = g0.f27756a;
                }
            }
        }

        @Override // ue.g.c
        public void ackSettings() {
        }

        @Override // ue.g.c
        public void priority(int i10, int i11, int i12, boolean z10) {
        }
    }
}
