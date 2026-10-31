package com.vungle.ads.fpd;

import com.vungle.ads.internal.util.RangeUtil;
import fe.d;
import fe.l;
import he.f;
import java.util.List;
import je.b2;
import je.k0;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SessionContext.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class SessionContext {
    public static final Companion Companion = new Companion(null);
    private Float levelPercentile;

    /* JADX INFO: compiled from: SessionContext.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<SessionContext> serializer() {
            return SessionContext$$serializer.INSTANCE;
        }
    }

    public SessionContext() {
    }

    public static final void write$Self(SessionContext self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        boolean z10 = true;
        if (!output.w(serialDesc, 0) && self.levelPercentile == null) {
            z10 = false;
        }
        if (z10) {
            output.o(serialDesc, 0, k0.f20952a, self.levelPercentile);
        }
    }

    public final SessionContext setLevelPercentile(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final SessionContext setPage(String page) {
        t.f(page, "page");
        return this;
    }

    public final SessionContext setUserID(String userID) {
        t.f(userID, "userID");
        return this;
    }

    public /* synthetic */ SessionContext(int i10, Float f10, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, SessionContext$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
    }

    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    public final SessionContext setFriends(List<String> list) {
        return this;
    }

    public final SessionContext setHealthPercentile(float f10) {
        return this;
    }

    public final SessionContext setInGamePurchasesUSD(float f10) {
        return this;
    }

    public final SessionContext setSessionDuration(int i10) {
        return this;
    }

    public final SessionContext setSessionStartTime(int i10) {
        return this;
    }

    public final SessionContext setSignupDate(int i10) {
        return this;
    }

    public final SessionContext setTimeSpent(int i10) {
        return this;
    }

    public final SessionContext setUserLevelPercentile(float f10) {
        return this;
    }

    public final SessionContext setUserScorePercentile(float f10) {
        return this;
    }
}
