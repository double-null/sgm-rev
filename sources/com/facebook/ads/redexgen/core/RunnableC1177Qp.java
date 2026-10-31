package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1177Qp implements Runnable {
    public final /* synthetic */ C1178Qq A00;

    public RunnableC1177Qp(C1178Qq c1178Qq) {
        this.A00 = c1178Qq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
