package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC0865El implements Runnable {
    public final InterfaceC0864Ek A00;

    public RunnableC0865El(InterfaceC0864Ek interfaceC0864Ek) {
        this.A00 = interfaceC0864Ek;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
