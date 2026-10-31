package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
class n6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v7 f7703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f7704h;

    n6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderVastAd", lVar);
        this.f7704h = appLovinAdLoadListener;
        this.f7703g = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Rendering VAST ad...");
        }
        int size = this.f7703g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = yhXxbqGRMeI.agWHoFZaGTe;
        a8 a8VarA = null;
        e8 e8VarA = null;
        u7 u7VarA = null;
        t7 t7VarA = null;
        String strA2 = strA;
        for (q8 q8Var : this.f7703g.a()) {
            if (d8.b(q8Var)) {
                str = "Wrapper";
            } else {
                str = "InLine";
            }
            q8 q8VarB = q8Var.b(str);
            if (q8VarB != null) {
                q8 q8VarB2 = q8VarB.b("AdSystem");
                if (q8VarB2 != null) {
                    a8VarA = a8.a(q8VarB2, a8VarA, this.f6990a);
                }
                strA = d8.a(q8VarB, "AdTitle", strA);
                strA2 = d8.a(q8VarB, "Description", strA2);
                d8.a(q8VarB.a("Impression"), hashSet, this.f7703g, this.f6990a);
                q8 q8VarC = q8VarB.c("ViewableImpression");
                if (q8VarC != null) {
                    d8.a(q8VarC.a("Viewable"), hashSet, this.f7703g, this.f6990a);
                }
                q8 q8VarB3 = q8VarB.b("AdVerifications");
                if (q8VarB3 != null) {
                    t7VarA = t7.a(q8VarB3, t7VarA, this.f7703g, this.f6990a);
                }
                d8.a(q8VarB.a("Error"), hashSet2, this.f7703g, this.f6990a);
                q8 q8VarC2 = q8VarB.c("Creatives");
                if (q8VarC2 != null) {
                    for (q8 q8Var2 : q8VarC2.b()) {
                        q8 q8VarC3 = q8Var2.c("Linear");
                        if (q8VarC3 != null) {
                            e8VarA = e8.a(q8VarC3, e8VarA, this.f7703g, this.f6990a);
                        } else {
                            q8 q8VarB4 = q8Var2.b("CompanionAds");
                            if (q8VarB4 != null) {
                                q8 q8VarB5 = q8VarB4.b("Companion");
                                if (q8VarB5 != null) {
                                    u7VarA = u7.a(q8VarB5, u7VarA, this.f7703g, this.f6990a);
                                }
                            } else if (com.applovin.impl.sdk.p.a()) {
                                this.f6992c.b(this.f6991b, "Received and will skip rendering for an unidentified creative: " + q8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Did not find wrapper or inline response for node: " + q8Var);
            }
        }
        r7 r7VarA = new r7.b().a(this.f6990a).a(this.f7703g.b()).b(this.f7703g.e()).a(this.f7703g.c()).b(strA).a(strA2).a(a8VarA).a(e8VarA).a(u7VarA).a(t7VarA).b(hashSet).a(t7VarA).a(hashSet2).a();
        w7 w7VarC = d8.c(r7VarA);
        if (w7VarC == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Finished rendering VAST ad: " + r7VarA);
            }
            r7VarA.getAdEventTracker().e();
            this.f6990a.s0().a((k5) new p5(r7VarA, this.f6990a, this.f7704h), f6.b.CACHING);
            return;
        }
        d8.a(this.f7703g, this.f7704h, w7VarC, -6, this.f6990a);
    }
}
