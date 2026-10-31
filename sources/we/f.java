package we;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.y;
import rd.b0;

/* JADX INFO: compiled from: Jdk9Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27890d = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f27891e;

    /* JADX INFO: compiled from: Jdk9Platform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final f a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f27891e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("java.specification.version");
        Integer numP = property != null ? b0.p(property) : null;
        boolean z10 = true;
        if (numP == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z10 = false;
            }
        } else if (numP.intValue() < 9) {
            z10 = false;
        }
        f27891e = z10;
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = h.f27895a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : t.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
