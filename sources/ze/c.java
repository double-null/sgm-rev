package ze;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import we.h;

/* JADX INFO: compiled from: CertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29250a = new a(null);

    /* JADX INFO: compiled from: CertificateChainCleaner.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(X509TrustManager trustManager) {
            t.f(trustManager, "trustManager");
            return h.f27895a.g().c(trustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
