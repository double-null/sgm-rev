package re;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import me.l;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l> f25077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25080d;

    public b(List<l> connectionSpecs) {
        t.f(connectionSpecs, "connectionSpecs");
        this.f25077a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int i10 = this.f25078b;
        int size = this.f25077a.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.f25077a.get(i10).e(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws IOException {
        l lVar;
        t.f(sslSocket, "sslSocket");
        int i10 = this.f25078b;
        int size = this.f25077a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            int i11 = i10 + 1;
            lVar = this.f25077a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f25078b = i11;
                break;
            }
            i10 = i11;
        }
        if (lVar != null) {
            this.f25079c = c(sslSocket);
            lVar.c(sslSocket, this.f25080d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f25080d);
        sb2.append(", modes=");
        sb2.append(this.f25077a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        t.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        t.e(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException e10) {
        t.f(e10, "e");
        this.f25080d = true;
        return (!this.f25079c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException) || ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
