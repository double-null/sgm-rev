package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final k peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    /* JADX INFO: renamed from: com.applovin.shadow.okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    /* JADX INFO: compiled from: Handshake.kt */
    static final class AnonymousClass2 extends u implements id.a<List<? extends Certificate>> {
        final /* synthetic */ id.a<List<Certificate>> $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(id.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.$peerCertificatesFn = aVar;
        }

        @Override // id.a
        public final List<? extends Certificate> invoke() {
            try {
                return this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return t.k();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> localCertificates, id.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        kotlin.jvm.internal.t.f(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.t.f(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.t.f(localCertificates, "localCertificates");
        kotlin.jvm.internal.t.f(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates$delegate = m.a(new AnonymousClass2(peerCertificatesFn));
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.t.e(type, "type");
        return type;
    }

    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m45deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m46deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m47deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m48deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m49deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m50deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && kotlin.jvm.internal.t.a(handshake.cipherSuite, this.cipherSuite) && kotlin.jvm.internal.t.a(handshake.peerCertificates(), peerCertificates()) && kotlin.jvm.internal.t.a(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object objP = b0.P(this.localCertificates);
        X509Certificate x509Certificate = objP instanceof X509Certificate ? (X509Certificate) objP : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object objP = b0.P(peerCertificates());
        X509Certificate x509Certificate = objP instanceof X509Certificate ? (X509Certificate) objP : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.u.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    /* JADX INFO: compiled from: Handshake.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : t.k();
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m51deprecated_get(SSLSession sslSession) throws IOException {
            kotlin.jvm.internal.t.f(sslSession, "sslSession");
            return get(sslSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> listK;
            kotlin.jvm.internal.t.f(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (kotlin.jvm.internal.t.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.t.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.t.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                listK = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = t.k();
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(listK));
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            kotlin.jvm.internal.t.f(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.t.f(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.t.f(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.t.f(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Handshake$Companion$get$1(Util.toImmutableList(peerCertificates)));
        }
    }
}
