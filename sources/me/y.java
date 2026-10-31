package me;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import java.io.IOException;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3(sRGQSqxgxlS.XkHUrHpXRy),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22618b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22626a;

    /* JADX INFO: compiled from: Protocol.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final y a(String protocol) throws IOException {
            kotlin.jvm.internal.t.f(protocol, "protocol");
            y yVar = y.HTTP_1_0;
            if (!kotlin.jvm.internal.t.a(protocol, yVar.f22626a)) {
                yVar = y.HTTP_1_1;
                if (!kotlin.jvm.internal.t.a(protocol, yVar.f22626a)) {
                    yVar = y.H2_PRIOR_KNOWLEDGE;
                    if (!kotlin.jvm.internal.t.a(protocol, yVar.f22626a)) {
                        yVar = y.HTTP_2;
                        if (!kotlin.jvm.internal.t.a(protocol, yVar.f22626a)) {
                            yVar = y.SPDY_3;
                            if (!kotlin.jvm.internal.t.a(protocol, yVar.f22626a)) {
                                yVar = y.QUIC;
                                if (!kotlin.jvm.internal.t.a(protocol, yVar.f22626a)) {
                                    throw new IOException(kotlin.jvm.internal.t.n("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return yVar;
        }
    }

    y(String str) {
        this.f22626a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f22626a;
    }
}
