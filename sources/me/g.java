package me;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.m0;
import rd.f0;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22397c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f22398d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<c> f22399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ze.c f22400b;

    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f22401a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final g a() {
            return new g(kotlin.collections.b0.t0(this.f22401a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String a(Certificate certificate) {
            kotlin.jvm.internal.t.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return kotlin.jvm.internal.t.n("sha256/", c((X509Certificate) certificate).b());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final af.h b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.t.f(x509Certificate, "<this>");
            af.h.a aVar = af.h.f361d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.t.e(encoded, "publicKey.encoded");
            return af.h.a.f(aVar, encoded, 0, 0, 3, null).C();
        }

        public final af.h c(X509Certificate x509Certificate) {
            kotlin.jvm.internal.t.f(x509Certificate, RHIpdOnfgiYkEj.MzmKqOnsvK);
            af.h.a aVar = af.h.f361d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.t.e(encoded, "publicKey.encoded");
            return af.h.a.f(aVar, encoded, 0, 0, 3, null).D();
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final af.h f22404c;

        public final af.h a() {
            return this.f22404c;
        }

        public final String b() {
            return this.f22403b;
        }

        public final boolean c(String hostname) {
            kotlin.jvm.internal.t.f(hostname, "hostname");
            if (rd.c0.O(this.f22402a, "**.", false, 2, null)) {
                int length = this.f22402a.length() - 3;
                int length2 = hostname.length() - length;
                if (!rd.c0.F(hostname, hostname.length() - length, this.f22402a, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!rd.c0.O(this.f22402a, "*.", false, 2, null)) {
                    return kotlin.jvm.internal.t.a(hostname, this.f22402a);
                }
                int length3 = this.f22402a.length() - 1;
                int length4 = hostname.length() - length3;
                if (!rd.c0.F(hostname, hostname.length() - length3, this.f22402a, 1, length3, false, 16, null) || f0.n0(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.t.a(this.f22402a, cVar.f22402a) && kotlin.jvm.internal.t.a(this.f22403b, cVar.f22403b) && kotlin.jvm.internal.t.a(this.f22404c, cVar.f22404c);
        }

        public int hashCode() {
            return (((this.f22402a.hashCode() * 31) + this.f22403b.hashCode()) * 31) + this.f22404c.hashCode();
        }

        public String toString() {
            return this.f22403b + '/' + this.f22404c.b();
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    static final class d extends kotlin.jvm.internal.u implements id.a<List<? extends X509Certificate>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f22406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f22407f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f22406e = list;
            this.f22407f = str;
        }

        @Override // id.a
        public final List<? extends X509Certificate> invoke() {
            ze.c cVarD = g.this.d();
            List<Certificate> listA = cVarD == null ? null : cVarD.a(this.f22406e, this.f22407f);
            if (listA == null) {
                listA = this.f22406e;
            }
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public g(Set<c> pins, ze.c cVar) {
        kotlin.jvm.internal.t.f(pins, "pins");
        this.f22399a = pins;
        this.f22400b = cVar;
    }

    public final void b(String hostname, id.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.t.f(hostname, "hostname");
        kotlin.jvm.internal.t.f(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            af.h hVarC = null;
            af.h hVarB = null;
            for (c cVar : listC) {
                String strB = cVar.b();
                if (kotlin.jvm.internal.t.a(strB, "sha256")) {
                    if (hVarC == null) {
                        hVarC = f22397c.c(x509Certificate);
                    }
                    if (kotlin.jvm.internal.t.a(cVar.a(), hVarC)) {
                        return;
                    }
                } else {
                    if (!kotlin.jvm.internal.t.a(strB, "sha1")) {
                        throw new AssertionError(kotlin.jvm.internal.t.n("unsupported hashAlgorithm: ", cVar.b()));
                    }
                    if (hVarB == null) {
                        hVarB = f22397c.b(x509Certificate);
                    }
                    if (kotlin.jvm.internal.t.a(cVar.a(), hVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(f22397c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : listC) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List<c> c(String hostname) {
        kotlin.jvm.internal.t.f(hostname, "hostname");
        Set<c> set = this.f22399a;
        List<c> listK = kotlin.collections.t.k();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listK.isEmpty()) {
                    listK = new ArrayList<>();
                }
                m0.b(listK).add(obj);
            }
        }
        return listK;
    }

    public final ze.c d() {
        return this.f22400b;
    }

    public final g e(ze.c certificateChainCleaner) {
        kotlin.jvm.internal.t.f(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.t.a(this.f22400b, certificateChainCleaner) ? this : new g(this.f22399a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.t.a(gVar.f22399a, this.f22399a) && kotlin.jvm.internal.t.a(gVar.f22400b, this.f22400b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f22399a.hashCode()) * 41;
        ze.c cVar = this.f22400b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final void a(String hostname, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.t.f(hostname, "hostname");
        kotlin.jvm.internal.t.f(list, KBBdKxoAiHo.vehIvCXSXS);
        b(hostname, new d(list, hostname));
    }

    public /* synthetic */ g(Set set, ze.c cVar, int i10, kotlin.jvm.internal.k kVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
