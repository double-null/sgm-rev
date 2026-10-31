package xe;

import java.util.List;
import javax.net.ssl.SSLSocket;
import me.y;

/* JADX INFO: compiled from: SocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface k {
    void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends y> list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);
}
