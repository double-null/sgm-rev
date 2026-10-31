package we;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.y;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: compiled from: ConscryptPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f27878f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f27879d;

    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i10) {
                return version.major() > i10;
            }
            if (version.minor() != i11) {
                return version.minor() > i11;
            }
            return version.patch() >= i12;
        }

        public final d b() {
            k kVar = null;
            if (c()) {
                return new d(kVar);
            }
            return null;
        }

        public final boolean c() {
            return d.f27878f;
        }
    }

    /* JADX INFO: compiled from: ConscryptPlatform.kt */
    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27880a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f27877e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f27878f = z10;
    }

    public /* synthetic */ d(k kVar) {
        this();
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = h.f27895a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.h(sslSocket);
    }

    @Override // we.h
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f27879d);
        t.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // we.h
    public SSLSocketFactory o(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        t.f(trustManager, "trustManager");
        SSLContext sSLContextN = n();
        sSLContextN.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
        t.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // we.h
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
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f27880a);
        return x509TrustManager;
    }

    private d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        t.e(providerNewProvider, "newProvider()");
        this.f27879d = providerNewProvider;
    }
}
