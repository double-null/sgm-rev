package com.vungle.ads.fpd;

import kotlin.jvm.internal.k;
import od.h;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum AgeRange {
    AGE_18_20(1, new h(18, 20)),
    AGE_21_30(2, new h(21, 30)),
    AGE_31_40(3, new h(31, 40)),
    AGE_41_50(4, new h(41, 50)),
    AGE_51_60(5, new h(51, 60)),
    AGE_61_70(6, new h(61, 70)),
    AGE_71_75(7, new h(71, 75)),
    OTHERS(0, new h(Integer.MIN_VALUE, Integer.MAX_VALUE));

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f13035id;
    private final h range;

    /* JADX INFO: compiled from: Demographic.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0027  */
        /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
        public final AgeRange fromAge$vungle_ads_release(int i10) {
            for (AgeRange ageRange : AgeRange.values()) {
                h range = ageRange.getRange();
                if (i10 <= range.c() && range.a() <= i10) {
                    if (ageRange == null) {
                        return AgeRange.OTHERS;
                    }
                    return ageRange;
                }
            }
            ageRange = null;
            if (ageRange == null) {
                return AgeRange.OTHERS;
            }
            return ageRange;
        }
    }

    AgeRange(int i10, h hVar) {
        this.f13035id = i10;
        this.range = hVar;
    }

    public final int getId() {
        return this.f13035id;
    }

    public final h getRange() {
        return this.range;
    }
}
