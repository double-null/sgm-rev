package we;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.t;
import me.y;
import xe.i;
import xe.j;
import xe.k;

/* JADX INFO: compiled from: Android10Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0462a f27865e = new C0462a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f27866f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<k> f27867d;

    /* JADX INFO: renamed from: we.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Android10Platform.kt */
    public static final class C0462a {
        private C0462a() {
        }

        public /* synthetic */ C0462a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f27866f;
        }
    }

    static {
        f27866f = h.f27895a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listO = t.o(xe.a.f28576a.a(), new j(xe.f.f28584f.d()), new j(i.f28598a.a()), new j(xe.g.f28592a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((k) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f27867d = arrayList;
    }

    @Override // we.h
    public ze.c c(X509TrustManager trustManager) {
        kotlin.jvm.internal.t.f(trustManager, "trustManager");
        xe.b bVarA = xe.b.f28577d.a(trustManager);
        return bVarA == null ? super.c(trustManager) : bVarA;
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<? extends y> protocols) {
        Object next;
        kotlin.jvm.internal.t.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.t.f(protocols, "protocols");
        Iterator<T> it = this.f27867d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).matchesSocket(sslSocket));
        k kVar = (k) next;
        if (kVar == null) {
            return;
        }
        kVar.configureTlsExtensions(sslSocket, str, protocols);
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        Object next;
        kotlin.jvm.internal.t.f(sslSocket, "sslSocket");
        Iterator<T> it = this.f27867d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).matchesSocket(sslSocket));
        k kVar = (k) next;
        if (kVar == null) {
            return null;
        }
        return kVar.getSelectedProtocol(sslSocket);
    }

    @Override // we.h
    public boolean j(String hostname) {
        kotlin.jvm.internal.t.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
