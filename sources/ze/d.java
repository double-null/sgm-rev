package ze;

import af.e0;
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
/* JADX INFO: loaded from: classes5.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f29251a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        t.e(US, "US");
        String lowerCase = str.toLowerCase(US);
        t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> c(X509Certificate x509Certificate, int i10) {
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

    private final boolean d(String str) {
        return str.length() == ((int) e0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !c0.O(str, ".", false, 2, null) && !c0.A(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !c0.O(str2, ".", false, 2, null) && !c0.A(str2, "..", false, 2, null)) {
                if (!c0.A(str, ".", false, 2, null)) {
                    str = t.n(str, ".");
                }
                String str3 = str;
                if (!c0.A(str2, ".", false, 2, null)) {
                    str2 = t.n(str2, ".");
                }
                String strB = b(str2);
                if (!f0.U(strB, "*", false, 2, null)) {
                    return t.a(str3, strB);
                }
                if (!c0.O(strB, "*.", false, 2, null) || f0.h0(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || t.a("*.", strB)) {
                    return false;
                }
                String strSubstring = strB.substring(1);
                t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (!c0.A(str3, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - strSubstring.length();
                return length <= 0 || f0.n0(str3, '.', length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List<String> listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (f29251a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = ne.a.e(str);
        List<String> listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (t.a(strE, ne.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate certificate) {
        t.f(certificate, "certificate");
        return b0.c0(c(certificate, 7), c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        t.f(host, "host");
        t.f(certificate, "certificate");
        return ne.d.i(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        t.f(host, "host");
        t.f(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return e(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
