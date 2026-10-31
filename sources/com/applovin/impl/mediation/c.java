package com.applovin.impl.mediation;

import com.applovin.impl.e3;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f7354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.i0 f7355d;

    public interface a {
        void a(e3 e3Var);
    }

    c(com.applovin.impl.sdk.l lVar, a aVar) {
        this.f7352a = lVar;
        this.f7353b = lVar.Q();
        this.f7354c = aVar;
    }

    public void a(final e3 e3Var, long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7353b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f7355d = com.applovin.impl.i0.a(j10, this.f7352a, new Runnable() { // from class: com.applovin.impl.mediation.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f7613a.a(e3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7353b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f7354c.a(e3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7353b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.i0 i0Var = this.f7355d;
        if (i0Var != null) {
            i0Var.a();
            this.f7355d = null;
        }
    }
}
