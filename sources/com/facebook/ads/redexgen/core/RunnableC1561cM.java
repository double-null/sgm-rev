package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1561cM implements Runnable {
    public final /* synthetic */ C4K A00;

    public RunnableC1561cM(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A = true;
            this.A00.A0V.AFE(true);
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
