package se;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.t;
import me.a0;
import me.b0;
import me.c0;
import me.d0;
import me.u;
import me.v;
import me.x;
import me.z;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import rd.o;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25445b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f25446a;

    /* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public j(x client) {
        t.f(client, "client");
        this.f25446a = client;
    }

    private final z a(b0 b0Var, String str) {
        String strP;
        u uVarO;
        if (!this.f25446a.r() || (strP = b0.p(b0Var, "Location", null, 2, null)) == null || (uVarO = b0Var.G().j().o(strP)) == null) {
            return null;
        }
        if (!t.a(uVarO.p(), b0Var.G().j().p()) && !this.f25446a.s()) {
            return null;
        }
        z.a aVarI = b0Var.G().i();
        if (f.b(str)) {
            int iH = b0Var.h();
            f fVar = f.f25431a;
            boolean z10 = fVar.d(str) || iH == 308 || iH == 307;
            if (!fVar.c(str) || iH == 308 || iH == 307) {
                aVarI.g(str, z10 ? b0Var.G().a() : null);
            } else {
                aVarI.g("GET", null);
            }
            if (!z10) {
                aVarI.i("Transfer-Encoding");
                aVarI.i("Content-Length");
                aVarI.i("Content-Type");
            }
        }
        if (!ne.d.j(b0Var.G().j(), uVarO)) {
            aVarI.i("Authorization");
        }
        return aVarI.o(uVarO).b();
    }

    private final z b(b0 b0Var, re.c cVar) throws IOException {
        re.f fVarH;
        d0 d0VarZ = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.z();
        int iH = b0Var.h();
        String strH = b0Var.G().h();
        if (iH != 307 && iH != 308) {
            if (iH == 401) {
                return this.f25446a.g().a(d0VarZ, b0Var);
            }
            if (iH == 421) {
                a0 a0VarA = b0Var.G().a();
                if ((a0VarA != null && a0VarA.isOneShot()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().x();
                return b0Var.G();
            }
            if (iH == 503) {
                b0 b0VarB = b0Var.B();
                if ((b0VarB == null || b0VarB.h() != 503) && f(b0Var, Integer.MAX_VALUE) == 0) {
                    return b0Var.G();
                }
                return null;
            }
            if (iH == 407) {
                t.c(d0VarZ);
                if (d0VarZ.b().type() == Proxy.Type.HTTP) {
                    return this.f25446a.A().a(d0VarZ, b0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iH == 408) {
                if (!this.f25446a.D()) {
                    return null;
                }
                a0 a0VarA2 = b0Var.G().a();
                if (a0VarA2 != null && a0VarA2.isOneShot()) {
                    return null;
                }
                b0 b0VarB2 = b0Var.B();
                if ((b0VarB2 == null || b0VarB2.h() != 408) && f(b0Var, 0) <= 0) {
                    return b0Var.G();
                }
                return null;
            }
            switch (iH) {
                case 300:
                case MRAID_ERROR_VALUE:
                case INVALID_IFA_STATUS_VALUE:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(b0Var, strH);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z10;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, re.e eVar, z zVar, boolean z10) {
        if (this.f25446a.D()) {
            return !(z10 && e(iOException, zVar)) && c(iOException, z10) && eVar.y();
        }
        return false;
    }

    private final boolean e(IOException iOException, z zVar) {
        a0 a0VarA = zVar.a();
        return (a0VarA != null && a0VarA.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(b0 b0Var, int i10) {
        String strP = b0.p(b0Var, "Retry-After", null, 2, null);
        if (strP == null) {
            return i10;
        }
        if (!new o("\\d+").e(strP)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strP);
        t.e(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // me.v
    public b0 intercept(v.a chain) throws IOException {
        b0 b0VarA;
        t.f(chain, "chain");
        g gVar = (g) chain;
        z zVarH = gVar.h();
        re.e eVarD = gVar.d();
        List listK = kotlin.collections.t.k();
        int i10 = 0;
        b0 b0Var = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                eVarD.k(zVarH, z10);
                try {
                    if (eVarD.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        try {
                            b0VarA = gVar.a(zVarH);
                        } catch (RouteException e10) {
                            if (!d(e10.e(), eVarD, zVarH, false)) {
                                throw ne.d.Z(e10.c(), listK);
                            }
                            listK = kotlin.collections.b0.d0(listK, e10.c());
                            eVarD.l(true);
                            z10 = false;
                        }
                    } catch (IOException e11) {
                        if (!d(e11, eVarD, zVarH, !(e11 instanceof ConnectionShutdownException))) {
                            throw ne.d.Z(e11, listK);
                        }
                        listK = kotlin.collections.b0.d0(listK, e11);
                        eVarD.l(true);
                        z10 = false;
                    }
                    eVarD.l(true);
                    z10 = false;
                } catch (Throwable th) {
                    eVarD.l(true);
                    throw th;
                }
            }
            if (b0Var != null) {
                b0VarA = b0VarA.z().p(b0Var.z().b(null).c()).c();
            }
            b0Var = b0VarA;
            re.c cVarQ = eVarD.q();
            z zVarB = b(b0Var, cVarQ);
            if (zVarB == null) {
                if (cVarQ != null && cVarQ.l()) {
                    eVarD.A();
                }
                eVarD.l(false);
                return b0Var;
            }
            a0 a0VarA = zVarB.a();
            if (a0VarA != null && a0VarA.isOneShot()) {
                eVarD.l(false);
                return b0Var;
            }
            c0 c0VarB = b0Var.b();
            if (c0VarB != null) {
                ne.d.m(c0VarB);
            }
            i10++;
            if (i10 > 20) {
                throw new ProtocolException(t.n("Too many follow-up requests: ", Integer.valueOf(i10)));
            }
            eVarD.l(true);
            zVarH = zVarB;
        }
    }
}
