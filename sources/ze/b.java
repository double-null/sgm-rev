package ze;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BasicTrustRootIndex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<X500Principal, Set<X509Certificate>> f29249a;

    public b(X509Certificate... caCerts) {
        t.f(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = caCerts[i10];
            i10++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            t.e(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f29249a = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && t.a(((b) obj).f29249a, this.f29249a));
    }

    @Override // ze.e
    public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        boolean z10;
        t.f(cert, "cert");
        Set<X509Certificate> set = this.f29249a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                cert.verify(((X509Certificate) obj2).getPublicKey());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                obj = obj2;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.f29249a.hashCode();
    }
}
