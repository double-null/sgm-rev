package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC1405Zo {
    public final WeakReference<C06435h> A00;

    public K0(C06435h c06435h) {
        this.A00 = new WeakReference<>(c06435h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1405Zo
    public final void ADT(C1404Zn c1404Zn) {
        C06435h c06435h = this.A00.get();
        if (c06435h != null) {
            c06435h.A04 = c1404Zn.A00() != null;
            c06435h.A02();
        }
    }
}
