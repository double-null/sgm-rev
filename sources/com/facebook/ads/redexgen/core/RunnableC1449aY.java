package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1449aY implements Runnable {
    public final /* synthetic */ C1006Jx A00;

    public RunnableC1449aY(C1006Jx c1006Jx) {
        this.A00 = c1006Jx;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC1455ae) this.A00).A06.A0E() != null) {
                ((AbstractC1455ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
