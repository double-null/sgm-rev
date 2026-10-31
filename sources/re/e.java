package re;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.y;
import kotlin.jvm.internal.t;
import me.b0;
import me.p;
import me.r;
import me.u;
import me.x;
import me.z;
import se.j;
import wc.g0;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements me.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f25108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f25109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f25111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f25112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f25113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f25114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f25115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f25116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f25117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private re.c f25119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f25122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f25123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile re.c f25124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile f f25125r;

    /* JADX INFO: compiled from: RealCall.kt */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final me.f f25126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f25127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f25128c;

        public a(e this$0, me.f responseCallback) {
            t.f(this$0, "this$0");
            t.f(responseCallback, "responseCallback");
            this.f25128c = this$0;
            this.f25126a = responseCallback;
            this.f25127b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            t.f(executorService, "executorService");
            p pVarO = this.f25128c.m().o();
            if (ne.d.f22998h && Thread.holdsLock(pVarO)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + pVarO);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f25128c.v(interruptedIOException);
                    this.f25126a.onFailure(this.f25128c, interruptedIOException);
                    this.f25128c.m().o().f(this);
                }
            } catch (Throwable th) {
                this.f25128c.m().o().f(this);
                throw th;
            }
        }

        public final e c() {
            return this.f25128c;
        }

        public final AtomicInteger d() {
            return this.f25127b;
        }

        public final String e() {
            return this.f25128c.r().j().h();
        }

        public final void f(a other) {
            t.f(other, "other");
            this.f25127b = other.f25127b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th;
            IOException e10;
            p pVarO;
            String strN = t.n("OkHttp ", this.f25128c.w());
            e eVar = this.f25128c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strN);
            try {
                eVar.f25113f.v();
                try {
                    try {
                        z10 = true;
                        try {
                            this.f25126a.onResponse(eVar, eVar.s());
                            pVarO = eVar.m().o();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                we.h.f27895a.g().k(t.n("Callback failure for ", eVar.C()), 4, e10);
                            } else {
                                this.f25126a.onFailure(eVar, e10);
                            }
                            pVarO = eVar.m().o();
                        } catch (Throwable th2) {
                            th = th2;
                            eVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException(t.n("canceled due to ", th));
                                wc.f.a(iOException, th);
                                this.f25126a.onFailure(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        eVar.m().o().f(this);
                        throw th3;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th = th4;
                }
                pVarO.f(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    public static final class b extends WeakReference<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f25129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            t.f(referent, "referent");
            this.f25129a = obj;
        }

        public final Object a() {
            return this.f25129a;
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    public static final class c extends af.c {
        c() {
        }

        @Override // af.c
        protected void B() {
            e.this.cancel();
        }
    }

    public e(x client, z originalRequest, boolean z10) {
        t.f(client, "client");
        t.f(originalRequest, "originalRequest");
        this.f25108a = client;
        this.f25109b = originalRequest;
        this.f25110c = z10;
        this.f25111d = client.l().a();
        this.f25112e = client.q().a(this);
        c cVar = new c();
        cVar.g(m().i(), TimeUnit.MILLISECONDS);
        this.f25113f = cVar;
        this.f25114g = new AtomicBoolean();
        this.f25122o = true;
    }

    private final <E extends IOException> E B(E e10) {
        if (this.f25118k || !this.f25113f.w()) {
            return e10;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f25110c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(w());
        return sb2.toString();
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
    private final <E extends IOException> E g(E e10) {
        Socket socketX;
        boolean z10 = ne.d.f22998h;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f25117j;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketX = x();
            }
            if (this.f25117j == null) {
                if (socketX != null) {
                    ne.d.n(socketX);
                }
                this.f25112e.l(this, fVar);
            } else {
                if (!(socketX == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) B(e10);
        if (e10 != null) {
            r rVar = this.f25112e;
            t.c(e11);
            rVar.e(this, e11);
        } else {
            this.f25112e.d(this);
        }
        return e11;
    }

    private final void h() {
        this.f25115h = we.h.f27895a.g().i("response.body().close()");
        this.f25112e.f(this);
    }

    private final me.a j(u uVar) {
        SSLSocketFactory sSLSocketFactoryF;
        HostnameVerifier hostnameVerifierU;
        me.g gVarJ;
        if (uVar.i()) {
            sSLSocketFactoryF = this.f25108a.F();
            hostnameVerifierU = this.f25108a.u();
            gVarJ = this.f25108a.j();
        } else {
            sSLSocketFactoryF = null;
            hostnameVerifierU = null;
            gVarJ = null;
        }
        return new me.a(uVar.h(), uVar.l(), this.f25108a.p(), this.f25108a.E(), sSLSocketFactoryF, hostnameVerifierU, gVarJ, this.f25108a.A(), this.f25108a.z(), this.f25108a.y(), this.f25108a.m(), this.f25108a.B());
    }

    public final void A() {
        if (!(!this.f25118k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f25118k = true;
        this.f25113f.w();
    }

    @Override // me.e
    public void cancel() {
        if (this.f25123p) {
            return;
        }
        this.f25123p = true;
        re.c cVar = this.f25124q;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f25125r;
        if (fVar != null) {
            fVar.d();
        }
        this.f25112e.g(this);
    }

    public final void d(f connection) {
        t.f(connection, "connection");
        if (!ne.d.f22998h || Thread.holdsLock(connection)) {
            if (!(this.f25117j == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f25117j = connection;
            connection.n().add(new b(this, this.f25115h));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }

    @Override // me.e
    public b0 execute() {
        if (!this.f25114g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f25113f.v();
        h();
        try {
            this.f25108a.o().b(this);
            return s();
        } finally {
            this.f25108a.o().g(this);
        }
    }

    @Override // me.e
    public void f(me.f responseCallback) {
        t.f(responseCallback, "responseCallback");
        if (!this.f25114g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        h();
        this.f25108a.o().a(new a(this, responseCallback));
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f25108a, this.f25109b, this.f25110c);
    }

    @Override // me.e
    public boolean isCanceled() {
        return this.f25123p;
    }

    public final void k(z request, boolean z10) {
        t.f(request, "request");
        if (!(this.f25119l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f25121n)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f25120m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            g0 g0Var = g0.f27756a;
        }
        if (z10) {
            this.f25116i = new d(this.f25111d, j(request.j()), this, this.f25112e);
        }
    }

    public final void l(boolean z10) {
        re.c cVar;
        synchronized (this) {
            if (!this.f25122o) {
                throw new IllegalStateException("released".toString());
            }
            g0 g0Var = g0.f27756a;
        }
        if (z10 && (cVar = this.f25124q) != null) {
            cVar.d();
        }
        this.f25119l = null;
    }

    public final x m() {
        return this.f25108a;
    }

    public final f n() {
        return this.f25117j;
    }

    public final r o() {
        return this.f25112e;
    }

    public final boolean p() {
        return this.f25110c;
    }

    public final re.c q() {
        return this.f25119l;
    }

    public final z r() {
        return this.f25109b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    public final b0 s() throws Throwable {
        ArrayList arrayList = new ArrayList();
        y.z(arrayList, this.f25108a.v());
        arrayList.add(new j(this.f25108a));
        arrayList.add(new se.a(this.f25108a.n()));
        arrayList.add(new pe.a(this.f25108a.h()));
        arrayList.add(re.a.f25076a);
        if (!this.f25110c) {
            y.z(arrayList, this.f25108a.w());
        }
        arrayList.add(new se.b(this.f25110c));
        boolean z10 = false;
        try {
            b0 b0VarA = new se.g(this, arrayList, 0, null, this.f25109b, this.f25108a.k(), this.f25108a.C(), this.f25108a.H()).a(this.f25109b);
            if (isCanceled()) {
                ne.d.m(b0VarA);
                throw new IOException("Canceled");
            }
            v(null);
            return b0VarA;
        } catch (IOException e10) {
            try {
                IOException iOExceptionV = v(e10);
                if (iOExceptionV == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionV;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    v(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z10) {
                v(null);
            }
            throw th;
        }
    }

    public final re.c t(se.g chain) throws IOException {
        t.f(chain, "chain");
        synchronized (this) {
            if (!this.f25122o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f25121n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f25120m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            g0 g0Var = g0.f27756a;
        }
        d dVar = this.f25116i;
        t.c(dVar);
        re.c cVar = new re.c(this, this.f25112e, dVar, dVar.a(this.f25108a, chain));
        this.f25119l = cVar;
        this.f25124q = cVar;
        synchronized (this) {
            this.f25120m = true;
            this.f25121n = true;
        }
        if (this.f25123p) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E u(re.c exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        t.f(exchange, "exchange");
        if (!t.a(exchange, this.f25124q)) {
            return e10;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (this.f25120m) {
                        if (z10) {
                            this.f25120m = false;
                        }
                        if (z11) {
                            this.f25121n = false;
                        }
                        z14 = this.f25120m;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z14) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    } else if (z11 || !this.f25121n) {
                        z13 = false;
                    } else {
                        if (z10) {
                            this.f25120m = false;
                        }
                        if (z11) {
                            this.f25121n = false;
                        }
                        z14 = this.f25120m;
                        if (z14 || this.f25121n) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 && !this.f25121n && !this.f25122o) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z11) {
                }
                z13 = false;
            }
            g0 g0Var = g0.f27756a;
        }
        if (z12) {
            this.f25124q = null;
            f fVar = this.f25117j;
            if (fVar != null) {
                fVar.s();
            }
        }
        return z13 ? (E) g(e10) : e10;
    }

    public final IOException v(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f25122o) {
                this.f25122o = false;
                if (!this.f25120m && !this.f25121n) {
                    z10 = true;
                }
            }
            g0 g0Var = g0.f27756a;
        }
        return z10 ? g(iOException) : iOException;
    }

    public final String w() {
        return this.f25109b.j().n();
    }

    public final Socket x() {
        f fVar = this.f25117j;
        t.c(fVar);
        if (ne.d.f22998h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listN = fVar.n();
        Iterator<Reference<e>> it = listN.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (t.a(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        listN.remove(i10);
        this.f25117j = null;
        if (listN.isEmpty()) {
            fVar.B(System.nanoTime());
            if (this.f25111d.c(fVar)) {
                return fVar.D();
            }
        }
        return null;
    }

    public final boolean y() {
        d dVar = this.f25116i;
        t.c(dVar);
        return dVar.e();
    }

    public final void z(f fVar) {
        this.f25125r = fVar;
    }
}
