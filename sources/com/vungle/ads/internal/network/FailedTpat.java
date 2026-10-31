package com.vungle.ads.internal.network;

import fe.d;
import fe.l;
import he.f;
import java.util.Map;
import je.b2;
import je.q2;
import je.v2;
import je.z0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class FailedTpat {
    public static final Companion Companion = new Companion(null);
    private final String body;
    private final Map<String, String> headers;
    private final HttpMethod method;
    private int retryAttempt;
    private int retryCount;
    private String tpatKey;

    /* JADX INFO: compiled from: TpatSender.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<FailedTpat> serializer() {
            return FailedTpat$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FailedTpat(int i10, HttpMethod httpMethod, Map map, String str, int i11, int i12, String str2, q2 q2Var) {
        if (16 != (i10 & 16)) {
            b2.a(i10, 16, FailedTpat$$serializer.INSTANCE.getDescriptor());
        }
        this.method = (i10 & 1) == 0 ? HttpMethod.GET : httpMethod;
        if ((i10 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i10 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i10 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i11;
        }
        this.retryCount = i12;
        if ((i10 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedTpat copy$default(FailedTpat failedTpat, HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            httpMethod = failedTpat.method;
        }
        if ((i12 & 2) != 0) {
            map = failedTpat.headers;
        }
        Map map2 = map;
        if ((i12 & 4) != 0) {
            str = failedTpat.body;
        }
        String str3 = str;
        if ((i12 & 8) != 0) {
            i10 = failedTpat.retryAttempt;
        }
        int i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = failedTpat.retryCount;
        }
        int i14 = i11;
        if ((i12 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        return failedTpat.copy(httpMethod, map2, str3, i13, i14, str2);
    }

    public static final void write$Self(FailedTpat self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.method != HttpMethod.GET) {
            output.E(serialDesc, 0, HttpMethod$$serializer.INSTANCE, self.method);
        }
        if (output.w(serialDesc, 1) || self.headers != null) {
            v2 v2Var = v2.f21024a;
            output.o(serialDesc, 1, new z0(v2Var, v2Var), self.headers);
        }
        if (output.w(serialDesc, 2) || self.body != null) {
            output.o(serialDesc, 2, v2.f21024a, self.body);
        }
        if (output.w(serialDesc, 3) || self.retryAttempt != 0) {
            output.h(serialDesc, 3, self.retryAttempt);
        }
        output.h(serialDesc, 4, self.retryCount);
        if (output.w(serialDesc, 5) || self.tpatKey != null) {
            output.o(serialDesc, 5, v2.f21024a, self.tpatKey);
        }
    }

    public final HttpMethod component1() {
        return this.method;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final String component3() {
        return this.body;
    }

    public final int component4() {
        return this.retryAttempt;
    }

    public final int component5() {
        return this.retryCount;
    }

    public final String component6() {
        return this.tpatKey;
    }

    public final FailedTpat copy(HttpMethod method, Map<String, String> map, String str, int i10, int i11, String str2) {
        t.f(method, "method");
        return new FailedTpat(method, map, str, i10, i11, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedTpat)) {
            return false;
        }
        FailedTpat failedTpat = (FailedTpat) obj;
        return this.method == failedTpat.method && t.a(this.headers, failedTpat.headers) && t.a(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && t.a(this.tpatKey, failedTpat.tpatKey);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.retryAttempt)) * 31) + Integer.hashCode(this.retryCount)) * 31;
        String str2 = this.tpatKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRetryAttempt(int i10) {
        this.retryAttempt = i10;
    }

    public final void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public final void setTpatKey(String str) {
        this.tpatKey = str;
    }

    public String toString() {
        return "FailedTpat(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", retryAttempt=" + this.retryAttempt + ", retryCount=" + this.retryCount + ", tpatKey=" + this.tpatKey + ')';
    }

    public FailedTpat(HttpMethod method, Map<String, String> map, String str, int i10, int i11, String str2) {
        t.f(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i10;
        this.retryCount = i11;
        this.tpatKey = str2;
    }

    public /* synthetic */ FailedTpat(HttpMethod httpMethod, Map map, String str, int i10, int i11, String str2, int i12, k kVar) {
        this((i12 & 1) != 0 ? HttpMethod.GET : httpMethod, (i12 & 2) != 0 ? null : map, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? 0 : i10, i11, (i12 & 32) != 0 ? null : str2);
    }
}
