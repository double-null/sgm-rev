package com.applovin.shadow.okhttp3.internal.tls;

import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Utf8;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale US = Locale.US;
        t.e(US, "US");
        String lowerCase = str.toLowerCase(US);
        t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return kotlin.collections.t.k();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && t.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return kotlin.collections.t.k();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (t.a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        t.f(certificate, "certificate");
        return b0.c0(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        t.f(host, "host");
        t.f(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            t.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        t.f(host, "host");
        t.f(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        String str3;
        String str4 = str;
        if ((str4 == null || str.length() == 0) || c0.O(str4, ".", false, 2, null) || c0.A(str4, "..", false, 2, null)) {
            return false;
        }
        if ((str2 == null || str2.length() == 0) || c0.O(str2, ".", false, 2, null) || c0.A(str2, "..", false, 2, null)) {
            return false;
        }
        if (!c0.A(str4, ".", false, 2, null)) {
            str4 = str4 + '.';
        }
        String str5 = str4;
        if (c0.A(str2, ".", false, 2, null)) {
            str3 = str2;
        } else {
            str3 = str2 + '.';
        }
        String strAsciiToLowercase = asciiToLowercase(str3);
        if (f0.U(strAsciiToLowercase, "*", false, 2, null)) {
            if (!c0.O(strAsciiToLowercase, "*.", false, 2, null) || f0.h0(strAsciiToLowercase, '*', 1, false, 4, null) != -1 || str5.length() < strAsciiToLowercase.length() || t.a("*.", strAsciiToLowercase)) {
                return false;
            }
            String strSubstring = strAsciiToLowercase.substring(1);
            t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!c0.A(str5, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str5.length() - strSubstring.length();
            return length <= 0 || f0.n0(str5, '.', length + (-1), false, 4, null) == -1;
        }
        return t.a(str5, strAsciiToLowercase);
    }
}
