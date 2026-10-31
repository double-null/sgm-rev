package me;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f22272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketFactory f22273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f22274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f22275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f22276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f22277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f22278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f22279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f22280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<y> f22281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<l> f22282k;

    public a(String uriHost, int i10, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b proxyAuthenticator, Proxy proxy, List<? extends y> protocols, List<l> connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.t.f(uriHost, "uriHost");
        kotlin.jvm.internal.t.f(dns, "dns");
        kotlin.jvm.internal.t.f(socketFactory, "socketFactory");
        kotlin.jvm.internal.t.f(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.t.f(protocols, "protocols");
        kotlin.jvm.internal.t.f(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.t.f(proxySelector, "proxySelector");
        this.f22272a = dns;
        this.f22273b = socketFactory;
        this.f22274c = sSLSocketFactory;
        this.f22275d = hostnameVerifier;
        this.f22276e = gVar;
        this.f22277f = proxyAuthenticator;
        this.f22278g = proxy;
        this.f22279h = proxySelector;
        this.f22280i = new u.a().v(sSLSocketFactory != null ? "https" : "http").l(uriHost).r(i10).a();
        this.f22281j = ne.d.T(protocols);
        this.f22282k = ne.d.T(connectionSpecs);
    }

    public final g a() {
        return this.f22276e;
    }

    public final List<l> b() {
        return this.f22282k;
    }

    public final q c() {
        return this.f22272a;
    }

    public final boolean d(a that) {
        kotlin.jvm.internal.t.f(that, "that");
        return kotlin.jvm.internal.t.a(this.f22272a, that.f22272a) && kotlin.jvm.internal.t.a(this.f22277f, that.f22277f) && kotlin.jvm.internal.t.a(this.f22281j, that.f22281j) && kotlin.jvm.internal.t.a(this.f22282k, that.f22282k) && kotlin.jvm.internal.t.a(this.f22279h, that.f22279h) && kotlin.jvm.internal.t.a(this.f22278g, that.f22278g) && kotlin.jvm.internal.t.a(this.f22274c, that.f22274c) && kotlin.jvm.internal.t.a(this.f22275d, that.f22275d) && kotlin.jvm.internal.t.a(this.f22276e, that.f22276e) && this.f22280i.l() == that.f22280i.l();
    }

    public final HostnameVerifier e() {
        return this.f22275d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.t.a(this.f22280i, aVar.f22280i) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<y> f() {
        return this.f22281j;
    }

    public final Proxy g() {
        return this.f22278g;
    }

    public final b h() {
        return this.f22277f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f22280i.hashCode()) * 31) + this.f22272a.hashCode()) * 31) + this.f22277f.hashCode()) * 31) + this.f22281j.hashCode()) * 31) + this.f22282k.hashCode()) * 31) + this.f22279h.hashCode()) * 31) + Objects.hashCode(this.f22278g)) * 31) + Objects.hashCode(this.f22274c)) * 31) + Objects.hashCode(this.f22275d)) * 31) + Objects.hashCode(this.f22276e);
    }

    public final ProxySelector i() {
        return this.f22279h;
    }

    public final SocketFactory j() {
        return this.f22273b;
    }

    public final SSLSocketFactory k() {
        return this.f22274c;
    }

    public final u l() {
        return this.f22280i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f22280i.h());
        sb2.append(':');
        sb2.append(this.f22280i.l());
        sb2.append(", ");
        Proxy proxy = this.f22278g;
        sb2.append(proxy != null ? kotlin.jvm.internal.t.n("proxy=", proxy) : kotlin.jvm.internal.t.n("proxySelector=", this.f22279h));
        sb2.append('}');
        return sb2.toString();
    }
}
