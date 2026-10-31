package xe;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import me.y;

/* JADX INFO: compiled from: Android10SocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0481a f28576a = new C0481a(null);

    /* JADX INFO: renamed from: xe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Android10SocketAdapter.kt */
    public static final class C0481a {
        private C0481a() {
        }

        public /* synthetic */ C0481a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return we.h.f27895a.h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // xe.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends y> protocols) throws IOException {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = we.h.f27895a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // xe.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : t.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // xe.k
    public boolean isSupported() {
        return f28576a.b();
    }

    @Override // xe.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }
}
