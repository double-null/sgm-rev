package xe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;
import me.y;
import rd.c0;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public class f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j.a f28585g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? super SSLSocket> f28586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f28587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f28588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f28589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f28590e;

    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    public static final class a {

        /* JADX INFO: renamed from: xe.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
        public static final class C0482a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f28591a;

            C0482a(String str) {
                this.f28591a = str;
            }

            @Override // xe.j.a
            public k create(SSLSocket sslSocket) {
                t.f(sslSocket, "sslSocket");
                return f.f28584f.b(sslSocket.getClass());
            }

            @Override // xe.j.a
            public boolean matchesSocket(SSLSocket sslSocket) {
                t.f(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                t.e(name, "sslSocket.javaClass.name");
                return c0.O(name, t.n(this.f28591a, "."), false, 2, null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !t.a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(t.n("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            t.c(superclass);
            return new f(superclass);
        }

        public final j.a c(String packageName) {
            t.f(packageName, "packageName");
            return new C0482a(packageName);
        }

        public final j.a d() {
            return f.f28585g;
        }
    }

    static {
        a aVar = new a(null);
        f28584f = aVar;
        f28585g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        t.f(sslSocketClass, "sslSocketClass");
        this.f28586a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        t.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f28587b = declaredMethod;
        this.f28588c = sslSocketClass.getMethod("setHostname", String.class);
        this.f28589d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f28590e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // xe.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.f28587b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f28588c.invoke(sslSocket, str);
                }
                this.f28590e.invoke(sslSocket, we.h.f27895a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // xe.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f28589d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, rd.d.f24999b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && t.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // xe.k
    public boolean isSupported() {
        return we.b.f27868f.b();
    }

    @Override // xe.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        return this.f28586a.isInstance(sslSocket);
    }
}
