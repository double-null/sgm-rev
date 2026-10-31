package we;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.y;

/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f27881i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f27882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f27883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f27884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f27885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f27886h;

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f27887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27889c;

        public a(List<String> protocols) {
            t.f(protocols, "protocols");
            this.f27887a = protocols;
        }

        public final String a() {
            return this.f27889c;
        }

        public final boolean b() {
            return this.f27888b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            t.f(proxy, "proxy");
            t.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (t.a(name, "supports") && t.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (t.a(name, "unsupported") && t.a(Void.TYPE, returnType)) {
                this.f27888b = true;
                return null;
            }
            if (t.a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f27887a;
                }
            }
            if ((t.a(name, "selectProtocol") || t.a(name, "select")) && t.a(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj2 = list.get(i10);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (this.f27887a.contains(str)) {
                                this.f27889c = str;
                                return str;
                            }
                            if (i10 != size) {
                                i10 = i11;
                            }
                        }
                    }
                    String str2 = this.f27887a.get(0);
                    this.f27889c = str2;
                    return str2;
                }
            }
            if ((!t.a(name, "protocolSelected") && !t.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f27889c = (String) obj3;
            return null;
        }
    }

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(k kVar) {
            this();
        }

        public final h a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                t.e(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(t.n("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> clientProviderClass = Class.forName(t.n("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> serverProviderClass = Class.forName(t.n("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                t.e(putMethod, "putMethod");
                t.e(getMethod, "getMethod");
                t.e(removeMethod, "removeMethod");
                t.e(clientProviderClass, "clientProviderClass");
                t.e(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        t.f(putMethod, "putMethod");
        t.f(getMethod, "getMethod");
        t.f(removeMethod, "removeMethod");
        t.f(clientProviderClass, "clientProviderClass");
        t.f(serverProviderClass, "serverProviderClass");
        this.f27882d = putMethod;
        this.f27883e = getMethod;
        this.f27884f = removeMethod;
        this.f27885g = clientProviderClass;
        this.f27886h = serverProviderClass;
    }

    @Override // we.h
    public void b(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        try {
            this.f27884f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // we.h
    public void e(SSLSocket sslSocket, String str, List<? extends y> protocols) {
        t.f(sslSocket, "sslSocket");
        t.f(protocols, "protocols");
        try {
            this.f27882d.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f27885g, this.f27886h}, new a(h.f27895a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // we.h
    public String h(SSLSocket sslSocket) {
        t.f(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f27883e.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
