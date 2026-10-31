package xe;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import me.y;

/* JADX INFO: compiled from: DeferredSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f28600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f28601b;

    /* JADX INFO: compiled from: DeferredSocketAdapter.kt */
    public interface a {
        k create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public j(a socketAdapterFactory) {
        t.f(socketAdapterFactory, "socketAdapterFactory");
        this.f28600a = socketAdapterFactory;
    }

    private final synchronized k a(SSLSocket sSLSocket) {
        if (this.f28601b == null && this.f28600a.matchesSocket(sSLSocket)) {
            this.f28601b = this.f28600a.create(sSLSocket);
        }
        return this.f28601b;
    }

    @Override // xe.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        k kVarA = a(sslSocket);
        if (kVarA == null) {
            return;
        }
        kVarA.configureTlsExtensions(sslSocket, str, protocols);
    }

    @Override // xe.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        k kVarA = a(sslSocket);
        if (kVarA == null) {
            return null;
        }
        return kVarA.getSelectedProtocol(sslSocket);
    }

    @Override // xe.k
    public boolean isSupported() {
        return true;
    }

    @Override // xe.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return this.f28600a.matchesSocket(sslSocket);
    }
}
