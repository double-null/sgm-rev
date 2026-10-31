package we;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.u;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.x;
import me.y;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile h f27896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f27897c;

    /* JADX INFO: compiled from: Platform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private final h d() {
            xe.c.f28580a.b();
            h hVarA = we.a.f27865e.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f27868f.a();
            t.c(hVarA2);
            return hVarA2;
        }

        private final h e() {
            g gVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f27877e.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f27874e.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.f27892e.a()) != null) {
                return gVarA;
            }
            f fVarA = f.f27890d.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f27881i.a();
            return hVarA != null ? hVarA : new h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return t.a("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return t.a("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return t.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends y> protocols) {
            t.f(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((y) obj) != y.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(u.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends y> protocols) {
            t.f(protocols, "protocols");
            af.e eVar = new af.e();
            for (String str : b(protocols)) {
                eVar.writeByte(str.length());
                eVar.writeUtf8(str);
            }
            return eVar.readByteArray();
        }

        public final h g() {
            return h.f27896b;
        }

        public final boolean h() {
            return t.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a(null);
        f27895a = aVar;
        f27896b = aVar.f();
        f27897c = Logger.getLogger(x.class.getName());
    }

    public static /* synthetic */ void l(h hVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        hVar.k(str, i10, th);
    }

    public void b(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
    }

    public ze.c c(X509TrustManager trustManager) {
        t.f(trustManager, "trustManager");
        return new ze.a(d(trustManager));
    }

    public ze.e d(X509TrustManager trustManager) {
        t.f(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        t.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new ze.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List<y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        t.f(socket, "socket");
        t.f(address, "address");
        socket.connect(address, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        t.f(closer, "closer");
        if (f27897c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        t.f(hostname, "hostname");
        return true;
    }

    public void k(String message, int i10, Throwable th) {
        t.f(message, "message");
        f27897c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        t.f(message, "message");
        if (obj == null) {
            message = t.n(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        t.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        t.f(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            t.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(t.n("No System TLS: ", e10), e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        t.c(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            t.e(string, "toString(this)");
            throw new IllegalStateException(t.n("Unexpected default trust managers: ", string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        t.e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
