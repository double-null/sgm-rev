package we;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: compiled from: BouncyCastlePlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f27875f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27876d;

    /* JADX INFO: compiled from: BouncyCastlePlatform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a() {
            k kVar = null;
            if (b()) {
                return new c(kVar);
            }
            return null;
        }

        public final boolean b() {
            return c.f27875f;
        }
    }

    static {
        a aVar = new a(null);
        f27874e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f27875f = z10;
    }

    public /* synthetic */ c(k kVar) {
        this();
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        Object[] array = h.f27895a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        if (!(sslSocket instanceof BCSSLSocket)) {
            return super.h(sslSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : t.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // we.h
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f27876d);
        t.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // we.h
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    private c() {
        this.f27876d = new BouncyCastleJsseProvider();
    }
}
