package me;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f22387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f22388c;

    public d0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.t.f(address, "address");
        kotlin.jvm.internal.t.f(proxy, "proxy");
        kotlin.jvm.internal.t.f(socketAddress, "socketAddress");
        this.f22386a = address;
        this.f22387b = proxy;
        this.f22388c = socketAddress;
    }

    public final a a() {
        return this.f22386a;
    }

    public final Proxy b() {
        return this.f22387b;
    }

    public final boolean c() {
        return this.f22386a.k() != null && this.f22387b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f22388c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (kotlin.jvm.internal.t.a(d0Var.f22386a, this.f22386a) && kotlin.jvm.internal.t.a(d0Var.f22387b, this.f22387b) && kotlin.jvm.internal.t.a(d0Var.f22388c, this.f22388c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f22386a.hashCode()) * 31) + this.f22387b.hashCode()) * 31) + this.f22388c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f22388c + '}';
    }
}
