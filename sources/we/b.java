package we;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.t;
import me.y;
import xe.i;
import xe.j;
import xe.k;
import xe.l;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f27868f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f27869g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<k> f27870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xe.h f27871e;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f27869g;
        }
    }

    /* JADX INFO: renamed from: we.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class C0463b implements ze.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f27872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f27873b;

        public C0463b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            t.f(trustManager, "trustManager");
            t.f(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f27872a = trustManager;
            this.f27873b = findByIssuerAndSignatureMethod;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0463b)) {
                return false;
            }
            C0463b c0463b = (C0463b) obj;
            return t.a(this.f27872a, c0463b.f27872a) && t.a(this.f27873b, c0463b.f27873b);
        }

        @Override // ze.e
        public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
            t.f(cert, "cert");
            try {
                Object objInvoke = this.f27873b.invoke(this.f27872a, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.f27872a.hashCode() * 31) + this.f27873b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f27872a + ", findByIssuerAndSignatureMethod=" + this.f27873b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.f27895a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f27869g = z10;
    }

    public b() {
        List listO = kotlin.collections.t.o(l.a.b(l.f28602j, null, 1, null), new j(xe.f.f28584f.d()), new j(i.f28598a.a()), new j(xe.g.f28592a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((k) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f27870d = arrayList;
        this.f27871e = xe.h.f28594d.a();
    }

    @Override // we.h
    public ze.c c(X509TrustManager trustManager) {
        t.f(trustManager, "trustManager");
        xe.b bVarA = xe.b.f28577d.a(trustManager);
        return bVarA == null ? super.c(trustManager) : bVarA;
    }

    @Override // we.h
    public ze.e d(X509TrustManager trustManager) {
        t.f(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            t.e(method, "method");
            return new C0463b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<y> protocols) {
        Object next;
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        Iterator<T> it = this.f27870d.iterator();
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
    public void f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        t.f(socket, "socket");
        t.f(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        Object next;
        t.f(sslSocket, "sslSocket");
        Iterator<T> it = this.f27870d.iterator();
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
    public Object i(String closer) {
        t.f(closer, "closer");
        return this.f27871e.a(closer);
    }

    @Override // we.h
    public boolean j(String hostname) {
        t.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // we.h
    public void m(String message, Object obj) {
        t.f(message, "message");
        if (this.f27871e.b(obj)) {
            return;
        }
        h.l(this, message, 5, null, 4, null);
    }
}
