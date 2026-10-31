package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07007m {
    public static final C07007m A03;
    public final String A00;
    public final C06997l A01;
    public final Object A02;

    static {
        C07007m c07007m;
        if (AbstractC06104a.A02 < 31) {
            c07007m = new C07007m("");
        } else {
            c07007m = new C07007m(C06997l.A01, "");
        }
        A03 = c07007m;
    }

    public C07007m(C06997l c06997l, String str) {
        this.A01 = c06997l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C07007m(String str) {
        C3M.A08(AbstractC06104a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C06997l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07007m)) {
            return false;
        }
        C07007m c07007m = (C07007m) obj;
        if (Objects.equals(this.A00, c07007m.A00) && Objects.equals(this.A01, c07007m.A01) && Objects.equals(this.A02, c07007m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
