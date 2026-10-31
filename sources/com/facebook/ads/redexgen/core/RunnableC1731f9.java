package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1731f9 implements Runnable {
    public final /* synthetic */ C0799Bw A00;

    public RunnableC1731f9(C0799Bw c0799Bw) {
        this.A00 = c0799Bw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            C0799Bw.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
