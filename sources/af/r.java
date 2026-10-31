package af;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f387a = Logger.getLogger("okio.Okio");

    public static final a0 b(File file) throws FileNotFoundException {
        kotlin.jvm.internal.t.f(file, "<this>");
        return q.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        kotlin.jvm.internal.t.f(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? rd.f0.U(message, "getsockname failed", false, 2, null) : false;
    }

    public static final a0 d(File file, boolean z10) throws FileNotFoundException {
        kotlin.jvm.internal.t.f(file, "<this>");
        return q.g(new FileOutputStream(file, z10));
    }

    public static final a0 e(OutputStream outputStream) {
        kotlin.jvm.internal.t.f(outputStream, "<this>");
        return new u(outputStream, new d0());
    }

    public static final a0 f(Socket socket) throws IOException {
        kotlin.jvm.internal.t.f(socket, "<this>");
        b0 b0Var = new b0(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.t.e(outputStream, "getOutputStream()");
        return b0Var.z(new u(outputStream, b0Var));
    }

    public static /* synthetic */ a0 g(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return q.f(file, z10);
    }

    public static final c0 h(File file) throws FileNotFoundException {
        kotlin.jvm.internal.t.f(file, "<this>");
        return new p(new FileInputStream(file), d0.f348e);
    }

    public static final c0 i(InputStream inputStream) {
        kotlin.jvm.internal.t.f(inputStream, "<this>");
        return new p(inputStream, new d0());
    }

    public static final c0 j(Socket socket) throws IOException {
        kotlin.jvm.internal.t.f(socket, "<this>");
        b0 b0Var = new b0(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.t.e(inputStream, "getInputStream()");
        return b0Var.A(new p(inputStream, b0Var));
    }
}
