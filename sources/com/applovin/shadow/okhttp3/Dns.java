package com.applovin.shadow.okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.o;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* JADX INFO: compiled from: Dns.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: Dns.kt */
        private static final class DnsSystem implements Dns {
            @Override // com.applovin.shadow.okhttp3.Dns
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                t.f(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    t.e(allByName, "getAllByName(hostname)");
                    return o.W(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
