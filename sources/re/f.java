package re;

import af.q;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import me.b0;
import me.d0;
import me.j;
import me.l;
import me.r;
import me.s;
import me.x;
import me.y;
import me.z;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import rd.c0;
import rd.v;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends ue.e.c implements j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f25131t = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f25132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f25133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f25134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Socket f25135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f25136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private y f25137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ue.e f25138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private af.g f25139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private af.f f25140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<Reference<e>> f25147r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f25148s;

    /* JADX INFO: compiled from: RealConnection.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RealConnection.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: RealConnection.kt */
    static final class c extends u implements id.a<List<? extends Certificate>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ me.g f25149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f25150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ me.a f25151f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(me.g gVar, s sVar, me.a aVar) {
            super(0);
            this.f25149d = gVar;
            this.f25150e = sVar;
            this.f25151f = aVar;
        }

        @Override // id.a
        public final List<? extends Certificate> invoke() {
            ze.c cVarD = this.f25149d.d();
            t.c(cVarD);
            return cVarD.a(this.f25150e.d(), this.f25151f.l().h());
        }
    }

    /* JADX INFO: compiled from: RealConnection.kt */
    static final class d extends u implements id.a<List<? extends X509Certificate>> {
        d() {
            super(0);
        }

        @Override // id.a
        public final List<? extends X509Certificate> invoke() {
            s sVar = f.this.f25136g;
            t.c(sVar);
            List<Certificate> listD = sVar.d();
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public f(g connectionPool, d0 route) {
        t.f(connectionPool, "connectionPool");
        t.f(route, "route");
        this.f25132c = connectionPool;
        this.f25133d = route;
        this.f25146q = 1;
        this.f25147r = new ArrayList();
        this.f25148s = Long.MAX_VALUE;
    }

    private final boolean A(List<d0> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (d0 d0Var : list) {
            if (d0Var.b().type() == Proxy.Type.DIRECT && this.f25133d.b().type() == Proxy.Type.DIRECT && t.a(this.f25133d.d(), d0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private final void E(int i10) throws IOException {
        Socket socket = this.f25135f;
        t.c(socket);
        af.g gVar = this.f25139j;
        t.c(gVar);
        af.f fVar = this.f25140k;
        t.c(fVar);
        socket.setSoTimeout(0);
        ue.e eVarA = new ue.e.a(true, qe.e.f24785i).s(socket, this.f25133d.a().l().h(), gVar, fVar).k(this).l(i10).a();
        this.f25138i = eVarA;
        this.f25146q = ue.e.C.a().d();
        ue.e.D0(eVarA, false, null, 3, null);
    }

    private final boolean F(me.u uVar) {
        s sVar;
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        me.u uVarL = this.f25133d.a().l();
        if (uVar.l() != uVarL.l()) {
            return false;
        }
        if (t.a(uVar.h(), uVarL.h())) {
            return true;
        }
        if (this.f25142m || (sVar = this.f25136g) == null) {
            return false;
        }
        t.c(sVar);
        return e(uVar, sVar);
    }

    private final boolean e(me.u uVar, s sVar) {
        List<Certificate> listD = sVar.d();
        return (listD.isEmpty() ^ true) && ze.d.f29251a.e(uVar.h(), (X509Certificate) listD.get(0));
    }

    private final void h(int i10, int i11, me.e eVar, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f25133d.b();
        me.a aVarA = this.f25133d.a();
        Proxy.Type type = proxyB.type();
        int i12 = type == null ? -1 : b.$EnumSwitchMapping$0[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = aVarA.j().createSocket();
            t.c(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f25134e = socketCreateSocket;
        rVar.j(eVar, this.f25133d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i11);
        try {
            we.h.f27895a.g().f(socketCreateSocket, this.f25133d.d(), i10);
            try {
                this.f25139j = q.d(q.l(socketCreateSocket));
                this.f25140k = q.c(q.h(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (t.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(t.n("Failed to connect to ", this.f25133d.d()));
            connectException.initCause(e11);
            throw connectException;
        }
    }

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
    private final void i(re.b bVar) throws Throwable {
        me.a aVarA = this.f25133d.a();
        SSLSocketFactory sSLSocketFactoryK = aVarA.k();
        SSLSocket sSLSocket = null;
        try {
            t.c(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f25134e, aVarA.l().h(), aVarA.l().l(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    we.h.f27895a.g().e(sSLSocket2, aVarA.l().h(), aVarA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                s.a aVar = s.f22527e;
                t.e(sslSocketSession, "sslSocketSession");
                s sVarA = aVar.a(sslSocketSession);
                HostnameVerifier hostnameVerifierE = aVarA.e();
                t.c(hostnameVerifierE);
                if (hostnameVerifierE.verify(aVarA.l().h(), sslSocketSession)) {
                    me.g gVarA = aVarA.a();
                    t.c(gVarA);
                    this.f25136g = new s(sVarA.e(), sVarA.a(), sVarA.c(), new c(gVarA, sVarA, aVarA));
                    gVarA.b(aVarA.l().h(), new d());
                    String strH = lVarA.h() ? we.h.f27895a.g().h(sSLSocket2) : null;
                    this.f25135f = sSLSocket2;
                    this.f25139j = q.d(q.l(sSLSocket2));
                    this.f25140k = q.c(q.h(sSLSocket2));
                    this.f25137h = strH != null ? y.f22618b.a(strH) : y.HTTP_1_1;
                    we.h.f27895a.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> listD = sVarA.d();
                if (!(!listD.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVarA.l().h() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listD.get(0);
                throw new SSLPeerUnverifiedException(v.l("\n              |Hostname " + aVarA.l().h() + " not verified:\n              |    certificate: " + me.g.f22397c.a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + ze.d.f29251a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    we.h.f27895a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    ne.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void j(int i10, int i11, int i12, me.e eVar, r rVar) throws IOException {
        z zVarL = l();
        me.u uVarJ = zVarL.j();
        int i13 = 0;
        while (i13 < 21) {
            i13++;
            h(i10, i11, eVar, rVar);
            zVarL = k(i11, i12, zVarL, uVarJ);
            if (zVarL == null) {
                return;
            }
            Socket socket = this.f25134e;
            if (socket != null) {
                ne.d.n(socket);
            }
            this.f25134e = null;
            this.f25140k = null;
            this.f25139j = null;
            rVar.h(eVar, this.f25133d.d(), this.f25133d.b(), null);
        }
    }

    private final z k(int i10, int i11, z zVar, me.u uVar) throws IOException {
        String str = "CONNECT " + ne.d.R(uVar, true) + " HTTP/1.1";
        while (true) {
            af.g gVar = this.f25139j;
            t.c(gVar);
            af.f fVar = this.f25140k;
            t.c(fVar);
            te.b bVar = new te.b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().g(i10, timeUnit);
            fVar.timeout().g(i11, timeUnit);
            bVar.w(zVar.f(), str);
            bVar.finishRequest();
            b0.a responseHeaders = bVar.readResponseHeaders(false);
            t.c(responseHeaders);
            b0 b0VarC = responseHeaders.s(zVar).c();
            bVar.v(b0VarC);
            int iH = b0VarC.h();
            if (iH == 200) {
                if (gVar.getBuffer().exhausted() && fVar.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iH != 407) {
                throw new IOException(t.n("Unexpected response code for CONNECT: ", Integer.valueOf(b0VarC.h())));
            }
            z zVarA = this.f25133d.a().h().a(this.f25133d, b0VarC);
            if (zVarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (c0.B(MRAIDPresenter.CLOSE, b0.p(b0VarC, "Connection", null, 2, null), true)) {
                return zVarA;
            }
            zVar = zVarA;
        }
    }

    private final z l() throws IOException {
        z zVarB = new z.a().o(this.f25133d.a().l()).g("CONNECT", null).e("Host", ne.d.R(this.f25133d.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e("User-Agent", "okhttp/4.10.0").b();
        z zVarA = this.f25133d.a().h().a(this.f25133d, new b0.a().s(zVarB).q(y.HTTP_1_1).g(407).n("Preemptive Authenticate").b(ne.d.f22993c).t(-1L).r(-1L).k("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return zVarA == null ? zVarB : zVarA;
    }

    private final void m(re.b bVar, int i10, me.e eVar, r rVar) throws Throwable {
        if (this.f25133d.a().k() != null) {
            rVar.C(eVar);
            i(bVar);
            rVar.B(eVar, this.f25136g);
            if (this.f25137h == y.HTTP_2) {
                E(i10);
                return;
            }
            return;
        }
        List<y> listF = this.f25133d.a().f();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(yVar)) {
            this.f25135f = this.f25134e;
            this.f25137h = y.HTTP_1_1;
        } else {
            this.f25135f = this.f25134e;
            this.f25137h = yVar;
            E(i10);
        }
    }

    public final void B(long j10) {
        this.f25148s = j10;
    }

    public final void C(boolean z10) {
        this.f25141l = z10;
    }

    public Socket D() {
        Socket socket = this.f25135f;
        t.c(socket);
        return socket;
    }

    public final synchronized void G(e call, IOException iOException) {
        t.f(call, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f23398a == ue.a.REFUSED_STREAM) {
                int i10 = this.f25145p + 1;
                this.f25145p = i10;
                if (i10 > 1) {
                    this.f25141l = true;
                    this.f25143n++;
                }
            } else if (((StreamResetException) iOException).f23398a != ue.a.CANCEL || !call.isCanceled()) {
                this.f25141l = true;
                this.f25143n++;
            }
        } else if (!v() || (iOException instanceof ConnectionShutdownException)) {
            this.f25141l = true;
            if (this.f25144o == 0) {
                if (iOException != null) {
                    g(call.m(), this.f25133d, iOException);
                }
                this.f25143n++;
            }
        }
    }

    @Override // ue.e.c
    public synchronized void a(ue.e connection, ue.l settings) {
        t.f(connection, "connection");
        t.f(settings, "settings");
        this.f25146q = settings.d();
    }

    @Override // ue.e.c
    public void b(ue.h stream) throws IOException {
        t.f(stream, "stream");
        stream.d(ue.a.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f25134e;
        if (socket == null) {
            return;
        }
        ne.d.n(socket);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:70:0x009a->B:78:?, LOOP_END, SYNTHETIC] */
    public final void f(int i10, int i11, int i12, int i13, boolean z10, me.e call, r eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        t.f(call, "call");
        t.f(eventListener, "eventListener");
        if (!(this.f25137h == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<l> listB = this.f25133d.a().b();
        re.b bVar = new re.b(listB);
        if (this.f25133d.a().k() == null) {
            if (!listB.contains(l.f22488k)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strH = this.f25133d.a().l().h();
            if (!we.h.f27895a.g().j(strH)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy"));
            }
        } else if (this.f25133d.a().f().contains(y.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.f25133d.c()) {
                    j(i10, i11, i12, call, eventListener);
                    if (this.f25134e == null) {
                        break;
                    }
                } else {
                    try {
                        h(i10, i11, call, eventListener);
                    } catch (IOException e10) {
                        e = e10;
                        socket = this.f25135f;
                        if (socket != null) {
                            ne.d.n(socket);
                        }
                        socket2 = this.f25134e;
                        if (socket2 != null) {
                            ne.d.n(socket2);
                        }
                        this.f25135f = null;
                        this.f25134e = null;
                        this.f25139j = null;
                        this.f25140k = null;
                        this.f25136g = null;
                        this.f25137h = null;
                        this.f25138i = null;
                        this.f25146q = 1;
                        eventListener.i(call, this.f25133d.d(), this.f25133d.b(), null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.b(e);
                        }
                        if (z10) {
                            throw routeException;
                        }
                        if (bVar.b(e)) {
                            throw routeException;
                        }
                    }
                }
                try {
                    m(bVar, i13, call, eventListener);
                    eventListener.h(call, this.f25133d.d(), this.f25133d.b(), this.f25137h);
                    break;
                } catch (IOException e11) {
                    e = e11;
                    socket = this.f25135f;
                    if (socket != null) {
                        ne.d.n(socket);
                    }
                    socket2 = this.f25134e;
                    if (socket2 != null) {
                        ne.d.n(socket2);
                    }
                    this.f25135f = null;
                    this.f25134e = null;
                    this.f25139j = null;
                    this.f25140k = null;
                    this.f25136g = null;
                    this.f25137h = null;
                    this.f25138i = null;
                    this.f25146q = 1;
                    eventListener.i(call, this.f25133d.d(), this.f25133d.b(), null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.b(e);
                    }
                    if (z10) {
                        throw routeException;
                    }
                    if (bVar.b(e)) {
                        throw routeException;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
        if (this.f25133d.c() && this.f25134e == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f25148s = System.nanoTime();
    }

    public final void g(x client, d0 failedRoute, IOException failure) {
        t.f(client, "client");
        t.f(failedRoute, "failedRoute");
        t.f(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            me.a aVarA = failedRoute.a();
            aVarA.i().connectFailed(aVarA.l().q(), failedRoute.b().address(), failure);
        }
        client.t().b(failedRoute);
    }

    public final List<Reference<e>> n() {
        return this.f25147r;
    }

    public final long o() {
        return this.f25148s;
    }

    public final boolean p() {
        return this.f25141l;
    }

    public final int q() {
        return this.f25143n;
    }

    public s r() {
        return this.f25136g;
    }

    public final synchronized void s() {
        this.f25144o++;
    }

    public final boolean t(me.a address, List<d0> list) {
        t.f(address, "address");
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f25147r.size() >= this.f25146q || this.f25141l || !this.f25133d.a().d(address)) {
            return false;
        }
        if (t.a(address.l().h(), z().a().l().h())) {
            return true;
        }
        if (this.f25138i == null || list == null || !A(list) || address.e() != ze.d.f29251a || !F(address.l())) {
            return false;
        }
        try {
            me.g gVarA = address.a();
            t.c(gVarA);
            String strH = address.l().h();
            s sVarR = r();
            t.c(sVarR);
            gVarA.a(strH, sVarR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        me.i iVarA;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f25133d.a().l().h());
        sb2.append(':');
        sb2.append(this.f25133d.a().l().l());
        sb2.append(", proxy=");
        sb2.append(this.f25133d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f25133d.d());
        sb2.append(" cipherSuite=");
        s sVar = this.f25136g;
        Object obj = "none";
        if (sVar != null && (iVarA = sVar.a()) != null) {
            obj = iVarA;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f25137h);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long jO;
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f25134e;
        t.c(socket);
        Socket socket2 = this.f25135f;
        t.c(socket2);
        af.g gVar = this.f25139j;
        t.c(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ue.e eVar = this.f25138i;
        if (eVar != null) {
            return eVar.o0(jNanoTime);
        }
        synchronized (this) {
            jO = jNanoTime - o();
        }
        if (jO < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z10) {
            return true;
        }
        return ne.d.G(socket2, gVar);
    }

    public final boolean v() {
        return this.f25138i != null;
    }

    public final se.d w(x client, se.g chain) throws SocketException {
        t.f(client, "client");
        t.f(chain, "chain");
        Socket socket = this.f25135f;
        t.c(socket);
        af.g gVar = this.f25139j;
        t.c(gVar);
        af.f fVar = this.f25140k;
        t.c(fVar);
        ue.e eVar = this.f25138i;
        if (eVar != null) {
            return new ue.f(client, this, chain, eVar);
        }
        socket.setSoTimeout(chain.j());
        af.d0 d0VarTimeout = gVar.timeout();
        long jG = chain.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d0VarTimeout.g(jG, timeUnit);
        fVar.timeout().g(chain.i(), timeUnit);
        return new te.b(client, this, gVar, fVar);
    }

    public final synchronized void x() {
        this.f25142m = true;
    }

    public final synchronized void y() {
        this.f25141l = true;
    }

    public d0 z() {
        return this.f25133d;
    }
}
