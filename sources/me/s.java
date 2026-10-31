package me;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22527e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f22528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f22529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f22530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.k f22531d;

    /* JADX INFO: compiled from: Handshake.kt */
    public static final class a {

        /* JADX INFO: renamed from: me.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Handshake.kt */
        static final class C0372a extends kotlin.jvm.internal.u implements id.a<List<? extends Certificate>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f22532d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0372a(List<? extends Certificate> list) {
                super(0);
                this.f22532d = list;
            }

            @Override // id.a
            public final List<? extends Certificate> invoke() {
                return this.f22532d;
            }
        }

        /* JADX INFO: compiled from: Handshake.kt */
        static final class b extends kotlin.jvm.internal.u implements id.a<List<? extends Certificate>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f22533d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(List<? extends Certificate> list) {
                super(0);
                this.f22533d = list;
            }

            @Override // id.a
            public final List<? extends Certificate> invoke() {
                return this.f22533d;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            return certificateArr != null ? ne.d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : kotlin.collections.t.k();
        }

        public final s a(SSLSession sSLSession) throws IOException {
            List<Certificate> listK;
            kotlin.jvm.internal.t.f(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (kotlin.jvm.internal.t.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.t.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(kotlin.jvm.internal.t.n("cipherSuite == ", cipherSuite));
            }
            i iVarB = i.f22412b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.t.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            e0 e0VarA = e0.f22389b.a(protocol);
            try {
                listK = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = kotlin.collections.t.k();
            }
            return new s(e0VarA, iVarB, c(sSLSession.getLocalCertificates()), new b(listK));
        }

        public final s b(e0 tlsVersion, i cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            kotlin.jvm.internal.t.f(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.t.f(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.t.f(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.t.f(localCertificates, "localCertificates");
            return new s(tlsVersion, cipherSuite, ne.d.T(localCertificates), new C0372a(ne.d.T(peerCertificates)));
        }
    }

    /* JADX INFO: compiled from: Handshake.kt */
    static final class b extends kotlin.jvm.internal.u implements id.a<List<? extends Certificate>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a<List<Certificate>> f22534d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(id.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f22534d = aVar;
        }

        @Override // id.a
        public final List<? extends Certificate> invoke() {
            try {
                return this.f22534d.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return kotlin.collections.t.k();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(e0 tlsVersion, i cipherSuite, List<? extends Certificate> localCertificates, id.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        kotlin.jvm.internal.t.f(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.t.f(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.t.f(localCertificates, "localCertificates");
        kotlin.jvm.internal.t.f(peerCertificatesFn, "peerCertificatesFn");
        this.f22528a = tlsVersion;
        this.f22529b = cipherSuite;
        this.f22530c = localCertificates;
        this.f22531d = wc.m.a(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.t.e(type, "type");
        return type;
    }

    public final i a() {
        return this.f22529b;
    }

    public final List<Certificate> c() {
        return this.f22530c;
    }

    public final List<Certificate> d() {
        return (List) this.f22531d.getValue();
    }

    public final e0 e() {
        return this.f22528a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f22528a == this.f22528a && kotlin.jvm.internal.t.a(sVar.f22529b, this.f22529b) && kotlin.jvm.internal.t.a(sVar.d(), d()) && kotlin.jvm.internal.t.a(sVar.f22530c, this.f22530c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f22528a.hashCode()) * 31) + this.f22529b.hashCode()) * 31) + d().hashCode()) * 31) + this.f22530c.hashCode();
    }

    public String toString() {
        List<Certificate> listD = d();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f22528a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f22529b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f22530c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
