package af;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
final class b0 extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f333o;

    public b0(Socket socket) {
        kotlin.jvm.internal.t.f(socket, "socket");
        this.f333o = socket;
    }

    @Override // af.c
    protected void B() {
        try {
            this.f333o.close();
        } catch (AssertionError e10) {
            if (!q.e(e10)) {
                throw e10;
            }
            r.f387a.log(Level.WARNING, "Failed to close timed out socket " + this.f333o, (Throwable) e10);
        } catch (Exception e11) {
            r.f387a.log(Level.WARNING, "Failed to close timed out socket " + this.f333o, (Throwable) e11);
        }
    }

    @Override // af.c
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
