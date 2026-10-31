package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1241Tc implements InterfaceC1274Uk {
    public WeakReference<C1164Qc> A00;

    public C1241Tc(C1164Qc c1164Qc) {
        this.A00 = new WeakReference<>(c1164Qc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1274Uk
    public final void AEW(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1f(z10, false);
        }
    }
}
