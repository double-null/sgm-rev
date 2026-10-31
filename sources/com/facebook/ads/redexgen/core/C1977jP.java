package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1977jP implements InterfaceC1027Ks<String> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1027Ks
    public final C1026Kr<String> A3p(File file, LA la2) {
        String strA05 = LB.A05(file);
        return new C1026Kr<>(strA05 != null, strA05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1027Ks
    public final void A55(File file, LA la2) {
    }
}
