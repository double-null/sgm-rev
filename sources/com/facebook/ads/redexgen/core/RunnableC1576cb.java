package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1576cb implements Runnable {
    public final /* synthetic */ C06013r A00;

    public RunnableC1576cb(C06013r c06013r) {
        this.A00 = c06013r;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            ((G2) this.A00).A09.A4b(((G2) this.A00).A0A.A7o());
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
