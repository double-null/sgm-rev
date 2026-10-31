package com.applovin.shadow.okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    /* JADX INFO: compiled from: Protocol.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Protocol get(String protocol) throws IOException {
            t.f(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!t.a(protocol, protocol2.protocol)) {
                protocol2 = Protocol.HTTP_1_1;
                if (!t.a(protocol, protocol2.protocol)) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!t.a(protocol, protocol2.protocol)) {
                        protocol2 = Protocol.HTTP_2;
                        if (!t.a(protocol, protocol2.protocol)) {
                            protocol2 = Protocol.SPDY_3;
                            if (!t.a(protocol, protocol2.protocol)) {
                                protocol2 = Protocol.QUIC;
                                if (!t.a(protocol, protocol2.protocol)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
