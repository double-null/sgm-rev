package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1677eG implements Runnable {
    public final /* synthetic */ C1680eJ A00;

    public RunnableC1677eG(C1680eJ c1680eJ) {
        this.A00 = c1680eJ;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            this.A00.A01.removeCallbacks(this);
            this.A00.A01.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
