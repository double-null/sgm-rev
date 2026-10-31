package com.vungle.ads.fpd;

import com.vungle.ads.internal.util.RangeUtil;
import fe.d;
import fe.l;
import he.f;
import java.util.List;
import je.b2;
import je.i;
import je.k0;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Revenue.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class Revenue {
    public static final Companion Companion = new Companion(null);
    private Float iaaRevenueUSD;
    private Float iapRevenueUSD;
    private Boolean isUserAPurchaser;
    private Float totalRevenueUSD;

    /* JADX INFO: compiled from: Revenue.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<Revenue> serializer() {
            return Revenue$$serializer.INSTANCE;
        }
    }

    public Revenue() {
    }

    public static final void write$Self(Revenue self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.iaaRevenueUSD != null) {
            output.o(serialDesc, 0, k0.f20952a, self.iaaRevenueUSD);
        }
        if (output.w(serialDesc, 1) || self.iapRevenueUSD != null) {
            output.o(serialDesc, 1, k0.f20952a, self.iapRevenueUSD);
        }
        if (output.w(serialDesc, 2) || self.totalRevenueUSD != null) {
            output.o(serialDesc, 2, k0.f20952a, self.totalRevenueUSD);
        }
        if (output.w(serialDesc, 3) || self.isUserAPurchaser != null) {
            output.o(serialDesc, 3, i.f20933a, self.isUserAPurchaser);
        }
    }

    public final Revenue setIAARevenueUSD(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.iaaRevenueUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setIAPRevenueUSD(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.iapRevenueUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final Revenue setIsUserAPurchaser(boolean z10) {
        this.isUserAPurchaser = Boolean.valueOf(z10);
        return this;
    }

    public final Revenue setTotalRevenueUSD(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalRevenueUSD = Float.valueOf(f10);
        }
        return this;
    }

    public /* synthetic */ Revenue(int i10, Float f10, Float f11, Float f12, Boolean bool, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, Revenue$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.iaaRevenueUSD = null;
        } else {
            this.iaaRevenueUSD = f10;
        }
        if ((i10 & 2) == 0) {
            this.iapRevenueUSD = null;
        } else {
            this.iapRevenueUSD = f11;
        }
        if ((i10 & 4) == 0) {
            this.totalRevenueUSD = null;
        } else {
            this.totalRevenueUSD = f12;
        }
        if ((i10 & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
    }

    private static /* synthetic */ void getIaaRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getIapRevenueUSD$annotations() {
    }

    private static /* synthetic */ void getTotalRevenueUSD$annotations() {
    }

    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    public final Revenue setEarningsByPlacement(float f10) {
        return this;
    }

    public final Revenue setIsUserASubscriber(boolean z10) {
        return this;
    }

    public final Revenue setLast30DaysMeanSpendUsd(float f10) {
        return this;
    }

    public final Revenue setLast30DaysMedianSpendUsd(float f10) {
        return this;
    }

    public final Revenue setLast30DaysPlacementFillRate(float f10) {
        return this;
    }

    public final Revenue setLast30DaysTotalSpendUsd(float f10) {
        return this;
    }

    public final Revenue setLast30DaysUserLtvUsd(float f10) {
        return this;
    }

    public final Revenue setLast30DaysUserPltvUsd(float f10) {
        return this;
    }

    public final Revenue setLast7DaysMeanSpendUsd(float f10) {
        return this;
    }

    public final Revenue setLast7DaysMedianSpendUsd(float f10) {
        return this;
    }

    public final Revenue setLast7DaysPlacementFillRate(float f10) {
        return this;
    }

    public final Revenue setLast7DaysTotalSpendUsd(float f10) {
        return this;
    }

    public final Revenue setLast7DaysUserLtvUsd(float f10) {
        return this;
    }

    public final Revenue setLast7DaysUserPltvUsd(float f10) {
        return this;
    }

    public final Revenue setTopNAdomain(List<String> list) {
        return this;
    }

    public final Revenue setTotalEarningsUsd(float f10) {
        return this;
    }
}
