package com.vungle.ads.internal.model;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import je.v2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class RtbRequest {
    public static final Companion Companion = new Companion(null);
    private final String sdkUserAgent;

    /* JADX INFO: compiled from: RtbToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<RtbRequest> serializer() {
            return RtbRequest$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RtbRequest() {
        this((String) null, 1, (k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RtbRequest copy$default(RtbRequest rtbRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rtbRequest.sdkUserAgent;
        }
        return rtbRequest.copy(str);
    }

    public static final void write$Self(RtbRequest self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.w(serialDesc, 0) && self.sdkUserAgent == null) {
            z10 = false;
        }
        if (z10) {
            output.o(serialDesc, 0, v2.f21024a, self.sdkUserAgent);
        }
    }

    public final String component1() {
        return this.sdkUserAgent;
    }

    public final RtbRequest copy(String str) {
        return new RtbRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RtbRequest) && t.a(this.sdkUserAgent, ((RtbRequest) obj).sdkUserAgent);
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "RtbRequest(sdkUserAgent=" + this.sdkUserAgent + ')';
    }

    public /* synthetic */ RtbRequest(int i10, String str, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, RtbRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public RtbRequest(String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ RtbRequest(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
