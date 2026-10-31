package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1503bQ implements Runnable {
    public final /* synthetic */ C0975Is A00;

    public RunnableC1503bQ(C0975Is c0975Is) {
        this.A00 = c0975Is;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            this.A00.A0c.A0E().AFE(true);
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
