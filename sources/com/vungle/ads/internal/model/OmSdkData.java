package com.vungle.ads.internal.model;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import je.v2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: OmSdkData.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class OmSdkData {
    public static final Companion Companion = new Companion(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    /* JADX INFO: compiled from: OmSdkData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<OmSdkData> serializer() {
            return OmSdkData$$serializer.INSTANCE;
        }
    }

    public OmSdkData() {
        this((String) null, (String) null, (String) null, 7, (k) null);
    }

    public static /* synthetic */ OmSdkData copy$default(OmSdkData omSdkData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = omSdkData.params;
        }
        if ((i10 & 2) != 0) {
            str2 = omSdkData.vendorKey;
        }
        if ((i10 & 4) != 0) {
            str3 = omSdkData.vendorURL;
        }
        return omSdkData.copy(str, str2, str3);
    }

    public static final void write$Self(OmSdkData self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.params != null) {
            output.o(serialDesc, 0, v2.f21024a, self.params);
        }
        if (output.w(serialDesc, 1) || self.vendorKey != null) {
            output.o(serialDesc, 1, v2.f21024a, self.vendorKey);
        }
        if (output.w(serialDesc, 2) || self.vendorURL != null) {
            output.o(serialDesc, 2, v2.f21024a, self.vendorURL);
        }
    }

    public final String component1() {
        return this.params;
    }

    public final String component2() {
        return this.vendorKey;
    }

    public final String component3() {
        return this.vendorURL;
    }

    public final OmSdkData copy(String str, String str2, String str3) {
        return new OmSdkData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmSdkData)) {
            return false;
        }
        OmSdkData omSdkData = (OmSdkData) obj;
        return t.a(this.params, omSdkData.params) && t.a(this.vendorKey, omSdkData.vendorKey) && t.a(this.vendorURL, omSdkData.vendorURL);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        String str = this.params;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OmSdkData(params=" + this.params + ", vendorKey=" + this.vendorKey + ", vendorURL=" + this.vendorURL + ')';
    }

    public /* synthetic */ OmSdkData(int i10, String str, String str2, String str3, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, OmSdkData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i10 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i10 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public OmSdkData(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ OmSdkData(String str, String str2, String str3, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
