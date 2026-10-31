package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC1396Zf implements Runnable {
    public final /* synthetic */ C1397Zg A00;
    public final /* synthetic */ InterfaceC1398Zh A01;

    public RunnableC1396Zf(C1397Zg c1397Zg, InterfaceC1398Zh interfaceC1398Zh) {
        this.A00 = c1397Zg;
        this.A01 = interfaceC1398Zh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
