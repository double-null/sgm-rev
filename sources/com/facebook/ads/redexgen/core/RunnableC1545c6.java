package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1545c6 implements Runnable {
    public final /* synthetic */ C06234n A00;

    public RunnableC1545c6(C06234n c06234n) {
        this.A00 = c06234n;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            this.A00.A0M.AFE(true);
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
