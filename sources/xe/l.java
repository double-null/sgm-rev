package xe;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.t;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f28602j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<? super SSLSocketFactory> f28603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class<?> f28604i;

    /* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String packageName) {
            t.f(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(t.n(packageName, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(t.n(packageName, zKUlck.VeReWXiSd));
                Class<?> paramsClass = Class.forName(t.n(packageName, ".SSLParametersImpl"));
                t.e(paramsClass, "paramsClass");
                return new l(cls, cls2, paramsClass);
            } catch (Exception e10) {
                we.h.f27895a.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        t.f(sslSocketClass, "sslSocketClass");
        t.f(sslSocketFactoryClass, "sslSocketFactoryClass");
        t.f(paramClass, "paramClass");
        this.f28603h = sslSocketFactoryClass;
        this.f28604i = paramClass;
    }
}
