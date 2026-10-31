package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1042Lh {
    public static final C1042Lh A02 = new C1042Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1042Lh)) {
            return false;
        }
        C1042Lh c1042Lh = (C1042Lh) obj;
        return this.A00 == c1042Lh.A00 && this.A01 == c1042Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
