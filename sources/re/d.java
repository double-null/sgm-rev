package re;

import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import k9.dW.xjwcmjDeOXR;
import kotlin.jvm.internal.t;
import me.d0;
import me.r;
import me.u;
import me.x;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import wc.g0;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f25098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final me.a f25099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f25100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f25101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i.b f25102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f25103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d0 f25107j;

    public d(g connectionPool, me.a address, e call, r eventListener) {
        t.f(connectionPool, "connectionPool");
        t.f(address, "address");
        t.f(call, "call");
        t.f(eventListener, "eventListener");
        this.f25098a = connectionPool;
        this.f25099b = address;
        this.f25100c = call;
        this.f25101d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final f b(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        List<d0> listA;
        f fVar;
        Socket socketX;
        if (this.f25100c.isCanceled()) {
            throw new IOException("Canceled");
        }
        f fVarN = this.f25100c.n();
        if (fVarN != null) {
            synchronized (fVarN) {
                socketX = (fVarN.p() || !g(fVarN.z().a().l())) ? this.f25100c.x() : null;
                g0 g0Var = g0.f27756a;
            }
            if (this.f25100c.n() != null) {
                if (socketX == null) {
                    return fVarN;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (socketX != null) {
                ne.d.n(socketX);
            }
            this.f25101d.l(this.f25100c, fVarN);
        }
        this.f25104g = 0;
        this.f25105h = 0;
        this.f25106i = 0;
        if (this.f25098a.a(this.f25099b, this.f25100c, null, false)) {
            f fVarN2 = this.f25100c.n();
            t.c(fVarN2);
            this.f25101d.k(this.f25100c, fVarN2);
            return fVarN2;
        }
        d0 d0VarC = this.f25107j;
        try {
            if (d0VarC == null) {
                i.b bVar = this.f25102e;
                if (bVar != null) {
                    t.c(bVar);
                    if (bVar.b()) {
                        i.b bVar2 = this.f25102e;
                        t.c(bVar2);
                        d0VarC = bVar2.c();
                    }
                    fVar = new f(this.f25098a, d0VarC);
                    this.f25100c.z(fVar);
                    fVar.f(i10, i11, i12, i13, z10, this.f25100c, this.f25101d);
                    this.f25100c.z(null);
                    this.f25100c.m().t().a(fVar.z());
                    if (this.f25098a.a(this.f25099b, this.f25100c, listA, true)) {
                        f fVarN3 = this.f25100c.n();
                        t.c(fVarN3);
                        this.f25107j = d0VarC;
                        ne.d.n(fVar.D());
                        this.f25101d.k(this.f25100c, fVarN3);
                        return fVarN3;
                    }
                    synchronized (fVar) {
                        this.f25098a.e(fVar);
                        this.f25100c.d(fVar);
                        g0 g0Var2 = g0.f27756a;
                    }
                    this.f25101d.k(this.f25100c, fVar);
                    return fVar;
                }
                i iVar = this.f25103f;
                if (iVar == null) {
                    iVar = new i(this.f25099b, this.f25100c.m().t(), this.f25100c, this.f25101d);
                    this.f25103f = iVar;
                }
                i.b bVarC = iVar.c();
                this.f25102e = bVarC;
                listA = bVarC.a();
                if (this.f25100c.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.f25098a.a(this.f25099b, this.f25100c, listA, false)) {
                    f fVarN4 = this.f25100c.n();
                    t.c(fVarN4);
                    this.f25101d.k(this.f25100c, fVarN4);
                    return fVarN4;
                }
                d0VarC = bVarC.c();
                fVar = new f(this.f25098a, d0VarC);
                this.f25100c.z(fVar);
                fVar.f(i10, i11, i12, i13, z10, this.f25100c, this.f25101d);
                this.f25100c.z(null);
                this.f25100c.m().t().a(fVar.z());
                if (this.f25098a.a(this.f25099b, this.f25100c, listA, true)) {
                    f fVarN5 = this.f25100c.n();
                    t.c(fVarN5);
                    this.f25107j = d0VarC;
                    ne.d.n(fVar.D());
                    this.f25101d.k(this.f25100c, fVarN5);
                    return fVarN5;
                }
                synchronized (fVar) {
                    this.f25098a.e(fVar);
                    this.f25100c.d(fVar);
                    g0 g0Var3 = g0.f27756a;
                    this.f25101d.k(this.f25100c, fVar);
                    return fVar;
                }
            }
            t.c(d0VarC);
            this.f25107j = null;
            fVar.f(i10, i11, i12, i13, z10, this.f25100c, this.f25101d);
            this.f25100c.z(null);
            this.f25100c.m().t().a(fVar.z());
            if (this.f25098a.a(this.f25099b, this.f25100c, listA, true)) {
                f fVarN6 = this.f25100c.n();
                t.c(fVarN6);
                this.f25107j = d0VarC;
                ne.d.n(fVar.D());
                this.f25101d.k(this.f25100c, fVarN6);
                return fVarN6;
            }
            synchronized (fVar) {
                this.f25098a.e(fVar);
                this.f25100c.d(fVar);
                g0 g0Var4 = g0.f27756a;
                this.f25101d.k(this.f25100c, fVar);
                return fVar;
            }
        } catch (Throwable th) {
            this.f25100c.z(null);
            throw th;
        }
        listA = null;
        fVar = new f(this.f25098a, d0VarC);
        this.f25100c.z(fVar);
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f fVarB = b(i10, i11, i12, i13, z10);
            if (fVarB.u(z11)) {
                return fVarB;
            }
            fVarB.y();
            if (this.f25107j == null) {
                i.b bVar = this.f25102e;
                if (bVar == null ? true : bVar.b()) {
                    continue;
                } else {
                    i iVar = this.f25103f;
                    if (!(iVar != null ? iVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final d0 f() {
        f fVarN;
        if (this.f25104g > 1 || this.f25105h > 1 || this.f25106i > 0 || (fVarN = this.f25100c.n()) == null) {
            return null;
        }
        synchronized (fVarN) {
            if (fVarN.q() != 0) {
                return null;
            }
            if (ne.d.j(fVarN.z().a().l(), d().l())) {
                return fVarN.z();
            }
            return null;
        }
    }

    public final me.a d() {
        return this.f25099b;
    }

    public final boolean e() {
        i iVar;
        boolean z10 = false;
        if (this.f25104g == 0 && this.f25105h == 0 && this.f25106i == 0) {
            return false;
        }
        if (this.f25107j != null) {
            return true;
        }
        d0 d0VarF = f();
        if (d0VarF != null) {
            this.f25107j = d0VarF;
            return true;
        }
        i.b bVar = this.f25102e;
        if (bVar != null && bVar.b()) {
            z10 = true;
        }
        if (z10 || (iVar = this.f25103f) == null) {
            return true;
        }
        return iVar.a();
    }

    public final boolean g(u url) {
        t.f(url, "url");
        u uVarL = this.f25099b.l();
        return url.l() == uVarL.l() && t.a(url.h(), uVarL.h());
    }

    public final se.d a(x client, se.g gVar) {
        t.f(client, "client");
        t.f(gVar, xjwcmjDeOXR.OtXiJtmtlADfb);
        try {
            return c(gVar.e(), gVar.g(), gVar.i(), client.x(), client.D(), !t.a(gVar.h().h(), "GET")).w(client, gVar);
        } catch (IOException e10) {
            h(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            h(e11.e());
            throw e11;
        }
    }

    public final void h(IOException iOException) {
        t.f(iOException, WKirgUEJJ.IJyfcCALxO);
        this.f25107j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).f23398a == ue.a.REFUSED_STREAM) {
            this.f25104g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f25105h++;
        } else {
            this.f25106i++;
        }
    }
}
