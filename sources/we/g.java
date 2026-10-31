package we;

import b2.Bo.yeILL;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.y;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: compiled from: OpenJSSEPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f27893f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27894d;

    /* JADX INFO: compiled from: OpenJSSEPlatform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final g a() {
            k kVar = null;
            if (b()) {
                return new g(kVar);
            }
            return null;
        }

        public final boolean b() {
            return g.f27893f;
        }
    }

    static {
        a aVar = new a(null);
        f27892e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f27893f = z10;
    }

    public /* synthetic */ g(k kVar) {
        this();
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.h(sslSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : t.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // we.h
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f27894d);
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

    private g() {
        this.f27894d = new OpenJSSE();
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = h.f27895a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(yeILL.lNDEewoSyWxi);
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        }
    }

    @Override // we.h
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f27894d);
        t.e(sSLContext, OgqfiHA.qHt);
        return sSLContext;
    }
}
