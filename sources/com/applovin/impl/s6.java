package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
class s6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v7 f8169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f8170h;

    s6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskResolveVastWrapper", lVar);
        this.f8170h = appLovinAdLoadListener;
        this.f8169g = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = d8.a(this.f8169g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Resolving VAST ad with depth " + this.f8169g.d() + " at " + strA);
        }
        try {
            this.f6990a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.f6990a).b(strA).c("GET").a(q8.f8010f).a(((Integer) this.f6990a.a(z4.Z4)).intValue()).c(((Integer) this.f6990a.a(z4.f9185a5)).intValue()).a(false).a(), this.f6990a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, q8 q8Var, int i10) {
            this.f6990a.s0().a(k6.a(q8Var, s6.this.f8169g, s6.this.f8170h, s6.this.f6990a));
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, q8 q8Var) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            s6.this.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8170h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        d8.a(this.f8169g, this.f8170h, i10 == -1001 ? w7.TIMED_OUT : w7.GENERAL_WRAPPER_ERROR, i10, this.f6990a);
    }
}
