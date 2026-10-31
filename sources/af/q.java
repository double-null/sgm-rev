package af;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes5.dex */
public final class q {
    public static final a0 a(File file) throws FileNotFoundException {
        return r.b(file);
    }

    public static final a0 b() {
        return s.a();
    }

    public static final f c(a0 a0Var) {
        return s.b(a0Var);
    }

    public static final g d(c0 c0Var) {
        return s.c(c0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return r.c(assertionError);
    }

    public static final a0 f(File file, boolean z10) throws FileNotFoundException {
        return r.d(file, z10);
    }

    public static final a0 g(OutputStream outputStream) {
        return r.e(outputStream);
    }

    public static final a0 h(Socket socket) throws IOException {
        return r.f(socket);
    }

    public static final c0 j(File file) throws FileNotFoundException {
        return r.h(file);
    }

    public static final c0 k(InputStream inputStream) {
        return r.i(inputStream);
    }

    public static final c0 l(Socket socket) throws IOException {
        return r.j(socket);
    }
}
