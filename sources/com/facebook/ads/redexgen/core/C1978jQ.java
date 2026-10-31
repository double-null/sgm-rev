package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1978jQ implements InterfaceC1027Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1027Ks
    public final C1026Kr<File> A3p(File file, LA la2) {
        if (file.exists()) {
            return new C1026Kr<>(true, file);
        }
        return new C1026Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1027Ks
    public final void A55(File file, LA la2) {
    }
}
