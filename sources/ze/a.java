package ze;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0499a f29247c = new C0499a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f29248b;

    /* JADX INFO: renamed from: ze.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
    public static final class C0499a {
        private C0499a() {
        }

        public /* synthetic */ C0499a(k kVar) {
            this();
        }
    }

    public a(e trustRootIndex) {
        t.f(trustRootIndex, "trustRootIndex");
        this.f29248b = trustRootIndex;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!t.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // ze.c
    public List<Certificate> a(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        t.f(chain, "chain");
        t.f(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        t.e(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < 9) {
            i10++;
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f29248b.findByIssuerAndSignature(x509Certificate2);
            if (x509CertificateFindByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !t.a(x509Certificate2, x509CertificateFindByIssuerAndSignature)) {
                    arrayList.add(x509CertificateFindByIssuerAndSignature);
                }
                if (b(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                t.e(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z10) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException(t.n("Failed to find a trusted cert that signed ", x509Certificate2));
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    x509Certificate = (X509Certificate) next;
                } while (!b(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException(t.n("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && t.a(((a) obj).f29248b, this.f29248b);
    }

    public int hashCode() {
        return this.f29248b.hashCode();
    }
}
