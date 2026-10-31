package com.vungle.ads.fpd;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import je.u0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class Demographic {
    public static final Companion Companion = new Companion(null);
    private Integer ageRange;
    private Integer gender;

    /* JADX INFO: compiled from: Demographic.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<Demographic> serializer() {
            return Demographic$$serializer.INSTANCE;
        }
    }

    public Demographic() {
    }

    public static final void write$Self(Demographic self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        if (output.w(serialDesc, 0) || self.ageRange != null) {
            output.o(serialDesc, 0, u0.f21014a, self.ageRange);
        }
        if (output.w(serialDesc, 1) || self.gender != null) {
            output.o(serialDesc, 1, u0.f21014a, self.gender);
        }
    }

    public final Demographic setAgeRange(int i10) {
        this.ageRange = Integer.valueOf(AgeRange.Companion.fromAge$vungle_ads_release(i10).getId());
        return this;
    }

    public final Demographic setGender(LiftoffGender gender) {
        t.f(gender, "gender");
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }

    public /* synthetic */ Demographic(int i10, Integer num, Integer num2, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, Demographic$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i10 & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getGender$annotations() {
    }

    public final Demographic setLengthOfResidence(int i10) {
        return this;
    }

    public final Demographic setMedianHomeValueUSD(int i10) {
        return this;
    }

    public final Demographic setMonthlyHousingCosts(int i10) {
        return this;
    }
}
