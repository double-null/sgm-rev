package com.vungle.ads.internal.model;

import com.vungle.ads.internal.Constants;
import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import je.v2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class Placement {
    public static final Companion Companion = new Companion(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    /* JADX INFO: compiled from: ConfigPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<Placement> serializer() {
            return Placement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Placement(int i10, String str, boolean z10, String str2, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i10 & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z10;
        }
        if ((i10 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placement.referenceId;
        }
        if ((i10 & 2) != 0) {
            z10 = placement.headerBidding;
        }
        if ((i10 & 4) != 0) {
            str2 = placement.type;
        }
        return placement.copy(str, z10, str2);
    }

    public static final void write$Self(Placement self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.A(serialDesc, 0, self.referenceId);
        if (output.w(serialDesc, 1) || self.headerBidding) {
            output.j(serialDesc, 1, self.headerBidding);
        }
        if (output.w(serialDesc, 2) || self.type != null) {
            output.o(serialDesc, 2, v2.f21024a, self.type);
        }
    }

    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    public final String component3() {
        return this.type;
    }

    public final Placement copy(String referenceId, boolean z10, String str) {
        t.f(referenceId, "referenceId");
        return new Placement(referenceId, z10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) obj;
        return t.a(this.referenceId, placement.referenceId) && this.headerBidding == placement.headerBidding && t.a(this.type, placement.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z10 = this.headerBidding;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.type;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return t.a(this.type, Constants.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return t.a(this.type, "banner");
    }

    public final boolean isInline() {
        return t.a(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return t.a(this.type, Constants.PLACEMENT_TYPE_INTERSTITIAL);
    }

    public final boolean isMREC() {
        return t.a(this.type, "mrec");
    }

    public final boolean isNative() {
        return t.a(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return t.a(this.type, Constants.PLACEMENT_TYPE_REWARDED);
    }

    public final void setWakeupTime(Long l10) {
        this.wakeupTime = l10;
    }

    public final void snooze(long j10) {
        this.wakeupTime = Long.valueOf(System.currentTimeMillis() + (j10 * ((long) 1000)));
    }

    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    public Placement(String referenceId, boolean z10, String str) {
        t.f(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z10;
        this.type = str;
    }

    public /* synthetic */ Placement(String str, boolean z10, String str2, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
