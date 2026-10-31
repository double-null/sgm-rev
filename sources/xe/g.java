package xe;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import me.y;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f28592a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j.a f28593b = new a();

    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements j.a {
        a() {
        }

        @Override // xe.j.a
        public k create(SSLSocket sslSocket) {
            t.f(sslSocket, "sslSocket");
            return new g();
        }

        @Override // xe.j.a
        public boolean matchesSocket(SSLSocket sslSocket) {
            t.f(sslSocket, "sslSocket");
            return we.c.f27874e.b() && (sslSocket instanceof BCSSLSocket);
        }
    }

    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final j.a a() {
            return g.f28593b;
        }
    }

    @Override // xe.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = we.h.f27895a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // xe.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : t.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // xe.k
    public boolean isSupported() {
        return we.c.f27874e.b();
    }

    @Override // xe.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }
}
