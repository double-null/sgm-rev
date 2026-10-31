package xe;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import me.y;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f28598a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j.a f28599b = new a();

    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements j.a {
        a() {
        }

        @Override // xe.j.a
        public k create(SSLSocket sslSocket) {
            t.f(sslSocket, "sslSocket");
            return new i();
        }

        @Override // xe.j.a
        public boolean matchesSocket(SSLSocket sslSocket) {
            t.f(sslSocket, "sslSocket");
            return we.d.f27877e.c() && Conscrypt.isConscrypt(sslSocket);
        }
    }

    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final j.a a() {
            return i.f28599b;
        }
    }

    @Override // xe.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = we.h.f27895a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }

    @Override // xe.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        if (matchesSocket(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // xe.k
    public boolean isSupported() {
        return we.d.f27877e.c();
    }

    @Override // xe.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }
}
