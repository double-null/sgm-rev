package me;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22522a = a.f22524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f22523b = new a.C0371a();

    /* JADX INFO: compiled from: Dns.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f22524a = new a();

        /* JADX INFO: renamed from: me.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dns.kt */
        private static final class C0371a implements q {
            @Override // me.q
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                kotlin.jvm.internal.t.f(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.t.e(allByName, "getAllByName(hostname)");
                    return kotlin.collections.o.W(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(kotlin.jvm.internal.t.n("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
